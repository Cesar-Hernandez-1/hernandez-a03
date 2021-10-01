package baseline;

public class multiplicationTable {
    //create String variable to build multiplication table in
    private final StringBuilder table = new StringBuilder();

    public String makeTable(){
        //use for loop to iterate through the integers 1 to 12
        for(int i = 1; i < 13; i++){
            //format table by appending spaces for each outer for loop iteration.
            if(i < 10){
                table.append("    ");
            }else{
                table.append("   ");
            }

            //inner for loop thorough int 1 to 12
            for(int j = 1; j < 13; j++){

                //append multiplication of outer for loop variable i and inner for loop variable j
                table.append(i*j);
                if(j == 12){
                    table.append("\n");
                }

                //append spaces based on result for formatting correctness
                if(i*j < 10 && (i*(j+1)) < 10 && j != 12){
                    table.append("    ");
                }else if((i*j > 10 || (i*(j+1)) >= 10) && i*j < 100 && (i*(j+1)) < 100 && j != 12){
                    table.append("   ");
                }else if(j != 12){
                    table.append("  ");
                }
            }
        }
        //return table
        table.replace(table.length() - 1, table.length(),"");
        return table.toString();
    }
}
