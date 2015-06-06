// Generated from Python.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, STRING=12, NUMBER=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "STRING", "ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "':'", "'('", "')'", "'['", "']'", "'True'", 
		"'False'", "'None'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"STRING", "NUMBER", "WS"
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


	public PythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Python.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\rM\n\r\f\r\16\rP\13\r\3\r\3\r\3\16"+
		"\3\16\3\16\5\16W\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\5\21"+
		"b\n\21\3\21\3\21\3\21\6\21g\n\21\r\21\16\21h\3\21\5\21l\n\21\3\21\5\21"+
		"o\n\21\3\21\3\21\3\21\3\21\5\21u\n\21\3\21\5\21x\n\21\3\22\3\22\3\22\7"+
		"\22}\n\22\f\22\16\22\u0080\13\22\5\22\u0082\n\22\3\23\3\23\5\23\u0086"+
		"\n\23\3\23\3\23\3\24\6\24\u008b\n\24\r\24\16\24\u008c\3\24\3\24\2\2\25"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37"+
		"\2!\17#\2%\2\'\20\3\2\n\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3"+
		"\2\62;\3\2\63;\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\u0098\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"!\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61"+
		"\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\239\3\2\2\2\25>\3\2"+
		"\2\2\27D\3\2\2\2\31I\3\2\2\2\33S\3\2\2\2\35X\3\2\2\2\37^\3\2\2\2!w\3\2"+
		"\2\2#\u0081\3\2\2\2%\u0083\3\2\2\2\'\u008a\3\2\2\2)*\7}\2\2*\4\3\2\2\2"+
		"+,\7.\2\2,\6\3\2\2\2-.\7\177\2\2.\b\3\2\2\2/\60\7<\2\2\60\n\3\2\2\2\61"+
		"\62\7*\2\2\62\f\3\2\2\2\63\64\7+\2\2\64\16\3\2\2\2\65\66\7]\2\2\66\20"+
		"\3\2\2\2\678\7_\2\28\22\3\2\2\29:\7V\2\2:;\7t\2\2;<\7w\2\2<=\7g\2\2=\24"+
		"\3\2\2\2>?\7H\2\2?@\7c\2\2@A\7n\2\2AB\7u\2\2BC\7g\2\2C\26\3\2\2\2DE\7"+
		"P\2\2EF\7q\2\2FG\7p\2\2GH\7g\2\2H\30\3\2\2\2IN\7$\2\2JM\5\33\16\2KM\n"+
		"\2\2\2LJ\3\2\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3"+
		"\2\2\2QR\7$\2\2R\32\3\2\2\2SV\7^\2\2TW\t\3\2\2UW\5\35\17\2VT\3\2\2\2V"+
		"U\3\2\2\2W\34\3\2\2\2XY\7w\2\2YZ\5\37\20\2Z[\5\37\20\2[\\\5\37\20\2\\"+
		"]\5\37\20\2]\36\3\2\2\2^_\t\4\2\2_ \3\2\2\2`b\7/\2\2a`\3\2\2\2ab\3\2\2"+
		"\2bc\3\2\2\2cd\5#\22\2df\7\60\2\2eg\t\5\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2"+
		"\2\2hi\3\2\2\2ik\3\2\2\2jl\5%\23\2kj\3\2\2\2kl\3\2\2\2lx\3\2\2\2mo\7/"+
		"\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\5#\22\2qr\5%\23\2rx\3\2\2\2su\7/"+
		"\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vx\5#\22\2wa\3\2\2\2wn\3\2\2\2wt\3\2"+
		"\2\2x\"\3\2\2\2y\u0082\7\62\2\2z~\t\6\2\2{}\t\5\2\2|{\3\2\2\2}\u0080\3"+
		"\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081y"+
		"\3\2\2\2\u0081z\3\2\2\2\u0082$\3\2\2\2\u0083\u0085\t\7\2\2\u0084\u0086"+
		"\t\b\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\5#\22\2\u0088&\3\2\2\2\u0089\u008b\t\t\2\2\u008a\u0089\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\b\24\2\2\u008f(\3\2\2\2\20\2LNVahkntw~\u0081\u0085"+
		"\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}