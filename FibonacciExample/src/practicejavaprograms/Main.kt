package practicejavaprograms

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        var n1 = 0
        var n2 = 1
        var n3: Int
        var i: Int
        val count = 10

        print(n1.toString() + " " + n2)//printing 0 and 1

        i = 2
        while (i < count)
        //loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2
            print(" " + n3)
            n1 = n2
            n2 = n3
            ++i

            //
        }
    }
}