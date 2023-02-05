fun main(args: Array<String>) {
    /*println("введите а")
    val a= readln()!!.toDouble()
    println("введите b")
    val b= readln()!!.toDouble()
    when{
        a<=b-> println("a=0"+' '+"b="+  b)
        a>b->println("a= "+ a +' '+"b="+b)
    }

    //18
    println("введите а")
    val a= readln()!!.toDouble()
    println("введите b")
    val b= readln()!!.toDouble()
    println("введите x")
    val x= readln()!!.toDouble()
    println("введите y")
    val y= readln()!!.toDouble()
    println("введите z")
    val z= readln()!!.toDouble()
    if((a>=x && b>=y)||(a>=y && b>=x)||(a>=x && b>=z)||(a>=z && b>=x)||(a>=z && b>=y)||(a>=y && b>=z)){
        println("пройдет")
    }
    else{
        println("не пройдет")
    }

    //28
    println("введите а")
    val a= readln()!!.toDouble()
    println("введите b")
    val b= readln()!!.toDouble()
    println("введите c")
    val c= readln()!!.toDouble()
    println("введите d")
    val d= readln()!!.toDouble()
    println("введите e")
    val e= readln()!!.toDouble()
    println("введите f")
    val f= readln()!!.toDouble()
    val x:Double=(f*b+e*c)/(d*b+a*e)
    println("x="+ x)
    println("y="+((c-a*x)/b))*/


    //42
    println("введите а")
    val a= readln()!!.toDouble()
    println("введите b")
    val b= readln()!!.toDouble()
    println("введите c")
    val c= readln()!!.toDouble()
    val D:Double=b*b-4*a*c
    when{
        D>0->("x1="+((-b+Math.sqrt(D))/2*a)+' '+"x2="+((-b-Math.sqrt(D))/2*a))
        //D==0->("x1="+(-b/2*a))
        D<0->("корней нет")

    }
}