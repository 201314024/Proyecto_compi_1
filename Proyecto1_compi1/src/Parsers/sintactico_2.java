
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

package Parsers;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141202 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class sintactico_2 extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return tabla_simbolos2.class;
}

  /** Default constructor. */
  public sintactico_2() {super();}

  /** Constructor which sets the default scanner. */
  public sintactico_2(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public sintactico_2(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\004\000\002\002\003\000\002\003" +
    "\007\000\002\013\002\000\002\012\010\000\002\014\002" +
    "\000\002\012\010\000\002\015\002\000\002\012\010\000" +
    "\002\012\002\000\002\004\010\000\002\016\002\000\002" +
    "\005\013\000\002\017\002\000\002\005\015\000\002\020" +
    "\002\000\002\005\015\000\002\005\002\000\002\006\006" +
    "\000\002\006\006\000\002\006\006\000\002\006\006\000" +
    "\002\006\006\000\002\006\002\000\002\021\002\000\002" +
    "\007\013\000\002\007\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\125\000\004\004\006\001\002\000\004\002\000\001" +
    "\002\000\004\002\127\001\002\000\012\024\007\025\010" +
    "\026\012\031\ufff8\001\002\000\004\035\122\001\002\000" +
    "\004\035\115\001\002\000\004\031\020\001\002\000\004" +
    "\035\013\001\002\000\004\036\014\001\002\000\004\033" +
    "\015\001\002\000\012\024\ufffc\025\ufffc\026\ufffc\031\ufffc" +
    "\001\002\000\012\024\007\025\010\026\012\031\ufff8\001" +
    "\002\000\004\031\ufffb\001\002\000\004\006\021\001\002" +
    "\000\006\007\ufff0\037\024\001\002\000\004\005\023\001" +
    "\002\000\004\002\uffff\001\002\000\004\027\067\001\002" +
    "\000\004\007\026\001\002\000\004\010\027\001\002\000" +
    "\016\011\uffea\012\031\014\035\016\032\020\034\022\030" +
    "\001\002\000\006\023\uffe7\037\037\001\002\000\006\013" +
    "\uffe7\037\037\001\002\000\006\017\uffe7\037\037\001\002" +
    "\000\004\011\055\001\002\000\006\021\uffe7\037\037\001" +
    "\002\000\006\015\uffe7\037\037\001\002\000\004\015\050" +
    "\001\002\000\004\027\040\001\002\000\004\036\041\001" +
    "\002\000\004\034\042\001\002\000\004\036\043\001\002" +
    "\000\004\030\044\001\002\000\004\033\045\001\002\000" +
    "\016\013\uffe9\015\uffe9\017\uffe9\021\uffe9\023\uffe9\037\uffe9" +
    "\001\002\000\016\013\uffe7\015\uffe7\017\uffe7\021\uffe7\023" +
    "\uffe7\037\037\001\002\000\014\013\uffe8\015\uffe8\017\uffe8" +
    "\021\uffe8\023\uffe8\001\002\000\016\011\uffea\012\031\014" +
    "\035\016\032\020\034\022\030\001\002\000\004\011\uffee" +
    "\001\002\000\004\021\053\001\002\000\016\011\uffea\012" +
    "\031\014\035\016\032\020\034\022\030\001\002\000\004" +
    "\011\uffec\001\002\000\004\005\ufff7\001\002\000\004\017" +
    "\057\001\002\000\016\011\uffea\012\031\014\035\016\032" +
    "\020\034\022\030\001\002\000\004\011\uffed\001\002\000" +
    "\004\013\062\001\002\000\016\011\uffea\012\031\014\035" +
    "\016\032\020\034\022\030\001\002\000\004\011\uffef\001" +
    "\002\000\004\023\065\001\002\000\016\011\uffea\012\031" +
    "\014\035\016\032\020\034\022\030\001\002\000\004\011" +
    "\uffeb\001\002\000\004\036\070\001\002\000\006\032\071" +
    "\034\072\001\002\000\004\036\106\001\002\000\004\036" +
    "\073\001\002\000\006\030\074\032\075\001\002\000\004" +
    "\033\103\001\002\000\004\036\076\001\002\000\004\030" +
    "\077\001\002\000\004\033\100\001\002\000\006\007\ufff2" +
    "\037\ufff2\001\002\000\006\007\ufff0\037\024\001\002\000" +
    "\004\007\ufff1\001\002\000\006\007\ufff6\037\ufff6\001\002" +
    "\000\006\007\ufff0\037\024\001\002\000\004\007\ufff5\001" +
    "\002\000\004\034\107\001\002\000\004\036\110\001\002" +
    "\000\004\030\111\001\002\000\004\033\112\001\002\000" +
    "\006\007\ufff4\037\ufff4\001\002\000\006\007\ufff0\037\024" +
    "\001\002\000\004\007\ufff3\001\002\000\004\036\116\001" +
    "\002\000\004\033\117\001\002\000\012\024\ufffa\025\ufffa" +
    "\026\ufffa\031\ufffa\001\002\000\012\024\007\025\010\026" +
    "\012\031\ufff8\001\002\000\004\031\ufff9\001\002\000\004" +
    "\037\123\001\002\000\004\033\124\001\002\000\012\024" +
    "\ufffe\025\ufffe\026\ufffe\031\ufffe\001\002\000\012\024\007" +
    "\025\010\026\012\031\ufff8\001\002\000\004\031\ufffd\001" +
    "\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\125\000\006\002\004\003\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\010\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\014\015" +
    "\001\001\000\004\012\016\001\001\000\002\001\001\000" +
    "\004\004\021\001\001\000\004\005\024\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\032\001\001\000\004" +
    "\007\063\001\001\000\004\007\060\001\001\000\004\007" +
    "\055\001\001\000\002\001\001\000\004\007\051\001\001" +
    "\000\004\007\035\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\021\045\001" +
    "\001\000\004\007\046\001\001\000\002\001\001\000\004" +
    "\006\050\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\006\053\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\057\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\062\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\006\065\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\020\100\001\001\000\004\005\101\001\001\000" +
    "\002\001\001\000\004\016\103\001\001\000\004\005\104" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\017\112" +
    "\001\001\000\004\005\113\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\015\117\001\001" +
    "\000\004\012\120\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\013\124\001\001\000\004" +
    "\012\125\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$sintactico_2$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$sintactico_2$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$sintactico_2$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



/**Metodo al que se llama autom�ticamente ante alg�n error sintactico.*/

public static int x=0,y=0;
public void syntax_error(Symbol s){
System.out.println("Error en la L�nea " + (s.right+1) +" Columna " +s.left+ ". Identificador " +s.value + " no reconocido." );
}
/**Metodo al que se llama en el momento en que ya no es posible una recuperaci�n de errores.*/
public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
System.out.println("Error en la L�nea " + (s.right+1)+ "Columna "+s.left+". Identificador " + s.value + " no reconocido.");
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$sintactico_2$actions {
  private final sintactico_2 parser;

  /** Constructor */
  CUP$sintactico_2$actions(sintactico_2 parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$sintactico_2$do_action_part00000000(
    int                        CUP$sintactico_2$act_num,
    java_cup.runtime.lr_parser CUP$sintactico_2$parser,
    java.util.Stack            CUP$sintactico_2$stack,
    int                        CUP$sintactico_2$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$sintactico_2$result;

      /* select the action based on the action number */
      switch (CUP$sintactico_2$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIA EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).value;
		RESULT = start_val;
              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$sintactico_2$parser.done_parsing();
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIA ::= A 
            {
              Object RESULT =null;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("INICIA",0, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // A ::= Oesce H Ctag B Cesce 
            {
              Object RESULT =null;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$0 ::= 
            {
              Object RESULT =null;
		int fnombreleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).left;
		int fnombreright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).right;
		Object fnombre = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).value;
proyecto1_compi1.Main.fondo_juego(fnombre.toString());
              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("NT$0",9, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // H ::= tfondo tigual tlnombre tpuntycom NT$0 H 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).value;
		int fnombreleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)).left;
		int fnombreright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)).right;
		Object fnombre = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)).value;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("H",8, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-5)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NT$1 ::= 
            {
              Object RESULT =null;
		int posxleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).left;
		int posxright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).right;
		Object posx = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).value;
