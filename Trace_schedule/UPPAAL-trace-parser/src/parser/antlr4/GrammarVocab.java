// Generated from GrammarVocab.g4 by ANTLR 4.5.2
 
	package parser.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarVocab extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCB=1, RCB=2, LB=3, RB=4, LSB=5, RSB=6, ASSIGN=7, COLON=8, SEMI=9, ARROW=10, 
		COMMA=11, DOT=12, STATE=13, TRANSITIONS=14, TRANSITION=15, DELAY=16, MINUS=17, 
		PLUS=18, MULT=19, EQ=20, NE=21, GE=22, GT=23, LE=24, LT=25, EQ_TOKEN=26, 
		AND=27, OR=28, EXCL=29, QM=30, TIMEZERO=31, BOOL=32, OBJECTREF=33, VARREF=34, 
		REAL=35, NUM=36, WS=37, LINECOMMENT=38, BLOCKCOMMENT=39, CHAR=40, DIGIT=41, 
		DIVIDE=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCB", "RCB", "LB", "RB", "LSB", "RSB", "ASSIGN", "COLON", "SEMI", "ARROW", 
		"COMMA", "DOT", "STATE", "TRANSITIONS", "TRANSITION", "DELAY", "MINUS", 
		"PLUS", "MULT", "EQ", "NE", "GE", "GT", "LE", "LT", "EQ_TOKEN", "AND", 
		"OR", "EXCL", "QM", "TIMEZERO", "BOOL", "OBJECTREF", "VARREF", "REAL", 
		"NUM", "WS", "LINECOMMENT", "BLOCKCOMMENT", "CHAR", "DIGIT", "DIVIDE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'['", "']'", "':='", "':'", "';'", 
		"'->'", "','", "'.'", "'State:'", "'Transitions:'", "'Transition:'", "'Delay:'", 
		"'-'", "'+'", "'*'", null, "'!='", "'>='", "'>'", "'<='", "'<'", "'='", 
		"'&&'", "'||'", "'!'", "'?'", "'t(0)'", null, null, null, null, null, 
		null, null, null, null, null, "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCB", "RCB", "LB", "RB", "LSB", "RSB", "ASSIGN", "COLON", "SEMI", 
		"ARROW", "COMMA", "DOT", "STATE", "TRANSITIONS", "TRANSITION", "DELAY", 
		"MINUS", "PLUS", "MULT", "EQ", "NE", "GE", "GT", "LE", "LT", "EQ_TOKEN", 
		"AND", "OR", "EXCL", "QM", "TIMEZERO", "BOOL", "OBJECTREF", "VARREF", 
		"REAL", "NUM", "WS", "LINECOMMENT", "BLOCKCOMMENT", "CHAR", "DIGIT", "DIVIDE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GrammarVocab(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarVocab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u012d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u00a1"+
		"\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00ca\n!\3\"\3\"\3\"\3\"\3\"\7\""+
		"\u00d1\n\"\f\"\16\"\u00d4\13\"\5\"\u00d6\n\"\3#\3#\3#\7#\u00db\n#\f#\16"+
		"#\u00de\13#\3#\3#\6#\u00e2\n#\r#\16#\u00e3\3#\5#\u00e7\n#\3#\3#\7#\u00eb"+
		"\n#\f#\16#\u00ee\13#\3$\3$\3$\3$\5$\u00f4\n$\3$\3$\3$\5$\u00f9\n$\3$\3"+
		"$\3$\5$\u00fe\n$\3%\5%\u0101\n%\3%\6%\u0104\n%\r%\16%\u0105\3&\6&\u0109"+
		"\n&\r&\16&\u010a\3&\3&\3\'\3\'\3\'\3\'\7\'\u0113\n\'\f\'\16\'\u0116\13"+
		"\'\3\'\3\'\3(\3(\3(\3(\7(\u011e\n(\f(\16(\u0121\13(\3(\3(\3(\3(\3(\3)"+
		"\3)\3*\3*\3+\3+\3\u011f\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\6\5\2\13\f"+
		"\17\17\"\"\4\2\f\f\17\17\6\2%%C\\aac|\3\2\62;\u013d\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2"+
		"\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17c\3\2\2\2"+
		"\21f\3\2\2\2\23h\3\2\2\2\25j\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33q\3\2\2"+
		"\2\35x\3\2\2\2\37\u0085\3\2\2\2!\u0091\3\2\2\2#\u0098\3\2\2\2%\u009a\3"+
		"\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2+\u00a2\3\2\2\2-\u00a5\3\2\2\2/\u00a8"+
		"\3\2\2\2\61\u00aa\3\2\2\2\63\u00ad\3\2\2\2\65\u00af\3\2\2\2\67\u00b1\3"+
		"\2\2\29\u00b4\3\2\2\2;\u00b7\3\2\2\2=\u00b9\3\2\2\2?\u00bb\3\2\2\2A\u00c9"+
		"\3\2\2\2C\u00d5\3\2\2\2E\u00d7\3\2\2\2G\u00ef\3\2\2\2I\u0100\3\2\2\2K"+
		"\u0108\3\2\2\2M\u010e\3\2\2\2O\u0119\3\2\2\2Q\u0127\3\2\2\2S\u0129\3\2"+
		"\2\2U\u012b\3\2\2\2WX\7}\2\2X\4\3\2\2\2YZ\7\177\2\2Z\6\3\2\2\2[\\\7*\2"+
		"\2\\\b\3\2\2\2]^\7+\2\2^\n\3\2\2\2_`\7]\2\2`\f\3\2\2\2ab\7_\2\2b\16\3"+
		"\2\2\2cd\7<\2\2de\7?\2\2e\20\3\2\2\2fg\7<\2\2g\22\3\2\2\2hi\7=\2\2i\24"+
		"\3\2\2\2jk\7/\2\2kl\7@\2\2l\26\3\2\2\2mn\7.\2\2n\30\3\2\2\2op\7\60\2\2"+
		"p\32\3\2\2\2qr\7U\2\2rs\7v\2\2st\7c\2\2tu\7v\2\2uv\7g\2\2vw\7<\2\2w\34"+
		"\3\2\2\2xy\7V\2\2yz\7t\2\2z{\7c\2\2{|\7p\2\2|}\7u\2\2}~\7k\2\2~\177\7"+
		"v\2\2\177\u0080\7k\2\2\u0080\u0081\7q\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7u\2\2\u0083\u0084\7<\2\2\u0084\36\3\2\2\2\u0085\u0086\7V\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7c\2\2\u0088\u0089\7p\2\2\u0089\u008a\7u\2\2\u008a"+
		"\u008b\7k\2\2\u008b\u008c\7v\2\2\u008c\u008d\7k\2\2\u008d\u008e\7q\2\2"+
		"\u008e\u008f\7p\2\2\u008f\u0090\7<\2\2\u0090 \3\2\2\2\u0091\u0092\7F\2"+
		"\2\u0092\u0093\7g\2\2\u0093\u0094\7n\2\2\u0094\u0095\7c\2\2\u0095\u0096"+
		"\7{\2\2\u0096\u0097\7<\2\2\u0097\"\3\2\2\2\u0098\u0099\7/\2\2\u0099$\3"+
		"\2\2\2\u009a\u009b\7-\2\2\u009b&\3\2\2\2\u009c\u009d\7,\2\2\u009d(\3\2"+
		"\2\2\u009e\u00a0\5\65\33\2\u009f\u00a1\5\65\33\2\u00a0\u009f\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7#\2\2\u00a3\u00a4\7?\2\2\u00a4"+
		",\3\2\2\2\u00a5\u00a6\7@\2\2\u00a6\u00a7\7?\2\2\u00a7.\3\2\2\2\u00a8\u00a9"+
		"\7@\2\2\u00a9\60\3\2\2\2\u00aa\u00ab\7>\2\2\u00ab\u00ac\7?\2\2\u00ac\62"+
		"\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"\66\3\2\2\2\u00b1\u00b2\7(\2\2\u00b2\u00b3\7(\2\2\u00b38\3\2\2\2\u00b4"+
		"\u00b5\7~\2\2\u00b5\u00b6\7~\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8"+
		"<\3\2\2\2\u00b9\u00ba\7A\2\2\u00ba>\3\2\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd"+
		"\7*\2\2\u00bd\u00be\7\62\2\2\u00be\u00bf\7+\2\2\u00bf@\3\2\2\2\u00c0\u00c1"+
		"\7v\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7w\2\2\u00c3\u00ca\7g\2\2\u00c4"+
		"\u00c5\7h\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7u\2\2"+
		"\u00c8\u00ca\7g\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c4\3\2\2\2\u00caB\3\2"+
		"\2\2\u00cb\u00d6\5? \2\u00cc\u00d2\5E#\2\u00cd\u00ce\5\31\r\2\u00ce\u00cf"+
		"\5C\"\2\u00cf\u00d1\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00cb\3\2\2\2\u00d5\u00cc\3\2\2\2\u00d6D\3\2\2\2\u00d7\u00dc"+
		"\5Q)\2\u00d8\u00db\5Q)\2\u00d9\u00db\5S*\2\u00da\u00d8\3\2\2\2\u00da\u00d9"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00ec\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e6\5\13\6\2\u00e0\u00e2\5"+
		"S*\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\5E#\2\u00e6\u00e1\3\2\2"+
		"\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\5\r\7\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00df\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00edF\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f3\5I%\2\u00f0"+
		"\u00f1\5\31\r\2\u00f1\u00f2\5I%\2\u00f2\u00f4\3\2\2\2\u00f3\u00f0\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00fd\3\2\2\2\u00f5\u00f8\7g\2\2\u00f6"+
		"\u00f9\5%\23\2\u00f7\u00f9\5#\22\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\5S*\2\u00fb\u00fc\5S*\2\u00fc\u00fe"+
		"\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00fe\3\2\2\2\u00feH\3\2\2\2\u00ff"+
		"\u0101\5#\22\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2"+
		"\2\2\u0102\u0104\5S*\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106J\3\2\2\2\u0107\u0109\t\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b&\2\2\u010dL\3\2\2\2\u010e\u010f"+
		"\7\61\2\2\u010f\u0110\7\61\2\2\u0110\u0114\3\2\2\2\u0111\u0113\n\3\2\2"+
		"\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\b\'\2\2\u0118"+
		"N\3\2\2\2\u0119\u011a\7\61\2\2\u011a\u011b\7,\2\2\u011b\u011f\3\2\2\2"+
		"\u011c\u011e\13\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0123\7,\2\2\u0123\u0124\7\61\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b("+
		"\2\2\u0126P\3\2\2\2\u0127\u0128\t\4\2\2\u0128R\3\2\2\2\u0129\u012a\t\5"+
		"\2\2\u012aT\3\2\2\2\u012b\u012c\7\61\2\2\u012cV\3\2\2\2\24\2\u00a0\u00c9"+
		"\u00d2\u00d5\u00da\u00dc\u00e3\u00e6\u00ec\u00f3\u00f8\u00fd\u0100\u0105"+
		"\u010a\u0114\u011f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}