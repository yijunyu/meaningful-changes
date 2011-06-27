typedef unsigned char char_u;
typedef unsigned short short_u;
typedef unsigned int int_u;
typedef unsigned long long_u;
typedef long long_i;
typedef char_u schar_T;
typedef unsigned short sattr_T;
typedef signed char __int8_t;
typedef unsigned char __uint8_t;
typedef short __int16_t;
typedef unsigned short __uint16_t;
typedef int __int32_t;
typedef unsigned int __uint32_t;
typedef long long __int64_t;
typedef unsigned long long __uint64_t;
typedef long __darwin_intptr_t;
typedef unsigned int __darwin_natural_t;
typedef int __darwin_ct_rune_t;
typedef union {
    char __mbstate8 [128];
    long long _mbstateL;
} __mbstate_t;
typedef __mbstate_t __darwin_mbstate_t;
typedef long int __darwin_ptrdiff_t;
typedef long unsigned int __darwin_size_t;
typedef __builtin_va_list __darwin_va_list;
typedef int __darwin_wchar_t;
typedef __darwin_wchar_t __darwin_rune_t;
typedef int __darwin_wint_t;
typedef unsigned long __darwin_clock_t;
typedef __uint32_t __darwin_socklen_t;
typedef long __darwin_ssize_t;
typedef long __darwin_time_t;
struct __darwin_pthread_handler_rec {
    void (* __routine) (void *);
    void * __arg;
    struct __darwin_pthread_handler_rec * __next;
};
struct _opaque_pthread_attr_t {
    long __sig;
    char __opaque [56];
};
struct _opaque_pthread_cond_t {
    long __sig;
    char __opaque [40];
};
struct _opaque_pthread_condattr_t {
    long __sig;
    char __opaque [8];
};
struct _opaque_pthread_mutex_t {
    long __sig;
    char __opaque [56];
};
struct _opaque_pthread_mutexattr_t {
    long __sig;
    char __opaque [8];
};
struct _opaque_pthread_once_t {
    long __sig;
    char __opaque [8];
};
struct _opaque_pthread_rwlock_t {
    long __sig;
    char __opaque [192];
};
struct _opaque_pthread_rwlockattr_t {
    long __sig;
    char __opaque [16];
};
struct _opaque_pthread_t {
    long __sig;
    struct __darwin_pthread_handler_rec * __cleanup_stack;
    char __opaque [1168];
};
typedef __int64_t __darwin_blkcnt_t;
typedef __int32_t __darwin_blksize_t;
typedef __int32_t __darwin_dev_t;
typedef unsigned int __darwin_fsblkcnt_t;
typedef unsigned int __darwin_fsfilcnt_t;
typedef __uint32_t __darwin_gid_t;
typedef __uint32_t __darwin_id_t;
typedef __uint64_t __darwin_ino64_t;
typedef __darwin_ino64_t __darwin_ino_t;
typedef __darwin_natural_t __darwin_mach_port_name_t;
typedef __darwin_mach_port_name_t __darwin_mach_port_t;
typedef __uint16_t __darwin_mode_t;
typedef __int64_t __darwin_off_t;
typedef __int32_t __darwin_pid_t;
typedef struct _opaque_pthread_attr_t __darwin_pthread_attr_t;
typedef struct _opaque_pthread_cond_t __darwin_pthread_cond_t;
typedef struct _opaque_pthread_condattr_t __darwin_pthread_condattr_t;
typedef unsigned long __darwin_pthread_key_t;
typedef struct _opaque_pthread_mutex_t __darwin_pthread_mutex_t;
typedef struct _opaque_pthread_mutexattr_t __darwin_pthread_mutexattr_t;
typedef struct _opaque_pthread_once_t __darwin_pthread_once_t;
typedef struct _opaque_pthread_rwlock_t __darwin_pthread_rwlock_t;
typedef struct _opaque_pthread_rwlockattr_t __darwin_pthread_rwlockattr_t;
typedef struct _opaque_pthread_t * __darwin_pthread_t;
typedef __uint32_t __darwin_sigset_t;
typedef __int32_t __darwin_suseconds_t;
typedef __uint32_t __darwin_uid_t;
typedef __uint32_t __darwin_useconds_t;
typedef unsigned char __darwin_uuid_t [16];
typedef char __darwin_uuid_string_t [37];
typedef int __darwin_nl_item;
typedef int __darwin_wctrans_t;
typedef __uint32_t __darwin_wctype_t;
typedef __darwin_va_list va_list;
typedef __darwin_off_t off_t;
typedef __darwin_size_t size_t;
typedef __darwin_off_t fpos_t;
struct __sbuf {
    unsigned char * _base;
    int _size;
};
struct __sFILEX;
typedef struct __sFILE {
    unsigned char * _p;
    int _r;
    int _w;
    short _flags;
    short _file;
    struct __sbuf _bf;
    int _lbfsize;
    void * _cookie;
    int (* _close) (void *);
    int (* _read) (void *, char *, int);
    fpos_t (* _seek) (void *, fpos_t, int);
    int (* _write) (void *, const char *, int);
    struct __sbuf _ub;
    struct __sFILEX * _extra;
    int _ur;
    unsigned char _ubuf [3];
    unsigned char _nbuf [1];
    struct __sbuf _lb;
    int _blksize;
    fpos_t _offset;
} FILE;
extern FILE * __stdinp;
extern FILE * __stdoutp;
extern FILE * __stderrp;
void clearerr (FILE *);
int fclose (FILE *);
int feof (FILE *);
int ferror (FILE *);
int fflush (FILE *);
int fgetc (FILE *);
int fgetpos (FILE *, fpos_t *);
char * fgets (char *, int, FILE *);
FILE * fopen (const char *, const char *) __asm ("_" "fopen");
int fprintf (FILE *, const char *,...);
int fputc (int, FILE *);
int fputs (const char *, FILE *) __asm ("_" "fputs");
size_t fread (void *, size_t, size_t, FILE *);
FILE * freopen (const char *, const char *, FILE *) __asm ("_" "freopen");
int fscanf (FILE *, const char *,...);
int fseek (FILE *, long, int);
int fsetpos (FILE *, const fpos_t *);
long ftell (FILE *);
size_t fwrite (const void *, size_t, size_t, FILE *) __asm ("_" "fwrite");
int getc (FILE *);
int getchar (void);
char * gets (char *);
extern const int sys_nerr;
extern const char * const sys_errlist [];
void perror (const char *);
int printf (const char *,...);
int putc (int, FILE *);
int putchar (int);
int puts (const char *);
int remove (const char *);
int rename (const char *, const char *);
void rewind (FILE *);
int scanf (const char *,...);
void setbuf (FILE *, char *);
int setvbuf (FILE *, char *, int, size_t);
int sprintf (char *, const char *,...);
int sscanf (const char *, const char *,...);
FILE * tmpfile (void);
char * tmpnam (char *);
int ungetc (int, FILE *);
int vfprintf (FILE *, const char *, va_list);
int vprintf (const char *, va_list);
int vsprintf (char *, const char *, va_list);
int asprintf (char * *, const char *,...);
int vasprintf (char * *, const char *, va_list);
char * ctermid (char *);
char * ctermid_r (char *);
FILE * fdopen (int, const char *) __asm ("_" "fdopen");
char * fgetln (FILE *, size_t *);
int fileno (FILE *);
void flockfile (FILE *);
const char * fmtcheck (const char *, const char *);
int fpurge (FILE *);
int fseeko (FILE *, off_t, int);
off_t ftello (FILE *);
int ftrylockfile (FILE *);
void funlockfile (FILE *);
int getc_unlocked (FILE *);
int getchar_unlocked (void);
int getw (FILE *);
int pclose (FILE *);
FILE * popen (const char *, const char *) __asm ("_" "popen");
int putc_unlocked (int, FILE *);
int putchar_unlocked (int);
int putw (int, FILE *);
void setbuffer (FILE *, char *, int);
int setlinebuf (FILE *);
int snprintf (char *, size_t, const char *,...);
char * tempnam (const char *, const char *) __asm ("_" "tempnam");
int vfscanf (FILE *, const char *, va_list);
int vscanf (const char *, va_list);
int vsnprintf (char *, size_t, const char *, va_list);
int vsscanf (const char *, const char *, va_list);
FILE * zopen (const char *, const char *, int);
FILE * funopen (const void *, int (*) (void *, char *, int), int (*) (void *, const char *, int), fpos_t (*) (void *, fpos_t, int), int (*) (void *));
int __srget (FILE *);
int __svfscanf (FILE *, const char *, va_list);
int __swbuf (int, FILE *);

static __inline int __sputc (int _c, FILE * _p) {
    if (--_p->_w >= 0 || (_p -> _w >= _p -> _lbfsize && (char) _c != '\n')) return (*_p->_p++ = _c);
    else return (__swbuf (_c, _p));
}

extern int __sprintf_chk (char *, int, size_t, const char *,...);
extern int __snprintf_chk (char *, size_t, int, size_t, const char *,...);
extern int __vsprintf_chk (char *, int, size_t, const char *, va_list);
extern int __vsnprintf_chk (char *, size_t, int, size_t, const char *, va_list);
typedef __darwin_ct_rune_t ct_rune_t;
typedef __darwin_rune_t rune_t;
typedef __darwin_wchar_t wchar_t;
typedef __darwin_wint_t wint_t;
typedef struct {
    __darwin_rune_t __min;
    __darwin_rune_t __max;
    __darwin_rune_t __map;
    __uint32_t * __types;
} _RuneEntry;
typedef struct {
    int __nranges;
    _RuneEntry * __ranges;
} _RuneRange;
typedef struct {
    char __name [14];
    __uint32_t __mask;
} _RuneCharClass;
typedef struct {
    char __magic [8];
    char __encoding [32];
    __darwin_rune_t (* __sgetrune) (const char *, __darwin_size_t, char const * *);
    int (* __sputrune) (__darwin_rune_t, char *, __darwin_size_t, char * *);
    __darwin_rune_t __invalid_rune;
    __uint32_t __runetype [(1 << 8)];
    __darwin_rune_t __maplower [(1 << 8)];
    __darwin_rune_t __mapupper [(1 << 8)];
    _RuneRange __runetype_ext;
    _RuneRange __maplower_ext;
    _RuneRange __mapupper_ext;
    void * __variable;
    int __variable_len;
    int __ncharclasses;
    _RuneCharClass * __charclasses;
} _RuneLocale;
extern _RuneLocale _DefaultRuneLocale;
extern _RuneLocale * _CurrentRuneLocale;
unsigned long ___runetype (__darwin_ct_rune_t);
__darwin_ct_rune_t ___tolower (__darwin_ct_rune_t);
__darwin_ct_rune_t ___toupper (__darwin_ct_rune_t);

static __inline int isascii (int _c) {
    return ((_c & ~0x7F) == 0);
}

int __maskrune (__darwin_ct_rune_t, unsigned long);

static __inline int __istype (__darwin_ct_rune_t _c, unsigned long _f) {
    return (isascii (_c) ? !!(_DefaultRuneLocale.__runetype[_c]&_f) : !!__maskrune(_c,_f));
}

static __inline __darwin_ct_rune_t __isctype (__darwin_ct_rune_t _c, unsigned long _f) {
    return (_c < 0 || _c >= (1 << 8)) ? 0 : !!(_DefaultRuneLocale.__runetype[_c]&_f);
}

__darwin_ct_rune_t __toupper (__darwin_ct_rune_t);
__darwin_ct_rune_t __tolower (__darwin_ct_rune_t);

static __inline int __wcwidth (__darwin_ct_rune_t _c) {
    unsigned int _x;
    if (_c == 0) return (0);
    _x = (unsigned int) __maskrune (_c, 0xe0000000L | 0x00040000L);
    if ((_x & 0xe0000000L) != 0) return ((_x & 0xe0000000L) >> 30);
    return ((_x & 0x00040000L) != 0 ? 1 : -1);
}

static __inline int isalnum (int _c) {
    return (__istype (_c, 0x00000100L | 0x00000400L));
}

static __inline int isalpha (int _c) {
    return (__istype (_c, 0x00000100L));
}

static __inline int isblank (int _c) {
    return (__istype (_c, 0x00020000L));
}

static __inline int iscntrl (int _c) {
    return (__istype (_c, 0x00000200L));
}

static __inline int isdigit (int _c) {
    return (__isctype (_c, 0x00000400L));
}

static __inline int isgraph (int _c) {
    return (__istype (_c, 0x00000800L));
}

static __inline int islower (int _c) {
    return (__istype (_c, 0x00001000L));
}

static __inline int isprint (int _c) {
    return (__istype (_c, 0x00040000L));
}

static __inline int ispunct (int _c) {
    return (__istype (_c, 0x00002000L));
}

static __inline int isspace (int _c) {
    return (__istype (_c, 0x00004000L));
}

static __inline int isupper (int _c) {
    return (__istype (_c, 0x00008000L));
}

static __inline int isxdigit (int _c) {
    return (__isctype (_c, 0x00010000L));
}

static __inline int toascii (int _c) {
    return (_c & 0x7F);
}

static __inline int tolower (int _c) {
    return (__tolower (_c));
}

static __inline int toupper (int _c) {
    return (__toupper (_c));
}

static __inline int digittoint (int _c) {
    return (__maskrune (_c, 0x0F));
}

static __inline int ishexnumber (int _c) {
    return (__istype (_c, 0x00010000L));
}

static __inline int isideogram (int _c) {
    return (__istype (_c, 0x00080000L));
}

static __inline int isnumber (int _c) {
    return (__istype (_c, 0x00000400L));
}

static __inline int isphonogram (int _c) {
    return (__istype (_c, 0x00200000L));
}

static __inline int isrune (int _c) {
    return (__istype (_c, 0xFFFFFFF0L));
}

static __inline int isspecial (int _c) {
    return (__istype (_c, 0x00100000L));
}

enum key_extra {KE_NAME = 3, KE_S_UP, KE_S_DOWN, KE_S_F1, KE_S_F2, KE_S_F3, KE_S_F4, KE_S_F5, KE_S_F6, KE_S_F7, KE_S_F8, KE_S_F9, KE_S_F10, KE_S_F11, KE_S_F12,
  KE_S_F13, KE_S_F14, KE_S_F15, KE_S_F16, KE_S_F17, KE_S_F18, KE_S_F19, KE_S_F20, KE_S_F21, KE_S_F22, KE_S_F23, KE_S_F24, KE_S_F25, KE_S_F26, KE_S_F27, KE_S_F28
  , KE_S_F29, KE_S_F30, KE_S_F31, KE_S_F32, KE_S_F33, KE_S_F34, KE_S_F35, KE_S_F36, KE_S_F37, KE_MOUSE, KE_LEFTMOUSE, KE_LEFTDRAG, KE_LEFTRELEASE,
  KE_MIDDLEMOUSE, KE_MIDDLEDRAG, KE_MIDDLERELEASE, KE_RIGHTMOUSE, KE_RIGHTDRAG, KE_RIGHTRELEASE, KE_IGNORE, KE_TAB, KE_S_TAB_OLD, KE_SNIFF, KE_XF1, KE_XF2,
  KE_XF3, KE_XF4, KE_XEND, KE_ZEND, KE_XHOME, KE_ZHOME, KE_XUP, KE_XDOWN, KE_XLEFT, KE_XRIGHT, KE_LEFTMOUSE_NM, KE_LEFTRELEASE_NM, KE_S_XF1, KE_S_XF2, KE_S_XF3
  , KE_S_XF4, KE_MOUSEDOWN, KE_MOUSEUP, KE_MOUSELEFT, KE_MOUSERIGHT, KE_KINS, KE_KDEL, KE_CSI, KE_SNR, KE_PLUG, KE_CMDWIN, KE_C_LEFT, KE_C_RIGHT, KE_C_HOME,
  KE_C_END, KE_X1MOUSE, KE_X1DRAG, KE_X1RELEASE, KE_X2MOUSE, KE_X2DRAG, KE_X2RELEASE, KE_DROP, KE_CURSORHOLD, KE_NOP, KE_FOCUSGAINED, KE_FOCUSLOST};
enum SpecialKey {KS_NAME = 0, KS_CE, KS_AL, KS_CAL, KS_DL, KS_CDL, KS_CS, KS_CL, KS_CD, KS_UT, KS_DA, KS_DB, KS_VI, KS_VE, KS_VS, KS_ME, KS_MR, KS_MD, KS_SE,
  KS_SO, KS_CZH, KS_CZR, KS_UE, KS_US, KS_UCE, KS_UCS, KS_MS, KS_CM, KS_SR, KS_CRI, KS_VB, KS_KS, KS_KE, KS_TI, KS_TE, KS_BC, KS_CCS, KS_CCO, KS_CSF, KS_CSB,
  KS_XS, KS_MB, KS_CAF, KS_CAB, KS_LE, KS_ND, KS_CIS, KS_CIE, KS_TS, KS_FS, KS_CWP, KS_CWS, KS_CRV, KS_CSI, KS_CEI, KS_CSV, KS_OP};
extern char_u * (term_strings []);
void __assert_rtn (const char *, const char *, int, const char *) __attribute__ ((__noreturn__));
void __eprintf (const char *, const char *, unsigned, const char *) __attribute__ ((__noreturn__));
enum auto_event {EVENT_BUFADD = 0, EVENT_BUFNEW, EVENT_BUFDELETE, EVENT_BUFWIPEOUT, EVENT_BUFENTER, EVENT_BUFFILEPOST, EVENT_BUFFILEPRE, EVENT_BUFLEAVE,
  EVENT_BUFNEWFILE, EVENT_BUFREADPOST, EVENT_BUFREADPRE, EVENT_BUFREADCMD, EVENT_BUFUNLOAD, EVENT_BUFHIDDEN, EVENT_BUFWINENTER, EVENT_BUFWINLEAVE,
  EVENT_BUFWRITEPOST, EVENT_BUFWRITEPRE, EVENT_BUFWRITECMD, EVENT_CMDWINENTER, EVENT_CMDWINLEAVE, EVENT_COLORSCHEME, EVENT_FILEAPPENDPOST, EVENT_FILEAPPENDPRE,
  EVENT_FILEAPPENDCMD, EVENT_FILECHANGEDSHELL, EVENT_FILECHANGEDSHELLPOST, EVENT_FILECHANGEDRO, EVENT_FILEREADPOST, EVENT_FILEREADPRE, EVENT_FILEREADCMD,
  EVENT_FILETYPE, EVENT_FILEWRITEPOST, EVENT_FILEWRITEPRE, EVENT_FILEWRITECMD, EVENT_FILTERREADPOST, EVENT_FILTERREADPRE, EVENT_FILTERWRITEPOST,
  EVENT_FILTERWRITEPRE, EVENT_FOCUSGAINED, EVENT_FOCUSLOST, EVENT_GUIENTER, EVENT_GUIFAILED, EVENT_INSERTCHANGE, EVENT_INSERTENTER, EVENT_INSERTLEAVE,
  EVENT_MENUPOPUP, EVENT_QUICKFIXCMDPOST, EVENT_QUICKFIXCMDPRE, EVENT_SESSIONLOADPOST, EVENT_STDINREADPOST, EVENT_STDINREADPRE, EVENT_SYNTAX, EVENT_TERMCHANGED
  , EVENT_TERMRESPONSE, EVENT_USER, EVENT_VIMENTER, EVENT_VIMLEAVE, EVENT_VIMLEAVEPRE, EVENT_VIMRESIZED, EVENT_WINENTER, EVENT_WINLEAVE, EVENT_ENCODINGCHANGED,
  EVENT_CURSORHOLD, EVENT_CURSORHOLDI, EVENT_FUNCUNDEFINED, EVENT_REMOTEREPLY, EVENT_SWAPEXISTS, EVENT_SOURCEPRE, EVENT_SOURCECMD, EVENT_SPELLFILEMISSING,
  EVENT_CURSORMOVED, EVENT_CURSORMOVEDI, EVENT_TABLEAVE, EVENT_TABENTER, EVENT_SHELLCMDPOST, EVENT_SHELLFILTERPOST, NUM_EVENTS};
typedef enum auto_event event_T;
typedef enum {HLF_8 = 0, HLF_AT, HLF_D, HLF_E, HLF_H, HLF_I, HLF_L, HLF_M, HLF_CM, HLF_N, HLF_R, HLF_S, HLF_SNC, HLF_C, HLF_T, HLF_V, HLF_VNC, HLF_W, HLF_WM,
  HLF_FL, HLF_FC, HLF_ADD, HLF_CHD, HLF_DED, HLF_TXD, HLF_CONCEAL, HLF_SC, HLF_SPB, HLF_SPC, HLF_SPR, HLF_SPL, HLF_PNI, HLF_PSI, HLF_PSB, HLF_PST, HLF_TP,
  HLF_TPS, HLF_TPF, HLF_CUC, HLF_CUL, HLF_MC, HLF_COUNT} hlf_T;
typedef unsigned int UINT32_T;
typedef long linenr_T;
typedef int colnr_T;
typedef unsigned short disptick_T;
typedef void * vim_acl_T;
void * vim_memset (void *, int, size_t);
int vim_memcmp (void *, void *, size_t);
typedef int proftime_T;
extern int p_ar;
extern int p_aw;
extern int p_awa;
extern char_u * p_bs;
extern char_u * p_bg;
extern int p_bk;
extern char_u * p_bkc;
extern unsigned bkc_flags;
extern char_u * p_bdir;
extern char_u * p_bex;
extern char_u * p_bsk;
extern char_u * p_cm;
extern char_u * p_breakat;
extern char_u * p_cedit;
extern long p_cwh;
extern long p_ch;
extern int p_confirm;
extern int p_cp;
extern char_u * p_cot;
extern long p_ph;
extern char_u * p_cpo;
extern char_u * p_debug;
extern char_u * p_def;
extern char_u * p_inc;
extern char_u * p_dip;
extern char_u * p_dex;
extern char_u * p_dict;
extern int p_dg;
extern char_u * p_dir;
extern char_u * p_dy;
extern unsigned dy_flags;
extern int p_ed;
extern char_u * p_ead;
extern int p_ea;
extern char_u * p_ep;
extern int p_eb;
extern char_u * p_ef;
extern char_u * p_efm;
extern char_u * p_gefm;
extern char_u * p_gp;
extern char_u * p_ei;
extern int p_ek;
extern int p_exrc;
extern char_u * p_ffs;
extern char_u * p_fcl;
extern long p_fdls;
extern char_u * p_fdo;
extern unsigned fdo_flags;
extern char_u * p_fp;
extern int p_gd;
extern char_u * p_pdev;
extern char_u * p_penc;
extern char_u * p_pexpr;
extern char_u * p_pfn;
extern char_u * p_popt;
extern char_u * p_header;
extern int p_prompt;
extern char_u * p_hf;
extern long p_hh;
extern char_u * p_hlg;
extern int p_hid;
extern char_u * p_hl;
extern int p_hls;
extern long p_hi;
extern int p_icon;
extern char_u * p_iconstring;
extern int p_ic;
extern int p_is;
extern int p_im;
extern char_u * p_isf;
extern char_u * p_isi;
extern char_u * p_isp;
extern int p_js;
extern char_u * p_kp;
extern char_u * p_km;
extern char_u * p_lm;
extern char_u * p_lispwords;
extern long p_ls;
extern long p_stal;
extern char_u * p_lcs;
extern int p_lz;
extern int p_lpl;
extern int p_magic;
extern char_u * p_mef;
extern char_u * p_mp;
extern char_u * p_cc;
extern int p_cc_cols [256];
extern long p_mat;
extern long p_mfd;
extern long p_mmd;
extern long p_mm;
extern long p_mmp;
extern long p_mmt;
extern long p_mis;
extern char_u * p_msm;
extern long p_mls;
extern char_u * p_mouse;
extern char_u * p_mousem;
extern long p_mouset;
extern int p_more;
extern char_u * p_opfunc;
extern char_u * p_para;
extern int p_paste;
extern char_u * p_pt;
extern char_u * p_pex;
extern char_u * p_pm;
extern char_u * p_path;
extern char_u * p_cdpath;
extern int p_remap;
extern long p_report;
extern long p_pvh;
extern int p_ru;
extern char_u * p_ruf;
extern char_u * p_rtp;
extern long p_sj;
extern long p_so;
extern char_u * p_sbo;
extern char_u * p_sections;
extern int p_secure;
extern char_u * p_sel;
extern char_u * p_slm;
extern char_u * p_ssop;
extern unsigned ssop_flags;
extern char_u * p_sh;
extern char_u * p_shcf;
extern char_u * p_sp;
extern char_u * p_shq;
extern char_u * p_sxq;
extern char_u * p_srr;
extern int p_stmp;
extern char_u * p_stl;
extern int p_sr;
extern char_u * p_shm;
extern char_u * p_sbr;
extern int p_sc;
extern int p_sft;
extern int p_sm;
extern int p_smd;
extern long p_ss;
extern long p_siso;
extern int p_scs;
extern int p_sta;
extern int p_sb;
extern long p_tpm;
extern char_u * p_tal;
extern char_u * p_sps;
extern int p_spr;
extern int p_sol;
extern char_u * p_su;
extern char_u * p_sws;
extern char_u * p_swb;
extern unsigned swb_flags;
extern int p_tbs;
extern long p_tl;
extern int p_tr;
extern char_u * p_tags;
extern int p_tgst;
extern int p_terse;
extern int p_ta;
extern int p_to;
extern int p_timeout;
extern long p_tm;
extern int p_title;
extern long p_titlelen;
extern char_u * p_titleold;
extern char_u * p_titlestring;
extern char_u * p_tsr;
extern int p_ttimeout;
extern long p_ttm;
extern int p_tbi;
extern int p_tf;
extern long p_ttyscroll;
extern char_u * p_udir;
extern long p_ul;
extern long p_ur;
extern long p_uc;
extern long p_ut;
extern char_u * p_fcs;
extern char_u * p_viminfo;
extern char_u * p_vdir;
extern char_u * p_vop;
extern unsigned vop_flags;
extern int p_vb;
extern char_u * p_ve;
extern unsigned ve_flags;
extern long p_verbose;
extern char_u * p_vfile;
extern int p_warn;
extern char_u * p_wop;
extern long p_window;
extern char_u * p_wig;
extern int p_wiv;
extern char_u * p_ww;
extern long p_wc;
extern long p_wcm;
extern char_u * p_wim;
extern int p_wmnu;
extern long p_wh;
extern long p_wmh;
extern long p_wmw;
extern long p_wiw;
extern int p_ws;
extern int p_write;
extern int p_wa;
extern int p_wb;
extern long p_wd;
enum {BV_AI = 0, BV_AR, BV_BH, BV_BT, BV_EFM, BV_GP, BV_MP, BV_BIN, BV_BL, BV_CI, BV_CIN, BV_CINK, BV_CINO, BV_CINW, BV_CM, BV_CMS, BV_COM, BV_CPT, BV_DICT,
  BV_TSR, BV_CFU, BV_DEF, BV_INC, BV_EOL, BV_EP, BV_ET, BV_FENC, BV_BEXPR, BV_FEX, BV_FF, BV_FLP, BV_FO, BV_FT, BV_IMI, BV_IMS, BV_INDE, BV_INDK, BV_INEX,
  BV_INF, BV_ISK, BV_KEY, BV_KP, BV_LISP, BV_MA, BV_ML, BV_MOD, BV_MPS, BV_NF, BV_OFU, BV_PATH, BV_PI, BV_QE, BV_RO, BV_SI, BV_SN, BV_SMC, BV_SYN, BV_SPC,
  BV_SPF, BV_SPL, BV_STS, BV_SUA, BV_SW, BV_SWF, BV_TAGS, BV_TS, BV_TW, BV_TX, BV_UDF, BV_WM, BV_COUNT};
enum {WV_LIST = 0, WV_CRBIND, WV_DIFF, WV_FDC, WV_FEN, WV_FDI, WV_FDL, WV_FDM, WV_FML, WV_FDN, WV_FDE, WV_FDT, WV_FMR, WV_LBR, WV_NU, WV_RNU, WV_NUW, WV_PVW,
  WV_SCBIND, WV_SCROLL, WV_SPELL, WV_CUC, WV_CUL, WV_CC, WV_STL, WV_WFH, WV_WFW, WV_WRAP, WV_COUNT};
