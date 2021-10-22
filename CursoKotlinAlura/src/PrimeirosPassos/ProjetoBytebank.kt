package PrimeirosPassos

class ProjetoBytebank {
	fun main (){
		
    println("Bem vindo(a) ao Bytebank!")
    class Conta {
        var titular = ""
        var numeroConta = 0
        var saldoConta = 0.0
	}
		
		fun testesLacos(){
    var i = 0
    while(i < 5){
        val titularConta: String = "Poliana $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Olá, $titularConta")
        println("Número da sua conta $numeroConta")
        println("Seu saldo é $saldo")
        println()
        i++

        testarCondicoes(saldo)
		
		if (saldo > 0.0){
         println("Saldo positivo")
     } else if (saldo == 0.0){
         println("Saldo neltro")
     } else{
         println("Saldo negativo")
     }
	}
		}
	
	}
}
