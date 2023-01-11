fun calc() {
    println("Insira a Operação Desejada:")
    println("[ 1 ]Adição")
    println("[ 2 ]Subtração")
    println("[ 3 ]Multiplicação")
    println("[ 4 ]Divisão")
    var opc: Int = reader.nextInt()
    when (opc) {
        1 -> ad()
        2 -> sb()
        3 -> mt()
        4 -> dv()
        else -> println("Opção Inválida!")
    }

}

var num1: Float = 0.0f
var num2: Float = 0.0f
var num3: Float = 0.0f
var res: Float = 0.0f
var tot: Float = 0.0f

@Suppress("SameReturnValue", "SameReturnValue", "SameReturnValue", "SameReturnValue", "SameReturnValue")
fun ad() :Int{

    println("Insira o número Primãrio")
    num1 = reader.nextFloat()
    println("Insira o número Secundário")
    num2 = reader.nextFloat()
    println("Insira o número Terciário")
    num3 = reader.nextFloat()
    tot = num1 + (num2 + num3)
    println("A soma de $num1 + $num2 + $num3 é igual a: $tot")
    return 0
}

fun sb() :Int{

    println("Insira o número Primãrio")
    num1 = reader.nextFloat()
    println("Insira o número Secundário")
    num2 = reader.nextFloat()
    println("Insira o número Terciário")
    num3 = reader.nextFloat()
    tot = num1 - (num2 - num3)
    println("A subtração de $num1 - $num2 - $num3 é igual a: $tot")
    return 0
}

fun mt() :Int{

    println("Insira o número Primãrio")
    num1 = reader.nextFloat()
    println("Insira o número Secundário")
    num2 = reader.nextFloat()
    tot = num1 * num2
    println("A Multiplicação de $num1 * $num2 é igual a: $tot")
    return 0
}


fun dv() :Int{
    println("Insira o número Primãrio")
    num1 = reader.nextFloat()
    println("Insira o número Secundário")
    num2 = reader.nextFloat()
    tot = num1 / num2
    res = num1 % num2
    println("A divisão de $num1 / $num2  = $tot e resto: $res")
    return 0
}

