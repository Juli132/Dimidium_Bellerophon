package maindeveloper;

import jupitore.gen.*;

public class Compute extends JupitoreBaseVisitor<Double> {

    private int iteration;

    public Compute(int iteration) {
        this.iteration = iteration;
    }

    /** 
     * @param ctx
     * @return Double
     */
    // number literal
    @Override
    public Double visitNumber(JupitoreParser.NumberContext ctx) {
        return Double.parseDouble(ctx.NUMBER().getText());
    }

    /** 
     * @param ctx
     * @return Double
     */
    // iterator "i"
    @Override
    public Double visitIterator(JupitoreParser.IteratorContext ctx) {
        return (double) iteration;
    }

    /** 
     * @param ctx
     * @return Double
     */
    // parentheses
    @Override
    public Double visitParens(JupitoreParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

  //NEW
    @Override
    public Double visitPower(JupitoreParser.PowerContext ctx) {
        double base = visit(ctx.expr(0));
        double exponent = visit(ctx.expr(1));
        return Math.pow(base, exponent);
    }


    /** 
     * @param ctx
     * @return Double
     */
    // addition / subtraction

    // fixing 4/3/2026 to op.getText. gonna simplify things even more
    @Override
    public Double visitAddSub(JupitoreParser.AddSubContext ctx) {

        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));

       return ctx.op.getText().equals("+") ? left + right : left - right;
    }

    /** 
     * @param ctx
     * @return Double
     */
    // multiply / divide
    //MODIFYING 4/3/2026 to op.getText. gonna simplify things even more
    @Override
    public Double visitMulDiv(JupitoreParser.MulDivContext ctx) {

        double left = visit(ctx.expr(0));
        double right = visit(ctx.expr(1));

        return ctx.op.getText().equals("*") ? left * right : left / right;
    }

    /** 
     * @param ctx
     * @return Double
     */
    // functions: sin cos tan sqrt
    // adding Math.toRadians 4/3/2026
    @Override
    public Double visitFuncCall(JupitoreParser.FuncCallContext ctx) {
           // ctx.func().getText().toLowerCase() added this! 4/3/2026 to make it case insensitive
        double value = visit(ctx.expr());
        String funcName = ctx.func().getText().toLowerCase();

        switch (funcName) {

            case "sin":
                return Math.sin(Math.toRadians(value));

            case "cos":
                return Math.cos(Math.toRadians(value));

            case "tan":
                return Math.tan(Math.toRadians(value));

            case "sqrt":
                return Math.sqrt(value);
            case "abs":
                return Math.abs(value);
            case "sign":
                return Math.signum(value);
            default:
                throw new RuntimeException("Unknown function: " + funcName);
        }
    }
}
