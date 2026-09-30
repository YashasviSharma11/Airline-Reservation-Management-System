const urlParams = new URLSearchParams(window.location.search);
        const flightName = urlParams.get('flight');
        const flightRoute = urlParams.get('route');
        const flightTime = `${urlParams.get('departure')} – ${urlParams.get('arrival')}`;

        if (flightName && flightRoute) {
            document.getElementById('displayFlightName').textContent = flightName;
            document.getElementById('displayFlightRoute').textContent = flightRoute;
            document.getElementById('displayFlightTime').textContent = flightTime;
            document.getElementById('displayFlightNumber').textContent = flightName;
            document.getElementById('displayAirline').textContent = urlParams.get('airline');
            document.getElementById('displayAircraft').textContent = urlParams.get('aircraft');
            document.getElementById('displayDeparture').textContent = urlParams.get('departure');
            document.getElementById('displayArrival').textContent = urlParams.get('arrival');
            document.getElementById('displayDuration').textContent = urlParams.get('duration');
            document.getElementById('displayFare').textContent = Number(urlParams.get('fare') || 0).toLocaleString('en-IN');

            document.getElementById('ticket-selection-form').addEventListener('submit', function() {
                const parts = flightRoute.split(' → ');
                const start = (parts[0] || '').replace(/ \([^)]*\)/, '');
                const destination = (parts[1] || '').replace(/ \([^)]*\)/, '');
                const count = Number(document.getElementById('ticket-count').value || 1);
                const codesMatch = flightRoute.match(/\(([^)]+)\).*\(([^)]+)\)/);
                localStorage.setItem('bookingData', JSON.stringify({
                    startPlace: start,
                    destination,
                    ticketCount: count,
                    ticketPrice: Number(urlParams.get('fare') || 0) * count,
                    flightDetails: {
                        flightNumber: flightName,
                        airline: urlParams.get('airline'),
                        aircraft: urlParams.get('aircraft'),
                        departure: urlParams.get('departure'),
                        arrival: urlParams.get('arrival'),
                        duration: urlParams.get('duration'),
                        codes: codesMatch ? `${codesMatch[1]} → ${codesMatch[2]}` : flightRoute
                    }
                }));
            });
        } else {
            document.querySelector('.flight-details').innerHTML = '<p>No flight information available.</p>';
        }