typedef struct {
    linenr_T lnum;
    colnr_T col;
    colnr_T coladd;
} pos_T;
typedef struct {
    linenr_T lnum;
    colnr_T col;
} lpos_T;
typedef struct growarray {
    int ga_len;
    int ga_maxlen;
    int ga_itemsize;
    int ga_growsize;
    void * ga_data;
} garray_T;
typedef struct {
    int regstart;
    char_u reganch;
    char_u * regmust;
    int regmlen;
    unsigned regflags;
    char_u reghasz;
    char_u program [1];
} regprog_T;
typedef struct {
    regprog_T * regprog;
    char_u * startp [10];
    char_u * endp [10];
    int rm_ic;
} regmatch_T;
typedef struct {
    regprog_T * regprog;
    lpos_T startpos [10];
    lpos_T endpos [10];
    int rmm_ic;
    colnr_T rmm_maxcol;
} regmmatch_T;
typedef struct {
    short refcnt;
    char_u * matches [10];
} reg_extmatch_T;
typedef struct window_S win_T;
typedef struct wininfo_S wininfo_T;
typedef struct frame_S frame_T;
typedef int scid_T;
typedef struct filemark {
    pos_T mark;
    int fnum;
} fmark_T;
typedef struct xfilemark {
    fmark_T fmark;
    char_u * fname;
} xfmark_T;
typedef struct taggy {
    char_u * tagname;
    fmark_T fmark;
    int cur_match;
    int cur_fnum;
} taggy_T;
typedef struct {
    int wo_diff;
    long wo_fdc;
    int wo_fen;
    char_u * wo_fdi;
    long wo_fdl;
    char_u * wo_fdm;
    long wo_fml;
    long wo_fdn;
    char_u * wo_fde;
    char_u * wo_fdt;
    char_u * wo_fmr;
    int wo_lbr;
    int wo_list;
    int wo_nu;
    int wo_rnu;
    long wo_nuw;
    int wo_wfh;
    int wo_wfw;
    int wo_pvw;
    long wo_scr;
    int wo_spell;
    int wo_cuc;
    int wo_cul;
    char_u * wo_cc;
    char_u * wo_stl;
    int wo_scb;
    int wo_wrap;
    int wo_crb;
    int wo_scriptID [WV_COUNT];
} winopt_T;
struct wininfo_S {
    wininfo_T * wi_next;
    wininfo_T * wi_prev;
    win_T * wi_win;
    pos_T wi_fpos;
    int wi_optset;
    winopt_T wi_opt;
    int wi_fold_manual;
    garray_T wi_folds;
};
typedef struct foldinfo {
    int fi_level;
    int fi_lnum;
    int fi_low_level;
} foldinfo_T;
typedef struct {
    pos_T vi_start;
    pos_T vi_end;
    int vi_mode;
    colnr_T vi_curswant;
} visualinfo_T;
typedef struct u_entry u_entry_T;
typedef struct u_header u_header_T;
struct u_entry {
    u_entry_T * ue_next;
    linenr_T ue_top;
    linenr_T ue_bot;
    linenr_T ue_lcount;
    char_u * * ue_array;
    long ue_size;
};
struct u_header {
    union {
        u_header_T * ptr;
        long seq;
    } uh_next;
    union {
        u_header_T * ptr;
        long seq;
    } uh_prev;
    union {
        u_header_T * ptr;
        long seq;
    } uh_alt_next;
    union {
        u_header_T * ptr;
        long seq;
    } uh_alt_prev;
    long uh_seq;
    int uh_walk;
    u_entry_T * uh_entry;
    u_entry_T * uh_getbot_entry;
    pos_T uh_cursor;
    long uh_cursor_vcol;
    int uh_flags;
    pos_T uh_namedm [('z' - 'a' + 1)];
    visualinfo_T uh_visual;
    time_t uh_time;
    long uh_save_nr;
};
typedef struct m_info minfo_T;
struct m_info {
    short_u m_size;
    minfo_T * m_next;
};
typedef struct block_hdr bhdr_T;
typedef struct memfile memfile_T;
typedef long blocknr_T;
struct block_hdr {
    bhdr_T * bh_next;
    bhdr_T * bh_prev;
    bhdr_T * bh_hash_next;
    bhdr_T * bh_hash_prev;
    blocknr_T bh_bnum;
    char_u * bh_data;
    int bh_page_count;
    char bh_flags;
};
typedef struct nr_trans NR_TRANS;
struct nr_trans {
    NR_TRANS * nt_next;
    NR_TRANS * nt_prev;
    blocknr_T nt_old_bnum;
    blocknr_T nt_new_bnum;
};
struct buffblock {
    struct buffblock * b_next;
    char_u b_str [1];
};
struct buffheader {
    struct buffblock bh_first;
    struct buffblock * bh_curr;
    int bh_index;
    int bh_space;
};
typedef struct expand {
    int xp_context;
    char_u * xp_pattern;
    int xp_pattern_len;
    char_u * xp_arg;
    int xp_scriptID;
    int xp_backslash;
    int xp_shell;
    int xp_numfiles;
    char_u * * xp_files;
} expand_T;
typedef struct {
    int hide;
    int browse;
    int split;
    int tab;
    int confirm;
    int keepalt;
    int keepmarks;
    int keepjumps;
    int lockmarks;
    char_u * save_ei;
} cmdmod_T;
typedef struct file_buffer buf_T;
struct memfile {
    char_u * mf_fname;
    char_u * mf_ffname;
    int mf_fd;
    bhdr_T * mf_free_first;
    bhdr_T * mf_used_first;
    bhdr_T * mf_used_last;
    unsigned mf_used_count;
    unsigned mf_used_count_max;
    bhdr_T * mf_hash [64];
    NR_TRANS * mf_trans [64];
    blocknr_T mf_blocknr_max;
    blocknr_T mf_blocknr_min;
    blocknr_T mf_neg_count;
    blocknr_T mf_infile_count;
    unsigned mf_page_size;
    int mf_dirty;
    buf_T * mf_buffer;
    char_u mf_seed [8];
    char_u * mf_old_key;
    int mf_old_cm;
    char_u mf_old_seed [8];
};
typedef struct info_pointer {
    blocknr_T ip_bnum;
    linenr_T ip_low;
    linenr_T ip_high;
    int ip_index;
} infoptr_T;
typedef struct ml_chunksize {
    int mlcs_numlines;
    long mlcs_totalsize;
} chunksize_T;
typedef struct memline {
    linenr_T ml_line_count;
    memfile_T * ml_mfp;
    int ml_flags;
    infoptr_T * ml_stack;
    int ml_stack_top;
    int ml_stack_size;
    linenr_T ml_line_lnum;
    char_u * ml_line_ptr;
    bhdr_T * ml_locked;
    linenr_T ml_locked_low;
    linenr_T ml_locked_high;
    int ml_locked_lineadd;
    chunksize_T * ml_chunksize;
    int ml_numchunks;
    int ml_usedchunks;
} memline_T;
typedef struct arglist {
    garray_T al_ga;
    int al_refcount;
} alist_T;
typedef struct argentry {
    char_u * ae_fname;
    int ae_fnum;
} aentry_T;
typedef struct eslist_elem eslist_T;
struct eslist_elem {
    int saved_emsg_silent;
    eslist_T * next;
};
struct condstack {
    short cs_flags [50];
    char cs_pending [50];
    union {
        void * csp_rv [50];
        void * csp_ex [50];
    } cs_pend;
    void * cs_forinfo [50];
    int cs_line [50];
    int cs_idx;
    int cs_looplevel;
    int cs_trylevel;
    eslist_T * cs_emsg_silent_list;
    char cs_lflags;
};
struct msglist {
    char_u * msg;
    char_u * throw_msg;
    struct msglist * next;
};
typedef struct vim_exception except_T;
struct vim_exception {
    int type;
    char_u * value;
    struct msglist * messages;
    char_u * throw_name;
    linenr_T throw_lnum;
    except_T * caught;
};
typedef struct cleanup_stuff cleanup_T;
struct cleanup_stuff {
    int pending;
    except_T * exception;
};
struct sp_syn {
    int inc_tag;
    short id;
    short * cont_in_list;
};
typedef struct keyentry keyentry_T;
struct keyentry {
    keyentry_T * ke_next;
    struct sp_syn k_syn;
    short * next_list;
    int flags;
    int k_char;
    char_u keyword [1];
};
typedef struct buf_state {
    int bs_idx;
    int bs_flags;
    reg_extmatch_T * bs_extmatch;
} bufstate_T;
typedef struct syn_state synstate_T;
struct syn_state {
    synstate_T * sst_next;
    linenr_T sst_lnum;
    union {
        bufstate_T sst_stack [7];
        garray_T sst_ga;
    } sst_union;
    int sst_next_flags;
    int sst_stacksize;
    short * sst_next_list;
    disptick_T sst_tick;
    linenr_T sst_change_lnum;
};
typedef struct attr_entry {
    short ae_attr;
    union {
        struct {
            char_u * start;
            char_u * stop;
        } term;
        struct {
            short_u fg_color;
            short_u bg_color;
        } cterm;
    } ae_u;
} attrentry_T;
typedef struct {
    char_u * tb_buf;
    char_u * tb_noremap;
    int tb_buflen;
    int tb_off;
    int tb_len;
    int tb_maplen;
    int tb_silent;
    int tb_no_abbr_cnt;
    int tb_change_cnt;
} typebuf_T;
typedef struct {
    typebuf_T save_typebuf;
    int typebuf_valid;
    int old_char;
    int old_mod_mask;
    struct buffheader save_stuffbuff;
} tasave_T;
typedef struct {
    int vc_type;
    int vc_factor;
    int vc_fail;
} vimconv_T;
typedef struct {
    char_u * vir_line;
    FILE * vir_fd;
} vir_T;
typedef struct mapblock mapblock_T;
struct mapblock {
    mapblock_T * m_next;
    char_u * m_keys;
    int m_keylen;
    char_u * m_str;
    int m_mode;
    int m_noremap;
    char m_silent;
    char m_expr;
    scid_T m_script_ID;
};
struct stl_hlrec {
    char_u * start;
    int userhl;
};
typedef struct hashitem_S {
    long_u hi_hash;
    char_u * hi_key;
} hashitem_T;
typedef struct hashtable_S {
    long_u ht_mask;
    long_u ht_used;
    long_u ht_filled;
    int ht_locked;
    int ht_error;
    hashitem_T * ht_array;
    hashitem_T ht_smallarray [16];
} hashtab_T;
typedef long_u hash_T;
typedef long varnumber_T;
typedef double float_T;
typedef struct listvar_S list_T;
typedef struct dictvar_S dict_T;
typedef struct {
    char v_type;
    char v_lock;
    union {
        varnumber_T v_number;
        char_u * v_string;
        list_T * v_list;
        dict_T * v_dict;
    } vval;
} typval_T;
typedef struct listitem_S listitem_T;
struct listitem_S {
    listitem_T * li_next;
    listitem_T * li_prev;
    typval_T li_tv;
};
typedef struct listwatch_S listwatch_T;
struct listwatch_S {
    listitem_T * lw_item;
    listwatch_T * lw_next;
};
struct listvar_S {
    listitem_T * lv_first;
    listitem_T * lv_last;
    int lv_refcount;
    int lv_len;
    listwatch_T * lv_watch;
    int lv_idx;
    listitem_T * lv_idx_item;
    int lv_copyID;
    list_T * lv_copylist;
    char lv_lock;
    list_T * lv_used_next;
    list_T * lv_used_prev;
};
struct dictitem_S {
    typval_T di_tv;
    char_u di_flags;
    char_u di_key [1];
};
typedef struct dictitem_S dictitem_T;
struct dictvar_S {
    int dv_refcount;
    hashtab_T dv_hashtab;
    int dv_copyID;
    dict_T * dv_copydict;
    char dv_lock;
    dict_T * dv_used_next;
    dict_T * dv_used_prev;
};
typedef struct qf_info_S qf_info_T;
typedef struct {
    hashtab_T b_keywtab;
    hashtab_T b_keywtab_ic;
    int b_syn_error;
    int b_syn_ic;
    int b_syn_spell;
    garray_T b_syn_patterns;
    garray_T b_syn_clusters;
    int b_spell_cluster_id;
    int b_nospell_cluster_id;
    int b_syn_containedin;
    int b_syn_sync_flags;
    short b_syn_sync_id;
    long b_syn_sync_minlines;
    long b_syn_sync_maxlines;
    long b_syn_sync_linebreaks;
    char_u * b_syn_linecont_pat;
    regprog_T * b_syn_linecont_prog;
    int b_syn_linecont_ic;
    int b_syn_topgrp;
    int b_syn_folditems;
    synstate_T * b_sst_array;
    int b_sst_len;
    synstate_T * b_sst_first;
    synstate_T * b_sst_firstfree;
    int b_sst_freecount;
    linenr_T b_sst_check_lnum;
    short_u b_sst_lasttick;
    garray_T b_langp;
    char_u b_spell_ismw [256];
    char_u * b_p_spc;
    regprog_T * b_cap_prog;
    char_u * b_p_spf;
    char_u * b_p_spl;
} synblock_T;
struct file_buffer {
    memline_T b_ml;
    buf_T * b_next;
    buf_T * b_prev;
    int b_nwindows;
    int b_flags;
    char_u * b_ffname;
    char_u * b_sfname;
    char_u * b_fname;
    int b_fnum;
    int b_changed;
    int b_changedtick;
    int b_saving;
    int b_mod_set;
    linenr_T b_mod_top;
    linenr_T b_mod_bot;
    long b_mod_xlines;
    wininfo_T * b_wininfo;
    long b_mtime;
    long b_mtime_read;
    off_t b_orig_size;
    int b_orig_mode;
    pos_T b_namedm [('z' - 'a' + 1)];
    visualinfo_T b_visual;
    int b_visual_mode_eval;
    pos_T b_last_cursor;
    pos_T b_last_insert;
    pos_T b_last_change;
    pos_T b_changelist [100];
    int b_changelistlen;
    int b_new_change;
    char_u b_chartab [32];
    mapblock_T * (b_maphash [256]);
    mapblock_T * b_first_abbr;
    garray_T b_ucmds;
    pos_T b_op_start;
    pos_T b_op_end;
    int b_marks_read;
    u_header_T * b_u_oldhead;
    u_header_T * b_u_newhead;
    u_header_T * b_u_curhead;
    int b_u_numhead;
    int b_u_synced;
    long b_u_seq_last;
    long b_u_save_nr_last;
    long b_u_seq_cur;
    time_t b_u_time_cur;
    long b_u_save_nr_cur;
    char_u * b_u_line_ptr;
    linenr_T b_u_line_lnum;
    colnr_T b_u_line_colnr;
    int b_scanned;
    long b_p_iminsert;
    long b_p_imsearch;
    int b_p_initialized;
    int b_p_scriptID [BV_COUNT];
    int b_p_ai;
    int b_p_ai_nopaste;
    int b_p_ci;
    int b_p_bin;
    char_u * b_p_bh;
    char_u * b_p_bt;
    int b_p_bl;
    int b_p_cin;
    char_u * b_p_cino;
    char_u * b_p_cink;
    char_u * b_p_cinw;
    char_u * b_p_com;
    char_u * b_p_cms;
    char_u * b_p_cpt;
    char_u * b_p_cfu;
    char_u * b_p_ofu;
    int b_p_eol;
    int b_p_et;
    int b_p_et_nobin;
    char_u * b_p_ff;
    char_u * b_p_ft;
    char_u * b_p_fo;
    char_u * b_p_flp;
    int b_p_inf;
    char_u * b_p_isk;
    char_u * b_p_def;
    char_u * b_p_inc;
    char_u * b_p_inex;
    long_u b_p_inex_flags;
    char_u * b_p_inde;
    long_u b_p_inde_flags;
    char_u * b_p_indk;
    char_u * b_p_fex;
    long_u b_p_fex_flags;
    char_u * b_p_key;
    char_u * b_p_kp;
    int b_p_lisp;
    char_u * b_p_mps;
    int b_p_ml;
    int b_p_ml_nobin;
    int b_p_ma;
    char_u * b_p_nf;
    int b_p_pi;
    char_u * b_p_qe;
    int b_p_ro;
    long b_p_sw;
    int b_p_sn;
    int b_p_si;
    long b_p_sts;
    long b_p_sts_nopaste;
    char_u * b_p_sua;
    int b_p_swf;
    long b_p_smc;
    char_u * b_p_syn;
    long b_p_ts;
    int b_p_tx;
    long b_p_tw;
    long b_p_tw_nobin;
    long b_p_tw_nopaste;
    long b_p_wm;
    long b_p_wm_nobin;
    long b_p_wm_nopaste;
    char_u * b_p_gp;
    char_u * b_p_mp;
    char_u * b_p_efm;
    char_u * b_p_ep;
    char_u * b_p_path;
    int b_p_ar;
    char_u * b_p_tags;
    char_u * b_p_dict;
    char_u * b_p_tsr;
    int b_p_udf;
    int b_start_eol;
    int b_start_ffc;
    dictitem_T b_bufvar;
    dict_T b_vars;
    char_u * b_p_cm;
    int b_may_swap;
    int b_did_warn;
    int b_help;
    int b_spell;
    int b_shortname;
    synblock_T b_s;
};
typedef struct diffblock_S diff_T;
struct diffblock_S {
    diff_T * df_next;
    linenr_T df_lnum [4];
    linenr_T df_count [4];
};
typedef struct tabpage_S tabpage_T;
struct tabpage_S {
    tabpage_T * tp_next;
    frame_T * tp_topframe;
    win_T * tp_curwin;
    win_T * tp_prevwin;
    win_T * tp_firstwin;
    win_T * tp_lastwin;
    long tp_old_Rows;
    long tp_old_Columns;
    long tp_ch_used;
    diff_T * tp_first_diff;
    buf_T * (tp_diffbuf [4]);
    int tp_diff_invalid;
    frame_T * (tp_snapshot [2]);
    dictitem_T tp_winvar;
    dict_T tp_vars;
};
typedef struct w_line {
    linenr_T wl_lnum;
    short_u wl_size;
    char wl_valid;
    char wl_folded;
    linenr_T wl_lastlnum;
} wline_T;
struct frame_S {
    char fr_layout;
    int fr_width;
    int fr_newwidth;
    int fr_height;
    int fr_newheight;
    frame_T * fr_parent;
    frame_T * fr_next;
    frame_T * fr_prev;
    frame_T * fr_child;
    win_T * fr_win;
};
typedef struct {
    regmmatch_T rm;
    buf_T * buf;
    linenr_T lnum;
    int attr;
    int attr_cur;
    linenr_T first_lnum;
    colnr_T startcol;
    colnr_T endcol;
} match_T;
typedef struct matchitem matchitem_T;
struct matchitem {
    matchitem_T * next;
    int id;
    int priority;
    char_u * pattern;
    int hlg_id;
    regmmatch_T match;
    match_T hl;
};
struct window_S {
    buf_T * w_buffer;
    synblock_T * w_s;
    win_T * w_prev;
    win_T * w_next;
    frame_T * w_frame;
    pos_T w_cursor;
    colnr_T w_curswant;
    int w_set_curswant;
    char w_old_visual_mode;
    linenr_T w_old_cursor_lnum;
    colnr_T w_old_cursor_fcol;
    colnr_T w_old_cursor_lcol;
    linenr_T w_old_visual_lnum;
    colnr_T w_old_visual_col;
    colnr_T w_old_curswant;
    linenr_T w_topline;
    char w_topline_was_set;
    int w_topfill;
    int w_old_topfill;
    int w_botfill;
    int w_old_botfill;
    colnr_T w_leftcol;
    colnr_T w_skipcol;
    int w_winrow;
    int w_height;
    int w_status_height;
    int w_wincol;
    int w_width;
    int w_vsep_width;
    int w_valid;
    pos_T w_valid_cursor;
    colnr_T w_valid_leftcol;
    int w_cline_height;
    int w_cline_folded;
    int w_cline_row;
    colnr_T w_virtcol;
    int w_wrow, w_wcol;
    linenr_T w_botline;
    int w_empty_rows;
    int w_filler_rows;
    int w_lines_valid;
    wline_T * w_lines;
    garray_T w_folds;
    char w_fold_manual;
    char w_foldinvalid;
    int w_nrwidth;
    int w_redr_type;
    int w_upd_rows;
    linenr_T w_redraw_top;
    linenr_T w_redraw_bot;
    int w_redr_status;
    pos_T w_ru_cursor;
    colnr_T w_ru_virtcol;
    linenr_T w_ru_topline;
    linenr_T w_ru_line_count;
    int w_ru_topfill;
    char w_ru_empty;
    int w_alt_fnum;
    alist_T * w_alist;
    int w_arg_idx;
    int w_arg_idx_invalid;
    char_u * w_localdir;
    winopt_T w_onebuf_opt;
    winopt_T w_allbuf_opt;
    long_u w_p_stl_flags;
    long_u w_p_fde_flags;
    long_u w_p_fdt_flags;
    int * w_p_cc_cols;
    long w_scbind_pos;
    dictitem_T w_winvar;
    dict_T w_vars;
    pos_T w_pcmark;
    pos_T w_prev_pcmark;
    xfmark_T w_jumplist [100];
    int w_jumplistlen;
    int w_jumplistidx;
    int w_changelistidx;
    matchitem_T * w_match_head;
    int w_next_match_id;
    taggy_T w_tagstack [20];
    int w_tagstackidx;
    int w_tagstacklen;
    int w_fraction;
    int w_prev_fraction_row;
    linenr_T w_nrwidth_line_count;
    int w_nrwidth_width;
    qf_info_T * w_llist;
    qf_info_T * w_llist_ref;
};
typedef struct oparg_S {
    int op_type;
    int regname;
    int motion_type;
    int motion_force;
    int use_reg_one;
    int inclusive;
    int end_adjusted;
    pos_T start;
    pos_T end;
    pos_T cursor_start;
    long line_count;
    int empty;
    int is_VIsual;
    int block_mode;
    colnr_T start_vcol;
    colnr_T end_vcol;
    long prev_opcount;
    long prev_count0;
} oparg_T;
typedef struct cmdarg_S {
    oparg_T * oap;
    int prechar;
    int cmdchar;
    int nchar;
    int extra_char;
    long opcount;
    long count0;
    long count1;
    int arg;
    int retval;
    char_u * searchbuf;
} cmdarg_T;
typedef struct VimMenu vimmenu_T;
struct VimMenu {
    int modes;
    int enabled;
    char_u * name;
    char_u * dname;
    char_u * en_name;
    char_u * en_dname;
    int mnemonic;
    char_u * actext;
    int priority;
    char_u * strings [7];
    int noremap [7];
    char silent [7];
    vimmenu_T * children;
    vimmenu_T * parent;
    vimmenu_T * next;
};
typedef struct {
    buf_T * save_curbuf;
    int use_aucmd_win;
    win_T * save_curwin;
    win_T * new_curwin;
    buf_T * new_curbuf;
    char_u * globaldir;
} aco_save_T;
typedef struct {
    const char * name;
    int hasnum;
    long number;
    char_u * string;
    int strlen;
    int present;
} option_table_T;
typedef struct {
    long_u fg_color;
    long_u bg_color;
    int bold;
    int italic;
    int underline;
    int undercurl;
} prt_text_attr_T;
typedef struct {
    int n_collated_copies;
    int n_uncollated_copies;
    int duplex;
    int chars_per_line;
    int lines_per_page;
    int has_color;
    prt_text_attr_T number;
    int modec;
    int do_syntax;
    int user_abort;
    char_u * jobname;
    char_u * outfile;
    char_u * arguments;
} prt_settings_T;
typedef struct {
    char_u * pum_text;
    char_u * pum_kind;
    char_u * pum_extra;
    char_u * pum_info;
} pumitem_T;
typedef struct {
    char_u * tn_tags;
    char_u * tn_np;
    int tn_did_filefind_init;
    int tn_hf_idx;
    void * tn_search_ctx;
} tagname_T;
typedef struct {
    UINT32_T total [2];
    UINT32_T state [8];
    char_u buffer [64];
} context_sha256_T;
typedef int VimClipboard;
typedef struct exarg exarg_T;
enum CMD_index {CMD_append, CMD_abbreviate, CMD_abclear, CMD_aboveleft, CMD_all, CMD_amenu, CMD_anoremenu, CMD_args, CMD_argadd, CMD_argdelete, CMD_argdo,
  CMD_argedit, CMD_argglobal, CMD_arglocal, CMD_argument, CMD_ascii, CMD_autocmd, CMD_augroup, CMD_aunmenu, CMD_buffer, CMD_bNext, CMD_ball, CMD_badd,
  CMD_bdelete, CMD_behave, CMD_belowright, CMD_bfirst, CMD_blast, CMD_bmodified, CMD_bnext, CMD_botright, CMD_bprevious, CMD_brewind, CMD_break, CMD_breakadd,
  CMD_breakdel, CMD_breaklist, CMD_browse, CMD_buffers, CMD_bufdo, CMD_bunload, CMD_bwipeout, CMD_change, CMD_cNext, CMD_cNfile, CMD_cabbrev, CMD_cabclear,
  CMD_caddbuffer, CMD_caddexpr, CMD_caddfile, CMD_call, CMD_catch, CMD_cbuffer, CMD_cc, CMD_cclose, CMD_cd, CMD_center, CMD_cexpr, CMD_cfile, CMD_cfirst,
  CMD_cgetfile, CMD_cgetbuffer, CMD_cgetexpr, CMD_chdir, CMD_changes, CMD_checkpath, CMD_checktime, CMD_clist, CMD_clast, CMD_close, CMD_cmap, CMD_cmapclear,
  CMD_cmenu, CMD_cnext, CMD_cnewer, CMD_cnfile, CMD_cnoremap, CMD_cnoreabbrev, CMD_cnoremenu, CMD_copy, CMD_colder, CMD_colorscheme, CMD_command, CMD_comclear,
  CMD_compiler, CMD_continue, CMD_confirm, CMD_copen, CMD_cprevious, CMD_cpfile, CMD_cquit, CMD_crewind, CMD_cscope, CMD_cstag, CMD_cunmap, CMD_cunabbrev,
  CMD_cunmenu, CMD_cwindow, CMD_delete, CMD_delmarks, CMD_debug, CMD_debuggreedy, CMD_delcommand, CMD_delfunction, CMD_display, CMD_diffupdate, CMD_diffget,
  CMD_diffoff, CMD_diffpatch, CMD_diffput, CMD_diffsplit, CMD_diffthis, CMD_digraphs, CMD_djump, CMD_dlist, CMD_doautocmd, CMD_doautoall, CMD_drop, CMD_dsearch
  , CMD_dsplit, CMD_edit, CMD_earlier, CMD_echo, CMD_echoerr, CMD_echohl, CMD_echomsg, CMD_echon, CMD_else, CMD_elseif, CMD_emenu, CMD_endif, CMD_endfunction,
  CMD_endfor, CMD_endtry, CMD_endwhile, CMD_enew, CMD_ex, CMD_execute, CMD_exit, CMD_exusage, CMD_file, CMD_files, CMD_filetype, CMD_find, CMD_finally,
  CMD_finish, CMD_first, CMD_fixdel, CMD_fold, CMD_foldclose, CMD_folddoopen, CMD_folddoclosed, CMD_foldopen, CMD_for, CMD_function, CMD_global, CMD_goto,
  CMD_grep, CMD_grepadd, CMD_gui, CMD_gvim, CMD_help, CMD_helpfind, CMD_helpgrep, CMD_helptags, CMD_hardcopy, CMD_highlight, CMD_hide, CMD_history, CMD_insert,
  CMD_iabbrev, CMD_iabclear, CMD_if, CMD_ijump, CMD_ilist, CMD_imap, CMD_imapclear, CMD_imenu, CMD_inoremap, CMD_inoreabbrev, CMD_inoremenu, CMD_intro,
  CMD_isearch, CMD_isplit, CMD_iunmap, CMD_iunabbrev, CMD_iunmenu, CMD_join, CMD_jumps, CMD_k, CMD_keepmarks, CMD_keepjumps, CMD_keepalt, CMD_list, CMD_lNext,
  CMD_lNfile, CMD_last, CMD_language, CMD_laddexpr, CMD_laddbuffer, CMD_laddfile, CMD_later, CMD_lbuffer, CMD_lcd, CMD_lchdir, CMD_lclose, CMD_lcscope, CMD_left
  , CMD_leftabove, CMD_let, CMD_lexpr, CMD_lfile, CMD_lfirst, CMD_lgetfile, CMD_lgetbuffer, CMD_lgetexpr, CMD_lgrep, CMD_lgrepadd, CMD_lhelpgrep, CMD_ll,
  CMD_llast, CMD_llist, CMD_lmap, CMD_lmapclear, CMD_lmake, CMD_lnoremap, CMD_lnext, CMD_lnewer, CMD_lnfile, CMD_loadview, CMD_loadkeymap, CMD_lockmarks,
  CMD_lockvar, CMD_lolder, CMD_lopen, CMD_lprevious, CMD_lpfile, CMD_lrewind, CMD_ltag, CMD_lua, CMD_luado, CMD_luafile, CMD_lunmap, CMD_lvimgrep,
  CMD_lvimgrepadd, CMD_lwindow, CMD_ls, CMD_move, CMD_mark, CMD_make, CMD_map, CMD_mapclear, CMD_marks, CMD_match, CMD_menu, CMD_menutranslate, CMD_messages,
  CMD_mkexrc, CMD_mksession, CMD_mkspell, CMD_mkvimrc, CMD_mkview, CMD_mode, CMD_mzscheme, CMD_mzfile, CMD_next, CMD_nbkey, CMD_nbclose, CMD_nbstart, CMD_new,
  CMD_nmap, CMD_nmapclear, CMD_nmenu, CMD_nnoremap, CMD_nnoremenu, CMD_noremap, CMD_noautocmd, CMD_nohlsearch, CMD_noreabbrev, CMD_noremenu, CMD_normal,
  CMD_number, CMD_nunmap, CMD_nunmenu, CMD_open, CMD_oldfiles, CMD_omap, CMD_omapclear, CMD_omenu, CMD_only, CMD_onoremap, CMD_onoremenu, CMD_options,
  CMD_ounmap, CMD_ounmenu, CMD_ownsyntax, CMD_print, CMD_pclose, CMD_perl, CMD_perldo, CMD_pedit, CMD_pop, CMD_popup, CMD_ppop, CMD_preserve, CMD_previous,
  CMD_promptfind, CMD_promptrepl, CMD_profile, CMD_profdel, CMD_psearch, CMD_ptag, CMD_ptNext, CMD_ptfirst, CMD_ptjump, CMD_ptlast, CMD_ptnext, CMD_ptprevious,
  CMD_ptrewind, CMD_ptselect, CMD_put, CMD_pwd, CMD_python, CMD_pyfile, CMD_py3, CMD_python3, CMD_py3file, CMD_quit, CMD_quitall, CMD_qall, CMD_read,
  CMD_recover, CMD_redo, CMD_redir, CMD_redraw, CMD_redrawstatus, CMD_registers, CMD_resize, CMD_retab, CMD_return, CMD_rewind, CMD_right, CMD_rightbelow,
  CMD_runtime, CMD_ruby, CMD_rubydo, CMD_rubyfile, CMD_rundo, CMD_rviminfo, CMD_substitute, CMD_sNext, CMD_sargument, CMD_sall, CMD_sandbox, CMD_saveas,
  CMD_sbuffer, CMD_sbNext, CMD_sball, CMD_sbfirst, CMD_sblast, CMD_sbmodified, CMD_sbnext, CMD_sbprevious, CMD_sbrewind, CMD_scriptnames, CMD_scriptencoding,
  CMD_scscope, CMD_set, CMD_setfiletype, CMD_setglobal, CMD_setlocal, CMD_sfind, CMD_sfirst, CMD_shell, CMD_simalt, CMD_sign, CMD_silent, CMD_sleep, CMD_slast,
  CMD_smagic, CMD_smap, CMD_smapclear, CMD_smenu, CMD_snext, CMD_sniff, CMD_snomagic, CMD_snoremap, CMD_snoremenu, CMD_source, CMD_sort, CMD_split,
  CMD_spellgood, CMD_spelldump, CMD_spellinfo, CMD_spellrepall, CMD_spellundo, CMD_spellwrong, CMD_sprevious, CMD_srewind, CMD_stop, CMD_stag, CMD_startinsert,
  CMD_startgreplace, CMD_startreplace, CMD_stopinsert, CMD_stjump, CMD_stselect, CMD_sunhide, CMD_sunmap, CMD_sunmenu, CMD_suspend, CMD_sview, CMD_swapname,
  CMD_syntax, CMD_syncbind, CMD_t, CMD_tNext, CMD_tag, CMD_tags, CMD_tab, CMD_tabclose, CMD_tabdo, CMD_tabedit, CMD_tabfind, CMD_tabfirst, CMD_tabmove,
  CMD_tablast, CMD_tabnext, CMD_tabnew, CMD_tabonly, CMD_tabprevious, CMD_tabNext, CMD_tabrewind, CMD_tabs, CMD_tcl, CMD_tcldo, CMD_tclfile, CMD_tearoff,
  CMD_tfirst, CMD_throw, CMD_tjump, CMD_tlast, CMD_tmenu, CMD_tnext, CMD_topleft, CMD_tprevious, CMD_trewind, CMD_try, CMD_tselect, CMD_tunmenu, CMD_undo,
  CMD_undojoin, CMD_undolist, CMD_unabbreviate, CMD_unhide, CMD_unlet, CMD_unlockvar, CMD_unmap, CMD_unmenu, CMD_unsilent, CMD_update, CMD_vglobal, CMD_version
  , CMD_verbose, CMD_vertical, CMD_visual, CMD_view, CMD_vimgrep, CMD_vimgrepadd, CMD_viusage, CMD_vmap, CMD_vmapclear, CMD_vmenu, CMD_vnoremap, CMD_vnew,
  CMD_vnoremenu, CMD_vsplit, CMD_vunmap, CMD_vunmenu, CMD_write, CMD_wNext, CMD_wall, CMD_while, CMD_winsize, CMD_wincmd, CMD_windo, CMD_winpos, CMD_wnext,
  CMD_wprevious, CMD_wq, CMD_wqall, CMD_wsverb, CMD_wundo, CMD_wviminfo, CMD_xit, CMD_xall, CMD_xmap, CMD_xmapclear, CMD_xmenu, CMD_xnoremap, CMD_xnoremenu,
  CMD_xunmap, CMD_xunmenu, CMD_yank, CMD_z, CMD_bang, CMD_pound, CMD_and, CMD_star, CMD_lshift, CMD_equal, CMD_rshift, CMD_at, CMD_Next, CMD_Print, CMD_X,
  CMD_tilde, CMD_SIZE, CMD_USER = -1, CMD_USER_BUF = -2};