x=Integer.parseInt(posx.toString());
              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("NT$1",10, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // H ::= talto tigual tnumero tpuntycom NT$1 H 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).value;
		int posxleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)).left;
		int posxright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)).right;
		Object posx = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)).value;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("H",8, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-5)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NT$2 ::= 
            {
              Object RESULT =null;
		int posyleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).left;
		int posyright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).right;
		Object posy = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).value;
y=Integer.parseInt(posy.toString());
              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("NT$2",11, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // H ::= tancho tigual tnumero tpuntycom NT$2 H 
            {
              Object RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).value;
		int posyleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)).left;
		int posyright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)).right;
		Object posy = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)).value;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("H",8, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-5)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // H ::= 
            {
              Object RESULT =null;
		proyecto1_compi1.Main.mat=new proyecto1_compi1.Objeto[y][x]; for(int i=0;i<y;i++){for(int j=0;j<x;j++){proyecto1_compi1.Main.mat[i][j]=new proyecto1_compi1.Objeto();}};
              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("H",8, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // B ::= Opared C Cpared Oex D Cex 
            {
              Object RESULT =null;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-5)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // NT$3 ::= 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-2)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-2)).value;
proyecto1_compi1.Main.add_mat(a.toString(),Integer.parseInt(b.toString()),Integer.parseInt(c.toString()));
              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("NT$3",12, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // C ::= tlnombre Oparen tnumero tcom tnumero Cparen tpuntycom NT$3 C 
            {
              Object RESULT =null;
              // propagate RESULT from NT$3
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).value;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("C",3, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NT$4 ::= 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-2)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-2)).value;
proyecto1_compi1.Main.add_matx(a.toString(),Integer.parseInt(b.toString()),Integer.parseInt(d.toString()),Integer.parseInt(c.toString()));
              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("NT$4",13, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // C ::= tlnombre Oparen tnumero tdpunt tnumero tcom tnumero Cparen tpuntycom NT$4 C 
            {
              Object RESULT =null;
              // propagate RESULT from NT$4
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-10)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-10)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-10)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).value;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("C",3, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-10)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // NT$5 ::= 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-2)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-2)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-2)).value;
proyecto1_compi1.Main.add_maty(a.toString(),Integer.parseInt(b.toString()),Integer.parseInt(c.toString()),Integer.parseInt(d.toString()));
              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("NT$5",14, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // C ::= tlnombre Oparen tnumero tcom tnumero tdpunt tnumero Cparen tpuntycom NT$5 C 
            {
              Object RESULT =null;
              // propagate RESULT from NT$5
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-10)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-10)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-10)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).value;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("C",3, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-10)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // C ::= 
            {
              Object RESULT =null;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("C",3, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // D ::= Oest E Cest D 
            {
              Object RESULT =null;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("D",4, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // D ::= Obon E Cbon D 
            {
              Object RESULT =null;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("D",4, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // D ::= Oman E Cman D 
            {
              Object RESULT =null;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("D",4, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // D ::= Oven E Cven D 
            {
              Object RESULT =null;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("D",4, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // D ::= Obom E Cbom D 
            {
              Object RESULT =null;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("D",4, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-3)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // D ::= 
            {
              Object RESULT =null;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("D",4, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // NT$6 ::= 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-2)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-2)).value;
proyecto1_compi1.Main.add_mat(a.toString(),Integer.parseInt(b.toString()),Integer.parseInt(c.toString()));
              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("NT$6",15, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // E ::= tlnombre Oparen tnumero tcom tnumero Cparen tpuntycom NT$6 E 
            {
              Object RESULT =null;
              // propagate RESULT from NT$6
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-6)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-4)).value;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("E",5, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.elementAt(CUP$sintactico_2$top-8)), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // E ::= 
            {
              Object RESULT =null;

              CUP$sintactico_2$result = parser.getSymbolFactory().newSymbol("E",5, ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_2$stack.peek()), RESULT);
            }
          return CUP$sintactico_2$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$sintactico_2$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$sintactico_2$do_action(
    int                        CUP$sintactico_2$act_num,
    java_cup.runtime.lr_parser CUP$sintactico_2$parser,
    java.util.Stack            CUP$sintactico_2$stack,
    int                        CUP$sintactico_2$top)
    throws java.lang.Exception
    {
              return CUP$sintactico_2$do_action_part00000000(
                               CUP$sintactico_2$act_num,
                               CUP$sintactico_2$parser,
                               CUP$sintactico_2$stack,
                               CUP$sintactico_2$top);
    }
}

}
