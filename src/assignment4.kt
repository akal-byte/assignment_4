import java.lang.reflect.Array
import java.util.*

fun main() {
school()
    capitalCities()
    numbersArray()
    var list=names(a="melissa",b="sarah",c="mauve")
    println(Arrays.toString(list))
}
fun school() {
var namesArray= arrayOf("jkuat","cuea","kemu","uon")
    println(Arrays.toString(namesArray))
}
fun capitalCities() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { town ->
        println(town.capitalize())
    }
}
fun numbersArray() {
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var addition=(numbers[1]+numbers[4])
    println(addition)
    println(numbers.lastIndex -1)
    println(Arrays.toString(numbers.sortedArray()))
}
fun names(a:String,b:String,c:String):kotlin.Array<String>{
    var people= arrayOf("$a","$b","$c")
      return (people)


}
