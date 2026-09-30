const bookingData = JSON.parse(localStorage.getItem("bookingData") || "null") || {
    airplaneType: "Passenger aircraft",
    departureTime: "To be confirmed",
    startPlace: "-",
    destination: "-",
    ticketCount: 0,
    ticketPrice: 0
};
bookingData.airplaneType = bookingData.airplaneType || "Passenger aircraft";
bookingData.departureTime = bookingData.departureTime || "To be confirmed";
bookingData.flightDetails = bookingData.flightDetails || {
    flightNumber: "YSA 900", airline: "YSAir", aircraft: bookingData.airplaneType,
    departure: bookingData.departureTime, arrival: "To be confirmed",
    duration: "To be confirmed", codes: "To be confirmed"
};
bookingData.ticketNumbers = Array.from({length: bookingData.ticketCount}, (_, i) => `JK-${String(i + 1).padStart(3, "0")}`);

  // Function to update the displayed booking details
  function updateBookingDetails() {
    document.getElementById("airplane-type").textContent = bookingData.airplaneType;
    document.getElementById("departure-time").textContent = bookingData.departureTime;
    document.getElementById("start-place").textContent = bookingData.startPlace;
    document.getElementById("destination").textContent = bookingData.destination;
    document.getElementById("flight-number").textContent = bookingData.flightDetails.flightNumber;
    document.getElementById("flight-airline").textContent = bookingData.flightDetails.airline;
    document.getElementById("flight-aircraft").textContent = bookingData.flightDetails.aircraft;
    document.getElementById("flight-times").textContent = `${bookingData.flightDetails.departure} → ${bookingData.flightDetails.arrival}`;
    document.getElementById("flight-duration").textContent = bookingData.flightDetails.duration;
    document.getElementById("flight-codes").textContent = bookingData.flightDetails.codes;
    document.getElementById("ticket-count").textContent = bookingData.ticketCount;
    document.getElementById("ticket-numbers").textContent = bookingData.ticketNumbers.join(", ");
    document.getElementById("ticket-price").textContent = `₹${Number(bookingData.ticketPrice).toLocaleString("en-IN")}`;
  }

  // Event listener for form submission
  document.getElementById("payment-form").addEventListener("submit", function (event) {
    event.preventDefault();
    const cardHolder = document.getElementById("card-holder").value.trim();
    const cardNumber = document.getElementById("card-number").value.replace(/\D/g, "");
    const expiryDate = document.getElementById("expiry-date").value.trim();
    const cvv = document.getElementById("cvv").value.replace(/\D/g, "");
    if (cardNumber.length < 12 || cardNumber.length > 19 || !/^\d{2}\/\d{2}$/.test(expiryDate) || !/^\d{3,4}$/.test(cvv)) {
        alert("Enter a valid card number, expiry date (MM/YY), and CVV.");
        return;
    }
    localStorage.setItem("paymentData", JSON.stringify({
        cardHolder,
        lastFour: cardNumber.slice(-4),
        bookingReference: `JK${Date.now().toString().slice(-8)}`
    }));
    window.location.href = "/confirmation.html";
  });

  // Update the booking details on page load
  updateBookingDetails();