typedef enum CMD_index cmdidx_T;
struct exarg {
    char_u * arg;
    char_u * nextcmd;
    char_u * cmd;
    char_u * * cmdlinep;
    cmdidx_T cmdidx;
    long argt;
    int skip;
    int forceit;
    int addr_count;
    linenr_T line1;
    linenr_T line2;
    int flags;
    char_u * do_ecmd_cmd;
    linenr_T do_ecmd_lnum;
    int append;
    int usefilter;
    int amount;
    int regname;
    int force_bin;
    int read_edit;
    int force_ff;
    int useridx;
    char_u * errmsg;
    char_u * (* getline) (int, void *, int);
    void * cookie;
    struct condstack * cstack;
};
void bf_key_init (char_u * password, char_u * salt, int salt_len);
void bf_ofb_init (char_u * iv, int iv_len);
void bf_crypt_encode (char_u * from, size_t len, char_u * to);
void bf_crypt_decode (char_u * ptr, long len);
void bf_crypt_init_keys (char_u * passwd);
void bf_crypt_save (void);
void bf_crypt_restore (void);
int blowfish_self_test (void);
int open_buffer (int read_stdin, exarg_T * eap, int flags);
int buf_valid (buf_T * buf);
void close_buffer (win_T * win, buf_T * buf, int action);
void buf_clear_file (buf_T * buf);
void buf_freeall (buf_T * buf, int flags);
void goto_buffer (exarg_T * eap, int start, int dir, int count);
void handle_swap_exists (buf_T * old_curbuf);
char_u * do_bufdel (int command, char_u * arg, int addr_count, int start_bnr, int end_bnr, int forceit);
int do_buffer (int action, int start, int dir, int count, int forceit);
void set_curbuf (buf_T * buf, int action);
void enter_buffer (buf_T * buf);
void do_autochdir (void);
buf_T * buflist_new (char_u * ffname, char_u * sfname, linenr_T lnum, int flags);
void free_buf_options (buf_T * buf, int free_p_ff);
int buflist_getfile (int n, linenr_T lnum, int options, int forceit);
void buflist_getfpos (void);
buf_T * buflist_findname_exp (char_u * fname);
buf_T * buflist_findname (char_u * ffname);
int buflist_findpat (char_u * pattern, char_u * pattern_end, int unlisted, int diffmode);
int ExpandBufnames (char_u * pat, int * num_file, char_u * * * file, int options);
buf_T * buflist_findnr (int nr);
char_u * buflist_nr2name (int n, int fullname, int helptail);
void get_winopts (buf_T * buf);
pos_T * buflist_findfpos (buf_T * buf);
linenr_T buflist_findlnum (buf_T * buf);
void buflist_list (exarg_T * eap);
int buflist_name_nr (int fnum, char_u * * fname, linenr_T * lnum);
int setfname (buf_T * buf, char_u * ffname, char_u * sfname, int message);
void buf_set_name (int fnum, char_u * name);
void buf_name_changed (buf_T * buf);
buf_T * setaltfname (char_u * ffname, char_u * sfname, linenr_T lnum);
char_u * getaltfname (int errmsg);
int buflist_add (char_u * fname, int flags);
void buflist_slash_adjust (void);
void buflist_altfpos (win_T * win);
int otherfile (char_u * ffname);
void buf_setino (buf_T * buf);
void fileinfo (int fullname, int shorthelp, int dont_truncate);
void col_print (char_u * buf, size_t buflen, int col, int vcol);
void maketitle (void);
void resettitle (void);
void free_titles (void);
int build_stl_str_hl (win_T * wp, char_u * out, size_t outlen, char_u * fmt, int use_sandbox, int fillchar, int maxwidth, struct stl_hlrec * hltab, struct
  stl_hlrec * tabtab);
void get_rel_pos (win_T * wp, char_u * buf, int buflen);
char_u * fix_fname (char_u * fname);
void fname_expand (buf_T * buf, char_u * * ffname, char_u * * sfname);
char_u * alist_name (aentry_T * aep);
void do_arg_all (int count, int forceit, int keep_tabs);
void ex_buffer_all (exarg_T * eap);
void do_modelines (int flags);
int read_viminfo_bufferlist (vir_T * virp, int writing);
void write_viminfo_bufferlist (FILE * fp);
char * buf_spname (buf_T * buf);
void buf_addsign (buf_T * buf, int id, linenr_T lnum, int typenr);
linenr_T buf_change_sign_type (buf_T * buf, int markId, int typenr);
int buf_getsigntype (buf_T * buf, linenr_T lnum, int type);
linenr_T buf_delsign (buf_T * buf, int id);
int buf_findsign (buf_T * buf, int id);
int buf_findsign_id (buf_T * buf, linenr_T lnum);
int buf_findsigntype_id (buf_T * buf, linenr_T lnum, int typenr);
int buf_signcount (buf_T * buf, linenr_T lnum);
void buf_delete_all_signs (void);
void sign_list_placed (buf_T * rbuf);
void sign_mark_adjust (linenr_T line1, linenr_T line2, long amount, long amount_after);
void set_buflisted (int on);
int buf_contents_changed (buf_T * buf);
void wipe_buffer (buf_T * buf, int aucmd);
int init_chartab (void);
int buf_init_chartab (buf_T * buf, int global);
void trans_characters (char_u * buf, int bufsize);
char_u * transstr (char_u * s);
char_u * str_foldcase (char_u * str, int orglen, char_u * buf, int buflen);
char_u * transchar (int c);
char_u * transchar_byte (int c);
void transchar_nonprint (char_u * buf, int c);
void transchar_hex (char_u * buf, int c);
int byte2cells (int b);
int char2cells (int c);
int ptr2cells (char_u * p);
int vim_strsize (char_u * s);
int vim_strnsize (char_u * s, int len);
int chartabsize (char_u * p, colnr_T col);
int linetabsize (char_u * s);
int linetabsize_col (int startcol, char_u * s);
int win_linetabsize (win_T * wp, char_u * p, colnr_T len);
int vim_isIDc (int c);
int vim_iswordc (int c);
int vim_iswordp (char_u * p);
int vim_iswordc_buf (char_u * p, buf_T * buf);
int vim_isfilec (int c);
int vim_isfilec_or_wc (int c);
int vim_isprintc (int c);
int vim_isprintc_strict (int c);
int lbr_chartabsize (unsigned char * s, colnr_T col);
int lbr_chartabsize_adv (char_u * * s, colnr_T col);
int win_lbr_chartabsize (win_T * wp, char_u * s, colnr_T col, int * headp);
int in_win_border (win_T * wp, colnr_T vcol);
void getvcol (win_T * wp, pos_T * pos, colnr_T * start, colnr_T * cursor, colnr_T * end);
colnr_T getvcol_nolist (pos_T * posp);
void getvvcol (win_T * wp, pos_T * pos, colnr_T * start, colnr_T * cursor, colnr_T * end);
void getvcols (win_T * wp, pos_T * pos1, pos_T * pos2, colnr_T * left, colnr_T * right);
char_u * skipwhite (char_u * q);
char_u * skipdigits (char_u * q);
char_u * skiphex (char_u * q);
char_u * skiptodigit (char_u * q);
char_u * skiptohex (char_u * q);
int vim_isdigit (int c);
int vim_isxdigit (int c);
int vim_islower (int c);
int vim_isupper (int c);
int vim_toupper (int c);
int vim_tolower (int c);
char_u * skiptowhite (char_u * p);
char_u * skiptowhite_esc (char_u * p);
long getdigits (char_u * * pp);
int vim_isblankline (char_u * lbuf);
void vim_str2nr (char_u * start, int * hexp, int * len, int dooct, int dohex, long * nptr, unsigned long * unptr);
int hex2nr (int c);
int hexhex2nr (char_u * p);
int rem_backslash (char_u * str);
void backslash_halve (char_u * p);
char_u * backslash_halve_save (char_u * p);
void ebcdic2ascii (char_u * buffer, int len);
void diff_buf_delete (buf_T * buf);
void diff_buf_adjust (win_T * win);
void diff_buf_add (buf_T * buf);
void diff_invalidate (buf_T * buf);
void diff_mark_adjust (linenr_T line1, linenr_T line2, long amount, long amount_after);
void ex_diffupdate (exarg_T * eap);
void ex_diffpatch (exarg_T * eap);
void ex_diffsplit (exarg_T * eap);
void ex_diffthis (exarg_T * eap);
void diff_win_options (win_T * wp, int addbuf);
void ex_diffoff (exarg_T * eap);
void diff_clear (tabpage_T * tp);
int diff_check (win_T * wp, linenr_T lnum);
int diff_check_fill (win_T * wp, linenr_T lnum);
void diff_set_topline (win_T * fromwin, win_T * towin);
int diffopt_changed (void);
int diffopt_horizontal (void);
int diff_find_change (win_T * wp, linenr_T lnum, int * startp, int * endp);
int diff_infold (win_T * wp, linenr_T lnum);
void nv_diffgetput (int put);
void ex_diffgetput (exarg_T * eap);
int diff_mode_buf (buf_T * buf);
int diff_move_to (int dir, long count);
linenr_T diff_get_corresponding_line (buf_T * buf1, linenr_T lnum1, buf_T * buf2, linenr_T lnum3);
linenr_T diff_lnum_win (linenr_T lnum, win_T * wp);
int do_digraph (int c);
int get_digraph (int cmdline);
int getdigraph (int char1, int char2, int meta);
void putdigraph (char_u * str);
void listdigraphs (void);
char_u * keymap_init (void);
void ex_loadkeymap (exarg_T * eap);
int edit (int cmdchar, int startln, long count);
void edit_putchar (int c, int highlight);
void edit_unputchar (void);
void display_dollar (colnr_T col);
void change_indent (int type, int amount, int round, int replaced, int call_changed_bytes);
void truncate_spaces (char_u * line);
void backspace_until_column (int col);
int vim_is_ctrl_x_key (int c);
int ins_compl_add_infercase (char_u * str, int len, int icase, char_u * fname, int dir, int flags);
void set_completion (colnr_T startcol, list_T * list);
void ins_compl_show_pum (void);
char_u * find_word_start (char_u * ptr);
char_u * find_word_end (char_u * ptr);
int ins_compl_active (void);
int ins_compl_add_tv (typval_T * tv, int dir);
void ins_compl_check_keys (int frequency);
int get_literal (void);
void insertchar (int c, int flags, int second_indent);
void auto_format (int trailblank, int prev_line);
int comp_textwidth (int ff);
int stop_arrow (void);
void set_last_insert (int c);
void free_last_insert (void);
char_u * add_char2buf (int c, char_u * s);
void beginline (int flags);
int oneright (void);
int oneleft (void);
int cursor_up (long n, int upd_topline);
int cursor_down (long n, int upd_topline);
int stuff_inserted (int c, long count, int no_esc);
char_u * get_last_insert (void);
char_u * get_last_insert_save (void);
void replace_push (int c);
int replace_push_mb (char_u * p);
void fixthisline (int (* get_the_indent) (void));
void fix_indent (void);
int in_cinkeys (int keytyped, int when, int line_is_empty);
int hkmap (int c);
void ins_scroll (void);
void ins_horscroll (void);
void eval_init (void);
void eval_clear (void);
char_u * func_name (void * cookie);
linenr_T * func_breakpoint (void * cookie);
int * func_dbg_tick (void * cookie);
int func_level (void * cookie);
int current_func_returned (void);
void set_internal_string_var (char_u * name, char_u * value);
int var_redir_start (char_u * name, int append);
void var_redir_str (char_u * value, int value_len);
void var_redir_stop (void);
int eval_charconvert (char_u * enc_from, char_u * enc_to, char_u * fname_from, char_u * fname_to);
int eval_printexpr (char_u * fname, char_u * args);
void eval_diff (char_u * origfile, char_u * newfile, char_u * outfile);
void eval_patch (char_u * origfile, char_u * difffile, char_u * outfile);
int eval_to_bool (char_u * arg, int * error, char_u * * nextcmd, int skip);
char_u * eval_to_string_skip (char_u * arg, char_u * * nextcmd, int skip);
int skip_expr (char_u * * pp);
char_u * eval_to_string (char_u * arg, char_u * * nextcmd, int convert);
char_u * eval_to_string_safe (char_u * arg, char_u * * nextcmd, int use_sandbox);
int eval_to_number (char_u * expr);
list_T * eval_spell_expr (char_u * badword, char_u * expr);
int get_spellword (list_T * list, char_u * * pp);
typval_T * eval_expr (char_u * arg, char_u * * nextcmd);
void * call_func_retstr (char_u * func, int argc, char_u * * argv, int safe);
long call_func_retnr (char_u * func, int argc, char_u * * argv, int safe);
void * call_func_retlist (char_u * func, int argc, char_u * * argv, int safe);
void * save_funccal (void);
void restore_funccal (void * vfc);
void prof_child_enter (proftime_T * tm);
void prof_child_exit (proftime_T * tm);
int eval_foldexpr (char_u * arg, int * cp);
void ex_let (exarg_T * eap);
void * eval_for_line (char_u * arg, int * errp, char_u * * nextcmdp, int skip);
int next_for_item (void * fi_void, char_u * arg);
void free_for_info (void * fi_void);
void set_context_for_expression (expand_T * xp, char_u * arg, cmdidx_T cmdidx);
void ex_call (exarg_T * eap);
void ex_unlet (exarg_T * eap);
void ex_lockvar (exarg_T * eap);
int do_unlet (char_u * name, int forceit);
void del_menutrans_vars (void);
char_u * get_user_var_name (expand_T * xp, int idx);
list_T * list_alloc (void);
void list_unref (list_T * l);
void list_free (list_T * l, int recurse);
dictitem_T * dict_lookup (hashitem_T * hi);
char_u * list_find_str (list_T * l, long idx);
int list_append_tv (list_T * l, typval_T * tv);
int list_append_dict (list_T * list, dict_T * dict);
int list_append_string (list_T * l, char_u * str, int len);
int garbage_collect (void);
dict_T * dict_alloc (void);
dictitem_T * dictitem_alloc (char_u * key);
void dictitem_free (dictitem_T * item);
int dict_add (dict_T * d, dictitem_T * item);
int dict_add_nr_str (dict_T * d, char * key, long nr, char_u * str);
int dict_add_list (dict_T * d, char * key, list_T * list);
dictitem_T * dict_find (dict_T * d, char_u * key, int len);
char_u * get_dict_string (dict_T * d, char_u * key, int save);
long get_dict_number (dict_T * d, char_u * key);
char_u * get_function_name (expand_T * xp, int idx);
char_u * get_expr_name (expand_T * xp, int idx);
long do_searchpair (char_u * spat, char_u * mpat, char_u * epat, int dir, char_u * skip, int flags, pos_T * match_pos, linenr_T lnum_stop, long time_limit);
void set_vim_var_nr (int idx, long val);
long get_vim_var_nr (int idx);
char_u * get_vim_var_str (int idx);
list_T * get_vim_var_list (int idx);
void set_vim_var_char (int c);
void set_vcount (long count, long count1, int set_prevcount);
void set_vim_var_string (int idx, char_u * val, int len);
void set_vim_var_list (int idx, list_T * val);
void set_reg_var (int c);
char_u * v_exception (char_u * oldval);
char_u * v_throwpoint (char_u * oldval);
char_u * set_cmdarg (exarg_T * eap, char_u * oldarg);
void free_tv (typval_T * varp);
void clear_tv (typval_T * varp);
long get_tv_number_chk (typval_T * varp, int * denote);
char_u * get_tv_string_chk (typval_T * varp);
char_u * get_var_value (char_u * name);
void new_script_vars (scid_T id);
void init_var_dict (dict_T * dict, dictitem_T * dict_var);
void vars_clear (hashtab_T * ht);
void copy_tv (typval_T * from, typval_T * to);
void ex_echo (exarg_T * eap);
void ex_echohl (exarg_T * eap);
void ex_execute (exarg_T * eap);
void ex_function (exarg_T * eap);
void free_all_functions (void);
void func_dump_profile (FILE * fd);
char_u * get_user_func_name (expand_T * xp, int idx);
void ex_delfunction (exarg_T * eap);
void ex_return (exarg_T * eap);
int do_return (exarg_T * eap, int reanimate, int is_cmd, void * rettv);
void discard_pending_return (void * rettv);
char_u * get_return_cmd (void * rettv);
char_u * get_func_line (int c, void * cookie, int indent);
void func_line_start (void * cookie);
void func_line_exec (void * cookie);
void func_line_end (void * cookie);
int func_has_ended (void * cookie);
int func_has_abort (void * cookie);
int read_viminfo_varlist (vir_T * virp, int writing);
void write_viminfo_varlist (FILE * fp);
int store_session_globals (FILE * fd);
void last_set_msg (scid_T scriptID);
void ex_oldfiles (exarg_T * eap);
int modify_fname (char_u * src, int * usedlen, char_u * * fnamep, char_u * * bufp, int * fnamelen);
char_u * do_string_sub (char_u * str, char_u * pat, char_u * sub, char_u * flags);
void do_ascii (exarg_T * eap);
void ex_align (exarg_T * eap);
void ex_sort (exarg_T * eap);
void ex_retab (exarg_T * eap);
int do_move (linenr_T line1, linenr_T line2, linenr_T dest);
void ex_copy (linenr_T line1, linenr_T line2, linenr_T n);
void free_prev_shellcmd (void);
void do_bang (int addr_count, exarg_T * eap, int forceit, int do_in, int do_out);
void do_shell (char_u * cmd, int flags);
char_u * make_filter_cmd (char_u * cmd, char_u * itmp, char_u * otmp);
void append_redir (char_u * buf, int buflen, char_u * opt, char_u * fname);
int viminfo_error (char * errnum, char * message, char_u * line);
int read_viminfo (char_u * file, int flags);
void write_viminfo (char_u * file, int forceit);
int viminfo_readline (vir_T * virp);
char_u * viminfo_readstring (vir_T * virp, int off, int convert);
void viminfo_writestring (FILE * fd, char_u * p);
void do_fixdel (exarg_T * eap);
void print_line_no_prefix (linenr_T lnum, int use_number, int list);
void print_line (linenr_T lnum, int use_number, int list);
void ex_file (exarg_T * eap);
void ex_update (exarg_T * eap);
void ex_write (exarg_T * eap);
int do_write (exarg_T * eap);
void ex_wnext (exarg_T * eap);
void do_wqall (exarg_T * eap);
int not_writing (void);
int getfile (int fnum, char_u * ffname, char_u * sfname, int setpm, linenr_T lnum, int forceit);
int do_ecmd (int fnum, char_u * ffname, char_u * sfname, exarg_T * eap, linenr_T newlnum, int flags, win_T * oldwin);
void ex_append (exarg_T * eap);
void ex_change (exarg_T * eap);
void ex_z (exarg_T * eap);
int check_restricted (void);
int check_secure (void);
void do_sub (exarg_T * eap);
int do_sub_msg (int count_only);
void ex_global (exarg_T * eap);
void global_exe (char_u * cmd);
int read_viminfo_sub_string (vir_T * virp, int force);
void write_viminfo_sub_string (FILE * fp);
void free_old_sub (void);
int prepare_tagpreview (int undo_sync);
void ex_help (exarg_T * eap);
char_u * check_help_lang (char_u * arg);
int help_heuristic (char_u * matched_string, int offset, int wrong_case);
int find_help_tags (char_u * arg, int * num_matches, char_u * * * matches, int keep_lang);
void fix_help_buffer (void);
void ex_exusage (exarg_T * eap);
void ex_viusage (exarg_T * eap);
void ex_helptags (exarg_T * eap);
void ex_sign (exarg_T * eap);
void sign_gui_started (void);
int sign_get_attr (int typenr, int line);
char_u * sign_get_text (int typenr);
void * sign_get_image (int typenr);
char_u * sign_typenr2name (int typenr);
void free_signs (void);
char_u * get_sign_name (expand_T * xp, int idx);
void set_context_in_sign_cmd (expand_T * xp, char_u * arg);
void ex_drop (exarg_T * eap);
void do_debug (char_u * cmd);
void ex_debug (exarg_T * eap);
void dbg_check_breakpoint (exarg_T * eap);
int dbg_check_skipped (exarg_T * eap);
void ex_breakadd (exarg_T * eap);
void ex_debuggreedy (exarg_T * eap);
void ex_breakdel (exarg_T * eap);
void ex_breaklist (exarg_T * eap);
linenr_T dbg_find_breakpoint (int file, char_u * fname, linenr_T after);
int has_profiling (int file, char_u * fname, int * fp);
void dbg_breakpoint (char_u * name, linenr_T lnum);
void profile_start (proftime_T * tm);
void profile_end (proftime_T * tm);
void profile_sub (proftime_T * tm, proftime_T * tm2);
char * profile_msg (proftime_T * tm);
void profile_setlimit (long msec, proftime_T * tm);
int profile_passed_limit (proftime_T * tm);
void profile_zero (proftime_T * tm);
void profile_add (proftime_T * tm, proftime_T * tm2);
void profile_self (proftime_T * self, proftime_T * total, proftime_T * children);
void profile_get_wait (proftime_T * tm);
void profile_sub_wait (proftime_T * tm, proftime_T * tma);
int profile_equal (proftime_T * tm1, proftime_T * tm2);
int profile_cmp (proftime_T * tm1, proftime_T * tm2);
void ex_profile (exarg_T * eap);
char_u * get_profile_name (expand_T * xp, int idx);
void set_context_in_profile_cmd (expand_T * xp, char_u * arg);
void profile_dump (void);
void script_prof_save (proftime_T * tm);
void script_prof_restore (proftime_T * tm);
void prof_inchar_enter (void);
void prof_inchar_exit (void);
int prof_def_func (void);
int autowrite (buf_T * buf, int forceit);
void autowrite_all (void);
int check_changed (buf_T * buf, int checkaw, int mult_win, int forceit, int allbuf);
void browse_save_fname (buf_T * buf);
void dialog_changed (buf_T * buf, int checkall);
int can_abandon (buf_T * buf, int forceit);
int check_changed_any (int hidden);
int check_fname (void);
int buf_write_all (buf_T * buf, int forceit);
int get_arglist (garray_T * gap, char_u * str);
int get_arglist_exp (char_u * str, int * fcountp, char_u * * * fnamesp);
void set_arglist (char_u * str);
void check_arg_idx (win_T * win);
void ex_args (exarg_T * eap);
void ex_previous (exarg_T * eap);
void ex_rewind (exarg_T * eap);
void ex_last (exarg_T * eap);
void ex_argument (exarg_T * eap);
void do_argfile (exarg_T * eap, int argn);
void ex_next (exarg_T * eap);
void ex_argedit (exarg_T * eap);
void ex_argadd (exarg_T * eap);
void ex_argdelete (exarg_T * eap);
void ex_listdo (exarg_T * eap);
void ex_compiler (exarg_T * eap);
void ex_runtime (exarg_T * eap);
int source_runtime (char_u * name, int all);
int do_in_runtimepath (char_u * name, int all, void (* callback) (char_u * fname, void * ck), void * cookie);
void ex_options (exarg_T * eap);
void ex_source (exarg_T * eap);
linenr_T * source_breakpoint (void * cookie);
int * source_dbg_tick (void * cookie);
int source_level (void * cookie);
int do_source (char_u * fname, int check_other, int is_vimrc);
void ex_scriptnames (exarg_T * eap);
void scriptnames_slash_adjust (void);
char_u * get_scriptname (scid_T id);
void free_scriptnames (void);
char * fgets_cr (char * s, int n, FILE * stream);
char_u * getsourceline (int c, void * cookie, int indent);
void script_line_start (void);
void script_line_exec (void);
void script_line_end (void);
void ex_scriptencoding (exarg_T * eap);
void ex_finish (exarg_T * eap);
void do_finish (exarg_T * eap, int reanimate);
int source_finished (char_u * (* fgetline) (int, void *, int), void * cookie);
void ex_checktime (exarg_T * eap);
char_u * get_mess_lang (void);
void set_lang_var (void);
void ex_language (exarg_T * eap);
char_u * get_lang_arg (expand_T * xp, int idx);
void do_exmode (int improved);
int do_cmdline_cmd (char_u * cmd);
int do_cmdline (char_u * cmdline, char_u * (* getline) (int, void *, int), void * cookie, int flags);
int getline_equal (char_u * (* fgetline) (int, void *, int), void * cookie, char_u * (* func) (int, void *, int));
void * getline_cookie (char_u * (* fgetline) (int, void *, int), void * cookie);
int checkforcmd (char_u * * pp, char * cmd, int len);
int modifier_len (char_u * cmd);
int cmd_exists (char_u * name);
char_u * set_one_cmd_context (expand_T * xp, char_u * buff);
char_u * skip_range (char_u * cmd, int * ctx);
void ex_ni (exarg_T * eap);
int expand_filename (exarg_T * eap, char_u * * cmdlinep, char_u * * errormsgp);
void separate_nextcmd (exarg_T * eap);
int ends_excmd (int c);
char_u * find_nextcmd (char_u * p);
char_u * check_nextcmd (char_u * p);
char_u * get_command_name (expand_T * xp, int idx);
void ex_comclear (exarg_T * eap);
void uc_clear (garray_T * gap);
char_u * get_user_commands (expand_T * xp, int idx);
char_u * get_user_cmd_flags (expand_T * xp, int idx);
char_u * get_user_cmd_nargs (expand_T * xp, int idx);
char_u * get_user_cmd_complete (expand_T * xp, int idx);
int parse_compl_arg (char_u * value, int vallen, int * complp, long * argt, char_u * * compl_arg);
void not_exiting (void);
void tabpage_close (int forceit);
void tabpage_close_other (tabpage_T * tp, int forceit);
void ex_all (exarg_T * eap);
void handle_drop (int filec, char_u * * filev, int split);
void alist_clear (alist_T * al);
void alist_init (alist_T * al);
void alist_unlink (alist_T * al);
void alist_new (void);
void alist_expand (int * fnum_list, int fnum_len);
void alist_set (alist_T * al, int count, char_u * * files, int use_curbuf, int * fnum_list, int fnum_len);
void alist_add (alist_T * al, char_u * fname, int set_fnum);
void alist_slash_adjust (void);
void ex_splitview (exarg_T * eap);
void tabpage_new (void);
void do_exedit (exarg_T * eap, win_T * old_curwin);
void free_cd_dir (void);
void ex_cd (exarg_T * eap);
void do_sleep (long msec);
int vim_mkdir_emsg (char_u * name, int prot);
FILE * open_exfile (char_u * fname, int forceit, char * mode);
void update_topline_cursor (void);
void exec_normal_cmd (char_u * cmd, int remap, int silent);
int find_cmdline_var (char_u * src, int * usedlen);
char_u * eval_vars (char_u * src, char_u * srcstart, int * usedlen, linenr_T * lnump, char_u * * errormsg, int * escaped);
char_u * expand_sfile (char_u * arg);
int put_eol (FILE * fd);
int put_line (FILE * fd, char * s);
void dialog_msg (char_u * buff, char * format, char_u * fname);
char_u * get_behave_arg (expand_T * xp, int idx);
int aborting (void);
void update_force_abort (void);
int should_abort (int retcode);
int aborted_in_try (void);
int cause_errthrow (char_u * mesg, int severe, int * ignore);
void do_errthrow (struct condstack * cstack, char_u * cmdname);
int do_intthrow (struct condstack * cstack);
void discard_current_exception (void);
void report_make_pending (int pending, void * value);
void report_resume_pending (int pending, void * value);
void report_discard_pending (int pending, void * value);
void ex_if (exarg_T * eap);
void ex_endif (exarg_T * eap);
void ex_else (exarg_T * eap);
void ex_while (exarg_T * eap);
void ex_continue (exarg_T * eap);
void ex_break (exarg_T * eap);
void ex_endwhile (exarg_T * eap);
void ex_throw (exarg_T * eap);
void do_throw (struct condstack * cstack);
void ex_try (exarg_T * eap);
void ex_catch (exarg_T * eap);
void ex_finally (exarg_T * eap);
void ex_endtry (exarg_T * eap);
void enter_cleanup (cleanup_T * csp);
void leave_cleanup (cleanup_T * csp);
int cleanup_conditionals (struct condstack * cstack, int searched_cond, int inclusive);
void rewind_conditionals (struct condstack * cstack, int idx, int cond_type, int * cond_level);
void ex_endfunction (exarg_T * eap);
int has_loop_cmd (char_u * p);
char_u * getcmdline (int firstc, long count, int indent);
char_u * getcmdline_prompt (int firstc, char_u * prompt, int attr, int xp_context, char_u * xp_arg);
int text_locked (void);
void text_locked_msg (void);
int curbuf_locked (void);
int allbuf_locked (void);
char_u * getexline (int c, void * cookie, int indent);
char_u * getexmodeline (int promptc, void * cookie, int indent);
int cmdline_overstrike (void);
int cmdline_at_end (void);
colnr_T cmdline_getvcol_cursor (void);
void free_cmdline_buf (void);
void putcmdline (int c, int shift);
void unputcmdline (void);
int put_on_cmdline (char_u * str, int len, int redraw);
char_u * save_cmdline_alloc (void);
void restore_cmdline_alloc (char_u * p);
void cmdline_paste_str (char_u * s, int literally);
void redrawcmdline (void);
void redrawcmd (void);
void compute_cmdrow (void);
void gotocmdline (int clr);
char_u * ExpandOne (expand_T * xp, char_u * str, char_u * orig, int options, int mode);
void ExpandInit (expand_T * xp);
void ExpandCleanup (expand_T * xp);
void ExpandEscape (expand_T * xp, char_u * str, int numfiles, char_u * * files, int options);
char_u * vim_strsave_fnameescape (char_u * fname, int shell);
void tilde_replace (char_u * orig_pat, int num_files, char_u * * files);
char_u * sm_gettail (char_u * s);
char_u * addstar (char_u * fname, int len, int context);
void set_cmd_context (expand_T * xp, char_u * str, int len, int col);
int expand_cmdline (expand_T * xp, char_u * str, int col, int * matchcount, char_u * * * matches);
int ExpandGeneric (expand_T * xp, regmatch_T * regmatch, int * num_file, char_u * * * file, char_u * ((* func) (expand_T *, int)));
char_u * globpath (char_u * path, char_u * file, int expand_options);
void init_history (void);
int get_histtype (char_u * name);
void add_to_history (int histype, char_u * new_entry, int in_map, int sep);
int get_history_idx (int histype);
char_u * get_cmdline_str (void);
int get_cmdline_pos (void);
int set_cmdline_pos (int pos);
int get_cmdline_type (void);
char_u * get_history_entry (int histype, int idx);
int clr_history (int histype);
int del_history_entry (int histype, char_u * str);
int del_history_idx (int histype, int idx);
void remove_key_from_history (void);
int get_list_range (char_u * * str, int * num1, int * num2);
void ex_history (exarg_T * eap);
void prepare_viminfo_history (int asklen);
int read_viminfo_history (vir_T * virp);
void finish_viminfo_history (void);
void write_viminfo_history (FILE * fp);
void cmd_pchar (int c, int offset);
int cmd_gchar (int offset);
char_u * script_get (exarg_T * eap, char_u * cmd);
void filemess (buf_T * buf, char_u * name, char_u * s, int attr);
int readfile (char_u * fname, char_u * sfname, linenr_T from, linenr_T lines_to_skip, linenr_T lines_to_read, exarg_T * eap, int flags);
int prep_exarg (exarg_T * eap, buf_T * buf);
int prepare_crypt_read (FILE * fp);
char_u * prepare_crypt_write (buf_T * buf, int * lenp);
int check_file_readonly (char_u * fname, int perm);
int buf_write (buf_T * buf, char_u * fname, char_u * sfname, linenr_T start, linenr_T end, exarg_T * eap, int append, int forceit, int reset_changed, int
  filtering);
