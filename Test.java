class Test {
    public static Integer validate(Integer num) {
       while(num>=10){
            int sum=0;
	    while(num>0){
		sum=sum+(num%10);
		num/=10;
           }
        num=sum;
	}
          return num;
    
    }
}