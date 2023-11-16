// Generated from c:/Users/adria/OneDrive/Escritorio/ITC/Semestre8/Aplicaciones_Avanzadas/Compiladores/Compilador_Adriana/baby_duck.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link baby_duckParser}.
 */
public interface baby_duckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(baby_duckParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(baby_duckParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(baby_duckParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(baby_duckParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(baby_duckParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(baby_duckParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(baby_duckParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(baby_duckParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(baby_duckParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(baby_duckParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(baby_duckParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(baby_duckParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(baby_duckParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(baby_duckParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(baby_duckParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(baby_duckParser.CycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(baby_duckParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(baby_duckParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(baby_duckParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(baby_duckParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#oper_rel}.
	 * @param ctx the parse tree
	 */
	void enterOper_rel(baby_duckParser.Oper_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#oper_rel}.
	 * @param ctx the parse tree
	 */
	void exitOper_rel(baby_duckParser.Oper_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(baby_duckParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(baby_duckParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(baby_duckParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(baby_duckParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(baby_duckParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(baby_duckParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(baby_duckParser.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(baby_duckParser.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(baby_duckParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(baby_duckParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#f_call}.
	 * @param ctx the parse tree
	 */
	void enterF_call(baby_duckParser.F_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#f_call}.
	 * @param ctx the parse tree
	 */
	void exitF_call(baby_duckParser.F_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link baby_duckParser#cte}.
	 * @param ctx the parse tree
	 */
	void enterCte(baby_duckParser.CteContext ctx);
	/**
	 * Exit a parse tree produced by {@link baby_duckParser#cte}.
	 * @param ctx the parse tree
	 */
	void exitCte(baby_duckParser.CteContext ctx);
}