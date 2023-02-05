fun main(args: Array<String>) {
    //6(8)
    println("введите а")
    val a:Double= readLine()!!.toDouble()
    println("введите b")
    val b:Double= readLine()!!.toDouble()
    println("введите c")
    val c:Double= readLine()!!.toDouble()
    println("введите d")
    val d:Double= readLine()!!.toDouble()
    println("введите n")
    val n:Double= readLine()!!.toDouble()
    when{
        a==b-> println("y=0")
        c==d-> println("y=0")
        a>b-> println("y="+(0.25*(a-b))/((1.0/8.0)-(Math.abs(b)/(Math.pow((10.0),n+3.0)+(Math.log10(b)/c-d)))))
        a<b-> println("y="+(0.25*(a-b))/((1.0/8.0)-(Math.abs(b)/(Math.pow((10.0),n+3.0)+(Math.log10(b)/c-d)))))
    }

    //1
    println("введите a1")
    val a1:Double= readLine()!!.toDouble()
    println("введите a5")
    val a5:Double= readLine()!!.toDouble()
    println("введите n")
    val N:Double= readLine()!!.toDouble()
    val D:Double=(a5-a1)/4
    val an:Double=a1+(N-1)*D
    val sum:Double=((a1+an)*N)/2
    println("n-ый член прогрессии:"+ an)
    println("сумма первых n членов прогрессии:"+sum)
}