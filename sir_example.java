class sir_example {
    static void main() {
        int cons_id[] = {1,2,3,4,5,6,7};
        String cons_name[] = {"vani", "timo", "jira", "rina", "tony", "rimo", "riku"};
        String cons_locality[] = {"makai", "viden", "perol", "barada", "viden", "perol", "viden"};
        double cons_amt[] = {985,660,745,740,900,640,860};
        System.out.println("Consumers living in \"Viden\" are:-\n");
        for(int i=0;i<7;i++) {
            if(cons_locality[i].equalsIgnoreCase("viden")) {
                System.out.println(cons_name[i]);
                double dis = 10/100*(cons_amt[i]);
                double pay = cons_amt[i]-dis;
            }
        }
        System.out.println("\nConsumers have thier amount more than 720  in \"Viden\" are:-\n");
        for(int i=0;i<7;i++) {
            if(cons_amt[i]>720) {
                System.out.println("Name = " + cons_name[i]);
                System.out.println("ID = " + cons_id[i]);
                System.out.println("Locality = " + cons_locality[i]);
                System.out.println("Amount = " + cons_amt[i]+"\n");
            }
        }
        System.out.println("\nCosumers have their names starting with \'r\'");
        for(int i=0;i<7;i++) {
            String str = cons_name[i];
            char ch = str.charAt(0);
            if(ch=='r') {
                System.out.println(cons_name[i]);
            }
        }
    }
}