void msg_add_fname (buf_T * buf, char_u * fname);
void msg_add_lines (int insert_space, long lnum, off_t nchars);
char_u * shorten_fname1 (char_u * full_path);
char_u * shorten_fname (char_u * full_path, char_u * dir_name);
void shorten_fnames (int force);
void shorten_filenames (char_u * * fnames, int count);
char_u * modname (char_u * fname, char_u * ext, int prepend_dot);
char_u * buf_modname (int shortname, char_u * fname, char_u * ext, int prepend_dot);
int vim_fgets (char_u * buf, int size, FILE * fp);
int tag_fgets (char_u * buf, int size, FILE * fp);
int vim_rename (char_u * from, char_u * to);
int check_timestamps (int focus);
int buf_check_timestamp (buf_T * buf, int focus);
void buf_reload (buf_T * buf, int orig_mode);
void buf_store_time (buf_T * buf, struct stat * st, char_u * fname);
void write_lnum_adjust (linenr_T offset);
void vim_deltempdir (void);
char_u * vim_tempname (int extra_char);
void forward_slash (char_u * fname);
void aubuflocal_remove (buf_T * buf);
int au_has_group (char_u * name);
void do_augroup (char_u * arg, int del_group);
void free_all_autocmds (void);
int check_ei (void);
char_u * au_event_disable (char * what);
void au_event_restore (char_u * old_ei);
void do_autocmd (char_u * arg, int forceit);
int do_doautocmd (char_u * arg, int do_msg);
void ex_doautoall (exarg_T * eap);
void aucmd_prepbuf (aco_save_T * aco, buf_T * buf);
void aucmd_restbuf (aco_save_T * aco);
int apply_autocmds (event_T event, char_u * fname, char_u * fname_io, int force, buf_T * buf);
int apply_autocmds_retval (event_T event, char_u * fname, char_u * fname_io, int force, buf_T * buf, int * retval);
int has_cursorhold (void);
int trigger_cursorhold (void);
int has_cursormoved (void);
int has_cursormovedI (void);
void block_autocmds (void);
void unblock_autocmds (void);
int has_autocmd (event_T event, char_u * sfname, buf_T * buf);
char_u * get_augroup_name (expand_T * xp, int idx);
char_u * set_context_in_autocmd (expand_T * xp, char_u * arg, int doautocmd);
char_u * get_event_name (expand_T * xp, int idx);
int autocmd_supported (char_u * name);
int au_exists (char_u * arg);
int match_file_pat (char_u * pattern, regprog_T * prog, char_u * fname, char_u * sfname, char_u * tail, int allow_dirs);
int match_file_list (char_u * list, char_u * sfname, char_u * ffname);
char_u * file_pat_to_reg_pat (char_u * pat, char_u * pat_end, char * allow_dirs, int no_bslash);
void copyFoldingState (win_T * wp_from, win_T * wp_to);
int hasAnyFolding (win_T * win);
int hasFolding (linenr_T lnum, linenr_T * firstp, linenr_T * lastp);
int hasFoldingWin (win_T * win, linenr_T lnum, linenr_T * firstp, linenr_T * lastp, int cache, foldinfo_T * infop);
int foldLevel (linenr_T lnum);
int lineFolded (win_T * win, linenr_T lnum);
long foldedCount (win_T * win, linenr_T lnum, foldinfo_T * infop);
int foldmethodIsManual (win_T * wp);
int foldmethodIsIndent (win_T * wp);
int foldmethodIsExpr (win_T * wp);
int foldmethodIsMarker (win_T * wp);
int foldmethodIsSyntax (win_T * wp);
int foldmethodIsDiff (win_T * wp);
void closeFold (linenr_T lnum, long count);
void closeFoldRecurse (linenr_T lnum);
void opFoldRange (linenr_T first, linenr_T last, int opening, int recurse, int had_visual);
void openFold (linenr_T lnum, long count);
void openFoldRecurse (linenr_T lnum);
void foldOpenCursor (void);
void newFoldLevel (void);
void foldCheckClose (void);
int foldManualAllowed (int create);
void foldCreate (linenr_T start, linenr_T end);
void deleteFold (linenr_T start, linenr_T end, int recursive, int had_visual);
void clearFolding (win_T * win);
void foldUpdate (win_T * wp, linenr_T top, linenr_T bot);
void foldUpdateAll (win_T * win);
int foldMoveTo (int updown, int dir, long count);
void foldInitWin (win_T * newwin);
int find_wl_entry (win_T * win, linenr_T lnum);
void foldAdjustVisual (void);
void foldAdjustCursor (void);
void cloneFoldGrowArray (garray_T * from, garray_T * to);
void deleteFoldRecurse (garray_T * gap);
void foldMarkAdjust (win_T * wp, linenr_T line1, linenr_T line2, long amount, long amount_after);
int getDeepestNesting (void);
char_u * get_foldtext (win_T * wp, linenr_T lnum, linenr_T lnume, foldinfo_T * foldinfo, char_u * buf);
void foldtext_cleanup (char_u * str);
int put_folds (FILE * fd, win_T * wp);
void free_buff (struct buffheader * buf);
char_u * get_recorded (void);
char_u * get_inserted (void);
int stuff_empty (void);
void typeahead_noflush (int c);
void flush_buffers (int typeahead);
void ResetRedobuff (void);
void saveRedobuff (void);
void restoreRedobuff (void);
void AppendToRedobuff (char_u * s);
void AppendToRedobuffLit (char_u * str, int len);
void AppendCharToRedobuff (int c);
void AppendNumberToRedobuff (long n);
void stuffReadbuff (char_u * s);
void stuffReadbuffLen (char_u * s, long len);
void stuffReadbuffSpec (char_u * s);
void stuffcharReadbuff (int c);
void stuffnumReadbuff (long n);
int start_redo (long count, int old_redo);
int start_redo_ins (void);
void stop_redo_ins (void);
int ins_typebuf (char_u * str, int noremap, int offset, int nottyped, int silent);
void ins_char_typebuf (int c);
int typebuf_changed (int tb_change_cnt);
int typebuf_typed (void);
int typebuf_maplen (void);
void del_typebuf (int len, int offset);
int alloc_typebuf (void);
void free_typebuf (void);
int save_typebuf (void);
void save_typeahead (tasave_T * tp);
void restore_typeahead (tasave_T * tp);
void openscript (char_u * name, int directly);
void close_all_scripts (void);
int using_script (void);
void before_blocking (void);
void updatescript (int c);
int vgetc (void);
int safe_vgetc (void);
int plain_vgetc (void);
int vpeekc (void);
int vpeekc_nomap (void);
int vpeekc_any (void);
int char_avail (void);
void vungetc (int c);
int inchar (char_u * buf, int maxlen, long wait_time, int tb_change_cnt);
int fix_input_buffer (char_u * buf, int len, int script);
int input_available (void);
int do_map (int maptype, char_u * arg, int mode, int abbrev);
int get_map_mode (char_u * * cmdp, int forceit);
void map_clear (char_u * cmdp, char_u * arg, int forceit, int abbr);
void map_clear_int (buf_T * buf, int mode, int local, int abbr);
int map_to_exists (char_u * str, char_u * modechars, int abbr);
int map_to_exists_mode (char_u * rhs, int mode, int abbr);
char_u * set_context_in_map_cmd (expand_T * xp, char_u * cmd, char_u * arg, int forceit, int isabbrev, int isunmap, cmdidx_T cmdidx);
int ExpandMappings (regmatch_T * regmatch, int * num_file, char_u * * * file);
int check_abbr (int c, char_u * ptr, int col, int mincol);
char_u * vim_strsave_escape_csi (char_u * p);
void vim_unescape_csi (char_u * p);
int makemap (FILE * fd, buf_T * buf);
int put_escstr (FILE * fd, char_u * strstart, int what);
void check_map_keycodes (void);
char_u * check_map (char_u * keys, int mode, int exact, int ign_mod, int abbr);
void init_mappings (void);
void add_map (char_u * map, int mode);
char_u * parse_printoptions (void);
char_u * parse_printmbfont (void);
int prt_header_height (void);
int prt_use_number (void);
int prt_get_unit (int idx);
void ex_hardcopy (exarg_T * eap);
void mch_print_cleanup (void);
int mch_print_init (prt_settings_T * psettings, char_u * jobname, int forceit);
int mch_print_begin (prt_settings_T * psettings);
void mch_print_end (prt_settings_T * psettings);
int mch_print_end_page (void);
int mch_print_begin_page (char_u * str);
int mch_print_blank_page (void);
void mch_print_start_line (int margin, int page_line);
int mch_print_text_out (char_u * p, int len);
void mch_print_set_font (int iBold, int iItalic, int iUnderline);
void mch_print_set_bg (long_u bgcol);
void mch_print_set_fg (long_u fgcol);
void hash_init (hashtab_T * ht);
void hash_clear (hashtab_T * ht);
void hash_clear_all (hashtab_T * ht, int off);
hashitem_T * hash_find (hashtab_T * ht, char_u * key);
hashitem_T * hash_lookup (hashtab_T * ht, char_u * key, hash_T hash);
void hash_debug_results (void);
int hash_add (hashtab_T * ht, char_u * key);
int hash_add_item (hashtab_T * ht, hashitem_T * hi, char_u * key, hash_T hash);
void hash_remove (hashtab_T * ht, hashitem_T * hi);
void hash_lock (hashtab_T * ht);
void hash_unlock (hashtab_T * ht);
hash_T hash_hash (char_u * key);
void main_loop (int cmdwin, int noexmode);
void getout_preserve_modified (int exitval);
void getout (int exitval);
int process_env (char_u * env, int is_viminit);
void mainerr_arg_missing (char_u * str);
void time_push (void * tv_rel, void * tv_start);
void time_pop (void * tp);
void time_msg (char * mesg, void * tv_start);
void server_to_input_buf (char_u * str);
char_u * eval_client_expr_to_string (char_u * expr);
char_u * serverConvert (char_u * client_enc, char_u * data, char_u * * tofree);
int toF_TyA (int c);
int fkmap (int c);
void conv_to_pvim (void);
void conv_to_pstd (void);
char_u * lrswap (char_u * ibuf);
char_u * lrFswap (char_u * cmdbuf, int len);
char_u * lrF_sub (char_u * ibuf);
int cmdl_fkmap (int c);
int F_isalpha (int c);
int F_isdigit (int c);
int F_ischar (int c);
void farsi_fkey (cmdarg_T * cap);
int arabic_shape (int c, int * ccp, int * c1p, int prev_c, int prev_c1, int next_c);
int setmark (int c);
int setmark_pos (int c, pos_T * pos, int fnum);
void setpcmark (void);
void checkpcmark (void);
pos_T * movemark (int count);
pos_T * movechangelist (int count);
pos_T * getmark (int c, int changefile);
pos_T * getmark_fnum (int c, int changefile, int * fnum);
pos_T * getnextmark (pos_T * startpos, int dir, int begin_line);
void fmarks_check_names (buf_T * buf);
int check_mark (pos_T * pos);
void clrallmarks (buf_T * buf);
char_u * fm_getname (fmark_T * fmark, int lead_len);
void do_marks (exarg_T * eap);
void ex_delmarks (exarg_T * eap);
void ex_jumps (exarg_T * eap);
void ex_changes (exarg_T * eap);
void mark_adjust (linenr_T line1, linenr_T line2, long amount, long amount_after);
void mark_col_adjust (linenr_T lnum, colnr_T mincol, long lnum_amount, long col_amount);
void copy_jumplist (win_T * from, win_T * to);
void free_jumplist (win_T * wp);
void set_last_cursor (win_T * win);
void free_all_marks (void);
int read_viminfo_filemark (vir_T * virp, int force);
void write_viminfo_filemarks (FILE * fp);
int removable (char_u * name);
int write_viminfo_marks (FILE * fp_out);
void copy_viminfo_marks (vir_T * virp, FILE * fp_out, int count, int eof, int flags);
memfile_T * mf_open (char_u * fname, int flags);
int mf_open_file (memfile_T * mfp, char_u * fname);
void mf_close (memfile_T * mfp, int del_file);
void mf_close_file (buf_T * buf, int getlines);
void mf_new_page_size (memfile_T * mfp, unsigned new_size);
bhdr_T * mf_new (memfile_T * mfp, int negative, int page_count);
bhdr_T * mf_get (memfile_T * mfp, blocknr_T nr, int page_count);
void mf_put (memfile_T * mfp, bhdr_T * hp, int dirty, int infile);
void mf_free (memfile_T * mfp, bhdr_T * hp);
int mf_sync (memfile_T * mfp, int flags);
void mf_set_dirty (memfile_T * mfp);
int mf_release_all (void);
blocknr_T mf_trans_del (memfile_T * mfp, blocknr_T old_nr);
void mf_set_ffname (memfile_T * mfp);
void mf_fullname (memfile_T * mfp);
int mf_need_trans (memfile_T * mfp);
int ml_open (buf_T * buf);
void ml_set_crypt_key (buf_T * buf, char_u * old_key, int old_cm);
void ml_setname (buf_T * buf);
void ml_open_files (void);
void ml_open_file (buf_T * buf);
void check_need_swap (int newfile);
void ml_close (buf_T * buf, int del_file);
void ml_close_all (int del_file);
void ml_close_notmod (void);
void ml_timestamp (buf_T * buf);
void ml_recover (void);
int recover_names (char_u * fname, int list, int nr, char_u * * fname_out);
void ml_sync_all (int check_file, int check_char);
void ml_preserve (buf_T * buf, int message);
char_u * ml_get (linenr_T lnum);
char_u * ml_get_pos (pos_T * pos);
char_u * ml_get_curline (void);
char_u * ml_get_cursor (void);
char_u * ml_get_buf (buf_T * buf, linenr_T lnum, int will_change);
int ml_line_alloced (void);
int ml_append (linenr_T lnum, char_u * line, colnr_T len, int newfile);
int ml_append_buf (buf_T * buf, linenr_T lnum, char_u * line, colnr_T len, int newfile);
int ml_replace (linenr_T lnum, char_u * line, int copy);
int ml_delete (linenr_T lnum, int message);
void ml_setmarked (linenr_T lnum);
linenr_T ml_firstmarked (void);
void ml_clearmarked (void);
int resolve_symlink (char_u * fname, char_u * buf);
char_u * makeswapname (char_u * fname, char_u * ffname, buf_T * buf, char_u * dir_name);
char_u * get_file_in_dir (char_u * fname, char_u * dname);
void ml_setflags (buf_T * buf);
char_u * ml_encrypt_data (memfile_T * mfp, char_u * data, off_t offset, unsigned size);
void ml_decrypt_data (memfile_T * mfp, char_u * data, off_t offset, unsigned size);
long ml_find_line_or_offset (buf_T * buf, linenr_T lnum, long * offp);
void goto_byte (long cnt);
void ex_menu (exarg_T * eap);
char_u * set_context_in_menu_cmd (expand_T * xp, char_u * cmd, char_u * arg, int forceit);
char_u * get_menu_name (expand_T * xp, int idx);
char_u * get_menu_names (expand_T * xp, int idx);
char_u * menu_name_skip (char_u * name);
int get_menu_index (vimmenu_T * menu, int state);
int menu_is_menubar (char_u * name);
int menu_is_popup (char_u * name);
int menu_is_child_of_popup (vimmenu_T * menu);
int menu_is_toolbar (char_u * name);
int menu_is_separator (char_u * name);
int check_menu_pointer (vimmenu_T * root, vimmenu_T * menu_to_check);
void gui_create_initial_menus (vimmenu_T * menu);
void gui_update_menus (int modes);
int gui_is_menu_shortcut (int key);
void gui_show_popupmenu (void);
void gui_mch_toggle_tearoffs (int enable);
void ex_emenu (exarg_T * eap);
vimmenu_T * gui_find_menu (char_u * path_name);
void ex_menutranslate (exarg_T * eap);
int smsg (char_u *,...);
int smsg_attr (int, char_u *,...);
int vim_snprintf_add (char *, size_t, char *,...);
int vim_snprintf (char *, size_t, char *,...);
int msg (char_u * s);
int verb_msg (char_u * s);
int msg_attr (char_u * s, int attr);
int msg_attr_keep (char_u * s, int attr, int keep);
char_u * msg_strtrunc (char_u * s, int force);
void trunc_string (char_u * s, char_u * buf, int room);
void reset_last_sourcing (void);
void msg_source (int attr);
int emsg_not_now (void);
int emsg (char_u * s);
int emsg2 (char_u * s, char_u * a1);
void emsg_invreg (int name);
char_u * msg_trunc_attr (char_u * s, int force, int attr);
char_u * msg_may_trunc (int force, char_u * s);
int delete_first_msg (void);
void ex_messages (exarg_T * eap);
void msg_end_prompt (void);
void wait_return (int redraw);
void set_keep_msg (char_u * s, int attr);
void set_keep_msg_from_hist (void);
void msg_start (void);
void msg_starthere (void);
void msg_putchar (int c);
void msg_putchar_attr (int c, int attr);
void msg_outnum (long n);
void msg_home_replace (char_u * fname);
void msg_home_replace_hl (char_u * fname);
int msg_outtrans (char_u * str);
int msg_outtrans_attr (char_u * str, int attr);
int msg_outtrans_len (char_u * str, int len);
char_u * msg_outtrans_one (char_u * p, int attr);
int msg_outtrans_len_attr (char_u * msgstr, int len, int attr);
void msg_make (char_u * arg);
int msg_outtrans_special (char_u * strstart, int from);
char_u * str2special (char_u * * sp, int from);
void str2specialbuf (char_u * sp, char_u * buf, int len);
void msg_prt_line (char_u * s, int list);
void msg_puts (char_u * s);
void msg_puts_title (char_u * s);
void msg_puts_long_attr (char_u * longstr, int attr);
void msg_puts_long_len_attr (char_u * longstr, int len, int attr);
void msg_puts_attr (char_u * s, int attr);
void may_clear_sb_text (void);
void clear_sb_text (void);
void show_sb_text (void);
int msg_use_printf (void);
void mch_errmsg (char * str);
void mch_msg (char * str);
void msg_moremsg (int full);
void repeat_message (void);
void msg_clr_eos (void);
void msg_clr_eos_force (void);
void msg_clr_cmdline (void);
int msg_end (void);
void msg_check (void);
int redirecting (void);
void verbose_enter (void);
void verbose_leave (void);
void verbose_enter_scroll (void);
void verbose_leave_scroll (void);
void verbose_stop (void);
int verbose_open (void);
void give_warning (char_u * message, int hl);
void msg_advance (int col);
int do_dialog (int type, char_u * title, char_u * message, char_u * buttons, int dfltbutton, char_u * textfield);
void display_confirm_msg (void);
int vim_dialog_yesno (int type, char_u * title, char_u * message, int dflt);
int vim_dialog_yesnocancel (int type, char_u * title, char_u * message, int dflt);
int vim_dialog_yesnoallcancel (int type, char_u * title, char_u * message, int dflt);
char_u * do_browse (int flags, char_u * title, char_u * dflt, char_u * ext, char_u * initdir, char_u * filter, buf_T * buf);
int get_indent (void);
int get_indent_lnum (linenr_T lnum);
int get_indent_buf (buf_T * buf, linenr_T lnum);
int get_indent_str (char_u * ptr, int ts);
int set_indent (int size, int flags);
int get_number_indent (linenr_T lnum);
int open_line (int dir, int flags, int old_indent);
int get_leader_len (char_u * line, char_u * * flags, int backward);
int plines (linenr_T lnum);
int plines_win (win_T * wp, linenr_T lnum, int winheight);
int plines_nofill (linenr_T lnum);
int plines_win_nofill (win_T * wp, linenr_T lnum, int winheight);
int plines_win_nofold (win_T * wp, linenr_T lnum);
int plines_win_col (win_T * wp, linenr_T lnum, long column);
int plines_m_win (win_T * wp, linenr_T first, linenr_T last);
void ins_bytes (char_u * p);
void ins_bytes_len (char_u * p, int len);
void ins_char (int c);
void ins_char_bytes (char_u * buf, int charlen);
void ins_str (char_u * s);
int del_char (int fixpos);
int del_chars (long count, int fixpos);
int del_bytes (long count, int fixpos_arg, int use_delcombine);
int truncate_line (int fixpos);
void del_lines (long nlines, int undo);
int gchar_pos (pos_T * pos);
int gchar_cursor (void);
void pchar_cursor (int c);
int inindent (int extra);
char_u * skip_to_option_part (char_u * p);
void changed (void);
void changed_int (void);
void changed_bytes (linenr_T lnum, colnr_T col);
void appended_lines (linenr_T lnum, long count);
void appended_lines_mark (linenr_T lnum, long count);
void deleted_lines (linenr_T lnum, long count);
void deleted_lines_mark (linenr_T lnum, long count);
void changed_lines (linenr_T lnum, colnr_T col, linenr_T lnume, long xtra);
void unchanged (buf_T * buf, int ff);
void check_status (buf_T * buf);
void change_warning (int col);
int ask_yesno (char_u * str, int direct);
int get_keystroke (void);
int get_number (int colon, int * mouse_used);
int prompt_for_number (int * mouse_used);
void msgmore (long n);
void beep_flush (void);
void vim_beep (void);
void init_homedir (void);
void free_homedir (void);
char_u * expand_env_save (char_u * src);
char_u * expand_env_save_opt (char_u * src, int one);
void expand_env (char_u * src, char_u * dst, int dstlen);
void expand_env_esc (char_u * srcp, char_u * dst, int dstlen, int esc, int one, char_u * startstr);
char_u * vim_getenv (char_u * name, int * mustfree);
void vim_setenv (char_u * name, char_u * val);
char_u * get_env_name (expand_T * xp, int idx);
void home_replace (buf_T * buf, char_u * src, char_u * dst, int dstlen, int one);
char_u * home_replace_save (buf_T * buf, char_u * src);
int fullpathcmp (char_u * s1, char_u * s2, int checkname);
char_u * gettail (char_u * fname);
char_u * gettail_sep (char_u * fname);
char_u * getnextcomp (char_u * fname);
char_u * get_past_head (char_u * path);
int vim_ispathsep (int c);
int vim_ispathlistsep (int c);
void shorten_dir (char_u * str);
int dir_of_file_exists (char_u * fname);
int vim_fnamecmp (char_u * x, char_u * y);
int vim_fnamencmp (char_u * x, char_u * y, size_t len);
char_u * concat_fnames (char_u * fname1, char_u * fname2, int sep);
char_u * concat_str (char_u * str1, char_u * str2);
void add_pathsep (char_u * p);
char_u * FullName_save (char_u * fname, int force);
pos_T * find_start_comment (int ind_maxcomment);
void do_c_expr_indent (void);
int cin_islabel (int ind_maxcomment);
int cin_iscase (char_u * s, int strict);
int cin_isscopedecl (char_u * s);
int get_c_indent (void);
int get_expr_indent (void);
int get_lisp_indent (void);
void prepare_to_exit (void);
void preserve_exit (void);
int vim_fexists (char_u * fname);
void line_breakcheck (void);
void fast_breakcheck (void);
int expand_wildcards_eval (char_u * * pat, int * num_file, char_u * * * file, int flags);
int expand_wildcards (int num_pat, char_u * * pat, int * num_file, char_u * * * file, int flags);
int match_suffix (char_u * fname);
int unix_expandpath (garray_T * gap, char_u * path, int wildoff, int flags, int didstar);
void remove_duplicates (garray_T * gap);
int gen_expand_wildcards (int num_pat, char_u * * pat, int * num_file, char_u * * * file, int flags);
void addfile (garray_T * gap, char_u * f, int flags);
char_u * get_cmd_output (char_u * cmd, char_u * infile, int flags);
void FreeWild (int count, char_u * * files);
int goto_im (void);
int virtual_active (void);
int getviscol (void);
int getviscol2 (colnr_T col, colnr_T coladd);
int coladvance_force (colnr_T wcol);
int coladvance (colnr_T wcol);
int getvpos (pos_T * pos, colnr_T wcol);
int inc_cursor (void);
int inc (pos_T * lp);
int incl (pos_T * lp);
int dec_cursor (void);
int dec (pos_T * lp);
int decl (pos_T * lp);
linenr_T get_cursor_rel_lnum (win_T * wp, linenr_T lnum);
void check_cursor_lnum (void);
void check_cursor_col (void);
void check_cursor (void);
void adjust_cursor_col (void);
int leftcol_changed (void);
void vim_mem_profile_dump (void);
char_u * alloc (unsigned size);
char_u * alloc_clear (unsigned size);
char_u * alloc_check (unsigned size);
char_u * lalloc_clear (long_u size, int message);
char_u * lalloc (long_u size, int message);
void * mem_realloc (void * ptr, size_t size);
void do_outofmem_msg (long_u size);
void free_all_mem (void);
char_u * vim_strsave (char_u * string);
char_u * vim_strnsave (char_u * string, int len);
char_u * vim_strsave_escaped (char_u * string, char_u * esc_chars);
char_u * vim_strsave_escaped_ext (char_u * string, char_u * esc_chars, int cc, int bsl);
int csh_like_shell (void);
char_u * vim_strsave_shellescape (char_u * string, int do_special);
char_u * vim_strsave_up (char_u * string);
char_u * vim_strnsave_up (char_u * string, int len);
void vim_strup (char_u * p);
char_u * strup_save (char_u * orig);
void copy_spaces (char_u * ptr, size_t count);
void copy_chars (char_u * ptr, size_t count, int c);
void del_trailing_spaces (char_u * ptr);
void vim_strncpy (char_u * to, char_u * from, size_t len);
int copy_option_part (char_u * * option, char_u * buf, int maxlen, char * sep_chars);
void vim_free (void * x);
int vim_stricmp (char * s1, char * s2);
int vim_strnicmp (char * s1, char * s2, size_t len);
char_u * vim_strchr (char_u * string, int c);
char_u * vim_strbyte (char_u * string, int c);
char_u * vim_strrchr (char_u * string, int c);
int vim_isspace (int x);
void ga_clear (garray_T * gap);
void ga_clear_strings (garray_T * gap);
void ga_init (garray_T * gap);
void ga_init2 (garray_T * gap, int itemsize, int growsize);
int ga_grow (garray_T * gap, int n);
char_u * ga_concat_strings (garray_T * gap);
void ga_concat (garray_T * gap, char_u * s);
void ga_append (garray_T * gap, int c);
int name_to_mod_mask (int c);
int simplify_key (int key, int * modifiers);
int handle_x_keys (int key);
char_u * get_special_key_name (int c, int modifiers);
int trans_special (char_u * * srcp, char_u * dst, int keycode);
int find_special_key (char_u * * srcp, int * modp, int keycode, int keep_x_key);
int extract_modifiers (int key, int * modp);
int find_special_key_in_table (int c);
int get_special_key_code (char_u * name);
char_u * get_key_name (int i);
int get_mouse_button (int code, int * is_click, int * is_drag);
int get_pseudo_mouse_code (int button, int is_click, int is_drag);
int get_fileformat (buf_T * buf);
int get_fileformat_force (buf_T * buf, exarg_T * eap);
void set_fileformat (int t, int opt_flags);
int default_fileformat (void);
int call_shell (char_u * cmd, int opt);
int get_real_state (void);
int after_pathsep (char_u * b, char_u * p);
int same_directory (char_u * f1, char_u * f2);
int vim_chdirfile (char_u * fname);
int illegal_slash (char * name);
char_u * parse_shape_opt (int what);
int get_shape_idx (int mouse);
void update_mouseshape (int shape_idx);
int crypt_method_from_string (char_u * s);
int get_crypt_method (buf_T * buf);
void set_crypt_method (buf_T * buf, int method);
void crypt_push_state (void);
void crypt_pop_state (void);
void crypt_encode (char_u * from, size_t len, char_u * to);
void crypt_decode (char_u * ptr, long len);
void crypt_init_keys (char_u * passwd);
void free_crypt_key (char_u * key);
char_u * get_crypt_key (int store, int twice);
void * vim_findfile_init (char_u * path, char_u * filename, char_u * stopdirs, int level, int free_visited, int find_what, void * search_ctx_arg, int tagfile,
  char_u * rel_fname);
