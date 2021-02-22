package id.rifqiabrory.androidkotlinfundamentals

fun main() {
    // TODO: Create Variable, Data Type, Comment

    // Variable
    // Mutable variable
    var myName = "Rifqi"
    // Immutable variable
    val myAddress = "Tangerang Selatan"

    // Data Type
    // Integer TYPES :: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    var stringDataType: String = "String"
    val intDataType: Int = 27
    val byteDataType: Byte = 13
    val shortDataType: Short = 123
    val longDataType: Long = 39_812_309_487_120_300_00

    // Floating point number TYPES :: Float (32 bit), Double (64 bit)
    val floatDataType: Float = 13.12F
    val doubleDataType: Double = 3.123453536346453

    // Booleans used to represent logical values. its have two possible values TRUE or FALSE
    var isBooleanDataType: Boolean = true
    val charDataType: Char = 'A'

    // Arithmetic operators (+, -, *, /, %)
    var result = 5+2
    result += 2
    result -= 2
    result *= 2
    result /= 2
    result = 5%2
    result = (5 + 2).toInt()

    // Comparison operators (==, !=, <, >, <=, >=)
    var isEquals = 5 == 1
    var isNotEquals = 5 != 1
    var isGreaterThenEquals = 5 > 1
    var isLowerThenEquals = 5 < 1
    var isGreaterThenAndEquals = 5 <= 1
    var isLowerThenAndEquals = 5 >= 1

    // Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 5
    myNum -= 5
    myNum *= 5
    myNum /= 5
    myNum %= 5

    // Conditionals Statement
    var number1 = 15
    var number2 = 5
    // ==, !=, <, >, <=, >=
    if(number1 == number2) {
        println("Equals")
    } else if(number1 != number2) {
        println("Not Equals")
    } else if(number1 > number2) {
        println("Greater then")
    } else if(number1 < number2){
        println("Lower then")
    } else if(number1 <= number2) {
        println("Lower Then And Equals")
    } else if(number1 >= number2){
        println("Greater Then And Equals")
    } else {
        print("None")
    }

    // or
    if(number1 > number2)
        println("OK")


    // When Expressions
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    // or using (..) => or using until
    var month = 3
    when(month){
        !in 1..2 -> println("Using (!)")
        in 3..5 -> println("Spring")
        in 6..8 -> println("Winter")
        in 9..11 -> println("Fall")
        in 12 downTo 2 -> println("Winter") //or 12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }
    // or using condition type
    var myNumber: Any = 14.23
    when(myNumber) {
        is Int -> println("$myNumber is Int")
        !is Double -> println("$myNumber is NOT Double")
        is String -> println("$myNumber is String")
        else -> println("$myNumber is Any Type")
    }

    // While loop executes a block of code repeatedly
    // as long as a given condition true
    var x = 1
    while (x <= 10){
        // code to be execute
        println("$x")
        x++
    }
    println("While loop is done!")

    // FOR Loop
    // using (..)
    for (num in 1..10) {
        println("Number : $num")
    }
    // or using until
    for (num in 1 until 10) {
        println("Number : $num")
    }
    // or using downTo
    for (num in 10 downTo 1) {
        println("Number : $num")
    }
    // or using step
    for (num in 10 downTo 1 step 2) {
        println("Number : $num")
    }
    // or same as
    for (num in 10.downTo(1).step(2)) {
        println("Number : $num")
    }


    // Function
    fun myFunction1() {
        println("my Function")
    }
    // passing arg
    fun myFunction2(a: Int, b: Int): Int {
        return a + b
    }

    myFunction1()
    myFunction2(1, 2)

    // Nullable Value
    var name: String = "Rifqi"
    // name = null -> Compilation ERROR

    // Best Way can nullable add (?)
    var nullAbleValue: String? = "Rifqi"
    // nullAbleValue = null
    // accessing nullable value add (?)
    var len = name.length
    var len2 = nullAbleValue?.length
    // safe call operator using "let"
    nullAbleValue?.let { println(it.length) }

    // Nullable value :: Elvis Operators (?:) -> like short if-else
    var getValue = nullAbleValue ?: "Guest"
    println(nullAbleValue!!.toLowerCase())
    // sample when accessing to the class object
    // perform a chain safe calls:
    // var wifeAge: String? = User?.wife?.age ?: 0

    // Comment
    /*
        Multiple Comments
     */

    // Display value
    println("Hello Kotlin! My Name : $myName And I'm from : $myAddress")
}