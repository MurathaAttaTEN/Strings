import java.time.Year
import kotlin.math.max
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl

fun main(){
stmt()
    zero()
    years("wanjiru", 100)
    println()
    place()






}
fun stmt(){
    var chars = "codeHive"
    var stmt = chars[5].toString()+ chars[6]+chars[7]
    println(stmt)

}
fun zero(){
    var x = 15
    var y = 6
    var M = 15%6
    println(M)
}
fun years(name: String,age: Int):String{
    var ring = "Hi,my name is p and i am z years old."
    println(ring)
    return ring

}
fun place(){
    var p = "country"
    println("country".length)
}