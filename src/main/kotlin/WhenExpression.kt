fun WhenExpress(){
    val extname = ".kt"
    when(extname){
        ".kt"-> println("Kotlin File")
        ".java"-> println("Java File")
        else-> println("Unknown")
    }
}

fun WhenExpress2(){
    val country = "Thailand"
    when(country){
        "UK","USA","AUS","CANADA"-> println("English")
        "Vieatname","Loa","Thailand"-> println("Suwannaphom")
        "China","Taiwan","Hong Kong"-> println("Chinese")
    }
}

fun WhenExpress3(){
    val death = "Oppo"
    val os = when(death){
        "Oppo","Vivo","Sumsung"->"Android"
        "iPhone"->"ios"
        "ipad"->"ipadOS"
        else->"Unknown"
    }
    println(os)
}