char_u * vim_findfile_stopdir (char_u * buf);
void vim_findfile_cleanup (void * ctx);
char_u * vim_findfile (void * search_ctx_arg);
void vim_findfile_free_visited (void * search_ctx_arg);
char_u * find_file_in_path (char_u * ptr, int len, int options, int first, char_u * rel_fname);
char_u * find_directory_in_path (char_u * ptr, int len, int options, char_u * rel_fname);
char_u * find_file_in_path_option (char_u * ptr, int len, int options, int first, char_u * path_option, int find_what, char_u * rel_fname, char_u * suffixes);
int vim_chdir (char_u * new_dir);
int get_user_name (char_u * buf, int len);
void sort_strings (char_u * * files, int count);
int pathcmp (const char * p, const char * q, int maxlen);
int filewritable (char_u * fname);
int emsg3 (char_u * s, char_u * a1, char_u * a2);
int emsgn (char_u * s, long n);
int get2c (FILE * fd);
int get3c (FILE * fd);
int get4c (FILE * fd);
time_t get8ctime (FILE * fd);
char_u * read_string (FILE * fd, int cnt);
int put_bytes (FILE * fd, long_u nr, int len);
void put_time (FILE * fd, time_t the_time);
char_u * vim_strpbrk (char_u * s, char_u * charset);
void qsort (void * base, size_t elm_count, size_t elm_size, int (* cmp) (const void *, const void *));
void update_topline_redraw (void);
void update_topline (void);
void update_curswant (void);
void check_cursor_moved (win_T * wp);
void changed_window_setting (void);
void changed_window_setting_win (win_T * wp);
void set_topline (win_T * wp, linenr_T lnum);
void changed_cline_bef_curs (void);
void changed_cline_bef_curs_win (win_T * wp);
void changed_line_abv_curs (void);
void changed_line_abv_curs_win (win_T * wp);
void validate_botline (void);
void invalidate_botline (void);
void invalidate_botline_win (win_T * wp);
void approximate_botline_win (win_T * wp);
int cursor_valid (void);
void validate_cursor (void);
void validate_cline_row (void);
void validate_virtcol (void);
void validate_virtcol_win (win_T * wp);
void validate_cursor_col (void);
int win_col_off (win_T * wp);
int curwin_col_off (void);
int win_col_off2 (win_T * wp);
int curwin_col_off2 (void);
void curs_columns (int scroll);
void scrolldown (long line_count, int byfold);
void scrollup (long line_count, int byfold);
void check_topfill (win_T * wp, int down);
void scrolldown_clamp (void);
void scrollup_clamp (void);
void scroll_cursor_top (int min_scroll, int always);
void set_empty_rows (win_T * wp, int used);
void scroll_cursor_bot (int min_scroll, int set_topbot);
void scroll_cursor_halfway (int atend);
void cursor_correct (void);
int onepage (int dir, long count);
void halfpage (int flag, linenr_T Prenum);
void do_check_cursorbind (void);
int enc_canon_props (char_u * name);
char_u * mb_init (void);
int bomb_size (void);
int mb_get_class (char_u * p);
int dbcs_class (unsigned lead, unsigned trail);
int latin_char2len (int c);
int latin_char2bytes (int c, char_u * buf);
int latin_ptr2len (char_u * p);
int latin_ptr2len_len (char_u * p, int size);
int utf_char2cells (int c);
int latin_ptr2cells (char_u * p);
int utf_ptr2cells (char_u * p);
int dbcs_ptr2cells (char_u * p);
int latin_ptr2cells_len (char_u * p, int size);
int latin_char2cells (int c);
int mb_string2cells (char_u * p, int len);
int latin_off2cells (unsigned off, unsigned max_off);
int dbcs_off2cells (unsigned off, unsigned max_off);
int utf_off2cells (unsigned off, unsigned max_off);
int latin_ptr2char (char_u * p);
int utf_ptr2char (char_u * p);
int mb_ptr2char_adv (char_u * * pp);
int mb_cptr2char_adv (char_u * * pp);
int arabic_combine (int one, int two);
int arabic_maycombine (int two);
int utf_composinglike (char_u * p1, char_u * p2);
int utfc_ptr2char (char_u * p, int * pcc);
int utfc_ptr2char_len (char_u * p, int * pcc, int maxlen);
int utfc_char2bytes (int off, char_u * buf);
int utf_ptr2len (char_u * p);
int utf_byte2len (int b);
int utf_ptr2len_len (char_u * p, int size);
int utfc_ptr2len (char_u * p);
int utfc_ptr2len_len (char_u * p, int size);
int utf_char2len (int c);
int utf_char2bytes (int c, char_u * buf);
int utf_iscomposing (int c);
int utf_printable (int c);
int utf_class (int c);
int utf_fold (int a);
int utf_toupper (int a);
int utf_islower (int a);
int utf_tolower (int a);
int utf_isupper (int a);
int mb_strnicmp (char_u * s1, char_u * s2, size_t nn);
void show_utf8 (void);
int latin_head_off (char_u * base, char_u * p);
int dbcs_head_off (char_u * base, char_u * p);
int dbcs_screen_head_off (char_u * base, char_u * p);
int utf_head_off (char_u * base, char_u * p);
void mb_copy_char (char_u * * fp, char_u * * tp);
int mb_off_next (char_u * base, char_u * p);
int mb_tail_off (char_u * base, char_u * p);
void utf_find_illegal (void);
int utf_valid_string (char_u * s, char_u * end);
int dbcs_screen_tail_off (char_u * base, char_u * p);
void mb_adjust_cursor (void);
void mb_adjustpos (pos_T * lp);
char_u * mb_prevptr (char_u * line, char_u * p);
int mb_charlen (char_u * str);
int mb_charlen_len (char_u * str, int len);
char_u * mb_unescape (char_u * * pp);
int mb_lefthalve (int row, int col);
int mb_fix_col (int col, int row);
char_u * enc_skip (char_u * p);
char_u * enc_canonize (char_u * enc);
char_u * enc_locale (void);
int encname2codepage (char_u * name);
void * my_iconv_open (char_u * to, char_u * from);
int iconv_enabled (int verbose);
void iconv_end (void);
void im_set_active (int active);
void xim_set_focus (int focus);
void im_set_position (int row, int col);
void xim_set_preedit (void);
int im_get_feedback_attr (int col);
void xim_init (void);
void im_shutdown (void);
int im_xim_isvalid_imactivate (void);
void xim_reset (void);
int xim_queue_key_press_event (int * event, int down);
int im_get_status (void);
int preedit_get_status (void);
int im_is_preediting (void);
void xim_set_status_area (void);
int xim_get_status_area_height (void);
int convert_setup (vimconv_T * vcp, char_u * from, char_u * to);
int convert_setup_ext (vimconv_T * vcp, char_u * from, int from_unicode_is_utf8, char_u * to, int to_unicode_is_utf8);
int convert_input (char_u * ptr, int len, int maxlen);
int convert_input_safe (char_u * ptr, int len, int maxlen, char_u * * restp, int * restlenp);
char_u * string_convert (vimconv_T * vcp, char_u * ptr, int * lenp);
char_u * string_convert_ext (vimconv_T * vcp, char_u * ptr, int * lenp, int * unconvlenp);
void init_normal_cmds (void);
void normal_cmd (oparg_T * oap, int toplevel);
void do_pending_operator (cmdarg_T * cap, int old_col, int gui_yank);
int do_mouse (oparg_T * oap, int c, int dir, long count, int fixindent);
void check_visual_highlight (void);
void end_visual_mode (void);
void reset_VIsual_and_resel (void);
void reset_VIsual (void);
int find_ident_under_cursor (char_u * * string, int find_type);
int find_ident_at_pos (win_T * wp, linenr_T lnum, colnr_T startcol, char_u * * string, int find_type);
void clear_showcmd (void);
int add_to_showcmd (int c);
void add_to_showcmd_c (int c);
void push_showcmd (void);
void pop_showcmd (void);
void do_check_scrollbind (int check);
void check_scrollbind (linenr_T topline_diff, long leftcol_diff);
int find_decl (char_u * ptr, int len, int locally, int thisblock, int searchflags);
void scroll_redraw (int up, long count);
void handle_tabmenu (void);
void do_nv_ident (int c1, int c2);
int get_visual_text (cmdarg_T * cap, char_u * * pp, int * lenp);
void start_selection (void);
void may_start_select (int c);
int get_op_type (int char1, int char2);
int op_on_lines (int op);
int get_op_char (int optype);
int get_extra_op_char (int optype);
void op_shift (oparg_T * oap, int curs_top, int amount);
void shift_line (int left, int round, int amount, int call_changed_bytes);
void op_reindent (oparg_T * oap, int (* how) (void));
int get_expr_register (void);
void set_expr_line (char_u * new_line);
char_u * get_expr_line (void);
char_u * get_expr_line_src (void);
int valid_yank_reg (int regname, int writing);
void get_yank_register (int regname, int writing);
int may_get_selection (int regname);
void * get_register (int name, int copy);
void put_register (int name, void * reg);
int yank_register_mline (int regname);
int do_record (int c);
int do_execreg (int regname, int colon, int addcr, int silent);
int insert_reg (int regname, int literally);
int get_spec_reg (int regname, char_u * * argp, int * allocated, int errmsg);
int cmdline_paste_reg (int regname, int literally, int remcr);
void adjust_clip_reg (int * rp);
int op_delete (oparg_T * oap);
int op_replace (oparg_T * oap, int c);
void op_tilde (oparg_T * oap);
int swapchar (int op_type, pos_T * pos);
void op_insert (oparg_T * oap, long count1);
int op_change (oparg_T * oap);
void init_yank (void);
void clear_registers (void);
int op_yank (oparg_T * oap, int deleting, int mess);
void do_put (int regname, int dir, long count, int flags);
void adjust_cursor_eol (void);
int preprocs_left (void);
int get_register_name (int num);
void ex_display (exarg_T * eap);
int do_join (long count, int insert_space, int save_undo);
void op_format (oparg_T * oap, int keep_cursor);
void op_formatexpr (oparg_T * oap);
int fex_format (linenr_T lnum, long count, int c);
void format_lines (linenr_T line_count, int avoid_fex);
int paragraph_start (linenr_T lnum);
int do_addsub (int command, linenr_T Prenum1);
int read_viminfo_register (vir_T * virp, int force);
void write_viminfo_registers (FILE * fp);
void x11_export_final_selection (void);
void clip_free_selection (VimClipboard * cbd);
void clip_get_selection (VimClipboard * cbd);
void clip_yank_selection (int type, char_u * str, long len, VimClipboard * cbd);
int clip_convert_selection (char_u * * str, long_u * len, VimClipboard * cbd);
void dnd_yank_drag_data (char_u * str, long len);
char_u get_reg_type (int regname, long * reglen);
char_u * get_reg_contents (int regname, int allowexpr, int expr_src);
void write_reg_contents (int name, char_u * str, int maxlen, int must_append);
void write_reg_contents_ex (int name, char_u * str, int maxlen, int must_append, int yank_type, long block_len);
void clear_oparg (oparg_T * oap);
void cursor_pos_info (void);
void set_init_1 (void);
void set_string_default (char * name, char_u * val);
void set_number_default (char * name, long val);
void free_all_options (void);
void set_init_2 (void);
void set_init_3 (void);
void set_helplang_default (char_u * lang);
void init_gui_options (void);
void set_title_defaults (void);
int do_set (char_u * arg, int opt_flags);
void set_options_bin (int oldval, int newval, int opt_flags);
int get_viminfo_parameter (int type);
char_u * find_viminfo_parameter (int type);
void check_options (void);
void check_buf_options (buf_T * buf);
void free_string_option (char_u * p);
void clear_string_option (char_u * * pp);
void set_term_option_alloced (char_u * * p);
int was_set_insecurely (char_u * opt, int opt_flags);
void set_string_option_direct (char_u * name, int opt_idx, char_u * val, int opt_flags, int set_sid);
char_u * check_colorcolumn (win_T * wp);
char_u * check_stl_option (char_u * s);
int get_option_value (char_u * name, long * numval, char_u * * stringval, int opt_flags);
void set_option_value (char_u * name, long number, char_u * string, int opt_flags);
char_u * get_term_code (char_u * tname);
char_u * get_highlight_default (void);
char_u * get_encoding_default (void);
int makeset (FILE * fd, int opt_flags, int local_only);
int makefoldset (FILE * fd);
void clear_termoptions (void);
void free_termoptions (void);
void free_one_termoption (char_u * var);
void set_term_defaults (void);
void comp_col (void);
char_u * get_equalprg (void);
void win_copy_options (win_T * wp_from, win_T * wp_to);
void copy_winopt (winopt_T * from, winopt_T * to);
void check_win_options (win_T * win);
void check_winopt (winopt_T * wop);
void clear_winopt (winopt_T * wop);
void buf_copy_options (buf_T * buf, int flags);
void reset_modifiable (void);
void set_iminsert_global (void);
void set_imsearch_global (void);
void set_context_in_set_cmd (expand_T * xp, char_u * arg, int opt_flags);
int ExpandSettings (expand_T * xp, regmatch_T * regmatch, int * num_file, char_u * * * file);
int ExpandOldSetting (int * num_file, char_u * * * file);
int langmap_adjust_mb (int c);
int has_format_option (int x);
int shortmess (int x);
void vimrc_found (char_u * fname, char_u * envname);
void change_compatible (int on);
int option_was_set (char_u * name);
int can_bs (int what);
void save_file_ff (buf_T * buf);
int file_ff_differs (buf_T * buf);
int check_ff_value (char_u * p);
void pum_display (pumitem_T * array, int size, int selected);
void pum_redraw (void);
void pum_undisplay (void);
void pum_clear (void);
int pum_visible (void);
int pum_get_height (void);
int qf_init (win_T * wp, char_u * efile, char_u * errorformat, int newlist, char_u * qf_title);
void qf_free_all (win_T * wp);
void copy_loclist (win_T * from, win_T * to);
void qf_jump (qf_info_T * qi, int dir, int errornr, int forceit);
void qf_list (exarg_T * eap);
void qf_age (exarg_T * eap);
void qf_mark_adjust (win_T * wp, linenr_T line1, linenr_T line2, long amount, long amount_after);
void ex_cwindow (exarg_T * eap);
void ex_cclose (exarg_T * eap);
void ex_copen (exarg_T * eap);
linenr_T qf_current_entry (win_T * wp);
int bt_quickfix (buf_T * buf);
int bt_nofile (buf_T * buf);
int bt_dontwrite (buf_T * buf);
int bt_dontwrite_msg (buf_T * buf);
int buf_hide (buf_T * buf);
int grep_internal (cmdidx_T cmdidx);
void ex_make (exarg_T * eap);
void ex_cc (exarg_T * eap);
void ex_cnext (exarg_T * eap);
void ex_cfile (exarg_T * eap);
void ex_vimgrep (exarg_T * eap);
char_u * skip_vimgrep_pat (char_u * p, char_u * * s, int * flags);
int get_errorlist (win_T * wp, list_T * list);
int set_errorlist (win_T * wp, list_T * list, int action, char_u * title);
void ex_cbuffer (exarg_T * eap);
void ex_cexpr (exarg_T * eap);
void ex_helpgrep (exarg_T * eap);
int re_multiline (regprog_T * prog);
int re_lookbehind (regprog_T * prog);
char_u * skip_regexp (char_u * startp, int dirc, int magic, char_u * * newp);
regprog_T * vim_regcomp (char_u * expr, int re_flags);
int vim_regcomp_had_eol (void);
void free_regexp_stuff (void);
int vim_regexec (regmatch_T * rmp, char_u * line, colnr_T col);
int vim_regexec_nl (regmatch_T * rmp, char_u * line, colnr_T col);
long vim_regexec_multi (regmmatch_T * rmp, win_T * win, buf_T * buf, linenr_T lnum, colnr_T col, proftime_T * tm);
reg_extmatch_T * ref_extmatch (reg_extmatch_T * em);
void unref_extmatch (reg_extmatch_T * em);
char_u * regtilde (char_u * source, int magic);
int vim_regsub (regmatch_T * rmp, char_u * source, char_u * dest, int copy, int magic, int backslash);
int vim_regsub_multi (regmmatch_T * rmp, linenr_T lnum, char_u * source, char_u * dest, int copy, int magic, int backslash);
char_u * reg_submatch (int no);
void redraw_later (int type);
void redraw_win_later (win_T * wp, int type);
void redraw_later_clear (void);
void redraw_all_later (int type);
void redraw_curbuf_later (int type);
void redraw_buf_later (buf_T * buf, int type);
void redrawWinline (linenr_T lnum, int invalid);
void update_curbuf (int type);
void update_screen (int type);
int conceal_cursor_line (win_T * wp);
void conceal_check_cursur_line (void);
void update_single_line (win_T * wp, linenr_T lnum);
void update_debug_sign (buf_T * buf, linenr_T lnum);
void updateWindow (win_T * wp);
void rl_mirror (char_u * str);
void status_redraw_all (void);
void status_redraw_curbuf (void);
void redraw_statuslines (void);
void win_redraw_last_status (frame_T * frp);
void win_redr_status_matches (expand_T * xp, int num_matches, char_u * * matches, int match, int showtail);
void win_redr_status (win_T * wp);
int stl_connected (win_T * wp);
int get_keymap_str (win_T * wp, char_u * buf, int len);
void screen_putchar (int c, int row, int col, int attr);
void screen_getbytes (int row, int col, char_u * bytes, int * attrp);
void screen_puts (char_u * text, int row, int col, int attr);
void screen_puts_len (char_u * text, int len, int row, int col, int attr);
void screen_stop_highlight (void);
void reset_cterm_colors (void);
void screen_draw_rectangle (int row, int col, int height, int width, int invert);
void screen_fill (int start_row, int end_row, int start_col, int end_col, int c1, int c2, int attr);
void check_for_delay (int check_msg_scroll);
int screen_valid (int clear);
void screenalloc (int clear);
void free_screenlines (void);
void screenclear (void);
int can_clear (char_u * p);
void screen_start (void);
void windgoto (int row, int col);
void setcursor (void);
int win_ins_lines (win_T * wp, int row, int line_count, int invalid, int mayclear);
int win_del_lines (win_T * wp, int row, int line_count, int invalid, int mayclear);
int screen_ins_lines (int off, int row, int line_count, int end, win_T * wp);
int screen_del_lines (int off, int row, int line_count, int end, int force, win_T * wp);
int showmode (void);
void unshowmode (int force);
void get_trans_bufname (buf_T * buf);
int redrawing (void);
int messaging (void);
void showruler (int always);
int number_width (win_T * wp);
void sha256_start (context_sha256_T * ctx);
void sha256_update (context_sha256_T * ctx, char_u * input, UINT32_T length);
void sha256_finish (context_sha256_T * ctx, char_u digest [32]);
char_u * sha256_key (char_u * buf, char_u * salt, int salt_len);
int sha256_self_test (void);
void sha2_seed (char_u * header, int header_len, char_u * salt, int salt_len);
int search_regcomp (char_u * pat, int pat_save, int pat_use, int options, regmmatch_T * regmatch);
char_u * get_search_pat (void);
char_u * reverse_text (char_u * s);
void save_search_patterns (void);
void restore_search_patterns (void);
void free_search_patterns (void);
int ignorecase (char_u * pat);
int pat_has_uppercase (char_u * pat);
char_u * last_search_pat (void);
void reset_search_dir (void);
void set_last_search_pat (char_u * s, int idx, int magic, int setlast);
void last_pat_prog (regmmatch_T * regmatch);
int searchit (win_T * win, buf_T * buf, pos_T * pos, int dir, char_u * pat, long count, int options, int pat_use, linenr_T stop_lnum, proftime_T * tm);
void set_search_direction (int cdir);
int do_search (oparg_T * oap, int dirc, char_u * pat, long count, int options, proftime_T * tm);
int search_for_exact_line (buf_T * buf, pos_T * pos, int dir, char_u * pat);
int searchc (cmdarg_T * cap, int t_cmd);
pos_T * findmatch (oparg_T * oap, int initc);
pos_T * findmatchlimit (oparg_T * oap, int initc, int flags, int maxtravel);
void showmatch (int c);
int findsent (int dir, long count);
int findpar (int * pincl, int dir, long count, int what, int both);
int startPS (linenr_T lnum, int para, int both);
int fwd_word (long count, int bigword, int eol);
int bck_word (long count, int bigword, int stop);
int end_word (long count, int bigword, int stop, int empty);
int bckend_word (long count, int bigword, int eol);
int current_word (oparg_T * oap, long count, int include, int bigword);
int current_sent (oparg_T * oap, long count, int include);
int current_block (oparg_T * oap, long count, int include, int what, int other);
int current_tagblock (oparg_T * oap, long count_arg, int include);
int current_par (oparg_T * oap, long count, int include, int type);
int current_quote (oparg_T * oap, long count, int include, int quotechar);
int linewhite (linenr_T lnum);
void find_pattern_in_path (char_u * ptr, int dir, int len, int whole, int skip_comments, int type, long count, int action, linenr_T start_lnum, linenr_T
  end_lnum);
