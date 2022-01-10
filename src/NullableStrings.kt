fun main (args : Array<String>) {

        //Null can not be a value of a non-null type String
        //var zero : String = null;


        //а вот так можно присвоить значение null
        var zero : String? = null;

        var first : String? = null;
        var second : String? = "four";
        var third : String? = null;
        val result : Int = first?.length?:0 + (second?.length?:0) + (third?.length?:0)
        println(result)

        //барабанная дробь... java.lang(!)NullPointerException
        println(first!!.length);
    }
