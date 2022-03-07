import kotlin.math.max
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl

fun main(){
var stmt = greetings("moon",4)
    println(stmt)
    name()
    var chars = place("blue")
    println(chars)
    sent()
}
fun greetings(name:String, age: Int):String{

    var stmt = "hi,my name is $name and i am $age years old"
    return stmt


}

fun name(){
    var chars= "akirachix"
    var stmt= chars[1].toString()+chars[3]+chars[4]
    println(stmt)


}
fun place(colors: String): Int{
    var chars= colors.length
    return chars
}
fun sent(){
    var name = "Atta"
    if(name=="Atta"){
        println("That's me")}
    else
        println("I don't know who that is")

}