int read_viminfo_search_pattern (vir_T * virp, int force);
void write_viminfo_search_pattern (FILE * fp);
int spell_check (win_T * wp, char_u * ptr, hlf_T * attrp, int * capcol, int docount);
int spell_move_to (win_T * wp, int dir, int allwords, int curline, hlf_T * attrp);
void spell_cat_line (char_u * buf, char_u * line, int maxlen);
char_u * did_set_spelllang (win_T * wp);
void spell_free_all (void);
void spell_reload (void);
int spell_check_msm (void);
void ex_mkspell (exarg_T * eap);
void ex_spell (exarg_T * eap);
void spell_add_word (char_u * word, int len, int bad, int idx, int undo);
void init_spell_chartab (void);
int spell_check_sps (void);
void spell_suggest (int count);
void ex_spellrepall (exarg_T * eap);
void spell_suggest_list (garray_T * gap, char_u * word, int maxcount, int need_cap, int interactive);
char_u * eval_soundfold (char_u * word);
void ex_spellinfo (exarg_T * eap);
void ex_spelldump (exarg_T * eap);
void spell_dump_compl (char_u * pat, int ic, int * dir, int dumpflags_arg);
char_u * spell_to_word_end (char_u * start, win_T * win);
int spell_word_start (int startcol);
void spell_expand_check_cap (colnr_T col);
int expand_spelling (linenr_T lnum, char_u * pat, char_u * * * matchp);
void syntax_start (win_T * wp, linenr_T lnum);
void syn_stack_free_all (synblock_T * block);
void syn_stack_apply_changes (buf_T * buf);
void syntax_end_parsing (linenr_T lnum);
int syntax_check_changed (linenr_T lnum);
int get_syntax_attr (colnr_T col, int * can_spell, int keep_state);
void syntax_clear (synblock_T * block);
void reset_synblock (win_T * wp);
void ex_syntax (exarg_T * eap);
void ex_ownsyntax (exarg_T * eap);
int syntax_present (win_T * win);
void reset_expand_highlight (void);
void set_context_in_echohl_cmd (expand_T * xp, char_u * arg);
void set_context_in_syntax_cmd (expand_T * xp, char_u * arg);
char_u * get_syntax_name (expand_T * xp, int idx);
int syn_get_id (win_T * wp, long lnum, colnr_T col, int trans, int * spellp, int keep_state);
int get_syntax_info (int * seqnrp);
int syn_get_sub_char (void);
int syn_get_stack_item (int i);
int syn_get_foldlevel (win_T * wp, long lnum);
void init_highlight (int both, int reset);
int load_colors (char_u * name);
void do_highlight (char_u * line, int forceit, int init);
void free_highlight (void);
void restore_cterm_colors (void);
void set_normal_colors (void);
char_u * hl_get_font_name (void);
void hl_set_font_name (char_u * font_name);
void hl_set_bg_color_name (char_u * name);
void hl_set_fg_color_name (char_u * name);
void clear_hl_tables (void);
int hl_combine_attr (int char_attr, int prim_attr);
attrentry_T * syn_gui_attr2entry (int attr);
int syn_attr2attr (int attr);
attrentry_T * syn_term_attr2entry (int attr);
attrentry_T * syn_cterm_attr2entry (int attr);
char_u * highlight_has_attr (int id, int flag, int modec);
char_u * highlight_color (int id, char_u * what, int modec);
long_u highlight_gui_color_rgb (int id, int fg);
int syn_name2id (char_u * name);
int highlight_exists (char_u * name);
char_u * syn_id2name (int id);
int syn_namen2id (char_u * linep, int len);
int syn_check_group (char_u * pp, int len);
int syn_id2attr (int hl_id);
int syn_id2colors (int hl_id, int * fgp, int * bgp);
int syn_get_final_id (int hl_id);
void highlight_gui_started (void);
int highlight_changed (void);
void set_context_in_highlight_cmd (expand_T * xp, char_u * arg);
char_u * get_highlight_name (expand_T * xp, int idx);
void free_highlight_fonts (void);
int do_tag (char_u * tag, int type, int count, int forceit, int verbose);
void tag_freematch (void);
void do_tags (exarg_T * eap);
int find_tags (char_u * pat, int * num_matches, char_u * * * matchesp, int flags, int mincount, char_u * buf_ffname);
void free_tag_stuff (void);
int get_tagfname (tagname_T * tnp, int first, char_u * buf);
void tagname_free (tagname_T * tnp);
void simplify_filename (char_u * filename);
int expand_tags (int tagnames, char_u * pat, int * num_file, char_u * * * file);
int get_tags (list_T * list, char_u * pat);
int set_termname (char_u * term);
void set_mouse_termcode (int n, char_u * s);
void del_mouse_termcode (int n);
void getlinecol (long * cp, long * rp);
int add_termcap_entry (char_u * name, int force);
int term_is_8bit (char_u * name);
int term_is_gui (char_u * name);
char_u * tltoa (unsigned long i);
void termcapinit (char_u * name);
void out_flush (void);
void out_flush_check (void);
void out_trash (void);
void out_char (unsigned c);
void out_str_nf (char_u * s);
void out_str (char_u * s);
void term_windgoto (int row, int col);
void term_cursor_right (int i);
void term_append_lines (int line_count);
void term_delete_lines (int line_count);
void term_set_winpos (int x, int y);
void term_set_winsize (int width, int height);
void term_fg_color (int n);
void term_bg_color (int n);
void term_settitle (char_u * title);
void ttest (int pairs);
void add_long_to_buf (long_u val, char_u * dst);
void check_shellsize (void);
void win_new_shellsize (void);
void shell_resized (void);
void shell_resized_check (void);
void set_shellsize (int width, int height, int mustset);
void settmode (int tmode);
void starttermcap (void);
void stoptermcap (void);
void may_req_termresponse (void);
int swapping_screen (void);
void setmouse (void);
int mouse_has (int c);
int mouse_model_popup (void);
void scroll_start (void);
void cursor_on (void);
void cursor_off (void);
void term_cursor_shape (void);
void scroll_region_set (win_T * wp, int off);
void scroll_region_reset (void);
void clear_termcodes (void);
void add_termcode (char_u * name, char_u * string, int flags);
char_u * find_termcode (char_u * name);
char_u * get_termcode (int i);
void del_termcode (char_u * name);
void set_mouse_topline (win_T * wp);
int check_termcode (int max_offset, char_u * buf, int buflen);
char_u * replace_termcodes (char_u * from, char_u * * bufp, int from_part, int do_lt, int special);
int find_term_bykeys (char_u * src);
void show_termcodes (void);
int show_one_termcode (char_u * name, char_u * code, int printit);
char_u * translate_mapping (char_u * str, int expmap);
void update_tcap (int attr);
void ui_write (char_u * s, int len);
void ui_inchar_undo (char_u * s, int len);
int ui_inchar (char_u * buf, int maxlen, long wtime, int tb_change_cnt);
int ui_char_avail (void);
void ui_delay (long msec, int ignoreinput);
void ui_suspend (void);
void suspend_shell (void);
int ui_get_shellsize (void);
void ui_set_shellsize (int mustset);
void ui_new_shellsize (void);
void ui_breakcheck (void);
void clip_init (int can_use);
void clip_update_selection (void);
void clip_own_selection (VimClipboard * cbd);
void clip_lose_selection (VimClipboard * cbd);
void clip_copy_selection (void);
void clip_auto_select (void);
int clip_isautosel (void);
void clip_modeless (int button, int is_click, int is_drag);
void clip_start_selection (int col, int row, int repeated_click);
void clip_process_selection (int button, int col, int row, int_u repeated_click);
void clip_may_redraw_selection (int row, int col, int len);
void clip_clear_selection (void);
void clip_may_clear_selection (int row1, int row2);
void clip_scroll_selection (int rows);
void clip_copy_modeless_selection (int both);
int clip_gen_own_selection (VimClipboard * cbd);
void clip_gen_lose_selection (VimClipboard * cbd);
void clip_gen_set_selection (VimClipboard * cbd);
void clip_gen_request_selection (VimClipboard * cbd);
int vim_is_input_buf_full (void);
int vim_is_input_buf_empty (void);
int vim_free_in_input_buf (void);
int vim_used_in_input_buf (void);
char_u * get_input_buf (void);
void set_input_buf (char_u * p);
void add_to_input_buf (char_u * s, int len);
void add_to_input_buf_csi (char_u * str, int len);
void push_raw_key (char_u * s, int len);
void trash_input_buf (void);
int read_from_input_buf (char_u * buf, long maxlen);
void fill_input_buf (int exit_on_error);
void read_error_exit (void);
void ui_cursor_shape (void);
int check_col (int col);
int check_row (int row);
void open_app_context (void);
void x11_setup_atoms (int * dpy);
void x11_setup_selection (int w);
void clip_x11_request_selection (int myShell, int * dpy, VimClipboard * cbd);
void clip_x11_lose_selection (int myShell, VimClipboard * cbd);
int clip_x11_own_selection (int myShell, VimClipboard * cbd);
void clip_x11_set_selection (VimClipboard * cbd);
void yank_cut_buffer0 (int * dpy, VimClipboard * cbd);
int jump_to_mouse (int flags, int * inclusive, int which_button);
int mouse_comp_pos (win_T * win, int * rowp, int * colp, linenr_T * lnump);
win_T * mouse_find_win (int * rowp, int * colp);
int get_fpos_of_mouse (pos_T * mpos);
int vcol2col (win_T * wp, linenr_T lnum, int vcol);
void ui_focus_change (int in_focus);
void im_save_status (long * psave);
int u_save_cursor (void);
int u_save (linenr_T top, linenr_T bot);
int u_savesub (linenr_T lnum);
int u_inssub (linenr_T lnum);
int u_savedel (linenr_T lnum, long nlines);
int undo_allowed (void);
int u_savecommon (linenr_T top, linenr_T bot, linenr_T newbot, int reload);
void u_compute_hash (char_u * hash);
char_u * u_get_undo_file_name (char_u * buf_ffname, int reading);
void u_write_undo (char_u * name, int forceit, buf_T * buf, char_u * hash);
void u_read_undo (char_u * name, char_u * hash, char_u * orig_name);
void u_undo (int count);
void u_redo (int count);
void undo_time (long step, int sec, int file, int absolute);
void u_sync (int force);
void ex_undolist (exarg_T * eap);
void ex_undojoin (exarg_T * eap);
void u_unchanged (buf_T * buf);
void u_find_first_changed (void);
void u_update_save_nr (buf_T * buf);
void u_clearall (buf_T * buf);
void u_saveline (linenr_T lnum);
void u_clearline (void);
void u_undoline (void);
void u_blockfree (buf_T * buf);
int bufIsChanged (buf_T * buf);
int curbufIsChanged (void);
void u_eval_tree (u_header_T * first_uhp, list_T * list);
void make_version (void);
int highest_patch (void);
int has_patch (int n);
void ex_version (exarg_T * eap);
void list_version (void);
void intro_message (int colon);
void ex_intro (exarg_T * eap);
void do_window (int nchar, long Prenum, int xchar);
int win_split (int size, int flags);
int win_split_ins (int size, int flags, win_T * newwin, int dir);
int win_valid (win_T * win);
int win_count (void);
int make_windows (int count, int vertical);
void win_move_after (win_T * win1, win_T * win2);
void win_equal (win_T * next_curwin, int current, int dir);
void close_windows (buf_T * buf, int keep_curwin);
void win_close (win_T * win, int free_buf);
void win_close_othertab (win_T * win, int free_buf, tabpage_T * tp);
void win_free_all (void);
win_T * winframe_remove (win_T * win, int * dirp, tabpage_T * tp);
void close_others (int message, int forceit);
void curwin_init (void);
void win_init_empty (win_T * wp);
int win_alloc_first (void);
void win_alloc_aucmd_win (void);
void win_init_size (void);
void free_tabpage (tabpage_T * tp);
int win_new_tabpage (int after);
int may_open_tabpage (void);
int make_tabpages (int maxcount);
int valid_tabpage (tabpage_T * tpc);
tabpage_T * find_tabpage (int n);
int tabpage_index (tabpage_T * ftp);
void goto_tabpage (int n);
void goto_tabpage_tp (tabpage_T * tp);
void goto_tabpage_win (tabpage_T * tp, win_T * wp);
void tabpage_move (int nr);
void win_goto (win_T * wp);
win_T * win_find_nr (int winnr);
void win_enter (win_T * wp, int undo_sync);
win_T * buf_jump_open_win (buf_T * buf);
win_T * buf_jump_open_tab (buf_T * buf);
void win_append (win_T * after, win_T * wp);
void win_remove (win_T * wp, tabpage_T * tp);
int win_alloc_lines (win_T * wp);
void win_free_lsize (win_T * wp);
void shell_new_rows (void);
void shell_new_columns (void);
void win_size_save (garray_T * gap);
void win_size_restore (garray_T * gap);
int win_comp_pos (void);
void win_setheight (int height);
void win_setheight_win (int height, win_T * win);
void win_setwidth (int width);
void win_setwidth_win (int width, win_T * wp);
void win_setminheight (void);
void win_drag_status_line (win_T * dragwin, int offset);
void win_drag_vsep_line (win_T * dragwin, int offset);
void win_comp_scroll (win_T * wp);
void command_height (void);
void last_status (int morewin);
int tabline_height (void);
char_u * grab_file_name (long count, linenr_T * file_lnum);
char_u * file_name_at_cursor (int options, long count, linenr_T * file_lnum);
char_u * file_name_in_line (char_u * line, int col, int options, long count, char_u * rel_fname, linenr_T * file_lnum);
char_u * find_file_name_in_path (char_u * ptr, int len, int options, long count, char_u * rel_fname);
int path_with_url (char_u * fname);
int vim_isAbsName (char_u * name);
int vim_FullName (char_u * fname, char_u * buf, int len, int force);
int min_rows (void);
int only_one_window (void);
void check_lnums (int do_curwin);
void make_snapshot (int idx);
void restore_snapshot (int idx, int close_curwin);
int win_hasvertsplit (void);
int match_add (win_T * wp, char_u * grp, char_u * pat, int prio, int id);
int match_delete (win_T * wp, int id, int perr);
void clear_matches (win_T * wp);
matchitem_T * get_match (win_T * wp, int id);
extern long Rows;
extern long Columns;
extern schar_T * ScreenLines;
extern sattr_T * ScreenAttrs;
extern unsigned * LineOffset;
extern char_u * LineWraps;
extern short * TabPageIdxs;
extern int screen_Rows;
extern int screen_Columns;
extern int mod_mask;
extern int cmdline_row;
extern int redraw_cmdline;
extern int clear_cmdline;
extern int mode_displayed;
extern int cmdline_star;
extern int exec_from_reg;
extern int screen_cleared;
extern int use_crypt_method;
extern colnr_T dollar_vcol;
extern int compl_length;
extern int compl_interrupted;
extern int compl_cont_status;
extern int msg_col;
extern int msg_row;
extern int msg_scrolled;
extern int msg_scrolled_ign;
extern char_u * keep_msg;
extern int keep_msg_attr;
extern int keep_msg_more;
extern int need_fileinfo;
extern int msg_scroll;
extern int msg_didout;
extern int msg_didany;
extern int msg_nowait;
extern int emsg_off;
extern int info_message;
extern int msg_hist_off;
extern int need_clr_eos;
extern int emsg_skip;
extern int emsg_severe;
extern int did_endif;
extern int did_emsg;
extern int called_emsg;
extern int ex_exitval;
extern int emsg_on_display;
extern int rc_did_emsg;
extern int no_wait_return;
extern int need_wait_return;
extern int did_wait_return;
extern int need_maketitle;
extern int quit_more;
extern int ex_keep_indent;
extern int vgetc_busy;
extern int didset_vim;
extern int didset_vimruntime;
extern int lines_left;
extern int msg_no_more;
extern char_u * sourcing_name;
extern linenr_T sourcing_lnum;
extern int ex_nesting_level;
extern int debug_break_level;
extern int debug_did_msg;
extern int debug_tick;
extern except_T * current_exception;
extern int did_throw;
extern int need_rethrow;
extern int check_cstack;
extern int trylevel;
extern int force_abort;
extern struct msglist * * msg_list;
extern int suppress_errthrow;
extern except_T * caught_stack;
extern int may_garbage_collect;
extern int want_garbage_collect;
extern int garbage_collect_at_exit;
extern scid_T current_SID;
extern char_u hash_removed;
extern int scroll_region;
extern int t_colors;
extern int highlight_match;
extern linenr_T search_match_lines;
extern colnr_T search_match_endcol;
extern int no_smartcase;
extern int need_check_timestamps;
extern int did_check_timestamps;
extern int no_check_timestamps;
extern int highlight_attr [HLF_COUNT];
extern int highlight_user [9];
extern int highlight_stlnc [9];
extern int cterm_normal_fg_color;
extern int cterm_normal_fg_bold;
extern int cterm_normal_bg_color;
extern int autocmd_busy;
extern int autocmd_no_enter;
extern int autocmd_no_leave;
extern int modified_was_set;
extern int did_filetype;
extern int keep_filetype;
extern buf_T * au_new_curbuf;
extern int mouse_row;
extern int mouse_col;
extern int mouse_past_bottom;
extern int mouse_past_eol;
extern int mouse_dragging;
extern int diff_context;
extern int diff_foldcolumn;
extern int diff_need_scrollbind;
extern vimmenu_T * root_menu;
extern int sys_menu;
extern int updating_screen;
extern win_T * firstwin;
extern win_T * lastwin;
extern win_T * prevwin;
extern win_T * curwin;
extern win_T * aucmd_win;
extern int aucmd_win_used;
extern frame_T * topframe;
extern tabpage_T * first_tabpage;
extern tabpage_T * curtab;
extern int redraw_tabline;
extern buf_T * firstbuf;
extern buf_T * lastbuf;
extern buf_T * curbuf;
extern int mf_dont_release;
extern alist_T global_alist;
extern int arg_had_last;
extern int ru_col;
extern int ru_wid;
extern int sc_col;
extern int starting;
extern int exiting;
extern int really_exiting;
extern volatile int full_screen;
extern int restricted;
extern int secure;
extern int textlock;
extern int curbuf_lock;
extern int allbuf_lock;
extern int sandbox;
extern int silent_mode;
extern pos_T VIsual;
extern int VIsual_active;
extern int VIsual_select;
extern int VIsual_reselect;
extern int VIsual_mode;
extern int redo_VIsual_busy;
extern pos_T where_paste_started;
extern int did_ai;
extern colnr_T ai_col;
extern int end_comment_pending;
extern int did_syncbind;
extern int did_si;
extern int can_si;
extern int can_si_back;
extern pos_T saved_cursor;
extern pos_T Insstart;
extern int orig_line_count;
extern int vr_lines_changed;
extern int State;
extern int finish_op;
extern int opcount;
extern int exmode_active;
extern int ex_no_reprint;
extern int Recording;
extern int Exec_reg;
extern int no_mapping;
extern int no_zero_mapping;
extern int allow_keys;
extern int no_u_sync;
extern int restart_edit;
extern int arrow_used;
extern int ins_at_eol;
extern char_u * edit_submode;
extern char_u * edit_submode_pre;
extern char_u * edit_submode_extra;
extern hlf_T edit_submode_highl;
extern int ctrl_x_mode;
extern int no_abbr;
extern int mapped_ctrl_c;
extern int ctrl_c_interrupts;
extern cmdmod_T cmdmod;
extern int msg_silent;
extern int emsg_silent;
extern int cmd_silent;
extern int swap_exists_action;
extern int swap_exists_did_quit;
extern char_u * IObuff;
extern char_u * NameBuff;
extern char_u msg_buf [80];
extern int RedrawingDisabled;
extern int readonlymode;
extern int recoverymode;
extern struct buffheader stuffbuff;
extern typebuf_T typebuf;
extern int ex_normal_busy;
extern int ex_normal_lock;
extern int ignore_script;
extern int stop_insert_mode;
extern int KeyTyped;
extern int KeyStuffed;
extern int maptick;
extern char_u chartab [256];
extern int must_redraw;
extern int skip_redraw;
extern int do_redraw;
extern int need_highlight_changed;
extern char_u * use_viminfo;
extern FILE * scriptin [15];
extern int curscript;
extern FILE * scriptout;
extern int read_cmd_fd;
extern volatile int got_int;
extern int termcap_active;
extern int cur_tmode;
extern int bangredo;
extern int searchcmdlen;
extern int reg_do_extmatch;
extern reg_extmatch_T * re_extmatch_in;
extern reg_extmatch_T * re_extmatch_out;
extern int did_outofmem_msg;
extern int did_swapwrite_msg;
extern int undo_off;
extern int global_busy;
extern int listcmd_busy;
extern int need_start_insertmode;
extern char_u * last_cmdline;
extern char_u * repeat_cmdline;
extern char_u * new_last_cmdline;
extern char_u * autocmd_fname;
extern int autocmd_fname_full;
extern int autocmd_bufnr;
extern char_u * autocmd_match;
extern int did_cursorhold;
extern pos_T last_cursormoved;
extern linenr_T write_no_eol_lnum;
extern int postponed_split;
extern int postponed_split_flags;
extern int postponed_split_tab;
extern int g_do_tagpreview;
extern int replace_offset;
extern char_u * escape_chars;
extern int keep_help_flag;
extern char_u * empty_option;
extern int redir_off;
extern FILE * redir_fd;
extern int redir_reg;
extern int redir_vname;
extern int save_p_ls;
extern int save_p_wmh;
extern int wild_menu_showing;
extern char breakat_flags [256];
extern char * Version;
extern char * longVersion;
extern char_u * globaldir;
extern int lcs_eol;
extern int lcs_ext;
extern int lcs_prec;
extern int lcs_nbsp;
extern int lcs_tab1;
extern int lcs_tab2;
extern int lcs_trail;
extern int fill_stl;
extern int fill_stlnc;
extern int fill_vert;
extern int fill_fold;
extern int fill_diff;
extern int km_stopsel;
extern int km_startsel;
extern int cedit_key;
extern int cmdwin_type;
extern int cmdwin_result;
extern char_u no_lines_msg [];
extern long sub_nsubs;
extern linenr_T sub_nlines;
extern char_u wim_flags [4];
extern int stl_syntax;
extern int no_hlsearch;
extern option_table_T printer_opts [14];
extern linenr_T printer_page_num;
extern int typebuf_was_filled;
extern int virtual_op;
extern disptick_T display_tick;
extern linenr_T spell_redraw_lnum;
extern char_u e_abort [];
extern char_u e_argreq [];
extern char_u e_backslash [];
extern char_u e_cmdwin [];
extern char_u e_curdir [];
extern char_u e_endif [];
extern char_u e_endtry [];
extern char_u e_endwhile [];
extern char_u e_endfor [];
extern char_u e_while [];
extern char_u e_for [];
extern char_u e_exists [];
extern char_u e_failed [];
extern char_u e_internal [];
extern char_u e_interr [];
extern char_u e_invaddr [];
extern char_u e_invarg [];
extern char_u e_invarg2 [];
extern char_u e_invexpr2 [];
extern char_u e_invrange [];
extern char_u e_invcmd [];
extern char_u e_isadir2 [];
extern char_u e_markinval [];
extern char_u e_marknotset [];
extern char_u e_modifiable [];
extern char_u e_nesting [];
extern char_u e_noalt [];
extern char_u e_noabbr [];
extern char_u e_nobang [];
extern char_u e_nogvim [];
extern char_u e_nohebrew [];
extern char_u e_nofarsi [];
extern char_u e_noarabic [];
extern char_u e_nogroup [];
extern char_u e_noinstext [];
extern char_u e_nolastcmd [];
extern char_u e_nomap [];
extern char_u e_nomatch [];
extern char_u e_nomatch2 [];
extern char_u e_noname [];
extern char_u e_nopresub [];
extern char_u e_noprev [];
extern char_u e_noprevre [];
extern char_u e_norange [];
extern char_u e_noroom [];
extern char_u e_notcreate [];
extern char_u e_notmp [];
extern char_u e_notopen [];
extern char_u e_notread [];
extern char_u e_nowrtmsg [];
extern char_u e_null [];
extern char_u e_number_exp [];
extern char_u e_openerrf [];
extern char_u e_outofmem [];
extern char_u e_patnotf [];
extern char_u e_patnotf2 [];
extern char_u e_positive [];
extern char_u e_prev_dir [];
extern char_u e_quickfix [];
extern char_u e_loclist [];
extern char_u e_re_damg [];
extern char_u e_re_corr [];
extern char_u e_readonly [];
extern char_u e_readonlyvar [];
extern char_u e_readonlysbx [];
extern char_u e_readerrf [];
extern char_u e_sandbox [];
extern char_u e_secure [];
extern char_u e_scroll [];
extern char_u e_shellempty [];
extern char_u e_swapclose [];
extern char_u e_tagstack [];
extern char_u e_toocompl [];
extern char_u e_longname [];
extern char_u e_toomsbra [];
extern char_u e_toomany [];
extern char_u e_trailing [];
extern char_u e_umark [];
extern char_u e_wildexpand [];
extern char_u e_winheight [];
extern char_u e_winwidth [];
extern char_u e_write [];
extern char_u e_zerocount [];
extern char_u e_usingsid [];
extern char_u e_intern2 [];
extern char_u e_maxmempat [];
extern char_u e_emptybuf [];
extern char_u e_invalpat [];
extern char_u e_bufloaded [];
extern char_u e_notset [];
extern char top_bot_msg [];
extern char bot_top_msg [];
extern char need_key_msg [];
extern time_t starttime;
extern int ignored;
extern char * ignoredp;
gui_T gui;
static void gui_check_pos (void);
static void gui_position_components (int);
static void gui_outstr (char_u *, int);
static int gui_screenchar (int off, int flags, int fg, int bg, int back);
static void gui_delete_lines (int row, int count);
static void gui_insert_lines (int row, int count);
static void fill_mouse_coord (char_u * p, int col, int row);
static void gui_do_scrollbar (win_T * wp, int which, int enable);
static colnr_T scroll_line_len (linenr_T lnum);
static linenr_T gui_find_longest_lnum (void);
static void gui_update_horiz_scrollbar (int);
static void gui_set_fg_color (char_u * name);
static void gui_set_bg_color (char_u * name);
static win_T * xy2win (int x, int y);
static int can_update_cursor = 1;

