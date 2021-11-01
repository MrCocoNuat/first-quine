public class Quine{
    static String[] strings = {
	"public class Quine{",
	"    static String[] strings = {",
	"    };",
	"    public static void main(String args[]){",
	"\tSystem.out.println(strings[0]);",
	"\tSystem.out.println(strings[1]);",
	"\tfor(String s : strings) System.out.println('\t' + stringify(s) + ',');",
	"\tfor(int i = 2; i < strings.length; i++) System.out.println(strings[i]);",
	"    }",
	"    public static String stringify(String src){",
	"\tchar[] raw = new char[3 * src.length()];",
	"\traw[0] = 0x0022;",
	"\tint i, j;",
	"\tfor(i = 0, j = 1; i < src.length(); i++, j++){",
	"\t    switch(src.charAt(i)){",
	"\t    case 0x0009:",
	"\t\traw[j++] = 0x005C;",
	"\t\traw[j] = 't';",
	"\t\tbreak;",
	"\t    default:",
	"\t\traw[j] = src.charAt(i);",
	"\t    }",
	"\t}",
	"\traw[j] = 0x0022;",
	"\tchar[] result = new char[j+1];",
	"\tfor(i = 0; i < j+1; i++){",
	"\t    result[i] = raw[i];",
	"\t}",
	"\treturn new String(result);",
	"    }",
	"}",
    };
    public static void main(String args[]){
	System.out.println(strings[0]);
	System.out.println(strings[1]);
	for(String s : strings) System.out.println('	' + stringify(s) + ',');
	for(int i = 2; i < strings.length; i++) System.out.println(strings[i]);
    }
    public static String stringify(String src){
	char[] raw = new char[3 * src.length()];
	raw[0] = 0x0022;
	int i, j;
	for(i = 0, j = 1; i < src.length(); i++, j++){
	    switch(src.charAt(i)){
	    case 0x0009:
		raw[j++] = 0x005C;
		raw[j] = 't';
		break;
	    default:
		raw[j] = src.charAt(i);
	    }
	}
	raw[j] = 0x0022;
	char[] result = new char[j+1];
	for(i = 0; i < j+1; i++){
	    result[i] = raw[i];
	}
	return new String(result);
    }
}
