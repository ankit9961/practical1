fun main(){
    println("enter the number 1")
    var x:Int= readLine()!!.toInt()
    println("enter the number 2")
    var y:Int= readLine()!!.toInt()
    println("enter the number 3")
    var z:Int= readLine()!!.toInt()
    add(x,y,z)
    sub(x,y,z)
    mul(x,y,z)
    div(x,y)
}
fun add(n1:Int,n2:Int,n3:Int)
{
    println("Addition of $n1 ,$n2 ,$n3 is ${n1+n2+n3}")

}
fun sub(n1:Int,n2:Int,n3:Int)
{
    println("substraction of $n1 ,$n2 ,$n3 is ${n1-n2-n3}")
}
fun mul(n1:Int,n2:Int,n3:Int)
{
    println("multiplication of $n1 ,$n2 ,$n3 is ${n1*n2*n3}")
}
fun div(n1:Int,n2:Int)
{
    println("division of $n1 ,$n2  is ${n1/n2}")
}