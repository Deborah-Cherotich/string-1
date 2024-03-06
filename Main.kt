fun main(args: Array<String>) {



 var school = "akirachix"
    println(school[0])
    println(school[2])
    println(school[3])

var k = mySelf("Deborah", 19)
    println(k)
println(getStringLength("Akirachix"))
    var y = getStringLength("akirachix")
    println(y)



    name("Deborah","Cherotich")
}
fun mySelf (x:String, y:Int): String{
    var mySelf = "Hi my name is $x and i am $y years old"
    return mySelf

}
fun getStringLength(word:String):Int{
    return word.length
}


fun name (name: String,name1:String){
    if(name == ("name1")){
        println("That's me")
    }
    else{
        println("I don't know who that is")
    }
}


