//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }

    Map<String, Integer> hmap = new HashMap<>();
    hmap.put("aaa1",111);
    hmap.put("aaa2",2222);
    hmap.put("aaa3",3333);
    hmap.put("aaa4",444);

    Set<String> s1 = new HashSet<>();
    s1.add("adf");
    s1.add("adf1");
    s1.add("adf");
    s1.add("adf1");
    String  a= s1.stream().filter(p-> p.indexOf("D") > 0).peek(p-> System.out.println(p)).findFirst().get();

}
