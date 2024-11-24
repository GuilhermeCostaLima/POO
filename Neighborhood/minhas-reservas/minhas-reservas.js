// Função para alternar a exibição das informações adicionais
function toggleInfo(cardNumber) {
    const additionalInfo = document.getElementById('additionalInfo' + cardNumber);
    // Alterna a visibilidade da seção de mais informações
    additionalInfo.style.display = (additionalInfo.style.display === 'block') ? 'none' : 'block';
}