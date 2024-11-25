function toggleInfo(cardNumber) {
    const additionalInfo = document.getElementById('additionalInfo' + cardNumber);
    additionalInfo.style.display = (additionalInfo.style.display === 'block') ? 'none' : 'block';
}