void gui_start () {
    char_u * old_term;
    static int recursive = 0;
    old_term = vim_strsave ((term_strings [(int) (KS_NAME)]));
    settmode (0);
    if (full_screen) cursor_on ();
    gui.starting = 1;
    full_screen = 0;
    ++recursive;
    termcapinit ((char_u *) "builtin_gui");
    gui.starting = recursive - 1;
    if (!gui.in_use) {
        termcapinit (old_term);
        settmode (2);
        set_title_defaults ();
    }
    vim_free (old_term);
    gui_mch_update ();
    apply_autocmds (gui.in_use ? EVENT_GUIENTER : EVENT_GUIFAILED, ((void *) 0), ((void *) 0), 0, curbuf);
    --recursive;
}

void gui_prepare (argc, argv)
    int * argc;
    char * * argv;
{
    gui.in_use = 0;
    gui.starting = 0;
    gui_mch_prepare (argc, argv);
}

int gui_init_check () {
    static int result = 2;
    if (result != 2) {
        if (result == 0) emsg ((char_u *) (((char *) ("E229: Cannot start the GUI"))));
        return result;
    }
    gui.shell_created = 0;
    gui.dying = 0;
    gui.in_focus = 1;
    gui.dragged_sb = SBAR_NONE;
    gui.dragged_wp = ((void *) 0);
    gui.pointer_hidden = 0;
    gui.col = 0;
    gui.row = 0;
    gui.num_cols = Columns;
    gui.num_rows = Rows;
    gui.cursor_is_valid = 0;
    gui.scroll_region_top = 0;
    gui.scroll_region_bot = Rows - 1;
    gui.scroll_region_left = 0;
    gui.scroll_region_right = Columns - 1;
    gui.highlight_mask = 0x00;
    gui.char_width = 1;
    gui.char_height = 1;
    gui.char_ascent = 0;
    gui.border_width = 0;
    gui.norm_font = NOFONT;
    gui.bold_font = NOFONT;
    gui.ital_font = NOFONT;
    gui.boldital_font = NOFONT;
    gui.menu_font = NOFONT;
    gui.menu_is_active = 1;
    gui.menu_height = MENU_DEFAULT_HEIGHT;
    gui.menu_width = 0;
    gui.scrollbar_width = gui.scrollbar_height = SB_DEFAULT_WIDTH;
    gui.prev_wrap = -1;
    result = gui_mch_init_check ();
    return result;
}

void gui_init () {
    win_T * wp;
    static int recursive = 0;
    if (!recursive) {
        ++recursive;
        clip_init (1);
        if (gui_init_check () == 0) {
            --recursive;
            clip_init (0);
            return;
        }
        set_option_value ((char_u *) "paste", 0L, ((void *) 0), 0);
        if (!option_was_set((char_u*)"mouse")) set_string_option_direct ((char_u *) "mouse", -1, (char_u *) "a", 1, -6);
        if (use_gvimrc != ((void *) 0)) {
            if (strcmp ((char *) (use_gvimrc), (char *) ("NONE")) != 0 && strcmp ((char *) (use_gvimrc), (char *) ("NORC")) != 0 && do_source (use_gvimrc, 0, 0
              ) != 1) emsg2 ((char_u *) (((char *) ("E230: Cannot read from \"%s\""))), (char_u *) (use_gvimrc));
        }
        else {
            if (process_env ((char_u *) "GVIMINIT", 0) == 0 && do_source ((char_u *) USR_GVIMRC_FILE, 1, 2) == 0) {
            }
            if (p_exrc) {
                secure = p_secure;
                if (fullpathcmp ((char_u *) USR_GVIMRC_FILE, (char_u *) GVIMRC_FILE, 0) != 1) do_source ((char_u *) GVIMRC_FILE, 1, 2);
                if (secure == 2) need_wait_return = 1;
                secure = 0;
            }
        }
        if (need_wait_return || msg_didany) wait_return (1);
        --recursive;
    }
    if (gui.in_use) return;
    gui.in_use = 1;
    if (gui_mch_init () == 0) goto error;
    emsg_on_display = 0;
    msg_scrolled = 0;
    clear_sb_text ();
    need_wait_return = 0;
    msg_didany = 0;
    if (gui.border_width < 0) gui.border_width = 0;
    if (font_argument != ((void *) 0)) set_option_value ((char_u *) "gfn", 0L, (char_u *) font_argument, 0);
    if (gui_init_font (*p_guifont == '\000' ? hl_get_font_name () : p_guifont, 0) == 0) {
        emsg ((char_u *) (((char *) ("E665: Cannot start GUI, no valid font found"))));
        goto error2;
    }
    gui.num_cols = Columns;
    gui.num_rows = Rows;
    gui_reset_scroll_region ();
    for (wp = firstwin; wp != ((void *) 0); wp = wp -> w_next) {
        gui_create_scrollbar (&wp->w_scrollbars[SBAR_LEFT], SBAR_LEFT, wp);
        gui_create_scrollbar (&wp->w_scrollbars[SBAR_RIGHT], SBAR_RIGHT, wp);
    }
    gui_create_scrollbar (&gui.bottom_sbar, SBAR_BOTTOM, ((void *) 0));
    gui_create_initial_menus (root_menu);
    gui_init_which_components (((void *) 0));
    gui.shell_created = 1;
    gui_set_shellsize (0, 1, 15);
    if (gui_mch_open () != 0) {
        maketitle ();
        resettitle ();
        init_gui_options ();
        win_new_shellsize ();
        if (p_ch != 1L) command_height ();
        return;
    }
    error2 : error : gui.in_use = 0;
    clip_init (0);
}

void gui_exit (rc)
    int rc;
{
    free_highlight_fonts ();
    gui.in_use = 0;
    gui_mch_exit (rc);
}

int gui_init_font (font_list, fontset)
    char_u * font_list;
    int fontset;
{
    char_u font_name [320];
    int font_list_empty = 0;
    int ret = 0;
    if (!gui.in_use) return 0;
    font_name [0] = '\000';
    if (*font_list == '\000') font_list_empty = 1;
    else {
        while (*font_list != '\000') {
            (void) copy_option_part (&font_list, font_name, 320, ",");
            if (gui_mch_init_font (font_name, 0) == 1) {
                ret = 1;
                break;
            }
        }
    }
    if (ret != 1 && strcmp ((char *) (font_list), (char *) ("*")) != 0 && (font_list_empty || gui.norm_font == NOFONT)) {
        ret = gui_mch_init_font (((void *) 0), 0);
    }
    if (ret == 1) {
        gui_mch_set_font (gui.norm_font);
        gui_set_shellsize (0, 0, 15);
    }
    return ret;
}

void gui_set_cursor (row, col)
    int row;
    int col;
{
    gui.row = row;
    gui.col = col;
}

static void gui_check_pos () {
    if (gui.row >= screen_Rows) gui.row = screen_Rows - 1;
    if (gui.col >= screen_Columns) gui.col = screen_Columns - 1;
    if (gui.cursor_row >= screen_Rows || gui.cursor_col >= screen_Columns) gui.cursor_is_valid = 0;
}

void gui_update_cursor (force, clear_selection)
    int force;
    int clear_selection;
{
    int cur_width = 0;
    int cur_height = 0;
    int old_hl_mask;
    int idx;
    int id;
    int cfg, cbg, cc;
    int cattr;
    int attr;
    attrentry_T * aep = ((void *) 0);
    if (!can_update_cursor || screen_Columns != gui.num_cols || screen_Rows != gui.num_rows) return;
    gui_check_pos ();
    if (!gui.cursor_is_valid || force || gui.row != gui.cursor_row || gui.col != gui.cursor_col) {
        gui_undraw_cursor ();
        if (gui.row < 0) return;
        gui.cursor_row = gui.row;
        gui.cursor_col = gui.col;
        if (!screen_cleared || ScreenLines == ((void *) 0)) return;
        if (clear_selection) clip_may_clear_selection (gui.row, gui.row);
        if (gui.row >= screen_Rows || gui.col >= screen_Columns) return;
        gui.cursor_is_valid = 1;
        idx = get_shape_idx (0);
        if (State & 0x20) id = shape_table [idx].id_lm;
        else id = shape_table [idx].id;
        cfg = INVALCOLOR;
        cbg = INVALCOLOR;
        cattr = 0x01;
        gui_mch_set_blinking (shape_table [idx].blinkwait, shape_table [idx].blinkon, shape_table [idx].blinkoff);
        if (id > 0) {
            cattr = syn_id2colors (id, &cfg, &cbg);
        }
        attr = ScreenAttrs [LineOffset [gui.row] + gui.col];
        if (attr > 0x3f) aep = syn_gui_attr2entry (attr);
        if (aep != ((void *) 0)) {
            attr = aep -> ae_attr;
            if (cfg == INVALCOLOR) cfg = ((attr & 0x01) ? aep -> ae_u.gui.bg_color : aep -> ae_u.gui.fg_color);
            if (cbg == INVALCOLOR) cbg = ((attr & 0x01) ? aep -> ae_u.gui.fg_color : aep -> ae_u.gui.bg_color);
        }
        if (cfg == INVALCOLOR) cfg = (attr & 0x01) ? gui.back_pixel : gui.norm_pixel;
        if (cbg == INVALCOLOR) cbg = (attr & 0x01) ? gui.norm_pixel : gui.back_pixel;
        attr &= ~0x01;
        if (cattr & 0x01) {
            cc = cbg;
            cbg = cfg;
            cfg = cc;
        }
        cattr &= ~0x01;
        if (!gui.in_focus) {
            gui_mch_draw_hollow_cursor (cbg);
            return;
        }
        old_hl_mask = gui.highlight_mask;
        if (shape_table [idx].shape == SHAPE_BLOCK) {
            gui.highlight_mask = (cattr | attr);
            (void) gui_screenchar (LineOffset [gui.row] + gui.col, GUI_MON_IS_CURSOR | GUI_MON_NOCLEAR, cfg, cbg, 0);
        }
        else {
            if (shape_table [idx].shape == SHAPE_VER) {
                cur_height = gui.char_height;
                cur_width = (gui.char_width * shape_table [idx].percentage + 99) / 100;
            }
            else {
                cur_height = (gui.char_height * shape_table [idx].percentage + 99) / 100;
                cur_width = gui.char_width;
            }
            gui_mch_draw_part_cursor (cur_width, cur_height, cbg);
            gui.highlight_mask = ScreenAttrs [LineOffset [gui.row] + gui.col];
            (void) gui_screenchar (LineOffset [gui.row] + gui.col, GUI_MON_TRS_CURSOR | GUI_MON_NOCLEAR, (int) 0, (int) 0, 0);
        }
        gui.highlight_mask = old_hl_mask;
    }
}

void gui_position_menu () {
    if (gui.menu_is_active && gui.in_use) gui_mch_set_menu_pos (0, 0, gui.menu_width, gui.menu_height);
}

static void gui_position_components (total_width)
    int total_width;
{
    int text_area_x;
    int text_area_y;
    int text_area_width;
    int text_area_height;
    ++hold_gui_events;
    text_area_x = 0;
    if (gui.which_scrollbars [SBAR_LEFT]) text_area_x += gui.scrollbar_width;
    text_area_y = 0;
    gui.menu_width = total_width;
    if (gui.menu_is_active) text_area_y += gui.menu_height;
    text_area_width = gui.num_cols * gui.char_width + gui.border_offset * 2;
    text_area_height = gui.num_rows * gui.char_height + gui.border_offset * 2;
    gui_mch_set_text_area_pos (text_area_x, text_area_y, text_area_width, text_area_height);
    gui_position_menu ();
    if (gui.which_scrollbars [SBAR_BOTTOM]) gui_mch_set_scrollbar_pos (&gui.bottom_sbar, text_area_x, text_area_y + text_area_height, text_area_width, gui.
      scrollbar_height);
    gui.left_sbar_x = 0;
    gui.right_sbar_x = text_area_x + text_area_width;
    --hold_gui_events;
}

int gui_get_base_width () {
    int base_width;
    base_width = 2 * gui.border_offset;
    if (gui.which_scrollbars [SBAR_LEFT]) base_width += gui.scrollbar_width;
    if (gui.which_scrollbars [SBAR_RIGHT]) base_width += gui.scrollbar_width;
    return base_width;
}

int gui_get_base_height () {
    int base_height;
    base_height = 2 * gui.border_offset;
    if (gui.which_scrollbars [SBAR_BOTTOM]) base_height += gui.scrollbar_height;
    if (gui.menu_is_active) base_height += gui.menu_height;
    return base_height;
}

void gui_resize_shell (pixel_width, pixel_height)
    int pixel_width;
    int pixel_height;
{
    static int busy = 0;
    if (!gui.shell_created) return;
    if (updating_screen || busy) {
        new_pixel_width = pixel_width;
        new_pixel_height = pixel_height;
        return;
    }
    again : busy = 1;
    out_flush ();
    gui.num_cols = (pixel_width - gui_get_base_width ()) / gui.char_width;
    gui.num_rows = (pixel_height - gui_get_base_height ()) / gui.char_height;
    gui_position_components (pixel_width);
    gui_reset_scroll_region ();
    if (State == 0x300 || State == 0x800) gui.row = gui.num_rows;
    if (gui.num_rows != screen_Rows || gui.num_cols != screen_Columns || gui.num_rows != Rows || gui.num_cols != Columns) shell_resized ();
    gui_update_scrollbars (1);
    gui_update_cursor (0, 1);
    busy = 0;
    if (new_pixel_height) {
        pixel_width = new_pixel_width;
        pixel_height = new_pixel_height;
        new_pixel_width = 0;
        new_pixel_height = 0;
        goto again;
    }
}

void gui_may_resize_shell () {
    int h, w;
    if (new_pixel_height) {
        w = new_pixel_width;
        h = new_pixel_height;
        new_pixel_width = 0;
        new_pixel_height = 0;
        gui_resize_shell (w, h);
    }
}

int gui_get_shellsize () {
    Rows = gui.num_rows;
    Columns = gui.num_cols;
    return 1;
}

void gui_set_shellsize (mustset, fit_to_display, direction)
    int mustset;
    int fit_to_display;
    int direction;
{
    int base_width;
    int base_height;
    int width;
    int height;
    int min_width;
    int min_height;
    int screen_w;
    int screen_h;
    int x = -1, y = -1;
    if (!gui.shell_created) return;
    base_width = gui_get_base_width ();
    base_height = gui_get_base_height ();
    if (fit_to_display) gui_mch_get_winpos (&x, &y);
    {
        width = Columns * gui.char_width + base_width;
        height = Rows * gui.char_height + base_height;
    }
    if (fit_to_display) {
        gui_mch_get_screen_dimensions (&screen_w, &screen_h);
        if ((direction & 2) && width > screen_w) {
            Columns = (screen_w - base_width) / gui.char_width;
            if (Columns < 12) Columns = 12;
            width = Columns * gui.char_width + base_width;
        }
        if ((direction & 1) && height > screen_h) {
            Rows = (screen_h - base_height) / gui.char_height;
            check_shellsize ();
            height = Rows * gui.char_height + base_height;
        }
    }
    gui.num_cols = Columns;
    gui.num_rows = Rows;
    min_width = base_width + 12 * gui.char_width;
    min_height = base_height + 2 * gui.char_height;
    min_height += tabline_height () * gui.char_height;
    gui_mch_set_shellsize (width, height, min_width, min_height, base_width, base_height, direction);
    if (fit_to_display && x >= 0 && y >= 0) {
        gui_mch_update ();
        if (gui_mch_get_winpos (&x, &y) == 1 && (x < 0 || y < 0)) gui_mch_set_winpos (x < 0 ? 0 : x, y < 0 ? 0 : y);
    }
    gui_position_components (width);
    gui_update_scrollbars (1);
    gui_reset_scroll_region ();
}

void gui_new_shellsize () {
    gui_reset_scroll_region ();
}

void gui_reset_scroll_region () {
    gui.scroll_region_top = 0;
    gui.scroll_region_bot = gui.num_rows - 1;
    gui.scroll_region_left = 0;
    gui.scroll_region_right = gui.num_cols - 1;
}

void gui_start_highlight (mask)
    int mask;
{
    if (mask > 0x3f) gui.highlight_mask = mask;
    else gui.highlight_mask |= mask;
}

void gui_stop_highlight (mask)
    int mask;
{
    if (mask > 0x3f) gui.highlight_mask = 0x00;
    else gui.highlight_mask &= ~mask;
}

void gui_clear_block (row1, col1, row2, col2)
    int row1;
    int col1;
    int row2;
    int col2;
{
    clip_may_clear_selection (row1, row2);
    gui_mch_clear_block (row1, col1, row2, col2);
    if (gui.cursor_row >= row1 && gui.cursor_row <= row2 && gui.cursor_col >= col1 && gui.cursor_col <= col2) gui.cursor_is_valid = 0;
}

void gui_update_cursor_later () {
    out_str ((char_u *) ("\033|s"));
}

void gui_write (s, len)
    char_u * s;
    int len;
{
    char_u * p;
    int arg1 = 0, arg2 = 0;
    int force_cursor = 0;
    int force_scrollbar = 0;
    static win_T * old_curwin = ((void *) 0);
    while (len) {
        if (s [0] == '\033' && s [1] == '|') {
            p = s + 2;
            if (((*p) >= '0' && (*p) <= '9')) {
                arg1 = getdigits (&p);
                if (p > s + len) break;
                if (*p == ';') {
                    ++p;
                    arg2 = getdigits (&p);
                    if (p > s + len) break;
                }
            }
            switch (*p) {
            case 'C' :
                clip_scroll_selection (9999);
                gui_mch_clear_all ();
                gui.cursor_is_valid = 0;
                force_scrollbar = 1;
                break;
            case 'M' :
                gui_set_cursor (arg1, arg2);
                break;
            case 's' :
                force_cursor = 1;
                break;
            case 'R' :
                if (arg1 < arg2) {
                    gui.scroll_region_top = arg1;
                    gui.scroll_region_bot = arg2;
                }
                else {
                    gui.scroll_region_top = arg2;
                    gui.scroll_region_bot = arg1;
                }
                break;
            case 'V' :
                if (arg1 < arg2) {
                    gui.scroll_region_left = arg1;
                    gui.scroll_region_right = arg2;
                }
                else {
                    gui.scroll_region_left = arg2;
                    gui.scroll_region_right = arg1;
                }
                break;
            case 'd' :
                gui_delete_lines (gui.row, 1);
                break;
            case 'D' :
                gui_delete_lines (gui.row, arg1);
                break;
            case 'i' :
                gui_insert_lines (gui.row, 1);
                break;
            case 'I' :
                gui_insert_lines (gui.row, arg1);
                break;
            case '$' :
                gui_clear_block (gui.row, gui.col, gui.row, (int) Columns - 1);
                break;
            case 'h' :
                gui_start_highlight (arg1);
                break;
            case 'H' :
                gui_stop_highlight (arg1);
                break;
            case 'f' :
                gui_mch_flash (arg1 == 0 ? 20 : arg1);
                break;
            default :
                p = s + 1;
                break;
            }
            len -= (int) (++p - s);
            s = p;
        }
        else if (s [0] < 0x20) {
            if (s [0] == '\n') {
                gui.col = 0;
                if (gui.row < gui.scroll_region_bot) gui.row ++;
                else gui_delete_lines (gui.scroll_region_top, 1);
            }
            else if (s [0] == '\r') {
                gui.col = 0;
            }
            else if (s [0] == '\b') {
                if (gui.col) --gui.col;
            }
            else if (s [0] == 12) {
                ++gui.col;
            }
            else if (s [0] == 7) {
                gui_mch_beep ();
            }
            --len;
            ++s;
        }
        else {
            p = s;
            while (len > 0 && (*p >= 0x20)) {
                len --;
                p ++;
            }
            gui_outstr (s, (int) (p - s));
            s = p;
        }
    }
    if (force_cursor) gui_update_cursor (1, 1);
    if (old_curwin != curwin) gui.dragged_sb = SBAR_NONE;
    if (force_scrollbar || old_curwin != curwin) gui_update_scrollbars (force_scrollbar);
    else gui_update_horiz_scrollbar (0);
    old_curwin = curwin;
    gui_mch_flush ();
}

void gui_dont_update_cursor () {
    if (gui.in_use) {
        gui_undraw_cursor ();
        can_update_cursor = 0;
    }
}

void gui_can_update_cursor () {
    can_update_cursor = 1;
}

static void gui_outstr (s, len)
    char_u * s;
    int len;
{
    int this_len;
    if (len == 0) return;
    if (len < 0) len = (int) strlen ((char *) (s));
    while (len > 0) {
        if (gui.col + len > Columns) this_len = Columns - gui.col;
        else this_len = len;
        (void) gui_outstr_nowrap (s, this_len, 0, (int) 0, (int) 0, 0);
        s += this_len;
        len -= this_len;
        if (gui.col >= Columns) {
            gui.col = 0;
            gui.row ++;
        }
    }
}

static int gui_screenchar (off, flags, fg, bg, back)
    int off;
    int flags;
    int fg, bg;
    int back;
{
    return gui_outstr_nowrap (ScreenLines + off, 1, flags, fg, bg, back);
}

int gui_outstr_nowrap (s, len, flags, fg, bg, back)
    char_u * s;
    int len;
    int flags;
    int fg, bg;
    int back;
{
    long_u highlight_mask;
    long_u hl_mask_todo;
    int fg_color;
    int bg_color;
    int sp_color;
    GuiFont font = NOFONT;
    attrentry_T * aep = ((void *) 0);
    int draw_flags;
    int col = gui.col;
    if (len < 0) len = (int) strlen ((char *) (s));
    if (len == 0) return 1;
    if (gui.highlight_mask > 0x3f) {
        aep = syn_gui_attr2entry (gui.highlight_mask);
        if (aep == ((void *) 0)) highlight_mask = 0;
        else highlight_mask = aep -> ae_attr;
    }
    else highlight_mask = gui.highlight_mask;
    hl_mask_todo = highlight_mask;
    if (aep != ((void *) 0) && aep -> ae_u.gui.font != NOFONT) font = aep -> ae_u.gui.font;
    else {
        if (hl_mask_todo & (0x02 | 0x20)) {
            if ((hl_mask_todo & 0x04) && gui.boldital_font != NOFONT) {
                font = gui.boldital_font;
                hl_mask_todo &= ~(0x02|0x20|0x04);
            }
            else if (gui.bold_font != NOFONT) {
                font = gui.bold_font;
                hl_mask_todo &= ~(0x02|0x20);
            }
            else font = gui.norm_font;
        }
        else if ((hl_mask_todo & 0x04) && gui.ital_font != NOFONT) {
            font = gui.ital_font;
            hl_mask_todo &= ~0x04;
        }
        else font = gui.norm_font;
    }
    gui_mch_set_font (font);
    draw_flags = 0;
    bg_color = gui.back_pixel;
    if ((flags & GUI_MON_IS_CURSOR) && gui.in_focus) {
        draw_flags |= DRAW_CURSOR;
        fg_color = fg;
        bg_color = bg;
        sp_color = fg;
    }
    else if (aep != ((void *) 0)) {
        fg_color = aep -> ae_u.gui.fg_color;
        if (fg_color == INVALCOLOR) fg_color = gui.norm_pixel;
        bg_color = aep -> ae_u.gui.bg_color;
        if (bg_color == INVALCOLOR) bg_color = gui.back_pixel;
        sp_color = aep -> ae_u.gui.sp_color;
        if (sp_color == INVALCOLOR) sp_color = fg_color;
    }
    else {
        fg_color = gui.norm_pixel;
        sp_color = fg_color;
    }
    if (highlight_mask & (0x01 | 0x20)) {
        gui_mch_set_fg_color (bg_color);
        gui_mch_set_bg_color (fg_color);
    }
    else {
        gui_mch_set_fg_color (fg_color);
        gui_mch_set_bg_color (bg_color);
    }
    gui_mch_set_sp_color (sp_color);
    if (!(flags&GUI_MON_NOCLEAR)) clip_may_clear_selection (gui.row, gui.row);
    if (hl_mask_todo & (0x02 | 0x20)) draw_flags |= DRAW_BOLD;
    if (back != 0 && ((draw_flags & DRAW_BOLD) || (highlight_mask & 0x04))) return 0;
    if ((hl_mask_todo & 0x08) || (hl_mask_todo & 0x04)) draw_flags |= DRAW_UNDERL;
    if (hl_mask_todo & 0x10) draw_flags |= DRAW_UNDERC;
    if (flags & GUI_MON_TRS_CURSOR) draw_flags |= DRAW_TRANSP;
    {
        gui_mch_draw_string (gui.row, col, s, len, draw_flags);
    }
    if (!(flags&(GUI_MON_IS_CURSOR|GUI_MON_TRS_CURSOR))) gui.col = col + len;
    if (flags & GUI_MON_NOCLEAR) clip_may_redraw_selection (gui.row, col, len);
    if (!(flags&(GUI_MON_IS_CURSOR|GUI_MON_TRS_CURSOR))) {
        if (gui.cursor_row == gui.row && gui.cursor_col >= col && gui.cursor_col < col + len) gui.cursor_is_valid = 0;
    }
    return 1;
}

void gui_undraw_cursor () {
    if (gui.cursor_is_valid) {
        if (gui_redraw_block (gui.cursor_row, gui.cursor_col, gui.cursor_row, gui.cursor_col, GUI_MON_NOCLEAR) && gui.cursor_col > 0) (void) gui_redraw_block (
          gui.cursor_row, gui.cursor_col - 1, gui.cursor_row, gui.cursor_col - 1, GUI_MON_NOCLEAR);
        gui.cursor_is_valid = 0;
    }
}

void gui_redraw (x, y, w, h)
    int x;
    int y;
    int w;
    int h;
{
    int row1, col1, row2, col2;
    row1 = Y_2_ROW (y);
    col1 = X_2_COL (x);
    row2 = Y_2_ROW (y + h - 1);
    col2 = X_2_COL (x + w - 1);
    (void) gui_redraw_block (row1, col1, row2, col2, GUI_MON_NOCLEAR);
    if (gui.row == gui.cursor_row) gui_update_cursor (1, 1);
}

int gui_redraw_block (row1, col1, row2, col2, flags)
    int row1;
    int col1;
    int row2;
    int col2;
    int flags;
{
    int old_row, old_col;
    long_u old_hl_mask;
    int off;
    sattr_T first_attr;
    int idx, len;
    int back, nback;
    int retval = 0;
    if (!screen_cleared || ScreenLines == ((void *) 0)) return retval;
    col1 = check_col (col1);
    col2 = check_col (col2);
    row1 = check_row (row1);
    row2 = check_row (row2);
    old_row = gui.row;
    old_col = gui.col;
    old_hl_mask = gui.highlight_mask;
    for (gui.row = row1; gui.row <= row2; gui.row ++) {
        gui.col = col1;
        off = LineOffset [gui.row] + gui.col;
        len = col2 - col1 + 1;
        for (back = 0; back < col1; ++back) if (ScreenAttrs [off - 1 - back] != ScreenAttrs [off] || ScreenLines [off - 1 - back] == ' ') break;
        retval = (col1 > 0 && ScreenAttrs [off - 1] != 0 && back == 0 && ScreenLines [off - 1] != ' ');
        while (len > 0) {
            first_attr = ScreenAttrs [off];
            gui.highlight_mask = first_attr;
            {
                for (idx = 0; idx < len && ScreenAttrs [off + idx] == first_attr; idx ++) {
                }
                nback = gui_outstr_nowrap (ScreenLines + off, idx, flags, (int) 0, (int) 0, back);
            }
            if (nback == 0) {
                off -= back;
                len += back;
                gui.col -= back;
            }
            else {
                off += idx;
                len -= idx;
            }
            back = 0;
        }
    }
    gui.row = old_row;
    gui.col = old_col;
    gui.highlight_mask = (int) old_hl_mask;
    return retval;
}

static void gui_delete_lines (row, count)
    int row;
    int count;
{
    if (count <= 0) return;
    if (row + count > gui.scroll_region_bot) gui_clear_block (row, gui.scroll_region_left, gui.scroll_region_bot, gui.scroll_region_right);
    else {
        gui_mch_delete_lines (row, count);
        if (gui.cursor_row >= row && gui.cursor_col >= gui.scroll_region_left && gui.cursor_col <= gui.scroll_region_right) {
            if (gui.cursor_row < row + count) gui.cursor_is_valid = 0;
            else if (gui.cursor_row <= gui.scroll_region_bot) gui.cursor_row -= count;
        }
    }
}

