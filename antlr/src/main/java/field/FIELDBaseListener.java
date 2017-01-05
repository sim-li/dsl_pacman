package field;
// Generated from FIELD.g4 by ANTLR 4.5.3

import com.sun.rowset.internal.Row;
import models.Field;
import models.Line;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an empty implementation of {@link FIELDListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class FIELDBaseListener implements FIELDListener {
	private List<Line> lines = new ArrayList<Line>();
	private Line currentLine = new Line();

	public List<Line> getMyLines() {
		return lines;
	}
	 /*
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterField(FIELDParser.FieldContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitField(FIELDParser.FieldContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRow(FIELDParser.RowContext ctx) {
		lines.add(currentLine);
		currentLine = new Line();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRow(FIELDParser.RowContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterValue(FIELDParser.ValueContext ctx) {
		final Field f = new Field();
		if (ctx.getChild(0).getText().equals("s")) {
			f.setIsShip();
		}
		currentLine.addField(f);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitValue(FIELDParser.ValueContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
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
