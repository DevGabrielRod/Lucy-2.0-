var contr: Boolean = true
fun calc() {

    do{
        println("Insira a Operação Desejada:")
        println("[ 1 ]Adição")
        println("[ 2 ]Subtração")
        println("[ 3 ]Multiplicação")
        println("[ 4 ]Divisão")
        println("[ /S ]Sair")
        var opc: String = reader.next()
        var OPC = opc.uppercase()
        when (OPC) {
            "1" -> ad()
            "2" -> sb()
            "3" -> mt()
            "4" -> dv()
            "/S" -> exit(1)
            else -> println("Opção Inválida!")
        }
    }while (contr)

}

var num1: Double = 0.0
var num2: Double = 0.0
var num3: Double = 0.0
var tot: Double = 0.0
var res: Double = 0.0

@Suppress("SameReturnValue", "SameReturnValue", "SameReturnValue", "SameReturnValue", "SameReturnValue")
fun ad() :Int{

    println("Insira o número Primãrio")
    num1 = reader.nextDouble()
    println("Insira o número Secundário")
    num2 = reader.nextDouble()
    tot = num1 + num2
    println("A soma de $num1 + $num2 é igual a: $tot")
    return 0
}
fun sb() :Int{

    println("Insira o número Primãrio")
    num1 = reader.nextDouble()
    println("Insira o número Secundário")
    num2 = reader.nextDouble()
    tot = num1 - num2
    println("A subtração de $num1 - $num2 é igual a: $tot")
    return 0
}
fun mt() :Int{

    println("Insira o número Primãrio")
    num1 = reader.nextDouble()
    println("Insira o número Secundário")
    num2 = reader.nextDouble()
    tot = num1 * num2
    println("A Multiplicação de $num1 * $num2 é igual a: $tot")
    return 0
}

fun dv() :Int{
    println("Insira o número Primãrio")
    num1 = reader.nextDouble()
    println("Insira o número Secundário")
    num2 = reader.nextDouble()
    tot = num1 / num2
    res = num1 % num2
    println("A divisão de $num1 / $num2  = $tot e resto: $res")
    return 0
}

fun exit(param: Int): Int{
    if(param == 0){
        contr = false
        conti = false
        return 0
    }else if(param == 1){
        contr =false
        conti = false
        return 1
    }else{
        contr = false

        return 1
    }

}