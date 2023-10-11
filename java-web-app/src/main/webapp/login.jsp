<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Login</title>
		<link rel="stylesheet" href="styles/login.css">
	</head>
	<body>
		<header>
			<img src="Imagens/ObraGo2.jpeg" class="logo" alt="Logo"/>
		</header>
		
		<main>
			<div class="card">
				<div class="baseflex">
					<h1>Login</h1>	
					<img src="Imagens/login.png" class="icon2" alt="Icon de Login"/>
				</div>
			
				<form action="login" method="post">
					<div class="campotexto">
                        			<label for="email">Email</label>
						<div class="input-group baseflex">
							<img class="icon" src="Imagens/email.svg" alt="">
							<input type="email" name="email" required placeholder="Digite seu email" />
						</div>
				   	</div>
					<div class="campotexto">
						<label for="senha">Senha</label>
						<div class="input-group baseflex">
							<img class="icon" src="Imagens/lock.svg" alt="">
							<input type="password" name="senha" required placeholder="Digite sua senha">
						</div>
					</div>
				
					<button class="btn">Esqueceu a senha?</button>
					
					<button class="btn2"><a href="Home.html">Entrar</a></button>
					
					<p>Ainda não tem uma conta?</p>
					<button class="btn2"><a href="cadastro.html">Criar conta</a></button>
				</form>
			</div>
		</main>
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
			crossorigin="anonymous"></script>
		<script src="scripts.js"></script>
	</body>
</html>