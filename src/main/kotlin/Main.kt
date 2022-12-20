fun main(){

    for (i in 1..100 step 2){
        if(i<50) littleNumber(i) else bigNumber(i)
    }

}
fun littleNumber(number: Int) {
    println("Little number: $number")
}
fun bigNumber(number: Int){
    println("Big number: $number")
}