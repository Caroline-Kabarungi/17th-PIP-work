fun main() {
    var fruit= mutableListOf("mango","banana")
    println(fruit)
    fruit.add("cherry")
    fruit.add("apple")
    fruit.add("strawberry")
    fruit.add("orange")
    fruit.remove("banana")
    fruit.sortDescending()
    println(fruit)
    fruit.reverse()
    println(fruit)

    var names= listOf<String>("toyota","subalu","bmw","mishubishi")
    var myname=names.filter { name-> name.length>5 }
    println(myname)
    var nme=names.filter { n-> n.length<5 }
    println(nme)

    var myage=30
    var newage=12
    println("my new age is $newage")

    var adults= listOf(  pupil("liz",30), pupil("beth",13))
    var dul=adults.filter {pupil -> pupil.age>15  }
    println(dul)
    var d=adults.filter {pupil -> pupil.age<15  }
    println(d)

    var n=3
    var m=5
    println(n.plus(m))
    println(n.rem(m))
    println(m.div(n))
    println(n.times(m))
    println(n.compareTo(m))
    println(n<5)
    println(n.times(m))
    println(m<n)
    println(n<=m)
    println(n!=m)
    println(n++)
    println(n<m && m>n)
    println(n<m || m>n)

}
data class pupil(var name:String,var age:Int)