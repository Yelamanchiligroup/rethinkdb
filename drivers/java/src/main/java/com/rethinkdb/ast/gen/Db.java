// Autogenerated by convert_protofile.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class Db extends RqlAst {


    public Db(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Db(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Db(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.DB, args, optargs);
    }
    protected Db(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Db fromArgs(Object... args){
        return new Db(new Arguments(args), null);
    }


    public Table table(Object... fields) {
        return new Table(this, new Arguments(fields), new OptArgs());
    }

    public TableCreate tableCreate(Object... fields) {
        return new TableCreate(this, new Arguments(fields), new OptArgs());
    }

    public TableDrop tableDrop(Object... fields) {
        return new TableDrop(this, new Arguments(fields), new OptArgs());
    }

    public TableList tableList(Object... fields) {
        return new TableList(this, new Arguments(fields), new OptArgs());
    }

    public Config config(Object... fields) {
        return new Config(this, new Arguments(fields), new OptArgs());
    }

    public Wait wait(Object... fields) {
        return new Wait(this, new Arguments(fields), new OptArgs());
    }

    public Reconfigure reconfigure(Object... fields) {
        return new Reconfigure(this, new Arguments(fields), new OptArgs());
    }

    public Rebalance rebalance(Object... fields) {
        return new Rebalance(this, new Arguments(fields), new OptArgs());
    }

}