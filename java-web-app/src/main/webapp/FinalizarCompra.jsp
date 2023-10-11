<!DOCTYPE html>
<html>

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>ObraGO</title>
    <link rel="icon" href="Imagens/icon.png" type="image/x-icon">
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='styles/FinalizarCompra.css'>
</head>

<body>
    <header>
        <a href="Home.html"><img src="Imagens/home.svg" alt="home" id="home"></a>
        <img src="Imagens/logo.png" alt="logo" id="logo">
        <a href="/usuario"><img src="Imagens/user.png" alt="user" id="user"></a>
    </header>
    <div class="barra-progresso">
        <div class="step">
            <div class="step-text">Carrinho</div>
            <div class="linha"></div>
        </div>
        <div class="step">
            <div class="step-text"><strong>Finalizar Compra</strong></div>
            <div class="linha"></div>
        </div>
        <div class="step">
            <div class="step-text">Confirmação de Pagamento</div>
        </div>
    </div>
    <main>
        <div class="titulo">
            <img src="Imagens/icons8-carrinho-80.png" alt="carrinho">
            <h1>Finalizar Compra</h1>
        </div>
        <div>
            <table>
                <thead>
                    <tr>
                        <th></th>
                        <th>Produto</th>
                        <th>Quantidade</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    <tr class="tr-items">
                        <td class="td-img"><img src="Imagens/tijolo.png" alt="tijolo" id="tijolo"></td>
                        <td><strong>Tijolo em Saco com 10 Peças</strong></td>
                        <td><strong>1</strong></td>
                        <td><strong>R$ 10,00</strong></td>
                    </tr>
                    <hr>
                    <tr class="tr-items">
                        <td class="td-img"><img src="Imagens/argamassa.png" alt="argamassa" id="argamassa"></td>
                        <td><strong>Argamassa Polimérica Biomassa 3kg</strong></td>
                        <td><strong>1</strong></td>
                        <td><strong>R$ 20,00</strong></td>
                    </tr>
                </tbody>
            </table>
        </div>
        <hr>
        <div class="pagamento">
            <p><strong>Selecione o método de pagamento: </strong></p>
            <select name="pagamento" id="pagamento">
                <option value="vazio">SELECIONE</option>
                <option value="cartao-credito">Cartão de Crédito</option>
                <option value="cartao-debito">Cartão de Débito</option>
            </select>
        </div>
        <br><br>
        <hr>
        <div class="detalhe-pagamento">
            <div class="detalhes-esquerda">
                <p><strong>Detalhes do Pagamento</strong></p>
            </div>
            <div class="detalhes-direita">
                <div class="frete">
                    <p><strong>Subtotal do Frete:</strong></p>
                    <div class="valor-frete">
                        <p class="preco"><strong>R$ 10,00</strong></p>
                    </div>
                </div>
                <div class="subtotal-produto">
                    <p><strong>Subtotal do(s) Produto(s):</strong></p>
                    <div class="valor-produto">
                        <p class="preco"><strong>R$ 30,00</strong></p>
                    </div>
                </div>
                <div class="valor-total">
                    <p><strong>Valor Total:</strong></p>
                    <div class="total">
                        <p class="preco"><strong>R$ 40,00</strong></p>
                    </div>
                </div>
                <div>
                    <button type="submit" class="finalizar">Finalizar</button>
                </div>
            </div>
        </div>
        <br><br>
        
        
    </main>
</body>


</html>