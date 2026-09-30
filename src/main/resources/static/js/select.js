document.getElementById('flight-chooser-form').addEventListener('submit', function(event) {
  event.preventDefault();
  const selectedFlight = document.querySelector('input[name="flight"]:checked');
  if (!selectedFlight) {
    alert('Please select a flight.');
    return;
  }

  const card = selectedFlight.closest('.flight-option');
  const params = new URLSearchParams({
    flight: card.dataset.flight,
    airline: card.dataset.airline,
    aircraft: card.dataset.aircraft,
    route: card.dataset.route,
    departure: card.dataset.departure,
    arrival: card.dataset.arrival,
    duration: card.dataset.duration,
    fare: card.dataset.fare
  });
  window.location.href = `/ticket.html?${params.toString()}`;
});