static void gui_insert_lines (row, count)
    int row;
    int count;
{
    if (count <= 0) return;
    if (row + count > gui.scroll_region_bot) gui_clear_block (row, gui.scroll_region_left, gui.scroll_region_bot, gui.scroll_region_right);
    else {
        gui_mch_insert_lines (row, count);
        if (gui.cursor_row >= gui.row && gui.cursor_col >= gui.scroll_region_left && gui.cursor_col <= gui.scroll_region_right) {
            if (gui.cursor_row <= gui.scroll_region_bot - count) gui.cursor_row += count;
            else if (gui.cursor_row <= gui.scroll_region_bot) gui.cursor_is_valid = 0;
        }
    }
}

int gui_wait_for_chars (wtime)
    long wtime;
{
    int retval;
    if (wtime != 0) gui_update_menus (0);
    gui_mch_update ();
    if (input_available ()) return 1;
    if (wtime == 0) return 0;
    gui_mch_flush ();
    if (wtime > 0) {
        gui_mch_start_blink ();
        retval = gui_mch_wait_for_chars (wtime);
        gui_mch_stop_blink ();
        return retval;
    }
    gui_mch_start_blink ();
    retval = 0;
    if (gui_mch_wait_for_chars (p_ut) == 1) retval = 1;
    else if (trigger_cursorhold ()) {
        char_u buf [3];
        buf [0] = 0x9b;
        buf [1] = 253;
        buf [2] = (int) KE_CURSORHOLD;
        add_to_input_buf (buf, 3);
        retval = 1;
    }
    if (retval == 0) {
        before_blocking ();
        retval = gui_mch_wait_for_chars (-1L);
    }
    gui_mch_stop_blink ();
    return retval;
}

static void fill_mouse_coord (p, col, row)
    char_u * p;
    int col;
    int row;
{
    p [0] = (char_u) (col / 128 + ' ' + 1);
    p [1] = (char_u) (col % 128 + ' ' + 1);
    p [2] = (char_u) (row / 128 + ' ' + 1);
    p [3] = (char_u) (row % 128 + ' ' + 1);
}

void gui_send_mouse_event (button, x, y, repeated_click, modifiers)
    int button;
    int x;
    int y;
    int repeated_click;
    int_u modifiers;
{
    static int prev_row = 0, prev_col = 0;
    static int prev_button = -1;
    static int num_clicks = 1;
    char_u string [10];
    enum key_extra button_char;
    int row, col;
    switch (button) {
    case 0x300 :
        button_char = KE_X1MOUSE;
        goto button_set;
    case 0x400 :
        button_char = KE_X2MOUSE;
        goto button_set;
    case 0x100 :
        button_char = KE_MOUSEDOWN;
        goto button_set;
    case 0x200 :
        button_char = KE_MOUSEUP;
        goto button_set;
    case 0x500 :
        button_char = KE_MOUSELEFT;
        goto button_set;
    case 0x600 :
        button_char = KE_MOUSERIGHT;
        button_set : {
            if (hold_gui_events) return;
            string [3] = 0x9b;
            string [4] = 253;
            string [5] = (int) button_char;
            row = gui_xy2colrow (x, y, &col);
            string [6] = (char_u) (col / 128 + ' ' + 1);
            string [7] = (char_u) (col % 128 + ' ' + 1);
            string [8] = (char_u) (row / 128 + ' ' + 1);
            string [9] = (char_u) (row % 128 + ' ' + 1);
            if (modifiers == 0) add_to_input_buf (string + 3, 7);
            else {
                string [0] = 0x9b;
                string [1] = 252;
                string [2] = 0;
                if (modifiers & 0x04) string [2] |= 0x02;
                if (modifiers & 0x10) string [2] |= 0x04;
                if (modifiers & 0x08) string [2] |= 0x08;
                add_to_input_buf (string, 10);
            }
            return;
        }
    }
    if (hold_gui_events) return;
    row = gui_xy2colrow (x, y, &col);
    if (button == (0x40 | 0x03)) {
        if (row == prev_row && col == prev_col) return;
        if (y < 0) row = -1;
    }
    if (curwin -> w_topline != gui_prev_topline || curwin -> w_topfill != gui_prev_topfill) repeated_click = 0;
    string [0] = 0x9b;
    string [1] = 251;
    string [2] = ('X');
    if (button != (0x40 | 0x03) && button != 0x03) {
        if (repeated_click) {
            if (button != prev_button || row != prev_row || col != prev_col) num_clicks = 1;
            else if (++num_clicks > 4) num_clicks = 1;
        }
        else num_clicks = 1;
        prev_button = button;
        gui_prev_topline = curwin -> w_topline;
        gui_prev_topfill = curwin -> w_topfill;
        string [3] = (char_u) (button | 0x20);
        (string [3]) = ((string [3]) & 0x3f) | ((((num_clicks) - 1) & 3) << 6);
    }
    else string [3] = (char_u) button;
    string [3] |= modifiers;
    fill_mouse_coord (string + 4, col, row);
    add_to_input_buf (string, 8);
    if (row < 0) prev_row = 0;
    else prev_row = row;
    prev_col = col;
}

int gui_xy2colrow (x, y, colp)
    int x;
    int y;
    int * colp;
{
    int col = check_col (X_2_COL (x));
    int row = check_row (Y_2_ROW (y));
    * colp = col;
    return row;
}

void gui_menu_cb (menu)
    vimmenu_T * menu;
{
    char_u bytes [sizeof (long_u)];
    if (hold_gui_events) return;
    bytes [0] = 0x9b;
    bytes [1] = 250;
    bytes [2] = ('X');
    add_to_input_buf (bytes, 3);
    add_long_to_buf ((long_u) menu, bytes);
    add_to_input_buf_csi (bytes, sizeof (long_u));
}

static int prev_which_scrollbars [3];

void gui_init_which_components (oldval)
    char_u * oldval;
{
    static int prev_menu_is_active = -1;
    static int prev_tearoff = -1;
    int using_tearoff = 0;
    char_u * p;
    int i;
    int grey_old, grey_new;
    char_u * temp;
    win_T * wp;
    int need_set_size;
    int fix_size;
    if (oldval != ((void *) 0) && gui.in_use) {
        grey_old = (vim_strchr (oldval, 'g') != ((void *) 0));
        grey_new = (vim_strchr (p_go, 'g') != ((void *) 0));
        if (grey_old != grey_new) {
            temp = p_go;
            p_go = oldval;
            gui_update_menus (((1 << 6) - 1));
            p_go = temp;
        }
    }
    gui.menu_is_active = 0;
    for (i = 0; i < 3; i ++) gui.which_scrollbars [i] = 0;
    for (p = p_go; *p; p ++) switch (*p) {
    case 'l' :
        gui.which_scrollbars [SBAR_LEFT] = 1;
        break;
    case 'r' :
        gui.which_scrollbars [SBAR_RIGHT] = 1;
        break;
    case 'L' :
        if (win_hasvertsplit ()) gui.which_scrollbars [SBAR_LEFT] = 1;
        break;
    case 'R' :
        if (win_hasvertsplit ()) gui.which_scrollbars [SBAR_RIGHT] = 1;
        break;
    case 'b' :
        gui.which_scrollbars [SBAR_BOTTOM] = 1;
        break;
    case 'm' :
        gui.menu_is_active = 1;
        break;
    case 'g' :
        break;
    case 't' :
        using_tearoff = 1;
        break;
    default :
        break;
    }
    if (gui.in_use) {
        need_set_size = 0;
        fix_size = 0;
        for (i = 0; i < 3; i ++) {
            if (gui.which_scrollbars [i] != prev_which_scrollbars [i] || gui.which_scrollbars [i] != curtab -> tp_prev_which_scrollbars [i]) {
                if (i == SBAR_BOTTOM) gui_mch_enable_scrollbar (&gui.bottom_sbar, gui.which_scrollbars [i]);
                else {
                    for (wp = firstwin; wp != ((void *) 0); wp = wp -> w_next) {
                        gui_do_scrollbar (wp, i, gui.which_scrollbars [i]);
                    }
                }
                if (gui.which_scrollbars [i] != prev_which_scrollbars [i]) {
                    if (i == SBAR_BOTTOM) need_set_size |= 1;
                    else need_set_size |= 2;
                    if (gui.which_scrollbars [i]) fix_size = 1;
                }
            }
            curtab -> tp_prev_which_scrollbars [i] = gui.which_scrollbars [i];
            prev_which_scrollbars [i] = gui.which_scrollbars [i];
        }
        if (gui.menu_is_active != prev_menu_is_active) {
            i = Rows;
            gui_mch_enable_menu (gui.menu_is_active);
            Rows = i;
            prev_menu_is_active = gui.menu_is_active;
            need_set_size |= 1;
            if (gui.menu_is_active) fix_size = 1;
        }
        if (using_tearoff != prev_tearoff) {
            gui_mch_toggle_tearoffs (using_tearoff);
            prev_tearoff = using_tearoff;
        }
        if (need_set_size != 0) {
            gui_set_shellsize (0, fix_size, need_set_size);
        }
        if (firstwin -> w_winrow != tabline_height ()) shell_new_rows ();
    }
}

void gui_remove_scrollbars () {
    int i;
    win_T * wp;
    for (i = 0; i < 3; i ++) {
        if (i == SBAR_BOTTOM) gui_mch_enable_scrollbar (&gui.bottom_sbar, 0);
        else {
            for (wp = firstwin; wp != ((void *) 0); wp = wp -> w_next) {
                gui_do_scrollbar (wp, i, 0);
            }
        }
        curtab -> tp_prev_which_scrollbars [i] = -1;
    }
}

void gui_create_scrollbar (sb, type, wp)
    scrollbar_T * sb;
    int type;
    win_T * wp;
{
    static int sbar_ident = 0;
    sb -> ident = sbar_ident ++;
    sb -> wp = wp;
    sb -> type = type;
    sb -> value = 0;
    sb -> size = 1;
    sb -> max = 1;
    sb -> top = 0;
    sb -> height = 0;
    sb -> width = 0;
    sb -> status_height = 0;
    gui_mch_create_scrollbar (sb, (wp == ((void *) 0)) ? SBAR_HORIZ : SBAR_VERT);
}

scrollbar_T * gui_find_scrollbar (ident)
    long ident;
{
    win_T * wp;
    if (gui.bottom_sbar.ident == ident) return &gui.bottom_sbar;
    for (wp = firstwin; wp != ((void *) 0); wp = wp -> w_next) {
        if (wp -> w_scrollbars [SBAR_LEFT].ident == ident) return &wp->w_scrollbars[SBAR_LEFT];
        if (wp -> w_scrollbars [SBAR_RIGHT].ident == ident) return &wp->w_scrollbars[SBAR_RIGHT];
    }
    return ((void *) 0);
}

void gui_drag_scrollbar (sb, value, still_dragging)
    scrollbar_T * sb;
    long value;
    int still_dragging;
{
    win_T * wp;
    int sb_num;
    char_u bytes [sizeof (long_u)];
    int byte_count;
    if (sb == ((void *) 0)) return;
    if (hold_gui_events) return;
    if (cmdwin_type != 0 && sb -> wp != curwin) return;
    if (still_dragging) {
        if (sb -> wp == ((void *) 0)) gui.dragged_sb = SBAR_BOTTOM;
        else if (sb == &sb->wp->w_scrollbars[SBAR_LEFT]) gui.dragged_sb = SBAR_LEFT;
        else gui.dragged_sb = SBAR_RIGHT;
        gui.dragged_wp = sb -> wp;
    }
    else {
        gui.dragged_sb = SBAR_NONE;
    }
    if (sb -> wp != ((void *) 0)) sb = &sb->wp->w_scrollbars[0];
    if (value < 0) value = 0;
    if (value > sb -> max - sb -> size + 1) value = sb -> max - sb -> size + 1;
    sb -> value = value;
    if ((sb -> wp == ((void *) 0) || sb -> wp == curwin) && pum_visible ()) return;
    if (sb -> wp != ((void *) 0)) {
        sb_num = 0;
        for (wp = firstwin; wp != sb -> wp && wp != ((void *) 0); wp = wp -> w_next) sb_num ++;
        if (wp == ((void *) 0)) return;
        bytes [0] = 0x9b;
        bytes [1] = 249;
        bytes [2] = ('X');
        bytes [3] = (char_u) sb_num;
        byte_count = 4;
    }
    else {
        bytes [0] = 0x9b;
        bytes [1] = 248;
        bytes [2] = ('X');
        byte_count = 3;
    }
    add_to_input_buf (bytes, byte_count);
    add_long_to_buf ((long_u) value, bytes);
    add_to_input_buf_csi (bytes, sizeof (long_u));
}

void gui_may_update_scrollbars () {
    if (gui.in_use && starting == 0) {
        out_flush ();
        gui_init_which_components (((void *) 0));
        gui_update_scrollbars (1);
    }
    need_mouse_correct = 1;
}

void gui_update_scrollbars (force)
    int force;
{
    win_T * wp;
    scrollbar_T * sb;
    long val, size, max;
    int which_sb;
    int h, y;
    static win_T * prev_curwin = ((void *) 0);
    gui_update_horiz_scrollbar (force);
    if (!gui.which_scrollbars[SBAR_LEFT] && !gui.which_scrollbars[SBAR_RIGHT]) return;
    if (!force && (gui.dragged_sb == SBAR_LEFT || gui.dragged_sb == SBAR_RIGHT) && gui.which_scrollbars [SBAR_LEFT] && gui.which_scrollbars [SBAR_RIGHT]) {
        which_sb = SBAR_LEFT + SBAR_RIGHT - gui.dragged_sb;
        if (gui.dragged_wp != ((void *) 0)) gui_mch_set_scrollbar_thumb (&gui.dragged_wp->w_scrollbars[which_sb], gui.dragged_wp -> w_scrollbars [0].value, gui
          .dragged_wp -> w_scrollbars [0].size, gui.dragged_wp -> w_scrollbars [0].max);
    }
    ++hold_gui_events;
    for (wp = firstwin; wp != ((void *) 0); wp = ((wp) -> w_next)) {
        if (wp -> w_buffer == ((void *) 0)) continue;
        if (!force && (gui.dragged_sb == SBAR_LEFT || gui.dragged_sb == SBAR_RIGHT) && gui.dragged_wp == wp) continue;
        max = wp -> w_buffer -> b_ml.ml_line_count + wp -> w_height - 2;
        if (max < 0) max = 0;
        val = wp -> w_topline - 1;
        size = wp -> w_height;
        if (size > max + 1) size = max + 1;
        if (val > max - size + 1) val = max - size + 1;
        if (val < 0) val = 0;
        sb = &wp->w_scrollbars[0];
        if (size < 1 || wp -> w_botline - 2 > max) {
            sb -> height = 0;
            if (gui.which_scrollbars [SBAR_LEFT]) gui_do_scrollbar (wp, SBAR_LEFT, 0);
            if (gui.which_scrollbars [SBAR_RIGHT]) gui_do_scrollbar (wp, SBAR_RIGHT, 0);
            continue;
        }
        if (force || sb -> height != wp -> w_height || sb -> top != wp -> w_winrow || sb -> status_height != wp -> w_status_height || sb -> width != wp ->
          w_width || prev_curwin != curwin) {
            sb -> height = wp -> w_height;
            sb -> top = wp -> w_winrow;
            sb -> status_height = wp -> w_status_height;
            sb -> width = wp -> w_width;
            h = (sb -> height + sb -> status_height) * gui.char_height;
            y = sb -> top * gui.char_height + gui.border_offset;
            if (gui.menu_is_active) y += gui.menu_height;
            if (wp -> w_winrow == 0) {
                h += gui.border_offset;
                y -= gui.border_offset;
            }
            if (gui.which_scrollbars [SBAR_LEFT]) {
                gui_mch_set_scrollbar_pos (&wp->w_scrollbars[SBAR_LEFT], gui.left_sbar_x, y, gui.scrollbar_width, h);
                gui_do_scrollbar (wp, SBAR_LEFT, 1);
            }
            if (gui.which_scrollbars [SBAR_RIGHT]) {
                gui_mch_set_scrollbar_pos (&wp->w_scrollbars[SBAR_RIGHT], gui.right_sbar_x, y, gui.scrollbar_width, h);
                gui_do_scrollbar (wp, SBAR_RIGHT, 1);
            }
        }
        if (force || sb -> value != val || sb -> size != size || sb -> max != max) {
            sb -> value = val;
            sb -> size = size;
            sb -> max = max;
            if (gui.which_scrollbars [SBAR_LEFT] && (gui.dragged_sb != SBAR_LEFT || gui.dragged_wp != wp)) gui_mch_set_scrollbar_thumb 
              (&wp->w_scrollbars[SBAR_LEFT], val, size, max);
            if (gui.which_scrollbars [SBAR_RIGHT] && (gui.dragged_sb != SBAR_RIGHT || gui.dragged_wp != wp)) gui_mch_set_scrollbar_thumb 
              (&wp->w_scrollbars[SBAR_RIGHT], val, size, max);
        }
    }
    prev_curwin = curwin;
    --hold_gui_events;
}

static void gui_do_scrollbar (wp, which, enable)
    win_T * wp;
    int which;
    int enable;
{
    int midcol = curwin -> w_wincol + curwin -> w_width / 2;
    int has_midcol = (wp -> w_wincol <= midcol && wp -> w_wincol + wp -> w_width >= midcol);
    if (gui.which_scrollbars [SBAR_RIGHT] != gui.which_scrollbars [SBAR_LEFT]) {
        if (!has_midcol) enable = 0;
    }
    else {
        if (midcol > Columns / 2) {
            if (which == SBAR_LEFT ? wp -> w_wincol != 0 : !has_midcol) enable = 0;
        }
        else {
            if (which == SBAR_RIGHT ? wp -> w_wincol + wp -> w_width != Columns : !has_midcol) enable = 0;
        }
    }
    gui_mch_enable_scrollbar (&wp->w_scrollbars[which], enable);
}

int gui_do_scroll () {
    win_T * wp, * save_wp;
    int i;
    long nlines;
    pos_T old_cursor;
    linenr_T old_topline;
    int old_topfill;
    for (wp = firstwin, i = 0; i < current_scrollbar; wp = ((wp) -> w_next), i ++) if (wp == ((void *) 0)) break;
    if (wp == ((void *) 0)) return 0;
    nlines = (long) scrollbar_value + 1 - (long) wp -> w_topline;
    if (nlines == 0) return 0;
    save_wp = curwin;
    old_topline = wp -> w_topline;
    old_topfill = wp -> w_topfill;
    old_cursor = wp -> w_cursor;
    curwin = wp;
    curbuf = wp -> w_buffer;
    if (nlines < 0) scrolldown (-nlines, gui.dragged_wp == ((void *) 0));
    else scrollup (nlines, gui.dragged_wp == ((void *) 0));
    if (gui.dragged_sb == SBAR_NONE) gui.dragged_wp = ((void *) 0);
    if (old_topline != wp -> w_topline || old_topfill != wp -> w_topfill) {
        if (p_so != 0) {
            cursor_correct ();
            update_topline ();
        }
        if (old_cursor.lnum != wp -> w_cursor.lnum) coladvance (wp -> w_curswant);
        wp -> w_scbind_pos = wp -> w_topline;
    }
    validate_cursor ();
    curwin = save_wp;
    curbuf = save_wp -> w_buffer;
    if (old_topline != wp -> w_topline || wp -> w_redr_type != 0 || old_topfill != wp -> w_topfill) {
        int type = 10;
        if (pum_visible ()) {
            type = 40;
            wp -> w_lines_valid = 0;
        }
        if (wp -> w_redr_type < type) wp -> w_redr_type = type;
        updateWindow (wp);
    }
    if (pum_visible ()) pum_redraw ();
    return (wp == curwin && !(((curwin->w_cursor).lnum==(old_cursor).lnum)&&((curwin->w_cursor).col==(old_cursor).col)&&((curwin->w_cursor).coladd==(old_cursor
      ).coladd)));
}

static colnr_T scroll_line_len (lnum)
    linenr_T lnum;
{
    char_u * p;
    colnr_T col;
    int w;
    p = ml_get (lnum);
    col = 0;
    if (*p != '\000') for (;;) {
        w = chartabsize (p, col);
        ++p;
        if (*p == '\000') break;
        col += w;
    }
    return col;
}

static linenr_T longest_lnum = 0;

static linenr_T gui_find_longest_lnum () {
    linenr_T ret = 0;
    if (vim_strchr (p_go, 'h') == ((void *) 0) && curwin -> w_topline <= curwin -> w_cursor.lnum && curwin -> w_botline > curwin -> w_cursor.lnum && curwin ->
      w_botline <= curbuf -> b_ml.ml_line_count + 1) {
        linenr_T lnum;
        colnr_T n;
        long max = 0;
        for (lnum = curwin -> w_topline; lnum < curwin -> w_botline; ++lnum) {
            n = scroll_line_len (lnum);
            if (n > (colnr_T) max) {
                max = n;
                ret = lnum;
            }
            else if (n == (colnr_T) max && abs ((int) (lnum - curwin -> w_cursor.lnum)) < abs ((int) (ret - curwin -> w_cursor.lnum))) ret = lnum;
        }
    }
    else ret = curwin -> w_cursor.lnum;
    return ret;
}

static void gui_update_horiz_scrollbar (force)
    int force;
{
    long value, size, max;
    if (!gui.which_scrollbars[SBAR_BOTTOM]) return;
    if (!force && gui.dragged_sb == SBAR_BOTTOM) return;
    if (!force && curwin -> w_onebuf_opt.wo_wrap && gui.prev_wrap) return;
    if (curwin -> w_cursor.lnum > curbuf -> b_ml.ml_line_count) {
        gui.bottom_sbar.value = -1;
        return;
    }
    size = (curwin -> w_width);
    if (curwin -> w_onebuf_opt.wo_wrap) {
        value = 0;
        max = (curwin -> w_width) - 1;
    }
    else {
        value = curwin -> w_leftcol;
        longest_lnum = gui_find_longest_lnum ();
        max = scroll_line_len (longest_lnum);
        if (virtual_active ()) {
            if (curwin -> w_virtcol >= (colnr_T) max) max = curwin -> w_virtcol;
        }
        max += (curwin -> w_width) - 1;
        size -= curwin_col_off ();
        max -= curwin_col_off ();
    }
    if (value > max - size + 1) value = max - size + 1;
    if (!force && value == gui.bottom_sbar.value && size == gui.bottom_sbar.size && max == gui.bottom_sbar.max) return;
    gui.bottom_sbar.value = value;
    gui.bottom_sbar.size = size;
    gui.bottom_sbar.max = max;
    gui.prev_wrap = curwin -> w_onebuf_opt.wo_wrap;
    gui_mch_set_scrollbar_thumb (&gui.bottom_sbar, value, size, max);
}

int gui_do_horiz_scroll (leftcol, compute_longest_lnum)
    long_u leftcol;
    int compute_longest_lnum;
{
    if (curwin -> w_onebuf_opt.wo_wrap) return 0;
    if (curwin -> w_leftcol == (colnr_T) leftcol) return 0;
    curwin -> w_leftcol = (colnr_T) leftcol;
    if (vim_strchr (p_go, 'h') == ((void *) 0) && !virtual_active() && (colnr_T) leftcol > scroll_line_len (curwin -> w_cursor.lnum)) {
        if (compute_longest_lnum) {
            curwin -> w_cursor.lnum = gui_find_longest_lnum ();
            curwin -> w_cursor.col = 0;
        }
        else if (longest_lnum >= curwin -> w_topline && longest_lnum < curwin -> w_botline) {
            curwin -> w_cursor.lnum = longest_lnum;
            curwin -> w_cursor.col = 0;
        }
    }
    return leftcol_changed ();
}

void gui_check_colors () {
    if (gui.norm_pixel == gui.back_pixel || gui.norm_pixel == INVALCOLOR) {
        gui_set_bg_color ((char_u *) "White");
        if (gui.norm_pixel == gui.back_pixel || gui.norm_pixel == INVALCOLOR) gui_set_fg_color ((char_u *) "Black");
    }
}

static void gui_set_fg_color (name)
    char_u * name;
{
    gui.norm_pixel = gui_get_color (name);
    hl_set_fg_color_name (vim_strsave (name));
}

static void gui_set_bg_color (name)
    char_u * name;
{
    gui.back_pixel = gui_get_color (name);
    hl_set_bg_color_name (vim_strsave (name));
}

int gui_get_color (name)
    char_u * name;
{
    int t;
    if (*name == '\000') return INVALCOLOR;
    t = gui_mch_get_color (name);
    if (t == INVALCOLOR) emsg2 ((char_u *) (((char *) ("E254: Cannot allocate color %s"))), (char_u *) (name));
    return t;
}

int gui_get_lightness (pixel)
    int pixel;
{
    long_u rgb = gui_mch_get_rgb (pixel);
    return (int) ((((rgb >> 16) & 0xff) * 299) + (((rgb >> 8) & 0xff) * 587) + ((rgb & 0xff) * 114)) / 1000;
}

void gui_focus_change (in_focus)
    int in_focus;
{
    gui.in_focus = in_focus;
    out_flush ();
    gui_update_cursor (1, 0);
    if (!hold_gui_events) {
        char_u bytes [3];
        bytes [0] = 0x9b;
        bytes [1] = 253;
        bytes [2] = in_focus ? (int) KE_FOCUSGAINED : (int) KE_FOCUSLOST;
        add_to_input_buf (bytes, 3);
    }
}

void gui_mouse_moved (x, y)
    int x;
    int y;
{
    win_T * wp;
    char_u st [8];
    if (!gui.in_use || gui.starting) return;
    if (p_mousef && !hold_gui_events && (State & (0x01 | 0x10)) && State != (0x200 + 0x01) && msg_scrolled == 0 && !need_mouse_correct && gui.in_focus) {
        if (x < 0 || x > Columns * gui.char_width) return;
        wp = xy2win (x, y);
        if (wp == curwin || wp == ((void *) 0)) return;
        if (Y_2_ROW (y) < tabline_height ()) return;
        if (finish_op) {
            st [0] = '\033';
            add_to_input_buf (st, 1);
        }
        st [0] = 0x9b;
        st [1] = 251;
        st [2] = ('X');
        st [3] = (char_u) 0x00;
        fill_mouse_coord (st + 4, wp -> w_wincol == 0 ? -1 : wp -> w_wincol + 10000, wp -> w_height + (wp -> w_winrow));
        add_to_input_buf (st, 8);
        st [3] = (char_u) 0x03;
        add_to_input_buf (st, 8);
    }
}

void gui_mouse_correct () {
    int x, y;
    win_T * wp = ((void *) 0);
    need_mouse_correct = 0;
    if (!(gui.in_use&&p_mousef)) return;
    gui_mch_getmouse (&x, &y);
    if (x < 0 || x > Columns * gui.char_width) return;
    if (y >= 0 && Y_2_ROW (y) >= tabline_height ()) wp = xy2win (x, y);
    if (wp != curwin && wp != ((void *) 0)) {
        validate_cline_row ();
        gui_mch_setmouse ((int) (curwin -> w_wincol + curwin -> w_width) * gui.char_width - 3, ((curwin -> w_winrow) + curwin -> w_wrow) * gui.char_height + (
          gui.char_height) / 2);
    }
}

static win_T * xy2win (x, y)
    int x;
    int y;
{
    int row;
    int col;
    win_T * wp;
    row = Y_2_ROW (y);
    col = X_2_COL (x);
    if (row < 0 || col < 0) return ((void *) 0);
    wp = mouse_find_win (&row, &col);
    return wp;
}

void ex_gui (eap)
    exarg_T * eap;
{
    char_u * arg = eap -> arg;
    if (arg [0] == '-' && (arg [1] == 'f' || arg [1] == 'b') && (arg [2] == '\000' || ((arg [2]) == ' ' || (arg [2]) == '\t'))) {
        gui.dofork = (arg [1] == 'b');
        eap -> arg = skipwhite (eap -> arg + 2);
    }
    if (!gui.in_use) {
        msg_clr_eos_force ();
        gui_start ();
    }
    if (!ends_excmd(*eap->arg)) ex_next (eap);
}

