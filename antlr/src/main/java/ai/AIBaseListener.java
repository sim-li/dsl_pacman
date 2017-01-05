package ai;
// Generated from AI.g4 by ANTLR 4.5.3

import models.AiMove;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an empty implementation of {@link AIListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class AIBaseListener implements AIListener {
	private List<AiMove> aiMoves = new ArrayList<AiMove>();

	public List<AiMove> getAiMoves() {
		return aiMoves;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAi(AIParser.AiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAi(AIParser.AiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(AIParser.ExprContext ctx) {
		final List<ParseTree> children = ctx.children;
		final String instruction = children.get(0).getText();
		final AiMove aiMove = new AiMove();
		if(instruction.equals("Der Computer feuert auf")) {
			final String xCordString = children.get(1).getText();
			aiMove.setXCordString(xCordString);
			final int xCord  = Character.getNumericValue(xCordString.toCharArray()[0]) - 9;
			final int yCord = Integer.parseInt(children.get(2).getText());
			aiMove.setXCord(xCord);
			aiMove.setYCord(yCord);
		} else if(instruction.equals("Der Computer feuert per Zufall auf eine noch nicht getroffene Zelle.")) {
			aiMove.setRandom();
		}
		aiMoves.add(aiMove);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(AIParser.ExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) {}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}
