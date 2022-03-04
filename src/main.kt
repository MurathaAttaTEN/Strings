import kotlin.math.max

fun main(){
greetings("moon",4)
    name()
    place()
    sent()
}
fun greetings(name:String, age: Int){

    var stmt = "hi,my name is $name and i am $age years old"
    println(stmt)


}

fun name(){
    var chars= "akirachix"
    var stmt= chars[1].toString()+chars[3]+chars[4]
    println(stmt)


}
fun place(){
    var x = "country"
    println("country".length)
}
fun sent(){
    var name = "Atta"
    if(name=="Atta"){
        println("That's me")}
    else
        println("I don't know who that is")

}