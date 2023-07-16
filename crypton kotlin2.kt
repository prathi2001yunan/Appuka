fun main() { 
  print("Enter text: ")
    var input = readLine()!!
   var value = input.toInt()
   var count=0
    var g = 3.50*100
    var h = 4.60*300
    var i = 6.60*1000
   
    
    var k=0
    if(value > 1){
        
      k=1
    }
    if(value > 101 && value <201){
        
    k=2
    }
     if(value>200 && value <501){
         
    k=3
    }
     if(value > 501){
         k=4
     }
   if(k==1){
       print("0")
   }
   if(k==2){
      print(g)
   }
   if(k==3){
      count = (g+h).toInt()
       print(count)
   }
   if(k==4){
      count = (g+h+i).toInt()
       print(count)
   }
        
 
       
}