package ai;
// Generated from AI.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AIParser}.
 */
public interface AIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AIParser#ai}.
	 * @param ctx the parse tree
	 */
	void enterAi(AIParser.AiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AIParser#ai}.
	 * @param ctx the parse tree
	 */
	void exitAi(AIParser.AiContext ctx);
	/**
	 * Enter a parse tree produced by {@link AIParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AIParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AIParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AIParser.ExprContext ctx);
}
