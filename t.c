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
FILE * funopen (const void *, int (*) (void *, char *, int), int (*) (void *, const char *, int), fpos_t (*) (void *, fpos_t,
  int), int (*) (void *));
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

typedef signed char int8_t;
typedef unsigned char u_int8_t;
typedef short int16_t;
typedef unsigned short u_int16_t;
typedef int int32_t;
typedef unsigned int u_int32_t;
typedef long long int64_t;
typedef unsigned long long u_int64_t;
typedef int64_t register_t;
typedef __darwin_intptr_t intptr_t;
typedef unsigned long uintptr_t;
typedef u_int64_t user_addr_t;
typedef u_int64_t user_size_t;
typedef int64_t user_ssize_t;
typedef int64_t user_long_t;
typedef u_int64_t user_ulong_t;
typedef int64_t user_time_t;
typedef int64_t user_off_t;
typedef u_int64_t syscall_arg_t;

static __inline__ __uint16_t _OSSwapInt16 (__uint16_t _data) {
    return ((_data << 8) | (_data >> 8));
}

static __inline__ __uint32_t _OSSwapInt32 (__uint32_t _data) {
    __asm__ ("bswap   %0" : "+r" (_data));
    return _data;
}

static __inline__ __uint64_t _OSSwapInt64 (__uint64_t _data) {
    __asm__ ("bswap   %0" : "+r" (_data));
    return _data;
}

typedef unsigned char u_char;
typedef unsigned short u_short;
typedef unsigned int u_int;
typedef unsigned long u_long;
typedef unsigned short ushort;
typedef unsigned int uint;
typedef u_int64_t u_quad_t;
typedef int64_t quad_t;
typedef quad_t * qaddr_t;
typedef char * caddr_t;
typedef int32_t daddr_t;
typedef __darwin_dev_t dev_t;
typedef u_int32_t fixpt_t;
typedef __darwin_blkcnt_t blkcnt_t;
typedef __darwin_blksize_t blksize_t;
typedef __darwin_gid_t gid_t;
typedef __uint32_t in_addr_t;
typedef __uint16_t in_port_t;
typedef __darwin_ino_t ino_t;
typedef __darwin_ino64_t ino64_t;
typedef __int32_t key_t;
typedef __darwin_mode_t mode_t;
typedef __uint16_t nlink_t;
typedef __darwin_id_t id_t;
typedef __darwin_pid_t pid_t;
typedef int32_t segsz_t;
typedef int32_t swblk_t;
typedef __darwin_uid_t uid_t;
typedef __darwin_clock_t clock_t;
typedef __darwin_ssize_t ssize_t;
typedef __darwin_time_t time_t;
typedef __darwin_useconds_t useconds_t;
typedef __darwin_suseconds_t suseconds_t;
typedef struct fd_set {
    __int32_t fds_bits [((((1024) % ((sizeof (__int32_t) * 8))) == 0) ? ((1024) / ((sizeof (__int32_t) * 8))) : (((1024) / ((
      sizeof (__int32_t) * 8))) + 1))];
} fd_set;

static __inline int __darwin_fd_isset (int _n, const struct fd_set * _p) {
    return (_p -> fds_bits [_n / (sizeof (__int32_t) * 8)] & (1 << (_n % (sizeof (__int32_t) * 8))));
}

typedef __int32_t fd_mask;
typedef __darwin_pthread_attr_t pthread_attr_t;
typedef __darwin_pthread_cond_t pthread_cond_t;
typedef __darwin_pthread_condattr_t pthread_condattr_t;
typedef __darwin_pthread_mutex_t pthread_mutex_t;
typedef __darwin_pthread_mutexattr_t pthread_mutexattr_t;
typedef __darwin_pthread_once_t pthread_once_t;
typedef __darwin_pthread_rwlock_t pthread_rwlock_t;
typedef __darwin_pthread_rwlockattr_t pthread_rwlockattr_t;
typedef __darwin_pthread_t pthread_t;
typedef __darwin_pthread_key_t pthread_key_t;
typedef __darwin_fsblkcnt_t fsblkcnt_t;
typedef __darwin_fsfilcnt_t fsfilcnt_t;
struct timespec {
    __darwin_time_t tv_sec;
    long tv_nsec;
};
struct ostat {
    __uint16_t st_dev;
    ino_t st_ino;
    mode_t st_mode;
    nlink_t st_nlink;
    __uint16_t st_uid;
    __uint16_t st_gid;
    __uint16_t st_rdev;
    __int32_t st_size;
    struct timespec st_atimespec;
    struct timespec st_mtimespec;
    struct timespec st_ctimespec;
    __int32_t st_blksize;
    __int32_t st_blocks;
    __uint32_t st_flags;
    __uint32_t st_gen;
};
struct stat {
    dev_t st_dev;
    mode_t st_mode;
    nlink_t st_nlink;
    __darwin_ino64_t st_ino;
    uid_t st_uid;
    gid_t st_gid;
    dev_t st_rdev;
    struct timespec st_atimespec;
    struct timespec st_mtimespec;
    struct timespec st_ctimespec;
    struct timespec st_birthtimespec;
    off_t st_size;
    blkcnt_t st_blocks;
    blksize_t st_blksize;
    __uint32_t st_flags;
    __uint32_t st_gen;
    __int32_t st_lspare;
    __int64_t st_qspare [2];
};
struct stat64 {
    dev_t st_dev;
    mode_t st_mode;
    nlink_t st_nlink;
    __darwin_ino64_t st_ino;
    uid_t st_uid;
    gid_t st_gid;
    dev_t st_rdev;
    struct timespec st_atimespec;
    struct timespec st_mtimespec;
    struct timespec st_ctimespec;
    struct timespec st_birthtimespec;
    off_t st_size;
    blkcnt_t st_blocks;
    blksize_t st_blksize;
    __uint32_t st_flags;
    __uint32_t st_gen;
    __int32_t st_lspare;
    __int64_t st_qspare [2];
};
int chmod (const char *, mode_t) __asm ("_" "chmod");
int fchmod (int, mode_t) __asm ("_" "fchmod");
int fstat (int, struct stat *) __asm ("_" "fstat" "$INODE64");
int lstat (const char *, struct stat *) __asm ("_" "lstat" "$INODE64");
int mkdir (const char *, mode_t);
int mkfifo (const char *, mode_t);
int stat (const char *, struct stat *) __asm ("_" "stat" "$INODE64");
int mknod (const char *, mode_t, dev_t);
mode_t umask (mode_t);
struct _filesec;
typedef struct _filesec * filesec_t;
int chflags (const char *, __uint32_t);
int chmodx_np (const char *, filesec_t);
int fchflags (int, __uint32_t);
int fchmodx_np (int, filesec_t);
int fstatx_np (int, struct stat *, filesec_t) __asm ("_" "fstatx_np" "$INODE64");
int lchflags (const char *, __uint32_t);
int lchmod (const char *, mode_t);
int lstatx_np (const char *, struct stat *, filesec_t) __asm ("_" "lstatx_np" "$INODE64");
int mkdirx_np (const char *, filesec_t);
int mkfifox_np (const char *, filesec_t);
int statx_np (const char *, struct stat *, filesec_t) __asm ("_" "statx_np" "$INODE64");
int umaskx_np (filesec_t);
int fstatx64_np (int, struct stat64 *, filesec_t) __attribute__ ((deprecated, visibility ("default")));
int lstatx64_np (const char *, struct stat64 *, filesec_t) __attribute__ ((deprecated, visibility ("default")));
int statx64_np (const char *, struct stat64 *, filesec_t) __attribute__ ((deprecated, visibility ("default")));
int fstat64 (int, struct stat64 *) __attribute__ ((deprecated, visibility ("default")));
int lstat64 (const char *, struct stat64 *) __attribute__ ((deprecated, visibility ("default")));
int stat64 (const char *, struct stat64 *) __attribute__ ((deprecated, visibility ("default")));
typedef enum {P_ALL, P_PID, P_PGID} idtype_t;
typedef int sig_atomic_t;
struct __darwin_i386_thread_state {
    unsigned int __eax;
    unsigned int __ebx;
    unsigned int __ecx;
    unsigned int __edx;
    unsigned int __edi;
    unsigned int __esi;
    unsigned int __ebp;
    unsigned int __esp;
    unsigned int __ss;
    unsigned int __eflags;
    unsigned int __eip;
    unsigned int __cs;
    unsigned int __ds;
    unsigned int __es;
    unsigned int __fs;
    unsigned int __gs;
};
struct __darwin_fp_control {
    unsigned short __invalid : 1, __denorm : 1, __zdiv : 1, __ovrfl : 1, __undfl : 1, __precis : 1, : 2, __pc : 2, __rc : 2, : 1
      , : 3;
};
typedef struct __darwin_fp_control __darwin_fp_control_t;
struct __darwin_fp_status {
    unsigned short __invalid : 1, __denorm : 1, __zdiv : 1, __ovrfl : 1, __undfl : 1, __precis : 1, __stkflt : 1, __errsumm : 1
      , __c0 : 1, __c1 : 1, __c2 : 1, __tos : 3, __c3 : 1, __busy : 1;
};
typedef struct __darwin_fp_status __darwin_fp_status_t;
struct __darwin_mmst_reg {
    char __mmst_reg [10];
    char __mmst_rsrv [6];
};
struct __darwin_xmm_reg {
    char __xmm_reg [16];
};
struct __darwin_i386_float_state {
    int __fpu_reserved [2];
    struct __darwin_fp_control __fpu_fcw;
    struct __darwin_fp_status __fpu_fsw;
    __uint8_t __fpu_ftw;
    __uint8_t __fpu_rsrv1;
    __uint16_t __fpu_fop;
    __uint32_t __fpu_ip;
    __uint16_t __fpu_cs;
    __uint16_t __fpu_rsrv2;
    __uint32_t __fpu_dp;
    __uint16_t __fpu_ds;
    __uint16_t __fpu_rsrv3;
    __uint32_t __fpu_mxcsr;
    __uint32_t __fpu_mxcsrmask;
    struct __darwin_mmst_reg __fpu_stmm0;
    struct __darwin_mmst_reg __fpu_stmm1;
    struct __darwin_mmst_reg __fpu_stmm2;
    struct __darwin_mmst_reg __fpu_stmm3;
    struct __darwin_mmst_reg __fpu_stmm4;
    struct __darwin_mmst_reg __fpu_stmm5;
    struct __darwin_mmst_reg __fpu_stmm6;
    struct __darwin_mmst_reg __fpu_stmm7;
    struct __darwin_xmm_reg __fpu_xmm0;
    struct __darwin_xmm_reg __fpu_xmm1;
    struct __darwin_xmm_reg __fpu_xmm2;
    struct __darwin_xmm_reg __fpu_xmm3;
    struct __darwin_xmm_reg __fpu_xmm4;
    struct __darwin_xmm_reg __fpu_xmm5;
    struct __darwin_xmm_reg __fpu_xmm6;
    struct __darwin_xmm_reg __fpu_xmm7;
    char __fpu_rsrv4 [14 * 16];
    int __fpu_reserved1;
};
struct __darwin_i386_exception_state {
    unsigned int __trapno;
    unsigned int __err;
    unsigned int __faultvaddr;
};
struct __darwin_x86_debug_state32 {
    unsigned int __dr0;
    unsigned int __dr1;
    unsigned int __dr2;
    unsigned int __dr3;
    unsigned int __dr4;
    unsigned int __dr5;
    unsigned int __dr6;
    unsigned int __dr7;
};
struct __darwin_x86_thread_state64 {
    __uint64_t __rax;
    __uint64_t __rbx;
    __uint64_t __rcx;
    __uint64_t __rdx;
    __uint64_t __rdi;
    __uint64_t __rsi;
    __uint64_t __rbp;
    __uint64_t __rsp;
    __uint64_t __r8;
    __uint64_t __r9;
    __uint64_t __r10;
    __uint64_t __r11;
    __uint64_t __r12;
    __uint64_t __r13;
    __uint64_t __r14;
    __uint64_t __r15;
    __uint64_t __rip;
    __uint64_t __rflags;
    __uint64_t __cs;
    __uint64_t __fs;
    __uint64_t __gs;
};
struct __darwin_x86_float_state64 {
    int __fpu_reserved [2];
    struct __darwin_fp_control __fpu_fcw;
    struct __darwin_fp_status __fpu_fsw;
    __uint8_t __fpu_ftw;
    __uint8_t __fpu_rsrv1;
    __uint16_t __fpu_fop;
    __uint32_t __fpu_ip;
    __uint16_t __fpu_cs;
    __uint16_t __fpu_rsrv2;
    __uint32_t __fpu_dp;
    __uint16_t __fpu_ds;
    __uint16_t __fpu_rsrv3;
    __uint32_t __fpu_mxcsr;
    __uint32_t __fpu_mxcsrmask;
    struct __darwin_mmst_reg __fpu_stmm0;
    struct __darwin_mmst_reg __fpu_stmm1;
    struct __darwin_mmst_reg __fpu_stmm2;
    struct __darwin_mmst_reg __fpu_stmm3;
    struct __darwin_mmst_reg __fpu_stmm4;
    struct __darwin_mmst_reg __fpu_stmm5;
    struct __darwin_mmst_reg __fpu_stmm6;
    struct __darwin_mmst_reg __fpu_stmm7;
    struct __darwin_xmm_reg __fpu_xmm0;
    struct __darwin_xmm_reg __fpu_xmm1;
    struct __darwin_xmm_reg __fpu_xmm2;
    struct __darwin_xmm_reg __fpu_xmm3;
    struct __darwin_xmm_reg __fpu_xmm4;
    struct __darwin_xmm_reg __fpu_xmm5;
    struct __darwin_xmm_reg __fpu_xmm6;
    struct __darwin_xmm_reg __fpu_xmm7;
    struct __darwin_xmm_reg __fpu_xmm8;
    struct __darwin_xmm_reg __fpu_xmm9;
    struct __darwin_xmm_reg __fpu_xmm10;
    struct __darwin_xmm_reg __fpu_xmm11;
    struct __darwin_xmm_reg __fpu_xmm12;
    struct __darwin_xmm_reg __fpu_xmm13;
    struct __darwin_xmm_reg __fpu_xmm14;
    struct __darwin_xmm_reg __fpu_xmm15;
    char __fpu_rsrv4 [6 * 16];
    int __fpu_reserved1;
};
struct __darwin_x86_exception_state64 {
    unsigned int __trapno;
    unsigned int __err;
    __uint64_t __faultvaddr;
};
struct __darwin_x86_debug_state64 {
    __uint64_t __dr0;
    __uint64_t __dr1;
    __uint64_t __dr2;
    __uint64_t __dr3;
    __uint64_t __dr4;
    __uint64_t __dr5;
    __uint64_t __dr6;
    __uint64_t __dr7;
};
struct __darwin_mcontext32 {
    struct __darwin_i386_exception_state __es;
    struct __darwin_i386_thread_state __ss;
    struct __darwin_i386_float_state __fs;
};
struct __darwin_mcontext64 {
    struct __darwin_x86_exception_state64 __es;
    struct __darwin_x86_thread_state64 __ss;
    struct __darwin_x86_float_state64 __fs;
};
typedef struct __darwin_mcontext64 * mcontext_t;
struct __darwin_sigaltstack {
    void * ss_sp;
    __darwin_size_t ss_size;
    int ss_flags;
};
struct __darwin_ucontext {
    int uc_onstack;
    __darwin_sigset_t uc_sigmask;
    struct __darwin_sigaltstack uc_stack;
    struct __darwin_ucontext * uc_link;
    __darwin_size_t uc_mcsize;
    struct __darwin_mcontext64 * uc_mcontext;
};
typedef struct __darwin_sigaltstack stack_t;
typedef struct __darwin_ucontext ucontext_t;
typedef __darwin_sigset_t sigset_t;
union sigval {
    int sival_int;
    void * sival_ptr;
};
struct sigevent {
    int sigev_notify;
    int sigev_signo;
    union sigval sigev_value;
    void (* sigev_notify_function) (union sigval);
    pthread_attr_t * sigev_notify_attributes;
};
typedef struct __siginfo {
    int si_signo;
    int si_errno;
    int si_code;
    pid_t si_pid;
    uid_t si_uid;
    int si_status;
    void * si_addr;
    union sigval si_value;
    long si_band;
    unsigned long __pad [7];
} siginfo_t;
union __sigaction_u {
    void (* __sa_handler) (int);
    void (* __sa_sigaction) (int, struct __siginfo *, void *);
};
struct __sigaction {
    union __sigaction_u __sigaction_u;
    void (* sa_tramp) (void *, int, int, siginfo_t *, void *);
    sigset_t sa_mask;
    int sa_flags;
};
struct sigaction {
    union __sigaction_u __sigaction_u;
    sigset_t sa_mask;
    int sa_flags;
};
typedef void (* sig_t) (int);
struct sigvec {
    void (* sv_handler) (int);
    int sv_mask;
    int sv_flags;
};
struct sigstack {
    char * ss_sp;
    int ss_onstack;
};
void (* signal (int, void (*) (int))) (int);
struct timeval {
    __darwin_time_t tv_sec;
    __darwin_suseconds_t tv_usec;
};
typedef __uint64_t rlim_t;
struct rusage {
    struct timeval ru_utime;
    struct timeval ru_stime;
    long ru_maxrss;
    long ru_ixrss;
    long ru_idrss;
    long ru_isrss;
    long ru_minflt;
    long ru_majflt;
    long ru_nswap;
    long ru_inblock;
    long ru_oublock;
    long ru_msgsnd;
    long ru_msgrcv;
    long ru_nsignals;
    long ru_nvcsw;
    long ru_nivcsw;
};
struct rlimit {
    rlim_t rlim_cur;
    rlim_t rlim_max;
};
int getpriority (int, id_t);
int getiopolicy_np (int, int);
int getrlimit (int, struct rlimit *) __asm ("_" "getrlimit");
int getrusage (int, struct rusage *);
int setpriority (int, id_t, int);
int setiopolicy_np (int, int, int);
int setrlimit (int, const struct rlimit *) __asm ("_" "setrlimit");
union wait {
    int w_status;
    struct {
        unsigned int w_Termsig : 7, w_Coredump : 1, w_Retcode : 8, w_Filler : 16;
    } w_T;
    struct {
        unsigned int w_Stopval : 8, w_Stopsig : 8, w_Filler : 16;
    } w_S;
};
pid_t wait (int *) __asm ("_" "wait");
pid_t waitpid (pid_t, int *, int) __asm ("_" "waitpid");
int waitid (idtype_t, id_t, siginfo_t *, int) __asm ("_" "waitid");
pid_t wait3 (int *, int, struct rusage *);
pid_t wait4 (pid_t, int *, int, struct rusage *);
void * alloca (size_t);
typedef struct {
    int quot;
    int rem;
} div_t;
typedef struct {
    long quot;
    long rem;
} ldiv_t;
typedef struct {
    long long quot;
    long long rem;
} lldiv_t;
extern int __mb_cur_max;
void abort (void) __attribute__ ((__noreturn__));
int abs (int) __attribute__ ((__const__));
int atexit (void (*) (void));
double atof (const char *);
int atoi (const char *);
long atol (const char *);
long long atoll (const char *);
void * bsearch (const void *, const void *, size_t, size_t, int (*) (const void *, const void *));
void * calloc (size_t, size_t);
div_t div (int, int) __attribute__ ((__const__));
void exit (int) __attribute__ ((__noreturn__));
void free (void *);
char * getenv (const char *);
long labs (long) __attribute__ ((__const__));
ldiv_t ldiv (long, long) __attribute__ ((__const__));
long long llabs (long long);
lldiv_t lldiv (long long, long long);
void * malloc (size_t);
int mblen (const char *, size_t);
size_t mbstowcs (wchar_t *, const char *, size_t);
int mbtowc (wchar_t *, const char *, size_t);
int posix_memalign (void * *, size_t, size_t);
void qsort (void *, size_t, size_t, int (*) (const void *, const void *));
int rand (void);
void * realloc (void *, size_t);
void srand (unsigned);
double strtod (const char *, char * *) __asm ("_" "strtod");
float strtof (const char *, char * *) __asm ("_" "strtof");
long strtol (const char *, char * *, int);
long double strtold (const char *, char * *);
long long strtoll (const char *, char * *, int);
unsigned long strtoul (const char *, char * *, int);
unsigned long long strtoull (const char *, char * *, int);
int system (const char *) __asm ("_" "system");
size_t wcstombs (char *, const wchar_t *, size_t);
int wctomb (char *, wchar_t);
void _Exit (int) __attribute__ ((__noreturn__));
long a64l (const char *);
double drand48 (void);
char * ecvt (double, int, int *, int *);
double erand48 (unsigned short [3]);
char * fcvt (double, int, int *, int *);
char * gcvt (double, int, char *);
int getsubopt (char * *, char * const *, char * *);
int grantpt (int);
char * initstate (unsigned, char *, size_t);
long jrand48 (unsigned short [3]);
char * l64a (long);
void lcong48 (unsigned short [7]);
long lrand48 (void);
char * mktemp (char *);
int mkstemp (char *);
long mrand48 (void);
long nrand48 (unsigned short [3]);
int posix_openpt (int);
char * ptsname (int);
int putenv (char *) __asm ("_" "putenv");
long random (void);
int rand_r (unsigned *);
char * realpath (const char *, char *) __asm ("_" "realpath" "$DARWIN_EXTSN");
unsigned short * seed48 (unsigned short [3]);
int setenv (const char *, const char *, int) __asm ("_" "setenv");
void setkey (const char *) __asm ("_" "setkey");
char * setstate (const char *);
void srand48 (long);
void srandom (unsigned);
int unlockpt (int);
int unsetenv (const char *) __asm ("_" "unsetenv");
u_int32_t arc4random (void);
void arc4random_addrandom (unsigned char * dat, int datlen);
void arc4random_stir (void);
int atexit_b (void (^) (void));
void * bsearch_b (const void *, const void *, size_t, size_t, int (^) (const void *, const void *));
char * cgetcap (char *, const char *, int);
int cgetclose (void);
int cgetent (char * *, char * *, const char *);
int cgetfirst (char * *, char * *);
int cgetmatch (const char *, const char *);
int cgetnext (char * *, char * *);
int cgetnum (char *, const char *, long *);
int cgetset (const char *);
int cgetstr (char *, const char *, char * *);
int cgetustr (char *, const char *, char * *);
int daemon (int, int) __asm ("_" "daemon" "$1050") __attribute__ ((deprecated, visibility ("default")));
char * devname (dev_t, mode_t);
char * devname_r (dev_t, mode_t, char * buf, int len);
char * getbsize (int *, long *);
int getloadavg (double [], int);
const char * getprogname (void);
int heapsort (void *, size_t, size_t, int (*) (const void *, const void *));
int heapsort_b (void *, size_t, size_t, int (^) (const void *, const void *));
int mergesort (void *, size_t, size_t, int (*) (const void *, const void *));
int mergesort_b (void *, size_t, size_t, int (^) (const void *, const void *));
void psort (void *, size_t, size_t, int (*) (const void *, const void *));
void psort_b (void *, size_t, size_t, int (^) (const void *, const void *));
void psort_r (void *, size_t, size_t, void *, int (*) (void *, const void *, const void *));
void qsort_b (void *, size_t, size_t, int (^) (const void *, const void *));
void qsort_r (void *, size_t, size_t, void *, int (*) (void *, const void *, const void *));
int radixsort (const unsigned char * *, int, const unsigned char *, unsigned);
void setprogname (const char *);
int sradixsort (const unsigned char * *, int, const unsigned char *, unsigned);
void sranddev (void);
void srandomdev (void);
void * reallocf (void *, size_t);
long long strtoq (const char *, char * *, int);
unsigned long long strtouq (const char *, char * *, int);
extern char * suboptarg;
void * valloc (size_t);
struct accessx_descriptor {
    unsigned int ad_name_offset;
    int ad_flags;
    int ad_pad [2];
};
typedef __darwin_uuid_t uuid_t;
void _exit (int) __attribute__ ((__noreturn__));
int access (const char *, int);
unsigned int alarm (unsigned int);
int chdir (const char *);
int chown (const char *, uid_t, gid_t);
int close (int) __asm ("_" "close");
size_t confstr (int, char *, size_t) __asm ("_" "confstr");
char * crypt (const char *, const char *);
char * ctermid (char *);
int dup (int);
int dup2 (int, int);
void encrypt (char *, int) __asm ("_" "encrypt");
int execl (const char *, const char *,...);
int execle (const char *, const char *,...);
int execlp (const char *, const char *,...);
int execv (const char *, char * const *);
int execve (const char *, char * const *, char * const *);
int execvp (const char *, char * const *);
int fchown (int, uid_t, gid_t);
int fchdir (int);
pid_t fork (void);
long fpathconf (int, int);
int fsync (int) __asm ("_" "fsync");
int ftruncate (int, off_t);
char * getcwd (char *, size_t);
gid_t getegid (void);
uid_t geteuid (void);
gid_t getgid (void);
int getgroups (int, gid_t []);
long gethostid (void);
int gethostname (char *, size_t);
char * getlogin (void);
int getlogin_r (char *, size_t);
int getopt (int, char * const [], const char *) __asm ("_" "getopt");
pid_t getpgid (pid_t);
pid_t getpgrp (void);
pid_t getpid (void);
pid_t getppid (void);
pid_t getsid (pid_t);
uid_t getuid (void);
char * getwd (char *);
int isatty (int);
int lchown (const char *, uid_t, gid_t) __asm ("_" "lchown");
int link (const char *, const char *);
int lockf (int, int, off_t) __asm ("_" "lockf");
off_t lseek (int, off_t, int);
int nice (int) __asm ("_" "nice");
long pathconf (const char *, int);
int pause (void) __asm ("_" "pause");
int pipe (int [2]);
ssize_t pread (int, void *, size_t, off_t) __asm ("_" "pread");
ssize_t pwrite (int, const void *, size_t, off_t) __asm ("_" "pwrite");
ssize_t read (int, void *, size_t) __asm ("_" "read");
ssize_t readlink (const char *, char *, size_t);
int rmdir (const char *);
int setegid (gid_t);
int seteuid (uid_t);
int setgid (gid_t);
int setpgid (pid_t, pid_t);
pid_t setpgrp (void) __asm ("_" "setpgrp");
int setregid (gid_t, gid_t) __asm ("_" "setregid");
int setreuid (uid_t, uid_t) __asm ("_" "setreuid");
pid_t setsid (void);
int setuid (uid_t);
unsigned int sleep (unsigned int) __asm ("_" "sleep");
void swab (const void *, void *, ssize_t);
int symlink (const char *, const char *);
void sync (void);
long sysconf (int);
pid_t tcgetpgrp (int);
int tcsetpgrp (int, pid_t);
int truncate (const char *, off_t);
char * ttyname (int);
int ttyname_r (int, char *, size_t) __asm ("_" "ttyname_r");
useconds_t ualarm (useconds_t, useconds_t);
int unlink (const char *);
int usleep (useconds_t) __asm ("_" "usleep");
pid_t vfork (void);
ssize_t write (int, const void *, size_t) __asm ("_" "write");
extern char * optarg;
extern int optind, opterr, optopt;
int pselect (int, fd_set *, fd_set *, fd_set *, const struct timespec *, const sigset_t *) __asm ("_" "pselect" "$1050");
int select (int, fd_set *, fd_set *, fd_set *, struct timeval *) __asm ("_" "select" "$1050");
void _Exit (int) __attribute__ ((__noreturn__));
int accessx_np (const struct accessx_descriptor *, size_t, int *, uid_t);
int acct (const char *);
int add_profil (char *, size_t, unsigned long, unsigned int);
void * brk (const void *);
int chroot (const char *);
void endusershell (void);
int execvP (const char *, const char *, char * const *);
char * fflagstostr (unsigned long);
int getdtablesize (void);
int getdomainname (char *, int);
int getgrouplist (const char *, int, int *, int *);
int gethostuuid (uuid_t, const struct timespec *);
mode_t getmode (const void *, mode_t);
int getpagesize (void) __attribute__ ((__const__));
char * getpass (const char *);
int getpeereid (int, uid_t *, gid_t *);
int getpgid (pid_t _pid);
int getsgroups_np (int *, uuid_t);
int getsid (pid_t _pid);
char * getusershell (void);
int getwgroups_np (int *, uuid_t);
int initgroups (const char *, int);
int iruserok (unsigned long, int, const char *, const char *);
int iruserok_sa (const void *, int, int, const char *, const char *);
int issetugid (void);
char * mkdtemp (char *);
int mknod (const char *, mode_t, dev_t);
int mkstemp (char *);
int mkstemps (char *, int);
char * mktemp (char *);
int nfssvc (int, void *);
int profil (char *, size_t, unsigned long, unsigned int);
int pthread_setugid_np (uid_t, gid_t);
int pthread_getugid_np (uid_t *, gid_t *);
int rcmd (char * *, int, const char *, const char *, const char *, int *);
int rcmd_af (char * *, int, const char *, const char *, const char *, int *, int);
int reboot (int);
int revoke (const char *);
int rresvport (int *);
int rresvport_af (int *, int);
int ruserok (const char *, int, const char *, const char *);
void * sbrk (int);
int setdomainname (const char *, int);
int setgroups (int, const gid_t *);
void sethostid (long);
int sethostname (const char *, int);
void setkey (const char *) __asm ("_" "setkey");
int setlogin (const char *);
void * setmode (const char *) __asm ("_" "setmode");
int setrgid (gid_t);
int setruid (uid_t);
int setsgroups_np (int, const uuid_t);
void setusershell (void);
int setwgroups_np (int, const uuid_t);
int strtofflags (char * *, unsigned long *, unsigned long *);
int swapon (const char *);
int syscall (int,...);
int ttyslot (void);
int undelete (const char *);
int unwhiteout (const char *);
void * valloc (size_t);
extern char * suboptarg;
int getsubopt (char * *, char * const *, char * *);
int fgetattrlist (int, void *, void *, size_t, unsigned int);
int fsetattrlist (int, void *, void *, size_t, unsigned int);
int getattrlist (const char *, void *, void *, size_t, unsigned int) __asm ("_" "getattrlist");
int setattrlist (const char *, void *, void *, size_t, unsigned int) __asm ("_" "setattrlist");
int exchangedata (const char *, const char *, unsigned int);
int getdirentriesattr (int, void *, void *, size_t, unsigned int *, unsigned int *, unsigned int *, unsigned int);
struct fssearchblock;
struct searchstate;
int searchfs (const char *, struct fssearchblock *, unsigned long *, unsigned int, unsigned int, struct searchstate *);
int fsctl (const char *, unsigned long, void *, unsigned int);
int ffsctl (int, unsigned long, void *, unsigned int);
extern int optreset;
void * memchr (const void *, int, size_t);
int memcmp (const void *, const void *, size_t);
void * memcpy (void *, const void *, size_t);
void * memmove (void *, const void *, size_t);
void * memset (void *, int, size_t);
char * stpcpy (char *, const char *);
char * strcasestr (const char *, const char *);
char * strcat (char *, const char *);
char * strchr (const char *, int);
int strcmp (const char *, const char *);
int strcoll (const char *, const char *);
char * strcpy (char *, const char *);
size_t strcspn (const char *, const char *);
char * strerror (int) __asm ("_" "strerror");
int strerror_r (int, char *, size_t);
size_t strlen (const char *);
char * strncat (char *, const char *, size_t);
int strncmp (const char *, const char *, size_t);
char * strncpy (char *, const char *, size_t);
char * strnstr (const char *, const char *, size_t);
char * strpbrk (const char *, const char *);
char * strrchr (const char *, int);
size_t strspn (const char *, const char *);
char * strstr (const char *, const char *);
char * strtok (char *, const char *);
size_t strxfrm (char *, const char *, size_t);
void * memccpy (void *, const void *, int, size_t);
char * strtok_r (char *, const char *, char * *);
char * strdup (const char *);
int bcmp (const void *, const void *, size_t);
void bcopy (const void *, void *, size_t);
void bzero (void *, size_t);
int ffs (int);
int ffsl (long);
int fls (int);
int flsl (long);
char * index (const char *, int);
void memset_pattern4 (void *, const void *, size_t);
void memset_pattern8 (void *, const void *, size_t);
void memset_pattern16 (void *, const void *, size_t);
char * rindex (const char *, int);
int strcasecmp (const char *, const char *);
size_t strlcat (char *, const char *, size_t);
size_t strlcpy (char *, const char *, size_t);
void strmode (int, char *);
int strncasecmp (const char *, const char *, size_t);
char * strsep (char * *, const char *);
char * strsignal (int sig);
void swab (const void *, void *, ssize_t);

static __inline void * __inline_memcpy_chk (void * __dest, const void * __src, size_t __len) {
    return __builtin___memcpy_chk (__dest, __src, __len, __builtin_object_size (__dest, 0));
}

static __inline void * __inline_memmove_chk (void * __dest, const void * __src, size_t __len) {
    return __builtin___memmove_chk (__dest, __src, __len, __builtin_object_size (__dest, 0));
}

static __inline void * __inline_memset_chk (void * __dest, int __val, size_t __len) {
    return __builtin___memset_chk (__dest, __val, __len, __builtin_object_size (__dest, 0));
}

static __inline char * __inline_strcpy_chk (char * __dest, const char * __src) {
    return __builtin___strcpy_chk (__dest, __src, __builtin_object_size (__dest, 1 > 1));
}

static __inline char * __inline_stpcpy_chk (char * __dest, const char * __src) {
    return __builtin___stpcpy_chk (__dest, __src, __builtin_object_size (__dest, 1 > 1));
}

static __inline char * __inline_strncpy_chk (char * __dest, const char * __src, size_t __len) {
    return __builtin___strncpy_chk (__dest, __src, __len, __builtin_object_size (__dest, 1 > 1));
}

static __inline char * __inline_strcat_chk (char * __dest, const char * __src) {
    return __builtin___strcat_chk (__dest, __src, __builtin_object_size (__dest, 1 > 1));
}

static __inline char * __inline_strncat_chk (char * __dest, const char * __src, size_t __len) {
    return __builtin___strncat_chk (__dest, __src, __len, __builtin_object_size (__dest, 1 > 1));
}

struct tm {
    int tm_sec;
    int tm_min;
    int tm_hour;
    int tm_mday;
    int tm_mon;
    int tm_year;
    int tm_wday;
    int tm_yday;
    int tm_isdst;
    long tm_gmtoff;
    char * tm_zone;
};
extern char * tzname [];
extern int getdate_err;
extern long timezone __asm ("_" "timezone");
extern int daylight;
char * asctime (const struct tm *);
clock_t clock (void) __asm ("_" "clock");
char * ctime (const time_t *);
double difftime (time_t, time_t);
struct tm * getdate (const char *);
struct tm * gmtime (const time_t *);
struct tm * localtime (const time_t *);
time_t mktime (struct tm *) __asm ("_" "mktime");
size_t strftime (char *, size_t, const char *, const struct tm *) __asm ("_" "strftime");
char * strptime (const char *, const char *, struct tm *) __asm ("_" "strptime");
time_t time (time_t *);
void tzset (void);
char * asctime_r (const struct tm *, char *);
char * ctime_r (const time_t *, char *);
struct tm * gmtime_r (const time_t *, struct tm *);
struct tm * localtime_r (const time_t *, struct tm *);
time_t posix2time (time_t);
void tzsetwall (void);
time_t time2posix (time_t);
time_t timelocal (struct tm * const);
time_t timegm (struct tm * const);
int nanosleep (const struct timespec *, struct timespec *) __asm ("_" "nanosleep");
typedef __builtin_va_list __gnuc_va_list;
typedef uid_t au_id_t;
typedef pid_t au_asid_t;
typedef u_int16_t au_event_t;
typedef u_int16_t au_emod_t;
typedef u_int32_t au_class_t;
typedef u_int64_t au_asflgs_t __attribute__ ((aligned (8)));
struct au_tid {
    dev_t port;
    u_int32_t machine;
};
typedef struct au_tid au_tid_t;
struct au_tid_addr {
    dev_t at_port;
    u_int32_t at_type;
    u_int32_t at_addr [4];
};
typedef struct au_tid_addr au_tid_addr_t;
struct au_mask {
    unsigned int am_success;
    unsigned int am_failure;
};
typedef struct au_mask au_mask_t;
struct auditinfo {
    au_id_t ai_auid;
    au_mask_t ai_mask;
    au_tid_t ai_termid;
    au_asid_t ai_asid;
};
typedef struct auditinfo auditinfo_t;
struct auditinfo_addr {
    au_id_t ai_auid;
    au_mask_t ai_mask;
    au_tid_addr_t ai_termid;
    au_asid_t ai_asid;
    au_asflgs_t ai_flags;
};
typedef struct auditinfo_addr auditinfo_addr_t;
struct auditpinfo {
    pid_t ap_pid;
    au_id_t ap_auid;
    au_mask_t ap_mask;
    au_tid_t ap_termid;
    au_asid_t ap_asid;
};
typedef struct auditpinfo auditpinfo_t;
struct auditpinfo_addr {
    pid_t ap_pid;
    au_id_t ap_auid;
    au_mask_t ap_mask;
    au_tid_addr_t ap_termid;
    au_asid_t ap_asid;
    au_asflgs_t ap_flags;
};
typedef struct auditpinfo_addr auditpinfo_addr_t;
struct au_session {
    auditinfo_addr_t * as_aia_p;
    au_mask_t as_mask;
};
typedef struct au_session au_session_t;
typedef struct au_token token_t;
struct au_qctrl {
    int aq_hiwater;
    int aq_lowater;
    int aq_bufsz;
    int aq_delay;
    int aq_minfree;
};
typedef struct au_qctrl au_qctrl_t;
struct audit_stat {
    unsigned int as_version;
    unsigned int as_numevent;
    int as_generated;
    int as_nonattrib;
    int as_kernel;
    int as_audit;
    int as_auditctl;
    int as_enqueue;
    int as_written;
    int as_wblocked;
    int as_rblocked;
    int as_dropped;
    int as_totalsize;
    unsigned int as_memused;
};
typedef struct audit_stat au_stat_t;
struct audit_fstat {
    u_int64_t af_filesz;
    u_int64_t af_currsz;
};
typedef struct audit_fstat au_fstat_t;
struct au_evclass_map {
    au_event_t ec_number;
    au_class_t ec_class;
};
typedef struct au_evclass_map au_evclass_map_t;
int audit (const void *, int);
int auditon (int, void *, int);
int auditctl (const char *);
int getauid (au_id_t *);
int setauid (const au_id_t *);
int getaudit (struct auditinfo *);
int setaudit (const struct auditinfo *);
int getaudit_addr (struct auditinfo_addr *, int);
int setaudit_addr (const struct auditinfo_addr *, int);
typedef unsigned char uint8_t;
typedef unsigned short uint16_t;
typedef unsigned int uint32_t;
typedef unsigned long long uint64_t;
typedef int8_t int_least8_t;
typedef int16_t int_least16_t;
typedef int32_t int_least32_t;
typedef int64_t int_least64_t;
typedef uint8_t uint_least8_t;
typedef uint16_t uint_least16_t;
typedef uint32_t uint_least32_t;
typedef uint64_t uint_least64_t;
typedef int8_t int_fast8_t;
typedef int16_t int_fast16_t;
typedef int32_t int_fast32_t;
typedef int64_t int_fast64_t;
typedef uint8_t uint_fast8_t;
typedef uint16_t uint_fast16_t;
typedef uint32_t uint_fast32_t;
typedef uint64_t uint_fast64_t;
typedef long int intmax_t;
typedef long unsigned int uintmax_t;
typedef unsigned int boolean_t;
typedef __darwin_natural_t natural_t;
typedef int integer_t;
typedef uintptr_t vm_offset_t;
typedef uintptr_t vm_size_t;
typedef uint64_t mach_vm_address_t;
typedef uint64_t mach_vm_offset_t;
typedef uint64_t mach_vm_size_t;
typedef uint64_t vm_map_offset_t;
typedef uint64_t vm_map_address_t;
typedef uint64_t vm_map_size_t;
typedef natural_t mach_port_name_t;
typedef mach_port_name_t * mach_port_name_array_t;
typedef mach_port_name_t mach_port_t;
typedef mach_port_t * mach_port_array_t;
typedef natural_t mach_port_right_t;
typedef natural_t mach_port_type_t;
typedef mach_port_type_t * mach_port_type_array_t;
typedef natural_t mach_port_urefs_t;
typedef integer_t mach_port_delta_t;
typedef natural_t mach_port_seqno_t;
typedef natural_t mach_port_mscount_t;
typedef natural_t mach_port_msgcount_t;
typedef natural_t mach_port_rights_t;
typedef unsigned int mach_port_srights_t;
typedef struct mach_port_status {
    mach_port_rights_t mps_pset;
    mach_port_seqno_t mps_seqno;
    mach_port_mscount_t mps_mscount;
    mach_port_msgcount_t mps_qlimit;
    mach_port_msgcount_t mps_msgcount;
    mach_port_rights_t mps_sorights;
    boolean_t mps_srights;
    boolean_t mps_pdrequest;
    boolean_t mps_nsrequest;
    natural_t mps_flags;
} mach_port_status_t;
typedef struct mach_port_limits {
    mach_port_msgcount_t mpl_qlimit;
} mach_port_limits_t;
typedef integer_t * mach_port_info_t;
typedef int mach_port_flavor_t;
typedef struct mach_port_qos {
    unsigned int name : 1;
    unsigned int prealloc : 1;
    boolean_t pad1 : 30;
    natural_t len;
} mach_port_qos_t;
mach_port_name_t audit_session_self (void);
au_asid_t audit_session_join (mach_port_name_t port);
struct label;
struct ucred {
    struct {
        struct ucred * tqe_next;
        struct ucred * * tqe_prev;
    } cr_link;
    u_long cr_ref;
    uid_t cr_uid;
    uid_t cr_ruid;
    uid_t cr_svuid;
    short cr_ngroups;
    gid_t cr_groups [16];
    gid_t cr_rgid;
    gid_t cr_svgid;
    uid_t cr_gmuid;
    struct auditinfo cr_au;
    struct label * cr_label;
    int cr_flags;
    struct au_session cr_audit;
};
typedef struct ucred * kauth_cred_t;
struct xucred {
    u_int cr_version;
    uid_t cr_uid;
    short cr_ngroups;
    gid_t cr_groups [16];
};
struct itimerval {
    struct timeval it_interval;
    struct timeval it_value;
};
struct timezone {
    int tz_minuteswest;
    int tz_dsttime;
};
struct clockinfo {
    int hz;
    int tick;
    int tickadj;
    int stathz;
    int profhz;
};
int adjtime (const struct timeval *, struct timeval *);
int futimes (int, const struct timeval *);
int lutimes (const char *, const struct timeval *);
int settimeofday (const struct timeval *, const struct timezone *);
int getitimer (int, struct itimerval *);
int gettimeofday (struct timeval *, void *);
int setitimer (int, const struct itimerval *, struct itimerval *);
int utimes (const char *, const struct timeval *);
typedef u_int32_t text_encoding_t;
typedef u_int32_t fsobj_type_t;
typedef u_int32_t fsobj_tag_t;
typedef u_int32_t fsfile_type_t;
typedef u_int32_t fsvolid_t;
typedef struct fsobj_id {
    u_int32_t fid_objno;
    u_int32_t fid_generation;
} fsobj_id_t;
typedef u_int32_t attrgroup_t;
struct attrlist {
    u_short bitmapcount;
    u_int16_t reserved;
    attrgroup_t commonattr;
    attrgroup_t volattr;
    attrgroup_t dirattr;
    attrgroup_t fileattr;
    attrgroup_t forkattr;
};
typedef struct attribute_set {
    attrgroup_t commonattr;
    attrgroup_t volattr;
    attrgroup_t dirattr;
    attrgroup_t fileattr;
    attrgroup_t forkattr;
} attribute_set_t;
typedef struct attrreference {
    int32_t attr_dataoffset;
    u_int32_t attr_length;
} attrreference_t;
struct diskextent {
    u_int32_t startblock;
    u_int32_t blockcount;
};
typedef struct diskextent extentrecord [8];
typedef u_int32_t vol_capabilities_set_t [4];
typedef struct vol_capabilities_attr {
    vol_capabilities_set_t capabilities;
    vol_capabilities_set_t valid;
} vol_capabilities_attr_t;
typedef struct vol_attributes_attr {
    attribute_set_t validattr;
    attribute_set_t nativeattr;
} vol_attributes_attr_t;
struct fssearchblock {
    struct attrlist * returnattrs;
    void * returnbuffer;
    size_t returnbuffersize;
    u_long maxmatches;
    struct timeval timelimit;
    void * searchparams1;
    size_t sizeofsearchparams1;
    void * searchparams2;
    size_t sizeofsearchparams2;
    struct attrlist searchattrs;
};
struct searchstate {
    u_char reserved [556];
};
typedef struct fsid {
    int32_t val [2];
} fsid_t;
struct statfs64 {
    uint32_t f_bsize;
    int32_t f_iosize;
    uint64_t f_blocks;
    uint64_t f_bfree;
    uint64_t f_bavail;
    uint64_t f_files;
    uint64_t f_ffree;
    fsid_t f_fsid;
    uid_t f_owner;
    uint32_t f_type;
    uint32_t f_flags;
    uint32_t f_fssubtype;
    char f_fstypename [16];
    char f_mntonname [1024];
    char f_mntfromname [1024];
    uint32_t f_reserved [8];
};
struct statfs {
    uint32_t f_bsize;
    int32_t f_iosize;
    uint64_t f_blocks;
    uint64_t f_bfree;
    uint64_t f_bavail;
    uint64_t f_files;
    uint64_t f_ffree;
    fsid_t f_fsid;
    uid_t f_owner;
    uint32_t f_type;
    uint32_t f_flags;
    uint32_t f_fssubtype;
    char f_fstypename [16];
    char f_mntonname [1024];
    char f_mntfromname [1024];
    uint32_t f_reserved [8];
};
struct vfsstatfs {
    uint32_t f_bsize;
    size_t f_iosize;
    uint64_t f_blocks;
    uint64_t f_bfree;
    uint64_t f_bavail;
    uint64_t f_bused;
    uint64_t f_files;
    uint64_t f_ffree;
    fsid_t f_fsid;
    uid_t f_owner;
    uint64_t f_flags;
    char f_fstypename [16];
    char f_mntonname [1024];
    char f_mntfromname [1024];
    uint32_t f_fssubtype;
    void * f_reserved [2];
};
struct mount;
typedef struct mount * mount_t;
struct vnode;
typedef struct vnode * vnode_t;
struct vfsconf {
    uint32_t vfc_reserved1;
    char vfc_name [15];
    int vfc_typenum;
    int vfc_refcount;
    int vfc_flags;
    uint32_t vfc_reserved2;
    uint32_t vfc_reserved3;
};
struct vfsidctl {
    int vc_vers;
    fsid_t vc_fsid;
    void * vc_ptr;
    size_t vc_len;
    u_int32_t vc_spare [12];
};
struct vfsquery {
    u_int32_t vq_flags;
    u_int32_t vq_spare [31];
};
struct fhandle {
    int fh_len;
    unsigned char fh_data [128];
};
typedef struct fhandle fhandle_t;
int fhopen (const struct fhandle *, int);
int fstatfs (int, struct statfs *) __asm ("_" "fstatfs" "$INODE64");
int fstatfs64 (int, struct statfs64 *) __attribute__ ((deprecated, visibility ("default")));
int getfh (const char *, fhandle_t *);
int getfsstat (struct statfs *, int, int) __asm ("_" "getfsstat" "$INODE64");
int getfsstat64 (struct statfs64 *, int, int) __attribute__ ((deprecated, visibility ("default")));
int getmntinfo (struct statfs * *, int) __asm ("_" "getmntinfo" "$INODE64");
int getmntinfo64 (struct statfs64 * *, int) __attribute__ ((deprecated, visibility ("default")));
int mount (const char *, const char *, int, void *);
int statfs (const char *, struct statfs *) __asm ("_" "statfs" "$INODE64");
int statfs64 (const char *, struct statfs64 *) __attribute__ ((deprecated, visibility ("default")));
int unmount (const char *, int);
int getvfsbyname (const char *, struct vfsconf *);
struct tms {
    clock_t tms_utime;
    clock_t tms_stime;
    clock_t tms_cutime;
    clock_t tms_cstime;
};
clock_t times (struct tms *);
extern const char * const sys_signame [32];
extern const char * const sys_siglist [32];
int raise (int);
void (* bsd_signal (int, void (*) (int))) (int);
int kill (pid_t, int) __asm ("_" "kill");
int killpg (pid_t, int) __asm ("_" "killpg");
int pthread_kill (pthread_t, int);
int pthread_sigmask (int, const sigset_t *, sigset_t *) __asm ("_" "pthread_sigmask");
int sigaction (int, const struct sigaction *, struct sigaction *);
int sigaddset (sigset_t *, int);
int sigaltstack (const stack_t *, stack_t *) __asm ("_" "sigaltstack");
int sigdelset (sigset_t *, int);
int sigemptyset (sigset_t *);
int sigfillset (sigset_t *);
int sighold (int);
int sigignore (int);
int siginterrupt (int, int);
int sigismember (const sigset_t *, int);
int sigpause (int) __asm ("_" "sigpause");
int sigpending (sigset_t *);
int sigprocmask (int, const sigset_t *, sigset_t *);
int sigrelse (int);
void (* sigset (int, void (*) (int))) (int);
int sigsuspend (const sigset_t *) __asm ("_" "sigsuspend");
int sigwait (const sigset_t *, int *) __asm ("_" "sigwait");
void psignal (unsigned int, const char *);
int sigblock (int);
int sigsetmask (int);
int sigvec (int, struct sigvec *, struct sigvec *);

static __inline int __sigbits (int __signo) {
    return __signo > 32 ? 0 : (1 << (__signo - 1));
}

struct flock {
    off_t l_start;
    off_t l_len;
    pid_t l_pid;
    short l_type;
    short l_whence;
};
struct radvisory {
    off_t ra_offset;
    int ra_count;
};
typedef struct fsignatures {
    off_t fs_file_start;
    void * fs_blob_start;
    size_t fs_blob_size;
} fsignatures_t;
typedef struct fstore {
    unsigned int fst_flags;
    int fst_posmode;
    off_t fst_offset;
    off_t fst_length;
    off_t fst_bytesalloc;
} fstore_t;
typedef struct fbootstraptransfer {
    off_t fbt_offset;
    size_t fbt_length;
    void * fbt_buffer;
} fbootstraptransfer_t;
struct log2phys {
    unsigned int l2p_flags;
    off_t l2p_contigbytes;
    off_t l2p_devoffset;
};
typedef enum {FILESEC_OWNER = 1, FILESEC_GROUP = 2, FILESEC_UUID = 3, FILESEC_MODE = 4, FILESEC_ACL = 5, FILESEC_GRPUUID = 6,
  FILESEC_ACL_RAW = 100, FILESEC_ACL_ALLOCSIZE = 101} filesec_property_t;
int open (const char *, int,...) __asm ("_" "open");
int creat (const char *, mode_t) __asm ("_" "creat");
int fcntl (int, int,...) __asm ("_" "fcntl");
int openx_np (const char *, int, filesec_t);
int flock (int, int);
filesec_t filesec_init (void);
filesec_t filesec_dup (filesec_t);
void filesec_free (filesec_t);
int filesec_get_property (filesec_t, filesec_property_t, void *);
int filesec_query_property (filesec_t, filesec_property_t, int *);
int filesec_set_property (filesec_t, filesec_property_t, const void *);
int filesec_unset_property (filesec_t, filesec_property_t);
struct extern_file {
    struct {
        struct extern_file * le_next;
        struct extern_file * * le_prev;
    } f_list;
    short f_flag;
    short f_type;
    short f_count;
    short f_msgcount;
    kauth_cred_t f_cred;
    void * f_ops;
    off_t f_offset;
    caddr_t f_data;
};
typedef __uint8_t sa_family_t;
typedef __darwin_socklen_t socklen_t;
struct iovec {
    void * iov_base;
    size_t iov_len;
};
struct linger {
    int l_onoff;
    int l_linger;
};
struct so_np_extensions {
    u_int32_t npx_flags;
    u_int32_t npx_mask;
};
struct sockaddr {
    __uint8_t sa_len;
    sa_family_t sa_family;
    char sa_data [14];
};
struct sockproto {
    __uint16_t sp_family;
    __uint16_t sp_protocol;
};
struct sockaddr_storage {
    __uint8_t ss_len;
    sa_family_t ss_family;
    char __ss_pad1 [((sizeof (__int64_t)) - sizeof (__uint8_t) - sizeof (sa_family_t))];
    __int64_t __ss_align;
    char __ss_pad2 [(128 - sizeof (__uint8_t) - sizeof (sa_family_t) - ((sizeof (__int64_t)) - sizeof (__uint8_t) - sizeof (
      sa_family_t)) - (sizeof (__int64_t)))];
};
struct msghdr {
    void * msg_name;
    socklen_t msg_namelen;
    struct iovec * msg_iov;
    int msg_iovlen;
    void * msg_control;
    socklen_t msg_controllen;
    int msg_flags;
};
struct cmsghdr {
    socklen_t cmsg_len;
    int cmsg_level;
    int cmsg_type;
};
struct sf_hdtr {
    struct iovec * headers;
    int hdr_cnt;
    struct iovec * trailers;
    int trl_cnt;
};
int accept (int, struct sockaddr *, socklen_t *) __asm ("_" "accept");
int bind (int, const struct sockaddr *, socklen_t) __asm ("_" "bind");
int connect (int, const struct sockaddr *, socklen_t) __asm ("_" "connect");
int getpeername (int, struct sockaddr *, socklen_t *) __asm ("_" "getpeername");
int getsockname (int, struct sockaddr *, socklen_t *) __asm ("_" "getsockname");
int getsockopt (int, int, int, void *, socklen_t *);
int listen (int, int) __asm ("_" "listen");
ssize_t recv (int, void *, size_t, int) __asm ("_" "recv");
ssize_t recvfrom (int, void *, size_t, int, struct sockaddr *, socklen_t *) __asm ("_" "recvfrom");
ssize_t recvmsg (int, struct msghdr *, int) __asm ("_" "recvmsg");
ssize_t send (int, const void *, size_t, int) __asm ("_" "send");
ssize_t sendmsg (int, const struct msghdr *, int) __asm ("_" "sendmsg");
ssize_t sendto (int, const void *, size_t, int, const struct sockaddr *, socklen_t) __asm ("_" "sendto");
int setsockopt (int, int, int, const void *, socklen_t);
int shutdown (int, int);
int sockatmark (int);
int socket (int, int, int);
int socketpair (int, int, int, int *) __asm ("_" "socketpair");
int sendfile (int, int, off_t, off_t *, struct sf_hdtr *, int);
void pfctlinput (int, struct sockaddr *);
struct winsize {
    unsigned short ws_row;
    unsigned short ws_col;
    unsigned short ws_xpixel;
    unsigned short ws_ypixel;
};
struct ttysize {
    unsigned short ts_lines;
    unsigned short ts_cols;
    unsigned short ts_xxx;
    unsigned short ts_yyy;
};
int ioctl (int, unsigned long,...);
struct in_addr {
    in_addr_t s_addr;
};
struct sockaddr_in {
    __uint8_t sin_len;
    sa_family_t sin_family;
    in_port_t sin_port;
    struct in_addr sin_addr;
    char sin_zero [8];
};
struct ip_opts {
    struct in_addr ip_dst;
    char ip_opts [40];
};
struct ip_mreq {
    struct in_addr imr_multiaddr;
    struct in_addr imr_interface;
};
struct in6_addr {
    union {
        __uint8_t __u6_addr8 [16];
        __uint16_t __u6_addr16 [8];
        __uint32_t __u6_addr32 [4];
    } __u6_addr;
};
struct sockaddr_in6 {
    __uint8_t sin6_len;
    sa_family_t sin6_family;
    in_port_t sin6_port;
    __uint32_t sin6_flowinfo;
    struct in6_addr sin6_addr;
    __uint32_t sin6_scope_id;
};
extern const struct in6_addr in6addr_any;
extern const struct in6_addr in6addr_loopback;
extern const struct in6_addr in6addr_nodelocal_allnodes;
extern const struct in6_addr in6addr_linklocal_allnodes;
extern const struct in6_addr in6addr_linklocal_allrouters;
struct ipv6_mreq {
    struct in6_addr ipv6mr_multiaddr;
    unsigned int ipv6mr_interface;
};
struct in6_pktinfo {
    struct in6_addr ipi6_addr;
    unsigned int ipi6_ifindex;
};
struct cmsghdr;
extern int inet6_option_space (int);
extern int inet6_option_init (void *, struct cmsghdr * *, int);
extern int inet6_option_append (struct cmsghdr *, const __uint8_t *, int, int);
extern __uint8_t * inet6_option_alloc (struct cmsghdr *, int, int, int);
extern int inet6_option_next (const struct cmsghdr *, __uint8_t * *);
extern int inet6_option_find (const struct cmsghdr *, __uint8_t * *, int);
extern size_t inet6_rthdr_space (int, int);
extern struct cmsghdr * inet6_rthdr_init (void *, int);
extern int inet6_rthdr_add (struct cmsghdr *, const struct in6_addr *, unsigned int);
extern int inet6_rthdr_lasthop (struct cmsghdr *, unsigned int);
extern int inet6_rthdr_segments (const struct cmsghdr *);
extern struct in6_addr * inet6_rthdr_getaddr (struct cmsghdr *, int);
extern int inet6_rthdr_getflags (const struct cmsghdr *, int);
extern int inet6_opt_init (void *, size_t);
extern int inet6_opt_append (void *, size_t, int, __uint8_t, size_t, __uint8_t, void * *);
extern int inet6_opt_finish (void *, size_t, int);
extern int inet6_opt_set_val (void *, size_t, void *, int);
extern int inet6_opt_next (void *, size_t, int, __uint8_t *, size_t *, void * *);
extern int inet6_opt_find (void *, size_t, int, __uint8_t, size_t *, void * *);
extern int inet6_opt_get_val (void *, size_t, void *, int);
extern size_t inet6_rth_space (int, int);
extern void * inet6_rth_init (void *, int, int, int);
extern int inet6_rth_add (void *, const struct in6_addr *);
extern int inet6_rth_reverse (const void *, void *);
extern int inet6_rth_segments (const void *);
extern struct in6_addr * inet6_rth_getaddr (const void *, int);
int bindresvport (int, struct sockaddr_in *);
struct sockaddr;
int bindresvport_sa (int, struct sockaddr *);
in_addr_t inet_addr (const char *);
char * inet_ntoa (struct in_addr);
const char * inet_ntop (int, const void *, char *, socklen_t);
int inet_pton (int, const char *, void *);
int ascii2addr (int, const char *, void *);
char * addr2ascii (int, const void *, int, char *);
int inet_aton (const char *, struct in_addr *);
in_addr_t inet_lnaof (struct in_addr);
struct in_addr inet_makeaddr (in_addr_t, in_addr_t);
in_addr_t inet_netof (struct in_addr);
in_addr_t inet_network (const char *);
char * inet_net_ntop (int, const void *, int, char *, __darwin_size_t);
int inet_net_pton (int, const char *, void *, __darwin_size_t);
char * inet_neta (in_addr_t, char *, __darwin_size_t);
unsigned int inet_nsap_addr (const char *, unsigned char *, int maxlen);
char * inet_nsap_ntoa (int, const unsigned char *, char * ascii);
typedef int kern_return_t;
struct qelem {
    struct qelem * q_forw;
    struct qelem * q_back;
    char * q_data;
};
extern kern_return_t map_fd (int fd, vm_offset_t offset, vm_offset_t * addr, boolean_t find_space, vm_size_t numbytes);
struct dirent {
    __uint64_t d_ino;
    __uint64_t d_seekoff;
    __uint16_t d_reclen;
    __uint16_t d_namlen;
    __uint8_t d_type;
    char d_name [1024];
};
struct _telldir;
typedef struct {
    int __dd_fd;
    long __dd_loc;
    long __dd_size;
    char * __dd_buf;
    int __dd_len;
    long __dd_seek;
    long __dd_rewind;
    int __dd_flags;
    __darwin_pthread_mutex_t __dd_lock;
    struct _telldir * __dd_td;
} DIR;
int alphasort (const void *, const void *) __asm ("_" "alphasort" "$INODE64");
int closedir (DIR *) __asm ("_" "closedir");
int getdirentries (int, char *, int, long *) __asm ("_getdirentries_is_not_available_when_64_bit_inodes_are_in_effect");
DIR * opendir (const char *) __asm ("_" "opendir" "$INODE64");
DIR * __opendir2 (const char *, int) __asm ("_" "__opendir2" "$INODE64");
struct dirent * readdir (DIR *) __asm ("_" "readdir" "$INODE64");
int readdir_r (DIR *, struct dirent *, struct dirent * *) __asm ("_" "readdir_r" "$INODE64");
void rewinddir (DIR *) __asm ("_" "rewinddir" "$INODE64");
int scandir (const char *, struct dirent * * *, int (*) (struct dirent *), int (*) (const void *, const void *)) __asm ("_"
  "scandir" "$INODE64");
int scandir_b (const char *, struct dirent * * *, int (^) (struct dirent *), int (^) (const void *, const void *)) __asm ("_"
  "scandir_b" "$INODE64");
void seekdir (DIR *, long) __asm ("_" "seekdir" "$INODE64");
long telldir (DIR *) __asm ("_" "telldir" "$INODE64");
extern int * __error (void);
struct passwd {
    char * pw_name;
    char * pw_passwd;
    uid_t pw_uid;
    gid_t pw_gid;
    __darwin_time_t pw_change;
    char * pw_class;
    char * pw_gecos;
    char * pw_dir;
    char * pw_shell;
    __darwin_time_t pw_expire;
};
struct passwd * getpwuid (uid_t);
struct passwd * getpwnam (const char *);
int getpwuid_r (uid_t, struct passwd *, char *, size_t, struct passwd * *);
int getpwnam_r (const char *, struct passwd *, char *, size_t, struct passwd * *);
struct passwd * getpwent (void);
int setpassent (int);
char * user_from_uid (uid_t, int);
void setpwent (void);
void endpwent (void);
typedef int jmp_buf [((9 * 2) + 3 + 16)];
typedef int sigjmp_buf [((9 * 2) + 3 + 16) + 1];
int setjmp (jmp_buf);
void longjmp (jmp_buf, int);
int _setjmp (jmp_buf);
void _longjmp (jmp_buf, int);
int sigsetjmp (sigjmp_buf, int);
void siglongjmp (sigjmp_buf, int);
void longjmperror (void);
typedef unsigned int chtype;
typedef unsigned long mmask_t;
char * unctrl (chtype);
typedef unsigned char NCURSES_BOOL;
extern chtype acs_map [];
typedef struct screen SCREEN;
typedef struct _win_st WINDOW;
typedef chtype attr_t;
extern int addch (const chtype);
extern int addchnstr (const chtype *, int);
extern int addchstr (const chtype *);
extern int addnstr (const char *, int);
extern int addstr (const char *);
extern int attroff (int);
extern int attron (int);
extern int attrset (int);
extern int attr_get (attr_t *, short *, void *);
extern int attr_off (attr_t, void *);
extern int attr_on (attr_t, void *);
extern int attr_set (attr_t, short, void *);
extern int baudrate (void);
extern int beep (void);
extern int bkgd (chtype);
extern void bkgdset (chtype);
extern int border (chtype, chtype, chtype, chtype, chtype, chtype, chtype, chtype);
extern int box (WINDOW *, chtype, chtype);
extern _Bool can_change_color (void);
extern int cbreak (void);
extern int chgat (int, attr_t, short, const void *);
extern int clear (void);
extern int clearok (WINDOW *, _Bool);
extern int clrtobot (void);
extern int clrtoeol (void);
extern int color_content (short, short *, short *, short *);
extern int color_set (short, void *);
extern int COLOR_PAIR (int);
extern int copywin (const WINDOW *, WINDOW *, int, int, int, int, int, int, int);
extern int curs_set (int);
extern int def_prog_mode (void);
extern int def_shell_mode (void);
extern int delay_output (int);
extern int delch (void);
extern void delscreen (SCREEN *);
extern int delwin (WINDOW *);
extern int deleteln (void);
extern WINDOW * derwin (WINDOW *, int, int, int, int);
extern int doupdate (void);
extern WINDOW * dupwin (WINDOW *);
extern int echo (void);
extern int echochar (const chtype);
extern int erase (void);
extern int endwin (void);
extern char erasechar (void);
extern void filter (void);
extern int flash (void);
extern int flushinp (void);
extern chtype getbkgd (WINDOW *);
extern int getch (void);
extern int getnstr (char *, int);
extern int getstr (char *);
extern WINDOW * getwin (FILE *);
extern int halfdelay (int);
extern _Bool has_colors (void);
extern _Bool has_ic (void);
extern _Bool has_il (void);
extern int hline (chtype, int);
extern void idcok (WINDOW *, _Bool);
extern int idlok (WINDOW *, _Bool);
extern void immedok (WINDOW *, _Bool);
extern chtype inch (void);
extern int inchnstr (chtype *, int);
extern int inchstr (chtype *);
extern WINDOW * initscr (void);
extern int init_color (short, short, short, short);
extern int init_pair (short, short, short);
extern int innstr (char *, int);
extern int insch (chtype);
extern int insdelln (int);
extern int insertln (void);
extern int insnstr (const char *, int);
extern int insstr (const char *);
extern int instr (char *);
extern int intrflush (WINDOW *, _Bool);
extern _Bool isendwin (void);
extern _Bool is_linetouched (WINDOW *, int);
extern _Bool is_wintouched (WINDOW *);
extern char * keyname (int);
extern int keypad (WINDOW *, _Bool);
extern char killchar (void);
extern int leaveok (WINDOW *, _Bool);
extern char * longname (void);
extern int meta (WINDOW *, _Bool);
extern int move (int, int);
extern int mvaddch (int, int, const chtype);
extern int mvaddchnstr (int, int, const chtype *, int);
extern int mvaddchstr (int, int, const chtype *);
extern int mvaddnstr (int, int, const char *, int);
extern int mvaddstr (int, int, const char *);
extern int mvchgat (int, int, int, attr_t, short, const void *);
extern int mvcur (int, int, int, int);
extern int mvdelch (int, int);
extern int mvderwin (WINDOW *, int, int);
extern int mvgetch (int, int);
extern int mvgetnstr (int, int, char *, int);
extern int mvgetstr (int, int, char *);
extern int mvhline (int, int, chtype, int);
extern chtype mvinch (int, int);
extern int mvinchnstr (int, int, chtype *, int);
extern int mvinchstr (int, int, chtype *);
extern int mvinnstr (int, int, char *, int);
extern int mvinsch (int, int, chtype);
extern int mvinsnstr (int, int, const char *, int);
extern int mvinsstr (int, int, const char *);
extern int mvinstr (int, int, char *);
extern int mvprintw (int, int, const char *,...);
extern int mvscanw (int, int, char *,...);
extern int mvvline (int, int, chtype, int);
extern int mvwaddch (WINDOW *, int, int, const chtype);
extern int mvwaddchnstr (WINDOW *, int, int, const chtype *, int);
extern int mvwaddchstr (WINDOW *, int, int, const chtype *);
extern int mvwaddnstr (WINDOW *, int, int, const char *, int);
extern int mvwaddstr (WINDOW *, int, int, const char *);
extern int mvwchgat (WINDOW *, int, int, int, attr_t, short, const void *);
extern int mvwdelch (WINDOW *, int, int);
extern int mvwgetch (WINDOW *, int, int);
extern int mvwgetnstr (WINDOW *, int, int, char *, int);
extern int mvwgetstr (WINDOW *, int, int, char *);
extern int mvwhline (WINDOW *, int, int, chtype, int);
extern int mvwin (WINDOW *, int, int);
extern chtype mvwinch (WINDOW *, int, int);
extern int mvwinchnstr (WINDOW *, int, int, chtype *, int);
extern int mvwinchstr (WINDOW *, int, int, chtype *);
extern int mvwinnstr (WINDOW *, int, int, char *, int);
extern int mvwinsch (WINDOW *, int, int, chtype);
extern int mvwinsnstr (WINDOW *, int, int, const char *, int);
extern int mvwinsstr (WINDOW *, int, int, const char *);
extern int mvwinstr (WINDOW *, int, int, char *);
extern int mvwprintw (WINDOW *, int, int, const char *,...);
extern int mvwscanw (WINDOW *, int, int, char *,...);
extern int mvwvline (WINDOW *, int, int, chtype, int);
extern int napms (int);
extern WINDOW * newpad (int, int);
extern SCREEN * newterm (char *, FILE *, FILE *);
extern WINDOW * newwin (int, int, int, int);
extern int nl (void);
extern int nocbreak (void);
extern int nodelay (WINDOW *, _Bool);
extern int noecho (void);
extern int nonl (void);
extern void noqiflush (void);
extern int noraw (void);
extern int notimeout (WINDOW *, _Bool);
extern int overlay (const WINDOW *, WINDOW *);
extern int overwrite (const WINDOW *, WINDOW *);
extern int pair_content (short, short *, short *);
extern int PAIR_NUMBER (int);
extern int pechochar (WINDOW *, const chtype);
extern int pnoutrefresh (WINDOW *, int, int, int, int, int, int);
extern int prefresh (WINDOW *, int, int, int, int, int, int);
extern int printw (const char *,...);
extern int putwin (WINDOW *, FILE *);
extern void qiflush (void);
extern int raw (void);
extern int redrawwin (WINDOW *);
extern int refresh (void);
extern int resetty (void);
extern int reset_prog_mode (void);
extern int reset_shell_mode (void);
extern int ripoffline (int, int (*) (WINDOW *, int));
extern int savetty (void);
extern int scanw (char *,...);
extern int scr_dump (const char *);
extern int scr_init (const char *);
extern int scrl (int);
extern int scroll (WINDOW *);
extern int scrollok (WINDOW *, _Bool);
extern int scr_restore (const char *);
extern int scr_set (const char *);
extern int setscrreg (int, int);
extern SCREEN * set_term (SCREEN *);
extern int slk_attroff (const chtype);
extern int slk_attr_off (const attr_t, void *);
extern int slk_attron (const chtype);
extern int slk_attr_on (attr_t, void *);
extern int slk_attrset (const chtype);
extern attr_t slk_attr (void);
extern int slk_attr_set (const attr_t, short, void *);
extern int slk_clear (void);
extern int slk_color (short);
extern int slk_init (int);
extern char * slk_label (int);
extern int slk_noutrefresh (void);
extern int slk_refresh (void);
extern int slk_restore (void);
extern int slk_set (int, const char *, int);
extern int slk_touch (void);
extern int standout (void);
extern int standend (void);
extern int start_color (void);
extern WINDOW * subpad (WINDOW *, int, int, int, int);
extern WINDOW * subwin (WINDOW *, int, int, int, int);
extern int syncok (WINDOW *, _Bool);
extern chtype termattrs (void);
extern char * termname (void);
extern void timeout (int);
extern int touchline (WINDOW *, int, int);
extern int touchwin (WINDOW *);
extern int typeahead (int);
extern int ungetch (int);
extern int untouchwin (WINDOW *);
extern void use_env (_Bool);
extern int vidattr (chtype);
extern int vidputs (chtype, int (*) (int));
extern int vline (chtype, int);
extern int vwprintw (WINDOW *, const char *, va_list);
extern int vw_printw (WINDOW *, const char *, va_list);
extern int vwscanw (WINDOW *, char *, va_list);
extern int vw_scanw (WINDOW *, char *, va_list);
extern int waddch (WINDOW *, const chtype);
extern int waddchnstr (WINDOW *, const chtype *, int);
extern int waddchstr (WINDOW *, const chtype *);
extern int waddnstr (WINDOW *, const char *, int);
extern int waddstr (WINDOW *, const char *);
extern int wattron (WINDOW *, int);
extern int wattroff (WINDOW *, int);
extern int wattrset (WINDOW *, int);
extern int wattr_get (WINDOW *, attr_t *, short *, void *);
extern int wattr_on (WINDOW *, attr_t, void *);
extern int wattr_off (WINDOW *, attr_t, void *);
extern int wattr_set (WINDOW *, attr_t, short, void *);
extern int wbkgd (WINDOW *, chtype);
extern void wbkgdset (WINDOW *, chtype);
extern int wborder (WINDOW *, chtype, chtype, chtype, chtype, chtype, chtype, chtype, chtype);
extern int wchgat (WINDOW *, int, attr_t, short, const void *);
extern int wclear (WINDOW *);
extern int wclrtobot (WINDOW *);
extern int wclrtoeol (WINDOW *);
extern int wcolor_set (WINDOW *, short, void *);
extern void wcursyncup (WINDOW *);
extern int wdelch (WINDOW *);
extern int wdeleteln (WINDOW *);
extern int wechochar (WINDOW *, const chtype);
extern int werase (WINDOW *);
extern int wgetch (WINDOW *);
extern int wgetnstr (WINDOW *, char *, int);
extern int wgetstr (WINDOW *, char *);
extern int whline (WINDOW *, chtype, int);
extern chtype winch (WINDOW *);
extern int winchnstr (WINDOW *, chtype *, int);
extern int winchstr (WINDOW *, chtype *);
extern int winnstr (WINDOW *, char *, int);
extern int winsch (WINDOW *, chtype);
extern int winsdelln (WINDOW *, int);
extern int winsertln (WINDOW *);
extern int winsnstr (WINDOW *, const char *, int);
extern int winsstr (WINDOW *, const char *);
extern int winstr (WINDOW *, char *);
extern int wmove (WINDOW *, int, int);
extern int wnoutrefresh (WINDOW *);
extern int wprintw (WINDOW *, const char *,...);
extern int wredrawln (WINDOW *, int, int);
extern int wrefresh (WINDOW *);
extern int wscanw (WINDOW *, char *,...);
extern int wscrl (WINDOW *, int);
extern int wsetscrreg (WINDOW *, int, int);
extern int wstandout (WINDOW *);
extern int wstandend (WINDOW *);
extern void wsyncdown (WINDOW *);
extern void wsyncup (WINDOW *);
extern void wtimeout (WINDOW *, int);
extern int wtouchln (WINDOW *, int, int, int);
extern int wvline (WINDOW *, chtype, int);
extern int tigetflag (char *);
extern int tigetnum (char *);
extern char * tigetstr (char *);
extern int putp (const char *);
extern char * tparm (char *,...);
extern int getattrs (const WINDOW *);
extern int getcurx (const WINDOW *);
extern int getcury (const WINDOW *);
extern int getbegx (const WINDOW *);
extern int getbegy (const WINDOW *);
extern int getmaxx (const WINDOW *);
extern int getmaxy (const WINDOW *);
extern int getparx (const WINDOW *);
extern int getpary (const WINDOW *);
typedef int (* NCURSES_WINDOW_CB) (WINDOW *, void *);
typedef int (* NCURSES_SCREEN_CB) (SCREEN *, void *);
extern _Bool is_term_resized (int, int);
extern char * keybound (int, int);
extern const char * curses_version (void);
extern int assume_default_colors (int, int);
extern int define_key (const char *, int);
extern int key_defined (const char *);
extern int keyok (int, _Bool);
extern int resize_term (int, int);
extern int resizeterm (int, int);
extern int set_escdelay (int);
extern int set_tabsize (int);
extern int use_default_colors (void);
extern int use_extended_names (_Bool);
extern int use_legacy_coding (int);
extern int use_screen (SCREEN *, NCURSES_SCREEN_CB, void *);
extern int use_window (WINDOW *, NCURSES_WINDOW_CB, void *);
extern int wresize (WINDOW *, int, int);
extern void nofilter (void);
extern WINDOW * wgetparent (const WINDOW *);
extern _Bool is_cleared (const WINDOW *);
extern _Bool is_idcok (const WINDOW *);
extern _Bool is_idlok (const WINDOW *);
extern _Bool is_immedok (const WINDOW *);
extern _Bool is_keypad (const WINDOW *);
extern _Bool is_leaveok (const WINDOW *);
extern _Bool is_nodelay (const WINDOW *);
extern _Bool is_notimeout (const WINDOW *);
extern _Bool is_scrollok (const WINDOW *);
extern _Bool is_syncok (const WINDOW *);
extern int wgetscrreg (const WINDOW *, int *, int *);
extern WINDOW * curscr;
extern WINDOW * newscr;
extern WINDOW * stdscr;
extern char ttytype [];
extern int COLORS;
extern int COLOR_PAIRS;
extern int COLS;
extern int ESCDELAY;
extern int LINES;
extern int TABSIZE;
typedef struct {
    short id;
    int x, y, z;
    mmask_t bstate;
} MEVENT;
extern int getmouse (MEVENT *);
extern int ungetmouse (MEVENT *);
extern mmask_t mousemask (mmask_t, mmask_t *);
extern _Bool wenclose (const WINDOW *, int, int);
extern int mouseinterval (int);
extern _Bool wmouse_trafo (const WINDOW *, int *, int *, _Bool);
extern _Bool mouse_trafo (int *, int *, _Bool);
extern int mcprint (char *, int);
extern int has_key (int);
extern void _tracef (const char *,...);
extern void _tracedump (const char *, WINDOW *);
extern char * _traceattr (attr_t);
extern char * _traceattr2 (int, chtype);
extern char * _nc_tracebits (void);
extern char * _tracechar (int);
extern char * _tracechtype (chtype);
extern char * _tracechtype2 (int, chtype);
extern char * _tracemouse (const MEVENT *);
extern void trace (const unsigned int);
struct lconv {
    char * decimal_point;
    char * thousands_sep;
    char * grouping;
    char * int_curr_symbol;
    char * currency_symbol;
    char * mon_decimal_point;
    char * mon_thousands_sep;
    char * mon_grouping;
    char * positive_sign;
    char * negative_sign;
    char int_frac_digits;
    char frac_digits;
    char p_cs_precedes;
    char p_sep_by_space;
    char n_cs_precedes;
    char n_sep_by_space;
    char p_sign_posn;
    char n_sign_posn;
    char int_p_cs_precedes;
    char int_n_cs_precedes;
    char int_p_sep_by_space;
    char int_n_sep_by_space;
    char int_p_sign_posn;
    char int_n_sign_posn;
};
struct lconv * localeconv (void);
char * setlocale (int, const char *);
typedef unsigned char char_u;
typedef unsigned short short_u;
typedef unsigned int int_u;
typedef unsigned long long_u;
typedef long long_i;
typedef char_u schar_T;
typedef unsigned short sattr_T;
enum key_extra {KE_NAME = 3, KE_S_UP, KE_S_DOWN, KE_S_F1, KE_S_F2, KE_S_F3, KE_S_F4, KE_S_F5, KE_S_F6, KE_S_F7, KE_S_F8, KE_S_F9
  , KE_S_F10, KE_S_F11, KE_S_F12, KE_S_F13, KE_S_F14, KE_S_F15, KE_S_F16, KE_S_F17, KE_S_F18, KE_S_F19, KE_S_F20, KE_S_F21,
  KE_S_F22, KE_S_F23, KE_S_F24, KE_S_F25, KE_S_F26, KE_S_F27, KE_S_F28, KE_S_F29, KE_S_F30, KE_S_F31, KE_S_F32, KE_S_F33,
  KE_S_F34, KE_S_F35, KE_S_F36, KE_S_F37, KE_MOUSE, KE_LEFTMOUSE, KE_LEFTDRAG, KE_LEFTRELEASE, KE_MIDDLEMOUSE, KE_MIDDLEDRAG,
  KE_MIDDLERELEASE, KE_RIGHTMOUSE, KE_RIGHTDRAG, KE_RIGHTRELEASE, KE_IGNORE, KE_TAB, KE_S_TAB_OLD, KE_SNIFF, KE_XF1, KE_XF2,
  KE_XF3, KE_XF4, KE_XEND, KE_ZEND, KE_XHOME, KE_ZHOME, KE_XUP, KE_XDOWN, KE_XLEFT, KE_XRIGHT, KE_LEFTMOUSE_NM,
  KE_LEFTRELEASE_NM, KE_S_XF1, KE_S_XF2, KE_S_XF3, KE_S_XF4, KE_MOUSEDOWN, KE_MOUSEUP, KE_MOUSELEFT, KE_MOUSERIGHT, KE_KINS,
  KE_KDEL, KE_CSI, KE_SNR, KE_PLUG, KE_CMDWIN, KE_C_LEFT, KE_C_RIGHT, KE_C_HOME, KE_C_END, KE_X1MOUSE, KE_X1DRAG, KE_X1RELEASE,
  KE_X2MOUSE, KE_X2DRAG, KE_X2RELEASE, KE_DROP, KE_CURSORHOLD, KE_NOP, KE_FOCUSGAINED, KE_FOCUSLOST};
enum SpecialKey {KS_NAME = 0, KS_CE, KS_AL, KS_CAL, KS_DL, KS_CDL, KS_CS, KS_CL, KS_CD, KS_UT, KS_DA, KS_DB, KS_VI, KS_VE, KS_VS
  , KS_ME, KS_MR, KS_MD, KS_SE, KS_SO, KS_CZH, KS_CZR, KS_UE, KS_US, KS_UCE, KS_UCS, KS_MS, KS_CM, KS_SR, KS_CRI, KS_VB, KS_KS,
  KS_KE, KS_TI, KS_TE, KS_BC, KS_CCS, KS_CCO, KS_CSF, KS_CSB, KS_XS, KS_MB, KS_CAF, KS_CAB, KS_LE, KS_ND, KS_CIS, KS_CIE, KS_TS
  , KS_FS, KS_CWP, KS_CWS, KS_CRV, KS_CSI, KS_CEI, KS_CSV, KS_OP};
extern char_u * (term_strings []);
void __assert_rtn (const char *, const char *, int, const char *) __attribute__ ((__noreturn__));
void __eprintf (const char *, const char *, unsigned, const char *) __attribute__ ((__noreturn__));
extern intmax_t imaxabs (intmax_t j);
typedef struct {
    intmax_t quot;
    intmax_t rem;
} imaxdiv_t;
extern imaxdiv_t imaxdiv (intmax_t numer, intmax_t denom);
extern intmax_t strtoimax (const char * nptr, char * * endptr, int base);
extern uintmax_t strtoumax (const char * nptr, char * * endptr, int base);
extern intmax_t wcstoimax (const wchar_t * nptr, wchar_t * * endptr, int base);
extern uintmax_t wcstoumax (const wchar_t * nptr, wchar_t * * endptr, int base);
typedef __darwin_wctrans_t wctrans_t;
typedef __darwin_wctype_t wctype_t;

static __inline int iswalnum (wint_t _wc) {
    return (__istype (_wc, 0x00000100L | 0x00000400L));
}

static __inline int iswalpha (wint_t _wc) {
    return (__istype (_wc, 0x00000100L));
}

static __inline int iswcntrl (wint_t _wc) {
    return (__istype (_wc, 0x00000200L));
}

static __inline int iswctype (wint_t _wc, wctype_t _charclass) {
    return (__istype (_wc, _charclass));
}

static __inline int iswdigit (wint_t _wc) {
    return (__isctype (_wc, 0x00000400L));
}

static __inline int iswgraph (wint_t _wc) {
    return (__istype (_wc, 0x00000800L));
}

static __inline int iswlower (wint_t _wc) {
    return (__istype (_wc, 0x00001000L));
}

static __inline int iswprint (wint_t _wc) {
    return (__istype (_wc, 0x00040000L));
}

static __inline int iswpunct (wint_t _wc) {
    return (__istype (_wc, 0x00002000L));
}

static __inline int iswspace (wint_t _wc) {
    return (__istype (_wc, 0x00004000L));
}

static __inline int iswupper (wint_t _wc) {
    return (__istype (_wc, 0x00008000L));
}

static __inline int iswxdigit (wint_t _wc) {
    return (__isctype (_wc, 0x00010000L));
}

static __inline wint_t towlower (wint_t _wc) {
    return (__tolower (_wc));
}

static __inline wint_t towupper (wint_t _wc) {
    return (__toupper (_wc));
}

wctype_t wctype (const char *);

static __inline int iswblank (wint_t _wc) {
    return (__istype (_wc, 0x00020000L));
}

static __inline int iswascii (wint_t _wc) {
    return ((_wc & ~0x7F) == 0);
}

static __inline int iswhexnumber (wint_t _wc) {
    return (__istype (_wc, 0x00010000L));
}

static __inline int iswideogram (wint_t _wc) {
    return (__istype (_wc, 0x00080000L));
}

static __inline int iswnumber (wint_t _wc) {
    return (__istype (_wc, 0x00000400L));
}

static __inline int iswphonogram (wint_t _wc) {
    return (__istype (_wc, 0x00200000L));
}

static __inline int iswrune (wint_t _wc) {
    return (__istype (_wc, 0xFFFFFFF0L));
}

static __inline int iswspecial (wint_t _wc) {
    return (__istype (_wc, 0x00100000L));
}

wint_t nextwctype (wint_t, wctype_t);
wint_t towctrans (wint_t, wctrans_t);
wctrans_t wctrans (const char *);
enum auto_event {EVENT_BUFADD = 0, EVENT_BUFNEW, EVENT_BUFDELETE, EVENT_BUFWIPEOUT, EVENT_BUFENTER, EVENT_BUFFILEPOST,
  EVENT_BUFFILEPRE, EVENT_BUFLEAVE, EVENT_BUFNEWFILE, EVENT_BUFREADPOST, EVENT_BUFREADPRE, EVENT_BUFREADCMD, EVENT_BUFUNLOAD,
  EVENT_BUFHIDDEN, EVENT_BUFWINENTER, EVENT_BUFWINLEAVE, EVENT_BUFWRITEPOST, EVENT_BUFWRITEPRE, EVENT_BUFWRITECMD,
  EVENT_CMDWINENTER, EVENT_CMDWINLEAVE, EVENT_COLORSCHEME, EVENT_FILEAPPENDPOST, EVENT_FILEAPPENDPRE, EVENT_FILEAPPENDCMD,
  EVENT_FILECHANGEDSHELL, EVENT_FILECHANGEDSHELLPOST, EVENT_FILECHANGEDRO, EVENT_FILEREADPOST, EVENT_FILEREADPRE,
  EVENT_FILEREADCMD, EVENT_FILETYPE, EVENT_FILEWRITEPOST, EVENT_FILEWRITEPRE, EVENT_FILEWRITECMD, EVENT_FILTERREADPOST,
  EVENT_FILTERREADPRE, EVENT_FILTERWRITEPOST, EVENT_FILTERWRITEPRE, EVENT_FOCUSGAINED, EVENT_FOCUSLOST, EVENT_GUIENTER,
  EVENT_GUIFAILED, EVENT_INSERTCHANGE, EVENT_INSERTENTER, EVENT_INSERTLEAVE, EVENT_MENUPOPUP, EVENT_QUICKFIXCMDPOST,
  EVENT_QUICKFIXCMDPRE, EVENT_SESSIONLOADPOST, EVENT_STDINREADPOST, EVENT_STDINREADPRE, EVENT_SYNTAX, EVENT_TERMCHANGED,
  EVENT_TERMRESPONSE, EVENT_USER, EVENT_VIMENTER, EVENT_VIMLEAVE, EVENT_VIMLEAVEPRE, EVENT_VIMRESIZED, EVENT_WINENTER,
  EVENT_WINLEAVE, EVENT_ENCODINGCHANGED, EVENT_CURSORHOLD, EVENT_CURSORHOLDI, EVENT_FUNCUNDEFINED, EVENT_REMOTEREPLY,
  EVENT_SWAPEXISTS, EVENT_SOURCEPRE, EVENT_SOURCECMD, EVENT_SPELLFILEMISSING, EVENT_CURSORMOVED, EVENT_CURSORMOVEDI,
  EVENT_TABLEAVE, EVENT_TABENTER, EVENT_SHELLCMDPOST, EVENT_SHELLFILTERPOST, NUM_EVENTS};
typedef enum auto_event event_T;
typedef enum {HLF_8 = 0, HLF_AT, HLF_D, HLF_E, HLF_H, HLF_I, HLF_L, HLF_M, HLF_CM, HLF_N, HLF_R, HLF_S, HLF_SNC, HLF_C, HLF_T,
  HLF_V, HLF_VNC, HLF_W, HLF_WM, HLF_FL, HLF_FC, HLF_ADD, HLF_CHD, HLF_DED, HLF_TXD, HLF_CONCEAL, HLF_SC, HLF_SPB, HLF_SPC,
  HLF_SPR, HLF_SPL, HLF_PNI, HLF_PSI, HLF_PSB, HLF_PST, HLF_TP, HLF_TPS, HLF_TPF, HLF_CUC, HLF_CUL, HLF_MC, HLF_COUNT} hlf_T;
typedef uint32_t UINT32_T;
typedef long linenr_T;
typedef int colnr_T;
typedef unsigned short disptick_T;
typedef void * vim_acl_T;
typedef struct timeval proftime_T;
extern int p_acd;
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
extern char_u * p_cb;
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
extern int p_fs;
extern int p_gd;
extern char_u * p_pdev;
extern char_u * p_penc;
extern char_u * p_pexpr;
extern char_u * p_pfn;
extern char_u * p_popt;
extern char_u * p_header;
extern int p_prompt;
extern char_u * p_guicursor;
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
extern long p_rdt;
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
extern char_u * p_ttym;
extern unsigned ttym_flags;
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
enum {BV_AI = 0, BV_AR, BV_BH, BV_BT, BV_EFM, BV_GP, BV_MP, BV_BIN, BV_BL, BV_CI, BV_CIN, BV_CINK, BV_CINO, BV_CINW, BV_CM,
  BV_CMS, BV_COM, BV_CPT, BV_DICT, BV_TSR, BV_CFU, BV_DEF, BV_INC, BV_EOL, BV_EP, BV_ET, BV_FENC, BV_BEXPR, BV_FEX, BV_FF,
  BV_FLP, BV_FO, BV_FT, BV_IMI, BV_IMS, BV_INDE, BV_INDK, BV_INEX, BV_INF, BV_ISK, BV_KEY, BV_KP, BV_LISP, BV_MA, BV_ML, BV_MOD
  , BV_MPS, BV_NF, BV_OFU, BV_PATH, BV_PI, BV_QE, BV_RO, BV_SI, BV_SN, BV_SMC, BV_SYN, BV_SPC, BV_SPF, BV_SPL, BV_STS, BV_SUA,
  BV_SW, BV_SWF, BV_TAGS, BV_TS, BV_TW, BV_TX, BV_UDF, BV_WM, BV_COUNT};
enum {WV_LIST = 0, WV_CRBIND, WV_DIFF, WV_FDC, WV_FEN, WV_FDI, WV_FDL, WV_FDM, WV_FML, WV_FDN, WV_FDE, WV_FDT, WV_FMR, WV_LBR,
  WV_NU, WV_RNU, WV_NUW, WV_PVW, WV_SCBIND, WV_SCROLL, WV_SPELL, WV_CUC, WV_CUL, WV_CC, WV_STL, WV_WFH, WV_WFW, WV_WRAP,
  WV_COUNT};
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
    long_u m_size;
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
typedef struct signlist signlist_T;
struct signlist {
    int id;
    linenr_T lnum;
    int typenr;
    signlist_T * next;
    signlist_T * prev;
};
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
    char_u * save_inputbuf;
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
typedef int varnumber_T;
typedef double float_T;
typedef struct listvar_S list_T;
typedef struct dictvar_S dict_T;
typedef struct {
    char v_type;
    char v_lock;
    union {
        varnumber_T v_number;
        float_T v_float;
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
    int b_dev_valid;
    dev_t b_dev;
    ino_t b_ino;
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
    signlist_T * b_signlist;
    int b_netbeans_file;
    int b_was_netbeans_file;
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
    proftime_T tm;
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
typedef struct cursor_entry {
    int shape;
    int mshape;
    int percentage;
    long blinkwait;
    long blinkon;
    long blinkoff;
    int id;
    int id_lm;
    char * name;
    char used_for;
} cursorentry_T;
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
typedef struct VimClipboard {
    int available;
    int owned;
    pos_T start;
    pos_T end;
    int vmode;
    short_u origin_row;
    short_u origin_start_col;
    short_u origin_end_col;
    short_u word_start_col;
    short_u word_end_col;
    pos_T prev;
    short_u state;
    short_u mode;
} VimClipboard;
typedef struct exarg exarg_T;
enum CMD_index {CMD_append, CMD_abbreviate, CMD_abclear, CMD_aboveleft, CMD_all, CMD_amenu, CMD_anoremenu, CMD_args, CMD_argadd
  , CMD_argdelete, CMD_argdo, CMD_argedit, CMD_argglobal, CMD_arglocal, CMD_argument, CMD_ascii, CMD_autocmd, CMD_augroup,
  CMD_aunmenu, CMD_buffer, CMD_bNext, CMD_ball, CMD_badd, CMD_bdelete, CMD_behave, CMD_belowright, CMD_bfirst, CMD_blast,
  CMD_bmodified, CMD_bnext, CMD_botright, CMD_bprevious, CMD_brewind, CMD_break, CMD_breakadd, CMD_breakdel, CMD_breaklist,
  CMD_browse, CMD_buffers, CMD_bufdo, CMD_bunload, CMD_bwipeout, CMD_change, CMD_cNext, CMD_cNfile, CMD_cabbrev, CMD_cabclear,
  CMD_caddbuffer, CMD_caddexpr, CMD_caddfile, CMD_call, CMD_catch, CMD_cbuffer, CMD_cc, CMD_cclose, CMD_cd, CMD_center,
  CMD_cexpr, CMD_cfile, CMD_cfirst, CMD_cgetfile, CMD_cgetbuffer, CMD_cgetexpr, CMD_chdir, CMD_changes, CMD_checkpath,
  CMD_checktime, CMD_clist, CMD_clast, CMD_close, CMD_cmap, CMD_cmapclear, CMD_cmenu, CMD_cnext, CMD_cnewer, CMD_cnfile,
  CMD_cnoremap, CMD_cnoreabbrev, CMD_cnoremenu, CMD_copy, CMD_colder, CMD_colorscheme, CMD_command, CMD_comclear, CMD_compiler,
  CMD_continue, CMD_confirm, CMD_copen, CMD_cprevious, CMD_cpfile, CMD_cquit, CMD_crewind, CMD_cscope, CMD_cstag, CMD_cunmap,
  CMD_cunabbrev, CMD_cunmenu, CMD_cwindow, CMD_delete, CMD_delmarks, CMD_debug, CMD_debuggreedy, CMD_delcommand, CMD_delfunction
  , CMD_display, CMD_diffupdate, CMD_diffget, CMD_diffoff, CMD_diffpatch, CMD_diffput, CMD_diffsplit, CMD_diffthis, CMD_digraphs
  , CMD_djump, CMD_dlist, CMD_doautocmd, CMD_doautoall, CMD_drop, CMD_dsearch, CMD_dsplit, CMD_edit, CMD_earlier, CMD_echo,
  CMD_echoerr, CMD_echohl, CMD_echomsg, CMD_echon, CMD_else, CMD_elseif, CMD_emenu, CMD_endif, CMD_endfunction, CMD_endfor,
  CMD_endtry, CMD_endwhile, CMD_enew, CMD_ex, CMD_execute, CMD_exit, CMD_exusage, CMD_file, CMD_files, CMD_filetype, CMD_find,
  CMD_finally, CMD_finish, CMD_first, CMD_fixdel, CMD_fold, CMD_foldclose, CMD_folddoopen, CMD_folddoclosed, CMD_foldopen,
  CMD_for, CMD_function, CMD_global, CMD_goto, CMD_grep, CMD_grepadd, CMD_gui, CMD_gvim, CMD_help, CMD_helpfind, CMD_helpgrep,
  CMD_helptags, CMD_hardcopy, CMD_highlight, CMD_hide, CMD_history, CMD_insert, CMD_iabbrev, CMD_iabclear, CMD_if, CMD_ijump,
  CMD_ilist, CMD_imap, CMD_imapclear, CMD_imenu, CMD_inoremap, CMD_inoreabbrev, CMD_inoremenu, CMD_intro, CMD_isearch,
  CMD_isplit, CMD_iunmap, CMD_iunabbrev, CMD_iunmenu, CMD_join, CMD_jumps, CMD_k, CMD_keepmarks, CMD_keepjumps, CMD_keepalt,
  CMD_list, CMD_lNext, CMD_lNfile, CMD_last, CMD_language, CMD_laddexpr, CMD_laddbuffer, CMD_laddfile, CMD_later, CMD_lbuffer,
  CMD_lcd, CMD_lchdir, CMD_lclose, CMD_lcscope, CMD_left, CMD_leftabove, CMD_let, CMD_lexpr, CMD_lfile, CMD_lfirst, CMD_lgetfile
  , CMD_lgetbuffer, CMD_lgetexpr, CMD_lgrep, CMD_lgrepadd, CMD_lhelpgrep, CMD_ll, CMD_llast, CMD_llist, CMD_lmap, CMD_lmapclear
  , CMD_lmake, CMD_lnoremap, CMD_lnext, CMD_lnewer, CMD_lnfile, CMD_loadview, CMD_loadkeymap, CMD_lockmarks, CMD_lockvar,
  CMD_lolder, CMD_lopen, CMD_lprevious, CMD_lpfile, CMD_lrewind, CMD_ltag, CMD_lua, CMD_luado, CMD_luafile, CMD_lunmap,
  CMD_lvimgrep, CMD_lvimgrepadd, CMD_lwindow, CMD_ls, CMD_move, CMD_mark, CMD_make, CMD_map, CMD_mapclear, CMD_marks, CMD_match
  , CMD_menu, CMD_menutranslate, CMD_messages, CMD_mkexrc, CMD_mksession, CMD_mkspell, CMD_mkvimrc, CMD_mkview, CMD_mode,
  CMD_mzscheme, CMD_mzfile, CMD_next, CMD_nbkey, CMD_nbclose, CMD_nbstart, CMD_new, CMD_nmap, CMD_nmapclear, CMD_nmenu,
  CMD_nnoremap, CMD_nnoremenu, CMD_noremap, CMD_noautocmd, CMD_nohlsearch, CMD_noreabbrev, CMD_noremenu, CMD_normal, CMD_number
  , CMD_nunmap, CMD_nunmenu, CMD_open, CMD_oldfiles, CMD_omap, CMD_omapclear, CMD_omenu, CMD_only, CMD_onoremap, CMD_onoremenu,
  CMD_options, CMD_ounmap, CMD_ounmenu, CMD_ownsyntax, CMD_print, CMD_pclose, CMD_perl, CMD_perldo, CMD_pedit, CMD_pop,
  CMD_popup, CMD_ppop, CMD_preserve, CMD_previous, CMD_promptfind, CMD_promptrepl, CMD_profile, CMD_profdel, CMD_psearch,
  CMD_ptag, CMD_ptNext, CMD_ptfirst, CMD_ptjump, CMD_ptlast, CMD_ptnext, CMD_ptprevious, CMD_ptrewind, CMD_ptselect, CMD_put,
  CMD_pwd, CMD_python, CMD_pyfile, CMD_py3, CMD_python3, CMD_py3file, CMD_quit, CMD_quitall, CMD_qall, CMD_read, CMD_recover,
  CMD_redo, CMD_redir, CMD_redraw, CMD_redrawstatus, CMD_registers, CMD_resize, CMD_retab, CMD_return, CMD_rewind, CMD_right,
  CMD_rightbelow, CMD_runtime, CMD_ruby, CMD_rubydo, CMD_rubyfile, CMD_rundo, CMD_rviminfo, CMD_substitute, CMD_sNext,
  CMD_sargument, CMD_sall, CMD_sandbox, CMD_saveas, CMD_sbuffer, CMD_sbNext, CMD_sball, CMD_sbfirst, CMD_sblast, CMD_sbmodified
  , CMD_sbnext, CMD_sbprevious, CMD_sbrewind, CMD_scriptnames, CMD_scriptencoding, CMD_scscope, CMD_set, CMD_setfiletype,
  CMD_setglobal, CMD_setlocal, CMD_sfind, CMD_sfirst, CMD_shell, CMD_simalt, CMD_sign, CMD_silent, CMD_sleep, CMD_slast,
  CMD_smagic, CMD_smap, CMD_smapclear, CMD_smenu, CMD_snext, CMD_sniff, CMD_snomagic, CMD_snoremap, CMD_snoremenu, CMD_source,
  CMD_sort, CMD_split, CMD_spellgood, CMD_spelldump, CMD_spellinfo, CMD_spellrepall, CMD_spellundo, CMD_spellwrong,
  CMD_sprevious, CMD_srewind, CMD_stop, CMD_stag, CMD_startinsert, CMD_startgreplace, CMD_startreplace, CMD_stopinsert,
  CMD_stjump, CMD_stselect, CMD_sunhide, CMD_sunmap, CMD_sunmenu, CMD_suspend, CMD_sview, CMD_swapname, CMD_syntax, CMD_syncbind
  , CMD_t, CMD_tNext, CMD_tag, CMD_tags, CMD_tab, CMD_tabclose, CMD_tabdo, CMD_tabedit, CMD_tabfind, CMD_tabfirst, CMD_tabmove,
  CMD_tablast, CMD_tabnext, CMD_tabnew, CMD_tabonly, CMD_tabprevious, CMD_tabNext, CMD_tabrewind, CMD_tabs, CMD_tcl, CMD_tcldo,
  CMD_tclfile, CMD_tearoff, CMD_tfirst, CMD_throw, CMD_tjump, CMD_tlast, CMD_tmenu, CMD_tnext, CMD_topleft, CMD_tprevious,
  CMD_trewind, CMD_try, CMD_tselect, CMD_tunmenu, CMD_undo, CMD_undojoin, CMD_undolist, CMD_unabbreviate, CMD_unhide, CMD_unlet
  , CMD_unlockvar, CMD_unmap, CMD_unmenu, CMD_unsilent, CMD_update, CMD_vglobal, CMD_version, CMD_verbose, CMD_vertical,
  CMD_visual, CMD_view, CMD_vimgrep, CMD_vimgrepadd, CMD_viusage, CMD_vmap, CMD_vmapclear, CMD_vmenu, CMD_vnoremap, CMD_vnew,
  CMD_vnoremenu, CMD_vsplit, CMD_vunmap, CMD_vunmenu, CMD_write, CMD_wNext, CMD_wall, CMD_while, CMD_winsize, CMD_wincmd,
  CMD_windo, CMD_winpos, CMD_wnext, CMD_wprevious, CMD_wq, CMD_wqall, CMD_wsverb, CMD_wundo, CMD_wviminfo, CMD_xit, CMD_xall,
  CMD_xmap, CMD_xmapclear, CMD_xmenu, CMD_xnoremap, CMD_xnoremenu, CMD_xunmap, CMD_xunmenu, CMD_yank, CMD_z, CMD_bang, CMD_pound
  , CMD_and, CMD_star, CMD_lshift, CMD_equal, CMD_rshift, CMD_at, CMD_Next, CMD_Print, CMD_X, CMD_tilde, CMD_SIZE, CMD_USER = 
  -1, CMD_USER_BUF = -2};
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
int mch_chdir (char * path);
void mch_write (char_u * s, int len);
int mch_inchar (char_u * buf, int maxlen, long wtime, int tb_change_cnt);
int mch_char_avail (void);
long_u mch_total_mem (int special);
void mch_delay (long msec, int ignoreinput);
int mch_stackcheck (char * p);
void mch_startjmp (void);
void mch_endjmp (void);
void mch_didjmp (void);
void mch_suspend (void);
void mch_init (void);
void reset_signals (void);
int vim_handle_signal (int sig);
int mch_check_win (int argc, char * * argv);
int mch_input_isatty (void);
int mch_can_restore_title (void);
int mch_can_restore_icon (void);
void mch_settitle (char_u * title, char_u * icon);
void mch_restore_title (int which);
int vim_is_xterm (char_u * name);
int use_xterm_like_mouse (char_u * name);
int use_xterm_mouse (void);
int vim_is_iris (char_u * name);
int vim_is_vt300 (char_u * name);
int vim_is_fastterm (char_u * name);
int mch_get_user_name (char_u * s, int len);
int mch_get_uname (uid_t uid, char_u * s, int len);
void mch_get_host_name (char_u * s, int len);
long mch_get_pid (void);
int mch_dirname (char_u * buf, int len);
void slash_adjust (char_u * p);
int mch_FullName (char_u * fname, char_u * buf, int len, int force);
int mch_isFullName (char_u * fname);
void fname_case (char_u * name, int len);
long mch_getperm (char_u * name);
int mch_setperm (char_u * name, long perm);
void mch_copy_sec (char_u * from_file, char_u * to_file);
vim_acl_T mch_get_acl (char_u * fname);
void mch_set_acl (char_u * fname, vim_acl_T aclent);
void mch_free_acl (vim_acl_T aclent);
void mch_hide (char_u * name);
int mch_isdir (char_u * name);
int mch_can_exe (char_u * name);
int mch_nodetype (char_u * name);
void mch_early_init (void);
void mch_free_mem (void);
void mch_exit (int r);
void mch_settmode (int tmode);
void get_stty (void);
void mch_setmouse (int on);
void check_mouse_termcode (void);
int mch_screenmode (char_u * arg);
int mch_get_shellsize (void);
void mch_set_shellsize (void);
void mch_new_shellsize (void);
int mch_call_shell (char_u * cmd, int options);
void mch_breakcheck (void);
int mch_expandpath (garray_T * gap, char_u * path, int flags);
int mch_expand_wildcards (int num_pat, char_u * * pat, int * num_file, char_u * * * file, int flags);
int mch_has_exp_wildcard (char_u * p);
int mch_has_wildcard (char_u * p);
int mch_libcall (char_u * libname, char_u * funcname, char_u * argstring, int argint, char_u * * string_result, int *
  number_result);
void setup_term_clip (void);
void start_xterm_trace (int button);
void stop_xterm_trace (void);
void clear_xterm_clip (void);
int clip_xterm_own_selection (VimClipboard * cbd);
void clip_xterm_lose_selection (VimClipboard * cbd);
void clip_xterm_request_selection (VimClipboard * cbd);
void clip_xterm_set_selection (VimClipboard * cbd);
int xsmp_handle_requests (void);
void xsmp_init (void);
void xsmp_close (void);
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
int build_stl_str_hl (win_T * wp, char_u * out, size_t outlen, char_u * fmt, int use_sandbox, int fillchar, int maxwidth, struct
  stl_hlrec * hltab, struct stl_hlrec * tabtab);
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
long do_searchpair (char_u * spat, char_u * mpat, char_u * epat, int dir, char_u * skip, int flags, pos_T * match_pos, linenr_T
  lnum_stop, long time_limit);
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
int ExpandGeneric (expand_T * xp, regmatch_T * regmatch, int * num_file, char_u * * * file, char_u * ((* func) (expand_T *, int
  )));
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
int readfile (char_u * fname, char_u * sfname, linenr_T from, linenr_T lines_to_skip, linenr_T lines_to_read, exarg_T * eap, int
  flags);
int prep_exarg (exarg_T * eap, buf_T * buf);
int prepare_crypt_read (FILE * fp);
char_u * prepare_crypt_write (buf_T * buf, int * lenp);
int check_file_readonly (char_u * fname, int perm);
int buf_write (buf_T * buf, char_u * fname, char_u * sfname, linenr_T start, linenr_T end, exarg_T * eap, int append, int
  forceit, int reset_changed, int filtering);
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
char_u * set_context_in_map_cmd (expand_T * xp, char_u * cmd, char_u * arg, int forceit, int isabbrev, int isunmap, cmdidx_T
  cmdidx);
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
int vim_vsnprintf (char * str, size_t str_m, char * fmt, va_list ap, typval_T * tvs);
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
void * vim_findfile_init (char_u * path, char_u * filename, char_u * stopdirs, int level, int free_visited, int find_what, void
  * search_ctx_arg, int tagfile, char_u * rel_fname);
char_u * vim_findfile_stopdir (char_u * buf);
void vim_findfile_cleanup (void * ctx);
char_u * vim_findfile (void * search_ctx_arg);
void vim_findfile_free_visited (void * search_ctx_arg);
char_u * find_file_in_path (char_u * ptr, int len, int options, int first, char_u * rel_fname);
char_u * find_directory_in_path (char_u * ptr, int len, int options, char_u * rel_fname);
char_u * find_file_in_path_option (char_u * ptr, int len, int options, int first, char_u * path_option, int find_what, char_u *
  rel_fname, char_u * suffixes);
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
int searchit (win_T * win, buf_T * buf, pos_T * pos, int dir, char_u * pat, long count, int options, int pat_use, linenr_T
  stop_lnum, proftime_T * tm);
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
void find_pattern_in_path (char_u * ptr, int dir, int len, int whole, int skip_comments, int type, long count, int action,
  linenr_T start_lnum, linenr_T end_lnum);
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
void netbeans_parse_messages (void);
void netbeans_read (void);
int isNetbeansBuffer (buf_T * bufp);
int isNetbeansModified (buf_T * bufp);
void netbeans_end (void);
void ex_nbclose (exarg_T * eap);
void ex_nbkey (exarg_T * eap);
void ex_nbstart (exarg_T * eap);
void netbeans_beval_cb (int * beval, int state);
int netbeans_active (void);
int netbeans_filedesc (void);
void netbeans_gui_register (void);
void netbeans_open (char * params, int doabort);
void netbeans_send_disconnect (void);
void netbeans_frame_moved (int new_x, int new_y);
void netbeans_file_activated (buf_T * bufp);
void netbeans_file_opened (buf_T * bufp);
void netbeans_file_killed (buf_T * bufp);
void netbeans_inserted (buf_T * bufp, linenr_T linenr, colnr_T col, char_u * txt, int newlen);
void netbeans_removed (buf_T * bufp, linenr_T linenr, colnr_T col, long len);
void netbeans_unmodified (buf_T * bufp);
void netbeans_button_release (int button);
int netbeans_keycommand (int key);
void netbeans_save_buffer (buf_T * bufp);
void netbeans_deleted_all_lines (buf_T * bufp);
int netbeans_is_guarded (linenr_T top, linenr_T bot);
void netbeans_draw_multisign_indicator (int row);
void netbeans_gutter_click (linenr_T lnum);
void clip_mch_lose_selection (VimClipboard * cbd);
int clip_mch_own_selection (VimClipboard * cbd);
void clip_mch_request_selection (VimClipboard * cbd);
void clip_mch_set_selection (VimClipboard * cbd);
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
extern int newline_on_exit;
extern int intr_char;
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
extern VimClipboard clip_star;
extern int clip_unnamed;
extern int clip_autoselect;
extern int clip_autoselectml;
extern int clip_html;
extern regprog_T * clip_exclude_prog;
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
extern char_u * vim_tempdir;
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
extern sigjmp_buf lc_jump_env;
extern volatile int lc_signal;
extern volatile int lc_active;
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
extern char_u * exe_name;
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
extern char_u * default_vim_dir;
extern char_u * default_vimruntime_dir;
extern char_u * all_cflags;
extern char_u * all_lflags;
extern char_u * compiled_user;
extern char_u * compiled_sys;
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
extern cursorentry_T shape_table [17];
extern option_table_T printer_opts [14];
extern linenr_T printer_page_num;
extern int typebuf_was_filled;
extern int term_is_xterm;
extern int virtual_op;
extern disptick_T display_tick;
extern linenr_T spell_redraw_lnum;
extern char * netbeansArg;
extern int netbeansFireChanges;
extern int netbeansForcedQuit;
extern int netbeansReadFile;
extern int netbeansSuppressNoLines;
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
extern char_u e_font [];
extern char_u e_internal [];
extern char_u e_interr [];
extern char_u e_invaddr [];
extern char_u e_invarg [];
extern char_u e_invarg2 [];
extern char_u e_invexpr2 [];
extern char_u e_invrange [];
extern char_u e_invcmd [];
extern char_u e_isadir2 [];
extern char_u e_libcall [];
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
extern char_u e_screenmode [];
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
extern char_u e_guarded [];
extern char_u e_nbreadonly [];
extern char_u e_intern2 [];
extern char_u e_maxmempat [];
extern char_u e_emptybuf [];
extern char_u e_invalpat [];
extern char_u e_bufloaded [];
extern char_u e_notset [];
extern short disallow_gui;
extern char top_bot_msg [];
extern char bot_top_msg [];
extern char need_key_msg [];
extern time_t starttime;
extern FILE * time_fd;
extern int ignored;
extern char * ignoredp;
typedef float float_t;
typedef double double_t;
extern unsigned int __math_errhandling (void);
extern int __fpclassifyf (float);
extern int __fpclassifyd (double);
extern int __fpclassify (long double);
static __inline__ int __inline_isfinitef (float) __attribute__ ((always_inline));
static __inline__ int __inline_isfinited (double) __attribute__ ((always_inline));
static __inline__ int __inline_isfinite (long double) __attribute__ ((always_inline));
static __inline__ int __inline_isinff (float) __attribute__ ((always_inline));
static __inline__ int __inline_isinfd (double) __attribute__ ((always_inline));
static __inline__ int __inline_isinf (long double) __attribute__ ((always_inline));
static __inline__ int __inline_isnanf (float) __attribute__ ((always_inline));
static __inline__ int __inline_isnand (double) __attribute__ ((always_inline));
static __inline__ int __inline_isnan (long double) __attribute__ ((always_inline));
static __inline__ int __inline_isnormalf (float) __attribute__ ((always_inline));
static __inline__ int __inline_isnormald (double) __attribute__ ((always_inline));
static __inline__ int __inline_isnormal (long double) __attribute__ ((always_inline));
static __inline__ int __inline_signbitf (float) __attribute__ ((always_inline));
static __inline__ int __inline_signbitd (double) __attribute__ ((always_inline));
static __inline__ int __inline_signbit (long double) __attribute__ ((always_inline));

static __inline__ int __inline_isinff (float __x) {
    return __builtin_fabsf (__x) == __builtin_inff ();
}

static __inline__ int __inline_isinfd (double __x) {
    return __builtin_fabs (__x) == __builtin_inf ();
}

static __inline__ int __inline_isinf (long double __x) {
    return __builtin_fabsl (__x) == __builtin_infl ();
}

static __inline__ int __inline_isfinitef (float __x) {
    return __x == __x && __builtin_fabsf (__x) != __builtin_inff ();
}

static __inline__ int __inline_isfinited (double __x) {
    return __x == __x && __builtin_fabs (__x) != __builtin_inf ();
}

static __inline__ int __inline_isfinite (long double __x) {
    return __x == __x && __builtin_fabsl (__x) != __builtin_infl ();
}

static __inline__ int __inline_isnanf (float __x) {
    return __x != __x;
}

static __inline__ int __inline_isnand (double __x) {
    return __x != __x;
}

static __inline__ int __inline_isnan (long double __x) {
    return __x != __x;
}

static __inline__ int __inline_signbitf (float __x) {
    union {
        float __f;
        unsigned int __u;
    } __u;
    __u.__f = __x;
    return (int) (__u.__u >> 31);
}

static __inline__ int __inline_signbitd (double __x) {
    union {
        double __f;
        unsigned int __u [2];
    } __u;
    __u.__f = __x;
    return (int) (__u.__u [1] >> 31);
}

static __inline__ int __inline_signbit (long double __x) {
    union {
        long double __ld;
        struct {
            unsigned int __m [2];
            short __sexp;
        } __p;
    } __u;
    __u.__ld = __x;
    return (int) (((unsigned short) __u.__p.__sexp) >> 15);
}

static __inline__ int __inline_isnormalf (float __x) {
    float fabsf = __builtin_fabsf (__x);
    if (__x != __x) return 0;
    return fabsf < __builtin_inff () && fabsf >= 1.17549435e-38F;
}

static __inline__ int __inline_isnormald (double __x) {
    double fabsf = __builtin_fabs (__x);
    if (__x != __x) return 0;
    return fabsf < __builtin_inf () && fabsf >= 2.2250738585072014e-308;
}

static __inline__ int __inline_isnormal (long double __x) {
    long double fabsf = __builtin_fabsl (__x);
    if (__x != __x) return 0;
    return fabsf < __builtin_infl () && fabsf >= 3.36210314311209350626e-4932L;
}

extern double acos (double);
extern float acosf (float);
extern double asin (double);
extern float asinf (float);
extern double atan (double);
extern float atanf (float);
extern double atan2 (double, double);
extern float atan2f (float, float);
extern double cos (double);
extern float cosf (float);
extern double sin (double);
extern float sinf (float);
extern double tan (double);
extern float tanf (float);
extern double acosh (double);
extern float acoshf (float);
extern double asinh (double);
extern float asinhf (float);
extern double atanh (double);
extern float atanhf (float);
extern double cosh (double);
extern float coshf (float);
extern double sinh (double);
extern float sinhf (float);
extern double tanh (double);
extern float tanhf (float);
extern double exp (double);
extern float expf (float);
extern double exp2 (double);
extern float exp2f (float);
extern double expm1 (double);
extern float expm1f (float);
extern double log (double);
extern float logf (float);
extern double log10 (double);
extern float log10f (float);
extern double log2 (double);
extern float log2f (float);
extern double log1p (double);
extern float log1pf (float);
extern double logb (double);
extern float logbf (float);
extern double modf (double, double *);
extern float modff (float, float *);
extern double ldexp (double, int);
extern float ldexpf (float, int);
extern double frexp (double, int *);
extern float frexpf (float, int *);
extern int ilogb (double);
extern int ilogbf (float);
extern double scalbn (double, int);
extern float scalbnf (float, int);
extern double scalbln (double, long int);
extern float scalblnf (float, long int);
extern double fabs (double);
extern float fabsf (float);
extern double cbrt (double);
extern float cbrtf (float);
extern double hypot (double, double);
extern float hypotf (float, float);
extern double pow (double, double);
extern float powf (float, float);
extern double sqrt (double);
extern float sqrtf (float);
extern double erf (double);
extern float erff (float);
extern double erfc (double);
extern float erfcf (float);
extern double lgamma (double);
extern float lgammaf (float);
extern double tgamma (double);
extern float tgammaf (float);
extern double ceil (double);
extern float ceilf (float);
extern double floor (double);
extern float floorf (float);
extern double nearbyint (double);
extern float nearbyintf (float);
extern double rint (double);
extern float rintf (float);
extern long int lrint (double);
extern long int lrintf (float);
extern double round (double);
extern float roundf (float);
extern long int lround (double);
extern long int lroundf (float);
extern long long int llrint (double);
extern long long int llrintf (float);
extern long long int llround (double);
extern long long int llroundf (float);
extern double trunc (double);
extern float truncf (float);
extern double fmod (double, double);
extern float fmodf (float, float);
extern double remainder (double, double);
extern float remainderf (float, float);
extern double remquo (double, double, int *);
extern float remquof (float, float, int *);
extern double copysign (double, double);
extern float copysignf (float, float);
extern double nan (const char *);
extern float nanf (const char *);
extern double nextafter (double, double);
extern float nextafterf (float, float);
extern double fdim (double, double);
extern float fdimf (float, float);
extern double fmax (double, double);
extern float fmaxf (float, float);
extern double fmin (double, double);
extern float fminf (float, float);
extern double fma (double, double, double);
extern float fmaf (float, float, float);
extern long double acosl (long double);
extern long double asinl (long double);
extern long double atanl (long double);
extern long double atan2l (long double, long double);
extern long double cosl (long double);
extern long double sinl (long double);
extern long double tanl (long double);
extern long double acoshl (long double);
extern long double asinhl (long double);
extern long double atanhl (long double);
extern long double coshl (long double);
extern long double sinhl (long double);
extern long double tanhl (long double);
extern long double expl (long double);
extern long double exp2l (long double);
extern long double expm1l (long double);
extern long double logl (long double);
extern long double log10l (long double);
extern long double log2l (long double);
extern long double log1pl (long double);
extern long double logbl (long double);
extern long double modfl (long double, long double *);
extern long double ldexpl (long double, int);
extern long double frexpl (long double, int *);
extern int ilogbl (long double);
extern long double scalbnl (long double, int);
extern long double scalblnl (long double, long int);
extern long double fabsl (long double);
extern long double cbrtl (long double);
extern long double hypotl (long double, long double);
extern long double powl (long double, long double);
extern long double sqrtl (long double);
extern long double erfl (long double);
extern long double erfcl (long double);
extern long double lgammal (long double);
extern long double tgammal (long double);
extern long double ceill (long double);
extern long double floorl (long double);
extern long double nearbyintl (long double);
extern long double rintl (long double);
extern long int lrintl (long double);
extern long double roundl (long double);
extern long int lroundl (long double);
extern long long int llrintl (long double);
extern long long int llroundl (long double);
extern long double truncl (long double);
extern long double fmodl (long double, long double);
extern long double remainderl (long double, long double);
extern long double remquol (long double, long double, int *);
extern long double copysignl (long double, long double);
extern long double nanl (const char *);
extern long double nextafterl (long double, long double);
extern double nexttoward (double, long double);
extern float nexttowardf (float, long double);
extern long double nexttowardl (long double, long double);
extern long double fdiml (long double, long double);
extern long double fmaxl (long double, long double);
extern long double fminl (long double, long double);
extern long double fmal (long double, long double, long double);
extern double __inf (void);
extern float __inff (void);
extern long double __infl (void);
extern float __nan (void);
extern double j0 (double);
extern double j1 (double);
extern double jn (int, double);
extern double y0 (double);
extern double y1 (double);
extern double yn (int, double);
extern double scalb (double, double);
extern int signgam;
extern long int rinttol (double);
extern long int roundtol (double);
struct exception {
    int type;
    char * name;
    double arg1;
    double arg2;
    double retval;
};
extern int finite (double);
extern double gamma (double);
extern int matherr (struct exception *);
extern double significand (double);
extern double drem (double, double);
static dictitem_T dumdi;
typedef struct lval_S {
    char_u * ll_name;
    char_u * ll_exp_name;
    typval_T * ll_tv;
    listitem_T * ll_li;
    list_T * ll_list;
    int ll_range;
    long ll_n1;
    long ll_n2;
    int ll_empty2;
    dict_T * ll_dict;
    dictitem_T * ll_di;
    char_u * ll_newkey;
} lval_T;
static char * e_letunexp = "E18: Unexpected characters in :let";
static char * e_listidx = "E684: list index out of range: %ld";
static char * e_undefvar = "E121: Undefined variable: %s";
static char * e_missbrac = "E111: Missing ']'";
static char * e_listarg = "E686: Argument of %s must be a List";
static char * e_listdictarg = "E712: Argument of %s must be a List or Dictionary";
static char * e_emptykey = "E713: Cannot use empty key for Dictionary";
static char * e_listreq = "E714: List required";
static char * e_dictreq = "E715: Dictionary required";
static char * e_toomanyarg = "E118: Too many arguments for function: %s";
static char * e_dictkey = "E716: Key not present in Dictionary: %s";
static char * e_funcexts = "E122: Function %s already exists, add ! to replace it";
static char * e_funcdict = "E717: Dictionary entry already exists";
static char * e_funcref = "E718: Funcref required";
static char * e_dictrange = "E719: Cannot use [:] with a Dictionary";
static char * e_letwrong = "E734: Wrong variable type for %s=";
static char * e_nofunc = "E130: Unknown function: %s";
static char * e_illvar = "E461: Illegal variable name: %s";
static dict_T globvardict;
static dictitem_T globvars_var;
static hashtab_T compat_hashtab;
static int no_autoload = 0;
static int current_copyID = 0;
typedef struct {
    dictitem_T sv_var;
    dict_T sv_dict;
} scriptvar_T;
static garray_T ga_scripts =
{0, 0, sizeof (scriptvar_T *), 4, ((void *) 0)};
static int echo_attr = 0;
typedef struct ufunc ufunc_T;
struct ufunc {
    int uf_varargs;
    int uf_flags;
    int uf_calls;
    garray_T uf_args;
    garray_T uf_lines;
    scid_T uf_script_ID;
    int uf_refcount;
    char_u uf_name [1];
};
static hashtab_T func_hashtab;
static garray_T ga_loaded =
{0, 0, sizeof (char_u *), 4, ((void *) 0)};
static dict_T * first_dict = ((void *) 0);
static list_T * first_list = ((void *) 0);
static ufunc_T dumuf;
typedef struct funccall_S funccall_T;
struct funccall_S {
    ufunc_T * func;
    int linenr;
    int returned;
    struct {
        dictitem_T var;
        char_u room [20];
    } fixvar [12];
    dict_T l_vars;
    dictitem_T l_vars_var;
    dict_T l_avars;
    dictitem_T l_avars_var;
    list_T l_varlist;
    listitem_T l_listitems [20];
    typval_T * rettv;
    linenr_T breakpoint;
    int dbg_tick;
    int level;
    funccall_T * caller;
};
typedef struct {
    int fi_semicolon;
    int fi_varcount;
    listwatch_T fi_lw;
    list_T * fi_list;
} forinfo_T;
typedef struct {
    dict_T * fd_dict;
    char_u * fd_newkey;
    dictitem_T * fd_di;
} funcdict_T;
static struct vimvar {
    char * vv_name;
    dictitem_T vv_di;
    char vv_filler [16];
    char vv_flags;
} vimvars [55] =
{
    {"count",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 1 + 2},
    {"count1",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"prevcount",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"errmsg",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 1},
    {"warningmsg",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 0},
    {"statusmsg",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 0},
    {"shell_error",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 1 + 2},
    {"this_session",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 1},
    {"version",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 1 + 2},
    {"lnum",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 4},
    {"termresponse",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"fname",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"lang",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"lc_time",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"ctype",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"charconvert_from",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"charconvert_to",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"fname_in",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"fname_out",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"fname_new",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"fname_diff",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"cmdarg",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"foldstart",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 4},
    {"foldend",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 4},
    {"folddashes",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 4},
    {"foldlevel",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 4},
    {"progname",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"servername",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"dying",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"exception",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"throwpoint",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"register",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"cmdbang",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"insertmode",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"val",
        {
            {0, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"key",
        {
            {0, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"profiling",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"fcs_reason",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"fcs_choice",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 0},
    {"beval_bufnr",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"beval_winnr",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"beval_lnum",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"beval_col",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"beval_text",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"scrollstart",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 0},
    {"swapname",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"swapchoice",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 0},
    {"swapcommand",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"char",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"mouse_win",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 0},
    {"mouse_lnum",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 0},
    {"mouse_col",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 0},
    {"operator",
        {
            {2, 0,
                {0}}, 0,
            {0}},
        {0}, 2},
    {"searchforward",
        {
            {1, 0,
                {0}}, 0,
            {0}},
        {0}, 0},
    {"oldfiles",
        {
            {4, 0,
                {0}}, 0,
            {0}},
        {0}, 0},};
static dict_T vimvardict;
static dictitem_T vimvars_var;
static void prepare_vimvar (int idx, typval_T * save_tv);
static void restore_vimvar (int idx, typval_T * save_tv);
static int call_vim_function (char_u * func, int argc, char_u * * argv, int safe, typval_T * rettv);
static int ex_let_vars (char_u * arg, typval_T * tv, int copy, int semicolon, int var_count, char_u * nextchars);
static char_u * skip_var_list (char_u * arg, int * var_count, int * semicolon);
static char_u * skip_var_one (char_u * arg);
static void list_hashtable_vars (hashtab_T * ht, char_u * prefix, int empty, int * first);
static void list_glob_vars (int * first);
static void list_buf_vars (int * first);
static void list_win_vars (int * first);
static void list_tab_vars (int * first);
static void list_vim_vars (int * first);
static void list_script_vars (int * first);
static void list_func_vars (int * first);
static char_u * list_arg_vars (exarg_T * eap, char_u * arg, int * first);
static char_u * ex_let_one (char_u * arg, typval_T * tv, int copy, char_u * endchars, char_u * op);
static int check_changedtick (char_u * arg);
static char_u * get_lval (char_u * name, typval_T * rettv, lval_T * lp, int unlet, int skip, int quiet, int fne_flags);
static void clear_lval (lval_T * lp);
static void set_var_lval (lval_T * lp, char_u * endp, typval_T * rettv, int copy, char_u * op);
static int tv_op (typval_T * tv1, typval_T * tv2, char_u * op);
static void list_add_watch (list_T * l, listwatch_T * lw);
static void list_rem_watch (list_T * l, listwatch_T * lwrem);
static void list_fix_watch (list_T * l, listitem_T * item);
static void ex_unletlock (exarg_T * eap, char_u * argstart, int deep);
static int do_unlet_var (lval_T * lp, char_u * name_end, int forceit);
static int do_lock_var (lval_T * lp, char_u * name_end, int deep, int lock);
static void item_lock (typval_T * tv, int deep, int lock);
static int tv_islocked (typval_T * tv);
static int eval0 (char_u * arg, typval_T * rettv, char_u * * nextcmd, int evaluate);
static int eval1 (char_u * * arg, typval_T * rettv, int evaluate);
static int eval2 (char_u * * arg, typval_T * rettv, int evaluate);
static int eval3 (char_u * * arg, typval_T * rettv, int evaluate);
static int eval4 (char_u * * arg, typval_T * rettv, int evaluate);
static int eval5 (char_u * * arg, typval_T * rettv, int evaluate);
static int eval6 (char_u * * arg, typval_T * rettv, int evaluate, int want_string);
static int eval7 (char_u * * arg, typval_T * rettv, int evaluate, int want_string);
static int eval_index (char_u * * arg, typval_T * rettv, int evaluate, int verbose);
static int get_option_tv (char_u * * arg, typval_T * rettv, int evaluate);
static int get_string_tv (char_u * * arg, typval_T * rettv, int evaluate);
static int get_lit_string_tv (char_u * * arg, typval_T * rettv, int evaluate);
static int get_list_tv (char_u * * arg, typval_T * rettv, int evaluate);
static int rettv_list_alloc (typval_T * rettv);
static listitem_T * listitem_alloc (void);
static void listitem_free (listitem_T * item);
static void listitem_remove (list_T * l, listitem_T * item);
static long list_len (list_T * l);
static int list_equal (list_T * l1, list_T * l2, int ic);
static int dict_equal (dict_T * d1, dict_T * d2, int ic);
static int tv_equal (typval_T * tv1, typval_T * tv2, int ic);
static listitem_T * list_find (list_T * l, long n);
static long list_find_nr (list_T * l, long idx, int * errorp);
static long list_idx_of_item (list_T * l, listitem_T * item);
static void list_append (list_T * l, listitem_T * item);
static int list_append_number (list_T * l, varnumber_T n);
static int list_insert_tv (list_T * l, typval_T * tv, listitem_T * item);
static int list_extend (list_T * l1, list_T * l2, listitem_T * bef);
static int list_concat (list_T * l1, list_T * l2, typval_T * tv);
static list_T * list_copy (list_T * orig, int deep, int copyID);
static void list_remove (list_T * l, listitem_T * item, listitem_T * item2);
static char_u * list2string (typval_T * tv, int copyID);
static int list_join (garray_T * gap, list_T * l, char_u * sep, int echo, int copyID);
static int free_unref_items (int copyID);
static void set_ref_in_ht (hashtab_T * ht, int copyID);
static void set_ref_in_list (list_T * l, int copyID);
static void set_ref_in_item (typval_T * tv, int copyID);
static int rettv_dict_alloc (typval_T * rettv);
static void dict_unref (dict_T * d);
static void dict_free (dict_T * d, int recurse);
static dictitem_T * dictitem_copy (dictitem_T * org);
static void dictitem_remove (dict_T * dict, dictitem_T * item);
static dict_T * dict_copy (dict_T * orig, int deep, int copyID);
static long dict_len (dict_T * d);
static char_u * dict2string (typval_T * tv, int copyID);
static int get_dict_tv (char_u * * arg, typval_T * rettv, int evaluate);
static char_u * echo_string (typval_T * tv, char_u * * tofree, char_u * numbuf, int copyID);
static char_u * tv2string (typval_T * tv, char_u * * tofree, char_u * numbuf, int copyID);
static char_u * string_quote (char_u * str, int function);
static int string2float (char_u * text, float_T * value);
static int get_env_tv (char_u * * arg, typval_T * rettv, int evaluate);
static int find_internal_func (char_u * name);
static char_u * deref_func_name (char_u * name, int * lenp);
static int get_func_tv (char_u * name, int len, typval_T * rettv, char_u * * arg, linenr_T firstline, linenr_T lastline, int *
  doesrange, int evaluate, dict_T * selfdict);
static int call_func (char_u * funcname, int len, typval_T * rettv, int argcount, typval_T * argvars, linenr_T firstline,
  linenr_T lastline, int * doesrange, int evaluate, dict_T * selfdict);
static void emsg_funcname (char * ermsg, char_u * name);
static int non_zero_arg (typval_T * argvars);
static void f_abs (typval_T * argvars, typval_T * rettv);
static void f_acos (typval_T * argvars, typval_T * rettv);
static void f_add (typval_T * argvars, typval_T * rettv);
static void f_append (typval_T * argvars, typval_T * rettv);
static void f_argc (typval_T * argvars, typval_T * rettv);
static void f_argidx (typval_T * argvars, typval_T * rettv);
static void f_argv (typval_T * argvars, typval_T * rettv);
static void f_asin (typval_T * argvars, typval_T * rettv);
static void f_atan (typval_T * argvars, typval_T * rettv);
static void f_atan2 (typval_T * argvars, typval_T * rettv);
static void f_browse (typval_T * argvars, typval_T * rettv);
static void f_browsedir (typval_T * argvars, typval_T * rettv);
static void f_bufexists (typval_T * argvars, typval_T * rettv);
static void f_buflisted (typval_T * argvars, typval_T * rettv);
static void f_bufloaded (typval_T * argvars, typval_T * rettv);
static void f_bufname (typval_T * argvars, typval_T * rettv);
static void f_bufnr (typval_T * argvars, typval_T * rettv);
static void f_bufwinnr (typval_T * argvars, typval_T * rettv);
static void f_byte2line (typval_T * argvars, typval_T * rettv);
static void f_byteidx (typval_T * argvars, typval_T * rettv);
static void f_call (typval_T * argvars, typval_T * rettv);
static void f_ceil (typval_T * argvars, typval_T * rettv);
static void f_changenr (typval_T * argvars, typval_T * rettv);
static void f_char2nr (typval_T * argvars, typval_T * rettv);
static void f_cindent (typval_T * argvars, typval_T * rettv);
static void f_clearmatches (typval_T * argvars, typval_T * rettv);
static void f_col (typval_T * argvars, typval_T * rettv);
static void f_complete (typval_T * argvars, typval_T * rettv);
static void f_complete_add (typval_T * argvars, typval_T * rettv);
static void f_complete_check (typval_T * argvars, typval_T * rettv);
static void f_confirm (typval_T * argvars, typval_T * rettv);
static void f_copy (typval_T * argvars, typval_T * rettv);
static void f_cos (typval_T * argvars, typval_T * rettv);
static void f_cosh (typval_T * argvars, typval_T * rettv);
static void f_count (typval_T * argvars, typval_T * rettv);
static void f_cscope_connection (typval_T * argvars, typval_T * rettv);
static void f_cursor (typval_T * argsvars, typval_T * rettv);
static void f_deepcopy (typval_T * argvars, typval_T * rettv);
static void f_delete (typval_T * argvars, typval_T * rettv);
static void f_did_filetype (typval_T * argvars, typval_T * rettv);
static void f_diff_filler (typval_T * argvars, typval_T * rettv);
static void f_diff_hlID (typval_T * argvars, typval_T * rettv);
static void f_empty (typval_T * argvars, typval_T * rettv);
static void f_escape (typval_T * argvars, typval_T * rettv);
static void f_eval (typval_T * argvars, typval_T * rettv);
static void f_eventhandler (typval_T * argvars, typval_T * rettv);
static void f_executable (typval_T * argvars, typval_T * rettv);
static void f_exists (typval_T * argvars, typval_T * rettv);
static void f_exp (typval_T * argvars, typval_T * rettv);
static void f_expand (typval_T * argvars, typval_T * rettv);
static void f_extend (typval_T * argvars, typval_T * rettv);
static void f_feedkeys (typval_T * argvars, typval_T * rettv);
static void f_filereadable (typval_T * argvars, typval_T * rettv);
static void f_filewritable (typval_T * argvars, typval_T * rettv);
static void f_filter (typval_T * argvars, typval_T * rettv);
static void f_finddir (typval_T * argvars, typval_T * rettv);
static void f_findfile (typval_T * argvars, typval_T * rettv);
static void f_float2nr (typval_T * argvars, typval_T * rettv);
static void f_floor (typval_T * argvars, typval_T * rettv);
static void f_fmod (typval_T * argvars, typval_T * rettv);
static void f_fnameescape (typval_T * argvars, typval_T * rettv);
static void f_fnamemodify (typval_T * argvars, typval_T * rettv);
static void f_foldclosed (typval_T * argvars, typval_T * rettv);
static void f_foldclosedend (typval_T * argvars, typval_T * rettv);
static void f_foldlevel (typval_T * argvars, typval_T * rettv);
static void f_foldtext (typval_T * argvars, typval_T * rettv);
static void f_foldtextresult (typval_T * argvars, typval_T * rettv);
static void f_foreground (typval_T * argvars, typval_T * rettv);
static void f_function (typval_T * argvars, typval_T * rettv);
static void f_garbagecollect (typval_T * argvars, typval_T * rettv);
static void f_get (typval_T * argvars, typval_T * rettv);
static void f_getbufline (typval_T * argvars, typval_T * rettv);
static void f_getbufvar (typval_T * argvars, typval_T * rettv);
static void f_getchar (typval_T * argvars, typval_T * rettv);
static void f_getcharmod (typval_T * argvars, typval_T * rettv);
static void f_getcmdline (typval_T * argvars, typval_T * rettv);
static void f_getcmdpos (typval_T * argvars, typval_T * rettv);
static void f_getcmdtype (typval_T * argvars, typval_T * rettv);
static void f_getcwd (typval_T * argvars, typval_T * rettv);
static void f_getfontname (typval_T * argvars, typval_T * rettv);
static void f_getfperm (typval_T * argvars, typval_T * rettv);
static void f_getfsize (typval_T * argvars, typval_T * rettv);
static void f_getftime (typval_T * argvars, typval_T * rettv);
static void f_getftype (typval_T * argvars, typval_T * rettv);
static void f_getline (typval_T * argvars, typval_T * rettv);
static void f_getmatches (typval_T * argvars, typval_T * rettv);
static void f_getpid (typval_T * argvars, typval_T * rettv);
static void f_getpos (typval_T * argvars, typval_T * rettv);
static void f_getqflist (typval_T * argvars, typval_T * rettv);
static void f_getreg (typval_T * argvars, typval_T * rettv);
static void f_getregtype (typval_T * argvars, typval_T * rettv);
static void f_gettabvar (typval_T * argvars, typval_T * rettv);
static void f_gettabwinvar (typval_T * argvars, typval_T * rettv);
static void f_getwinposx (typval_T * argvars, typval_T * rettv);
static void f_getwinposy (typval_T * argvars, typval_T * rettv);
static void f_getwinvar (typval_T * argvars, typval_T * rettv);
static void f_glob (typval_T * argvars, typval_T * rettv);
static void f_globpath (typval_T * argvars, typval_T * rettv);
static void f_has (typval_T * argvars, typval_T * rettv);
static void f_has_key (typval_T * argvars, typval_T * rettv);
static void f_haslocaldir (typval_T * argvars, typval_T * rettv);
static void f_hasmapto (typval_T * argvars, typval_T * rettv);
static void f_histadd (typval_T * argvars, typval_T * rettv);
static void f_histdel (typval_T * argvars, typval_T * rettv);
static void f_histget (typval_T * argvars, typval_T * rettv);
static void f_histnr (typval_T * argvars, typval_T * rettv);
static void f_hlID (typval_T * argvars, typval_T * rettv);
static void f_hlexists (typval_T * argvars, typval_T * rettv);
static void f_hostname (typval_T * argvars, typval_T * rettv);
static void f_iconv (typval_T * argvars, typval_T * rettv);
static void f_indent (typval_T * argvars, typval_T * rettv);
static void f_index (typval_T * argvars, typval_T * rettv);
static void f_input (typval_T * argvars, typval_T * rettv);
static void f_inputdialog (typval_T * argvars, typval_T * rettv);
static void f_inputlist (typval_T * argvars, typval_T * rettv);
static void f_inputrestore (typval_T * argvars, typval_T * rettv);
static void f_inputsave (typval_T * argvars, typval_T * rettv);
static void f_inputsecret (typval_T * argvars, typval_T * rettv);
static void f_insert (typval_T * argvars, typval_T * rettv);
static void f_isdirectory (typval_T * argvars, typval_T * rettv);
static void f_islocked (typval_T * argvars, typval_T * rettv);
static void f_items (typval_T * argvars, typval_T * rettv);
static void f_join (typval_T * argvars, typval_T * rettv);
static void f_keys (typval_T * argvars, typval_T * rettv);
static void f_last_buffer_nr (typval_T * argvars, typval_T * rettv);
static void f_len (typval_T * argvars, typval_T * rettv);
static void f_libcall (typval_T * argvars, typval_T * rettv);
static void f_libcallnr (typval_T * argvars, typval_T * rettv);
static void f_line (typval_T * argvars, typval_T * rettv);
static void f_line2byte (typval_T * argvars, typval_T * rettv);
static void f_lispindent (typval_T * argvars, typval_T * rettv);
static void f_localtime (typval_T * argvars, typval_T * rettv);
static void f_log (typval_T * argvars, typval_T * rettv);
static void f_log10 (typval_T * argvars, typval_T * rettv);
static void f_map (typval_T * argvars, typval_T * rettv);
static void f_maparg (typval_T * argvars, typval_T * rettv);
static void f_mapcheck (typval_T * argvars, typval_T * rettv);
static void f_match (typval_T * argvars, typval_T * rettv);
static void f_matchadd (typval_T * argvars, typval_T * rettv);
static void f_matcharg (typval_T * argvars, typval_T * rettv);
static void f_matchdelete (typval_T * argvars, typval_T * rettv);
static void f_matchend (typval_T * argvars, typval_T * rettv);
static void f_matchlist (typval_T * argvars, typval_T * rettv);
static void f_matchstr (typval_T * argvars, typval_T * rettv);
static void f_max (typval_T * argvars, typval_T * rettv);
static void f_min (typval_T * argvars, typval_T * rettv);
static void f_mkdir (typval_T * argvars, typval_T * rettv);
static void f_mode (typval_T * argvars, typval_T * rettv);
static void f_nextnonblank (typval_T * argvars, typval_T * rettv);
static void f_nr2char (typval_T * argvars, typval_T * rettv);
static void f_pathshorten (typval_T * argvars, typval_T * rettv);
static void f_pow (typval_T * argvars, typval_T * rettv);
static void f_prevnonblank (typval_T * argvars, typval_T * rettv);
static void f_printf (typval_T * argvars, typval_T * rettv);
static void f_pumvisible (typval_T * argvars, typval_T * rettv);
static void f_range (typval_T * argvars, typval_T * rettv);
static void f_readfile (typval_T * argvars, typval_T * rettv);
static void f_reltime (typval_T * argvars, typval_T * rettv);
static void f_reltimestr (typval_T * argvars, typval_T * rettv);
static void f_remote_expr (typval_T * argvars, typval_T * rettv);
static void f_remote_foreground (typval_T * argvars, typval_T * rettv);
static void f_remote_peek (typval_T * argvars, typval_T * rettv);
static void f_remote_read (typval_T * argvars, typval_T * rettv);
static void f_remote_send (typval_T * argvars, typval_T * rettv);
static void f_remove (typval_T * argvars, typval_T * rettv);
static void f_rename (typval_T * argvars, typval_T * rettv);
static void f_repeat (typval_T * argvars, typval_T * rettv);
static void f_resolve (typval_T * argvars, typval_T * rettv);
static void f_reverse (typval_T * argvars, typval_T * rettv);
static void f_round (typval_T * argvars, typval_T * rettv);
static void f_search (typval_T * argvars, typval_T * rettv);
static void f_searchdecl (typval_T * argvars, typval_T * rettv);
static void f_searchpair (typval_T * argvars, typval_T * rettv);
static void f_searchpairpos (typval_T * argvars, typval_T * rettv);
static void f_searchpos (typval_T * argvars, typval_T * rettv);
static void f_server2client (typval_T * argvars, typval_T * rettv);
static void f_serverlist (typval_T * argvars, typval_T * rettv);
static void f_setbufvar (typval_T * argvars, typval_T * rettv);
static void f_setcmdpos (typval_T * argvars, typval_T * rettv);
static void f_setline (typval_T * argvars, typval_T * rettv);
static void f_setloclist (typval_T * argvars, typval_T * rettv);
static void f_setmatches (typval_T * argvars, typval_T * rettv);
static void f_setpos (typval_T * argvars, typval_T * rettv);
static void f_setqflist (typval_T * argvars, typval_T * rettv);
static void f_setreg (typval_T * argvars, typval_T * rettv);
static void f_settabvar (typval_T * argvars, typval_T * rettv);
static void f_settabwinvar (typval_T * argvars, typval_T * rettv);
static void f_setwinvar (typval_T * argvars, typval_T * rettv);
static void f_shellescape (typval_T * argvars, typval_T * rettv);
static void f_simplify (typval_T * argvars, typval_T * rettv);
static void f_sin (typval_T * argvars, typval_T * rettv);
static void f_sinh (typval_T * argvars, typval_T * rettv);
static void f_sort (typval_T * argvars, typval_T * rettv);
static void f_soundfold (typval_T * argvars, typval_T * rettv);
static void f_spellbadword (typval_T * argvars, typval_T * rettv);
static void f_spellsuggest (typval_T * argvars, typval_T * rettv);
static void f_split (typval_T * argvars, typval_T * rettv);
static void f_sqrt (typval_T * argvars, typval_T * rettv);
static void f_str2float (typval_T * argvars, typval_T * rettv);
static void f_str2nr (typval_T * argvars, typval_T * rettv);
static void f_strchars (typval_T * argvars, typval_T * rettv);
static void f_strftime (typval_T * argvars, typval_T * rettv);
static void f_stridx (typval_T * argvars, typval_T * rettv);
static void f_string (typval_T * argvars, typval_T * rettv);
static void f_strlen (typval_T * argvars, typval_T * rettv);
static void f_strpart (typval_T * argvars, typval_T * rettv);
static void f_strridx (typval_T * argvars, typval_T * rettv);
static void f_strtrans (typval_T * argvars, typval_T * rettv);
static void f_strdisplaywidth (typval_T * argvars, typval_T * rettv);
static void f_strwidth (typval_T * argvars, typval_T * rettv);
static void f_submatch (typval_T * argvars, typval_T * rettv);
static void f_substitute (typval_T * argvars, typval_T * rettv);
static void f_synID (typval_T * argvars, typval_T * rettv);
static void f_synIDattr (typval_T * argvars, typval_T * rettv);
static void f_synIDtrans (typval_T * argvars, typval_T * rettv);
static void f_synstack (typval_T * argvars, typval_T * rettv);
static void f_synconcealed (typval_T * argvars, typval_T * rettv);
static void f_system (typval_T * argvars, typval_T * rettv);
static void f_tabpagebuflist (typval_T * argvars, typval_T * rettv);
static void f_tabpagenr (typval_T * argvars, typval_T * rettv);
static void f_tabpagewinnr (typval_T * argvars, typval_T * rettv);
static void f_taglist (typval_T * argvars, typval_T * rettv);
static void f_tagfiles (typval_T * argvars, typval_T * rettv);
static void f_tempname (typval_T * argvars, typval_T * rettv);
static void f_test (typval_T * argvars, typval_T * rettv);
static void f_tan (typval_T * argvars, typval_T * rettv);
static void f_tanh (typval_T * argvars, typval_T * rettv);
static void f_tolower (typval_T * argvars, typval_T * rettv);
static void f_toupper (typval_T * argvars, typval_T * rettv);
static void f_tr (typval_T * argvars, typval_T * rettv);
static void f_trunc (typval_T * argvars, typval_T * rettv);
static void f_type (typval_T * argvars, typval_T * rettv);
static void f_undofile (typval_T * argvars, typval_T * rettv);
static void f_undotree (typval_T * argvars, typval_T * rettv);
static void f_values (typval_T * argvars, typval_T * rettv);
static void f_virtcol (typval_T * argvars, typval_T * rettv);
static void f_visualmode (typval_T * argvars, typval_T * rettv);
static void f_winbufnr (typval_T * argvars, typval_T * rettv);
static void f_wincol (typval_T * argvars, typval_T * rettv);
static void f_winheight (typval_T * argvars, typval_T * rettv);
static void f_winline (typval_T * argvars, typval_T * rettv);
static void f_winnr (typval_T * argvars, typval_T * rettv);
static void f_winrestcmd (typval_T * argvars, typval_T * rettv);
static void f_winrestview (typval_T * argvars, typval_T * rettv);
static void f_winsaveview (typval_T * argvars, typval_T * rettv);
static void f_winwidth (typval_T * argvars, typval_T * rettv);
static void f_writefile (typval_T * argvars, typval_T * rettv);
static int list2fpos (typval_T * arg, pos_T * posp, int * fnump);
static pos_T * var2fpos (typval_T * varp, int dollar_lnum, int * fnum);
static int get_env_len (char_u * * arg);
static int get_id_len (char_u * * arg);
static int get_name_len (char_u * * arg, char_u * * alias, int evaluate, int verbose);
static char_u * find_name_end (char_u * arg, char_u * * expr_start, char_u * * expr_end, int flags);
static char_u * make_expanded_name (char_u * in_start, char_u * expr_start, char_u * expr_end, char_u * in_end);
static int eval_isnamec (int c);
static int eval_isnamec1 (int c);
static int get_var_tv (char_u * name, int len, typval_T * rettv, int verbose);
static int handle_subscript (char_u * * arg, typval_T * rettv, int evaluate, int verbose);
static typval_T * alloc_tv (void);
static typval_T * alloc_string_tv (char_u * string);
static void init_tv (typval_T * varp);
static long get_tv_number (typval_T * varp);
static linenr_T get_tv_lnum (typval_T * argvars);
static linenr_T get_tv_lnum_buf (typval_T * argvars, buf_T * buf);
static char_u * get_tv_string (typval_T * varp);
static char_u * get_tv_string_buf (typval_T * varp, char_u * buf);
static char_u * get_tv_string_buf_chk (typval_T * varp, char_u * buf);
static dictitem_T * find_var (char_u * name, hashtab_T * * htp);
static dictitem_T * find_var_in_ht (hashtab_T * ht, char_u * varname, int writing);
static hashtab_T * find_var_ht (char_u * name, char_u * * varname);
static void vars_clear_ext (hashtab_T * ht, int free_val);
static void delete_var (hashtab_T * ht, hashitem_T * hi);
static void list_one_var (dictitem_T * v, char_u * prefix, int * first);
static void list_one_var_a (char_u * prefix, char_u * name, int type, char_u * string, int * first);
static void set_var (char_u * name, typval_T * varp, int copy);
static int var_check_ro (int flags, char_u * name);
static int var_check_fixed (int flags, char_u * name);
static int tv_check_lock (int lock, char_u * name);
static int item_copy (typval_T * from, typval_T * to, int deep, int copyID);
static char_u * find_option_end (char_u * * arg, int * opt_flags);
static char_u * trans_function_name (char_u * * pp, int skip, int flags, funcdict_T * fd);
static int eval_fname_script (char_u * p);
static int eval_fname_sid (char_u * p);
static void list_func_head (ufunc_T * fp, int indent);
static ufunc_T * find_func (char_u * name);
static int function_exists (char_u * name);
static int builtin_function (char_u * name);
static int script_autoload (char_u * name, int reload);
static char_u * autoload_name (char_u * name);
static void cat_func_name (char_u * buf, ufunc_T * fp);
static void func_free (ufunc_T * fp);
static void func_unref (char_u * name);
static void func_ref (char_u * name);
static void call_user_func (ufunc_T * fp, int argcount, typval_T * argvars, typval_T * rettv, linenr_T firstline, linenr_T
  lastline, dict_T * selfdict);
static int can_free_funccal (funccall_T * fc, int copyID);
static void free_funccal (funccall_T * fc, int free_val);
static void add_nr_var (dict_T * dp, dictitem_T * v, char * name, varnumber_T nr);
static win_T * find_win_by_nr (typval_T * vp, tabpage_T * tp);
static void getwinvar (typval_T * argvars, typval_T * rettv, int off);
static int searchpair_cmn (typval_T * argvars, pos_T * match_pos);
static int search_cmn (typval_T * argvars, pos_T * match_pos, int * flagsp);
static void setwinvar (typval_T * argvars, typval_T * rettv, int off);

void eval_init () {
    int i;
    struct vimvar * p;
    init_var_dict (&globvardict, &globvars_var);
    init_var_dict (&vimvardict, &vimvars_var);
    hash_init (&compat_hashtab);
    hash_init (&func_hashtab);
    for (i = 0; i < 55; ++i) {
        p = &vimvars[i];
        ((__builtin_object_size ((char *) (p -> vv_di.di_key), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (p ->
          vv_di.di_key), (char *) (p -> vv_name), __builtin_object_size ((char *) (p -> vv_di.di_key), 1 > 1)) :
          __inline_strcpy_chk ((char *) (p -> vv_di.di_key), (char *) (p -> vv_name)));
        if (p -> vv_flags & 2) p -> vv_di.di_flags = 1 | 4;
        else if (p -> vv_flags & 4) p -> vv_di.di_flags = 2 | 4;
        else p -> vv_di.di_flags = 4;
        if (p -> vv_di.di_tv.v_type != 0) hash_add (&vimvardict.dv_hashtab, p -> vv_di.di_key);
        if (p -> vv_flags & 1) hash_add (&compat_hashtab, p -> vv_di.di_key);
    }
    set_vim_var_nr (53, 1L);
}

char_u * func_name (cookie)
    void * cookie;
{
    return ((funccall_T *) cookie) -> func -> uf_name;
}

linenr_T * func_breakpoint (cookie)
    void * cookie;
{
    return &((funccall_T*)cookie)->breakpoint;
}

int * func_dbg_tick (cookie)
    void * cookie;
{
    return &((funccall_T*)cookie)->dbg_tick;
}

int func_level (cookie)
    void * cookie;
{
    return ((funccall_T *) cookie) -> level;
}

funccall_T * current_funccal = ((void *) 0);
funccall_T * previous_funccal = ((void *) 0);

int current_func_returned () {
    return current_funccal -> returned;
}

void set_internal_string_var (name, value)
    char_u * name;
    char_u * value;
{
    char_u * val;
    typval_T * tvp;
    val = vim_strsave (value);
    if (val != ((void *) 0)) {
        tvp = alloc_string_tv (val);
        if (tvp != ((void *) 0)) {
            set_var (name, tvp, 0);
            free_tv (tvp);
        }
    }
}

static lval_T * redir_lval = ((void *) 0);
static garray_T redir_ga;
static char_u * redir_endp = ((void *) 0);
static char_u * redir_varname = ((void *) 0);

int var_redir_start (name, append)
    char_u * name;
    int append;
{
    int save_emsg;
    int err;
    typval_T tv;
    if (!eval_isnamec1(*name)) {
        emsg ((char_u *) (((char *) (e_invarg))));
        return 0;
    }
    redir_varname = vim_strsave (name);
    if (redir_varname == ((void *) 0)) return 0;
    redir_lval = (lval_T *) alloc_clear ((unsigned) sizeof (lval_T));
    if (redir_lval == ((void *) 0)) {
        var_redir_stop ();
        return 0;
    }
    ga_init2 (&redir_ga, (int) sizeof (char), 500);
    redir_endp = get_lval (redir_varname, ((void *) 0), redir_lval, 0, 0, 0, 2);
    if (redir_endp == ((void *) 0) || redir_lval -> ll_name == ((void *) 0) || *redir_endp != '\000') {
        clear_lval (redir_lval);
        if (redir_endp != ((void *) 0) && *redir_endp != '\000') emsg ((char_u *) (((char *) (e_trailing))));
        else emsg ((char_u *) (((char *) (e_invarg))));
        redir_endp = ((void *) 0);
        var_redir_stop ();
        return 0;
    }
    save_emsg = did_emsg;
    did_emsg = 0;
    tv.v_type = 2;
    tv.vval.v_string = (char_u *) "";
    if (append) set_var_lval (redir_lval, redir_endp, &tv, 1, (char_u *) ".");
    else set_var_lval (redir_lval, redir_endp, &tv, 1, (char_u *) "=");
    clear_lval (redir_lval);
    err = did_emsg;
    did_emsg |= save_emsg;
    if (err) {
        redir_endp = ((void *) 0);
        var_redir_stop ();
        return 0;
    }
    return 1;
}

void var_redir_str (value, value_len)
    char_u * value;
    int value_len;
{
    int len;
    if (redir_lval == ((void *) 0)) return;
    if (value_len == -1) len = (int) strlen ((char *) (value));
    else len = value_len;
    if (ga_grow (&redir_ga, len) == 1) {
        ((__builtin_object_size ((char *) ((char *) redir_ga.ga_data + redir_ga.ga_len), 0) != (size_t) - 1) ?
          __builtin___memmove_chk ((char *) ((char *) redir_ga.ga_data + redir_ga.ga_len), (char *) (value), len,
          __builtin_object_size ((char *) ((char *) redir_ga.ga_data + redir_ga.ga_len), 0)) : __inline_memmove_chk ((char *) (
          (char *) redir_ga.ga_data + redir_ga.ga_len), (char *) (value), len));
        redir_ga.ga_len += len;
    }
    else var_redir_stop ();
}

void var_redir_stop () {
    typval_T tv;
    if (redir_lval != ((void *) 0)) {
        if (redir_endp != ((void *) 0)) {
            ga_append (&redir_ga, '\000');
            tv.v_type = 2;
            tv.vval.v_string = redir_ga.ga_data;
            redir_endp = get_lval (redir_varname, ((void *) 0), redir_lval, 0, 0, 0, 2);
            if (redir_endp != ((void *) 0) && redir_lval -> ll_name != ((void *) 0)) set_var_lval (redir_lval, redir_endp, &tv,
              0, (char_u *) ".");
            clear_lval (redir_lval);
        }
        vim_free (redir_ga.ga_data);
        redir_ga.ga_data = ((void *) 0);
        vim_free (redir_lval);
        redir_lval = ((void *) 0);
    }
    vim_free (redir_varname);
    redir_varname = ((void *) 0);
}

int eval_printexpr (fname, args)
    char_u * fname;
    char_u * args;
{
    int err = 0;
    set_vim_var_string (17, fname, -1);
    set_vim_var_string (21, args, -1);
    if (eval_to_bool (p_pexpr, &err, ((void *) 0), 0)) err = 1;
    set_vim_var_string (17, ((void *) 0), -1);
    set_vim_var_string (21, ((void *) 0), -1);
    if (err) {
        unlink ((char *) (fname));
        return 0;
    }
    return 1;
}

void eval_diff (origfile, newfile, outfile)
    char_u * origfile;
    char_u * newfile;
    char_u * outfile;
{
    int err = 0;
    set_vim_var_string (17, origfile, -1);
    set_vim_var_string (19, newfile, -1);
    set_vim_var_string (18, outfile, -1);
    (void) eval_to_bool (p_dex, &err, ((void *) 0), 0);
    set_vim_var_string (17, ((void *) 0), -1);
    set_vim_var_string (19, ((void *) 0), -1);
    set_vim_var_string (18, ((void *) 0), -1);
}

void eval_patch (origfile, difffile, outfile)
    char_u * origfile;
    char_u * difffile;
    char_u * outfile;
{
    int err;
    set_vim_var_string (17, origfile, -1);
    set_vim_var_string (20, difffile, -1);
    set_vim_var_string (18, outfile, -1);
    (void) eval_to_bool (p_pex, &err, ((void *) 0), 0);
    set_vim_var_string (17, ((void *) 0), -1);
    set_vim_var_string (20, ((void *) 0), -1);
    set_vim_var_string (18, ((void *) 0), -1);
}

int eval_to_bool (arg, error, nextcmd, skip)
    char_u * arg;
    int * error;
    char_u * * nextcmd;
    int skip;
{
    typval_T tv;
    int retval = 0;
    if (skip) ++emsg_skip;
    if (eval0 (arg, &tv, nextcmd, !skip) == 0) *error = 1;
    else {
        * error = 0;
        if (!skip) {
            retval = (get_tv_number_chk (&tv, error) != 0);
            clear_tv (&tv);
        }
    }
    if (skip) --emsg_skip;
    return retval;
}

char_u * eval_to_string_skip (arg, nextcmd, skip)
    char_u * arg;
    char_u * * nextcmd;
    int skip;
{
    typval_T tv;
    char_u * retval;
    if (skip) ++emsg_skip;
    if (eval0 (arg, &tv, nextcmd, !skip) == 0 || skip) retval = ((void *) 0);
    else {
        retval = vim_strsave (get_tv_string (&tv));
        clear_tv (&tv);
    }
    if (skip) --emsg_skip;
    return retval;
}

int skip_expr (pp)
    char_u * * pp;
{
    typval_T rettv;
    * pp = skipwhite (*pp);
    return eval1 (pp, &rettv, 0);
}

char_u * eval_to_string (arg, nextcmd, convert)
    char_u * arg;
    char_u * * nextcmd;
    int convert;
{
    typval_T tv;
    char_u * retval;
    garray_T ga;
    char_u numbuf [30];
    if (eval0 (arg, &tv, nextcmd, 1) == 0) retval = ((void *) 0);
    else {
        if (convert && tv.v_type == 4) {
            ga_init2 (&ga, (int) sizeof (char), 80);
            if (tv.vval.v_list != ((void *) 0)) list_join (&ga, tv.vval.v_list, (char_u *) "\n", 1, 0);
            ga_append (&ga, '\000');
            retval = (char_u *) ga.ga_data;
        }
        else if (convert && tv.v_type == 6) {
            vim_snprintf ((char *) numbuf, 30, "%g", tv.vval.v_float);
            retval = vim_strsave (numbuf);
        }
        else retval = vim_strsave (get_tv_string (&tv));
        clear_tv (&tv);
    }
    return retval;
}

char_u * eval_to_string_safe (arg, nextcmd, use_sandbox)
    char_u * arg;
    char_u * * nextcmd;
    int use_sandbox;
{
    char_u * retval;
    void * save_funccalp;
    save_funccalp = save_funccal ();
    if (use_sandbox) ++sandbox;
    ++textlock;
    retval = eval_to_string (arg, nextcmd, 0);
    if (use_sandbox) --sandbox;
    --textlock;
    restore_funccal (save_funccalp);
    return retval;
}

int eval_to_number (expr)
    char_u * expr;
{
    typval_T rettv;
    int retval;
    char_u * p = skipwhite (expr);
    ++emsg_off;
    if (eval1 (&p, &rettv, 1) == 0) retval = -1;
    else {
        retval = get_tv_number_chk (&rettv, ((void *) 0));
        clear_tv (&rettv);
    }
    --emsg_off;
    return retval;
}

static void prepare_vimvar (idx, save_tv)
    int idx;
    typval_T * save_tv;
{
    * save_tv = vimvars [idx].vv_di.di_tv;
    if (vimvars [idx].vv_di.di_tv.v_type == 0) hash_add (&vimvardict.dv_hashtab, vimvars [idx].vv_di.di_key);
}

static void restore_vimvar (idx, save_tv)
    int idx;
    typval_T * save_tv;
{
    hashitem_T * hi;
    vimvars [idx].vv_di.di_tv = *save_tv;
    if (vimvars [idx].vv_di.di_tv.v_type == 0) {
        hi = hash_find (&vimvardict.dv_hashtab, vimvars [idx].vv_di.di_key);
        if (((hi) -> hi_key == ((void *) 0) || (hi) -> hi_key == &hash_removed)) emsg2 ((char_u *) (((char *) (e_intern2))), (
          char_u *) ("restore_vimvar()"));
        else hash_remove (&vimvardict.dv_hashtab, hi);
    }
}

list_T * eval_spell_expr (badword, expr)
    char_u * badword;
    char_u * expr;
{
    typval_T save_val;
    typval_T rettv;
    list_T * list = ((void *) 0);
    char_u * p = skipwhite (expr);
    prepare_vimvar (34, &save_val);
    vimvars [34].vv_di.di_tv.v_type = 2;
    vimvars [34].vv_di.di_tv.vval.v_string = badword;
    if (p_verbose == 0) ++emsg_off;
    if (eval1 (&p, &rettv, 1) == 1) {
        if (rettv.v_type != 4) clear_tv (&rettv);
        else list = rettv.vval.v_list;
    }
    if (p_verbose == 0) --emsg_off;
    restore_vimvar (34, &save_val);
    return list;
}

int get_spellword (list, pp)
    list_T * list;
    char_u * * pp;
{
    listitem_T * li;
    li = list -> lv_first;
    if (li == ((void *) 0)) return -1;
    * pp = get_tv_string (&li->li_tv);
    li = li -> li_next;
    if (li == ((void *) 0)) return -1;
    return get_tv_number (&li->li_tv);
}

typval_T * eval_expr (arg, nextcmd)
    char_u * arg;
    char_u * * nextcmd;
{
    typval_T * tv;
    tv = (typval_T *) alloc (sizeof (typval_T));
    if (tv != ((void *) 0) && eval0 (arg, tv, nextcmd, 1) == 0) {
        vim_free (tv);
        tv = ((void *) 0);
    }
    return tv;
}

static int call_vim_function (func, argc, argv, safe, rettv)
    char_u * func;
    int argc;
    char_u * * argv;
    int safe;
    typval_T * rettv;
{
    typval_T * argvars;
    long n;
    int len;
    int i;
    int doesrange;
    void * save_funccalp = ((void *) 0);
    int ret;
    argvars = (typval_T *) alloc ((unsigned) ((argc + 1) * sizeof (typval_T)));
    if (argvars == ((void *) 0)) return 0;
    for (i = 0; i < argc; i ++) {
        if (argv [i] == ((void *) 0) || *argv[i] == '\000') {
            argvars [i].v_type = 2;
            argvars [i].vval.v_string = (char_u *) "";
            continue;
        }
        vim_str2nr (argv [i], ((void *) 0), &len, 1, 1, &n, ((void *) 0));
        if (len != 0 && len == (int) strlen ((char *) (argv [i]))) {
            argvars [i].v_type = 1;
            argvars [i].vval.v_number = n;
        }
        else {
            argvars [i].v_type = 2;
            argvars [i].vval.v_string = argv [i];
        }
    }
    if (safe) {
        save_funccalp = save_funccal ();
        ++sandbox;
    }
    rettv -> v_type = 0;
    ret = call_func (func, (int) strlen ((char *) (func)), rettv, argc, argvars, curwin -> w_cursor.lnum, curwin -> w_cursor.
      lnum, &doesrange, 1, ((void *) 0));
    if (safe) {
        --sandbox;
        restore_funccal (save_funccalp);
    }
    vim_free (argvars);
    if (ret == 0) clear_tv (rettv);
    return ret;
}

void * call_func_retstr (func, argc, argv, safe)
    char_u * func;
    int argc;
    char_u * * argv;
    int safe;
{
    typval_T rettv;
    char_u * retval;
    if (call_vim_function (func, argc, argv, safe, &rettv) == 0) return ((void *) 0);
    retval = vim_strsave (get_tv_string (&rettv));
    clear_tv (&rettv);
    return retval;
}

long call_func_retnr (func, argc, argv, safe)
    char_u * func;
    int argc;
    char_u * * argv;
    int safe;
{
    typval_T rettv;
    long retval;
    if (call_vim_function (func, argc, argv, safe, &rettv) == 0) return -1;
    retval = get_tv_number_chk (&rettv, ((void *) 0));
    clear_tv (&rettv);
    return retval;
}

void * call_func_retlist (func, argc, argv, safe)
    char_u * func;
    int argc;
    char_u * * argv;
    int safe;
{
    typval_T rettv;
    if (call_vim_function (func, argc, argv, safe, &rettv) == 0) return ((void *) 0);
    if (rettv.v_type != 4) {
        clear_tv (&rettv);
        return ((void *) 0);
    }
    return rettv.vval.v_list;
}

void * save_funccal () {
    funccall_T * fc = current_funccal;
    current_funccal = ((void *) 0);
    return (void *) fc;
}

void restore_funccal (vfc)
    void * vfc;
{
    funccall_T * fc = (funccall_T *) vfc;
    current_funccal = fc;
}

int eval_foldexpr (arg, cp)
    char_u * arg;
    int * cp;
{
    typval_T tv;
    int retval;
    char_u * s;
    int use_sandbox = was_set_insecurely ((char_u *) "foldexpr", 4);
    ++emsg_off;
    if (use_sandbox) ++sandbox;
    ++textlock;
    * cp = '\000';
    if (eval0 (arg, &tv, ((void *) 0), 1) == 0) retval = 0;
    else {
        if (tv.v_type == 1) retval = tv.vval.v_number;
        else if (tv.v_type != 2 || tv.vval.v_string == ((void *) 0)) retval = 0;
        else {
            s = tv.vval.v_string;
            if (!((*s) >= '0' && (*s) <= '9') && *s != '-') *cp = *s++;
            retval = atol ((char *) s);
        }
        clear_tv (&tv);
    }
    --emsg_off;
    if (use_sandbox) --sandbox;
    --textlock;
    return retval;
}

void ex_let (eap)
    exarg_T * eap;
{
    char_u * arg = eap -> arg;
    char_u * expr = ((void *) 0);
    typval_T rettv;
    int i;
    int var_count = 0;
    int semicolon = 0;
    char_u op [2];
    char_u * argend;
    int first = 1;
    argend = skip_var_list (arg, &var_count, &semicolon);
    if (argend == ((void *) 0)) return;
    if (argend > arg && argend [-1] == '.') --argend;
    expr = vim_strchr (argend, '=');
    if (expr == ((void *) 0)) {
        if (*arg == '[') emsg ((char_u *) (((char *) (e_invarg))));
        else if (!ends_excmd(*arg)) arg = list_arg_vars (eap, arg, &first);
        else if (!eap->skip) {
            list_glob_vars (&first);
            list_buf_vars (&first);
            list_win_vars (&first);
            list_tab_vars (&first);
            list_script_vars (&first);
            list_func_vars (&first);
            list_vim_vars (&first);
        }
        eap -> nextcmd = check_nextcmd (arg);
    }
    else {
        op [0] = '=';
        op [1] = '\000';
        if (expr > argend) {
            if (vim_strchr ((char_u *) "+-.", expr [-1]) != ((void *) 0)) op [0] = expr [-1];
        }
        expr = skipwhite (expr + 1);
        if (eap -> skip) ++emsg_skip;
        i = eval0 (expr, &rettv, &eap->nextcmd, !eap->skip);
        if (eap -> skip) {
            if (i != 0) clear_tv (&rettv);
            --emsg_skip;
        }
        else if (i != 0) {
            (void) ex_let_vars (eap -> arg, &rettv, 0, semicolon, var_count, op);
            clear_tv (&rettv);
        }
    }
}

static int ex_let_vars (arg_start, tv, copy, semicolon, var_count, nextchars)
    char_u * arg_start;
    typval_T * tv;
    int copy;
    int semicolon;
    int var_count;
    char_u * nextchars;
{
    char_u * arg = arg_start;
    list_T * l;
    int i;
    listitem_T * item;
    typval_T ltv;
    if (*arg != '[') {
        if (ex_let_one (arg, tv, copy, nextchars, nextchars) == ((void *) 0)) return 0;
        return 1;
    }
    if (tv -> v_type != 4 || (l = tv -> vval.v_list) == ((void *) 0)) {
        emsg ((char_u *) (((char *) (e_listreq))));
        return 0;
    }
    i = list_len (l);
    if (semicolon == 0 && var_count < i) {
        emsg ((char_u *) (((char *) ("E687: Less targets than List items"))));
        return 0;
    }
    if (var_count - semicolon > i) {
        emsg ((char_u *) (((char *) ("E688: More targets than List items"))));
        return 0;
    }
    item = l -> lv_first;
    while (*arg != ']') {
        arg = skipwhite (arg + 1);
        arg = ex_let_one (arg, &item->li_tv, 1, (char_u *) ",;]", nextchars);
        item = item -> li_next;
        if (arg == ((void *) 0)) return 0;
        arg = skipwhite (arg);
        if (*arg == ';') {
            l = list_alloc ();
            if (l == ((void *) 0)) return 0;
            while (item != ((void *) 0)) {
                list_append_tv (l, &item->li_tv);
                item = item -> li_next;
            }
            ltv.v_type = 4;
            ltv.v_lock = 0;
            ltv.vval.v_list = l;
            l -> lv_refcount = 1;
            arg = ex_let_one (skipwhite (arg + 1), &ltv, 0, (char_u *) "]", nextchars);
            clear_tv (&ltv);
            if (arg == ((void *) 0)) return 0;
            break;
        }
        else if (*arg != ',' && *arg != ']') {
            emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("ex_let_vars()"));
            return 0;
        }
    }
    return 1;
}

static char_u * skip_var_list (arg, var_count, semicolon)
    char_u * arg;
    int * var_count;
    int * semicolon;
{
    char_u * p, * s;
    if (*arg == '[') {
        p = arg;
        for (;;) {
            p = skipwhite (p + 1);
            s = skip_var_one (p);
            if (s == p) {
                emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (p));
                return ((void *) 0);
            }
            ++*var_count;
            p = skipwhite (s);
            if (*p == ']') break;
            else if (*p == ';') {
                if (*semicolon == 1) {
                    emsg ((char_u *) (((char *) ("Double ; in list of variables"))));
                    return ((void *) 0);
                }
                * semicolon = 1;
            }
            else if (*p != ',') {
                emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (p));
                return ((void *) 0);
            }
        }
        return p + 1;
    }
    else return skip_var_one (arg);
}

static char_u * skip_var_one (arg)
    char_u * arg;
{
    if (*arg == '@' && arg [1] != '\000') return arg + 2;
    return find_name_end (*arg == '$' || *arg == '&' ? arg + 1 : arg, ((void *) 0), ((void *) 0), 1 | 2);
}

static void list_hashtable_vars (ht, prefix, empty, first)
    hashtab_T * ht;
    char_u * prefix;
    int empty;
    int * first;
{
    hashitem_T * hi;
    dictitem_T * di;
    int todo;
    todo = (int) ht -> ht_used;
    for (hi = ht -> ht_array; todo > 0 && !got_int; ++hi) {
        if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
            --todo;
            di = ((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi)));
            if (empty || di -> di_tv.v_type != 2 || di -> di_tv.vval.v_string != ((void *) 0)) list_one_var (di, prefix, first)
              ;
        }
    }
}

static void list_glob_vars (first)
    int * first;
{
    list_hashtable_vars (&globvardict.dv_hashtab, (char_u *) "", 1, first);
}

static void list_buf_vars (first)
    int * first;
{
    char_u numbuf [30];
    list_hashtable_vars (&curbuf->b_vars.dv_hashtab, (char_u *) "b:", 1, first);
    __builtin___sprintf_chk ((char *) numbuf, 0, __builtin_object_size ((char *) numbuf, 1 > 1), "%ld", (long) curbuf ->
      b_changedtick);
    list_one_var_a ((char_u *) "b:", (char_u *) "changedtick", 1, numbuf, first);
}

static void list_win_vars (first)
    int * first;
{
    list_hashtable_vars (&curwin->w_vars.dv_hashtab, (char_u *) "w:", 1, first);
}

static void list_tab_vars (first)
    int * first;
{
    list_hashtable_vars (&curtab->tp_vars.dv_hashtab, (char_u *) "t:", 1, first);
}

static void list_vim_vars (first)
    int * first;
{
    list_hashtable_vars (&vimvardict.dv_hashtab, (char_u *) "v:", 0, first);
}

static void list_script_vars (first)
    int * first;
{
    if (current_SID > 0 && current_SID <= ga_scripts.ga_len) list_hashtable_vars 
      (&((((scriptvar_T**)ga_scripts.ga_data)[(current_SID)-1])->sv_dict.dv_hashtab), (char_u *) "s:", 0, first);
}

static void list_func_vars (first)
    int * first;
{
    if (current_funccal != ((void *) 0)) list_hashtable_vars (&current_funccal->l_vars.dv_hashtab, (char_u *) "l:", 0, first);
}

static char_u * list_arg_vars (eap, arg, first)
    exarg_T * eap;
    char_u * arg;
    int * first;
{
    int error = 0;
    int len;
    char_u * name;
    char_u * name_start;
    char_u * arg_subsc;
    char_u * tofree;
    typval_T tv;
    while (!ends_excmd(*arg) && !got_int) {
        if (error || eap -> skip) {
            arg = find_name_end (arg, ((void *) 0), ((void *) 0), 1 | 2);
            if (!((*arg) == ' ' || (*arg) == '\t') && !ends_excmd(*arg)) {
                emsg_severe = 1;
                emsg ((char_u *) (((char *) (e_trailing))));
                break;
            }
        }
        else {
            name_start = name = arg;
            len = get_name_len (&arg, &tofree, 1, 1);
            if (len <= 0) {
                if (len < 0 && !aborting()) {
                    emsg_severe = 1;
                    emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (arg));
                    break;
                }
                error = 1;
            }
            else {
                if (tofree != ((void *) 0)) name = tofree;
                if (get_var_tv (name, len, &tv, 1) == 0) error = 1;
                else {
                    arg_subsc = arg;
                    if (handle_subscript (&arg, &tv, 1, 1) == 0) error = 1;
                    else {
                        if (arg == arg_subsc && len == 2 && name [1] == ':') {
                            switch (*name) {
                            case 'g' :
                                list_glob_vars (first);
                                break;
                            case 'b' :
                                list_buf_vars (first);
                                break;
                            case 'w' :
                                list_win_vars (first);
                                break;
                            case 't' :
                                list_tab_vars (first);
                                break;
                            case 'v' :
                                list_vim_vars (first);
                                break;
                            case 's' :
                                list_script_vars (first);
                                break;
                            case 'l' :
                                list_func_vars (first);
                                break;
                            default :
                                emsg2 ((char_u *) (((char *) ("E738: Can't list variables for %s"))), (char_u *) (name));
                            }
                        }
                        else {
                            char_u numbuf [30];
                            char_u * tf;
                            int c;
                            char_u * s;
                            s = echo_string (&tv, &tf, numbuf, 0);
                            c = *arg;
                            * arg = '\000';
                            list_one_var_a ((char_u *) "", arg == arg_subsc ? name : name_start, tv.v_type, s == ((void *) 0) ?
                              (char_u *) "" : s, first);
                            * arg = c;
                            vim_free (tf);
                        }
                        clear_tv (&tv);
                    }
                }
            }
            vim_free (tofree);
        }
        arg = skipwhite (arg);
    }
    return arg;
}

static char_u * ex_let_one (arg, tv, copy, endchars, op)
    char_u * arg;
    typval_T * tv;
    int copy;
    char_u * endchars;
    char_u * op;
{
    int c1;
    char_u * name;
    char_u * p;
    char_u * arg_end = ((void *) 0);
    int len;
    int opt_flags;
    char_u * tofree = ((void *) 0);
    if (*arg == '$') {
        ++arg;
        name = arg;
        len = get_env_len (&arg);
        if (len == 0) emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (name - 1));
        else {
            if (op != ((void *) 0) && (*op == '+' || *op == '-')) emsg2 ((char_u *) (((char *) (e_letwrong))), (char_u *) (op))
              ;
            else if (endchars != ((void *) 0) && vim_strchr (endchars, *skipwhite(arg)) == ((void *) 0)) emsg ((char_u *) (((
              char *) (e_letunexp))));
            else {
                c1 = name [len];
                name [len] = '\000';
                p = get_tv_string_chk (tv);
                if (p != ((void *) 0) && op != ((void *) 0) && *op == '.') {
                    int mustfree = 0;
                    char_u * s = vim_getenv (name, &mustfree);
                    if (s != ((void *) 0)) {
                        p = tofree = concat_str (s, p);
                        if (mustfree) vim_free (s);
                    }
                }
                if (p != ((void *) 0)) {
                    vim_setenv (name, p);
                    if (strcasecmp ((char *) (name), (char *) ("HOME")) == 0) init_homedir ();
                    else if (didset_vim && strcasecmp ((char *) (name), (char *) ("VIM")) == 0) didset_vim = 0;
                    else if (didset_vimruntime && strcasecmp ((char *) (name), (char *) ("VIMRUNTIME")) == 0) didset_vimruntime
                      = 0;
                    arg_end = arg;
                }
                name [len] = c1;
                vim_free (tofree);
            }
        }
    }
    else if (*arg == '&') {
        p = find_option_end (&arg, &opt_flags);
        if (p == ((void *) 0) || (endchars != ((void *) 0) && vim_strchr (endchars, *skipwhite(p)) == ((void *) 0))) emsg ((
          char_u *) (((char *) (e_letunexp))));
        else {
            long n;
            int opt_type;
            long numval;
            char_u * stringval = ((void *) 0);
            char_u * s;
            c1 = *p;
            * p = '\000';
            n = get_tv_number (tv);
            s = get_tv_string_chk (tv);
            if (s != ((void *) 0) && op != ((void *) 0) && *op != '=') {
                opt_type = get_option_value (arg, &numval, &stringval, opt_flags);
                if ((opt_type == 1 && *op == '.') || (opt_type == 0 && *op != '.')) emsg2 ((char_u *) (((char *) (e_letwrong)))
                  , (char_u *) (op));
                else {
                    if (opt_type == 1) {
                        if (*op == '+') n = numval + n;
                        else n = numval - n;
                    }
                    else if (opt_type == 0 && stringval != ((void *) 0)) {
                        s = concat_str (stringval, s);
                        vim_free (stringval);
                        stringval = s;
                    }
                }
            }
            if (s != ((void *) 0)) {
                set_option_value (arg, n, s, opt_flags);
                arg_end = p;
            }
            * p = c1;
            vim_free (stringval);
        }
    }
    else if (*arg == '@') {
        ++arg;
        if (op != ((void *) 0) && (*op == '+' || *op == '-')) emsg2 ((char_u *) (((char *) (e_letwrong))), (char_u *) (op));
        else if (endchars != ((void *) 0) && vim_strchr (endchars, *skipwhite(arg+1)) == ((void *) 0)) emsg ((char_u *) (((char
          *) (e_letunexp))));
        else {
            char_u * ptofree = ((void *) 0);
            char_u * s;
            p = get_tv_string_chk (tv);
            if (p != ((void *) 0) && op != ((void *) 0) && *op == '.') {
                s = get_reg_contents (*arg == '@' ? '"' : *arg, 1, 1);
                if (s != ((void *) 0)) {
                    p = ptofree = concat_str (s, p);
                    vim_free (s);
                }
            }
            if (p != ((void *) 0)) {
                write_reg_contents (*arg == '@' ? '"' : *arg, p, -1, 0);
                arg_end = arg + 1;
            }
            vim_free (ptofree);
        }
    }
    else if (eval_isnamec1 (*arg) || *arg == '{') {
        lval_T lv;
        p = get_lval (arg, tv, &lv, 0, 0, 0, 2);
        if (p != ((void *) 0) && lv.ll_name != ((void *) 0)) {
            if (endchars != ((void *) 0) && vim_strchr (endchars, *skipwhite(p)) == ((void *) 0)) emsg ((char_u *) (((char *) (
              e_letunexp))));
            else {
                set_var_lval (&lv, p, tv, copy, op);
                arg_end = p;
            }
        }
        clear_lval (&lv);
    }
    else emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (arg));
    return arg_end;
}

static int check_changedtick (arg)
    char_u * arg;
{
    if (strncmp ((char *) (arg), (char *) ("b:changedtick"), (size_t) (13)) == 0 && !eval_isnamec(arg[13])) {
        emsg2 ((char_u *) (((char *) (e_readonlyvar))), (char_u *) (arg));
        return 1;
    }
    return 0;
}

static char_u * get_lval (name, rettv, lp, unlet, skip, quiet, fne_flags)
    char_u * name;
    typval_T * rettv;
    lval_T * lp;
    int unlet;
    int skip;
    int quiet;
    int fne_flags;
{
    char_u * p;
    char_u * expr_start, * expr_end;
    int cc;
    dictitem_T * v;
    typval_T var1;
    typval_T var2;
    int empty1 = 0;
    listitem_T * ni;
    char_u * key = ((void *) 0);
    int len;
    hashtab_T * ht;
    ((__builtin_object_size ((lp), 0) != (size_t) - 1) ? __builtin___memset_chk ((lp), (0), (sizeof (lval_T)),
      __builtin_object_size ((lp), 0)) : __inline_memset_chk ((lp), (0), (sizeof (lval_T))));
    if (skip) {
        lp -> ll_name = name;
        return find_name_end (name, ((void *) 0), ((void *) 0), 1 | fne_flags);
    }
    p = find_name_end (name, &expr_start, &expr_end, fne_flags);
    if (expr_start != ((void *) 0)) {
        if (unlet && !((*p) == ' ' || (*p) == '\t') && !ends_excmd(*p) && *p != '[' && *p != '.') {
            emsg ((char_u *) (((char *) (e_trailing))));
            return ((void *) 0);
        }
        lp -> ll_exp_name = make_expanded_name (name, expr_start, expr_end, p);
        if (lp -> ll_exp_name == ((void *) 0)) {
            if (!aborting() && !quiet) {
                emsg_severe = 1;
                emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (name));
                return ((void *) 0);
            }
        }
        lp -> ll_name = lp -> ll_exp_name;
    }
    else lp -> ll_name = name;
    if ((*p != '[' && *p != '.') || lp -> ll_name == ((void *) 0)) return p;
    cc = *p;
    * p = '\000';
    v = find_var (lp -> ll_name, &ht);
    if (v == ((void *) 0) && !quiet) emsg2 ((char_u *) (((char *) (e_undefvar))), (char_u *) (lp -> ll_name));
    * p = cc;
    if (v == ((void *) 0)) return ((void *) 0);
    lp -> ll_tv = &v->di_tv;
    while (*p == '[' || (*p == '.' && lp -> ll_tv -> v_type == 5)) {
        if (!(lp->ll_tv->v_type==4&&lp->ll_tv->vval.v_list!=((void*)0)) && 
          !(lp->ll_tv->v_type==5&&lp->ll_tv->vval.v_dict!=((void*)0))) {
            if (!quiet) emsg ((char_u *) (((char *) ("E689: Can only index a List or Dictionary"))));
            return ((void *) 0);
        }
        if (lp -> ll_range) {
            if (!quiet) emsg ((char_u *) (((char *) ("E708: [:] must come last"))));
            return ((void *) 0);
        }
        len = -1;
        if (*p == '.') {
            key = p + 1;
            for (len = 0; ((key [len]) < 0x7f && isalnum (key [len])) || key [len] == '_'; ++len);
            if (len == 0) {
                if (!quiet) emsg ((char_u *) (((char *) (e_emptykey))));
                return ((void *) 0);
            }
            p = key + len;
        }
        else {
            p = skipwhite (p + 1);
            if (*p == ':') empty1 = 1;
            else {
                empty1 = 0;
                if (eval1 (&p, &var1, 1) == 0) return ((void *) 0);
                if (get_tv_string_chk (&var1) == ((void *) 0)) {
                    clear_tv (&var1);
                    return ((void *) 0);
                }
            }
            if (*p == ':') {
                if (lp -> ll_tv -> v_type == 5) {
                    if (!quiet) emsg ((char_u *) (((char *) (e_dictrange))));
                    if (!empty1) clear_tv (&var1);
                    return ((void *) 0);
                }
                if (rettv != ((void *) 0) && (rettv -> v_type != 4 || rettv -> vval.v_list == ((void *) 0))) {
                    if (!quiet) emsg ((char_u *) (((char *) ("E709: [:] requires a List value"))));
                    if (!empty1) clear_tv (&var1);
                    return ((void *) 0);
                }
                p = skipwhite (p + 1);
                if (*p == ']') lp -> ll_empty2 = 1;
                else {
                    lp -> ll_empty2 = 0;
                    if (eval1 (&p, &var2, 1) == 0) {
                        if (!empty1) clear_tv (&var1);
                        return ((void *) 0);
                    }
                    if (get_tv_string_chk (&var2) == ((void *) 0)) {
                        if (!empty1) clear_tv (&var1);
                        clear_tv (&var2);
                        return ((void *) 0);
                    }
                }
                lp -> ll_range = 1;
            }
            else lp -> ll_range = 0;
            if (*p != ']') {
                if (!quiet) emsg ((char_u *) (((char *) (e_missbrac))));
                if (!empty1) clear_tv (&var1);
                if (lp -> ll_range && !lp->ll_empty2) clear_tv (&var2);
                return ((void *) 0);
            }
            ++p;
        }
        if (lp -> ll_tv -> v_type == 5) {
            if (len == -1) {
                key = get_tv_string (&var1);
                if (*key == '\000') {
                    if (!quiet) emsg ((char_u *) (((char *) (e_emptykey))));
                    clear_tv (&var1);
                    return ((void *) 0);
                }
            }
            lp -> ll_list = ((void *) 0);
            lp -> ll_dict = lp -> ll_tv -> vval.v_dict;
            lp -> ll_di = dict_find (lp -> ll_dict, key, len);
            if (lp -> ll_di == ((void *) 0)) {
                if (*p == '[' || *p == '.' || unlet) {
                    if (!quiet) emsg2 ((char_u *) (((char *) (e_dictkey))), (char_u *) (key));
                    if (len == -1) clear_tv (&var1);
                    return ((void *) 0);
                }
                if (len == -1) lp -> ll_newkey = vim_strsave (key);
                else lp -> ll_newkey = vim_strnsave (key, len);
                if (len == -1) clear_tv (&var1);
                if (lp -> ll_newkey == ((void *) 0)) p = ((void *) 0);
                break;
            }
            if (len == -1) clear_tv (&var1);
            lp -> ll_tv = &lp->ll_di->di_tv;
        }
        else {
            if (empty1) lp -> ll_n1 = 0;
            else {
                lp -> ll_n1 = get_tv_number (&var1);
                clear_tv (&var1);
            }
            lp -> ll_dict = ((void *) 0);
            lp -> ll_list = lp -> ll_tv -> vval.v_list;
            lp -> ll_li = list_find (lp -> ll_list, lp -> ll_n1);
            if (lp -> ll_li == ((void *) 0)) {
                if (lp -> ll_n1 < 0) {
                    lp -> ll_n1 = 0;
                    lp -> ll_li = list_find (lp -> ll_list, lp -> ll_n1);
                }
            }
            if (lp -> ll_li == ((void *) 0)) {
                if (lp -> ll_range && !lp->ll_empty2) clear_tv (&var2);
                return ((void *) 0);
            }
            if (lp -> ll_range && !lp->ll_empty2) {
                lp -> ll_n2 = get_tv_number (&var2);
                clear_tv (&var2);
                if (lp -> ll_n2 < 0) {
                    ni = list_find (lp -> ll_list, lp -> ll_n2);
                    if (ni == ((void *) 0)) return ((void *) 0);
                    lp -> ll_n2 = list_idx_of_item (lp -> ll_list, ni);
                }
                if (lp -> ll_n1 < 0) lp -> ll_n1 = list_idx_of_item (lp -> ll_list, lp -> ll_li);
                if (lp -> ll_n2 < lp -> ll_n1) return ((void *) 0);
            }
            lp -> ll_tv = &lp->ll_li->li_tv;
        }
    }
    return p;
}

static void clear_lval (lp)
    lval_T * lp;
{
    vim_free (lp -> ll_exp_name);
    vim_free (lp -> ll_newkey);
}

static void set_var_lval (lp, endp, rettv, copy, op)
    lval_T * lp;
    char_u * endp;
    typval_T * rettv;
    int copy;
    char_u * op;
{
    int cc;
    listitem_T * ri;
    dictitem_T * di;
    if (lp -> ll_tv == ((void *) 0)) {
        if (!check_changedtick(lp->ll_name)) {
            cc = *endp;
            * endp = '\000';
            if (op != ((void *) 0) && *op != '=') {
                typval_T tv;
                if (get_var_tv (lp -> ll_name, (int) strlen ((char *) (lp -> ll_name)), &tv, 1) == 1) {
                    if (tv_op (&tv, rettv, op) == 1) set_var (lp -> ll_name, &tv, 0);
                    clear_tv (&tv);
                }
            }
            else set_var (lp -> ll_name, rettv, copy);
            * endp = cc;
        }
    }
    else if (tv_check_lock (lp -> ll_newkey == ((void *) 0) ? lp -> ll_tv -> v_lock : lp -> ll_tv -> vval.v_dict -> dv_lock, lp
      -> ll_name));
    else if (lp -> ll_range) {
        for (ri = rettv -> vval.v_list -> lv_first; ri != ((void *) 0);) {
            if (op != ((void *) 0) && *op != '=') tv_op (&lp->ll_li->li_tv, &ri->li_tv, op);
            else {
                clear_tv (&lp->ll_li->li_tv);
                copy_tv (&ri->li_tv, &lp->ll_li->li_tv);
            }
            ri = ri -> li_next;
            if (ri == ((void *) 0) || (!lp->ll_empty2 && lp -> ll_n2 == lp -> ll_n1)) break;
            if (lp -> ll_li -> li_next == ((void *) 0)) {
                if (list_append_number (lp -> ll_list, 0) == 0) {
                    ri = ((void *) 0);
                    break;
                }
            }
            lp -> ll_li = lp -> ll_li -> li_next;
            ++lp->ll_n1;
        }
        if (ri != ((void *) 0)) emsg ((char_u *) (((char *) ("E710: List value has more items than target"))));
        else if (lp -> ll_empty2 ? (lp -> ll_li != ((void *) 0) && lp -> ll_li -> li_next != ((void *) 0)) : lp -> ll_n1 != lp
          -> ll_n2) emsg ((char_u *) (((char *) ("E711: List value has not enough items"))));
    }
    else {
        if (lp -> ll_newkey != ((void *) 0)) {
            if (op != ((void *) 0) && *op != '=') {
                emsg2 ((char_u *) (((char *) (e_letwrong))), (char_u *) (op));
                return;
            }
            di = dictitem_alloc (lp -> ll_newkey);
            if (di == ((void *) 0)) return;
            if (dict_add (lp -> ll_tv -> vval.v_dict, di) == 0) {
                vim_free (di);
                return;
            }
            lp -> ll_tv = &di->di_tv;
        }
        else if (op != ((void *) 0) && *op != '=') {
            tv_op (lp -> ll_tv, rettv, op);
            return;
        }
        else clear_tv (lp -> ll_tv);
        if (copy) copy_tv (rettv, lp -> ll_tv);
        else {
            *lp->ll_tv = *rettv;
            lp -> ll_tv -> v_lock = 0;
            init_tv (rettv);
        }
    }
}

static int tv_op (tv1, tv2, op)
    typval_T * tv1;
    typval_T * tv2;
    char_u * op;
{
    long n;
    char_u numbuf [30];
    char_u * s;
    if (tv2 -> v_type != 3 && tv2 -> v_type != 5) {
        switch (tv1 -> v_type) {
        case 5 :
        case 3 :
            break;
        case 4 :
            if (*op != '+' || tv2 -> v_type != 4) break;
            if (tv1 -> vval.v_list != ((void *) 0) && tv2 -> vval.v_list != ((void *) 0)) list_extend (tv1 -> vval.v_list, tv2
              -> vval.v_list, ((void *) 0));
            return 1;
        case 1 :
        case 2 :
            if (tv2 -> v_type == 4) break;
            if (*op == '+' || *op == '-') {
                n = get_tv_number (tv1);
                if (tv2 -> v_type == 6) {
                    float_T f = n;
                    if (*op == '+') f += tv2 -> vval.v_float;
                    else f -= tv2 -> vval.v_float;
                    clear_tv (tv1);
                    tv1 -> v_type = 6;
                    tv1 -> vval.v_float = f;
                }
                else {
                    if (*op == '+') n += get_tv_number (tv2);
                    else n -= get_tv_number (tv2);
                    clear_tv (tv1);
                    tv1 -> v_type = 1;
                    tv1 -> vval.v_number = n;
                }
            }
            else {
                if (tv2 -> v_type == 6) break;
                s = get_tv_string (tv1);
                s = concat_str (s, get_tv_string_buf (tv2, numbuf));
                clear_tv (tv1);
                tv1 -> v_type = 2;
                tv1 -> vval.v_string = s;
            }
            return 1;
        case 6 :
            {
                float_T f;
                if (*op == '.' || (tv2 -> v_type != 6 && tv2 -> v_type != 1 && tv2 -> v_type != 2)) break;
                if (tv2 -> v_type == 6) f = tv2 -> vval.v_float;
                else f = get_tv_number (tv2);
                if (*op == '+') tv1 -> vval.v_float += f;
                else tv1 -> vval.v_float -= f;
            }
            return 1;
        }
    }
    emsg2 ((char_u *) (((char *) (e_letwrong))), (char_u *) (op));
    return 0;
}

static void list_add_watch (l, lw)
    list_T * l;
    listwatch_T * lw;
{
    lw -> lw_next = l -> lv_watch;
    l -> lv_watch = lw;
}

static void list_rem_watch (l, lwrem)
    list_T * l;
    listwatch_T * lwrem;
{
    listwatch_T * lw, * * lwp;
    lwp = &l->lv_watch;
    for (lw = l -> lv_watch; lw != ((void *) 0); lw = lw -> lw_next) {
        if (lw == lwrem) {
            * lwp = lw -> lw_next;
            break;
        }
        lwp = &lw->lw_next;
    }
}

static void list_fix_watch (l, item)
    list_T * l;
    listitem_T * item;
{
    listwatch_T * lw;
    for (lw = l -> lv_watch; lw != ((void *) 0); lw = lw -> lw_next) if (lw -> lw_item == item) lw -> lw_item = item -> li_next
      ;
}

void * eval_for_line (arg, errp, nextcmdp, skip)
    char_u * arg;
    int * errp;
    char_u * * nextcmdp;
    int skip;
{
    forinfo_T * fi;
    char_u * expr;
    typval_T tv;
    list_T * l;
    * errp = 1;
    fi = (forinfo_T *) alloc_clear (sizeof (forinfo_T));
    if (fi == ((void *) 0)) return ((void *) 0);
    expr = skip_var_list (arg, &fi->fi_varcount, &fi->fi_semicolon);
    if (expr == ((void *) 0)) return fi;
    expr = skipwhite (expr);
    if (expr [0] != 'i' || expr [1] != 'n' || !((expr[2])==' '||(expr[2])=='\t')) {
        emsg ((char_u *) (((char *) ("E690: Missing \"in\" after :for"))));
        return fi;
    }
    if (skip) ++emsg_skip;
    if (eval0 (skipwhite (expr + 2), &tv, nextcmdp, !skip) == 1) {
        * errp = 0;
        if (!skip) {
            l = tv.vval.v_list;
            if (tv.v_type != 4 || l == ((void *) 0)) {
                emsg ((char_u *) (((char *) (e_listreq))));
                clear_tv (&tv);
            }
            else {
                fi -> fi_list = l;
                list_add_watch (l, &fi->fi_lw);
                fi -> fi_lw.lw_item = l -> lv_first;
            }
        }
    }
    if (skip) --emsg_skip;
    return fi;
}

int next_for_item (fi_void, arg)
    void * fi_void;
    char_u * arg;
{
    forinfo_T * fi = (forinfo_T *) fi_void;
    int result;
    listitem_T * item;
    item = fi -> fi_lw.lw_item;
    if (item == ((void *) 0)) result = 0;
    else {
        fi -> fi_lw.lw_item = item -> li_next;
        result = (ex_let_vars (arg, &item->li_tv, 1, fi -> fi_semicolon, fi -> fi_varcount, ((void *) 0)) == 1);
    }
    return result;
}

void free_for_info (fi_void)
    void * fi_void;
{
    forinfo_T * fi = (forinfo_T *) fi_void;
    if (fi != ((void *) 0) && fi -> fi_list != ((void *) 0)) {
        list_rem_watch (fi -> fi_list, &fi->fi_lw);
        list_unref (fi -> fi_list);
    }
    vim_free (fi);
}

void set_context_for_expression (xp, arg, cmdidx)
    expand_T * xp;
    char_u * arg;
    cmdidx_T cmdidx;
{
    int got_eq = 0;
    int c;
    char_u * p;
    if (cmdidx == CMD_let) {
        xp -> xp_context = 15;
        if ((char_u *) strpbrk ((char *) (arg), (char *) ((char_u *) "\"'+-*/%.=!?~|&$([<>,#")) == ((void *) 0)) {
            for (p = arg + strlen ((char *) (arg)); p >= arg;) {
                xp -> xp_pattern = p;
                --p;
                if (((*p) == ' ' || (*p) == '\t')) break;
            }
            return;
        }
    }
    else xp -> xp_context = cmdidx == CMD_call ? 18 : 20;
    while ((xp -> xp_pattern = (char_u *) strpbrk ((char *) (arg), (char *) ((char_u *) "\"'+-*/%.=!?~|&$([<>,#"))) != ((void *
      ) 0)) {
        c = *xp->xp_pattern;
        if (c == '&') {
            c = xp -> xp_pattern [1];
            if (c == '&') {
                ++xp->xp_pattern;
                xp -> xp_context = cmdidx != CMD_let || got_eq ? 20 : 0;
            }
            else if (c != ' ') {
                xp -> xp_context = 4;
                if ((c == 'l' || c == 'g') && xp -> xp_pattern [2] == ':') xp -> xp_pattern += 2;
            }
        }
        else if (c == '$') {
            xp -> xp_context = 26;
        }
        else if (c == '=') {
            got_eq = 1;
            xp -> xp_context = 20;
        }
        else if (c == '<' && xp -> xp_context == 18 && vim_strchr (xp -> xp_pattern, '(') == ((void *) 0)) {
            break;
        }
        else if (cmdidx != CMD_let || got_eq) {
            if (c == '"') {
                while ((c = *++xp->xp_pattern) != '\000' && c != '"') if (c == '\\' && xp -> xp_pattern [1] != '\000') 
                  ++xp->xp_pattern;
                xp -> xp_context = 0;
            }
            else if (c == '\'') {
                while ((c = *++xp->xp_pattern) != '\000' && c != '\'');
                xp -> xp_context = 0;
            }
            else if (c == '|') {
                if (xp -> xp_pattern [1] == '|') {
                    ++xp->xp_pattern;
                    xp -> xp_context = 20;
                }
                else xp -> xp_context = 1;
            }
            else xp -> xp_context = 20;
        }
        else xp -> xp_context = 20;
        arg = xp -> xp_pattern;
        if (*arg != '\000') while ((c = *++arg) != '\000' && (c == ' ' || c == '\t'));
    }
    xp -> xp_pattern = arg;
}

void ex_call (eap)
    exarg_T * eap;
{
    char_u * arg = eap -> arg;
    char_u * startarg;
    char_u * name;
    char_u * tofree;
    int len;
    typval_T rettv;
    linenr_T lnum;
    int doesrange;
    int failed = 0;
    funcdict_T fudi;
    tofree = trans_function_name (&arg, eap -> skip, 1, &fudi);
    if (fudi.fd_newkey != ((void *) 0)) {
        emsg2 ((char_u *) (((char *) (e_dictkey))), (char_u *) (fudi.fd_newkey));
        vim_free (fudi.fd_newkey);
    }
    if (tofree == ((void *) 0)) return;
    if (fudi.fd_dict != ((void *) 0)) ++fudi.fd_dict->dv_refcount;
    len = (int) strlen ((char *) (tofree));
    name = deref_func_name (tofree, &len);
    startarg = skipwhite (arg);
    rettv.v_type = 0;
    if (*startarg != '(') {
        emsg2 ((char_u *) (((char *) ("E107: Missing parentheses: %s"))), (char_u *) (eap -> arg));
        goto end;
    }
    if (eap -> skip) {
        ++emsg_skip;
        lnum = eap -> line2;
    }
    else lnum = eap -> line1;
    for (; lnum <= eap -> line2; ++lnum) {
        if (!eap->skip && eap -> addr_count > 0) {
            curwin -> w_cursor.lnum = lnum;
            curwin -> w_cursor.col = 0;
        }
        arg = startarg;
        if (get_func_tv (name, (int) strlen ((char *) (name)), &rettv, &arg, eap -> line1, eap -> line2, &doesrange, !eap->skip
          , fudi.fd_dict) == 0) {
            failed = 1;
            break;
        }
        if (handle_subscript (&arg, &rettv, !eap->skip, 1) == 0) {
            failed = 1;
            break;
        }
        clear_tv (&rettv);
        if (doesrange || eap -> skip) break;
        if (aborting ()) break;
    }
    if (eap -> skip) --emsg_skip;
    if (!failed) {
        if (!ends_excmd(*arg)) {
            emsg_severe = 1;
            emsg ((char_u *) (((char *) (e_trailing))));
        }
        else eap -> nextcmd = check_nextcmd (arg);
    }
    end : dict_unref (fudi.fd_dict);
    vim_free (tofree);
}

void ex_unlet (eap)
    exarg_T * eap;
{
    ex_unletlock (eap, eap -> arg, 0);
}

void ex_lockvar (eap)
    exarg_T * eap;
{
    char_u * arg = eap -> arg;
    int deep = 2;
    if (eap -> forceit) deep = -1;
    else if (vim_isdigit (*arg)) {
        deep = getdigits (&arg);
        arg = skipwhite (arg);
    }
    ex_unletlock (eap, arg, deep);
}

static void ex_unletlock (eap, argstart, deep)
    exarg_T * eap;
    char_u * argstart;
    int deep;
{
    char_u * arg = argstart;
    char_u * name_end;
    int error = 0;
    lval_T lv;
    do {
        name_end = get_lval (arg, ((void *) 0), &lv, 1, eap -> skip || error, 0, 2);
        if (lv.ll_name == ((void *) 0)) error = 1;
        if (name_end == ((void *) 0) || (!((*name_end) == ' ' || (*name_end) == '\t') && !ends_excmd(*name_end))) {
            if (name_end != ((void *) 0)) {
                emsg_severe = 1;
                emsg ((char_u *) (((char *) (e_trailing))));
            }
            if (!(eap->skip||error)) clear_lval (&lv);
            break;
        }
        if (!error && !eap->skip) {
            if (eap -> cmdidx == CMD_unlet) {
                if (do_unlet_var (&lv, name_end, eap -> forceit) == 0) error = 1;
            }
            else {
                if (do_lock_var (&lv, name_end, deep, eap -> cmdidx == CMD_lockvar) == 0) error = 1;
            }
        }
        if (!eap->skip) clear_lval (&lv);
        arg = skipwhite (name_end);
    }
    while (!ends_excmd(*arg));
    eap -> nextcmd = check_nextcmd (arg);
}

static int do_unlet_var (lp, name_end, forceit)
    lval_T * lp;
    char_u * name_end;
    int forceit;
{
    int ret = 1;
    int cc;
    if (lp -> ll_tv == ((void *) 0)) {
        cc = *name_end;
        * name_end = '\000';
        if (check_changedtick (lp -> ll_name)) ret = 0;
        else if (do_unlet (lp -> ll_name, forceit) == 0) ret = 0;
        * name_end = cc;
    }
    else if (tv_check_lock (lp -> ll_tv -> v_lock, lp -> ll_name)) return 0;
    else if (lp -> ll_range) {
        listitem_T * li;
        while (lp -> ll_li != ((void *) 0) && (lp -> ll_empty2 || lp -> ll_n2 >= lp -> ll_n1)) {
            li = lp -> ll_li -> li_next;
            listitem_remove (lp -> ll_list, lp -> ll_li);
            lp -> ll_li = li;
            ++lp->ll_n1;
        }
    }
    else {
        if (lp -> ll_list != ((void *) 0)) listitem_remove (lp -> ll_list, lp -> ll_li);
        else dictitem_remove (lp -> ll_dict, lp -> ll_di);
    }
    return ret;
}

int do_unlet (name, forceit)
    char_u * name;
    int forceit;
{
    hashtab_T * ht;
    hashitem_T * hi;
    char_u * varname;
    dictitem_T * di;
    ht = find_var_ht (name, &varname);
    if (ht != ((void *) 0) && *varname != '\000') {
        hi = hash_find (ht, varname);
        if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
            di = ((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi)));
            if (var_check_fixed (di -> di_flags, name) || var_check_ro (di -> di_flags, name)) return 0;
            delete_var (ht, hi);
            return 1;
        }
    }
    if (forceit) return 1;
    emsg2 ((char_u *) (((char *) ("E108: No such variable: \"%s\""))), (char_u *) (name));
    return 0;
}

static int do_lock_var (lp, name_end, deep, lock)
    lval_T * lp;
    char_u * name_end;
    int deep;
    int lock;
{
    int ret = 1;
    int cc;
    dictitem_T * di;
    if (deep == 0) return 1;
    if (lp -> ll_tv == ((void *) 0)) {
        cc = *name_end;
        * name_end = '\000';
        if (check_changedtick (lp -> ll_name)) ret = 0;
        else {
            di = find_var (lp -> ll_name, ((void *) 0));
            if (di == ((void *) 0)) ret = 0;
            else {
                if (lock) di -> di_flags |= 8;
                else di -> di_flags &= ~8;
                item_lock (&di->di_tv, deep, lock);
            }
        }
        * name_end = cc;
    }
    else if (lp -> ll_range) {
        listitem_T * li = lp -> ll_li;
        while (li != ((void *) 0) && (lp -> ll_empty2 || lp -> ll_n2 >= lp -> ll_n1)) {
            item_lock (&li->li_tv, deep, lock);
            li = li -> li_next;
            ++lp->ll_n1;
        }
    }
    else if (lp -> ll_list != ((void *) 0)) item_lock (&lp->ll_li->li_tv, deep, lock);
    else item_lock (&lp->ll_di->di_tv, deep, lock);
    return ret;
}

static void item_lock (tv, deep, lock)
    typval_T * tv;
    int deep;
    int lock;
{
    static int recurse = 0;
    list_T * l;
    listitem_T * li;
    dict_T * d;
    hashitem_T * hi;
    int todo;
    if (recurse >= 100) {
        emsg ((char_u *) (((char *) ("E743: variable nested too deep for (un)lock"))));
        return;
    }
    if (deep == 0) return;
    ++recurse;
    if (lock) tv -> v_lock |= 1;
    else tv -> v_lock &= ~1;
    switch (tv -> v_type) {
    case 4 :
        if ((l = tv -> vval.v_list) != ((void *) 0)) {
            if (lock) l -> lv_lock |= 1;
            else l -> lv_lock &= ~1;
            if (deep < 0 || deep > 1) for (li = l -> lv_first; li != ((void *) 0); li = li -> li_next) item_lock (&li->li_tv,
              deep - 1, lock);
        }
        break;
    case 5 :
        if ((d = tv -> vval.v_dict) != ((void *) 0)) {
            if (lock) d -> dv_lock |= 1;
            else d -> dv_lock &= ~1;
            if (deep < 0 || deep > 1) {
                todo = (int) d -> dv_hashtab.ht_used;
                for (hi = d -> dv_hashtab.ht_array; todo > 0; ++hi) {
                    if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
                        --todo;
                        item_lock (&((dictitem_T*)((hi)->hi_key-(dumdi.di_key-(char_u*)&dumdi))) -> di_tv, deep - 1, lock);
                    }
                }
            }
        }
    }
    --recurse;
}

static int tv_islocked (tv)
    typval_T * tv;
{
    return (tv -> v_lock & 1) || (tv -> v_type == 4 && tv -> vval.v_list != ((void *) 0) && (tv -> vval.v_list -> lv_lock & 1))
      || (tv -> v_type == 5 && tv -> vval.v_dict != ((void *) 0) && (tv -> vval.v_dict -> dv_lock & 1));
}

void del_menutrans_vars () {
    hashitem_T * hi;
    int todo;
    hash_lock (&globvardict.dv_hashtab);
    todo = (int) globvardict.dv_hashtab.ht_used;
    for (hi = globvardict.dv_hashtab.ht_array; todo > 0 && !got_int; ++hi) {
        if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
            --todo;
            if (strncmp ((char *) (((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi))) -> di_key), (char *) (
              "menutrans_"), (size_t) (10)) == 0) delete_var (&globvardict.dv_hashtab, hi);
        }
    }
    hash_unlock (&globvardict.dv_hashtab);
}

static char_u * cat_prefix_varname (int prefix, char_u * name);
static char_u * varnamebuf = ((void *) 0);
static int varnamebuflen = 0;

static char_u * cat_prefix_varname (prefix, name)
    int prefix;
    char_u * name;
{
    int len;
    len = (int) strlen ((char *) (name)) + 3;
    if (len > varnamebuflen) {
        vim_free (varnamebuf);
        len += 10;
        varnamebuf = alloc (len);
        if (varnamebuf == ((void *) 0)) {
            varnamebuflen = 0;
            return ((void *) 0);
        }
        varnamebuflen = len;
    }
    * varnamebuf = prefix;
    varnamebuf [1] = ':';
    ((__builtin_object_size ((char *) (varnamebuf + 2), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (varnamebuf + 2)
      , (char *) (name), __builtin_object_size ((char *) (varnamebuf + 2), 1 > 1)) : __inline_strcpy_chk ((char *) (varnamebuf +
      2), (char *) (name)));
    return varnamebuf;
}

char_u * get_user_var_name (xp, idx)
    expand_T * xp;
    int idx;
{
    static long_u gdone;
    static long_u bdone;
    static long_u wdone;
    static long_u tdone;
    static int vidx;
    static hashitem_T * hi;
    hashtab_T * ht;
    if (idx == 0) {
        gdone = bdone = wdone = vidx = 0;
        tdone = 0;
    }
    if (gdone < globvardict.dv_hashtab.ht_used) {
        if (gdone ++ == 0) hi = globvardict.dv_hashtab.ht_array;
        else ++hi;
        while (((hi) -> hi_key == ((void *) 0) || (hi) -> hi_key == &hash_removed)) ++hi;
        if (strncmp ((char *) ("g:"), (char *) (xp -> xp_pattern), (size_t) (2)) == 0) return cat_prefix_varname ('g', hi ->
          hi_key);
        return hi -> hi_key;
    }
    ht = &curbuf->b_vars.dv_hashtab;
    if (bdone < ht -> ht_used) {
        if (bdone ++ == 0) hi = ht -> ht_array;
        else ++hi;
        while (((hi) -> hi_key == ((void *) 0) || (hi) -> hi_key == &hash_removed)) ++hi;
        return cat_prefix_varname ('b', hi -> hi_key);
    }
    if (bdone == ht -> ht_used) {
        ++bdone;
        return (char_u *) "b:changedtick";
    }
    ht = &curwin->w_vars.dv_hashtab;
    if (wdone < ht -> ht_used) {
        if (wdone ++ == 0) hi = ht -> ht_array;
        else ++hi;
        while (((hi) -> hi_key == ((void *) 0) || (hi) -> hi_key == &hash_removed)) ++hi;
        return cat_prefix_varname ('w', hi -> hi_key);
    }
    ht = &curtab->tp_vars.dv_hashtab;
    if (tdone < ht -> ht_used) {
        if (tdone ++ == 0) hi = ht -> ht_array;
        else ++hi;
        while (((hi) -> hi_key == ((void *) 0) || (hi) -> hi_key == &hash_removed)) ++hi;
        return cat_prefix_varname ('t', hi -> hi_key);
    }
    if (vidx < 55) return cat_prefix_varname ('v', (char_u *) vimvars [vidx ++].vv_name);
    vim_free (varnamebuf);
    varnamebuf = ((void *) 0);
    varnamebuflen = 0;
    return ((void *) 0);
}

typedef enum {TYPE_UNKNOWN = 0, TYPE_EQUAL, TYPE_NEQUAL, TYPE_GREATER, TYPE_GEQUAL, TYPE_SMALLER, TYPE_SEQUAL, TYPE_MATCH,
  TYPE_NOMATCH} exptype_T;

static int eval0 (arg, rettv, nextcmd, evaluate)
    char_u * arg;
    typval_T * rettv;
    char_u * * nextcmd;
    int evaluate;
{
    int ret;
    char_u * p;
    p = skipwhite (arg);
    ret = eval1 (&p, rettv, evaluate);
    if (ret == 0 || !ends_excmd(*p)) {
        if (ret != 0) clear_tv (rettv);
        if (!aborting()) emsg2 ((char_u *) (((char *) (e_invexpr2))), (char_u *) (arg));
        ret = 0;
    }
    if (nextcmd != ((void *) 0)) *nextcmd = check_nextcmd (p);
    return ret;
}

static int eval1 (arg, rettv, evaluate)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
{
    int result;
    typval_T var2;
    if (eval2 (arg, rettv, evaluate) == 0) return 0;
    if ((*arg) [0] == '?') {
        result = 0;
        if (evaluate) {
            int error = 0;
            if (get_tv_number_chk (rettv, &error) != 0) result = 1;
            clear_tv (rettv);
            if (error) return 0;
        }
        * arg = skipwhite (*arg + 1);
        if (eval1 (arg, rettv, evaluate && result) == 0) return 0;
        if ((*arg) [0] != ':') {
            emsg ((char_u *) (((char *) ("E109: Missing ':' after '?'"))));
            if (evaluate && result) clear_tv (rettv);
            return 0;
        }
        * arg = skipwhite (*arg + 1);
        if (eval1 (arg, &var2, evaluate && !result) == 0) {
            if (evaluate && result) clear_tv (rettv);
            return 0;
        }
        if (evaluate && !result) *rettv = var2;
    }
    return 1;
}

static int eval2 (arg, rettv, evaluate)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
{
    typval_T var2;
    long result;
    int first;
    int error = 0;
    if (eval3 (arg, rettv, evaluate) == 0) return 0;
    first = 1;
    result = 0;
    while ((*arg) [0] == '|' && (*arg) [1] == '|') {
        if (evaluate && first) {
            if (get_tv_number_chk (rettv, &error) != 0) result = 1;
            clear_tv (rettv);
            if (error) return 0;
            first = 0;
        }
        * arg = skipwhite (*arg + 2);
        if (eval3 (arg, &var2, evaluate && !result) == 0) return 0;
        if (evaluate && !result) {
            if (get_tv_number_chk (&var2, &error) != 0) result = 1;
            clear_tv (&var2);
            if (error) return 0;
        }
        if (evaluate) {
            rettv -> v_type = 1;
            rettv -> vval.v_number = result;
        }
    }
    return 1;
}

static int eval3 (arg, rettv, evaluate)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
{
    typval_T var2;
    long result;
    int first;
    int error = 0;
    if (eval4 (arg, rettv, evaluate) == 0) return 0;
    first = 1;
    result = 1;
    while ((*arg) [0] == '&' && (*arg) [1] == '&') {
        if (evaluate && first) {
            if (get_tv_number_chk (rettv, &error) == 0) result = 0;
            clear_tv (rettv);
            if (error) return 0;
            first = 0;
        }
        * arg = skipwhite (*arg + 2);
        if (eval4 (arg, &var2, evaluate && result) == 0) return 0;
        if (evaluate && result) {
            if (get_tv_number_chk (&var2, &error) == 0) result = 0;
            clear_tv (&var2);
            if (error) return 0;
        }
        if (evaluate) {
            rettv -> v_type = 1;
            rettv -> vval.v_number = result;
        }
    }
    return 1;
}

static int eval4 (arg, rettv, evaluate)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
{
    typval_T var2;
    char_u * p;
    int i;
    exptype_T type = TYPE_UNKNOWN;
    int type_is = 0;
    int len = 2;
    long n1, n2;
    char_u * s1, * s2;
    char_u buf1 [30], buf2 [30];
    regmatch_T regmatch;
    int ic;
    char_u * save_cpo;
    if (eval5 (arg, rettv, evaluate) == 0) return 0;
    p = *arg;
    switch (p [0]) {
    case '=' :
        if (p [1] == '=') type = TYPE_EQUAL;
        else if (p [1] == '~') type = TYPE_MATCH;
        break;
    case '!' :
        if (p [1] == '=') type = TYPE_NEQUAL;
        else if (p [1] == '~') type = TYPE_NOMATCH;
        break;
    case '>' :
        if (p [1] != '=') {
            type = TYPE_GREATER;
            len = 1;
        }
        else type = TYPE_GEQUAL;
        break;
    case '<' :
        if (p [1] != '=') {
            type = TYPE_SMALLER;
            len = 1;
        }
        else type = TYPE_SEQUAL;
        break;
    case 'i' :
        if (p [1] == 's') {
            if (p [2] == 'n' && p [3] == 'o' && p [4] == 't') len = 5;
            if (!vim_isIDc(p[len])) {
                type = len == 2 ? TYPE_EQUAL : TYPE_NEQUAL;
                type_is = 1;
            }
        }
        break;
    }
    if (type != TYPE_UNKNOWN) {
        if (p [len] == '?') {
            ic = 1;
            ++len;
        }
        else if (p [len] == '#') {
            ic = 0;
            ++len;
        }
        else ic = p_ic;
        * arg = skipwhite (p + len);
        if (eval5 (arg, &var2, evaluate) == 0) {
            clear_tv (rettv);
            return 0;
        }
        if (evaluate) {
            if (type_is && rettv -> v_type != var2.v_type) {
                n1 = (type == TYPE_NEQUAL);
            }
            else if (rettv -> v_type == 4 || var2.v_type == 4) {
                if (type_is) {
                    n1 = (rettv -> v_type == var2.v_type && rettv -> vval.v_list == var2.vval.v_list);
                    if (type == TYPE_NEQUAL) n1 = !n1;
                }
                else if (rettv -> v_type != var2.v_type || (type != TYPE_EQUAL && type != TYPE_NEQUAL)) {
                    if (rettv -> v_type != var2.v_type) emsg ((char_u *) (((char *) ("E691: Can only compare List with List")))
                      );
                    else emsg ((char_u *) (((char *) ("E692: Invalid operation for Lists"))));
                    clear_tv (rettv);
                    clear_tv (&var2);
                    return 0;
                }
                else {
                    n1 = list_equal (rettv -> vval.v_list, var2.vval.v_list, ic);
                    if (type == TYPE_NEQUAL) n1 = !n1;
                }
            }
            else if (rettv -> v_type == 5 || var2.v_type == 5) {
                if (type_is) {
                    n1 = (rettv -> v_type == var2.v_type && rettv -> vval.v_dict == var2.vval.v_dict);
                    if (type == TYPE_NEQUAL) n1 = !n1;
                }
                else if (rettv -> v_type != var2.v_type || (type != TYPE_EQUAL && type != TYPE_NEQUAL)) {
                    if (rettv -> v_type != var2.v_type) emsg ((char_u *) (((char *) (
                      "E735: Can only compare Dictionary with Dictionary"))));
                    else emsg ((char_u *) (((char *) ("E736: Invalid operation for Dictionary"))));
                    clear_tv (rettv);
                    clear_tv (&var2);
                    return 0;
                }
                else {
                    n1 = dict_equal (rettv -> vval.v_dict, var2.vval.v_dict, ic);
                    if (type == TYPE_NEQUAL) n1 = !n1;
                }
            }
            else if (rettv -> v_type == 3 || var2.v_type == 3) {
                if (rettv -> v_type != var2.v_type || (type != TYPE_EQUAL && type != TYPE_NEQUAL)) {
                    if (rettv -> v_type != var2.v_type) emsg ((char_u *) (((char *) (
                      "E693: Can only compare Funcref with Funcref"))));
                    else emsg ((char_u *) (((char *) ("E694: Invalid operation for Funcrefs"))));
                    clear_tv (rettv);
                    clear_tv (&var2);
                    return 0;
                }
                else {
                    if (rettv -> vval.v_string == ((void *) 0) || var2.vval.v_string == ((void *) 0)) n1 = 0;
                    else n1 = strcmp ((char *) (rettv -> vval.v_string), (char *) (var2.vval.v_string)) == 0;
                    if (type == TYPE_NEQUAL) n1 = !n1;
                }
            }
            else if ((rettv -> v_type == 6 || var2.v_type == 6) && type != TYPE_MATCH && type != TYPE_NOMATCH) {
                float_T f1, f2;
                if (rettv -> v_type == 6) f1 = rettv -> vval.v_float;
                else f1 = get_tv_number (rettv);
                if (var2.v_type == 6) f2 = var2.vval.v_float;
                else f2 = get_tv_number (&var2);
                n1 = 0;
                switch (type) {
                case TYPE_EQUAL :
                    n1 = (f1 == f2);
                    break;
                case TYPE_NEQUAL :
                    n1 = (f1 != f2);
                    break;
                case TYPE_GREATER :
                    n1 = (f1 > f2);
                    break;
                case TYPE_GEQUAL :
                    n1 = (f1 >= f2);
                    break;
                case TYPE_SMALLER :
                    n1 = (f1 < f2);
                    break;
                case TYPE_SEQUAL :
                    n1 = (f1 <= f2);
                    break;
                case TYPE_UNKNOWN :
                case TYPE_MATCH :
                case TYPE_NOMATCH :
                    break;
                }
            }
            else if ((rettv -> v_type == 1 || var2.v_type == 1) && type != TYPE_MATCH && type != TYPE_NOMATCH) {
                n1 = get_tv_number (rettv);
                n2 = get_tv_number (&var2);
                switch (type) {
                case TYPE_EQUAL :
                    n1 = (n1 == n2);
                    break;
                case TYPE_NEQUAL :
                    n1 = (n1 != n2);
                    break;
                case TYPE_GREATER :
                    n1 = (n1 > n2);
                    break;
                case TYPE_GEQUAL :
                    n1 = (n1 >= n2);
                    break;
                case TYPE_SMALLER :
                    n1 = (n1 < n2);
                    break;
                case TYPE_SEQUAL :
                    n1 = (n1 <= n2);
                    break;
                case TYPE_UNKNOWN :
                case TYPE_MATCH :
                case TYPE_NOMATCH :
                    break;
                }
            }
            else {
                s1 = get_tv_string_buf (rettv, buf1);
                s2 = get_tv_string_buf (&var2, buf2);
                if (type != TYPE_MATCH && type != TYPE_NOMATCH) i = ic ? strcasecmp ((char *) ((s1)), (char *) ((s2))) : strcmp
                  ((char *) (s1), (char *) (s2));
                else i = 0;
                n1 = 0;
                switch (type) {
                case TYPE_EQUAL :
                    n1 = (i == 0);
                    break;
                case TYPE_NEQUAL :
                    n1 = (i != 0);
                    break;
                case TYPE_GREATER :
                    n1 = (i > 0);
                    break;
                case TYPE_GEQUAL :
                    n1 = (i >= 0);
                    break;
                case TYPE_SMALLER :
                    n1 = (i < 0);
                    break;
                case TYPE_SEQUAL :
                    n1 = (i <= 0);
                    break;
                case TYPE_MATCH :
                case TYPE_NOMATCH :
                    save_cpo = p_cpo;
                    p_cpo = (char_u *) "";
                    regmatch.regprog = vim_regcomp (s2, 1 + 2);
                    regmatch.rm_ic = ic;
                    if (regmatch.regprog != ((void *) 0)) {
                        n1 = vim_regexec_nl (&regmatch, s1, (colnr_T) 0);
                        vim_free (regmatch.regprog);
                        if (type == TYPE_NOMATCH) n1 = !n1;
                    }
                    p_cpo = save_cpo;
                    break;
                case TYPE_UNKNOWN :
                    break;
                }
            }
            clear_tv (rettv);
            clear_tv (&var2);
            rettv -> v_type = 1;
            rettv -> vval.v_number = n1;
        }
    }
    return 1;
}

static int eval5 (arg, rettv, evaluate)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
{
    typval_T var2;
    typval_T var3;
    int op;
    long n1, n2;
    float_T f1 = 0, f2 = 0;
    char_u * s1, * s2;
    char_u buf1 [30], buf2 [30];
    char_u * p;
    if (eval6 (arg, rettv, evaluate, 0) == 0) return 0;
    for (;;) {
        op = **arg;
        if (op != '+' && op != '-' && op != '.') break;
        if ((op != '+' || rettv -> v_type != 4) && (op == '.' || rettv -> v_type != 6)) {
            if (evaluate && get_tv_string_chk (rettv) == ((void *) 0)) {
                clear_tv (rettv);
                return 0;
            }
        }
        * arg = skipwhite (*arg + 1);
        if (eval6 (arg, &var2, evaluate, op == '.') == 0) {
            clear_tv (rettv);
            return 0;
        }
        if (evaluate) {
            if (op == '.') {
                s1 = get_tv_string_buf (rettv, buf1);
                s2 = get_tv_string_buf_chk (&var2, buf2);
                if (s2 == ((void *) 0)) {
                    clear_tv (rettv);
                    clear_tv (&var2);
                    return 0;
                }
                p = concat_str (s1, s2);
                clear_tv (rettv);
                rettv -> v_type = 2;
                rettv -> vval.v_string = p;
            }
            else if (op == '+' && rettv -> v_type == 4 && var2.v_type == 4) {
                if (list_concat (rettv -> vval.v_list, var2.vval.v_list, &var3) == 0) {
                    clear_tv (rettv);
                    clear_tv (&var2);
                    return 0;
                }
                clear_tv (rettv);
                * rettv = var3;
            }
            else {
                int error = 0;
                if (rettv -> v_type == 6) {
                    f1 = rettv -> vval.v_float;
                    n1 = 0;
                }
                else {
                    n1 = get_tv_number_chk (rettv, &error);
                    if (error) {
                        clear_tv (rettv);
                        return 0;
                    }
                    if (var2.v_type == 6) f1 = n1;
                }
                if (var2.v_type == 6) {
                    f2 = var2.vval.v_float;
                    n2 = 0;
                }
                else {
                    n2 = get_tv_number_chk (&var2, &error);
                    if (error) {
                        clear_tv (rettv);
                        clear_tv (&var2);
                        return 0;
                    }
                    if (rettv -> v_type == 6) f2 = n2;
                }
                clear_tv (rettv);
                if (rettv -> v_type == 6 || var2.v_type == 6) {
                    if (op == '+') f1 = f1 + f2;
                    else f1 = f1 - f2;
                    rettv -> v_type = 6;
                    rettv -> vval.v_float = f1;
                }
                else {
                    if (op == '+') n1 = n1 + n2;
                    else n1 = n1 - n2;
                    rettv -> v_type = 1;
                    rettv -> vval.v_number = n1;
                }
            }
            clear_tv (&var2);
        }
    }
    return 1;
}

static int eval6 (arg, rettv, evaluate, want_string)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
    int want_string;
{
    typval_T var2;
    int op;
    long n1, n2;
    int use_float = 0;
    float_T f1 = 0, f2;
    int error = 0;
    if (eval7 (arg, rettv, evaluate, want_string) == 0) return 0;
    for (;;) {
        op = **arg;
        if (op != '*' && op != '/' && op != '%') break;
        if (evaluate) {
            if (rettv -> v_type == 6) {
                f1 = rettv -> vval.v_float;
                use_float = 1;
                n1 = 0;
            }
            else n1 = get_tv_number_chk (rettv, &error);
            clear_tv (rettv);
            if (error) return 0;
        }
        else n1 = 0;
        * arg = skipwhite (*arg + 1);
        if (eval7 (arg, &var2, evaluate, 0) == 0) return 0;
        if (evaluate) {
            if (var2.v_type == 6) {
                if (!use_float) {
                    f1 = n1;
                    use_float = 1;
                }
                f2 = var2.vval.v_float;
                n2 = 0;
            }
            else {
                n2 = get_tv_number_chk (&var2, &error);
                clear_tv (&var2);
                if (error) return 0;
                if (use_float) f2 = n2;
            }
            if (use_float) {
                if (op == '*') f1 = f1 * f2;
                else if (op == '/') {
                    f1 = f1 / f2;
                }
                else {
                    emsg ((char_u *) (((char *) ("E804: Cannot use '%' with Float"))));
                    return 0;
                }
                rettv -> v_type = 6;
                rettv -> vval.v_float = f1;
            }
            else {
                if (op == '*') n1 = n1 * n2;
                else if (op == '/') {
                    if (n2 == 0) {
                        if (n1 == 0) n1 = -0x7fffffffL - 1L;
                        else if (n1 < 0) n1 = -0x7fffffffL;
                        else n1 = 0x7fffffffL;
                    }
                    else n1 = n1 / n2;
                }
                else {
                    if (n2 == 0) n1 = 0;
                    else n1 = n1 % n2;
                }
                rettv -> v_type = 1;
                rettv -> vval.v_number = n1;
            }
        }
    }
    return 1;
}

static int eval7 (arg, rettv, evaluate, want_string)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
    int want_string __attribute__ ((unused));
{
    long n;
    int len;
    char_u * s;
    char_u * start_leader, * end_leader;
    int ret = 1;
    char_u * alias;
    rettv -> v_type = 0;
    start_leader = *arg;
    while (**arg == '!' || **arg == '-' || **arg == '+') *arg = skipwhite (*arg + 1);
    end_leader = *arg;
    switch (**arg) {
    case '0' :
    case '1' :
    case '2' :
    case '3' :
    case '4' :
    case '5' :
    case '6' :
    case '7' :
    case '8' :
    case '9' :
        {
            char_u * p = skipdigits (*arg + 1);
            int get_float = 0;
            if (!want_string && p [0] == '.' && vim_isdigit (p [1])) {
                get_float = 1;
                p = skipdigits (p + 2);
                if (*p == 'e' || *p == 'E') {
                    ++p;
                    if (*p == '-' || *p == '+') ++p;
                    if (!vim_isdigit(*p)) get_float = 0;
                    else p = skipdigits (p + 1);
                }
                if (((*p) < 0x7f && isalpha (*p)) || *p == '.') get_float = 0;
            }
            if (get_float) {
                float_T f;
                *arg += string2float (*arg, &f);
                if (evaluate) {
                    rettv -> v_type = 6;
                    rettv -> vval.v_float = f;
                }
            }
            else {
                vim_str2nr (*arg, ((void *) 0), &len, 1, 1, &n, ((void *) 0));
                *arg += len;
                if (evaluate) {
                    rettv -> v_type = 1;
                    rettv -> vval.v_number = n;
                }
            }
            break;
        }
    case '"' :
        ret = get_string_tv (arg, rettv, evaluate);
        break;
    case '\'' :
        ret = get_lit_string_tv (arg, rettv, evaluate);
        break;
    case '[' :
        ret = get_list_tv (arg, rettv, evaluate);
        break;
    case '{' :
        ret = get_dict_tv (arg, rettv, evaluate);
        break;
    case '&' :
        ret = get_option_tv (arg, rettv, evaluate);
        break;
    case '$' :
        ret = get_env_tv (arg, rettv, evaluate);
        break;
    case '@' :
        ++*arg;
        if (evaluate) {
            rettv -> v_type = 2;
            rettv -> vval.v_string = get_reg_contents (**arg, 1, 1);
        }
        if (**arg != '\000') ++*arg;
        break;
    case '(' :
        *arg = skipwhite (*arg + 1);
        ret = eval1 (arg, rettv, evaluate);
        if (**arg == ')') ++*arg;
        else if (ret == 1) {
            emsg ((char_u *) (((char *) ("E110: Missing ')'"))));
            clear_tv (rettv);
            ret = 0;
        }
        break;
    default :
        ret = 2;
        break;
    }
    if (ret == 2) {
        s = *arg;
        len = get_name_len (arg, &alias, evaluate, 1);
        if (alias != ((void *) 0)) s = alias;
        if (len <= 0) ret = 0;
        else {
            if (**arg == '(') {
                s = deref_func_name (s, &len);
                ret = get_func_tv (s, len, rettv, arg, curwin -> w_cursor.lnum, curwin -> w_cursor.lnum, &len, evaluate, ((void
                  *) 0));
                if (aborting ()) {
                    if (ret == 1) clear_tv (rettv);
                    ret = 0;
                }
            }
            else if (evaluate) ret = get_var_tv (s, len, rettv, 1);
            else ret = 1;
        }
        if (alias != ((void *) 0)) vim_free (alias);
    }
    * arg = skipwhite (*arg);
    if (ret == 1) ret = handle_subscript (arg, rettv, evaluate, 1);
    if (ret == 1 && evaluate && end_leader > start_leader) {
        int error = 0;
        int val = 0;
        float_T f = 0.0;
        if (rettv -> v_type == 6) f = rettv -> vval.v_float;
        else val = get_tv_number_chk (rettv, &error);
        if (error) {
            clear_tv (rettv);
            ret = 0;
        }
        else {
            while (end_leader > start_leader) {
                --end_leader;
                if (*end_leader == '!') {
                    if (rettv -> v_type == 6) f = !f;
                    else val = !val;
                }
                else if (*end_leader == '-') {
                    if (rettv -> v_type == 6) f = -f;
                    else val = -val;
                }
            }
            if (rettv -> v_type == 6) {
                clear_tv (rettv);
                rettv -> vval.v_float = f;
            }
            else {
                clear_tv (rettv);
                rettv -> v_type = 1;
                rettv -> vval.v_number = val;
            }
        }
    }
    return ret;
}

static int eval_index (arg, rettv, evaluate, verbose)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
    int verbose;
{
    int empty1 = 0, empty2 = 0;
    typval_T var1, var2;
    long n1, n2 = 0;
    long len = -1;
    int range = 0;
    char_u * s;
    char_u * key = ((void *) 0);
    if (rettv -> v_type == 3 || rettv -> v_type == 6) {
        if (verbose) emsg ((char_u *) (((char *) ("E695: Cannot index a Funcref"))));
        return 0;
    }
    if (**arg == '.') {
        key = *arg + 1;
        for (len = 0; ((key [len]) < 0x7f && isalnum (key [len])) || key [len] == '_'; ++len);
        if (len == 0) return 0;
        * arg = skipwhite (key + len);
    }
    else {
        * arg = skipwhite (*arg + 1);
        if (**arg == ':') empty1 = 1;
        else if (eval1 (arg, &var1, evaluate) == 0) return 0;
        else if (evaluate && get_tv_string_chk (&var1) == ((void *) 0)) {
            clear_tv (&var1);
            return 0;
        }
        if (**arg == ':') {
            range = 1;
            * arg = skipwhite (*arg + 1);
            if (**arg == ']') empty2 = 1;
            else if (eval1 (arg, &var2, evaluate) == 0) {
                if (!empty1) clear_tv (&var1);
                return 0;
            }
            else if (evaluate && get_tv_string_chk (&var2) == ((void *) 0)) {
                if (!empty1) clear_tv (&var1);
                clear_tv (&var2);
                return 0;
            }
        }
        if (**arg != ']') {
            if (verbose) emsg ((char_u *) (((char *) (e_missbrac))));
            clear_tv (&var1);
            if (range) clear_tv (&var2);
            return 0;
        }
        * arg = skipwhite (*arg + 1);
    }
    if (evaluate) {
        n1 = 0;
        if (!empty1 && rettv -> v_type != 5) {
            n1 = get_tv_number (&var1);
            clear_tv (&var1);
        }
        if (range) {
            if (empty2) n2 = -1;
            else {
                n2 = get_tv_number (&var2);
                clear_tv (&var2);
            }
        }
        switch (rettv -> v_type) {
        case 1 :
        case 2 :
            s = get_tv_string (rettv);
            len = (long) strlen ((char *) (s));
            if (range) {
                if (n1 < 0) {
                    n1 = len + n1;
                    if (n1 < 0) n1 = 0;
                }
                if (n2 < 0) n2 = len + n2;
                else if (n2 >= len) n2 = len;
                if (n1 >= len || n2 < 0 || n1 > n2) s = ((void *) 0);
                else s = vim_strnsave (s + n1, (int) (n2 - n1 + 1));
            }
            else {
                if (n1 >= len || n1 < 0) s = ((void *) 0);
                else s = vim_strnsave (s + n1, 1);
            }
            clear_tv (rettv);
            rettv -> v_type = 2;
            rettv -> vval.v_string = s;
            break;
        case 4 :
            len = list_len (rettv -> vval.v_list);
            if (n1 < 0) n1 = len + n1;
            if (!empty1 && (n1 < 0 || n1 >= len)) {
                if (!range) {
                    if (verbose) emsgn ((char_u *) (((char *) (e_listidx))), (long) (n1));
                    return 0;
                }
                n1 = len;
            }
            if (range) {
                list_T * l;
                listitem_T * item;
                if (n2 < 0) n2 = len + n2;
                else if (n2 >= len) n2 = len - 1;
                if (!empty2 && (n2 < 0 || n2 + 1 < n1)) n2 = -1;
                l = list_alloc ();
                if (l == ((void *) 0)) return 0;
                for (item = list_find (rettv -> vval.v_list, n1); n1 <= n2; ++n1) {
                    if (list_append_tv (l, &item->li_tv) == 0) {
                        list_free (l, 1);
                        return 0;
                    }
                    item = item -> li_next;
                }
                clear_tv (rettv);
                rettv -> v_type = 4;
                rettv -> vval.v_list = l;
                ++l->lv_refcount;
            }
            else {
                copy_tv (&list_find(rettv->vval.v_list,n1)->li_tv, &var1);
                clear_tv (rettv);
                * rettv = var1;
            }
            break;
        case 5 :
            if (range) {
                if (verbose) emsg ((char_u *) (((char *) (e_dictrange))));
                if (len == -1) clear_tv (&var1);
                return 0;
            }
            {
                dictitem_T * item;
                if (len == -1) {
                    key = get_tv_string (&var1);
                    if (*key == '\000') {
                        if (verbose) emsg ((char_u *) (((char *) (e_emptykey))));
                        clear_tv (&var1);
                        return 0;
                    }
                }
                item = dict_find (rettv -> vval.v_dict, key, (int) len);
                if (item == ((void *) 0) && verbose) emsg2 ((char_u *) (((char *) (e_dictkey))), (char_u *) (key));
                if (len == -1) clear_tv (&var1);
                if (item == ((void *) 0)) return 0;
                copy_tv (&item->di_tv, &var1);
                clear_tv (rettv);
                * rettv = var1;
            }
            break;
        }
    }
    return 1;
}

static int get_option_tv (arg, rettv, evaluate)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
{
    char_u * option_end;
    long numval;
    char_u * stringval;
    int opt_type;
    int c;
    int working = (**arg == '+');
    int ret = 1;
    int opt_flags;
    option_end = find_option_end (arg, &opt_flags);
    if (option_end == ((void *) 0)) {
        if (rettv != ((void *) 0)) emsg2 ((char_u *) (((char *) ("E112: Option name missing: %s"))), (char_u *) (*arg));
        return 0;
    }
    if (!evaluate) {
        * arg = option_end;
        return 1;
    }
    c = *option_end;
    * option_end = '\000';
    opt_type = get_option_value (*arg, &numval, rettv == ((void *) 0) ? ((void *) 0) : &stringval, opt_flags);
    if (opt_type == -3) {
        if (rettv != ((void *) 0)) emsg2 ((char_u *) (((char *) ("E113: Unknown option: %s"))), (char_u *) (*arg));
        ret = 0;
    }
    else if (rettv != ((void *) 0)) {
        if (opt_type == -2) {
            rettv -> v_type = 2;
            rettv -> vval.v_string = ((void *) 0);
        }
        else if (opt_type == -1) {
            rettv -> v_type = 1;
            rettv -> vval.v_number = 0;
        }
        else if (opt_type == 1) {
            rettv -> v_type = 1;
            rettv -> vval.v_number = numval;
        }
        else {
            rettv -> v_type = 2;
            rettv -> vval.v_string = stringval;
        }
    }
    else if (working && (opt_type == -2 || opt_type == -1)) ret = 0;
    * option_end = c;
    * arg = option_end;
    return ret;
}

static int get_string_tv (arg, rettv, evaluate)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
{
    char_u * p;
    char_u * name;
    int extra = 0;
    for (p = *arg + 1; *p != '\000' && *p != '"'; ++p) {
        if (*p == '\\' && p [1] != '\000') {
            ++p;
            if (*p == '<') extra += 2;
        }
    }
    if (*p != '"') {
        emsg2 ((char_u *) (((char *) ("E114: Missing quote: %s"))), (char_u *) (*arg));
        return 0;
    }
    if (!evaluate) {
        * arg = p + 1;
        return 1;
    }
    name = alloc ((unsigned) (p - *arg + extra));
    if (name == ((void *) 0)) return 0;
    rettv -> v_type = 2;
    rettv -> vval.v_string = name;
    for (p = *arg + 1; *p != '\000' && *p != '"';) {
        if (*p == '\\') {
            switch (*++p) {
            case 'b' :
                *name++ = '\010';
                ++p;
                break;
            case 'e' :
                *name++ = '\033';
                ++p;
                break;
            case 'f' :
                *name++ = '\014';
                ++p;
                break;
            case 'n' :
                *name++ = '\012';
                ++p;
                break;
            case 'r' :
                *name++ = '\015';
                ++p;
                break;
            case 't' :
                *name++ = '\011';
                ++p;
                break;
            case 'X' :
            case 'x' :
            case 'u' :
            case 'U' :
                if (vim_isxdigit (p [1])) {
                    int n, nr;
                    int c = toupper (*p);
                    if (c == 'X') n = 2;
                    else n = 4;
                    nr = 0;
                    while (--n >= 0 && vim_isxdigit (p [1])) {
                        ++p;
                        nr = (nr << 4) + hex2nr (*p);
                    }
                    ++p;
                    *name++ = nr;
                }
                break;
            case '0' :
            case '1' :
            case '2' :
            case '3' :
            case '4' :
            case '5' :
            case '6' :
            case '7' :
                *name = *p++ - '0';
                if (*p >= '0' && *p <= '7') {
                    * name = (*name << 3) + *p++ - '0';
                    if (*p >= '0' && *p <= '7') *name = (*name << 3) + *p++ - '0';
                }
                ++name;
                break;
            case '<' :
                extra = trans_special (&p, name, 1);
                if (extra != 0) {
                    name += extra;
                    break;
                }
            default :
                *name++ = *p++;
                break;
            }
        }
        else *name++ = *p++;
    }
    * name = '\000';
    * arg = p + 1;
    return 1;
}

static int get_lit_string_tv (arg, rettv, evaluate)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
{
    char_u * p;
    char_u * str;
    int reduce = 0;
    for (p = *arg + 1; *p != '\000'; ++p) {
        if (*p == '\'') {
            if (p [1] != '\'') break;
            ++reduce;
            ++p;
        }
    }
    if (*p != '\'') {
        emsg2 ((char_u *) (((char *) ("E115: Missing quote: %s"))), (char_u *) (*arg));
        return 0;
    }
    if (!evaluate) {
        * arg = p + 1;
        return 1;
    }
    str = alloc ((unsigned) ((p - *arg) - reduce));
    if (str == ((void *) 0)) return 0;
    rettv -> v_type = 2;
    rettv -> vval.v_string = str;
    for (p = *arg + 1; *p != '\000';) {
        if (*p == '\'') {
            if (p [1] != '\'') break;
            ++p;
        }
        *str++ = *p++;
    }
    * str = '\000';
    * arg = p + 1;
    return 1;
}

static int get_list_tv (arg, rettv, evaluate)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
{
    list_T * l = ((void *) 0);
    typval_T tv;
    listitem_T * item;
    if (evaluate) {
        l = list_alloc ();
        if (l == ((void *) 0)) return 0;
    }
    * arg = skipwhite (*arg + 1);
    while (**arg != ']' && **arg != '\000') {
        if (eval1 (arg, &tv, evaluate) == 0) goto failret;
        if (evaluate) {
            item = listitem_alloc ();
            if (item != ((void *) 0)) {
                item -> li_tv = tv;
                item -> li_tv.v_lock = 0;
                list_append (l, item);
            }
            else clear_tv (&tv);
        }
        if (**arg == ']') break;
        if (**arg != ',') {
            emsg2 ((char_u *) (((char *) ("E696: Missing comma in List: %s"))), (char_u *) (*arg));
            goto failret;
        }
        * arg = skipwhite (*arg + 1);
    }
    if (**arg != ']') {
        emsg2 ((char_u *) (((char *) ("E697: Missing end of List ']': %s"))), (char_u *) (*arg));
        failret : if (evaluate) list_free (l, 1);
        return 0;
    }
    * arg = skipwhite (*arg + 1);
    if (evaluate) {
        rettv -> v_type = 4;
        rettv -> vval.v_list = l;
        ++l->lv_refcount;
    }
    return 1;
}

list_T * list_alloc () {
    list_T * l;
    l = (list_T *) alloc_clear (sizeof (list_T));
    if (l != ((void *) 0)) {
        if (first_list != ((void *) 0)) first_list -> lv_used_prev = l;
        l -> lv_used_prev = ((void *) 0);
        l -> lv_used_next = first_list;
        first_list = l;
    }
    return l;
}

static int rettv_list_alloc (rettv)
    typval_T * rettv;
{
    list_T * l = list_alloc ();
    if (l == ((void *) 0)) return 0;
    rettv -> vval.v_list = l;
    rettv -> v_type = 4;
    ++l->lv_refcount;
    return 1;
}

void list_unref (l)
    list_T * l;
{
    if (l != ((void *) 0) && --l->lv_refcount <= 0) list_free (l, 1);
}

void list_free (l, recurse)
    list_T * l;
    int recurse;
{
    listitem_T * item;
    if (l -> lv_used_prev == ((void *) 0)) first_list = l -> lv_used_next;
    else l -> lv_used_prev -> lv_used_next = l -> lv_used_next;
    if (l -> lv_used_next != ((void *) 0)) l -> lv_used_next -> lv_used_prev = l -> lv_used_prev;
    for (item = l -> lv_first; item != ((void *) 0); item = l -> lv_first) {
        l -> lv_first = item -> li_next;
        if (recurse || (item -> li_tv.v_type != 4 && item -> li_tv.v_type != 5)) clear_tv (&item->li_tv);
        vim_free (item);
    }
    vim_free (l);
}

static listitem_T * listitem_alloc () {
    return (listitem_T *) alloc (sizeof (listitem_T));
}

static void listitem_free (item)
    listitem_T * item;
{
    clear_tv (&item->li_tv);
    vim_free (item);
}

static void listitem_remove (l, item)
    list_T * l;
    listitem_T * item;
{
    list_remove (l, item, item);
    listitem_free (item);
}

static long list_len (l)
    list_T * l;
{
    if (l == ((void *) 0)) return 0L;
    return l -> lv_len;
}

static int list_equal (l1, l2, ic)
    list_T * l1;
    list_T * l2;
    int ic;
{
    listitem_T * item1, * item2;
    if (l1 == ((void *) 0) || l2 == ((void *) 0)) return 0;
    if (l1 == l2) return 1;
    if (list_len (l1) != list_len (l2)) return 0;
    for (item1 = l1 -> lv_first, item2 = l2 -> lv_first; item1 != ((void *) 0) && item2 != ((void *) 0); item1 = item1 ->
      li_next, item2 = item2 -> li_next) if (!tv_equal(&item1->li_tv, &item2->li_tv, ic)) return 0;
    return item1 == ((void *) 0) && item2 == ((void *) 0);
}

static int dict_equal (d1, d2, ic)
    dict_T * d1;
    dict_T * d2;
    int ic;
{
    hashitem_T * hi;
    dictitem_T * item2;
    int todo;
    if (d1 == ((void *) 0) || d2 == ((void *) 0)) return 0;
    if (d1 == d2) return 1;
    if (dict_len (d1) != dict_len (d2)) return 0;
    todo = (int) d1 -> dv_hashtab.ht_used;
    for (hi = d1 -> dv_hashtab.ht_array; todo > 0; ++hi) {
        if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
            item2 = dict_find (d2, hi -> hi_key, -1);
            if (item2 == ((void *) 0)) return 0;
            if (!tv_equal(&((dictitem_T*)((hi)->hi_key-(dumdi.di_key-(char_u*)&dumdi))) -> di_tv, &item2->di_tv, ic)) return 0;
            --todo;
        }
    }
    return 1;
}

static int tv_equal (tv1, tv2, ic)
    typval_T * tv1;
    typval_T * tv2;
    int ic;
{
    char_u buf1 [30], buf2 [30];
    char_u * s1, * s2;
    static int recursive = 0;
    int r;
    if (tv1 -> v_type != tv2 -> v_type) return 0;
    if (recursive >= 1000) return 1;
    switch (tv1 -> v_type) {
    case 4 :
        ++recursive;
        r = list_equal (tv1 -> vval.v_list, tv2 -> vval.v_list, ic);
        --recursive;
        return r;
    case 5 :
        ++recursive;
        r = dict_equal (tv1 -> vval.v_dict, tv2 -> vval.v_dict, ic);
        --recursive;
        return r;
    case 3 :
        return (tv1 -> vval.v_string != ((void *) 0) && tv2 -> vval.v_string != ((void *) 0) && strcmp ((char *) (tv1 -> vval.
          v_string), (char *) (tv2 -> vval.v_string)) == 0);
    case 1 :
        return tv1 -> vval.v_number == tv2 -> vval.v_number;
    case 6 :
        return tv1 -> vval.v_float == tv2 -> vval.v_float;
    case 2 :
        s1 = get_tv_string_buf (tv1, buf1);
        s2 = get_tv_string_buf (tv2, buf2);
        return ((ic ? strcasecmp ((char *) ((s1)), (char *) ((s2))) : strcmp ((char *) (s1), (char *) (s2))) == 0);
    }
    emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("tv_equal()"));
    return 1;
}

static listitem_T * list_find (l, n)
    list_T * l;
    long n;
{
    listitem_T * item;
    long idx;
    if (l == ((void *) 0)) return ((void *) 0);
    if (n < 0) n = l -> lv_len + n;
    if (n < 0 || n >= l -> lv_len) return ((void *) 0);
    if (l -> lv_idx_item != ((void *) 0)) {
        if (n < l -> lv_idx / 2) {
            item = l -> lv_first;
            idx = 0;
        }
        else if (n > (l -> lv_idx + l -> lv_len) / 2) {
            item = l -> lv_last;
            idx = l -> lv_len - 1;
        }
        else {
            item = l -> lv_idx_item;
            idx = l -> lv_idx;
        }
    }
    else {
        if (n < l -> lv_len / 2) {
            item = l -> lv_first;
            idx = 0;
        }
        else {
            item = l -> lv_last;
            idx = l -> lv_len - 1;
        }
    }
    while (n > idx) {
        item = item -> li_next;
        ++idx;
    }
    while (n < idx) {
        item = item -> li_prev;
        --idx;
    }
    l -> lv_idx = idx;
    l -> lv_idx_item = item;
    return item;
}

static long list_find_nr (l, idx, errorp)
    list_T * l;
    long idx;
    int * errorp;
{
    listitem_T * li;
    li = list_find (l, idx);
    if (li == ((void *) 0)) {
        if (errorp != ((void *) 0)) *errorp = 1;
        return -1L;
    }
    return get_tv_number_chk (&li->li_tv, errorp);
}

char_u * list_find_str (l, idx)
    list_T * l;
    long idx;
{
    listitem_T * li;
    li = list_find (l, idx - 1);
    if (li == ((void *) 0)) {
        emsgn ((char_u *) (((char *) (e_listidx))), (long) (idx));
        return ((void *) 0);
    }
    return get_tv_string (&li->li_tv);
}

static long list_idx_of_item (l, item)
    list_T * l;
    listitem_T * item;
{
    long idx = 0;
    listitem_T * li;
    if (l == ((void *) 0)) return -1;
    idx = 0;
    for (li = l -> lv_first; li != ((void *) 0) && li != item; li = li -> li_next) ++idx;
    if (li == ((void *) 0)) return -1;
    return idx;
}

static void list_append (l, item)
    list_T * l;
    listitem_T * item;
{
    if (l -> lv_last == ((void *) 0)) {
        l -> lv_first = item;
        l -> lv_last = item;
        item -> li_prev = ((void *) 0);
    }
    else {
        l -> lv_last -> li_next = item;
        item -> li_prev = l -> lv_last;
        l -> lv_last = item;
    }
    ++l->lv_len;
    item -> li_next = ((void *) 0);
}

int list_append_tv (l, tv)
    list_T * l;
    typval_T * tv;
{
    listitem_T * li = listitem_alloc ();
    if (li == ((void *) 0)) return 0;
    copy_tv (tv, &li->li_tv);
    list_append (l, li);
    return 1;
}

int list_append_dict (list, dict)
    list_T * list;
    dict_T * dict;
{
    listitem_T * li = listitem_alloc ();
    if (li == ((void *) 0)) return 0;
    li -> li_tv.v_type = 5;
    li -> li_tv.v_lock = 0;
    li -> li_tv.vval.v_dict = dict;
    list_append (list, li);
    ++dict->dv_refcount;
    return 1;
}

int list_append_string (l, str, len)
    list_T * l;
    char_u * str;
    int len;
{
    listitem_T * li = listitem_alloc ();
    if (li == ((void *) 0)) return 0;
    list_append (l, li);
    li -> li_tv.v_type = 2;
    li -> li_tv.v_lock = 0;
    if (str == ((void *) 0)) li -> li_tv.vval.v_string = ((void *) 0);
    else if ((li -> li_tv.vval.v_string = (len >= 0 ? vim_strnsave (str, len) : vim_strsave (str))) == ((void *) 0)) return 0;
    return 1;
}

static int list_append_number (l, n)
    list_T * l;
    varnumber_T n;
{
    listitem_T * li;
    li = listitem_alloc ();
    if (li == ((void *) 0)) return 0;
    li -> li_tv.v_type = 1;
    li -> li_tv.v_lock = 0;
    li -> li_tv.vval.v_number = n;
    list_append (l, li);
    return 1;
}

static int list_insert_tv (l, tv, item)
    list_T * l;
    typval_T * tv;
    listitem_T * item;
{
    listitem_T * ni = listitem_alloc ();
    if (ni == ((void *) 0)) return 0;
    copy_tv (tv, &ni->li_tv);
    if (item == ((void *) 0)) list_append (l, ni);
    else {
        ni -> li_prev = item -> li_prev;
        ni -> li_next = item;
        if (item -> li_prev == ((void *) 0)) {
            l -> lv_first = ni;
            ++l->lv_idx;
        }
        else {
            item -> li_prev -> li_next = ni;
            l -> lv_idx_item = ((void *) 0);
        }
        item -> li_prev = ni;
        ++l->lv_len;
    }
    return 1;
}

static int list_extend (l1, l2, bef)
    list_T * l1;
    list_T * l2;
    listitem_T * bef;
{
    listitem_T * item;
    int todo = l2 -> lv_len;
    for (item = l2 -> lv_first; item != ((void *) 0) && --todo >= 0; item = item -> li_next) if (list_insert_tv (l1, 
      &item->li_tv, bef) == 0) return 0;
    return 1;
}

static int list_concat (l1, l2, tv)
    list_T * l1;
    list_T * l2;
    typval_T * tv;
{
    list_T * l;
    if (l1 == ((void *) 0) || l2 == ((void *) 0)) return 0;
    l = list_copy (l1, 0, 0);
    if (l == ((void *) 0)) return 0;
    tv -> v_type = 4;
    tv -> vval.v_list = l;
    return list_extend (l, l2, ((void *) 0));
}

static list_T * list_copy (orig, deep, copyID)
    list_T * orig;
    int deep;
    int copyID;
{
    list_T * copy;
    listitem_T * item;
    listitem_T * ni;
    if (orig == ((void *) 0)) return ((void *) 0);
    copy = list_alloc ();
    if (copy != ((void *) 0)) {
        if (copyID != 0) {
            orig -> lv_copyID = copyID;
            orig -> lv_copylist = copy;
        }
        for (item = orig -> lv_first; item != ((void *) 0) && !got_int; item = item -> li_next) {
            ni = listitem_alloc ();
            if (ni == ((void *) 0)) break;
            if (deep) {
                if (item_copy (&item->li_tv, &ni->li_tv, deep, copyID) == 0) {
                    vim_free (ni);
                    break;
                }
            }
            else copy_tv (&item->li_tv, &ni->li_tv);
            list_append (copy, ni);
        }
        ++copy->lv_refcount;
        if (item != ((void *) 0)) {
            list_unref (copy);
            copy = ((void *) 0);
        }
    }
    return copy;
}

static void list_remove (l, item, item2)
    list_T * l;
    listitem_T * item;
    listitem_T * item2;
{
    listitem_T * ip;
    for (ip = item; ip != ((void *) 0); ip = ip -> li_next) {
        --l->lv_len;
        list_fix_watch (l, ip);
        if (ip == item2) break;
    }
    if (item2 -> li_next == ((void *) 0)) l -> lv_last = item -> li_prev;
    else item2 -> li_next -> li_prev = item -> li_prev;
    if (item -> li_prev == ((void *) 0)) l -> lv_first = item2 -> li_next;
    else item -> li_prev -> li_next = item2 -> li_next;
    l -> lv_idx_item = ((void *) 0);
}

static char_u * list2string (tv, copyID)
    typval_T * tv;
    int copyID;
{
    garray_T ga;
    if (tv -> vval.v_list == ((void *) 0)) return ((void *) 0);
    ga_init2 (&ga, (int) sizeof (char), 80);
    ga_append (&ga, '[');
    if (list_join (&ga, tv -> vval.v_list, (char_u *) ", ", 0, copyID) == 0) {
        vim_free (ga.ga_data);
        return ((void *) 0);
    }
    ga_append (&ga, ']');
    ga_append (&ga, '\000');
    return (char_u *) ga.ga_data;
}

static int list_join (gap, l, sep, echo, copyID)
    garray_T * gap;
    list_T * l;
    char_u * sep;
    int echo;
    int copyID;
{
    int first = 1;
    char_u * tofree;
    char_u numbuf [30];
    listitem_T * item;
    char_u * s;
    for (item = l -> lv_first; item != ((void *) 0) && !got_int; item = item -> li_next) {
        if (first) first = 0;
        else ga_concat (gap, sep);
        if (echo) s = echo_string (&item->li_tv, &tofree, numbuf, copyID);
        else s = tv2string (&item->li_tv, &tofree, numbuf, copyID);
        if (s != ((void *) 0)) ga_concat (gap, s);
        vim_free (tofree);
        if (s == ((void *) 0)) return 0;
        line_breakcheck ();
    }
    return 1;
}

int garbage_collect () {
    int copyID;
    buf_T * buf;
    win_T * wp;
    int i;
    funccall_T * fc, * * pfc;
    int did_free;
    int did_free_funccal = 0;
    tabpage_T * tp;
    want_garbage_collect = 0;
    may_garbage_collect = 0;
    garbage_collect_at_exit = 0;
    current_copyID += 2;
    copyID = current_copyID;
    for (fc = previous_funccal; fc != ((void *) 0); fc = fc -> caller) {
        set_ref_in_ht (&fc->l_vars.dv_hashtab, copyID + 1);
        set_ref_in_ht (&fc->l_avars.dv_hashtab, copyID + 1);
    }
    for (i = 1; i <= ga_scripts.ga_len; ++i) set_ref_in_ht (&((((scriptvar_T**)ga_scripts.ga_data)[(i)-1])->sv_dict.dv_hashtab)
      , copyID);
    for (buf = firstbuf; buf != ((void *) 0); buf = buf -> b_next) set_ref_in_ht (&buf->b_vars.dv_hashtab, copyID);
    for ((tp) = first_tabpage; (tp) != ((void *) 0); (tp) = (tp) -> tp_next) for ((wp) = ((tp) == curtab) ? firstwin : (tp) ->
      tp_firstwin; (wp); (wp) = (wp) -> w_next) set_ref_in_ht (&wp->w_vars.dv_hashtab, copyID);
    for (tp = first_tabpage; tp != ((void *) 0); tp = tp -> tp_next) set_ref_in_ht (&tp->tp_vars.dv_hashtab, copyID);
    set_ref_in_ht (&globvardict.dv_hashtab, copyID);
    for (fc = current_funccal; fc != ((void *) 0); fc = fc -> caller) {
        set_ref_in_ht (&fc->l_vars.dv_hashtab, copyID);
        set_ref_in_ht (&fc->l_avars.dv_hashtab, copyID);
    }
    set_ref_in_ht (&vimvardict.dv_hashtab, copyID);
    did_free = free_unref_items (copyID);
    for (pfc = &previous_funccal; *pfc != ((void *) 0);) {
        if (can_free_funccal (*pfc, copyID)) {
            fc = *pfc;
            * pfc = fc -> caller;
            free_funccal (fc, 1);
            did_free = 1;
            did_free_funccal = 1;
        }
        else pfc = &(*pfc) -> caller;
    }
    if (did_free_funccal) (void) garbage_collect ();
    return did_free;
}

static int free_unref_items (copyID)
    int copyID;
{
    dict_T * dd;
    list_T * ll;
    int did_free = 0;
    for (dd = first_dict; dd != ((void *) 0);) if ((dd -> dv_copyID & (~0x1)) != (copyID & (~0x1))) {
        dict_free (dd, 0);
        did_free = 1;
        dd = first_dict;
    }
    else dd = dd -> dv_used_next;
    for (ll = first_list; ll != ((void *) 0);) if ((ll -> lv_copyID & (~0x1)) != (copyID & (~0x1)) && ll -> lv_watch == ((void *
      ) 0)) {
        list_free (ll, 0);
        did_free = 1;
        ll = first_list;
    }
    else ll = ll -> lv_used_next;
    return did_free;
}

static void set_ref_in_ht (ht, copyID)
    hashtab_T * ht;
    int copyID;
{
    int todo;
    hashitem_T * hi;
    todo = (int) ht -> ht_used;
    for (hi = ht -> ht_array; todo > 0; ++hi) if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
        --todo;
        set_ref_in_item (&((dictitem_T*)((hi)->hi_key-(dumdi.di_key-(char_u*)&dumdi))) -> di_tv, copyID);
    }
}

static void set_ref_in_list (l, copyID)
    list_T * l;
    int copyID;
{
    listitem_T * li;
    for (li = l -> lv_first; li != ((void *) 0); li = li -> li_next) set_ref_in_item (&li->li_tv, copyID);
}

static void set_ref_in_item (tv, copyID)
    typval_T * tv;
    int copyID;
{
    dict_T * dd;
    list_T * ll;
    switch (tv -> v_type) {
    case 5 :
        dd = tv -> vval.v_dict;
        if (dd != ((void *) 0) && dd -> dv_copyID != copyID) {
            dd -> dv_copyID = copyID;
            set_ref_in_ht (&dd->dv_hashtab, copyID);
        }
        break;
    case 4 :
        ll = tv -> vval.v_list;
        if (ll != ((void *) 0) && ll -> lv_copyID != copyID) {
            ll -> lv_copyID = copyID;
            set_ref_in_list (ll, copyID);
        }
        break;
    }
    return;
}

dict_T * dict_alloc () {
    dict_T * d;
    d = (dict_T *) alloc (sizeof (dict_T));
    if (d != ((void *) 0)) {
        if (first_dict != ((void *) 0)) first_dict -> dv_used_prev = d;
        d -> dv_used_next = first_dict;
        d -> dv_used_prev = ((void *) 0);
        first_dict = d;
        hash_init (&d->dv_hashtab);
        d -> dv_lock = 0;
        d -> dv_refcount = 0;
        d -> dv_copyID = 0;
    }
    return d;
}

static int rettv_dict_alloc (rettv)
    typval_T * rettv;
{
    dict_T * d = dict_alloc ();
    if (d == ((void *) 0)) return 0;
    rettv -> vval.v_dict = d;
    rettv -> v_type = 5;
    ++d->dv_refcount;
    return 1;
}

static void dict_unref (d)
    dict_T * d;
{
    if (d != ((void *) 0) && --d->dv_refcount <= 0) dict_free (d, 1);
}

static void dict_free (d, recurse)
    dict_T * d;
    int recurse;
{
    int todo;
    hashitem_T * hi;
    dictitem_T * di;
    if (d -> dv_used_prev == ((void *) 0)) first_dict = d -> dv_used_next;
    else d -> dv_used_prev -> dv_used_next = d -> dv_used_next;
    if (d -> dv_used_next != ((void *) 0)) d -> dv_used_next -> dv_used_prev = d -> dv_used_prev;
    hash_lock (&d->dv_hashtab);
    todo = (int) d -> dv_hashtab.ht_used;
    for (hi = d -> dv_hashtab.ht_array; todo > 0; ++hi) {
        if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
            di = ((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi)));
            hash_remove (&d->dv_hashtab, hi);
            if (recurse || (di -> di_tv.v_type != 4 && di -> di_tv.v_type != 5)) clear_tv (&di->di_tv);
            vim_free (di);
            --todo;
        }
    }
    hash_clear (&d->dv_hashtab);
    vim_free (d);
}

dictitem_T * dictitem_alloc (key)
    char_u * key;
{
    dictitem_T * di;
    di = (dictitem_T *) alloc ((unsigned) (sizeof (dictitem_T) + strlen ((char *) (key))));
    if (di != ((void *) 0)) {
        ((__builtin_object_size ((char *) (di -> di_key), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (di -> di_key)
          , (char *) (key), __builtin_object_size ((char *) (di -> di_key), 1 > 1)) : __inline_strcpy_chk ((char *) (di ->
          di_key), (char *) (key)));
        di -> di_flags = 0;
    }
    return di;
}

static dictitem_T * dictitem_copy (org)
    dictitem_T * org;
{
    dictitem_T * di;
    di = (dictitem_T *) alloc ((unsigned) (sizeof (dictitem_T) + strlen ((char *) (org -> di_key))));
    if (di != ((void *) 0)) {
        ((__builtin_object_size ((char *) (di -> di_key), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (di -> di_key)
          , (char *) (org -> di_key), __builtin_object_size ((char *) (di -> di_key), 1 > 1)) : __inline_strcpy_chk ((char *) (
          di -> di_key), (char *) (org -> di_key)));
        di -> di_flags = 0;
        copy_tv (&org->di_tv, &di->di_tv);
    }
    return di;
}

static void dictitem_remove (dict, item)
    dict_T * dict;
    dictitem_T * item;
{
    hashitem_T * hi;
    hi = hash_find (&dict->dv_hashtab, item -> di_key);
    if (((hi) -> hi_key == ((void *) 0) || (hi) -> hi_key == &hash_removed)) emsg2 ((char_u *) (((char *) (e_intern2))), (
      char_u *) ("dictitem_remove()"));
    else hash_remove (&dict->dv_hashtab, hi);
    dictitem_free (item);
}

void dictitem_free (item)
    dictitem_T * item;
{
    clear_tv (&item->di_tv);
    vim_free (item);
}

static dict_T * dict_copy (orig, deep, copyID)
    dict_T * orig;
    int deep;
    int copyID;
{
    dict_T * copy;
    dictitem_T * di;
    int todo;
    hashitem_T * hi;
    if (orig == ((void *) 0)) return ((void *) 0);
    copy = dict_alloc ();
    if (copy != ((void *) 0)) {
        if (copyID != 0) {
            orig -> dv_copyID = copyID;
            orig -> dv_copydict = copy;
        }
        todo = (int) orig -> dv_hashtab.ht_used;
        for (hi = orig -> dv_hashtab.ht_array; todo > 0 && !got_int; ++hi) {
            if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
                --todo;
                di = dictitem_alloc (hi -> hi_key);
                if (di == ((void *) 0)) break;
                if (deep) {
                    if (item_copy (&((dictitem_T*)((hi)->hi_key-(dumdi.di_key-(char_u*)&dumdi))) -> di_tv, &di->di_tv, deep,
                      copyID) == 0) {
                        vim_free (di);
                        break;
                    }
                }
                else copy_tv (&((dictitem_T*)((hi)->hi_key-(dumdi.di_key-(char_u*)&dumdi))) -> di_tv, &di->di_tv);
                if (dict_add (copy, di) == 0) {
                    dictitem_free (di);
                    break;
                }
            }
        }
        ++copy->dv_refcount;
        if (todo > 0) {
            dict_unref (copy);
            copy = ((void *) 0);
        }
    }
    return copy;
}

int dict_add (d, item)
    dict_T * d;
    dictitem_T * item;
{
    return hash_add (&d->dv_hashtab, item -> di_key);
}

int dict_add_nr_str (d, key, nr, str)
    dict_T * d;
    char * key;
    long nr;
    char_u * str;
{
    dictitem_T * item;
    item = dictitem_alloc ((char_u *) key);
    if (item == ((void *) 0)) return 0;
    item -> di_tv.v_lock = 0;
    if (str == ((void *) 0)) {
        item -> di_tv.v_type = 1;
        item -> di_tv.vval.v_number = nr;
    }
    else {
        item -> di_tv.v_type = 2;
        item -> di_tv.vval.v_string = vim_strsave (str);
    }
    if (dict_add (d, item) == 0) {
        dictitem_free (item);
        return 0;
    }
    return 1;
}

int dict_add_list (d, key, list)
    dict_T * d;
    char * key;
    list_T * list;
{
    dictitem_T * item;
    item = dictitem_alloc ((char_u *) key);
    if (item == ((void *) 0)) return 0;
    item -> di_tv.v_lock = 0;
    item -> di_tv.v_type = 4;
    item -> di_tv.vval.v_list = list;
    if (dict_add (d, item) == 0) {
        dictitem_free (item);
        return 0;
    }
    return 1;
}

static long dict_len (d)
    dict_T * d;
{
    if (d == ((void *) 0)) return 0L;
    return (long) d -> dv_hashtab.ht_used;
}

dictitem_T * dict_find (d, key, len)
    dict_T * d;
    char_u * key;
    int len;
{
    char_u buf [200];
    char_u * akey;
    char_u * tofree = ((void *) 0);
    hashitem_T * hi;
    if (len < 0) akey = key;
    else if (len >= 200) {
        tofree = akey = vim_strnsave (key, len);
        if (akey == ((void *) 0)) return ((void *) 0);
    }
    else {
        vim_strncpy (buf, key, len);
        akey = buf;
    }
    hi = hash_find (&d->dv_hashtab, akey);
    vim_free (tofree);
    if (((hi) -> hi_key == ((void *) 0) || (hi) -> hi_key == &hash_removed)) return ((void *) 0);
    return ((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi)));
}

char_u * get_dict_string (d, key, save)
    dict_T * d;
    char_u * key;
    int save;
{
    dictitem_T * di;
    char_u * s;
    di = dict_find (d, key, -1);
    if (di == ((void *) 0)) return ((void *) 0);
    s = get_tv_string (&di->di_tv);
    if (save && s != ((void *) 0)) s = vim_strsave (s);
    return s;
}

long get_dict_number (d, key)
    dict_T * d;
    char_u * key;
{
    dictitem_T * di;
    di = dict_find (d, key, -1);
    if (di == ((void *) 0)) return 0;
    return get_tv_number (&di->di_tv);
}

static char_u * dict2string (tv, copyID)
    typval_T * tv;
    int copyID;
{
    garray_T ga;
    int first = 1;
    char_u * tofree;
    char_u numbuf [30];
    hashitem_T * hi;
    char_u * s;
    dict_T * d;
    int todo;
    if ((d = tv -> vval.v_dict) == ((void *) 0)) return ((void *) 0);
    ga_init2 (&ga, (int) sizeof (char), 80);
    ga_append (&ga, '{');
    todo = (int) d -> dv_hashtab.ht_used;
    for (hi = d -> dv_hashtab.ht_array; todo > 0 && !got_int; ++hi) {
        if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
            --todo;
            if (first) first = 0;
            else ga_concat (&ga, (char_u *) ", ");
            tofree = string_quote (hi -> hi_key, 0);
            if (tofree != ((void *) 0)) {
                ga_concat (&ga, tofree);
                vim_free (tofree);
            }
            ga_concat (&ga, (char_u *) ": ");
            s = tv2string (&((dictitem_T*)((hi)->hi_key-(dumdi.di_key-(char_u*)&dumdi))) -> di_tv, &tofree, numbuf, copyID);
            if (s != ((void *) 0)) ga_concat (&ga, s);
            vim_free (tofree);
            if (s == ((void *) 0)) break;
        }
    }
    if (todo > 0) {
        vim_free (ga.ga_data);
        return ((void *) 0);
    }
    ga_append (&ga, '}');
    ga_append (&ga, '\000');
    return (char_u *) ga.ga_data;
}

static int get_dict_tv (arg, rettv, evaluate)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
{
    dict_T * d = ((void *) 0);
    typval_T tvkey;
    typval_T tv;
    char_u * key = ((void *) 0);
    dictitem_T * item;
    char_u * start = skipwhite (*arg + 1);
    char_u buf [30];
    if (*start != '}') {
        if (eval1 (&start, &tv, 0) == 0) return 0;
        if (*start == '}') return 2;
    }
    if (evaluate) {
        d = dict_alloc ();
        if (d == ((void *) 0)) return 0;
    }
    tvkey.v_type = 0;
    tv.v_type = 0;
    * arg = skipwhite (*arg + 1);
    while (**arg != '}' && **arg != '\000') {
        if (eval1 (arg, &tvkey, evaluate) == 0) goto failret;
        if (**arg != ':') {
            emsg2 ((char_u *) (((char *) ("E720: Missing colon in Dictionary: %s"))), (char_u *) (*arg));
            clear_tv (&tvkey);
            goto failret;
        }
        if (evaluate) {
            key = get_tv_string_buf_chk (&tvkey, buf);
            if (key == ((void *) 0) || *key == '\000') {
                if (key != ((void *) 0)) emsg ((char_u *) (((char *) (e_emptykey))));
                clear_tv (&tvkey);
                goto failret;
            }
        }
        * arg = skipwhite (*arg + 1);
        if (eval1 (arg, &tv, evaluate) == 0) {
            if (evaluate) clear_tv (&tvkey);
            goto failret;
        }
        if (evaluate) {
            item = dict_find (d, key, -1);
            if (item != ((void *) 0)) {
                emsg2 ((char_u *) (((char *) ("E721: Duplicate key in Dictionary: \"%s\""))), (char_u *) (key));
                clear_tv (&tvkey);
                clear_tv (&tv);
                goto failret;
            }
            item = dictitem_alloc (key);
            clear_tv (&tvkey);
            if (item != ((void *) 0)) {
                item -> di_tv = tv;
                item -> di_tv.v_lock = 0;
                if (dict_add (d, item) == 0) dictitem_free (item);
            }
        }
        if (**arg == '}') break;
        if (**arg != ',') {
            emsg2 ((char_u *) (((char *) ("E722: Missing comma in Dictionary: %s"))), (char_u *) (*arg));
            goto failret;
        }
        * arg = skipwhite (*arg + 1);
    }
    if (**arg != '}') {
        emsg2 ((char_u *) (((char *) ("E723: Missing end of Dictionary '}': %s"))), (char_u *) (*arg));
        failret : if (evaluate) dict_free (d, 1);
        return 0;
    }
    * arg = skipwhite (*arg + 1);
    if (evaluate) {
        rettv -> v_type = 5;
        rettv -> vval.v_dict = d;
        ++d->dv_refcount;
    }
    return 1;
}

static char_u * echo_string (tv, tofree, numbuf, copyID)
    typval_T * tv;
    char_u * * tofree;
    char_u * numbuf;
    int copyID;
{
    static int recurse = 0;
    char_u * r = ((void *) 0);
    if (recurse >= 100) {
        emsg ((char_u *) (((char *) ("E724: variable nested too deep for displaying"))));
        * tofree = ((void *) 0);
        return ((void *) 0);
    }
    ++recurse;
    switch (tv -> v_type) {
    case 3 :
        *tofree = ((void *) 0);
        r = tv -> vval.v_string;
        break;
    case 4 :
        if (tv -> vval.v_list == ((void *) 0)) {
            * tofree = ((void *) 0);
            r = ((void *) 0);
        }
        else if (copyID != 0 && tv -> vval.v_list -> lv_copyID == copyID) {
            * tofree = ((void *) 0);
            r = (char_u *) "[...]";
        }
        else {
            tv -> vval.v_list -> lv_copyID = copyID;
            * tofree = list2string (tv, copyID);
            r = *tofree;
        }
        break;
    case 5 :
        if (tv -> vval.v_dict == ((void *) 0)) {
            * tofree = ((void *) 0);
            r = ((void *) 0);
        }
        else if (copyID != 0 && tv -> vval.v_dict -> dv_copyID == copyID) {
            * tofree = ((void *) 0);
            r = (char_u *) "{...}";
        }
        else {
            tv -> vval.v_dict -> dv_copyID = copyID;
            * tofree = dict2string (tv, copyID);
            r = *tofree;
        }
        break;
    case 2 :
    case 1 :
        *tofree = ((void *) 0);
        r = get_tv_string_buf (tv, numbuf);
        break;
    case 6 :
        *tofree = ((void *) 0);
        vim_snprintf ((char *) numbuf, 30, "%g", tv -> vval.v_float);
        r = numbuf;
        break;
    default :
        emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("echo_string()"));
        * tofree = ((void *) 0);
    }
    --recurse;
    return r;
}

static char_u * tv2string (tv, tofree, numbuf, copyID)
    typval_T * tv;
    char_u * * tofree;
    char_u * numbuf;
    int copyID;
{
    switch (tv -> v_type) {
    case 3 :
        *tofree = string_quote (tv -> vval.v_string, 1);
        return *tofree;
    case 2 :
        *tofree = string_quote (tv -> vval.v_string, 0);
        return *tofree;
    case 6 :
        *tofree = ((void *) 0);
        vim_snprintf ((char *) numbuf, 30 - 1, "%g", tv -> vval.v_float);
        return numbuf;
    case 1 :
    case 4 :
    case 5 :
        break;
    default :
        emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("tv2string()"));
    }
    return echo_string (tv, tofree, numbuf, copyID);
}

static char_u * string_quote (str, function)
    char_u * str;
    int function;
{
    unsigned len;
    char_u * p, * r, * s;
    len = (function ? 13 : 3);
    if (str != ((void *) 0)) {
        len += (unsigned) strlen ((char *) (str));
        for (p = str; *p != '\000'; ++p) if (*p == '\'') ++len;
    }
    s = r = alloc (len);
    if (r != ((void *) 0)) {
        if (function) {
            ((__builtin_object_size ((char *) (r), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (r), (char *) (
              "function('"), __builtin_object_size ((char *) (r), 1 > 1)) : __inline_strcpy_chk ((char *) (r), (char *) (
              "function('")));
            r += 10;
        }
        else *r++ = '\'';
        if (str != ((void *) 0)) for (p = str; *p != '\000';) {
            if (*p == '\'') *r++ = '\'';
            *r++ = *p++;
        }
        *r++ = '\'';
        if (function) *r++ = ')';
        *r++ = '\000';
    }
    return s;
}

static int string2float (text, value)
    char_u * text;
    float_T * value;
{
    char * s = (char *) text;
    float_T f;
    f = strtod (s, &s);
    * value = f;
    return (int) ((char_u *) s - text);
}

static int get_env_tv (arg, rettv, evaluate)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
{
    char_u * string = ((void *) 0);
    int len;
    int cc;
    char_u * name;
    int mustfree = 0;
    ++*arg;
    name = *arg;
    len = get_env_len (arg);
    if (evaluate) {
        if (len != 0) {
            cc = name [len];
            name [len] = '\000';
            string = vim_getenv (name, &mustfree);
            if (string != ((void *) 0) && *string != '\000') {
                if (!mustfree) string = vim_strsave (string);
            }
            else {
                if (mustfree) vim_free (string);
                string = expand_env_save (name - 1);
                if (string != ((void *) 0) && *string == '$') {
                    vim_free (string);
                    string = ((void *) 0);
                }
            }
            name [len] = cc;
        }
        rettv -> v_type = 2;
        rettv -> vval.v_string = string;
    }
    return 1;
}

static struct fst {
    char * f_name;
    char f_min_argc;
    char f_max_argc;
    void (* f_func) (typval_T * args, typval_T * rvar);
} functions [] =
{
    {"abs", 1, 1, f_abs},
    {"acos", 1, 1, f_acos},
    {"add", 2, 2, f_add},
    {"append", 2, 2, f_append},
    {"argc", 0, 0, f_argc},
    {"argidx", 0, 0, f_argidx},
    {"argv", 0, 1, f_argv},
    {"asin", 1, 1, f_asin},
    {"atan", 1, 1, f_atan},
    {"atan2", 2, 2, f_atan2},
    {"browse", 4, 4, f_browse},
    {"browsedir", 2, 2, f_browsedir},
    {"bufexists", 1, 1, f_bufexists},
    {"buffer_exists", 1, 1, f_bufexists},
    {"buffer_name", 1, 1, f_bufname},
    {"buffer_number", 1, 1, f_bufnr},
    {"buflisted", 1, 1, f_buflisted},
    {"bufloaded", 1, 1, f_bufloaded},
    {"bufname", 1, 1, f_bufname},
    {"bufnr", 1, 2, f_bufnr},
    {"bufwinnr", 1, 1, f_bufwinnr},
    {"byte2line", 1, 1, f_byte2line},
    {"byteidx", 2, 2, f_byteidx},
    {"call", 2, 3, f_call},
    {"ceil", 1, 1, f_ceil},
    {"changenr", 0, 0, f_changenr},
    {"char2nr", 1, 1, f_char2nr},
    {"cindent", 1, 1, f_cindent},
    {"clearmatches", 0, 0, f_clearmatches},
    {"col", 1, 1, f_col},
    {"complete", 2, 2, f_complete},
    {"complete_add", 1, 1, f_complete_add},
    {"complete_check", 0, 0, f_complete_check},
    {"confirm", 1, 4, f_confirm},
    {"copy", 1, 1, f_copy},
    {"cos", 1, 1, f_cos},
    {"cosh", 1, 1, f_cosh},
    {"count", 2, 4, f_count},
    {"cscope_connection", 0, 3, f_cscope_connection},
    {"cursor", 1, 3, f_cursor},
    {"deepcopy", 1, 2, f_deepcopy},
    {"delete", 1, 1, f_delete},
    {"did_filetype", 0, 0, f_did_filetype},
    {"diff_filler", 1, 1, f_diff_filler},
    {"diff_hlID", 2, 2, f_diff_hlID},
    {"empty", 1, 1, f_empty},
    {"escape", 2, 2, f_escape},
    {"eval", 1, 1, f_eval},
    {"eventhandler", 0, 0, f_eventhandler},
    {"executable", 1, 1, f_executable},
    {"exists", 1, 1, f_exists},
    {"exp", 1, 1, f_exp},
    {"expand", 1, 2, f_expand},
    {"extend", 2, 3, f_extend},
    {"feedkeys", 1, 2, f_feedkeys},
    {"file_readable", 1, 1, f_filereadable},
    {"filereadable", 1, 1, f_filereadable},
    {"filewritable", 1, 1, f_filewritable},
    {"filter", 2, 2, f_filter},
    {"finddir", 1, 3, f_finddir},
    {"findfile", 1, 3, f_findfile},
    {"float2nr", 1, 1, f_float2nr},
    {"floor", 1, 1, f_floor},
    {"fmod", 2, 2, f_fmod},
    {"fnameescape", 1, 1, f_fnameescape},
    {"fnamemodify", 2, 2, f_fnamemodify},
    {"foldclosed", 1, 1, f_foldclosed},
    {"foldclosedend", 1, 1, f_foldclosedend},
    {"foldlevel", 1, 1, f_foldlevel},
    {"foldtext", 0, 0, f_foldtext},
    {"foldtextresult", 1, 1, f_foldtextresult},
    {"foreground", 0, 0, f_foreground},
    {"function", 1, 1, f_function},
    {"garbagecollect", 0, 1, f_garbagecollect},
    {"get", 2, 3, f_get},
    {"getbufline", 2, 3, f_getbufline},
    {"getbufvar", 2, 2, f_getbufvar},
    {"getchar", 0, 1, f_getchar},
    {"getcharmod", 0, 0, f_getcharmod},
    {"getcmdline", 0, 0, f_getcmdline},
    {"getcmdpos", 0, 0, f_getcmdpos},
    {"getcmdtype", 0, 0, f_getcmdtype},
    {"getcwd", 0, 0, f_getcwd},
    {"getfontname", 0, 1, f_getfontname},
    {"getfperm", 1, 1, f_getfperm},
    {"getfsize", 1, 1, f_getfsize},
    {"getftime", 1, 1, f_getftime},
    {"getftype", 1, 1, f_getftype},
    {"getline", 1, 2, f_getline},
    {"getloclist", 1, 1, f_getqflist},
    {"getmatches", 0, 0, f_getmatches},
    {"getpid", 0, 0, f_getpid},
    {"getpos", 1, 1, f_getpos},
    {"getqflist", 0, 0, f_getqflist},
    {"getreg", 0, 2, f_getreg},
    {"getregtype", 0, 1, f_getregtype},
    {"gettabvar", 2, 2, f_gettabvar},
    {"gettabwinvar", 3, 3, f_gettabwinvar},
    {"getwinposx", 0, 0, f_getwinposx},
    {"getwinposy", 0, 0, f_getwinposy},
    {"getwinvar", 2, 2, f_getwinvar},
    {"glob", 1, 2, f_glob},
    {"globpath", 2, 3, f_globpath},
    {"has", 1, 1, f_has},
    {"has_key", 2, 2, f_has_key},
    {"haslocaldir", 0, 0, f_haslocaldir},
    {"hasmapto", 1, 3, f_hasmapto},
    {"highlightID", 1, 1, f_hlID},
    {"highlight_exists", 1, 1, f_hlexists},
    {"histadd", 2, 2, f_histadd},
    {"histdel", 1, 2, f_histdel},
    {"histget", 1, 2, f_histget},
    {"histnr", 1, 1, f_histnr},
    {"hlID", 1, 1, f_hlID},
    {"hlexists", 1, 1, f_hlexists},
    {"hostname", 0, 0, f_hostname},
    {"iconv", 3, 3, f_iconv},
    {"indent", 1, 1, f_indent},
    {"index", 2, 4, f_index},
    {"input", 1, 3, f_input},
    {"inputdialog", 1, 3, f_inputdialog},
    {"inputlist", 1, 1, f_inputlist},
    {"inputrestore", 0, 0, f_inputrestore},
    {"inputsave", 0, 0, f_inputsave},
    {"inputsecret", 1, 2, f_inputsecret},
    {"insert", 2, 3, f_insert},
    {"isdirectory", 1, 1, f_isdirectory},
    {"islocked", 1, 1, f_islocked},
    {"items", 1, 1, f_items},
    {"join", 1, 2, f_join},
    {"keys", 1, 1, f_keys},
    {"last_buffer_nr", 0, 0, f_last_buffer_nr},
    {"len", 1, 1, f_len},
    {"libcall", 3, 3, f_libcall},
    {"libcallnr", 3, 3, f_libcallnr},
    {"line", 1, 1, f_line},
    {"line2byte", 1, 1, f_line2byte},
    {"lispindent", 1, 1, f_lispindent},
    {"localtime", 0, 0, f_localtime},
    {"log", 1, 1, f_log},
    {"log10", 1, 1, f_log10},
    {"map", 2, 2, f_map},
    {"maparg", 1, 3, f_maparg},
    {"mapcheck", 1, 3, f_mapcheck},
    {"match", 2, 4, f_match},
    {"matchadd", 2, 4, f_matchadd},
    {"matcharg", 1, 1, f_matcharg},
    {"matchdelete", 1, 1, f_matchdelete},
    {"matchend", 2, 4, f_matchend},
    {"matchlist", 2, 4, f_matchlist},
    {"matchstr", 2, 4, f_matchstr},
    {"max", 1, 1, f_max},
    {"min", 1, 1, f_min},
    {"mkdir", 1, 3, f_mkdir},
    {"mode", 0, 1, f_mode},
    {"nextnonblank", 1, 1, f_nextnonblank},
    {"nr2char", 1, 1, f_nr2char},
    {"pathshorten", 1, 1, f_pathshorten},
    {"pow", 2, 2, f_pow},
    {"prevnonblank", 1, 1, f_prevnonblank},
    {"printf", 2, 19, f_printf},
    {"pumvisible", 0, 0, f_pumvisible},
    {"range", 1, 3, f_range},
    {"readfile", 1, 3, f_readfile},
    {"reltime", 0, 2, f_reltime},
    {"reltimestr", 1, 1, f_reltimestr},
    {"remote_expr", 2, 3, f_remote_expr},
    {"remote_foreground", 1, 1, f_remote_foreground},
    {"remote_peek", 1, 2, f_remote_peek},
    {"remote_read", 1, 1, f_remote_read},
    {"remote_send", 2, 3, f_remote_send},
    {"remove", 2, 3, f_remove},
    {"rename", 2, 2, f_rename},
    {"repeat", 2, 2, f_repeat},
    {"resolve", 1, 1, f_resolve},
    {"reverse", 1, 1, f_reverse},
    {"round", 1, 1, f_round},
    {"search", 1, 4, f_search},
    {"searchdecl", 1, 3, f_searchdecl},
    {"searchpair", 3, 7, f_searchpair},
    {"searchpairpos", 3, 7, f_searchpairpos},
    {"searchpos", 1, 4, f_searchpos},
    {"server2client", 2, 2, f_server2client},
    {"serverlist", 0, 0, f_serverlist},
    {"setbufvar", 3, 3, f_setbufvar},
    {"setcmdpos", 1, 1, f_setcmdpos},
    {"setline", 2, 2, f_setline},
    {"setloclist", 2, 3, f_setloclist},
    {"setmatches", 1, 1, f_setmatches},
    {"setpos", 2, 2, f_setpos},
    {"setqflist", 1, 2, f_setqflist},
    {"setreg", 2, 3, f_setreg},
    {"settabvar", 3, 3, f_settabvar},
    {"settabwinvar", 4, 4, f_settabwinvar},
    {"setwinvar", 3, 3, f_setwinvar},
    {"shellescape", 1, 2, f_shellescape},
    {"simplify", 1, 1, f_simplify},
    {"sin", 1, 1, f_sin},
    {"sinh", 1, 1, f_sinh},
    {"sort", 1, 2, f_sort},
    {"soundfold", 1, 1, f_soundfold},
    {"spellbadword", 0, 1, f_spellbadword},
    {"spellsuggest", 1, 3, f_spellsuggest},
    {"split", 1, 3, f_split},
    {"sqrt", 1, 1, f_sqrt},
    {"str2float", 1, 1, f_str2float},
    {"str2nr", 1, 2, f_str2nr},
    {"strchars", 1, 1, f_strchars},
    {"strdisplaywidth", 1, 2, f_strdisplaywidth},
    {"strftime", 1, 2, f_strftime},
    {"stridx", 2, 3, f_stridx},
    {"string", 1, 1, f_string},
    {"strlen", 1, 1, f_strlen},
    {"strpart", 2, 3, f_strpart},
    {"strridx", 2, 3, f_strridx},
    {"strtrans", 1, 1, f_strtrans},
    {"strwidth", 1, 1, f_strwidth},
    {"submatch", 1, 1, f_submatch},
    {"substitute", 4, 4, f_substitute},
    {"synID", 3, 3, f_synID},
    {"synIDattr", 2, 3, f_synIDattr},
    {"synIDtrans", 1, 1, f_synIDtrans},
    {"synconcealed", 2, 2, f_synconcealed},
    {"synstack", 2, 2, f_synstack},
    {"system", 1, 2, f_system},
    {"tabpagebuflist", 0, 1, f_tabpagebuflist},
    {"tabpagenr", 0, 1, f_tabpagenr},
    {"tabpagewinnr", 1, 2, f_tabpagewinnr},
    {"tagfiles", 0, 0, f_tagfiles},
    {"taglist", 1, 1, f_taglist},
    {"tan", 1, 1, f_tan},
    {"tanh", 1, 1, f_tanh},
    {"tempname", 0, 0, f_tempname},
    {"test", 1, 1, f_test},
    {"tolower", 1, 1, f_tolower},
    {"toupper", 1, 1, f_toupper},
    {"tr", 3, 3, f_tr},
    {"trunc", 1, 1, f_trunc},
    {"type", 1, 1, f_type},
    {"undofile", 1, 1, f_undofile},
    {"undotree", 0, 0, f_undotree},
    {"values", 1, 1, f_values},
    {"virtcol", 1, 1, f_virtcol},
    {"visualmode", 0, 1, f_visualmode},
    {"winbufnr", 1, 1, f_winbufnr},
    {"wincol", 0, 0, f_wincol},
    {"winheight", 1, 1, f_winheight},
    {"winline", 0, 0, f_winline},
    {"winnr", 0, 1, f_winnr},
    {"winrestcmd", 0, 0, f_winrestcmd},
    {"winrestview", 1, 1, f_winrestview},
    {"winsaveview", 0, 0, f_winsaveview},
    {"winwidth", 1, 1, f_winwidth},
    {"writefile", 2, 3, f_writefile},};

char_u * get_function_name (xp, idx)
    expand_T * xp;
    int idx;
{
    static int intidx = -1;
    char_u * name;
    if (idx == 0) intidx = -1;
    if (intidx < 0) {
        name = get_user_func_name (xp, idx);
        if (name != ((void *) 0)) return name;
    }
    if (++intidx < (int) (sizeof (functions) / sizeof (struct fst))) {
        ((__builtin_object_size ((char *) (IObuff), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (IObuff), (char *) (
          functions [intidx].f_name), __builtin_object_size ((char *) (IObuff), 1 > 1)) : __inline_strcpy_chk ((char *) (IObuff
          ), (char *) (functions [intidx].f_name)));
        ((__builtin_object_size ((char *) (IObuff), 0) != (size_t) - 1) ? __builtin___strcat_chk ((char *) (IObuff), (char *) (
          "("), __builtin_object_size ((char *) (IObuff), 1 > 1)) : __inline_strcat_chk ((char *) (IObuff), (char *) ("(")));
        if (functions [intidx].f_max_argc == 0) ((__builtin_object_size ((char *) (IObuff), 0) != (size_t) - 1) ?
          __builtin___strcat_chk ((char *) (IObuff), (char *) (")"), __builtin_object_size ((char *) (IObuff), 1 > 1)) :
          __inline_strcat_chk ((char *) (IObuff), (char *) (")")));
        return IObuff;
    }
    return ((void *) 0);
}

char_u * get_expr_name (xp, idx)
    expand_T * xp;
    int idx;
{
    static int intidx = -1;
    char_u * name;
    if (idx == 0) intidx = -1;
    if (intidx < 0) {
        name = get_function_name (xp, idx);
        if (name != ((void *) 0)) return name;
    }
    return get_user_var_name (xp, ++intidx);
}

static int find_internal_func (name)
    char_u * name;
{
    int first = 0;
    int last = (int) (sizeof (functions) / sizeof (struct fst)) - 1;
    int cmp;
    int x;
    while (first <= last) {
        x = first + ((unsigned) (last - first) >> 1);
        cmp = strcmp ((char *) (name), (char *) (functions [x].f_name));
        if (cmp < 0) last = x - 1;
        else if (cmp > 0) first = x + 1;
        else return x;
    }
    return -1;
}

static char_u * deref_func_name (name, lenp)
    char_u * name;
    int * lenp;
{
    dictitem_T * v;
    int cc;
    cc = name [*lenp];
    name [*lenp] = '\000';
    v = find_var (name, ((void *) 0));
    name [*lenp] = cc;
    if (v != ((void *) 0) && v -> di_tv.v_type == 3) {
        if (v -> di_tv.vval.v_string == ((void *) 0)) {
            * lenp = 0;
            return (char_u *) "";
        }
        * lenp = (int) strlen ((char *) (v -> di_tv.vval.v_string));
        return v -> di_tv.vval.v_string;
    }
    return name;
}

static int get_func_tv (name, len, rettv, arg, firstline, lastline, doesrange, evaluate, selfdict)
    char_u * name;
    int len;
    typval_T * rettv;
    char_u * * arg;
    linenr_T firstline;
    linenr_T lastline;
    int * doesrange;
    int evaluate;
    dict_T * selfdict;
{
    char_u * argp;
    int ret = 1;
    typval_T argvars [20 + 1];
    int argcount = 0;
    argp = *arg;
    while (argcount < 20) {
        argp = skipwhite (argp + 1);
        if (*argp == ')' || *argp == ',' || *argp == '\000') break;
        if (eval1 (&argp, &argvars[argcount], evaluate) == 0) {
            ret = 0;
            break;
        }
        ++argcount;
        if (*argp != ',') break;
    }
    if (*argp == ')') ++argp;
    else ret = 0;
    if (ret == 1) ret = call_func (name, len, rettv, argcount, argvars, firstline, lastline, doesrange, evaluate, selfdict);
    else if (!aborting()) {
        if (argcount == 20) emsg_funcname ("E740: Too many arguments for function %s", name);
        else emsg_funcname ("E116: Invalid arguments for function %s", name);
    }
    while (--argcount >= 0) clear_tv (&argvars[argcount]);
    * arg = skipwhite (argp);
    return ret;
}

static int call_func (funcname, len, rettv, argcount, argvars, firstline, lastline, doesrange, evaluate, selfdict)
    char_u * funcname;
    int len;
    typval_T * rettv;
    int argcount;
    typval_T * argvars;
    linenr_T firstline;
    linenr_T lastline;
    int * doesrange;
    int evaluate;
    dict_T * selfdict;
{
    int ret = 0;
    int error = 5;
    int i;
    int llen;
    ufunc_T * fp;
    char_u fname_buf [40 + 1];
    char_u * fname;
    char_u * name;
    name = vim_strnsave (funcname, len);
    if (name == ((void *) 0)) return ret;
    llen = eval_fname_script (name);
    if (llen > 0) {
        fname_buf [0] = (0x80);
        fname_buf [1] = 253;
        fname_buf [2] = (int) KE_SNR;
        i = 3;
        if (eval_fname_sid (name)) {
            if (current_SID <= 0) error = 3;
            else {
                __builtin___sprintf_chk ((char *) fname_buf + 3, 0, __builtin_object_size ((char *) fname_buf + 3, 1 > 1),
                  "%ld_", (long) current_SID);
                i = (int) strlen ((char *) (fname_buf));
            }
        }
        if (i + strlen ((char *) (name + llen)) < 40) {
            ((__builtin_object_size ((char *) (fname_buf + i), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (
              fname_buf + i), (char *) (name + llen), __builtin_object_size ((char *) (fname_buf + i), 1 > 1)) :
              __inline_strcpy_chk ((char *) (fname_buf + i), (char *) (name + llen)));
            fname = fname_buf;
        }
        else {
            fname = alloc ((unsigned) (i + strlen ((char *) (name + llen)) + 1));
            if (fname == ((void *) 0)) error = 6;
            else {
                ((__builtin_object_size ((char *) (fname), 0) != (size_t) - 1) ? __builtin___memmove_chk ((char *) (fname), (
                  char *) (fname_buf), (size_t) i, __builtin_object_size ((char *) (fname), 0)) : __inline_memmove_chk ((char *
                  ) (fname), (char *) (fname_buf), (size_t) i));
                ((__builtin_object_size ((char *) (fname + i), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (fname + i
                  ), (char *) (name + llen), __builtin_object_size ((char *) (fname + i), 1 > 1)) : __inline_strcpy_chk ((char *
                  ) (fname + i), (char *) (name + llen)));
            }
        }
    }
    else fname = name;
    * doesrange = 0;
    if (evaluate && error == 5) {
        rettv -> v_type = 1;
        rettv -> vval.v_number = 0;
        error = 0;
        if (!builtin_function(fname)) {
            fp = find_func (fname);
            if (fp == ((void *) 0) && apply_autocmds (EVENT_FUNCUNDEFINED, fname, fname, 1, ((void *) 0)) && !aborting()) {
                fp = find_func (fname);
            }
            if (fp == ((void *) 0) && script_autoload (fname, 1) && !aborting()) {
                fp = find_func (fname);
            }
            if (fp != ((void *) 0)) {
                if (fp -> uf_flags & 2) *doesrange = 1;
                if (argcount < fp -> uf_args.ga_len) error = 2;
                else if (!fp->uf_varargs && argcount > fp -> uf_args.ga_len) error = 1;
                else if ((fp -> uf_flags & 4) && selfdict == ((void *) 0)) error = 4;
                else {
                    save_search_patterns ();
                    saveRedobuff ();
                    ++fp->uf_calls;
                    call_user_func (fp, argcount, argvars, rettv, firstline, lastline, (fp -> uf_flags & 4) ? selfdict : ((void
                      *) 0));
                    if (--fp->uf_calls <= 0 && isdigit (*fp->uf_name) && fp -> uf_refcount <= 0) func_free (fp);
                    restoreRedobuff ();
                    restore_search_patterns ();
                    error = 5;
                }
            }
        }
        else {
            i = find_internal_func (fname);
            if (i >= 0) {
                if (argcount < functions [i].f_min_argc) error = 2;
                else if (argcount > functions [i].f_max_argc) error = 1;
                else {
                    argvars [argcount].v_type = 0;
                    functions [i].f_func (argvars, rettv);
                    error = 5;
                }
            }
        }
        update_force_abort ();
    }
    if (error == 5) ret = 1;
    if (!aborting()) {
        switch (error) {
        case 0 :
            emsg_funcname ("E117: Unknown function: %s", name);
            break;
        case 1 :
            emsg_funcname (e_toomanyarg, name);
            break;
        case 2 :
            emsg_funcname ("E119: Not enough arguments for function: %s", name);
            break;
        case 3 :
            emsg_funcname ("E120: Using <SID> not in a script context: %s", name);
            break;
        case 4 :
            emsg_funcname ("E725: Calling dict function without Dictionary: %s", name);
            break;
        }
    }
    if (fname != name && fname != fname_buf) vim_free (fname);
    vim_free (name);
    return ret;
}

static void emsg_funcname (ermsg, name)
    char * ermsg;
    char_u * name;
{
    char_u * p;
    if (*name == (0x80)) p = concat_str ((char_u *) "<SNR>", name + 3);
    else p = name;
    emsg2 ((char_u *) (((char *) (ermsg))), (char_u *) (p));
    if (p != name) vim_free (p);
}

static int non_zero_arg (argvars)
    typval_T * argvars;
{
    return ((argvars [0].v_type == 1 && argvars [0].vval.v_number != 0) || (argvars [0].v_type == 2 && argvars [0].vval.
      v_string != ((void *) 0) && *argvars[0].vval.v_string != '\000'));
}

static int get_float_arg (typval_T * argvars, float_T * f);

static int get_float_arg (argvars, f)
    typval_T * argvars;
    float_T * f;
{
    if (argvars [0].v_type == 6) {
        * f = argvars [0].vval.v_float;
        return 1;
    }
    if (argvars [0].v_type == 1) {
        * f = (float_T) argvars [0].vval.v_number;
        return 1;
    }
    emsg ((char_u *) (((char *) ("E808: Number or Float required"))));
    return 0;
}

static void f_abs (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    if (argvars [0].v_type == 6) {
        rettv -> v_type = 6;
        rettv -> vval.v_float = fabs (argvars [0].vval.v_float);
    }
    else {
        varnumber_T n;
        int error = 0;
        n = get_tv_number_chk (&argvars[0], &error);
        if (error) rettv -> vval.v_number = -1;
        else if (n > 0) rettv -> vval.v_number = n;
        else rettv -> vval.v_number = -n;
    }
}

static void f_acos (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = acos (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_add (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    list_T * l;
    rettv -> vval.v_number = 1;
    if (argvars [0].v_type == 4) {
        if ((l = argvars [0].vval.v_list) != ((void *) 0) && !tv_check_lock(l->lv_lock,(char_u*)"add()") && list_append_tv (l, 
          &argvars[1]) == 1) copy_tv (&argvars[0], rettv);
    }
    else emsg ((char_u *) (((char *) (e_listreq))));
}

static void f_append (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    long lnum;
    char_u * line;
    list_T * l = ((void *) 0);
    listitem_T * li = ((void *) 0);
    typval_T * tv;
    long added = 0;
    lnum = get_tv_lnum (argvars);
    if (lnum >= 0 && lnum <= curbuf -> b_ml.ml_line_count && u_save (lnum, lnum + 1) == 1) {
        if (argvars [1].v_type == 4) {
            l = argvars [1].vval.v_list;
            if (l == ((void *) 0)) return;
            li = l -> lv_first;
        }
        for (;;) {
            if (l == ((void *) 0)) tv = &argvars[1];
            else if (li == ((void *) 0)) break;
            else tv = &li->li_tv;
            line = get_tv_string_chk (tv);
            if (line == ((void *) 0)) {
                rettv -> vval.v_number = 1;
                break;
            }
            ml_append (lnum + added, line, (colnr_T) 0, 0);
            ++added;
            if (l == ((void *) 0)) break;
            li = li -> li_next;
        }
        appended_lines_mark (lnum, added);
        if (curwin -> w_cursor.lnum > lnum) curwin -> w_cursor.lnum += added;
    }
    else rettv -> vval.v_number = 1;
}

static void f_argc (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = ((curwin) -> w_alist -> al_ga.ga_len);
}

static void f_argidx (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = curwin -> w_arg_idx;
}

static void f_argv (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int idx;
    if (argvars [0].v_type != 0) {
        idx = get_tv_number_chk (&argvars[0], ((void *) 0));
        if (idx >= 0 && idx < ((curwin) -> w_alist -> al_ga.ga_len)) rettv -> vval.v_string = vim_strsave (alist_name 
          (&((aentry_T*)(curwin)->w_alist->al_ga.ga_data)[idx]));
        else rettv -> vval.v_string = ((void *) 0);
        rettv -> v_type = 2;
    }
    else if (rettv_list_alloc (rettv) == 1) for (idx = 0; idx < ((curwin) -> w_alist -> al_ga.ga_len); ++idx) list_append_string
      (rettv -> vval.v_list, alist_name (&((aentry_T*)(curwin)->w_alist->al_ga.ga_data)[idx]), -1);
}

static void f_asin (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = asin (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_atan (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = atan (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_atan2 (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T fx, fy;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &fx) == 1 && get_float_arg (&argvars[1], &fy) == 1) rettv -> vval.v_float = atan2 (fx, fy);
    else rettv -> vval.v_float = 0.0;
}

static void f_browse (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_string = ((void *) 0);
    rettv -> v_type = 2;
}

static void f_browsedir (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_string = ((void *) 0);
    rettv -> v_type = 2;
}

static buf_T * find_buffer (typval_T * avar);

static buf_T * find_buffer (avar)
    typval_T * avar;
{
    buf_T * buf = ((void *) 0);
    if (avar -> v_type == 1) buf = buflist_findnr ((int) avar -> vval.v_number);
    else if (avar -> v_type == 2 && avar -> vval.v_string != ((void *) 0)) {
        buf = buflist_findname_exp (avar -> vval.v_string);
        if (buf == ((void *) 0)) {
            for (buf = firstbuf; buf != ((void *) 0); buf = buf -> b_next) if (buf -> b_fname != ((void *) 0) && (path_with_url
              (buf -> b_fname) || bt_nofile (buf)) && strcmp ((char *) (buf -> b_fname), (char *) (avar -> vval.v_string)) == 0
              ) break;
        }
    }
    return buf;
}

static void f_bufexists (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_number = (find_buffer (&argvars[0]) != ((void *) 0));
}

static void f_buflisted (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    buf_T * buf;
    buf = find_buffer (&argvars[0]);
    rettv -> vval.v_number = (buf != ((void *) 0) && buf -> b_p_bl);
}

static void f_bufloaded (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    buf_T * buf;
    buf = find_buffer (&argvars[0]);
    rettv -> vval.v_number = (buf != ((void *) 0) && buf -> b_ml.ml_mfp != ((void *) 0));
}

static buf_T * get_buf_tv (typval_T * tv);

static buf_T * get_buf_tv (tv)
    typval_T * tv;
{
    char_u * name = tv -> vval.v_string;
    int save_magic;
    char_u * save_cpo;
    buf_T * buf;
    if (tv -> v_type == 1) return buflist_findnr ((int) tv -> vval.v_number);
    if (tv -> v_type != 2) return ((void *) 0);
    if (name == ((void *) 0) || *name == '\000') return curbuf;
    if (name [0] == '$' && name [1] == '\000') return lastbuf;
    save_magic = p_magic;
    p_magic = 1;
    save_cpo = p_cpo;
    p_cpo = (char_u *) "";
    buf = buflist_findnr (buflist_findpat (name, name + strlen ((char *) (name)), 1, 0));
    p_magic = save_magic;
    p_cpo = save_cpo;
    if (buf == ((void *) 0)) buf = find_buffer (tv);
    return buf;
}

static void f_bufname (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    buf_T * buf;
    (void) get_tv_number (&argvars[0]);
    ++emsg_off;
    buf = get_buf_tv (&argvars[0]);
    rettv -> v_type = 2;
    if (buf != ((void *) 0) && buf -> b_fname != ((void *) 0)) rettv -> vval.v_string = vim_strsave (buf -> b_fname);
    else rettv -> vval.v_string = ((void *) 0);
    --emsg_off;
}

static void f_bufnr (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    buf_T * buf;
    int error = 0;
    char_u * name;
    (void) get_tv_number (&argvars[0]);
    ++emsg_off;
    buf = get_buf_tv (&argvars[0]);
    --emsg_off;
    if (buf == ((void *) 0) && argvars [1].v_type != 0 && get_tv_number_chk (&argvars[1], &error) != 0 && !error && (name =
      get_tv_string_chk (&argvars[0])) != ((void *) 0) && !error) buf = buflist_new (name, ((void *) 0), (linenr_T) 1, 0);
    if (buf != ((void *) 0)) rettv -> vval.v_number = buf -> b_fnum;
    else rettv -> vval.v_number = -1;
}

static void f_bufwinnr (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    win_T * wp;
    int winnr = 0;
    buf_T * buf;
    (void) get_tv_number (&argvars[0]);
    ++emsg_off;
    buf = get_buf_tv (&argvars[0]);
    for (wp = firstwin; wp; wp = wp -> w_next) {
        ++winnr;
        if (wp -> w_buffer == buf) break;
    }
    rettv -> vval.v_number = (wp != ((void *) 0) ? winnr : -1);
    --emsg_off;
}

static void f_byte2line (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    long boff = 0;
    boff = get_tv_number (&argvars[0]) - 1;
    if (boff < 0) rettv -> vval.v_number = -1;
    else rettv -> vval.v_number = ml_find_line_or_offset (curbuf, (linenr_T) 0, &boff);
}

static void f_byteidx (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * str;
    long idx;
    str = get_tv_string_chk (&argvars[0]);
    idx = get_tv_number_chk (&argvars[1], ((void *) 0));
    rettv -> vval.v_number = -1;
    if (str == ((void *) 0) || idx < 0) return;
    if ((size_t) idx <= strlen ((char *) (str))) rettv -> vval.v_number = idx;
}

static void f_call (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * func;
    typval_T argv [20 + 1];
    int argc = 0;
    listitem_T * item;
    int dummy;
    dict_T * selfdict = ((void *) 0);
    if (argvars [1].v_type != 4) {
        emsg ((char_u *) (((char *) (e_listreq))));
        return;
    }
    if (argvars [1].vval.v_list == ((void *) 0)) return;
    if (argvars [0].v_type == 3) func = argvars [0].vval.v_string;
    else func = get_tv_string (&argvars[0]);
    if (*func == '\000') return;
    if (argvars [2].v_type != 0) {
        if (argvars [2].v_type != 5) {
            emsg ((char_u *) (((char *) (e_dictreq))));
            return;
        }
        selfdict = argvars [2].vval.v_dict;
    }
    for (item = argvars [1].vval.v_list -> lv_first; item != ((void *) 0); item = item -> li_next) {
        if (argc == 20) {
            emsg ((char_u *) (((char *) ("E699: Too many arguments"))));
            break;
        }
        copy_tv (&item->li_tv, &argv[argc++]);
    }
    if (item == ((void *) 0)) (void) call_func (func, (int) strlen ((char *) (func)), rettv, argc, argv, curwin -> w_cursor.
      lnum, curwin -> w_cursor.lnum, &dummy, 1, selfdict);
    while (argc > 0) clear_tv (&argv[--argc]);
}

static void f_ceil (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = ceil (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_changenr (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = curbuf -> b_u_seq_cur;
}

static void f_char2nr (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_number = get_tv_string (&argvars[0]) [0];
}

static void f_cindent (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    pos_T pos;
    linenr_T lnum;
    pos = curwin -> w_cursor;
    lnum = get_tv_lnum (argvars);
    if (lnum >= 1 && lnum <= curbuf -> b_ml.ml_line_count) {
        curwin -> w_cursor.lnum = lnum;
        rettv -> vval.v_number = get_c_indent ();
        curwin -> w_cursor = pos;
    }
    else rettv -> vval.v_number = -1;
}

static void f_clearmatches (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
    clear_matches (curwin);
}

static void f_col (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    colnr_T col = 0;
    pos_T * fp;
    int fnum = curbuf -> b_fnum;
    fp = var2fpos (&argvars[0], 0, &fnum);
    if (fp != ((void *) 0) && fnum == curbuf -> b_fnum) {
        if (fp -> col == (0x7fffffffL)) {
            if (fp -> lnum <= curbuf -> b_ml.ml_line_count) col = (colnr_T) strlen ((char *) (ml_get (fp -> lnum))) + 1;
            else col = (0x7fffffffL);
        }
        else {
            col = fp -> col + 1;
            if (virtual_active () && fp == &curwin->w_cursor) {
                char_u * p = ml_get_cursor ();
                if (curwin -> w_cursor.coladd >= (colnr_T) chartabsize (p, curwin -> w_virtcol - curwin -> w_cursor.coladd)) {
                    if (*p != '\000' && p [1] == '\000') ++col;
                }
            }
        }
    }
    rettv -> vval.v_number = col;
}

static void f_complete (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv __attribute__ ((unused));
{
    int startcol;
    if ((State & 0x10) == 0) {
        emsg ((char_u *) (((char *) ("E785: complete() can only be used in Insert mode"))));
        return;
    }
    if (!undo_allowed()) return;
    if (argvars [1].v_type != 4 || argvars [1].vval.v_list == ((void *) 0)) {
        emsg ((char_u *) (((char *) (e_invarg))));
        return;
    }
    startcol = get_tv_number_chk (&argvars[0], ((void *) 0));
    if (startcol <= 0) return;
    set_completion (startcol - 1, argvars [1].vval.v_list);
}

static void f_complete_add (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_number = ins_compl_add_tv (&argvars[0], 0);
}

static void f_complete_check (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    int saved = RedrawingDisabled;
    RedrawingDisabled = 0;
    ins_compl_check_keys (0);
    rettv -> vval.v_number = compl_interrupted;
    RedrawingDisabled = saved;
}

static void f_confirm (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
    char_u * message;
    char_u * buttons = ((void *) 0);
    char_u buf [30];
    char_u buf2 [30];
    int def = 1;
    int type = 0;
    char_u * typestr;
    int error = 0;
    message = get_tv_string_chk (&argvars[0]);
    if (message == ((void *) 0)) error = 1;
    if (argvars [1].v_type != 0) {
        buttons = get_tv_string_buf_chk (&argvars[1], buf);
        if (buttons == ((void *) 0)) error = 1;
        if (argvars [2].v_type != 0) {
            def = get_tv_number_chk (&argvars[2], &error);
            if (argvars [3].v_type != 0) {
                typestr = get_tv_string_buf_chk (&argvars[3], buf2);
                if (typestr == ((void *) 0)) error = 1;
                else {
                    switch ((((*typestr) < 'a' || (*typestr) > 'z') ? (*typestr) : (*typestr) - ('a' - 'A'))) {
                    case 'E' :
                        type = 1;
                        break;
                    case 'Q' :
                        type = 4;
                        break;
                    case 'I' :
                        type = 3;
                        break;
                    case 'W' :
                        type = 2;
                        break;
                    case 'G' :
                        type = 0;
                        break;
                    }
                }
            }
        }
    }
    if (buttons == ((void *) 0) || *buttons == '\000') buttons = (char_u *) ((char *) ("&Ok"));
    if (!error) rettv -> vval.v_number = do_dialog (type, ((void *) 0), message, buttons, def, ((void *) 0));
}

static void f_copy (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    item_copy (&argvars[0], rettv, 0, 0);
}

static void f_cos (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = cos (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_cosh (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = cosh (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_count (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    long n = 0;
    int ic = 0;
    if (argvars [0].v_type == 4) {
        listitem_T * li;
        list_T * l;
        long idx;
        if ((l = argvars [0].vval.v_list) != ((void *) 0)) {
            li = l -> lv_first;
            if (argvars [2].v_type != 0) {
                int error = 0;
                ic = get_tv_number_chk (&argvars[2], &error);
                if (argvars [3].v_type != 0) {
                    idx = get_tv_number_chk (&argvars[3], &error);
                    if (!error) {
                        li = list_find (l, idx);
                        if (li == ((void *) 0)) emsgn ((char_u *) (((char *) (e_listidx))), (long) (idx));
                    }
                }
                if (error) li = ((void *) 0);
            }
            for (; li != ((void *) 0); li = li -> li_next) if (tv_equal (&li->li_tv, &argvars[1], ic)) ++n;
        }
    }
    else if (argvars [0].v_type == 5) {
        int todo;
        dict_T * d;
        hashitem_T * hi;
        if ((d = argvars [0].vval.v_dict) != ((void *) 0)) {
            int error = 0;
            if (argvars [2].v_type != 0) {
                ic = get_tv_number_chk (&argvars[2], &error);
                if (argvars [3].v_type != 0) emsg ((char_u *) (((char *) (e_invarg))));
            }
            todo = error ? 0 : (int) d -> dv_hashtab.ht_used;
            for (hi = d -> dv_hashtab.ht_array; todo > 0; ++hi) {
                if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
                    --todo;
                    if (tv_equal (&((dictitem_T*)((hi)->hi_key-(dumdi.di_key-(char_u*)&dumdi))) -> di_tv, &argvars[1], ic)) ++n
                      ;
                }
            }
        }
    }
    else emsg2 ((char_u *) (((char *) (e_listdictarg))), (char_u *) ("count()"));
    rettv -> vval.v_number = n;
}

static void f_cscope_connection (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
}

static void f_cursor (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    long line, col;
    long coladd = 0;
    rettv -> vval.v_number = -1;
    if (argvars [1].v_type == 0) {
        pos_T pos;
        if (list2fpos (argvars, &pos, ((void *) 0)) == 0) return;
        line = pos.lnum;
        col = pos.col;
        coladd = pos.coladd;
    }
    else {
        line = get_tv_lnum (argvars);
        col = get_tv_number_chk (&argvars[1], ((void *) 0));
        if (argvars [2].v_type != 0) coladd = get_tv_number_chk (&argvars[2], ((void *) 0));
    }
    if (line < 0 || col < 0 || coladd < 0) return;
    if (line > 0) curwin -> w_cursor.lnum = line;
    if (col > 0) curwin -> w_cursor.col = col - 1;
    curwin -> w_cursor.coladd = coladd;
    check_cursor ();
    curwin -> w_set_curswant = 1;
    rettv -> vval.v_number = 0;
}

static void f_deepcopy (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int noref = 0;
    if (argvars [1].v_type != 0) noref = get_tv_number_chk (&argvars[1], ((void *) 0));
    if (noref < 0 || noref > 1) emsg ((char_u *) (((char *) (e_invarg))));
    else {
        current_copyID += 2;
        item_copy (&argvars[0], rettv, 1, noref == 0 ? current_copyID : 0);
    }
}

static void f_delete (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    if (check_restricted () || check_secure ()) rettv -> vval.v_number = -1;
    else rettv -> vval.v_number = unlink ((char *) (get_tv_string (&argvars[0])));
}

static void f_did_filetype (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
    rettv -> vval.v_number = did_filetype;
}

static void f_diff_filler (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
    rettv -> vval.v_number = diff_check_fill (curwin, get_tv_lnum (argvars));
}

static void f_diff_hlID (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
    linenr_T lnum = get_tv_lnum (argvars);
    static linenr_T prev_lnum = 0;
    static int changedtick = 0;
    static int fnum = 0;
    static int change_start = 0;
    static int change_end = 0;
    static hlf_T hlID = (hlf_T) 0;
    int filler_lines;
    int col;
    if (lnum < 0) lnum = 0;
    if (lnum != prev_lnum || changedtick != curbuf -> b_changedtick || fnum != curbuf -> b_fnum) {
        filler_lines = diff_check (curwin, lnum);
        if (filler_lines < 0) {
            if (filler_lines == -1) {
                change_start = (0x7fffffffL);
                change_end = -1;
                if (diff_find_change (curwin, lnum, &change_start, &change_end)) hlID = HLF_ADD;
                else hlID = HLF_CHD;
            }
            else hlID = HLF_ADD;
        }
        else hlID = (hlf_T) 0;
        prev_lnum = lnum;
        changedtick = curbuf -> b_changedtick;
        fnum = curbuf -> b_fnum;
    }
    if (hlID == HLF_CHD || hlID == HLF_TXD) {
        col = get_tv_number (&argvars[1]) - 1;
        if (col >= change_start && col <= change_end) hlID = HLF_TXD;
        else hlID = HLF_CHD;
    }
    rettv -> vval.v_number = hlID == (hlf_T) 0 ? 0 : (int) hlID;
}

static void f_empty (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int n;
    switch (argvars [0].v_type) {
    case 2 :
    case 3 :
        n = argvars [0].vval.v_string == ((void *) 0) || *argvars[0].vval.v_string == '\000';
        break;
    case 1 :
        n = argvars [0].vval.v_number == 0;
        break;
    case 6 :
        n = argvars [0].vval.v_float == 0.0;
        break;
    case 4 :
        n = argvars [0].vval.v_list == ((void *) 0) || argvars [0].vval.v_list -> lv_first == ((void *) 0);
        break;
    case 5 :
        n = argvars [0].vval.v_dict == ((void *) 0) || argvars [0].vval.v_dict -> dv_hashtab.ht_used == 0;
        break;
    default :
        emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("f_empty()"));
        n = 0;
    }
    rettv -> vval.v_number = n;
}

static void f_escape (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u buf [30];
    rettv -> vval.v_string = vim_strsave_escaped (get_tv_string (&argvars[0]), get_tv_string_buf (&argvars[1], buf));
    rettv -> v_type = 2;
}

static void f_eval (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * s;
    s = get_tv_string_chk (&argvars[0]);
    if (s != ((void *) 0)) s = skipwhite (s);
    if (s == ((void *) 0) || eval1 (&s, rettv, 1) == 0) {
        rettv -> v_type = 1;
        rettv -> vval.v_number = 0;
    }
    else if (*s != '\000') emsg ((char_u *) (((char *) (e_trailing))));
}

static void f_eventhandler (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = vgetc_busy;
}

static void f_executable (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_number = mch_can_exe (get_tv_string (&argvars[0]));
}

static void f_exists (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * p;
    char_u * name;
    int n = 0;
    int len = 0;
    no_autoload = 1;
    p = get_tv_string (&argvars[0]);
    if (*p == '$') {
        if ((char_u *) getenv ((char *) (p + 1)) != ((void *) 0)) n = 1;
        else {
            p = expand_env_save (p);
            if (p != ((void *) 0) && *p != '$') n = 1;
            vim_free (p);
        }
    }
    else if (*p == '&' || *p == '+') {
        n = (get_option_tv (&p, ((void *) 0), 1) == 1);
        if (*skipwhite(p) != '\000') n = 0;
    }
    else if (*p == '*') {
        n = function_exists (p + 1);
    }
    else if (*p == ':') {
        n = cmd_exists (p + 1);
    }
    else if (*p == '#') {
        if (p [1] == '#') n = autocmd_supported (p + 2);
        else n = au_exists (p + 1);
    }
    else {
        char_u * tofree;
        typval_T tv;
        name = p;
        len = get_name_len (&p, &tofree, 1, 0);
        if (len > 0) {
            if (tofree != ((void *) 0)) name = tofree;
            n = (get_var_tv (name, len, &tv, 0) == 1);
            if (n) {
                n = (handle_subscript (&p, &tv, 1, 0) == 1);
                if (n) clear_tv (&tv);
            }
        }
        if (*p != '\000') n = 0;
        vim_free (tofree);
    }
    rettv -> vval.v_number = n;
    no_autoload = 0;
}

static void f_exp (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = exp (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_expand (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * s;
    int len;
    char_u * errormsg;
    int flags = 64 | 4 | 1;
    expand_T xpc;
    int error = 0;
    rettv -> v_type = 2;
    s = get_tv_string (&argvars[0]);
    if (*s == '%' || *s == '#' || *s == '<') {
        ++emsg_off;
        rettv -> vval.v_string = eval_vars (s, s, &len, ((void *) 0), &errormsg, ((void *) 0));
        --emsg_off;
    }
    else {
        if (argvars [1].v_type != 0 && get_tv_number_chk (&argvars[1], &error)) flags |= 32;
        if (!error) {
            ExpandInit (&xpc);
            xpc.xp_context = 2;
            rettv -> vval.v_string = ExpandOne (&xpc, s, ((void *) 0), flags, 6);
        }
        else rettv -> vval.v_string = ((void *) 0);
    }
}

static void f_extend (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    if (argvars [0].v_type == 4 && argvars [1].v_type == 4) {
        list_T * l1, * l2;
        listitem_T * item;
        long before;
        int error = 0;
        l1 = argvars [0].vval.v_list;
        l2 = argvars [1].vval.v_list;
        if (l1 != ((void *) 0) && !tv_check_lock(l1->lv_lock,(char_u*)"extend()") && l2 != ((void *) 0)) {
            if (argvars [2].v_type != 0) {
                before = get_tv_number_chk (&argvars[2], &error);
                if (error) return;
                if (before == l1 -> lv_len) item = ((void *) 0);
                else {
                    item = list_find (l1, before);
                    if (item == ((void *) 0)) {
                        emsgn ((char_u *) (((char *) (e_listidx))), (long) (before));
                        return;
                    }
                }
            }
            else item = ((void *) 0);
            list_extend (l1, l2, item);
            copy_tv (&argvars[0], rettv);
        }
    }
    else if (argvars [0].v_type == 5 && argvars [1].v_type == 5) {
        dict_T * d1, * d2;
        dictitem_T * di1;
        char_u * action;
        int i;
        hashitem_T * hi2;
        int todo;
        d1 = argvars [0].vval.v_dict;
        d2 = argvars [1].vval.v_dict;
        if (d1 != ((void *) 0) && !tv_check_lock(d1->dv_lock,(char_u*)"extend()") && d2 != ((void *) 0)) {
            if (argvars [2].v_type != 0) {
                static char * (av []) =
                {"keep", "force", "error"};
                action = get_tv_string_chk (&argvars[2]);
                if (action == ((void *) 0)) return;
                for (i = 0; i < 3; ++i) if (strcmp ((char *) (action), (char *) (av [i])) == 0) break;
                if (i == 3) {
                    emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (action));
                    return;
                }
            }
            else action = (char_u *) "force";
            todo = (int) d2 -> dv_hashtab.ht_used;
            for (hi2 = d2 -> dv_hashtab.ht_array; todo > 0; ++hi2) {
                if (!((hi2)->hi_key==((void*)0)||(hi2)->hi_key==&hash_removed)) {
                    --todo;
                    di1 = dict_find (d1, hi2 -> hi_key, -1);
                    if (di1 == ((void *) 0)) {
                        di1 = dictitem_copy (((dictitem_T *) ((hi2) -> hi_key - (dumdi.di_key - (char_u *) &dumdi))));
                        if (di1 != ((void *) 0) && dict_add (d1, di1) == 0) dictitem_free (di1);
                    }
                    else if (*action == 'e') {
                        emsg2 ((char_u *) (((char *) ("E737: Key already exists: %s"))), (char_u *) (hi2 -> hi_key));
                        break;
                    }
                    else if (*action == 'f') {
                        clear_tv (&di1->di_tv);
                        copy_tv (&((dictitem_T*)((hi2)->hi_key-(dumdi.di_key-(char_u*)&dumdi))) -> di_tv, &di1->di_tv);
                    }
                }
            }
            copy_tv (&argvars[0], rettv);
        }
    }
    else emsg2 ((char_u *) (((char *) (e_listdictarg))), (char_u *) ("extend()"));
}

static void f_feedkeys (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv __attribute__ ((unused));
{
    int remap = 1;
    char_u * keys, * flags;
    char_u nbuf [30];
    int typed = 0;
    char_u * keys_esc;
    if (check_secure ()) return;
    keys = get_tv_string (&argvars[0]);
    if (*keys != '\000') {
        if (argvars [1].v_type != 0) {
            flags = get_tv_string_buf (&argvars[1], nbuf);
            for (; *flags != '\000'; ++flags) {
                switch (*flags) {
                case 'n' :
                    remap = 0;
                    break;
                case 'm' :
                    remap = 1;
                    break;
                case 't' :
                    typed = 1;
                    break;
                }
            }
        }
        keys_esc = vim_strsave_escape_csi (keys);
        if (keys_esc != ((void *) 0)) {
            ins_typebuf (keys_esc, (remap ? 0 : -1), typebuf.tb_len, !typed, 0);
            vim_free (keys_esc);
            if (vgetc_busy) typebuf_was_filled = 1;
        }
    }
}

static void f_filereadable (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int fd;
    char_u * p;
    int n;
    p = get_tv_string (&argvars[0]);
    if (*p && !mch_isdir(p) && (fd = open (((char *) p), (0x0000 | 0x0004), (0))) >= 0) {
        n = 1;
        close (fd);
    }
    else n = 0;
    rettv -> vval.v_number = n;
}

static void f_filewritable (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_number = filewritable (get_tv_string (&argvars[0]));
}

static void findfilendir (typval_T * argvars, typval_T * rettv, int find_what);

static void findfilendir (argvars, rettv, find_what)
    typval_T * argvars;
    typval_T * rettv;
    int find_what;
{
    char_u * fname;
    char_u * fresult = ((void *) 0);
    char_u * path = *curbuf->b_p_path == '\000' ? p_path : curbuf -> b_p_path;
    char_u * p;
    char_u pathbuf [30];
    int count = 1;
    int first = 1;
    int error = 0;
    rettv -> vval.v_string = ((void *) 0);
    rettv -> v_type = 2;
    fname = get_tv_string (&argvars[0]);
    if (argvars [1].v_type != 0) {
        p = get_tv_string_buf_chk (&argvars[1], pathbuf);
        if (p == ((void *) 0)) error = 1;
        else {
            if (*p != '\000') path = p;
            if (argvars [2].v_type != 0) count = get_tv_number_chk (&argvars[2], &error);
        }
    }
    if (count < 0 && rettv_list_alloc (rettv) == 0) error = 1;
    if (*fname != '\000' && !error) {
        do {
            if (rettv -> v_type == 2) vim_free (fresult);
            fresult = find_file_in_path_option (first ? fname : ((void *) 0), first ? (int) strlen ((char *) (fname)) : 0, 0,
              first, path, find_what, curbuf -> b_ffname, find_what == 1 ? (char_u *) "" : curbuf -> b_p_sua);
            first = 0;
            if (fresult != ((void *) 0) && rettv -> v_type == 4) list_append_string (rettv -> vval.v_list, fresult, -1);
        }
        while ((rettv -> v_type == 4 || --count > 0) && fresult != ((void *) 0));
    }
    if (rettv -> v_type == 2) rettv -> vval.v_string = fresult;
}

static void filter_map (typval_T * argvars, typval_T * rettv, int map);
static int filter_map_one (typval_T * tv, char_u * expr, int map, int * remp);

static void filter_map (argvars, rettv, map)
    typval_T * argvars;
    typval_T * rettv;
    int map;
{
    char_u buf [30];
    char_u * expr;
    listitem_T * li, * nli;
    list_T * l = ((void *) 0);
    dictitem_T * di;
    hashtab_T * ht;
    hashitem_T * hi;
    dict_T * d = ((void *) 0);
    typval_T save_val;
    typval_T save_key;
    int rem;
    int todo;
    char_u * ermsg = map ? (char_u *) "map()" : (char_u *) "filter()";
    int save_did_emsg;
    int idx = 0;
    if (argvars [0].v_type == 4) {
        if ((l = argvars [0].vval.v_list) == ((void *) 0) || (map && tv_check_lock (l -> lv_lock, ermsg))) return;
    }
    else if (argvars [0].v_type == 5) {
        if ((d = argvars [0].vval.v_dict) == ((void *) 0) || (map && tv_check_lock (d -> dv_lock, ermsg))) return;
    }
    else {
        emsg2 ((char_u *) (((char *) (e_listdictarg))), (char_u *) (ermsg));
        return;
    }
    expr = get_tv_string_buf_chk (&argvars[1], buf);
    if (expr != ((void *) 0)) {
        prepare_vimvar (34, &save_val);
        expr = skipwhite (expr);
        save_did_emsg = did_emsg;
        did_emsg = 0;
        prepare_vimvar (35, &save_key);
        if (argvars [0].v_type == 5) {
            vimvars [35].vv_di.di_tv.v_type = 2;
            ht = &d->dv_hashtab;
            hash_lock (ht);
            todo = (int) ht -> ht_used;
            for (hi = ht -> ht_array; todo > 0; ++hi) {
                if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
                    --todo;
                    di = ((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi)));
                    if (tv_check_lock (di -> di_tv.v_lock, ermsg)) break;
                    vimvars [35].vv_di.di_tv.vval.v_string = vim_strsave (di -> di_key);
                    if (filter_map_one (&di->di_tv, expr, map, &rem) == 0 || did_emsg) break;
                    if (!map && rem) dictitem_remove (d, di);
                    clear_tv (&vimvars[35].vv_di.di_tv);
                }
            }
            hash_unlock (ht);
        }
        else {
            vimvars [35].vv_di.di_tv.v_type = 1;
            for (li = l -> lv_first; li != ((void *) 0); li = nli) {
                if (tv_check_lock (li -> li_tv.v_lock, ermsg)) break;
                nli = li -> li_next;
                vimvars [35].vv_di.di_tv.vval.v_number = idx;
                if (filter_map_one (&li->li_tv, expr, map, &rem) == 0 || did_emsg) break;
                if (!map && rem) listitem_remove (l, li);
                ++idx;
            }
        }
        restore_vimvar (35, &save_key);
        restore_vimvar (34, &save_val);
        did_emsg |= save_did_emsg;
    }
    copy_tv (&argvars[0], rettv);
}

static int filter_map_one (tv, expr, map, remp)
    typval_T * tv;
    char_u * expr;
    int map;
    int * remp;
{
    typval_T rettv;
    char_u * s;
    int retval = 0;
    copy_tv (tv, &vimvars[34].vv_di.di_tv);
    s = expr;
    if (eval1 (&s, &rettv, 1) == 0) goto theend;
    if (*s != '\000') {
        emsg2 ((char_u *) (((char *) (e_invexpr2))), (char_u *) (s));
        goto theend;
    }
    if (map) {
        clear_tv (tv);
        rettv.v_lock = 0;
        * tv = rettv;
    }
    else {
        int error = 0;
        * remp = (get_tv_number_chk (&rettv, &error) == 0);
        clear_tv (&rettv);
        if (error) goto theend;
    }
    retval = 1;
    theend : clear_tv (&vimvars[34].vv_di.di_tv);
    return retval;
}

static void f_filter (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    filter_map (argvars, rettv, 0);
}

static void f_finddir (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    findfilendir (argvars, rettv, 1);
}

static void f_findfile (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    findfilendir (argvars, rettv, 0);
}

static void f_float2nr (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    if (get_float_arg (argvars, &f) == 1) {
        if (f < -0x7fffffff) rettv -> vval.v_number = -0x7fffffff;
        else if (f > 0x7fffffff) rettv -> vval.v_number = 0x7fffffff;
        else rettv -> vval.v_number = (varnumber_T) f;
    }
}

static void f_floor (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = floor (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_fmod (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T fx, fy;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &fx) == 1 && get_float_arg (&argvars[1], &fy) == 1) rettv -> vval.v_float = fmod (fx, fy);
    else rettv -> vval.v_float = 0.0;
}

static void f_fnameescape (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_string = vim_strsave_fnameescape (get_tv_string (&argvars[0]), 0);
    rettv -> v_type = 2;
}

static void f_fnamemodify (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * fname;
    char_u * mods;
    int usedlen = 0;
    int len;
    char_u * fbuf = ((void *) 0);
    char_u buf [30];
    fname = get_tv_string_chk (&argvars[0]);
    mods = get_tv_string_buf_chk (&argvars[1], buf);
    if (fname == ((void *) 0) || mods == ((void *) 0)) fname = ((void *) 0);
    else {
        len = (int) strlen ((char *) (fname));
        (void) modify_fname (mods, &usedlen, &fname, &fbuf, &len);
    }
    rettv -> v_type = 2;
    if (fname == ((void *) 0)) rettv -> vval.v_string = ((void *) 0);
    else rettv -> vval.v_string = vim_strnsave (fname, len);
    vim_free (fbuf);
}

static void foldclosed_both (typval_T * argvars, typval_T * rettv, int end);

static void foldclosed_both (argvars, rettv, end)
    typval_T * argvars;
    typval_T * rettv;
    int end;
{
    linenr_T lnum;
    linenr_T first, last;
    lnum = get_tv_lnum (argvars);
    if (lnum >= 1 && lnum <= curbuf -> b_ml.ml_line_count) {
        if (hasFoldingWin (curwin, lnum, &first, &last, 0, ((void *) 0))) {
            if (end) rettv -> vval.v_number = (varnumber_T) last;
            else rettv -> vval.v_number = (varnumber_T) first;
            return;
        }
    }
    rettv -> vval.v_number = -1;
}

static void f_foldclosed (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    foldclosed_both (argvars, rettv, 0);
}

static void f_foldclosedend (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    foldclosed_both (argvars, rettv, 1);
}

static void f_foldlevel (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    linenr_T lnum;
    lnum = get_tv_lnum (argvars);
    if (lnum >= 1 && lnum <= curbuf -> b_ml.ml_line_count) rettv -> vval.v_number = foldLevel (lnum);
}

static void f_foldtext (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    linenr_T lnum;
    char_u * s;
    char_u * r;
    int len;
    char * txt;
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
    if ((linenr_T) vimvars [22].vv_di.di_tv.vval.v_number > 0 && (linenr_T) vimvars [23].vv_di.di_tv.vval.v_number <= curbuf ->
      b_ml.ml_line_count && vimvars [24].vv_di.di_tv.vval.v_string != ((void *) 0)) {
        lnum = (linenr_T) vimvars [22].vv_di.di_tv.vval.v_number;
        while (lnum < (linenr_T) vimvars [23].vv_di.di_tv.vval.v_number) {
            if (!linewhite(lnum)) break;
            ++lnum;
        }
        s = skipwhite (ml_get (lnum));
        if (s [0] == '/' && (s [1] == '*' || s [1] == '/')) {
            s = skipwhite (s + 2);
            if (*skipwhite(s) == '\000' && lnum + 1 < (linenr_T) vimvars [23].vv_di.di_tv.vval.v_number) {
                s = skipwhite (ml_get (lnum + 1));
                if (*s == '*') s = skipwhite (s + 1);
            }
        }
        txt = ((char *) ("+-%s%3ld lines: "));
        r = alloc ((unsigned) (strlen ((char *) (txt)) + strlen ((char *) (vimvars [24].vv_di.di_tv.vval.v_string)) + 20 +
          strlen ((char *) (s))));
        if (r != ((void *) 0)) {
            __builtin___sprintf_chk ((char *) r, 0, __builtin_object_size ((char *) r, 1 > 1), txt, vimvars [24].vv_di.di_tv.
              vval.v_string, (long) ((linenr_T) vimvars [23].vv_di.di_tv.vval.v_number - (linenr_T) vimvars [22].vv_di.di_tv.
              vval.v_number + 1));
            len = (int) strlen ((char *) (r));
            ((__builtin_object_size ((char *) (r), 0) != (size_t) - 1) ? __builtin___strcat_chk ((char *) (r), (char *) (s),
              __builtin_object_size ((char *) (r), 1 > 1)) : __inline_strcat_chk ((char *) (r), (char *) (s)));
            foldtext_cleanup (r + len);
            rettv -> vval.v_string = r;
        }
    }
}

static void f_foldtextresult (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    linenr_T lnum;
    char_u * text;
    char_u buf [51];
    foldinfo_T foldinfo;
    int fold_count;
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
    lnum = get_tv_lnum (argvars);
    if (lnum < 0) lnum = 0;
    fold_count = foldedCount (curwin, lnum, &foldinfo);
    if (fold_count > 0) {
        text = get_foldtext (curwin, lnum, lnum + fold_count - 1, &foldinfo, buf);
        if (text == buf) text = vim_strsave (text);
        rettv -> vval.v_string = text;
    }
}

static void f_foreground (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
}

static void f_function (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * s;
    s = get_tv_string (&argvars[0]);
    if (s == ((void *) 0) || *s == '\000' || ((*s) >= '0' && (*s) <= '9')) emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *
      ) (s));
    else if (vim_strchr (s, '#') == ((void *) 0) && !function_exists(s)) emsg2 ((char_u *) (((char *) (
      "E700: Unknown function: %s"))), (char_u *) (s));
    else {
        rettv -> vval.v_string = vim_strsave (s);
        rettv -> v_type = 3;
    }
}

static void f_garbagecollect (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv __attribute__ ((unused));
{
    want_garbage_collect = 1;
    if (argvars [0].v_type != 0 && get_tv_number (&argvars[0]) == 1) garbage_collect_at_exit = 1;
}

static void f_get (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    listitem_T * li;
    list_T * l;
    dictitem_T * di;
    dict_T * d;
    typval_T * tv = ((void *) 0);
    if (argvars [0].v_type == 4) {
        if ((l = argvars [0].vval.v_list) != ((void *) 0)) {
            int error = 0;
            li = list_find (l, get_tv_number_chk (&argvars[1], &error));
            if (!error && li != ((void *) 0)) tv = &li->li_tv;
        }
    }
    else if (argvars [0].v_type == 5) {
        if ((d = argvars [0].vval.v_dict) != ((void *) 0)) {
            di = dict_find (d, get_tv_string (&argvars[1]), -1);
            if (di != ((void *) 0)) tv = &di->di_tv;
        }
    }
    else emsg2 ((char_u *) (((char *) (e_listdictarg))), (char_u *) ("get()"));
    if (tv == ((void *) 0)) {
        if (argvars [2].v_type != 0) copy_tv (&argvars[2], rettv);
    }
    else copy_tv (tv, rettv);
}

static void get_buffer_lines (buf_T * buf, linenr_T start, linenr_T end, int retlist, typval_T * rettv);

static void get_buffer_lines (buf, start, end, retlist, rettv)
    buf_T * buf;
    linenr_T start;
    linenr_T end;
    int retlist;
    typval_T * rettv;
{
    char_u * p;
    if (retlist && rettv_list_alloc (rettv) == 0) return;
    if (buf == ((void *) 0) || buf -> b_ml.ml_mfp == ((void *) 0) || start < 0) return;
    if (!retlist) {
        if (start >= 1 && start <= buf -> b_ml.ml_line_count) p = ml_get_buf (buf, start, 0);
        else p = (char_u *) "";
        rettv -> v_type = 2;
        rettv -> vval.v_string = vim_strsave (p);
    }
    else {
        if (end < start) return;
        if (start < 1) start = 1;
        if (end > buf -> b_ml.ml_line_count) end = buf -> b_ml.ml_line_count;
        while (start <= end) if (list_append_string (rettv -> vval.v_list, ml_get_buf (buf, start ++, 0), -1) == 0) break;
    }
}

static void f_getbufline (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    linenr_T lnum;
    linenr_T end;
    buf_T * buf;
    (void) get_tv_number (&argvars[0]);
    ++emsg_off;
    buf = get_buf_tv (&argvars[0]);
    --emsg_off;
    lnum = get_tv_lnum_buf (&argvars[1], buf);
    if (argvars [2].v_type == 0) end = lnum;
    else end = get_tv_lnum_buf (&argvars[2], buf);
    get_buffer_lines (buf, lnum, end, 1, rettv);
}

static void f_getbufvar (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    buf_T * buf;
    buf_T * save_curbuf;
    char_u * varname;
    dictitem_T * v;
    (void) get_tv_number (&argvars[0]);
    varname = get_tv_string_chk (&argvars[1]);
    ++emsg_off;
    buf = get_buf_tv (&argvars[0]);
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
    if (buf != ((void *) 0) && varname != ((void *) 0)) {
        save_curbuf = curbuf;
        curbuf = buf;
        if (*varname == '&') get_option_tv (&varname, rettv, 1);
        else {
            if (*varname == '\000') varname = (char_u *) "b:" + 2;
            v = find_var_in_ht (&curbuf->b_vars.dv_hashtab, varname, 0);
            if (v != ((void *) 0)) copy_tv (&v->di_tv, rettv);
        }
        curbuf = save_curbuf;
    }
    --emsg_off;
}

static void f_getchar (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    varnumber_T n;
    int error = 0;
    windgoto (msg_row, msg_col);
    ++no_mapping;
    ++allow_keys;
    for (;;) {
        if (argvars [0].v_type == 0) n = safe_vgetc ();
        else if (get_tv_number_chk (&argvars[0], &error) == 1) n = vpeekc ();
        else if (error || vpeekc () == '\000') n = 0;
        else n = safe_vgetc ();
        if (n == (-((253)+((int)(KE_IGNORE)<<8)))) continue;
        break;
    }
    --no_mapping;
    --allow_keys;
    vimvars [49].vv_di.di_tv.vval.v_number = 0;
    vimvars [50].vv_di.di_tv.vval.v_number = 0;
    vimvars [51].vv_di.di_tv.vval.v_number = 0;
    rettv -> vval.v_number = n;
    if (((n) < 0) || mod_mask != 0) {
        char_u temp [10];
        int i = 0;
        if (mod_mask != 0) {
            temp [i ++] = (0x80);
            temp [i ++] = 252;
            temp [i ++] = mod_mask;
        }
        if (((n) < 0)) {
            temp [i ++] = (0x80);
            temp [i ++] = ((n) == (0x80) ? 254 : (n) == '\000' ? 255 : ((-(n)) & 0xff));
            temp [i ++] = (((n) == (0x80) || (n) == '\000') ? ('X') : (((unsigned) (-(n)) >> 8) & 0xff));
        }
        else temp [i ++] = n;
        temp [i ++] = '\000';
        rettv -> v_type = 2;
        rettv -> vval.v_string = vim_strsave (temp);
        if (n == (-((253)+((int)(KE_LEFTMOUSE)<<8))) || n == (-((253)+((int)(KE_LEFTMOUSE_NM)<<8))) || n == 
          (-((253)+((int)(KE_LEFTDRAG)<<8))) || n == (-((253)+((int)(KE_LEFTRELEASE)<<8))) || n == 
          (-((253)+((int)(KE_LEFTRELEASE_NM)<<8))) || n == (-((253)+((int)(KE_MIDDLEMOUSE)<<8))) || n == 
          (-((253)+((int)(KE_MIDDLEDRAG)<<8))) || n == (-((253)+((int)(KE_MIDDLERELEASE)<<8))) || n == 
          (-((253)+((int)(KE_RIGHTMOUSE)<<8))) || n == (-((253)+((int)(KE_RIGHTDRAG)<<8))) || n == 
          (-((253)+((int)(KE_RIGHTRELEASE)<<8))) || n == (-((253)+((int)(KE_X1MOUSE)<<8))) || n == 
          (-((253)+((int)(KE_X1DRAG)<<8))) || n == (-((253)+((int)(KE_X1RELEASE)<<8))) || n == (-((253)+((int)(KE_X2MOUSE)<<8))
          ) || n == (-((253)+((int)(KE_X2DRAG)<<8))) || n == (-((253)+((int)(KE_X2RELEASE)<<8))) || n == 
          (-((253)+((int)(KE_MOUSELEFT)<<8))) || n == (-((253)+((int)(KE_MOUSERIGHT)<<8))) || n == 
          (-((253)+((int)(KE_MOUSEDOWN)<<8))) || n == (-((253)+((int)(KE_MOUSEUP)<<8)))) {
            int row = mouse_row;
            int col = mouse_col;
            win_T * win;
            linenr_T lnum;
            win_T * wp;
            int winnr = 1;
            if (row >= 0 && col >= 0) {
                win = mouse_find_win (&row, &col);
                (void) mouse_comp_pos (win, &row, &col, &lnum);
                for (wp = firstwin; wp != win; wp = wp -> w_next) ++winnr;
                vimvars [49].vv_di.di_tv.vval.v_number = winnr;
                vimvars [50].vv_di.di_tv.vval.v_number = lnum;
                vimvars [51].vv_di.di_tv.vval.v_number = col + 1;
            }
        }
    }
}

static void f_getcharmod (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = mod_mask;
}

static void f_getcmdline (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> v_type = 2;
    rettv -> vval.v_string = get_cmdline_str ();
}

static void f_getcmdpos (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = get_cmdline_pos () + 1;
}

static void f_getcmdtype (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> v_type = 2;
    rettv -> vval.v_string = alloc (2);
    if (rettv -> vval.v_string != ((void *) 0)) {
        rettv -> vval.v_string [0] = get_cmdline_type ();
        rettv -> vval.v_string [1] = '\000';
    }
}

static void f_getcwd (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    char_u cwd [1024];
    rettv -> v_type = 2;
    if (mch_dirname (cwd, 1024) == 0) rettv -> vval.v_string = ((void *) 0);
    else {
        rettv -> vval.v_string = vim_strsave (cwd);
    }
}

static void f_getfontname (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
}

static void f_getfperm (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * fname;
    struct stat st;
    char_u * perm = ((void *) 0);
    char_u flags [] = "rwx";
    int i;
    fname = get_tv_string (&argvars[0]);
    rettv -> v_type = 2;
    if (stat (((char *) fname), (&st)) >= 0) {
        perm = vim_strsave ((char_u *) "---------");
        if (perm != ((void *) 0)) {
            for (i = 0; i < 9; i ++) {
                if (st.st_mode & (1 << (8 - i))) perm [i] = flags [i % 3];
            }
        }
    }
    rettv -> vval.v_string = perm;
}

static void f_getfsize (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * fname;
    struct stat st;
    fname = get_tv_string (&argvars[0]);
    rettv -> v_type = 1;
    if (stat (((char *) fname), (&st)) >= 0) {
        if (mch_isdir (fname)) rettv -> vval.v_number = 0;
        else {
            rettv -> vval.v_number = (varnumber_T) st.st_size;
            if ((off_t) rettv -> vval.v_number != (off_t) st.st_size) rettv -> vval.v_number = -2;
        }
    }
    else rettv -> vval.v_number = -1;
}

static void f_getftime (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * fname;
    struct stat st;
    fname = get_tv_string (&argvars[0]);
    if (stat (((char *) fname), (&st)) >= 0) rettv -> vval.v_number = (varnumber_T) st.st_mtimespec.tv_sec;
    else rettv -> vval.v_number = -1;
}

static void f_getftype (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * fname;
    struct stat st;
    char_u * type = ((void *) 0);
    char * t;
    fname = get_tv_string (&argvars[0]);
    rettv -> v_type = 2;
    if (lstat (((char *) fname), (&st)) >= 0) {
        if ((((st.st_mode) & 0170000) == 0100000)) t = "file";
        else if ((((st.st_mode) & 0170000) == 0040000)) t = "dir";
        else if ((((st.st_mode) & 0170000) == 0120000)) t = "link";
        else if ((((st.st_mode) & 0170000) == 0060000)) t = "bdev";
        else if ((((st.st_mode) & 0170000) == 0020000)) t = "cdev";
        else if ((((st.st_mode) & 0170000) == 0010000)) t = "fifo";
        else if ((((st.st_mode) & 0170000) == 0140000)) t = "fifo";
        else t = "other";
        type = vim_strsave ((char_u *) t);
    }
    rettv -> vval.v_string = type;
}

static void f_getline (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    linenr_T lnum;
    linenr_T end;
    int retlist;
    lnum = get_tv_lnum (argvars);
    if (argvars [1].v_type == 0) {
        end = 0;
        retlist = 0;
    }
    else {
        end = get_tv_lnum (&argvars[1]);
        retlist = 1;
    }
    get_buffer_lines (curbuf, lnum, end, retlist, rettv);
}

static void f_getmatches (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    dict_T * dict;
    matchitem_T * cur = curwin -> w_match_head;
    if (rettv_list_alloc (rettv) == 1) {
        while (cur != ((void *) 0)) {
            dict = dict_alloc ();
            if (dict == ((void *) 0)) return;
            dict_add_nr_str (dict, "group", 0L, syn_id2name (cur -> hlg_id));
            dict_add_nr_str (dict, "pattern", 0L, cur -> pattern);
            dict_add_nr_str (dict, "priority", (long) cur -> priority, ((void *) 0));
            dict_add_nr_str (dict, "id", (long) cur -> id, ((void *) 0));
            list_append_dict (rettv -> vval.v_list, dict);
            cur = cur -> next;
        }
    }
}

static void f_getpid (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = mch_get_pid ();
}

static void f_getpos (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    pos_T * fp;
    list_T * l;
    int fnum = -1;
    if (rettv_list_alloc (rettv) == 1) {
        l = rettv -> vval.v_list;
        fp = var2fpos (&argvars[0], 1, &fnum);
        if (fnum != -1) list_append_number (l, (varnumber_T) fnum);
        else list_append_number (l, (varnumber_T) 0);
        list_append_number (l, (fp != ((void *) 0)) ? (varnumber_T) fp -> lnum : (varnumber_T) 0);
        list_append_number (l, (fp != ((void *) 0)) ? (varnumber_T) (fp -> col == (0x7fffffffL) ? (0x7fffffffL) : fp -> col + 1
          ) : (varnumber_T) 0);
        list_append_number (l, (fp != ((void *) 0)) ? (varnumber_T) fp -> coladd : (varnumber_T) 0);
    }
    else rettv -> vval.v_number = 0;
}

static void f_getqflist (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
    win_T * wp;
    if (rettv_list_alloc (rettv) == 1) {
        wp = ((void *) 0);
        if (argvars [0].v_type != 0) {
            wp = find_win_by_nr (&argvars[0], ((void *) 0));
            if (wp == ((void *) 0)) return;
        }
        (void) get_errorlist (wp, rettv -> vval.v_list);
    }
}

static void f_getreg (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * strregname;
    int regname;
    int arg2 = 0;
    int error = 0;
    if (argvars [0].v_type != 0) {
        strregname = get_tv_string_chk (&argvars[0]);
        error = strregname == ((void *) 0);
        if (argvars [1].v_type != 0) arg2 = get_tv_number_chk (&argvars[1], &error);
    }
    else strregname = vimvars [31].vv_di.di_tv.vval.v_string;
    regname = (strregname == ((void *) 0) ? '"' : *strregname);
    if (regname == 0) regname = '"';
    rettv -> v_type = 2;
    rettv -> vval.v_string = error ? ((void *) 0) : get_reg_contents (regname, 1, arg2);
}

static void f_getregtype (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * strregname;
    int regname;
    char_u buf [30 + 2];
    long reglen = 0;
    if (argvars [0].v_type != 0) {
        strregname = get_tv_string_chk (&argvars[0]);
        if (strregname == ((void *) 0)) {
            rettv -> v_type = 2;
            rettv -> vval.v_string = ((void *) 0);
            return;
        }
    }
    else strregname = vimvars [31].vv_di.di_tv.vval.v_string;
    regname = (strregname == ((void *) 0) ? '"' : *strregname);
    if (regname == 0) regname = '"';
    buf [0] = '\000';
    buf [1] = '\000';
    switch (get_reg_type (regname, &reglen)) {
    case 1 :
        buf [0] = 'V';
        break;
    case 0 :
        buf [0] = 'v';
        break;
    case 2 :
        buf [0] = 22;
        __builtin___sprintf_chk ((char *) buf + 1, 0, __builtin_object_size ((char *) buf + 1, 1 > 1), "%ld", reglen + 1);
        break;
    }
    rettv -> v_type = 2;
    rettv -> vval.v_string = vim_strsave (buf);
}

static void f_gettabvar (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    tabpage_T * tp;
    dictitem_T * v;
    char_u * varname;
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
    varname = get_tv_string_chk (&argvars[1]);
    tp = find_tabpage ((int) get_tv_number_chk (&argvars[0], ((void *) 0)));
    if (tp != ((void *) 0) && varname != ((void *) 0)) {
        v = find_var_in_ht (&tp->tp_vars.dv_hashtab, varname, 0);
        if (v != ((void *) 0)) copy_tv (&v->di_tv, rettv);
    }
}

static void f_gettabwinvar (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    getwinvar (argvars, rettv, 1);
}

static void f_getwinposx (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = -1;
}

static void f_getwinposy (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = -1;
}

static win_T * find_win_by_nr (vp, tp)
    typval_T * vp;
    tabpage_T * tp;
{
    win_T * wp;
    int nr;
    nr = get_tv_number_chk (vp, ((void *) 0));
    if (nr < 0) return ((void *) 0);
    if (nr == 0) return curwin;
    for (wp = (tp == ((void *) 0) || tp == curtab) ? firstwin : tp -> tp_firstwin; wp != ((void *) 0); wp = wp -> w_next) if (
      --nr <= 0) break;
    return wp;
}

static void f_getwinvar (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    getwinvar (argvars, rettv, 0);
}

static void getwinvar (argvars, rettv, off)
    typval_T * argvars;
    typval_T * rettv;
    int off;
{
    win_T * win, * oldcurwin;
    char_u * varname;
    dictitem_T * v;
    tabpage_T * tp;
    if (off == 1) tp = find_tabpage ((int) get_tv_number_chk (&argvars[0], ((void *) 0)));
    else tp = curtab;
    win = find_win_by_nr (&argvars[off], tp);
    varname = get_tv_string_chk (&argvars[off+1]);
    ++emsg_off;
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
    if (win != ((void *) 0) && varname != ((void *) 0)) {
        oldcurwin = curwin;
        curwin = win;
        curbuf = win -> w_buffer;
        if (*varname == '&') get_option_tv (&varname, rettv, 1);
        else {
            if (*varname == '\000') varname = (char_u *) "w:" + 2;
            v = find_var_in_ht (&win->w_vars.dv_hashtab, varname, 0);
            if (v != ((void *) 0)) copy_tv (&v->di_tv, rettv);
        }
        curwin = oldcurwin;
        curbuf = curwin -> w_buffer;
    }
    --emsg_off;
}

static void f_glob (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int flags = 64 | 4;
    expand_T xpc;
    int error = 0;
    if (argvars [1].v_type != 0 && get_tv_number_chk (&argvars[1], &error)) flags |= 32;
    rettv -> v_type = 2;
    if (!error) {
        ExpandInit (&xpc);
        xpc.xp_context = 2;
        rettv -> vval.v_string = ExpandOne (&xpc, get_tv_string (&argvars[0]), ((void *) 0), flags, 6);
    }
    else rettv -> vval.v_string = ((void *) 0);
}

static void f_globpath (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int flags = 0;
    char_u buf1 [30];
    char_u * file = get_tv_string_buf_chk (&argvars[1], buf1);
    int error = 0;
    if (argvars [2].v_type != 0 && get_tv_number_chk (&argvars[2], &error)) flags |= 32;
    rettv -> v_type = 2;
    if (file == ((void *) 0) || error) rettv -> vval.v_string = ((void *) 0);
    else rettv -> vval.v_string = globpath (get_tv_string (&argvars[0]), file, flags);
}

static void f_has (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int i;
    char_u * name;
    int n = 0;
    static char * (has_list []) =
    {"mac", "macunix", "unix", "autocmd", "builtin_terms", "byte_offset", "cindent", "clipboard", "cmdline_compl",
          "cmdline_hist", "comments", "cryptv", "cursorbind", "cursorshape", "dialog_con", "diff", "digraphs", "eval",
          "ex_extra", "extra_search", "file_in_path", "filterpipe", "find_in_path", "float", "folding", "fork", "insert_expand"
          , "jumplist", "libcall", "linebreak", "lispindent", "listcmds", "localmap", "menu", "mksession", "modify_fname",
          "mouse", "mouse_xterm", "multi_lang", "path_extra", "persistent_undo", "postscript", "printer", "reltime", "quickfix"
          , "scrollbind", "showcmd", "cmdline_info", "signs", "smartindent", "startuptime", "statusline", "netbeans_intg",
          "spell", "syntax", "tag_binary", "tag_old_static", "terminfo", "termresponse", "textobjects", "tgetent", "title",
          "user-commands", "user_commands", "viminfo", "vertsplit", "virtualedit", "visual", "visualextra", "vreplace",
          "wildignore", "wildmenu", "windows", "writebackup", ((void *) 0)};
    name = get_tv_string (&argvars[0]);
    for (i = 0; has_list [i] != ((void *) 0); ++i) if (strcasecmp ((char *) (name), (char *) (has_list [i])) == 0) {
        n = 1;
        break;
    }
    if (n == 0) {
        if (strncasecmp ((char *) (name), (char *) ("patch"), (size_t) (5)) == 0) n = has_patch (atoi ((char *) name + 5));
        else if (strcasecmp ((char *) (name), (char *) ("vim_starting")) == 0) n = (starting != 0);
        else if (strcasecmp ((char *) (name), (char *) ("syntax_items")) == 0) n = syntax_present (curwin);
        else if (strcasecmp ((char *) (name), (char *) ("netbeans_enabled")) == 0) n = netbeans_active ();
    }
    rettv -> vval.v_number = n;
}

static void f_has_key (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    if (argvars [0].v_type != 5) {
        emsg ((char_u *) (((char *) (e_dictreq))));
        return;
    }
    if (argvars [0].vval.v_dict == ((void *) 0)) return;
    rettv -> vval.v_number = dict_find (argvars [0].vval.v_dict, get_tv_string (&argvars[1]), -1) != ((void *) 0);
}

static void f_haslocaldir (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = (curwin -> w_localdir != ((void *) 0));
}

static void f_hasmapto (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * name;
    char_u * mode;
    char_u buf [30];
    int abbr = 0;
    name = get_tv_string (&argvars[0]);
    if (argvars [1].v_type == 0) mode = (char_u *) "nvo";
    else {
        mode = get_tv_string_buf (&argvars[1], buf);
        if (argvars [2].v_type != 0) abbr = get_tv_number (&argvars[2]);
    }
    if (map_to_exists (name, mode, abbr)) rettv -> vval.v_number = 1;
    else rettv -> vval.v_number = 0;
}

static void f_histadd (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    int histype;
    char_u * str;
    char_u buf [30];
    rettv -> vval.v_number = 0;
    if (check_restricted () || check_secure ()) return;
    str = get_tv_string_chk (&argvars[0]);
    histype = str != ((void *) 0) ? get_histtype (str) : -1;
    if (histype >= 0) {
        str = get_tv_string_buf (&argvars[1], buf);
        if (*str != '\000') {
            init_history ();
            add_to_history (histype, str, 0, '\000');
            rettv -> vval.v_number = 1;
            return;
        }
    }
}

static void f_histdel (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
    int n;
    char_u buf [30];
    char_u * str;
    str = get_tv_string_chk (&argvars[0]);
    if (str == ((void *) 0)) n = 0;
    else if (argvars [1].v_type == 0) n = clr_history (get_histtype (str));
    else if (argvars [1].v_type == 1) n = del_history_idx (get_histtype (str), (int) get_tv_number (&argvars[1]));
    else n = del_history_entry (get_histtype (str), get_tv_string_buf (&argvars[1], buf));
    rettv -> vval.v_number = n;
}

static void f_histget (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    int type;
    int idx;
    char_u * str;
    str = get_tv_string_chk (&argvars[0]);
    if (str == ((void *) 0)) rettv -> vval.v_string = ((void *) 0);
    else {
        type = get_histtype (str);
        if (argvars [1].v_type == 0) idx = get_history_idx (type);
        else idx = (int) get_tv_number_chk (&argvars[1], ((void *) 0));
        rettv -> vval.v_string = vim_strsave (get_history_entry (type, idx));
    }
    rettv -> v_type = 2;
}

static void f_histnr (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    int i;
    char_u * history = get_tv_string_chk (&argvars[0]);
    i = history == ((void *) 0) ? 0 - 1 : get_histtype (history);
    if (i >= 0 && i < 5) i = get_history_idx (i);
    else i = -1;
    rettv -> vval.v_number = i;
}

static void f_hlID (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_number = syn_name2id (get_tv_string (&argvars[0]));
}

static void f_hlexists (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_number = highlight_exists (get_tv_string (&argvars[0]));
}

static void f_hostname (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    char_u hostname [256];
    mch_get_host_name (hostname, 256);
    rettv -> v_type = 2;
    rettv -> vval.v_string = vim_strsave (hostname);
}

static void f_iconv (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
}

static void f_indent (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    linenr_T lnum;
    lnum = get_tv_lnum (argvars);
    if (lnum >= 1 && lnum <= curbuf -> b_ml.ml_line_count) rettv -> vval.v_number = get_indent_lnum (lnum);
    else rettv -> vval.v_number = -1;
}

static void f_index (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    list_T * l;
    listitem_T * item;
    long idx = 0;
    int ic = 0;
    rettv -> vval.v_number = -1;
    if (argvars [0].v_type != 4) {
        emsg ((char_u *) (((char *) (e_listreq))));
        return;
    }
    l = argvars [0].vval.v_list;
    if (l != ((void *) 0)) {
        item = l -> lv_first;
        if (argvars [2].v_type != 0) {
            int error = 0;
            item = list_find (l, get_tv_number_chk (&argvars[2], &error));
            idx = l -> lv_idx;
            if (argvars [3].v_type != 0) ic = get_tv_number_chk (&argvars[3], &error);
            if (error) item = ((void *) 0);
        }
        for (; item != ((void *) 0); item = item -> li_next, ++idx) if (tv_equal (&item->li_tv, &argvars[1], ic)) {
            rettv -> vval.v_number = idx;
            break;
        }
    }
}

static int inputsecret_flag = 0;
static void get_user_input (typval_T * argvars, typval_T * rettv, int inputdialog);

static void get_user_input (argvars, rettv, inputdialog)
    typval_T * argvars;
    typval_T * rettv;
    int inputdialog;
{
    char_u * prompt = get_tv_string_chk (&argvars[0]);
    char_u * p = ((void *) 0);
    int c;
    char_u buf [30];
    int cmd_silent_save = cmd_silent;
    char_u * defstr = (char_u *) "";
    int xp_type = 0;
    char_u * xp_arg = ((void *) 0);
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
    cmd_silent = 0;
    if (prompt != ((void *) 0)) {
        p = vim_strrchr (prompt, '\n');
        if (p == ((void *) 0)) p = prompt;
        else {
            ++p;
            c = *p;
            * p = '\000';
            msg_start ();
            msg_clr_eos ();
            msg_puts_attr (prompt, echo_attr);
            msg_didout = 0;
            msg_starthere ();
            * p = c;
        }
        cmdline_row = msg_row;
        if (argvars [1].v_type != 0) {
            defstr = get_tv_string_buf_chk (&argvars[1], buf);
            if (defstr != ((void *) 0)) stuffReadbuffSpec (defstr);
            if (!inputdialog && argvars [2].v_type != 0) {
                char_u * xp_name;
                int xp_namelen;
                long argt;
                rettv -> vval.v_string = ((void *) 0);
                xp_name = get_tv_string_buf_chk (&argvars[2], buf);
                if (xp_name == ((void *) 0)) return;
                xp_namelen = (int) strlen ((char *) (xp_name));
                if (parse_compl_arg (xp_name, xp_namelen, &xp_type, &argt, &xp_arg) == 0) return;
            }
        }
        if (defstr != ((void *) 0)) rettv -> vval.v_string = getcmdline_prompt (inputsecret_flag ? '\000' : '@', p, echo_attr,
          xp_type, xp_arg);
        vim_free (xp_arg);
        need_wait_return = 0;
        msg_didout = 0;
    }
    cmd_silent = cmd_silent_save;
}

static void f_input (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    get_user_input (argvars, rettv, 0);
}

static void f_inputdialog (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    get_user_input (argvars, rettv, 1);
}

static void f_inputlist (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    listitem_T * li;
    int selected;
    int mouse_used;
    if (argvars [0].v_type != 4 || argvars [0].vval.v_list == ((void *) 0)) {
        emsg2 ((char_u *) (((char *) (e_listarg))), (char_u *) ("inputlist()"));
        return;
    }
    msg_start ();
    msg_row = Rows - 1;
    lines_left = Rows;
    msg_scroll = 1;
    msg_clr_eos ();
    for (li = argvars [0].vval.v_list -> lv_first; li != ((void *) 0); li = li -> li_next) {
        msg_puts (get_tv_string (&li->li_tv));
        msg_putchar ('\n');
    }
    selected = prompt_for_number (&mouse_used);
    if (mouse_used) selected -= lines_left;
    rettv -> vval.v_number = selected;
}

static garray_T ga_userinput =
{0, 0, sizeof (tasave_T), 4, ((void *) 0)};

static void f_inputrestore (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    if (ga_userinput.ga_len > 0) {
        --ga_userinput.ga_len;
        restore_typeahead ((tasave_T *) (ga_userinput.ga_data) + ga_userinput.ga_len);
    }
    else if (p_verbose > 1) {
        verb_msg ((char_u *) ((char *) ("called inputrestore() more often than inputsave()")));
        rettv -> vval.v_number = 1;
    }
}

static void f_inputsave (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    if (ga_grow (&ga_userinput, 1) == 1) {
        save_typeahead ((tasave_T *) (ga_userinput.ga_data) + ga_userinput.ga_len);
        ++ga_userinput.ga_len;
    }
    else rettv -> vval.v_number = 1;
}

static void f_inputsecret (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    ++cmdline_star;
    ++inputsecret_flag;
    f_input (argvars, rettv);
    --cmdline_star;
    --inputsecret_flag;
}

static void f_insert (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    long before = 0;
    listitem_T * item;
    list_T * l;
    int error = 0;
    if (argvars [0].v_type != 4) emsg2 ((char_u *) (((char *) (e_listarg))), (char_u *) ("insert()"));
    else if ((l = argvars [0].vval.v_list) != ((void *) 0) && !tv_check_lock(l->lv_lock,(char_u*)"insert()")) {
        if (argvars [2].v_type != 0) before = get_tv_number_chk (&argvars[2], &error);
        if (error) return;
        if (before == l -> lv_len) item = ((void *) 0);
        else {
            item = list_find (l, before);
            if (item == ((void *) 0)) {
                emsgn ((char_u *) (((char *) (e_listidx))), (long) (before));
                l = ((void *) 0);
            }
        }
        if (l != ((void *) 0)) {
            list_insert_tv (l, &argvars[1], item);
            copy_tv (&argvars[0], rettv);
        }
    }
}

static void f_isdirectory (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_number = mch_isdir (get_tv_string (&argvars[0]));
}

static void f_islocked (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    lval_T lv;
    char_u * end;
    dictitem_T * di;
    rettv -> vval.v_number = -1;
    end = get_lval (get_tv_string (&argvars[0]), ((void *) 0), &lv, 0, 0, 0, 2);
    if (end != ((void *) 0) && lv.ll_name != ((void *) 0)) {
        if (*end != '\000') emsg ((char_u *) (((char *) (e_trailing))));
        else {
            if (lv.ll_tv == ((void *) 0)) {
                if (check_changedtick (lv.ll_name)) rettv -> vval.v_number = 1;
                else {
                    di = find_var (lv.ll_name, ((void *) 0));
                    if (di != ((void *) 0)) {
                        rettv -> vval.v_number = ((di -> di_flags & 8) || tv_islocked (&di->di_tv));
                    }
                }
            }
            else if (lv.ll_range) emsg ((char_u *) (((char *) ("E786: Range not allowed"))));
            else if (lv.ll_newkey != ((void *) 0)) emsg2 ((char_u *) (((char *) (e_dictkey))), (char_u *) (lv.ll_newkey));
            else if (lv.ll_list != ((void *) 0)) rettv -> vval.v_number = tv_islocked (&lv.ll_li->li_tv);
            else rettv -> vval.v_number = tv_islocked (&lv.ll_di->di_tv);
        }
    }
    clear_lval (&lv);
}

static void dict_list (typval_T * argvars, typval_T * rettv, int what);

static void dict_list (argvars, rettv, what)
    typval_T * argvars;
    typval_T * rettv;
    int what;
{
    list_T * l2;
    dictitem_T * di;
    hashitem_T * hi;
    listitem_T * li;
    listitem_T * li2;
    dict_T * d;
    int todo;
    if (argvars [0].v_type != 5) {
        emsg ((char_u *) (((char *) (e_dictreq))));
        return;
    }
    if ((d = argvars [0].vval.v_dict) == ((void *) 0)) return;
    if (rettv_list_alloc (rettv) == 0) return;
    todo = (int) d -> dv_hashtab.ht_used;
    for (hi = d -> dv_hashtab.ht_array; todo > 0; ++hi) {
        if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
            --todo;
            di = ((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi)));
            li = listitem_alloc ();
            if (li == ((void *) 0)) break;
            list_append (rettv -> vval.v_list, li);
            if (what == 0) {
                li -> li_tv.v_type = 2;
                li -> li_tv.v_lock = 0;
                li -> li_tv.vval.v_string = vim_strsave (di -> di_key);
            }
            else if (what == 1) {
                copy_tv (&di->di_tv, &li->li_tv);
            }
            else {
                l2 = list_alloc ();
                li -> li_tv.v_type = 4;
                li -> li_tv.v_lock = 0;
                li -> li_tv.vval.v_list = l2;
                if (l2 == ((void *) 0)) break;
                ++l2->lv_refcount;
                li2 = listitem_alloc ();
                if (li2 == ((void *) 0)) break;
                list_append (l2, li2);
                li2 -> li_tv.v_type = 2;
                li2 -> li_tv.v_lock = 0;
                li2 -> li_tv.vval.v_string = vim_strsave (di -> di_key);
                li2 = listitem_alloc ();
                if (li2 == ((void *) 0)) break;
                list_append (l2, li2);
                copy_tv (&di->di_tv, &li2->li_tv);
            }
        }
    }
}

static void f_items (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    dict_list (argvars, rettv, 2);
}

static void f_join (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    garray_T ga;
    char_u * sep;
    if (argvars [0].v_type != 4) {
        emsg ((char_u *) (((char *) (e_listreq))));
        return;
    }
    if (argvars [0].vval.v_list == ((void *) 0)) return;
    if (argvars [1].v_type == 0) sep = (char_u *) " ";
    else sep = get_tv_string_chk (&argvars[1]);
    rettv -> v_type = 2;
    if (sep != ((void *) 0)) {
        ga_init2 (&ga, (int) sizeof (char), 80);
        list_join (&ga, argvars [0].vval.v_list, sep, 1, 0);
        ga_append (&ga, '\000');
        rettv -> vval.v_string = (char_u *) ga.ga_data;
    }
    else rettv -> vval.v_string = ((void *) 0);
}

static void f_keys (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    dict_list (argvars, rettv, 0);
}

static void f_last_buffer_nr (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    int n = 0;
    buf_T * buf;
    for (buf = firstbuf; buf != ((void *) 0); buf = buf -> b_next) if (n < buf -> b_fnum) n = buf -> b_fnum;
    rettv -> vval.v_number = n;
}

static void f_len (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    switch (argvars [0].v_type) {
    case 2 :
    case 1 :
        rettv -> vval.v_number = (varnumber_T) strlen ((char *) (get_tv_string (&argvars[0])));
        break;
    case 4 :
        rettv -> vval.v_number = list_len (argvars [0].vval.v_list);
        break;
    case 5 :
        rettv -> vval.v_number = dict_len (argvars [0].vval.v_dict);
        break;
    default :
        emsg ((char_u *) (((char *) ("E701: Invalid type for len()"))));
        break;
    }
}

static void libcall_common (typval_T * argvars, typval_T * rettv, int type);

static void libcall_common (argvars, rettv, type)
    typval_T * argvars;
    typval_T * rettv;
    int type;
{
    char_u * string_in;
    char_u * * string_result;
    int nr_result;
    rettv -> v_type = type;
    if (type != 1) rettv -> vval.v_string = ((void *) 0);
    if (check_restricted () || check_secure ()) return;
    if (argvars [0].v_type == 2 && argvars [1].v_type == 2) {
        string_in = ((void *) 0);
        if (argvars [2].v_type == 2) string_in = argvars [2].vval.v_string;
        if (type == 1) string_result = ((void *) 0);
        else string_result = &rettv->vval.v_string;
        if (mch_libcall (argvars [0].vval.v_string, argvars [1].vval.v_string, string_in, argvars [2].vval.v_number,
          string_result, &nr_result) == 1 && type == 1) rettv -> vval.v_number = nr_result;
    }
}

static void f_libcall (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    libcall_common (argvars, rettv, 2);
}

static void f_libcallnr (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    libcall_common (argvars, rettv, 1);
}

static void f_line (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    linenr_T lnum = 0;
    pos_T * fp;
    int fnum;
    fp = var2fpos (&argvars[0], 1, &fnum);
    if (fp != ((void *) 0)) lnum = fp -> lnum;
    rettv -> vval.v_number = lnum;
}

static void f_line2byte (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    linenr_T lnum;
    lnum = get_tv_lnum (argvars);
    if (lnum < 1 || lnum > curbuf -> b_ml.ml_line_count + 1) rettv -> vval.v_number = -1;
    else rettv -> vval.v_number = ml_find_line_or_offset (curbuf, lnum, ((void *) 0));
    if (rettv -> vval.v_number >= 0) ++rettv->vval.v_number;
}

static void f_lispindent (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    pos_T pos;
    linenr_T lnum;
    pos = curwin -> w_cursor;
    lnum = get_tv_lnum (argvars);
    if (lnum >= 1 && lnum <= curbuf -> b_ml.ml_line_count) {
        curwin -> w_cursor.lnum = lnum;
        rettv -> vval.v_number = get_lisp_indent ();
        curwin -> w_cursor = pos;
    }
    else rettv -> vval.v_number = -1;
}

static void f_localtime (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = (varnumber_T) time (((void *) 0));
}

static void get_maparg (typval_T * argvars, typval_T * rettv, int exact);

static void get_maparg (argvars, rettv, exact)
    typval_T * argvars;
    typval_T * rettv;
    int exact;
{
    char_u * keys;
    char_u * which;
    char_u buf [30];
    char_u * keys_buf = ((void *) 0);
    char_u * rhs;
    int mode;
    garray_T ga;
    int abbr = 0;
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
    keys = get_tv_string (&argvars[0]);
    if (*keys == '\000') return;
    if (argvars [1].v_type != 0) {
        which = get_tv_string_buf_chk (&argvars[1], buf);
        if (argvars [2].v_type != 0) abbr = get_tv_number (&argvars[2]);
    }
    else which = (char_u *) "";
    if (which == ((void *) 0)) return;
    mode = get_map_mode (&which, 0);
    keys = replace_termcodes (keys, &keys_buf, 1, 1, 0);
    rhs = check_map (keys, mode, exact, 0, abbr);
    vim_free (keys_buf);
    if (rhs != ((void *) 0)) {
        ga_init (&ga);
        ga.ga_itemsize = 1;
        ga.ga_growsize = 40;
        while (*rhs != '\000') ga_concat (&ga, str2special (&rhs, 0));
        ga_append (&ga, '\000');
        rettv -> vval.v_string = (char_u *) ga.ga_data;
    }
}

static void f_log (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = log (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_log10 (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = log10 (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_map (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    filter_map (argvars, rettv, 1);
}

static void f_maparg (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    get_maparg (argvars, rettv, 1);
}

static void f_mapcheck (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    get_maparg (argvars, rettv, 0);
}

static void find_some_match (typval_T * argvars, typval_T * rettv, int start);

static void find_some_match (argvars, rettv, type)
    typval_T * argvars;
    typval_T * rettv;
    int type;
{
    char_u * str = ((void *) 0);
    char_u * expr = ((void *) 0);
    char_u * pat;
    regmatch_T regmatch;
    char_u patbuf [30];
    char_u strbuf [30];
    char_u * save_cpo;
    long start = 0;
    long nth = 1;
    colnr_T startcol = 0;
    int match = 0;
    list_T * l = ((void *) 0);
    listitem_T * li = ((void *) 0);
    long idx = 0;
    char_u * tofree = ((void *) 0);
    save_cpo = p_cpo;
    p_cpo = (char_u *) "";
    rettv -> vval.v_number = -1;
    if (type == 3) {
        if (rettv_list_alloc (rettv) == 0) goto theend;
    }
    else if (type == 2) {
        rettv -> v_type = 2;
        rettv -> vval.v_string = ((void *) 0);
    }
    if (argvars [0].v_type == 4) {
        if ((l = argvars [0].vval.v_list) == ((void *) 0)) goto theend;
        li = l -> lv_first;
    }
    else expr = str = get_tv_string (&argvars[0]);
    pat = get_tv_string_buf_chk (&argvars[1], patbuf);
    if (pat == ((void *) 0)) goto theend;
    if (argvars [2].v_type != 0) {
        int error = 0;
        start = get_tv_number_chk (&argvars[2], &error);
        if (error) goto theend;
        if (l != ((void *) 0)) {
            li = list_find (l, start);
            if (li == ((void *) 0)) goto theend;
            idx = l -> lv_idx;
        }
        else {
            if (start < 0) start = 0;
            if (start > (long) strlen ((char *) (str))) goto theend;
            if (argvars [3].v_type != 0) startcol = start;
            else str += start;
        }
        if (argvars [3].v_type != 0) nth = get_tv_number_chk (&argvars[3], &error);
        if (error) goto theend;
    }
    regmatch.regprog = vim_regcomp (pat, 1 + 2);
    if (regmatch.regprog != ((void *) 0)) {
        regmatch.rm_ic = p_ic;
        for (;;) {
            if (l != ((void *) 0)) {
                if (li == ((void *) 0)) {
                    match = 0;
                    break;
                }
                vim_free (tofree);
                str = echo_string (&li->li_tv, &tofree, strbuf, 0);
                if (str == ((void *) 0)) break;
            }
            match = vim_regexec_nl (&regmatch, str, (colnr_T) startcol);
            if (match && --nth <= 0) break;
            if (l == ((void *) 0) && !match) break;
            if (l != ((void *) 0)) {
                li = li -> li_next;
                ++idx;
            }
            else {
                startcol = (colnr_T) (regmatch.startp [0] + 1 - str);
            }
        }
        if (match) {
            if (type == 3) {
                int i;
                for (i = 0; i < 10; ++i) {
                    if (regmatch.endp [i] == ((void *) 0)) {
                        if (list_append_string (rettv -> vval.v_list, (char_u *) "", 0) == 0) break;
                    }
                    else if (list_append_string (rettv -> vval.v_list, regmatch.startp [i], (int) (regmatch.endp [i] - regmatch
                      .startp [i])) == 0) break;
                }
            }
            else if (type == 2) {
                if (l != ((void *) 0)) copy_tv (&li->li_tv, rettv);
                else rettv -> vval.v_string = vim_strnsave (regmatch.startp [0], (int) (regmatch.endp [0] - regmatch.startp [0]
                  ));
            }
            else if (l != ((void *) 0)) rettv -> vval.v_number = idx;
            else {
                if (type != 0) rettv -> vval.v_number = (varnumber_T) (regmatch.startp [0] - str);
                else rettv -> vval.v_number = (varnumber_T) (regmatch.endp [0] - str);
                rettv -> vval.v_number += (varnumber_T) (str - expr);
            }
        }
        vim_free (regmatch.regprog);
    }
    theend : vim_free (tofree);
    p_cpo = save_cpo;
}

static void f_match (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    find_some_match (argvars, rettv, 1);
}

static void f_matchadd (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u buf [30];
    char_u * grp = get_tv_string_buf_chk (&argvars[0], buf);
    char_u * pat = get_tv_string_buf_chk (&argvars[1], buf);
    int prio = 10;
    int id = -1;
    int error = 0;
    rettv -> vval.v_number = -1;
    if (grp == ((void *) 0) || pat == ((void *) 0)) return;
    if (argvars [2].v_type != 0) {
        prio = get_tv_number_chk (&argvars[2], &error);
        if (argvars [3].v_type != 0) id = get_tv_number_chk (&argvars[3], &error);
    }
    if (error == 1) return;
    if (id >= 1 && id <= 3) {
        emsgn ((char_u *) ("E798: ID is reserved for \":match\": %ld"), (long) (id));
        return;
    }
    rettv -> vval.v_number = match_add (curwin, grp, pat, prio, id);
}

static void f_matcharg (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    if (rettv_list_alloc (rettv) == 1) {
        int id = get_tv_number (&argvars[0]);
        matchitem_T * m;
        if (id >= 1 && id <= 3) {
            if ((m = (matchitem_T *) get_match (curwin, id)) != ((void *) 0)) {
                list_append_string (rettv -> vval.v_list, syn_id2name (m -> hlg_id), -1);
                list_append_string (rettv -> vval.v_list, m -> pattern, -1);
            }
            else {
                list_append_string (rettv -> vval.v_list, '\000', -1);
                list_append_string (rettv -> vval.v_list, '\000', -1);
            }
        }
    }
}

static void f_matchdelete (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_number = match_delete (curwin, (int) get_tv_number (&argvars[0]), 1);
}

static void f_matchend (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    find_some_match (argvars, rettv, 0);
}

static void f_matchlist (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    find_some_match (argvars, rettv, 3);
}

static void f_matchstr (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    find_some_match (argvars, rettv, 2);
}

static void max_min (typval_T * argvars, typval_T * rettv, int domax);

static void max_min (argvars, rettv, domax)
    typval_T * argvars;
    typval_T * rettv;
    int domax;
{
    long n = 0;
    long i;
    int error = 0;
    if (argvars [0].v_type == 4) {
        list_T * l;
        listitem_T * li;
        l = argvars [0].vval.v_list;
        if (l != ((void *) 0)) {
            li = l -> lv_first;
            if (li != ((void *) 0)) {
                n = get_tv_number_chk (&li->li_tv, &error);
                for (;;) {
                    li = li -> li_next;
                    if (li == ((void *) 0)) break;
                    i = get_tv_number_chk (&li->li_tv, &error);
                    if (domax ? i > n : i < n) n = i;
                }
            }
        }
    }
    else if (argvars [0].v_type == 5) {
        dict_T * d;
        int first = 1;
        hashitem_T * hi;
        int todo;
        d = argvars [0].vval.v_dict;
        if (d != ((void *) 0)) {
            todo = (int) d -> dv_hashtab.ht_used;
            for (hi = d -> dv_hashtab.ht_array; todo > 0; ++hi) {
                if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
                    --todo;
                    i = get_tv_number_chk (&((dictitem_T*)((hi)->hi_key-(dumdi.di_key-(char_u*)&dumdi))) -> di_tv, &error);
                    if (first) {
                        n = i;
                        first = 0;
                    }
                    else if (domax ? i > n : i < n) n = i;
                }
            }
        }
    }
    else emsg ((char_u *) (((char *) (e_listdictarg))));
    rettv -> vval.v_number = error ? 0 : n;
}

static void f_max (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    max_min (argvars, rettv, 1);
}

static void f_min (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    max_min (argvars, rettv, 0);
}

static int mkdir_recurse (char_u * dir, int prot);

static int mkdir_recurse (dir, prot)
    char_u * dir;
    int prot;
{
    char_u * p;
    char_u * updir;
    int r = 0;
    p = gettail_sep (dir);
    if (p <= get_past_head (dir)) return 1;
    updir = vim_strnsave (dir, (int) (p - dir));
    if (updir == ((void *) 0)) return 0;
    if (mch_isdir (updir)) r = 1;
    else if (mkdir_recurse (updir, prot) == 1) r = vim_mkdir_emsg (updir, prot);
    vim_free (updir);
    return r;
}

static void f_mkdir (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * dir;
    char_u buf [30];
    int prot = 0755;
    rettv -> vval.v_number = 0;
    if (check_restricted () || check_secure ()) return;
    dir = get_tv_string_buf (&argvars[0], buf);
    if (argvars [1].v_type != 0) {
        if (argvars [2].v_type != 0) prot = get_tv_number_chk (&argvars[2], ((void *) 0));
        if (prot != -1 && strcmp ((char *) (get_tv_string (&argvars[1])), (char *) ("p")) == 0) mkdir_recurse (dir, prot);
    }
    rettv -> vval.v_number = prot != -1 ? vim_mkdir_emsg (dir, prot) : 0;
}

static void f_mode (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u buf [3];
    buf [1] = '\000';
    buf [2] = '\000';
    if (VIsual_active) {
        if (VIsual_select) buf [0] = VIsual_mode + 's' - 'v';
        else buf [0] = VIsual_mode;
    }
    else if (State == (0x200 + 0x01) || State == 0x300 || State == 0x400 || State == 0x800) {
        buf [0] = 'r';
        if (State == 0x300) buf [1] = 'm';
        else if (State == 0x800) buf [1] = '?';
    }
    else if (State == 0x600) buf [0] = '!';
    else if (State & 0x10) {
        if (State & 0x80) {
            buf [0] = 'R';
            buf [1] = 'v';
        }
        else if (State & 0x40) buf [0] = 'R';
        else buf [0] = 'i';
    }
    else if (State & 0x08) {
        buf [0] = 'c';
        if (exmode_active) buf [1] = 'v';
    }
    else if (exmode_active) {
        buf [0] = 'c';
        buf [1] = 'e';
    }
    else {
        buf [0] = 'n';
        if (finish_op) buf [1] = 'o';
    }
    if (!non_zero_arg(&argvars[0])) buf [1] = '\000';
    rettv -> vval.v_string = vim_strsave (buf);
    rettv -> v_type = 2;
}

static void f_nextnonblank (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    linenr_T lnum;
    for (lnum = get_tv_lnum (argvars);; ++lnum) {
        if (lnum < 0 || lnum > curbuf -> b_ml.ml_line_count) {
            lnum = 0;
            break;
        }
        if (*skipwhite(ml_get(lnum)) != '\000') break;
    }
    rettv -> vval.v_number = lnum;
}

static void f_nr2char (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u buf [30];
    {
        buf [0] = (char_u) get_tv_number (&argvars[0]);
        buf [1] = '\000';
    }
    rettv -> v_type = 2;
    rettv -> vval.v_string = vim_strsave (buf);
}

static void f_pathshorten (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * p;
    rettv -> v_type = 2;
    p = get_tv_string_chk (&argvars[0]);
    if (p == ((void *) 0)) rettv -> vval.v_string = ((void *) 0);
    else {
        p = vim_strsave (p);
        rettv -> vval.v_string = p;
        if (p != ((void *) 0)) shorten_dir (p);
    }
}

static void f_pow (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T fx, fy;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &fx) == 1 && get_float_arg (&argvars[1], &fy) == 1) rettv -> vval.v_float = pow (fx, fy);
    else rettv -> vval.v_float = 0.0;
}

static void f_prevnonblank (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    linenr_T lnum;
    lnum = get_tv_lnum (argvars);
    if (lnum < 1 || lnum > curbuf -> b_ml.ml_line_count) lnum = 0;
    else while (lnum >= 1 && *skipwhite(ml_get(lnum)) == '\000') --lnum;
    rettv -> vval.v_number = lnum;
}

static va_list ap;

static void f_printf (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
    {
        char_u buf [30];
        int len;
        char_u * s;
        int saved_did_emsg = did_emsg;
        char * fmt;
        did_emsg = 0;
        fmt = (char *) get_tv_string_buf (&argvars[0], buf);
        len = vim_vsnprintf (((void *) 0), 0, fmt, ap, argvars + 1);
        if (!did_emsg) {
            s = alloc (len + 1);
            if (s != ((void *) 0)) {
                rettv -> vval.v_string = s;
                (void) vim_vsnprintf ((char *) s, len + 1, fmt, ap, argvars + 1);
            }
        }
        did_emsg |= saved_did_emsg;
    }
}

static void f_pumvisible (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
    if (pum_visible ()) rettv -> vval.v_number = 1;
}

static void f_range (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    long start;
    long end;
    long stride = 1;
    long i;
    int error = 0;
    start = get_tv_number_chk (&argvars[0], &error);
    if (argvars [1].v_type == 0) {
        end = start - 1;
        start = 0;
    }
    else {
        end = get_tv_number_chk (&argvars[1], &error);
        if (argvars [2].v_type != 0) stride = get_tv_number_chk (&argvars[2], &error);
    }
    if (error) return;
    if (stride == 0) emsg ((char_u *) (((char *) ("E726: Stride is zero"))));
    else if (stride > 0 ? end + 1 < start : end - 1 > start) emsg ((char_u *) (((char *) ("E727: Start past end"))));
    else {
        if (rettv_list_alloc (rettv) == 1) for (i = start; stride > 0 ? i <= end : i >= end; i += stride) if (
          list_append_number (rettv -> vval.v_list, (varnumber_T) i) == 0) break;
    }
}

static void f_readfile (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int binary = 0;
    char_u * fname;
    FILE * fd;
    listitem_T * li;
    char_u buf [200];
    int readlen;
    int buflen;
    int filtd;
    int tolist;
    int chop;
    char_u * prev = ((void *) 0);
    int prevlen = 0;
    char_u * s;
    int len;
    long maxline = (0x7fffffffL);
    long cnt = 0;
    if (argvars [1].v_type != 0) {
        if (strcmp ((char *) (get_tv_string (&argvars[1])), (char *) ("b")) == 0) binary = 1;
        if (argvars [2].v_type != 0) maxline = get_tv_number (&argvars[2]);
    }
    if (rettv_list_alloc (rettv) == 0) return;
    fname = get_tv_string (&argvars[0]);
    if (*fname == '\000' || (fd = fopen (((char *) fname), ("rb"))) == ((void *) 0)) {
        emsg2 ((char_u *) (((char *) (e_notopen))), (char_u *) (*fname == '\000' ? (char_u *) ((char *) ("<empty>")) : fname));
        return;
    }
    filtd = 0;
    while (cnt < maxline || maxline < 0) {
        readlen = (int) fread (buf + filtd, 1, 200 - filtd, fd);
        buflen = filtd + readlen;
        tolist = 0;
        for (; filtd < buflen || readlen <= 0; ++filtd) {
            if (buf [filtd] == '\n' || readlen <= 0) {
                if (!binary && readlen == 0 && filtd == 0) break;
                chop = 0;
                if (!binary) while (filtd - chop - 1 >= tolist && buf [filtd - chop - 1] == '\r') ++chop;
                len = filtd - tolist - chop;
                if (prev == ((void *) 0)) s = vim_strnsave (buf + tolist, len);
                else {
                    s = alloc ((unsigned) (prevlen + len + 1));
                    if (s != ((void *) 0)) {
                        ((__builtin_object_size ((char *) (s), 0) != (size_t) - 1) ? __builtin___memmove_chk ((char *) (s), (
                          char *) (prev), prevlen, __builtin_object_size ((char *) (s), 0)) : __inline_memmove_chk ((char *) (s
                          ), (char *) (prev), prevlen));
                        vim_free (prev);
                        prev = ((void *) 0);
                        ((__builtin_object_size ((char *) (s + prevlen), 0) != (size_t) - 1) ? __builtin___memmove_chk ((char *
                          ) (s + prevlen), (char *) (buf + tolist), len, __builtin_object_size ((char *) (s + prevlen), 0)) :
                          __inline_memmove_chk ((char *) (s + prevlen), (char *) (buf + tolist), len));
                        s [prevlen + len] = '\000';
                    }
                }
                tolist = filtd + 1;
                li = listitem_alloc ();
                if (li == ((void *) 0)) {
                    vim_free (s);
                    break;
                }
                li -> li_tv.v_type = 2;
                li -> li_tv.v_lock = 0;
                li -> li_tv.vval.v_string = s;
                list_append (rettv -> vval.v_list, li);
                if (++cnt >= maxline && maxline >= 0) break;
                if (readlen <= 0) break;
            }
            else if (buf [filtd] == '\000') buf [filtd] = '\n';
        }
        if (readlen <= 0) break;
        if (tolist == 0) {
            if (prev == ((void *) 0)) {
                prev = vim_strnsave (buf, buflen);
                prevlen = buflen;
            }
            else {
                s = alloc ((unsigned) (prevlen + buflen));
                if (s != ((void *) 0)) {
                    ((__builtin_object_size ((char *) (s), 0) != (size_t) - 1) ? __builtin___memmove_chk ((char *) (s), (char *
                      ) (prev), prevlen, __builtin_object_size ((char *) (s), 0)) : __inline_memmove_chk ((char *) (s), (char *
                      ) (prev), prevlen));
                    ((__builtin_object_size ((char *) (s + prevlen), 0) != (size_t) - 1) ? __builtin___memmove_chk ((char *) (s
                      + prevlen), (char *) (buf), buflen, __builtin_object_size ((char *) (s + prevlen), 0)) :
                      __inline_memmove_chk ((char *) (s + prevlen), (char *) (buf), buflen));
                    vim_free (prev);
                    prev = s;
                    prevlen += buflen;
                }
            }
            filtd = 0;
        }
        else {
            ((__builtin_object_size ((char *) (buf), 0) != (size_t) - 1) ? __builtin___memmove_chk ((char *) (buf), (char *) (
              buf + tolist), buflen - tolist, __builtin_object_size ((char *) (buf), 0)) : __inline_memmove_chk ((char *) (buf)
              , (char *) (buf + tolist), buflen - tolist));
            filtd -= tolist;
        }
    }
    if (maxline < 0) while (cnt > -maxline) {
        listitem_remove (rettv -> vval.v_list, rettv -> vval.v_list -> lv_first);
        --cnt;
    }
    vim_free (prev);
    fclose (fd);
}

static int list2proftime (typval_T * arg, proftime_T * tm);

static int list2proftime (arg, tm)
    typval_T * arg;
    proftime_T * tm;
{
    long n1, n2;
    int error = 0;
    if (arg -> v_type != 4 || arg -> vval.v_list == ((void *) 0) || arg -> vval.v_list -> lv_len != 2) return 0;
    n1 = list_find_nr (arg -> vval.v_list, 0L, &error);
    n2 = list_find_nr (arg -> vval.v_list, 1L, &error);
    tm -> tv_sec = n1;
    tm -> tv_usec = n2;
    return error ? 0 : 1;
}

static void f_reltime (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    proftime_T res;
    proftime_T start;
    if (argvars [0].v_type == 0) {
        profile_start (&res);
    }
    else if (argvars [1].v_type == 0) {
        if (list2proftime (&argvars[0], &res) == 0) return;
        profile_end (&res);
    }
    else {
        if (list2proftime (&argvars[0], &start) == 0 || list2proftime (&argvars[1], &res) == 0) return;
        profile_sub (&res, &start);
    }
    if (rettv_list_alloc (rettv) == 1) {
        long n1, n2;
        n1 = res.tv_sec;
        n2 = res.tv_usec;
        list_append_number (rettv -> vval.v_list, (varnumber_T) n1);
        list_append_number (rettv -> vval.v_list, (varnumber_T) n2);
    }
}

static void f_reltimestr (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    proftime_T tm;
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
    if (list2proftime (&argvars[0], &tm) == 1) rettv -> vval.v_string = vim_strsave ((char_u *) profile_msg (&tm));
}

static void f_remote_expr (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
}

static void f_remote_foreground (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
}

static void f_remote_peek (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = -1;
}

static void f_remote_read (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    char_u * r = ((void *) 0);
    rettv -> v_type = 2;
    rettv -> vval.v_string = r;
}

static void f_remote_send (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
}

static void f_remove (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    list_T * l;
    listitem_T * item, * item2;
    listitem_T * li;
    long idx;
    long end;
    char_u * key;
    dict_T * d;
    dictitem_T * di;
    if (argvars [0].v_type == 5) {
        if (argvars [2].v_type != 0) emsg2 ((char_u *) (((char *) (e_toomanyarg))), (char_u *) ("remove()"));
        else if ((d = argvars [0].vval.v_dict) != ((void *) 0) && !tv_check_lock(d->dv_lock,(char_u*)"remove() argument")) {
            key = get_tv_string_chk (&argvars[1]);
            if (key != ((void *) 0)) {
                di = dict_find (d, key, -1);
                if (di == ((void *) 0)) emsg2 ((char_u *) (((char *) (e_dictkey))), (char_u *) (key));
                else {
                    * rettv = di -> di_tv;
                    init_tv (&di->di_tv);
                    dictitem_remove (d, di);
                }
            }
        }
    }
    else if (argvars [0].v_type != 4) emsg2 ((char_u *) (((char *) (e_listdictarg))), (char_u *) ("remove()"));
    else if ((l = argvars [0].vval.v_list) != ((void *) 0) && !tv_check_lock(l->lv_lock,(char_u*)"remove() argument")) {
        int error = 0;
        idx = get_tv_number_chk (&argvars[1], &error);
        if (error);
        else if ((item = list_find (l, idx)) == ((void *) 0)) emsgn ((char_u *) (((char *) (e_listidx))), (long) (idx));
        else {
            if (argvars [2].v_type == 0) {
                list_remove (l, item, item);
                * rettv = item -> li_tv;
                vim_free (item);
            }
            else {
                end = get_tv_number_chk (&argvars[2], &error);
                if (error);
                else if ((item2 = list_find (l, end)) == ((void *) 0)) emsgn ((char_u *) (((char *) (e_listidx))), (long) (end)
                  );
                else {
                    int cnt = 0;
                    for (li = item; li != ((void *) 0); li = li -> li_next) {
                        ++cnt;
                        if (li == item2) break;
                    }
                    if (li == ((void *) 0)) emsg ((char_u *) (((char *) (e_invrange))));
                    else {
                        list_remove (l, item, item2);
                        if (rettv_list_alloc (rettv) == 1) {
                            l = rettv -> vval.v_list;
                            l -> lv_first = item;
                            l -> lv_last = item2;
                            item -> li_prev = ((void *) 0);
                            item2 -> li_next = ((void *) 0);
                            l -> lv_len = cnt;
                        }
                    }
                }
            }
        }
    }
}

static void f_rename (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u buf [30];
    if (check_restricted () || check_secure ()) rettv -> vval.v_number = -1;
    else rettv -> vval.v_number = vim_rename (get_tv_string (&argvars[0]), get_tv_string_buf (&argvars[1], buf));
}

static void f_repeat (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * p;
    int n;
    int slen;
    int len;
    char_u * r;
    int i;
    n = get_tv_number (&argvars[1]);
    if (argvars [0].v_type == 4) {
        if (rettv_list_alloc (rettv) == 1 && argvars [0].vval.v_list != ((void *) 0)) while (n -- > 0) if (list_extend (rettv ->
          vval.v_list, argvars [0].vval.v_list, ((void *) 0)) == 0) break;
    }
    else {
        p = get_tv_string (&argvars[0]);
        rettv -> v_type = 2;
        rettv -> vval.v_string = ((void *) 0);
        slen = (int) strlen ((char *) (p));
        len = slen * n;
        if (len <= 0) return;
        r = alloc (len + 1);
        if (r != ((void *) 0)) {
            for (i = 0; i < n; i ++) ((__builtin_object_size ((char *) (r + i * slen), 0) != (size_t) - 1) ?
              __builtin___memmove_chk ((char *) (r + i * slen), (char *) (p), (size_t) slen, __builtin_object_size ((char *) (r
              + i * slen), 0)) : __inline_memmove_chk ((char *) (r + i * slen), (char *) (p), (size_t) slen));
            r [len] = '\000';
        }
        rettv -> vval.v_string = r;
    }
}

static void f_resolve (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * p;
    p = get_tv_string (&argvars[0]);
    {
        char_u buf [1024 + 1];
        char_u * cpy;
        int len;
        char_u * remain = ((void *) 0);
        char_u * q;
        int is_relative_to_current = 0;
        int has_trailing_pathsep = 0;
        int limit = 100;
        p = vim_strsave (p);
        if (p [0] == '.' && (vim_ispathsep (p [1]) || (p [1] == '.' && (vim_ispathsep (p [2]))))) is_relative_to_current = 1;
        len = strlen ((char *) (p));
        if (len > 0 && vim_ispathsep (*((p+len)-1))) has_trailing_pathsep = 1;
        q = getnextcomp (p);
        if (*q != '\000') {
            remain = vim_strsave (q - 1);
            q [-1] = '\000';
        }
        for (;;) {
            for (;;) {
                len = readlink ((char *) p, (char *) buf, 1024);
                if (len <= 0) break;
                buf [len] = '\000';
                if (limit -- == 0) {
                    vim_free (p);
                    vim_free (remain);
                    emsg ((char_u *) (((char *) ("E655: Too many symbolic links (cycle?)"))));
                    rettv -> vval.v_string = ((void *) 0);
                    goto fail;
                }
                if (remain == ((void *) 0) && has_trailing_pathsep) add_pathsep (buf);
                q = getnextcomp (vim_ispathsep (*buf) ? buf + 1 : buf);
                if (*q != '\000') {
                    if (remain == ((void *) 0)) remain = vim_strsave (q - 1);
                    else {
                        cpy = concat_str (q - 1, remain);
                        if (cpy != ((void *) 0)) {
                            vim_free (remain);
                            remain = cpy;
                        }
                    }
                    q [-1] = '\000';
                }
                q = gettail (p);
                if (q > p && *q == '\000') {
                    q [-1] = '\000';
                    q = gettail (p);
                }
                if (q > p && !mch_isFullName(buf)) {
                    cpy = alloc ((unsigned) (strlen ((char *) (p)) + strlen ((char *) (buf)) + 1));
                    if (cpy != ((void *) 0)) {
                        ((__builtin_object_size ((char *) (cpy), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (cpy), (
                          char *) (p), __builtin_object_size ((char *) (cpy), 1 > 1)) : __inline_strcpy_chk ((char *) (cpy), (
                          char *) (p)));
                        ((__builtin_object_size ((char *) (gettail (cpy)), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *
                          ) (gettail (cpy)), (char *) (buf), __builtin_object_size ((char *) (gettail (cpy)), 1 > 1)) :
                          __inline_strcpy_chk ((char *) (gettail (cpy)), (char *) (buf)));
                        vim_free (p);
                        p = cpy;
                    }
                }
                else {
                    vim_free (p);
                    p = vim_strsave (buf);
                }
            }
            if (remain == ((void *) 0)) break;
            q = getnextcomp (remain + 1);
            len = q - remain - (*q != '\000');
            cpy = vim_strnsave (p, strlen ((char *) (p)) + len);
            if (cpy != ((void *) 0)) {
                ((__builtin_object_size ((char *) (cpy), 0) != (size_t) - 1) ? __builtin___strncat_chk ((char *) (cpy), (char *
                  ) (remain), (size_t) (len), __builtin_object_size ((char *) (cpy), 1 > 1)) : __inline_strncat_chk ((char *) (
                  cpy), (char *) (remain), (size_t) (len)));
                vim_free (p);
                p = cpy;
            }
            if (*q != '\000') ((__builtin_object_size ((char *) ((remain)), 0) != (size_t) - 1) ? __builtin___memmove_chk ((
              char *) ((remain)), (char *) ((q - 1)), strlen ((char *) (q - 1)) + 1, __builtin_object_size ((char *) ((remain))
              , 0)) : __inline_memmove_chk ((char *) ((remain)), (char *) ((q - 1)), strlen ((char *) (q - 1)) + 1));
            else {
                vim_free (remain);
                remain = ((void *) 0);
            }
        }
        if (!vim_ispathsep(*p)) {
            if (is_relative_to_current && *p != '\000' && !(p[0]=='.'&&(p[1]=='\000'||vim_ispathsep(p[1])||(p[1]=='.'&&(p[2]==
              '\000'||vim_ispathsep(p[2])))))) {
                cpy = concat_str ((char_u *) "./", p);
                if (cpy != ((void *) 0)) {
                    vim_free (p);
                    p = cpy;
                }
            }
            else if (!is_relative_to_current) {
                q = p;
                while (q [0] == '.' && vim_ispathsep (q [1])) q += 2;
                if (q > p) ((__builtin_object_size ((char *) ((p)), 0) != (size_t) - 1) ? __builtin___memmove_chk ((char *) ((p
                  )), (char *) ((p + 2)), strlen ((char *) (p + 2)) + 1, __builtin_object_size ((char *) ((p)), 0)) :
                  __inline_memmove_chk ((char *) ((p)), (char *) ((p + 2)), strlen ((char *) (p + 2)) + 1));
            }
        }
        if (!has_trailing_pathsep) {
            q = p + strlen ((char *) (p));
            if (vim_ispathsep (*((q)-1))) *gettail_sep(p) = '\000';
        }
        rettv -> vval.v_string = p;
    }
    simplify_filename (rettv -> vval.v_string);
    fail : rettv -> v_type = 2;
}

static void f_reverse (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    list_T * l;
    listitem_T * li, * ni;
    if (argvars [0].v_type != 4) emsg2 ((char_u *) (((char *) (e_listarg))), (char_u *) ("reverse()"));
    else if ((l = argvars [0].vval.v_list) != ((void *) 0) && !tv_check_lock(l->lv_lock,(char_u*)"reverse()")) {
        li = l -> lv_last;
        l -> lv_first = l -> lv_last = ((void *) 0);
        l -> lv_len = 0;
        while (li != ((void *) 0)) {
            ni = li -> li_prev;
            list_append (l, li);
            li = ni;
        }
        rettv -> vval.v_list = l;
        rettv -> v_type = 4;
        ++l->lv_refcount;
        l -> lv_idx = l -> lv_len - l -> lv_idx - 1;
    }
}

static int get_search_arg (typval_T * varp, int * flagsp);

static int get_search_arg (varp, flagsp)
    typval_T * varp;
    int * flagsp;
{
    int dir = 1;
    char_u * flags;
    char_u nbuf [30];
    int mask;
    if (varp -> v_type != 0) {
        flags = get_tv_string_buf_chk (varp, nbuf);
        if (flags == ((void *) 0)) return 0;
        while (*flags != '\000') {
            switch (*flags) {
            case 'b' :
                dir = (-1);
                break;
            case 'w' :
                p_ws = 1;
                break;
            case 'W' :
                p_ws = 0;
                break;
            default :
                mask = 0;
                if (flagsp != ((void *) 0)) switch (*flags) {
                case 'c' :
                    mask = 0x10;
                    break;
                case 'e' :
                    mask = 0x40;
                    break;
                case 'm' :
                    mask = 0x04;
                    break;
                case 'n' :
                    mask = 0x01;
                    break;
                case 'p' :
                    mask = 0x20;
                    break;
                case 'r' :
                    mask = 0x02;
                    break;
                case 's' :
                    mask = 0x08;
                    break;
                }
                if (mask == 0) {
                    emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (flags));
                    dir = 0;
                }
                else *flagsp |= mask;
            }
            if (dir == 0) break;
            ++flags;
        }
    }
    return dir;
}

static int search_cmn (argvars, match_pos, flagsp)
    typval_T * argvars;
    pos_T * match_pos;
    int * flagsp;
{
    int flags;
    char_u * pat;
    pos_T pos;
    pos_T save_cursor;
    int save_p_ws = p_ws;
    int dir;
    int retval = 0;
    long lnum_stop = 0;
    proftime_T tm;
    long time_limit = 0;
    int options = 0x400;
    int subpatnum;
    pat = get_tv_string (&argvars[0]);
    dir = get_search_arg (&argvars[1], flagsp);
    if (dir == 0) goto theend;
    flags = *flagsp;
    if (flags & 0x10) options |= 0x100;
    if (flags & 0x40) options |= 0x40;
    if (argvars [1].v_type != 0 && argvars [2].v_type != 0) {
        lnum_stop = get_tv_number_chk (&argvars[2], ((void *) 0));
        if (lnum_stop < 0) goto theend;
        if (argvars [3].v_type != 0) {
            time_limit = get_tv_number_chk (&argvars[3], ((void *) 0));
            if (time_limit < 0) goto theend;
        }
    }
    profile_setlimit (time_limit, &tm);
    if (((flags & (0x02 | 0x04)) != 0) || ((flags & 0x01) && (flags & 0x08))) {
        emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (get_tv_string (&argvars[1])));
        goto theend;
    }
    pos = save_cursor = curwin -> w_cursor;
    subpatnum = searchit (curwin, curbuf, &pos, dir, pat, 1L, options, 0, (linenr_T) lnum_stop, &tm);
    if (subpatnum != 0) {
        if (flags & 0x20) retval = subpatnum;
        else retval = pos.lnum;
        if (flags & 0x08) setpcmark ();
        curwin -> w_cursor = pos;
        if (match_pos != ((void *) 0)) {
            match_pos -> lnum = pos.lnum;
            match_pos -> col = pos.col + 1;
        }
        check_cursor ();
    }
    if (flags & 0x01) curwin -> w_cursor = save_cursor;
    else curwin -> w_set_curswant = 1;
    theend : p_ws = save_p_ws;
    return retval;
}

static void f_round (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = f > 0 ? floor (f + 0.5) : ceil (f - 0.5);
    else rettv -> vval.v_float = 0.0;
}

static void f_search (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int flags = 0;
    rettv -> vval.v_number = search_cmn (argvars, ((void *) 0), &flags);
}

static void f_searchdecl (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int locally = 1;
    int thisblock = 0;
    int error = 0;
    char_u * name;
    rettv -> vval.v_number = 1;
    name = get_tv_string_chk (&argvars[0]);
    if (argvars [1].v_type != 0) {
        locally = get_tv_number_chk (&argvars[1], &error) == 0;
        if (!error && argvars [2].v_type != 0) thisblock = get_tv_number_chk (&argvars[2], &error) != 0;
    }
    if (!error && name != ((void *) 0)) rettv -> vval.v_number = find_decl (name, (int) strlen ((char *) (name)), locally,
      thisblock, 0x400) == 0;
}

static int searchpair_cmn (argvars, match_pos)
    typval_T * argvars;
    pos_T * match_pos;
{
    char_u * spat, * mpat, * epat;
    char_u * skip;
    int save_p_ws = p_ws;
    int dir;
    int flags = 0;
    char_u nbuf1 [30];
    char_u nbuf2 [30];
    char_u nbuf3 [30];
    int retval = 0;
    long lnum_stop = 0;
    long time_limit = 0;
    spat = get_tv_string_chk (&argvars[0]);
    mpat = get_tv_string_buf_chk (&argvars[1], nbuf1);
    epat = get_tv_string_buf_chk (&argvars[2], nbuf2);
    if (spat == ((void *) 0) || mpat == ((void *) 0) || epat == ((void *) 0)) goto theend;
    dir = get_search_arg (&argvars[3], &flags);
    if (dir == 0) goto theend;
    if ((flags & (0x40 | 0x20)) != 0 || ((flags & 0x01) && (flags & 0x08))) {
        emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (get_tv_string (&argvars[3])));
        goto theend;
    }
    if (flags & 0x02) p_ws = 0;
    if (argvars [3].v_type == 0 || argvars [4].v_type == 0) skip = (char_u *) "";
    else {
        skip = get_tv_string_buf_chk (&argvars[4], nbuf3);
        if (argvars [5].v_type != 0) {
            lnum_stop = get_tv_number_chk (&argvars[5], ((void *) 0));
            if (lnum_stop < 0) goto theend;
            if (argvars [6].v_type != 0) {
                time_limit = get_tv_number_chk (&argvars[6], ((void *) 0));
                if (time_limit < 0) goto theend;
            }
        }
    }
    if (skip == ((void *) 0)) goto theend;
    retval = do_searchpair (spat, mpat, epat, dir, skip, flags, match_pos, lnum_stop, time_limit);
    theend : p_ws = save_p_ws;
    return retval;
}

static void f_searchpair (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_number = searchpair_cmn (argvars, ((void *) 0));
}

static void f_searchpairpos (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    pos_T match_pos;
    int lnum = 0;
    int col = 0;
    if (rettv_list_alloc (rettv) == 0) return;
    if (searchpair_cmn (argvars, &match_pos) > 0) {
        lnum = match_pos.lnum;
        col = match_pos.col;
    }
    list_append_number (rettv -> vval.v_list, (varnumber_T) lnum);
    list_append_number (rettv -> vval.v_list, (varnumber_T) col);
}

long do_searchpair (spat, mpat, epat, dir, skip, flags, match_pos, lnum_stop, time_limit)
    char_u * spat;
    char_u * mpat;
    char_u * epat;
    int dir;
    char_u * skip;
    int flags;
    pos_T * match_pos;
    linenr_T lnum_stop;
    long time_limit;
{
    char_u * save_cpo;
    char_u * pat, * pat2 = ((void *) 0), * pat3 = ((void *) 0);
    long retval = 0;
    pos_T pos;
    pos_T firstpos;
    pos_T foundpos;
    pos_T save_cursor;
    pos_T save_pos;
    int n;
    int r;
    int nest = 1;
    int err;
    int options = 0x400;
    proftime_T tm;
    save_cpo = p_cpo;
    p_cpo = empty_option;
    profile_setlimit (time_limit, &tm);
    pat2 = alloc ((unsigned) (strlen ((char *) (spat)) + strlen ((char *) (epat)) + 15));
    pat3 = alloc ((unsigned) (strlen ((char *) (spat)) + strlen ((char *) (mpat)) + strlen ((char *) (epat)) + 23));
    if (pat2 == ((void *) 0) || pat3 == ((void *) 0)) goto theend;
    __builtin___sprintf_chk ((char *) pat2, 0, __builtin_object_size ((char *) pat2, 1 > 1), "\\(%s\\m\\)\\|\\(%s\\m\\)", spat,
      epat);
    if (*mpat == '\000') ((__builtin_object_size ((char *) (pat3), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (pat3
      ), (char *) (pat2), __builtin_object_size ((char *) (pat3), 1 > 1)) : __inline_strcpy_chk ((char *) (pat3), (char *) (
      pat2)));
    else __builtin___sprintf_chk ((char *) pat3, 0, __builtin_object_size ((char *) pat3, 1 > 1),
      "\\(%s\\m\\)\\|\\(%s\\m\\)\\|\\(%s\\m\\)", spat, epat, mpat);
    if (flags & 0x10) options |= 0x100;
    save_cursor = curwin -> w_cursor;
    pos = curwin -> w_cursor;
    {
        (&firstpos) -> lnum = 0;
        (&firstpos) -> col = 0;
        (&firstpos) -> coladd = 0;
    };
    {
        (&foundpos) -> lnum = 0;
        (&foundpos) -> col = 0;
        (&foundpos) -> coladd = 0;
    };
    pat = pat3;
    for (;;) {
        n = searchit (curwin, curbuf, &pos, dir, pat, 1L, options, 0, lnum_stop, &tm);
        if (n == 0 || (firstpos.lnum != 0 && (((pos).lnum == (firstpos).lnum) && ((pos).col == (firstpos).col) && ((pos).coladd
          == (firstpos).coladd)))) break;
        if (firstpos.lnum == 0) firstpos = pos;
        if ((((pos).lnum == (foundpos).lnum) && ((pos).col == (foundpos).col) && ((pos).coladd == (foundpos).coladd))) {
            if (dir == (-1)) decl (&pos);
            else incl (&pos);
        }
        foundpos = pos;
        options &= ~0x100;
        if (*skip != '\000') {
            save_pos = curwin -> w_cursor;
            curwin -> w_cursor = pos;
            r = eval_to_bool (skip, &err, ((void *) 0), 0);
            curwin -> w_cursor = save_pos;
            if (err) {
                curwin -> w_cursor = save_cursor;
                retval = -1;
                break;
            }
            if (r) continue;
        }
        if ((dir == (-1) && n == 3) || (dir == 1 && n == 2)) {
            ++nest;
            pat = pat2;
        }
        else {
            if (--nest == 1) pat = pat3;
        }
        if (nest == 0) {
            if (flags & 0x04) ++retval;
            else retval = pos.lnum;
            if (flags & 0x08) setpcmark ();
            curwin -> w_cursor = pos;
            if (!(flags&0x02)) break;
            nest = 1;
        }
    }
    if (match_pos != ((void *) 0)) {
        match_pos -> lnum = curwin -> w_cursor.lnum;
        match_pos -> col = curwin -> w_cursor.col + 1;
    }
    if ((flags & 0x01) || retval == 0) curwin -> w_cursor = save_cursor;
    theend : vim_free (pat2);
    vim_free (pat3);
    if (p_cpo == empty_option) p_cpo = save_cpo;
    else free_string_option (save_cpo);
    return retval;
}

static void f_searchpos (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    pos_T match_pos;
    int lnum = 0;
    int col = 0;
    int n;
    int flags = 0;
    if (rettv_list_alloc (rettv) == 0) return;
    n = search_cmn (argvars, &match_pos, &flags);
    if (n > 0) {
        lnum = match_pos.lnum;
        col = match_pos.col;
    }
    list_append_number (rettv -> vval.v_list, (varnumber_T) lnum);
    list_append_number (rettv -> vval.v_list, (varnumber_T) col);
    if (flags & 0x20) list_append_number (rettv -> vval.v_list, (varnumber_T) n);
}

static void f_server2client (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> vval.v_number = -1;
}

static void f_serverlist (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    char_u * r = ((void *) 0);
    rettv -> v_type = 2;
    rettv -> vval.v_string = r;
}

static void f_setbufvar (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv __attribute__ ((unused));
{
    buf_T * buf;
    aco_save_T aco;
    char_u * varname, * bufvarname;
    typval_T * varp;
    char_u nbuf [30];
    if (check_restricted () || check_secure ()) return;
    (void) get_tv_number (&argvars[0]);
    varname = get_tv_string_chk (&argvars[1]);
    buf = get_buf_tv (&argvars[0]);
    varp = &argvars[2];
    if (buf != ((void *) 0) && varname != ((void *) 0) && varp != ((void *) 0)) {
        aucmd_prepbuf (&aco, buf);
        if (*varname == '&') {
            long numval;
            char_u * strval;
            int error = 0;
            ++varname;
            numval = get_tv_number_chk (varp, &error);
            strval = get_tv_string_buf_chk (varp, nbuf);
            if (!error && strval != ((void *) 0)) set_option_value (varname, numval, strval, 4);
        }
        else {
            bufvarname = alloc ((unsigned) strlen ((char *) (varname)) + 3);
            if (bufvarname != ((void *) 0)) {
                ((__builtin_object_size ((char *) (bufvarname), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (
                  bufvarname), (char *) ("b:"), __builtin_object_size ((char *) (bufvarname), 1 > 1)) : __inline_strcpy_chk ((
                  char *) (bufvarname), (char *) ("b:")));
                ((__builtin_object_size ((char *) (bufvarname + 2), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (
                  bufvarname + 2), (char *) (varname), __builtin_object_size ((char *) (bufvarname + 2), 1 > 1)) :
                  __inline_strcpy_chk ((char *) (bufvarname + 2), (char *) (varname)));
                set_var (bufvarname, varp, 1);
                vim_free (bufvarname);
            }
        }
        aucmd_restbuf (&aco);
    }
}

static void f_setcmdpos (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int pos = (int) get_tv_number (&argvars[0]) - 1;
    if (pos >= 0) rettv -> vval.v_number = set_cmdline_pos (pos);
}

static void f_setline (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    linenr_T lnum;
    char_u * line = ((void *) 0);
    list_T * l = ((void *) 0);
    listitem_T * li = ((void *) 0);
    long added = 0;
    linenr_T lcount = curbuf -> b_ml.ml_line_count;
    lnum = get_tv_lnum (&argvars[0]);
    if (argvars [1].v_type == 4) {
        l = argvars [1].vval.v_list;
        li = l -> lv_first;
    }
    else line = get_tv_string_chk (&argvars[1]);
    for (;;) {
        if (l != ((void *) 0)) {
            if (li == ((void *) 0)) break;
            line = get_tv_string_chk (&li->li_tv);
            li = li -> li_next;
        }
        rettv -> vval.v_number = 1;
        if (line == ((void *) 0) || lnum < 1 || lnum > curbuf -> b_ml.ml_line_count + 1) break;
        if (lnum <= curbuf -> b_ml.ml_line_count) {
            if (u_savesub (lnum) == 1 && ml_replace (lnum, line, 1) == 1) {
                changed_bytes (lnum, 0);
                if (lnum == curwin -> w_cursor.lnum) check_cursor_col ();
                rettv -> vval.v_number = 0;
            }
        }
        else if (added > 0 || u_save (lnum - 1, lnum) == 1) {
            ++added;
            if (ml_append (lnum - 1, line, (colnr_T) 0, 0) == 1) rettv -> vval.v_number = 0;
        }
        if (l == ((void *) 0)) break;
        ++lnum;
    }
    if (added > 0) appended_lines_mark (lcount, added);
}

static void set_qf_ll_list (win_T * wp, typval_T * list_arg, typval_T * action_arg, typval_T * rettv);

static void set_qf_ll_list (wp, list_arg, action_arg, rettv)
    win_T * wp __attribute__ ((unused));
    typval_T * list_arg __attribute__ ((unused));
    typval_T * action_arg __attribute__ ((unused));
    typval_T * rettv;
{
    char_u * act;
    int action = ' ';
    rettv -> vval.v_number = -1;
    if (list_arg -> v_type != 4) emsg ((char_u *) (((char *) (e_listreq))));
    else {
        list_T * l = list_arg -> vval.v_list;
        if (action_arg -> v_type == 2) {
            act = get_tv_string_chk (action_arg);
            if (act == ((void *) 0)) return;
            if (*act == 'a' || *act == 'r') action = *act;
        }
        if (l != ((void *) 0) && set_errorlist (wp, l, action, ((void *) 0)) == 1) rettv -> vval.v_number = 0;
    }
}

static void f_setloclist (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    win_T * win;
    rettv -> vval.v_number = -1;
    win = find_win_by_nr (&argvars[0], ((void *) 0));
    if (win != ((void *) 0)) set_qf_ll_list (win, &argvars[1], &argvars[2], rettv);
}

static void f_setmatches (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    list_T * l;
    listitem_T * li;
    dict_T * d;
    rettv -> vval.v_number = -1;
    if (argvars [0].v_type != 4) {
        emsg ((char_u *) (((char *) (e_listreq))));
        return;
    }
    if ((l = argvars [0].vval.v_list) != ((void *) 0)) {
        li = l -> lv_first;
        while (li != ((void *) 0)) {
            if (li -> li_tv.v_type != 5 || (d = li -> li_tv.vval.v_dict) == ((void *) 0)) {
                emsg ((char_u *) (((char *) (e_invarg))));
                return;
            }
            if (!(dict_find(d,(char_u*)"group",-1) != ((void *) 0) && dict_find (d, (char_u *) "pattern", -1) != ((void *) 0) &&
              dict_find (d, (char_u *) "priority", -1) != ((void *) 0) && dict_find (d, (char_u *) "id", -1) != ((void *) 0))) {
                emsg ((char_u *) (((char *) (e_invarg))));
                return;
            }
            li = li -> li_next;
        }
        clear_matches (curwin);
        li = l -> lv_first;
        while (li != ((void *) 0)) {
            d = li -> li_tv.vval.v_dict;
            match_add (curwin, get_dict_string (d, (char_u *) "group", 0), get_dict_string (d, (char_u *) "pattern", 0), (int)
              get_dict_number (d, (char_u *) "priority"), (int) get_dict_number (d, (char_u *) "id"));
            li = li -> li_next;
        }
        rettv -> vval.v_number = 0;
    }
}

static void f_setpos (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    pos_T pos;
    int fnum;
    char_u * name;
    rettv -> vval.v_number = -1;
    name = get_tv_string_chk (argvars);
    if (name != ((void *) 0)) {
        if (list2fpos (&argvars[1], &pos, &fnum) == 1) {
            if (--pos.col < 0) pos.col = 0;
            if (name [0] == '.' && name [1] == '\000') {
                if (fnum == curbuf -> b_fnum) {
                    curwin -> w_cursor = pos;
                    check_cursor ();
                    rettv -> vval.v_number = 0;
                }
                else emsg ((char_u *) (((char *) (e_invarg))));
            }
            else if (name [0] == '\'' && name [1] != '\000' && name [2] == '\000') {
                if (setmark_pos (name [1], &pos, fnum) == 1) rettv -> vval.v_number = 0;
            }
            else emsg ((char_u *) (((char *) (e_invarg))));
        }
    }
}

static void f_setqflist (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    set_qf_ll_list (((void *) 0), &argvars[0], &argvars[1], rettv);
}

static void f_setreg (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int regname;
    char_u * strregname;
    char_u * stropt;
    char_u * strval;
    int append;
    char_u yank_type;
    long block_len;
    block_len = -1;
    yank_type = 0xff;
    append = 0;
    strregname = get_tv_string_chk (argvars);
    rettv -> vval.v_number = 1;
    if (strregname == ((void *) 0)) return;
    regname = *strregname;
    if (regname == 0 || regname == '@') regname = '"';
    else if (regname == '=') return;
    if (argvars [2].v_type != 0) {
        stropt = get_tv_string_chk (&argvars[2]);
        if (stropt == ((void *) 0)) return;
        for (; *stropt != '\000'; ++stropt) switch (*stropt) {
        case 'a' :
        case 'A' :
            append = 1;
            break;
        case 'v' :
        case 'c' :
            yank_type = 0;
            break;
        case 'V' :
        case 'l' :
            yank_type = 1;
            break;
        case 'b' :
        case 22 :
            yank_type = 2;
            if (((stropt [1]) >= '0' && (stropt [1]) <= '9')) {
                ++stropt;
                block_len = getdigits (&stropt) - 1;
                --stropt;
            }
            break;
        }
    }
    strval = get_tv_string_chk (&argvars[1]);
    if (strval != ((void *) 0)) write_reg_contents_ex (regname, strval, -1, append, yank_type, block_len);
    rettv -> vval.v_number = 0;
}

static void f_settabvar (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    tabpage_T * save_curtab;
    char_u * varname, * tabvarname;
    typval_T * varp;
    tabpage_T * tp;
    rettv -> vval.v_number = 0;
    if (check_restricted () || check_secure ()) return;
    tp = find_tabpage ((int) get_tv_number_chk (&argvars[0], ((void *) 0)));
    varname = get_tv_string_chk (&argvars[1]);
    varp = &argvars[2];
    if (tp != ((void *) 0) && varname != ((void *) 0) && varp != ((void *) 0)) {
        save_curtab = curtab;
        goto_tabpage_tp (tp);
        tabvarname = alloc ((unsigned) strlen ((char *) (varname)) + 3);
        if (tabvarname != ((void *) 0)) {
            ((__builtin_object_size ((char *) (tabvarname), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (tabvarname)
              , (char *) ("t:"), __builtin_object_size ((char *) (tabvarname), 1 > 1)) : __inline_strcpy_chk ((char *) (
              tabvarname), (char *) ("t:")));
            ((__builtin_object_size ((char *) (tabvarname + 2), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (
              tabvarname + 2), (char *) (varname), __builtin_object_size ((char *) (tabvarname + 2), 1 > 1)) :
              __inline_strcpy_chk ((char *) (tabvarname + 2), (char *) (varname)));
            set_var (tabvarname, varp, 1);
            vim_free (tabvarname);
        }
        if (valid_tabpage (save_curtab)) goto_tabpage_tp (save_curtab);
    }
}

static void f_settabwinvar (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    setwinvar (argvars, rettv, 1);
}

static void f_setwinvar (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    setwinvar (argvars, rettv, 0);
}

static void setwinvar (argvars, rettv, off)
    typval_T * argvars;
    typval_T * rettv __attribute__ ((unused));
    int off;
{
    win_T * win;
    win_T * save_curwin;
    tabpage_T * save_curtab;
    char_u * varname, * winvarname;
    typval_T * varp;
    char_u nbuf [30];
    tabpage_T * tp;
    if (check_restricted () || check_secure ()) return;
    if (off == 1) tp = find_tabpage ((int) get_tv_number_chk (&argvars[0], ((void *) 0)));
    else tp = curtab;
    win = find_win_by_nr (&argvars[off], tp);
    varname = get_tv_string_chk (&argvars[off+1]);
    varp = &argvars[off+2];
    if (win != ((void *) 0) && varname != ((void *) 0) && varp != ((void *) 0)) {
        save_curwin = curwin;
        save_curtab = curtab;
        goto_tabpage_tp (tp);
        if (!win_valid(win)) return;
        curwin = win;
        curbuf = curwin -> w_buffer;
        if (*varname == '&') {
            long numval;
            char_u * strval;
            int error = 0;
            ++varname;
            numval = get_tv_number_chk (varp, &error);
            strval = get_tv_string_buf_chk (varp, nbuf);
            if (!error && strval != ((void *) 0)) set_option_value (varname, numval, strval, 4);
        }
        else {
            winvarname = alloc ((unsigned) strlen ((char *) (varname)) + 3);
            if (winvarname != ((void *) 0)) {
                ((__builtin_object_size ((char *) (winvarname), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (
                  winvarname), (char *) ("w:"), __builtin_object_size ((char *) (winvarname), 1 > 1)) : __inline_strcpy_chk ((
                  char *) (winvarname), (char *) ("w:")));
                ((__builtin_object_size ((char *) (winvarname + 2), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (
                  winvarname + 2), (char *) (varname), __builtin_object_size ((char *) (winvarname + 2), 1 > 1)) :
                  __inline_strcpy_chk ((char *) (winvarname + 2), (char *) (varname)));
                set_var (winvarname, varp, 1);
                vim_free (winvarname);
            }
        }
        if (valid_tabpage (save_curtab)) goto_tabpage_tp (save_curtab);
        if (win_valid (save_curwin)) {
            curwin = save_curwin;
            curbuf = curwin -> w_buffer;
        }
    }
}

static void f_shellescape (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_string = vim_strsave_shellescape (get_tv_string (&argvars[0]), non_zero_arg (&argvars[1]));
    rettv -> v_type = 2;
}

static void f_simplify (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * p;
    p = get_tv_string (&argvars[0]);
    rettv -> vval.v_string = vim_strsave (p);
    simplify_filename (rettv -> vval.v_string);
    rettv -> v_type = 2;
}

static void f_sin (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = sin (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_sinh (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = sinh (f);
    else rettv -> vval.v_float = 0.0;
}

static int item_compare (const void * s1, const void * s2);
static int item_compare2 (const void * s1, const void * s2);
static int item_compare_ic;
static char_u * item_compare_func;
static int item_compare_func_err;

static int item_compare (s1, s2) const
    void * s1;
    const void * s2;
{
    char_u * p1, * p2;
    char_u * tofree1, * tofree2;
    int res;
    char_u numbuf1 [30];
    char_u numbuf2 [30];
    p1 = tv2string (&(*(listitem_T**)s1) -> li_tv, &tofree1, numbuf1, 0);
    p2 = tv2string (&(*(listitem_T**)s2) -> li_tv, &tofree2, numbuf2, 0);
    if (p1 == ((void *) 0)) p1 = (char_u *) "";
    if (p2 == ((void *) 0)) p2 = (char_u *) "";
    if (item_compare_ic) res = strcasecmp ((char *) (p1), (char *) (p2));
    else res = strcmp ((char *) (p1), (char *) (p2));
    vim_free (tofree1);
    vim_free (tofree2);
    return res;
}

static int item_compare2 (s1, s2) const
    void * s1;
    const void * s2;
{
    int res;
    typval_T rettv;
    typval_T argv [3];
    int dummy;
    if (item_compare_func_err) return 0;
    copy_tv (&(*(listitem_T**)s1) -> li_tv, &argv[0]);
    copy_tv (&(*(listitem_T**)s2) -> li_tv, &argv[1]);
    rettv.v_type = 0;
    res = call_func (item_compare_func, (int) strlen ((char *) (item_compare_func)), &rettv, 2, argv, 0L, 0L, &dummy, 1, ((void
      *) 0));
    clear_tv (&argv[0]);
    clear_tv (&argv[1]);
    if (res == 0) res = 999;
    else res = get_tv_number_chk (&rettv, &item_compare_func_err);
    if (item_compare_func_err) res = 999;
    clear_tv (&rettv);
    return res;
}

static void f_sort (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    list_T * l;
    listitem_T * li;
    listitem_T * * ptrs;
    long len;
    long i;
    if (argvars [0].v_type != 4) emsg2 ((char_u *) (((char *) (e_listarg))), (char_u *) ("sort()"));
    else {
        l = argvars [0].vval.v_list;
        if (l == ((void *) 0) || tv_check_lock (l -> lv_lock, (char_u *) "sort()")) return;
        rettv -> vval.v_list = l;
        rettv -> v_type = 4;
        ++l->lv_refcount;
        len = list_len (l);
        if (len <= 1) return;
        item_compare_ic = 0;
        item_compare_func = ((void *) 0);
        if (argvars [1].v_type != 0) {
            if (argvars [1].v_type == 3) item_compare_func = argvars [1].vval.v_string;
            else {
                int error = 0;
                i = get_tv_number_chk (&argvars[1], &error);
                if (error) return;
                if (i == 1) item_compare_ic = 1;
                else item_compare_func = get_tv_string (&argvars[1]);
            }
        }
        ptrs = (listitem_T * *) alloc ((int) (len * sizeof (listitem_T *)));
        if (ptrs == ((void *) 0)) return;
        i = 0;
        for (li = l -> lv_first; li != ((void *) 0); li = li -> li_next) ptrs [i ++] = li;
        item_compare_func_err = 0;
        if (item_compare_func != ((void *) 0) && item_compare2 ((void *) &ptrs[0], (void *) &ptrs[1]) == 999) emsg ((char_u *) (
          ((char *) ("E702: Sort compare function failed"))));
        else {
            qsort ((void *) ptrs, (size_t) len, sizeof (listitem_T *), item_compare_func == ((void *) 0) ? item_compare :
              item_compare2);
            if (!item_compare_func_err) {
                l -> lv_first = l -> lv_last = l -> lv_idx_item = ((void *) 0);
                l -> lv_len = 0;
                for (i = 0; i < len; ++i) list_append (l, ptrs [i]);
            }
        }
        vim_free (ptrs);
    }
}

static void f_soundfold (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * s;
    rettv -> v_type = 2;
    s = get_tv_string (&argvars[0]);
    rettv -> vval.v_string = eval_soundfold (s);
}

static void f_spellbadword (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    char_u * word = (char_u *) "";
    hlf_T attr = HLF_COUNT;
    int len = 0;
    if (rettv_list_alloc (rettv) == 0) return;
    if (argvars [0].v_type == 0) {
        len = spell_move_to (curwin, 1, 1, 1, &attr);
        if (len != 0) word = ml_get_cursor ();
    }
    else if (curwin -> w_onebuf_opt.wo_spell && *curbuf->b_s.b_p_spl != '\000') {
        char_u * str = get_tv_string_chk (&argvars[0]);
        int capcol = -1;
        if (str != ((void *) 0)) {
            while (*str != '\000') {
                len = spell_check (curwin, str, &attr, &capcol, 0);
                if (attr != HLF_COUNT) {
                    word = str;
                    break;
                }
                str += len;
            }
        }
    }
    list_append_string (rettv -> vval.v_list, word, len);
    list_append_string (rettv -> vval.v_list, (char_u *) (attr == HLF_SPB ? "bad" : attr == HLF_SPR ? "rare" : attr == HLF_SPL ?
      "local" : attr == HLF_SPC ? "caps" : ""), -1);
}

static void f_spellsuggest (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    char_u * str;
    int typeerr = 0;
    int maxcount;
    garray_T ga;
    int i;
    listitem_T * li;
    int need_capital = 0;
    if (rettv_list_alloc (rettv) == 0) return;
    if (curwin -> w_onebuf_opt.wo_spell && *curwin->w_s->b_p_spl != '\000') {
        str = get_tv_string (&argvars[0]);
        if (argvars [1].v_type != 0) {
            maxcount = get_tv_number_chk (&argvars[1], &typeerr);
            if (maxcount <= 0) return;
            if (argvars [2].v_type != 0) {
                need_capital = get_tv_number_chk (&argvars[2], &typeerr);
                if (typeerr) return;
            }
        }
        else maxcount = 25;
        spell_suggest_list (&ga, str, maxcount, need_capital, 0);
        for (i = 0; i < ga.ga_len; ++i) {
            str = ((char_u * *) ga.ga_data) [i];
            li = listitem_alloc ();
            if (li == ((void *) 0)) vim_free (str);
            else {
                li -> li_tv.v_type = 2;
                li -> li_tv.v_lock = 0;
                li -> li_tv.vval.v_string = str;
                list_append (rettv -> vval.v_list, li);
            }
        }
        ga_clear (&ga);
    }
}

static void f_split (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * str;
    char_u * end;
    char_u * pat = ((void *) 0);
    regmatch_T regmatch;
    char_u patbuf [30];
    char_u * save_cpo;
    int match;
    colnr_T col = 0;
    int keepempty = 0;
    int typeerr = 0;
    save_cpo = p_cpo;
    p_cpo = (char_u *) "";
    str = get_tv_string (&argvars[0]);
    if (argvars [1].v_type != 0) {
        pat = get_tv_string_buf_chk (&argvars[1], patbuf);
        if (pat == ((void *) 0)) typeerr = 1;
        if (argvars [2].v_type != 0) keepempty = get_tv_number_chk (&argvars[2], &typeerr);
    }
    if (pat == ((void *) 0) || *pat == '\000') pat = (char_u *) "[\\x01- ]\\+";
    if (rettv_list_alloc (rettv) == 0) return;
    if (typeerr) return;
    regmatch.regprog = vim_regcomp (pat, 1 + 2);
    if (regmatch.regprog != ((void *) 0)) {
        regmatch.rm_ic = 0;
        while (*str != '\000' || keepempty) {
            if (*str == '\000') match = 0;
            else match = vim_regexec_nl (&regmatch, str, col);
            if (match) end = regmatch.startp [0];
            else end = str + strlen ((char *) (str));
            if (keepempty || end > str || (rettv -> vval.v_list -> lv_len > 0 && *str != '\000' && match && end < regmatch.endp
              [0])) {
                if (list_append_string (rettv -> vval.v_list, str, (int) (end - str)) == 0) break;
            }
            if (!match) break;
            if (regmatch.endp [0] > str) col = 0;
            else {
                col = 1;
            }
            str = regmatch.endp [0];
        }
        vim_free (regmatch.regprog);
    }
    p_cpo = save_cpo;
}

static void f_sqrt (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = sqrt (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_str2float (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * p = skipwhite (get_tv_string (&argvars[0]));
    if (*p == '+') p = skipwhite (p + 1);
    (void) string2float (p, &rettv->vval.v_float);
    rettv -> v_type = 6;
}

static void f_str2nr (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int base = 10;
    char_u * p;
    long n;
    if (argvars [1].v_type != 0) {
        base = get_tv_number (&argvars[1]);
        if (base != 8 && base != 10 && base != 16) {
            emsg ((char_u *) (((char *) (e_invarg))));
            return;
        }
    }
    p = skipwhite (get_tv_string (&argvars[0]));
    if (*p == '+') p = skipwhite (p + 1);
    vim_str2nr (p, ((void *) 0), ((void *) 0), base == 8 ? 2 : 0, base == 16 ? 2 : 0, &n, ((void *) 0));
    rettv -> vval.v_number = n;
}

static void f_strftime (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u result_buf [256];
    struct tm * curtime;
    time_t seconds;
    char_u * p;
    rettv -> v_type = 2;
    p = get_tv_string (&argvars[0]);
    if (argvars [1].v_type == 0) seconds = time (((void *) 0));
    else seconds = (time_t) get_tv_number (&argvars[1]);
    curtime = localtime (&seconds);
    if (curtime == ((void *) 0)) rettv -> vval.v_string = vim_strsave ((char_u *) ((char *) ("(Invalid)")));
    else {
        if (p != ((void *) 0)) (void) strftime ((char *) result_buf, sizeof (result_buf), (char *) p, curtime);
        else result_buf [0] = '\000';
        rettv -> vval.v_string = vim_strsave (result_buf);
    }
}

static void f_stridx (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u buf [30];
    char_u * needle;
    char_u * haystack;
    char_u * save_haystack;
    char_u * pos;
    int start_idx;
    needle = get_tv_string_chk (&argvars[1]);
    save_haystack = haystack = get_tv_string_buf_chk (&argvars[0], buf);
    rettv -> vval.v_number = -1;
    if (needle == ((void *) 0) || haystack == ((void *) 0)) return;
    if (argvars [2].v_type != 0) {
        int error = 0;
        start_idx = get_tv_number_chk (&argvars[2], &error);
        if (error || start_idx >= (int) strlen ((char *) (haystack))) return;
        if (start_idx >= 0) haystack += start_idx;
    }
    pos = (char_u *) strstr ((char *) haystack, (char *) needle);
    if (pos != ((void *) 0)) rettv -> vval.v_number = (varnumber_T) (pos - save_haystack);
}

static void f_string (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * tofree;
    char_u numbuf [30];
    rettv -> v_type = 2;
    rettv -> vval.v_string = tv2string (&argvars[0], &tofree, numbuf, 0);
    if (rettv -> vval.v_string != ((void *) 0) && tofree == ((void *) 0)) rettv -> vval.v_string = vim_strsave (rettv -> vval.
      v_string);
}

static void f_strlen (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> vval.v_number = (varnumber_T) (strlen ((char *) (get_tv_string (&argvars[0]))));
}

static void f_strchars (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * s = get_tv_string (&argvars[0]);
    rettv -> vval.v_number = (varnumber_T) (strlen ((char *) (s)));
}

static void f_strdisplaywidth (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * s = get_tv_string (&argvars[0]);
    int col = 0;
    if (argvars [1].v_type != 0) col = get_tv_number (&argvars[1]);
    rettv -> vval.v_number = (varnumber_T) (linetabsize_col (col, s) - col);
}

static void f_strwidth (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * s = get_tv_string (&argvars[0]);
    rettv -> vval.v_number = (varnumber_T) (strlen ((char *) (s)));
}

static void f_strpart (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * p;
    int n;
    int len;
    int slen;
    int error = 0;
    p = get_tv_string (&argvars[0]);
    slen = (int) strlen ((char *) (p));
    n = get_tv_number_chk (&argvars[1], &error);
    if (error) len = 0;
    else if (argvars [2].v_type != 0) len = get_tv_number (&argvars[2]);
    else len = slen - n;
    if (n < 0) {
        len += n;
        n = 0;
    }
    else if (n > slen) n = slen;
    if (len < 0) len = 0;
    else if (n + len > slen) len = slen - n;
    rettv -> v_type = 2;
    rettv -> vval.v_string = vim_strnsave (p + n, len);
}

static void f_strridx (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u buf [30];
    char_u * needle;
    char_u * haystack;
    char_u * rest;
    char_u * lastmatch = ((void *) 0);
    int haystack_len, end_idx;
    needle = get_tv_string_chk (&argvars[1]);
    haystack = get_tv_string_buf_chk (&argvars[0], buf);
    rettv -> vval.v_number = -1;
    if (needle == ((void *) 0) || haystack == ((void *) 0)) return;
    haystack_len = (int) strlen ((char *) (haystack));
    if (argvars [2].v_type != 0) {
        end_idx = get_tv_number_chk (&argvars[2], ((void *) 0));
        if (end_idx < 0) return;
    }
    else end_idx = haystack_len;
    if (*needle == '\000') {
        lastmatch = haystack + end_idx;
    }
    else {
        for (rest = haystack; *rest != '\0'; ++rest) {
            rest = (char_u *) strstr ((char *) rest, (char *) needle);
            if (rest == ((void *) 0) || rest > haystack + end_idx) break;
            lastmatch = rest;
        }
    }
    if (lastmatch == ((void *) 0)) rettv -> vval.v_number = -1;
    else rettv -> vval.v_number = (varnumber_T) (lastmatch - haystack);
}

static void f_strtrans (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> v_type = 2;
    rettv -> vval.v_string = transstr (get_tv_string (&argvars[0]));
}

static void f_submatch (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> v_type = 2;
    rettv -> vval.v_string = reg_submatch ((int) get_tv_number_chk (&argvars[0], ((void *) 0)));
}

static void f_substitute (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u patbuf [30];
    char_u subbuf [30];
    char_u flagsbuf [30];
    char_u * str = get_tv_string_chk (&argvars[0]);
    char_u * pat = get_tv_string_buf_chk (&argvars[1], patbuf);
    char_u * sub = get_tv_string_buf_chk (&argvars[2], subbuf);
    char_u * flg = get_tv_string_buf_chk (&argvars[3], flagsbuf);
    rettv -> v_type = 2;
    if (str == ((void *) 0) || pat == ((void *) 0) || sub == ((void *) 0) || flg == ((void *) 0)) rettv -> vval.v_string = ((
      void *) 0);
    else rettv -> vval.v_string = do_string_sub (str, pat, sub, flg);
}

static void f_synID (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    int id = 0;
    long lnum;
    long col;
    int trans;
    int transerr = 0;
    lnum = get_tv_lnum (argvars);
    col = get_tv_number (&argvars[1]) - 1;
    trans = get_tv_number_chk (&argvars[2], &transerr);
    if (!transerr && lnum >= 1 && lnum <= curbuf -> b_ml.ml_line_count && col >= 0 && col < (long) strlen ((char *) (ml_get (
      lnum)))) id = syn_get_id (curwin, lnum, (colnr_T) col, trans, ((void *) 0), 0);
    rettv -> vval.v_number = id;
}

static void f_synIDattr (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    char_u * p = ((void *) 0);
    int id;
    char_u * what;
    char_u * mode;
    char_u modebuf [30];
    int modec;
    id = get_tv_number (&argvars[0]);
    what = get_tv_string (&argvars[1]);
    if (argvars [2].v_type != 0) {
        mode = get_tv_string_buf (&argvars[2], modebuf);
        modec = (((mode [0]) < 'A' || (mode [0]) > 'Z') ? (mode [0]) : (mode [0]) + ('a' - 'A'));
        if (modec != 't' && modec != 'c' && modec != 'g') modec = 0;
    }
    else {
        if (t_colors > 1) modec = 'c';
        else modec = 't';
    }
    switch ((((what [0]) < 'A' || (what [0]) > 'Z') ? (what [0]) : (what [0]) + ('a' - 'A'))) {
    case 'b' :
        if ((((what [1]) < 'A' || (what [1]) > 'Z') ? (what [1]) : (what [1]) + ('a' - 'A')) == 'g') p = highlight_color (id,
          what, modec);
        else p = highlight_has_attr (id, 0x02, modec);
        break;
    case 'f' :
        p = highlight_color (id, what, modec);
        break;
    case 'i' :
        if ((((what [1]) < 'A' || (what [1]) > 'Z') ? (what [1]) : (what [1]) + ('a' - 'A')) == 'n') p = highlight_has_attr (id
          , 0x01, modec);
        else p = highlight_has_attr (id, 0x04, modec);
        break;
    case 'n' :
        p = get_highlight_name (((void *) 0), id - 1);
        break;
    case 'r' :
        p = highlight_has_attr (id, 0x01, modec);
        break;
    case 's' :
        if ((((what [1]) < 'A' || (what [1]) > 'Z') ? (what [1]) : (what [1]) + ('a' - 'A')) == 'p') p = highlight_color (id,
          what, modec);
        else p = highlight_has_attr (id, 0x20, modec);
        break;
    case 'u' :
        if (strlen ((char *) (what)) <= 5 || (((what [5]) < 'A' || (what [5]) > 'Z') ? (what [5]) : (what [5]) + ('a' - 'A')) !=
          'c') p = highlight_has_attr (id, 0x08, modec);
        else p = highlight_has_attr (id, 0x10, modec);
        break;
    }
    if (p != ((void *) 0)) p = vim_strsave (p);
    rettv -> v_type = 2;
    rettv -> vval.v_string = p;
}

static void f_synIDtrans (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    int id;
    id = get_tv_number (&argvars[0]);
    if (id > 0) id = syn_get_final_id (id);
    else id = 0;
    rettv -> vval.v_number = id;
}

static void f_synconcealed (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    rettv -> v_type = 4;
    rettv -> vval.v_list = ((void *) 0);
}

static void f_synstack (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    long lnum;
    long col;
    int i;
    int id;
    rettv -> v_type = 4;
    rettv -> vval.v_list = ((void *) 0);
    lnum = get_tv_lnum (argvars);
    col = get_tv_number (&argvars[1]) - 1;
    if (lnum >= 1 && lnum <= curbuf -> b_ml.ml_line_count && col >= 0 && col <= (long) strlen ((char *) (ml_get (lnum))) &&
      rettv_list_alloc (rettv) != 0) {
        (void) syn_get_id (curwin, lnum, (colnr_T) col, 0, ((void *) 0), 1);
        for (i = 0;; ++i) {
            id = syn_get_stack_item (i);
            if (id < 0) break;
            if (list_append_number (rettv -> vval.v_list, id) == 0) break;
        }
    }
}

static void f_system (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * res = ((void *) 0);
    char_u * p;
    char_u * infile = ((void *) 0);
    char_u buf [30];
    int err = 0;
    FILE * fd;
    if (check_restricted () || check_secure ()) goto done;
    if (argvars [1].v_type != 0) {
        if ((infile = vim_tempname ('i')) == ((void *) 0)) {
            emsg ((char_u *) (((char *) (e_notmp))));
            goto done;
        }
        fd = fopen (((char *) infile), ("wb"));
        if (fd == ((void *) 0)) {
            emsg2 ((char_u *) (((char *) (e_notopen))), (char_u *) (infile));
            goto done;
        }
        p = get_tv_string_buf_chk (&argvars[1], buf);
        if (p == ((void *) 0)) {
            fclose (fd);
            goto done;
        }
        if (fwrite (p, strlen ((char *) (p)), 1, fd) != 1) err = 1;
        if (fclose (fd) != 0) err = 1;
        if (err) {
            emsg ((char_u *) (((char *) ("E677: Error writing temp file"))));
            goto done;
        }
    }
    res = get_cmd_output (get_tv_string (&argvars[0]), infile, 16 | 4);
    done : if (infile != ((void *) 0)) {
        unlink ((char *) (infile));
        vim_free (infile);
    }
    rettv -> v_type = 2;
    rettv -> vval.v_string = res;
}

static void f_tabpagebuflist (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
    tabpage_T * tp;
    win_T * wp = ((void *) 0);
    if (argvars [0].v_type == 0) wp = firstwin;
    else {
        tp = find_tabpage ((int) get_tv_number (&argvars[0]));
        if (tp != ((void *) 0)) wp = (tp == curtab) ? firstwin : tp -> tp_firstwin;
    }
    if (wp != ((void *) 0) && rettv_list_alloc (rettv) != 0) {
        for (; wp != ((void *) 0); wp = wp -> w_next) if (list_append_number (rettv -> vval.v_list, wp -> w_buffer -> b_fnum) ==
          0) break;
    }
}

static void f_tabpagenr (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    int nr = 1;
    char_u * arg;
    if (argvars [0].v_type != 0) {
        arg = get_tv_string_chk (&argvars[0]);
        nr = 0;
        if (arg != ((void *) 0)) {
            if (strcmp ((char *) (arg), (char *) ("$")) == 0) nr = tabpage_index (((void *) 0)) - 1;
            else emsg2 ((char_u *) (((char *) (e_invexpr2))), (char_u *) (arg));
        }
    }
    else nr = tabpage_index (curtab);
    rettv -> vval.v_number = nr;
}

static int get_winnr (tabpage_T * tp, typval_T * argvar);

static int get_winnr (tp, argvar)
    tabpage_T * tp;
    typval_T * argvar;
{
    win_T * twin;
    int nr = 1;
    win_T * wp;
    char_u * arg;
    twin = (tp == curtab) ? curwin : tp -> tp_curwin;
    if (argvar -> v_type != 0) {
        arg = get_tv_string_chk (argvar);
        if (arg == ((void *) 0)) nr = 0;
        else if (strcmp ((char *) (arg), (char *) ("$")) == 0) twin = (tp == curtab) ? lastwin : tp -> tp_lastwin;
        else if (strcmp ((char *) (arg), (char *) ("#")) == 0) {
            twin = (tp == curtab) ? prevwin : tp -> tp_prevwin;
            if (twin == ((void *) 0)) nr = 0;
        }
        else {
            emsg2 ((char_u *) (((char *) (e_invexpr2))), (char_u *) (arg));
            nr = 0;
        }
    }
    if (nr > 0) for (wp = (tp == curtab) ? firstwin : tp -> tp_firstwin; wp != twin; wp = wp -> w_next) {
        if (wp == ((void *) 0)) {
            nr = 0;
            break;
        }
        ++nr;
    }
    return nr;
}

static void f_tabpagewinnr (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    int nr = 1;
    tabpage_T * tp;
    tp = find_tabpage ((int) get_tv_number (&argvars[0]));
    if (tp == ((void *) 0)) nr = 0;
    else nr = get_winnr (tp, &argvars[1]);
    rettv -> vval.v_number = nr;
}

static void f_tagfiles (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    char_u fname [1024 + 1];
    tagname_T tn;
    int first;
    if (rettv_list_alloc (rettv) == 0) return;
    for (first = 1;; first = 0) if (get_tagfname (&tn, first, fname) == 0 || list_append_string (rettv -> vval.v_list, fname, 
      -1) == 0) break;
    tagname_free (&tn);
}

static void f_taglist (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * tag_pattern;
    tag_pattern = get_tv_string (&argvars[0]);
    rettv -> vval.v_number = 0;
    if (*tag_pattern == '\000') return;
    if (rettv_list_alloc (rettv) == 1) (void) get_tags (rettv -> vval.v_list, tag_pattern);
}

static void f_tempname (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    static int x = 'A';
    rettv -> v_type = 2;
    rettv -> vval.v_string = vim_tempname (x);
    do {
        if (x == 'Z') x = '0';
        else if (x == '9') x = 'A';
        else {
            ++x;
        }
    }
    while (x == 'I' || x == 'O');
}

static void f_test (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
}

static void f_tan (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = tan (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_tanh (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = tanh (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_tolower (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * p;
    p = vim_strsave (get_tv_string (&argvars[0]));
    rettv -> v_type = 2;
    rettv -> vval.v_string = p;
    if (p != ((void *) 0)) while (*p != '\000') {
        {
            * p = tolower (*p);
            ++p;
        }
    }
}

static void f_toupper (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> v_type = 2;
    rettv -> vval.v_string = strup_save (get_tv_string (&argvars[0]));
}

static void f_tr (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    char_u * instr;
    char_u * fromstr;
    char_u * tostr;
    char_u * p;
    char_u buf [30];
    char_u buf2 [30];
    garray_T ga;
    instr = get_tv_string (&argvars[0]);
    fromstr = get_tv_string_buf_chk (&argvars[1], buf);
    tostr = get_tv_string_buf_chk (&argvars[2], buf2);
    rettv -> v_type = 2;
    rettv -> vval.v_string = ((void *) 0);
    if (fromstr == ((void *) 0) || tostr == ((void *) 0)) return;
    ga_init2 (&ga, (int) sizeof (char), 80);
    if (strlen ((char *) (fromstr)) != strlen ((char *) (tostr))) {
        emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (fromstr));
        ga_clear (&ga);
        return;
    }
    while (*instr != '\000') {
        {
            p = vim_strchr (fromstr, *instr);
            if (p != ((void *) 0)) ga_append (&ga, tostr [p - fromstr]);
            else ga_append (&ga, *instr);
            ++instr;
        }
    }
    ga_grow (&ga, 1);
    ga_append (&ga, '\000');
    rettv -> vval.v_string = ga.ga_data;
}

static void f_trunc (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    float_T f;
    rettv -> v_type = 6;
    if (get_float_arg (argvars, &f) == 1) rettv -> vval.v_float = f > 0 ? floor (f) : ceil (f);
    else rettv -> vval.v_float = 0.0;
}

static void f_type (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int n;
    switch (argvars [0].v_type) {
    case 1 :
        n = 0;
        break;
    case 2 :
        n = 1;
        break;
    case 3 :
        n = 2;
        break;
    case 4 :
        n = 3;
        break;
    case 5 :
        n = 4;
        break;
    case 6 :
        n = 5;
        break;
    default :
        emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("f_type()"));
        n = 0;
        break;
    }
    rettv -> vval.v_number = n;
}

static void f_undofile (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    rettv -> v_type = 2;
    {
        char_u * ffname = FullName_save (get_tv_string (&argvars[0]), 0);
        if (ffname != ((void *) 0)) rettv -> vval.v_string = u_get_undo_file_name (ffname, 0);
        vim_free (ffname);
    }
}

static void f_undotree (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    if (rettv_dict_alloc (rettv) == 1) {
        dict_T * dict = rettv -> vval.v_dict;
        list_T * list;
        dict_add_nr_str (dict, "synced", (long) curbuf -> b_u_synced, ((void *) 0));
        dict_add_nr_str (dict, "seq_last", curbuf -> b_u_seq_last, ((void *) 0));
        dict_add_nr_str (dict, "save_last", (long) curbuf -> b_u_save_nr_last, ((void *) 0));
        dict_add_nr_str (dict, "seq_cur", curbuf -> b_u_seq_cur, ((void *) 0));
        dict_add_nr_str (dict, "time_cur", (long) curbuf -> b_u_time_cur, ((void *) 0));
        dict_add_nr_str (dict, "save_cur", (long) curbuf -> b_u_save_nr_cur, ((void *) 0));
        list = list_alloc ();
        if (list != ((void *) 0)) {
            u_eval_tree (curbuf -> b_u_oldhead, list);
            dict_add_list (dict, "entries", list);
        }
    }
}

static void f_values (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    dict_list (argvars, rettv, 1);
}

static void f_virtcol (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    colnr_T vcol = 0;
    pos_T * fp;
    int fnum = curbuf -> b_fnum;
    fp = var2fpos (&argvars[0], 0, &fnum);
    if (fp != ((void *) 0) && fp -> lnum <= curbuf -> b_ml.ml_line_count && fnum == curbuf -> b_fnum) {
        getvvcol (curwin, fp, ((void *) 0), ((void *) 0), &vcol);
        ++vcol;
    }
    rettv -> vval.v_number = vcol;
}

static void f_visualmode (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv __attribute__ ((unused));
{
    char_u str [2];
    rettv -> v_type = 2;
    str [0] = curbuf -> b_visual_mode_eval;
    str [1] = '\000';
    rettv -> vval.v_string = vim_strsave (str);
    if (non_zero_arg (&argvars[0])) curbuf -> b_visual_mode_eval = '\000';
}

static void f_winbufnr (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    win_T * wp;
    wp = find_win_by_nr (&argvars[0], ((void *) 0));
    if (wp == ((void *) 0)) rettv -> vval.v_number = -1;
    else rettv -> vval.v_number = wp -> w_buffer -> b_fnum;
}

static void f_wincol (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    validate_cursor ();
    rettv -> vval.v_number = curwin -> w_wcol + 1;
}

static void f_winheight (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    win_T * wp;
    wp = find_win_by_nr (&argvars[0], ((void *) 0));
    if (wp == ((void *) 0)) rettv -> vval.v_number = -1;
    else rettv -> vval.v_number = wp -> w_height;
}

static void f_winline (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    validate_cursor ();
    rettv -> vval.v_number = curwin -> w_wrow + 1;
}

static void f_winnr (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    int nr = 1;
    nr = get_winnr (curtab, &argvars[0]);
    rettv -> vval.v_number = nr;
}

static void f_winrestcmd (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    win_T * wp;
    int winnr = 1;
    garray_T ga;
    char_u buf [50];
    ga_init2 (&ga, (int) sizeof (char), 70);
    for (wp = firstwin; wp != ((void *) 0); wp = wp -> w_next) {
        __builtin___sprintf_chk ((char *) buf, 0, __builtin_object_size ((char *) buf, 1 > 1), "%dresize %d|", winnr, wp ->
          w_height);
        ga_concat (&ga, buf);
        __builtin___sprintf_chk ((char *) buf, 0, __builtin_object_size ((char *) buf, 1 > 1), "vert %dresize %d|", winnr, wp ->
          w_width);
        ga_concat (&ga, buf);
        ++winnr;
    }
    ga_append (&ga, '\000');
    rettv -> vval.v_string = ga.ga_data;
    rettv -> v_type = 2;
}

static void f_winrestview (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv __attribute__ ((unused));
{
    dict_T * dict;
    if (argvars [0].v_type != 5 || (dict = argvars [0].vval.v_dict) == ((void *) 0)) emsg ((char_u *) (((char *) (e_invarg))));
    else {
        curwin -> w_cursor.lnum = get_dict_number (dict, (char_u *) "lnum");
        curwin -> w_cursor.col = get_dict_number (dict, (char_u *) "col");
        curwin -> w_cursor.coladd = get_dict_number (dict, (char_u *) "coladd");
        curwin -> w_curswant = get_dict_number (dict, (char_u *) "curswant");
        curwin -> w_set_curswant = 0;
        set_topline (curwin, get_dict_number (dict, (char_u *) "topline"));
        curwin -> w_topfill = get_dict_number (dict, (char_u *) "topfill");
        curwin -> w_leftcol = get_dict_number (dict, (char_u *) "leftcol");
        curwin -> w_skipcol = get_dict_number (dict, (char_u *) "skipcol");
        check_cursor ();
        changed_cline_bef_curs ();
        invalidate_botline ();
        redraw_later (10);
        if (curwin -> w_topline == 0) curwin -> w_topline = 1;
        if (curwin -> w_topline > curbuf -> b_ml.ml_line_count) curwin -> w_topline = curbuf -> b_ml.ml_line_count;
        check_topfill (curwin, 1);
    }
}

static void f_winsaveview (argvars, rettv)
    typval_T * argvars __attribute__ ((unused));
    typval_T * rettv;
{
    dict_T * dict;
    if (rettv_dict_alloc (rettv) == 0) return;
    dict = rettv -> vval.v_dict;
    dict_add_nr_str (dict, "lnum", (long) curwin -> w_cursor.lnum, ((void *) 0));
    dict_add_nr_str (dict, "col", (long) curwin -> w_cursor.col, ((void *) 0));
    dict_add_nr_str (dict, "coladd", (long) curwin -> w_cursor.coladd, ((void *) 0));
    update_curswant ();
    dict_add_nr_str (dict, "curswant", (long) curwin -> w_curswant, ((void *) 0));
    dict_add_nr_str (dict, "topline", (long) curwin -> w_topline, ((void *) 0));
    dict_add_nr_str (dict, "topfill", (long) curwin -> w_topfill, ((void *) 0));
    dict_add_nr_str (dict, "leftcol", (long) curwin -> w_leftcol, ((void *) 0));
    dict_add_nr_str (dict, "skipcol", (long) curwin -> w_skipcol, ((void *) 0));
}

static void f_winwidth (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    win_T * wp;
    wp = find_win_by_nr (&argvars[0], ((void *) 0));
    if (wp == ((void *) 0)) rettv -> vval.v_number = -1;
    else rettv -> vval.v_number = wp -> w_width;
}

static void f_writefile (argvars, rettv)
    typval_T * argvars;
    typval_T * rettv;
{
    int binary = 0;
    char_u * fname;
    FILE * fd;
    listitem_T * li;
    char_u * s;
    int ret = 0;
    int c;
    if (check_restricted () || check_secure ()) return;
    if (argvars [0].v_type != 4) {
        emsg2 ((char_u *) (((char *) (e_listarg))), (char_u *) ("writefile()"));
        return;
    }
    if (argvars [0].vval.v_list == ((void *) 0)) return;
    if (argvars [2].v_type != 0 && strcmp ((char *) (get_tv_string (&argvars[2])), (char *) ("b")) == 0) binary = 1;
    fname = get_tv_string (&argvars[1]);
    if (*fname == '\000' || (fd = fopen (((char *) fname), ("wb"))) == ((void *) 0)) {
        emsg2 ((char_u *) (((char *) (e_notcreate))), (char_u *) (*fname == '\000' ? (char_u *) ((char *) ("<empty>")) : fname)
          );
        ret = -1;
    }
    else {
        for (li = argvars [0].vval.v_list -> lv_first; li != ((void *) 0); li = li -> li_next) {
            for (s = get_tv_string (&li->li_tv); *s != '\000'; ++s) {
                if (*s == '\n') c = putc ('\000', fd);
                else c = putc (*s, fd);
                if (c == (-1)) {
                    ret = -1;
                    break;
                }
            }
            if (!binary || li -> li_next != ((void *) 0)) if (putc ('\n', fd) == (-1)) {
                ret = -1;
                break;
            }
            if (ret < 0) {
                emsg ((char_u *) (((char *) (e_write))));
                break;
            }
        }
        fclose (fd);
    }
    rettv -> vval.v_number = ret;
}

static pos_T * var2fpos (varp, dollar_lnum, fnum)
    typval_T * varp;
    int dollar_lnum;
    int * fnum;
{
    char_u * name;
    static pos_T pos;
    pos_T * pp;
    if (varp -> v_type == 4) {
        list_T * l;
        int len;
        int error = 0;
        listitem_T * li;
        l = varp -> vval.v_list;
        if (l == ((void *) 0)) return ((void *) 0);
        pos.lnum = list_find_nr (l, 0L, &error);
        if (error || pos.lnum <= 0 || pos.lnum > curbuf -> b_ml.ml_line_count) return ((void *) 0);
        pos.col = list_find_nr (l, 1L, &error);
        if (error) return ((void *) 0);
        len = (long) strlen ((char *) (ml_get (pos.lnum)));
        li = list_find (l, 1L);
        if (li != ((void *) 0) && li -> li_tv.v_type == 2 && li -> li_tv.vval.v_string != ((void *) 0) && strcmp ((char *) (li
          -> li_tv.vval.v_string), (char *) ("$")) == 0) pos.col = len + 1;
        if (pos.col == 0 || (int) pos.col > len + 1) return ((void *) 0);
        --pos.col;
        pos.coladd = list_find_nr (l, 2L, &error);
        if (error) pos.coladd = 0;
        return &pos;
    }
    name = get_tv_string_chk (varp);
    if (name == ((void *) 0)) return ((void *) 0);
    if (name [0] == '.') return &curwin->w_cursor;
    if (name [0] == 'v' && name [1] == '\000') {
        if (VIsual_active) return &VIsual;
        return &curwin->w_cursor;
    }
    if (name [0] == '\'') {
        pp = getmark_fnum (name [1], 0, fnum);
        if (pp == ((void *) 0) || pp == (pos_T *) -1 || pp -> lnum <= 0) return ((void *) 0);
        return pp;
    }
    pos.coladd = 0;
    if (name [0] == 'w' && dollar_lnum) {
        pos.col = 0;
        if (name [1] == '0') {
            update_topline ();
            pos.lnum = curwin -> w_topline;
            return &pos;
        }
        else if (name [1] == '$') {
            validate_botline ();
            pos.lnum = curwin -> w_botline - 1;
            return &pos;
        }
    }
    else if (name [0] == '$') {
        if (dollar_lnum) {
            pos.lnum = curbuf -> b_ml.ml_line_count;
            pos.col = 0;
        }
        else {
            pos.lnum = curwin -> w_cursor.lnum;
            pos.col = (colnr_T) strlen ((char *) (ml_get_curline ()));
        }
        return &pos;
    }
    return ((void *) 0);
}

static int list2fpos (arg, posp, fnump)
    typval_T * arg;
    pos_T * posp;
    int * fnump;
{
    list_T * l = arg -> vval.v_list;
    long i = 0;
    long n;
    if (arg -> v_type != 4 || l == ((void *) 0) || l -> lv_len < (fnump == ((void *) 0) ? 2 : 3) || l -> lv_len > (fnump == ((
      void *) 0) ? 3 : 4)) return 0;
    if (fnump != ((void *) 0)) {
        n = list_find_nr (l, i ++, ((void *) 0));
        if (n < 0) return 0;
        if (n == 0) n = curbuf -> b_fnum;
        * fnump = n;
    }
    n = list_find_nr (l, i ++, ((void *) 0));
    if (n < 0) return 0;
    posp -> lnum = n;
    n = list_find_nr (l, i ++, ((void *) 0));
    if (n < 0) return 0;
    posp -> col = n;
    n = list_find_nr (l, i, ((void *) 0));
    if (n < 0) posp -> coladd = 0;
    else posp -> coladd = n;
    return 1;
}

static int get_env_len (arg)
    char_u * * arg;
{
    char_u * p;
    int len;
    for (p = *arg; vim_isIDc (*p); ++p);
    if (p == *arg) return 0;
    len = (int) (p - *arg);
    * arg = p;
    return len;
}

static int get_id_len (arg)
    char_u * * arg;
{
    char_u * p;
    int len;
    for (p = *arg; eval_isnamec (*p); ++p);
    if (p == *arg) return 0;
    len = (int) (p - *arg);
    * arg = skipwhite (p);
    return len;
}

static int get_name_len (arg, alias, evaluate, verbose)
    char_u * * arg;
    char_u * * alias;
    int evaluate;
    int verbose;
{
    int len;
    char_u * p;
    char_u * expr_start;
    char_u * expr_end;
    * alias = ((void *) 0);
    if ((*arg) [0] == (0x80) && (*arg) [1] == 253 && (*arg) [2] == (int) KE_SNR) {
        *arg += 3;
        return get_id_len (arg) + 3;
    }
    len = eval_fname_script (*arg);
    if (len > 0) {
        *arg += len;
    }
    p = find_name_end (*arg, &expr_start, &expr_end, len > 0 ? 0 : 2);
    if (expr_start != ((void *) 0)) {
        char_u * temp_string;
        if (!evaluate) {
            len += (int) (p - *arg);
            * arg = skipwhite (p);
            return len;
        }
        temp_string = make_expanded_name (*arg - len, expr_start, expr_end, p);
        if (temp_string == ((void *) 0)) return -1;
        * alias = temp_string;
        * arg = skipwhite (p);
        return (int) strlen ((char *) (temp_string));
    }
    len += get_id_len (arg);
    if (len == 0 && verbose) emsg2 ((char_u *) (((char *) (e_invexpr2))), (char_u *) (*arg));
    return len;
}

static char_u * find_name_end (arg, expr_start, expr_end, flags)
    char_u * arg;
    char_u * * expr_start;
    char_u * * expr_end;
    int flags;
{
    int mb_nest = 0;
    int br_nest = 0;
    char_u * p;
    if (expr_start != ((void *) 0)) {
        * expr_start = ((void *) 0);
        * expr_end = ((void *) 0);
    }
    if ((flags & 2) && !eval_isnamec1(*arg) && *arg != '{') return arg;
    for (p = arg; *p != '\000' && (eval_isnamec (*p) || *p == '{' || ((flags & 1) && (*p == '[' || *p == '.')) || mb_nest != 0
      || br_nest != 0); ++p) {
        if (*p == '\'') {
            for (p = p + 1; *p != '\000' && *p != '\''; ++p);
            if (*p == '\000') break;
        }
        else if (*p == '"') {
            for (p = p + 1; *p != '\000' && *p != '"'; ++p) if (*p == '\\' && p [1] != '\000') ++p;
            if (*p == '\000') break;
        }
        if (mb_nest == 0) {
            if (*p == '[') ++br_nest;
            else if (*p == ']') --br_nest;
        }
        if (br_nest == 0) {
            if (*p == '{') {
                mb_nest ++;
                if (expr_start != ((void *) 0) && *expr_start == ((void *) 0)) *expr_start = p;
            }
            else if (*p == '}') {
                mb_nest --;
                if (expr_start != ((void *) 0) && mb_nest == 0 && *expr_end == ((void *) 0)) *expr_end = p;
            }
        }
    }
    return p;
}

static char_u * make_expanded_name (in_start, expr_start, expr_end, in_end)
    char_u * in_start;
    char_u * expr_start;
    char_u * expr_end;
    char_u * in_end;
{
    char_u c1;
    char_u * retval = ((void *) 0);
    char_u * temp_result;
    char_u * nextcmd = ((void *) 0);
    if (expr_end == ((void *) 0) || in_end == ((void *) 0)) return ((void *) 0);
    * expr_start = '\000';
    * expr_end = '\000';
    c1 = *in_end;
    * in_end = '\000';
    temp_result = eval_to_string (expr_start + 1, &nextcmd, 0);
    if (temp_result != ((void *) 0) && nextcmd == ((void *) 0)) {
        retval = alloc ((unsigned) (strlen ((char *) (temp_result)) + (expr_start - in_start) + (in_end - expr_end) + 1));
        if (retval != ((void *) 0)) {
            ((__builtin_object_size ((char *) (retval), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (retval), (char *
              ) (in_start), __builtin_object_size ((char *) (retval), 1 > 1)) : __inline_strcpy_chk ((char *) (retval), (char *
              ) (in_start)));
            ((__builtin_object_size ((char *) (retval), 0) != (size_t) - 1) ? __builtin___strcat_chk ((char *) (retval), (char *
              ) (temp_result), __builtin_object_size ((char *) (retval), 1 > 1)) : __inline_strcat_chk ((char *) (retval), (
              char *) (temp_result)));
            ((__builtin_object_size ((char *) (retval), 0) != (size_t) - 1) ? __builtin___strcat_chk ((char *) (retval), (char *
              ) (expr_end + 1), __builtin_object_size ((char *) (retval), 1 > 1)) : __inline_strcat_chk ((char *) (retval), (
              char *) (expr_end + 1)));
        }
    }
    vim_free (temp_result);
    * in_end = c1;
    * expr_start = '{';
    * expr_end = '}';
    if (retval != ((void *) 0)) {
        temp_result = find_name_end (retval, &expr_start, &expr_end, 0);
        if (expr_start != ((void *) 0)) {
            temp_result = make_expanded_name (retval, expr_start, expr_end, temp_result);
            vim_free (retval);
            retval = temp_result;
        }
    }
    return retval;
}

static int eval_isnamec (c)
    int c;
{
    return (((c) < 0x7f && isalnum (c)) || c == '_' || c == ':' || c == '#');
}

static int eval_isnamec1 (c)
    int c;
{
    return (((c) < 0x7f && isalpha (c)) || c == '_');
}

void set_vim_var_nr (idx, val)
    int idx;
    long val;
{
    vimvars [idx].vv_di.di_tv.vval.v_number = val;
}

long get_vim_var_nr (idx)
    int idx;
{
    return vimvars [idx].vv_di.di_tv.vval.v_number;
}

char_u * get_vim_var_str (idx)
    int idx;
{
    return get_tv_string (&vimvars[idx].vv_di.di_tv);
}

list_T * get_vim_var_list (idx)
    int idx;
{
    return vimvars [idx].vv_di.di_tv.vval.v_list;
}

void set_vim_var_char (c)
    int c;
{
    char_u buf [2];
    {
        buf [0] = c;
        buf [1] = '\000';
    }
    set_vim_var_string (48, buf, -1);
}

void set_vcount (count, count1, set_prevcount)
    long count;
    long count1;
    int set_prevcount;
{
    if (set_prevcount) vimvars [2].vv_di.di_tv.vval.v_number = vimvars [0].vv_di.di_tv.vval.v_number;
    vimvars [0].vv_di.di_tv.vval.v_number = count;
    vimvars [1].vv_di.di_tv.vval.v_number = count1;
}

void set_vim_var_string (idx, val, len)
    int idx;
    char_u * val;
    int len;
{
    vimvars [8].vv_di.di_tv.vval.v_number = (7 * 100 + 3);
    vim_free (vimvars [idx].vv_di.di_tv.vval.v_string);
    if (val == ((void *) 0)) vimvars [idx].vv_di.di_tv.vval.v_string = ((void *) 0);
    else if (len == -1) vimvars [idx].vv_di.di_tv.vval.v_string = vim_strsave (val);
    else vimvars [idx].vv_di.di_tv.vval.v_string = vim_strnsave (val, len);
}

void set_vim_var_list (idx, val)
    int idx;
    list_T * val;
{
    list_unref (vimvars [idx].vv_di.di_tv.vval.v_list);
    vimvars [idx].vv_di.di_tv.vval.v_list = val;
    if (val != ((void *) 0)) ++val->lv_refcount;
}

void set_reg_var (c)
    int c;
{
    char_u regname;
    if (c == 0 || c == ' ') regname = '"';
    else regname = c;
    if (vimvars [31].vv_di.di_tv.vval.v_string == ((void *) 0) || vimvars [31].vv_di.di_tv.vval.v_string [0] != c)
      set_vim_var_string (31, &regname, 1);
}

char_u * v_exception (oldval)
    char_u * oldval;
{
    if (oldval == ((void *) 0)) return vimvars [29].vv_di.di_tv.vval.v_string;
    vimvars [29].vv_di.di_tv.vval.v_string = oldval;
    return ((void *) 0);
}

char_u * v_throwpoint (oldval)
    char_u * oldval;
{
    if (oldval == ((void *) 0)) return vimvars [30].vv_di.di_tv.vval.v_string;
    vimvars [30].vv_di.di_tv.vval.v_string = oldval;
    return ((void *) 0);
}

char_u * set_cmdarg (eap, oldarg)
    exarg_T * eap;
    char_u * oldarg;
{
    char_u * oldval;
    char_u * newval;
    unsigned len;
    oldval = vimvars [21].vv_di.di_tv.vval.v_string;
    if (eap == ((void *) 0)) {
        vim_free (oldval);
        vimvars [21].vv_di.di_tv.vval.v_string = oldarg;
        return ((void *) 0);
    }
    if (eap -> force_bin == 1) len = 6;
    else if (eap -> force_bin == 2) len = 8;
    else len = 0;
    if (eap -> read_edit) len += 7;
    if (eap -> force_ff != 0) len += (unsigned) strlen ((char *) (eap -> cmd + eap -> force_ff)) + 6;
    newval = alloc (len + 1);
    if (newval == ((void *) 0)) return ((void *) 0);
    if (eap -> force_bin == 1) __builtin___sprintf_chk ((char *) newval, 0, __builtin_object_size ((char *) newval, 1 > 1),
      " ++bin");
    else if (eap -> force_bin == 2) __builtin___sprintf_chk ((char *) newval, 0, __builtin_object_size ((char *) newval, 1 > 1)
      , " ++nobin");
    else *newval = '\000';
    if (eap -> read_edit) ((__builtin_object_size ((char *) (newval), 0) != (size_t) - 1) ? __builtin___strcat_chk ((char *) (
      newval), (char *) (" ++edit"), __builtin_object_size ((char *) (newval), 1 > 1)) : __inline_strcat_chk ((char *) (newval)
      , (char *) (" ++edit")));
    if (eap -> force_ff != 0) __builtin___sprintf_chk ((char *) newval + strlen ((char *) (newval)), 0, __builtin_object_size (
      (char *) newval + strlen ((char *) (newval)), 1 > 1), " ++ff=%s", eap -> cmd + eap -> force_ff);
    vimvars [21].vv_di.di_tv.vval.v_string = newval;
    return oldval;
}

static int get_var_tv (name, len, rettv, verbose)
    char_u * name;
    int len;
    typval_T * rettv;
    int verbose;
{
    int ret = 1;
    typval_T * tv = ((void *) 0);
    typval_T atv;
    dictitem_T * v;
    int cc;
    cc = name [len];
    name [len] = '\000';
    if (strcmp ((char *) (name), (char *) ("b:changedtick")) == 0) {
        atv.v_type = 1;
        atv.vval.v_number = curbuf -> b_changedtick;
        tv = &atv;
    }
    else {
        v = find_var (name, ((void *) 0));
        if (v != ((void *) 0)) tv = &v->di_tv;
    }
    if (tv == ((void *) 0)) {
        if (rettv != ((void *) 0) && verbose) emsg2 ((char_u *) (((char *) (e_undefvar))), (char_u *) (name));
        ret = 0;
    }
    else if (rettv != ((void *) 0)) copy_tv (tv, rettv);
    name [len] = cc;
    return ret;
}

static int handle_subscript (arg, rettv, evaluate, verbose)
    char_u * * arg;
    typval_T * rettv;
    int evaluate;
    int verbose;
{
    int ret = 1;
    dict_T * selfdict = ((void *) 0);
    char_u * s;
    int len;
    typval_T functv;
    while (ret == 1 && (**arg == '[' || (**arg == '.' && rettv -> v_type == 5) || (**arg == '(' && rettv -> v_type == 3)) && 
      !((*(*arg - 1)) == ' ' || (*(*arg - 1)) == '\t')) {
        if (**arg == '(') {
            functv = *rettv;
            rettv -> v_type = 0;
            s = functv.vval.v_string;
            ret = get_func_tv (s, (int) strlen ((char *) (s)), rettv, arg, curwin -> w_cursor.lnum, curwin -> w_cursor.lnum, 
              &len, evaluate, selfdict);
            clear_tv (&functv);
            if (aborting ()) {
                if (ret == 1) clear_tv (rettv);
                ret = 0;
            }
            dict_unref (selfdict);
            selfdict = ((void *) 0);
        }
        else {
            dict_unref (selfdict);
            if (rettv -> v_type == 5) {
                selfdict = rettv -> vval.v_dict;
                if (selfdict != ((void *) 0)) ++selfdict->dv_refcount;
            }
            else selfdict = ((void *) 0);
            if (eval_index (arg, rettv, evaluate, verbose) == 0) {
                clear_tv (rettv);
                ret = 0;
            }
        }
    }
    dict_unref (selfdict);
    return ret;
}

static typval_T * alloc_tv () {
    return (typval_T *) alloc_clear ((unsigned) sizeof (typval_T));
}

static typval_T * alloc_string_tv (s)
    char_u * s;
{
    typval_T * rettv;
    rettv = alloc_tv ();
    if (rettv != ((void *) 0)) {
        rettv -> v_type = 2;
        rettv -> vval.v_string = s;
    }
    else vim_free (s);
    return rettv;
}

void free_tv (varp)
    typval_T * varp;
{
    if (varp != ((void *) 0)) {
        switch (varp -> v_type) {
        case 3 :
            func_unref (varp -> vval.v_string);
        case 2 :
            vim_free (varp -> vval.v_string);
            break;
        case 4 :
            list_unref (varp -> vval.v_list);
            break;
        case 5 :
            dict_unref (varp -> vval.v_dict);
            break;
        case 1 :
        case 6 :
        case 0 :
            break;
        default :
            emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("free_tv()"));
            break;
        }
        vim_free (varp);
    }
}

void clear_tv (varp)
    typval_T * varp;
{
    if (varp != ((void *) 0)) {
        switch (varp -> v_type) {
        case 3 :
            func_unref (varp -> vval.v_string);
        case 2 :
            vim_free (varp -> vval.v_string);
            varp -> vval.v_string = ((void *) 0);
            break;
        case 4 :
            list_unref (varp -> vval.v_list);
            varp -> vval.v_list = ((void *) 0);
            break;
        case 5 :
            dict_unref (varp -> vval.v_dict);
            varp -> vval.v_dict = ((void *) 0);
            break;
        case 1 :
            varp -> vval.v_number = 0;
            break;
        case 6 :
            varp -> vval.v_float = 0.0;
            break;
        case 0 :
            break;
        default :
            emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("clear_tv()"));
        }
        varp -> v_lock = 0;
    }
}

static void init_tv (varp)
    typval_T * varp;
{
    if (varp != ((void *) 0)) ((__builtin_object_size ((varp), 0) != (size_t) - 1) ? __builtin___memset_chk ((varp), (0), (
      sizeof (typval_T)), __builtin_object_size ((varp), 0)) : __inline_memset_chk ((varp), (0), (sizeof (typval_T))));
}

static long get_tv_number (varp)
    typval_T * varp;
{
    int error = 0;
    return get_tv_number_chk (varp, &error);
}

long get_tv_number_chk (varp, denote)
    typval_T * varp;
    int * denote;
{
    long n = 0L;
    switch (varp -> v_type) {
    case 1 :
        return (long) (varp -> vval.v_number);
    case 6 :
        emsg ((char_u *) (((char *) ("E805: Using a Float as a Number"))));
        break;
    case 3 :
        emsg ((char_u *) (((char *) ("E703: Using a Funcref as a Number"))));
        break;
    case 2 :
        if (varp -> vval.v_string != ((void *) 0)) vim_str2nr (varp -> vval.v_string, ((void *) 0), ((void *) 0), 1, 1, &n, ((
          void *) 0));
        return n;
    case 4 :
        emsg ((char_u *) (((char *) ("E745: Using a List as a Number"))));
        break;
    case 5 :
        emsg ((char_u *) (((char *) ("E728: Using a Dictionary as a Number"))));
        break;
    default :
        emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("get_tv_number()"));
        break;
    }
    if (denote == ((void *) 0)) n = -1;
    else *denote = 1;
    return n;
}

static linenr_T get_tv_lnum (argvars)
    typval_T * argvars;
{
    typval_T rettv;
    linenr_T lnum;
    lnum = get_tv_number_chk (&argvars[0], ((void *) 0));
    if (lnum == 0) {
        rettv.v_type = 1;
        f_line (argvars, &rettv);
        lnum = rettv.vval.v_number;
        clear_tv (&rettv);
    }
    return lnum;
}

static linenr_T get_tv_lnum_buf (argvars, buf)
    typval_T * argvars;
    buf_T * buf;
{
    if (argvars [0].v_type == 2 && argvars [0].vval.v_string != ((void *) 0) && argvars [0].vval.v_string [0] == '$' && buf != (
      (void *) 0)) return buf -> b_ml.ml_line_count;
    return get_tv_number_chk (&argvars[0], ((void *) 0));
}

static char_u * get_tv_string (varp)
    typval_T * varp;
{
    static char_u mybuf [30];
    return get_tv_string_buf (varp, mybuf);
}

static char_u * get_tv_string_buf (varp, buf)
    typval_T * varp;
    char_u * buf;
{
    char_u * res = get_tv_string_buf_chk (varp, buf);
    return res != ((void *) 0) ? res : (char_u *) "";
}

char_u * get_tv_string_chk (varp)
    typval_T * varp;
{
    static char_u mybuf [30];
    return get_tv_string_buf_chk (varp, mybuf);
}

static char_u * get_tv_string_buf_chk (varp, buf)
    typval_T * varp;
    char_u * buf;
{
    switch (varp -> v_type) {
    case 1 :
        __builtin___sprintf_chk ((char *) buf, 0, __builtin_object_size ((char *) buf, 1 > 1), "%ld", (long) varp -> vval.
          v_number);
        return buf;
    case 3 :
        emsg ((char_u *) (((char *) ("E729: using Funcref as a String"))));
        break;
    case 4 :
        emsg ((char_u *) (((char *) ("E730: using List as a String"))));
        break;
    case 5 :
        emsg ((char_u *) (((char *) ("E731: using Dictionary as a String"))));
        break;
    case 6 :
        emsg ((char_u *) (((char *) ("E806: using Float as a String"))));
        break;
    case 2 :
        if (varp -> vval.v_string != ((void *) 0)) return varp -> vval.v_string;
        return (char_u *) "";
    default :
        emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("get_tv_string_buf()"));
        break;
    }
    return ((void *) 0);
}

static dictitem_T * find_var (name, htp)
    char_u * name;
    hashtab_T * * htp;
{
    char_u * varname;
    hashtab_T * ht;
    ht = find_var_ht (name, &varname);
    if (htp != ((void *) 0)) *htp = ht;
    if (ht == ((void *) 0)) return ((void *) 0);
    return find_var_in_ht (ht, varname, htp != ((void *) 0));
}

static dictitem_T * find_var_in_ht (ht, varname, writing)
    hashtab_T * ht;
    char_u * varname;
    int writing;
{
    hashitem_T * hi;
    if (*varname == '\000') {
        switch (varname [-2]) {
        case 's' :
            return &(((scriptvar_T**)ga_scripts.ga_data)[(current_SID)-1])->sv_var;
        case 'g' :
            return &globvars_var;
        case 'v' :
            return &vimvars_var;
        case 'b' :
            return &curbuf->b_bufvar;
        case 'w' :
            return &curwin->w_winvar;
        case 't' :
            return &curtab->tp_winvar;
        case 'l' :
            return current_funccal == ((void *) 0) ? ((void *) 0) : &current_funccal->l_vars_var;
        case 'a' :
            return current_funccal == ((void *) 0) ? ((void *) 0) : &current_funccal->l_avars_var;
        }
        return ((void *) 0);
    }
    hi = hash_find (ht, varname);
    if (((hi) -> hi_key == ((void *) 0) || (hi) -> hi_key == &hash_removed)) {
        if (ht == &globvardict.dv_hashtab && !writing && script_autoload (varname, 0) && !aborting()) hi = hash_find (ht,
          varname);
        if (((hi) -> hi_key == ((void *) 0) || (hi) -> hi_key == &hash_removed)) return ((void *) 0);
    }
    return ((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi)));
}

static hashtab_T * find_var_ht (name, varname)
    char_u * name;
    char_u * * varname;
{
    hashitem_T * hi;
    if (name [1] != ':') {
        if (name [0] == ':' || name [0] == '#') return ((void *) 0);
        * varname = name;
        hi = hash_find (&compat_hashtab, name);
        if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) return &compat_hashtab;
        if (current_funccal == ((void *) 0)) return &globvardict.dv_hashtab;
        return &current_funccal->l_vars.dv_hashtab;
    }
    * varname = name + 2;
    if (*name == 'g') return &globvardict.dv_hashtab;
    if (vim_strchr (name + 2, ':') != ((void *) 0) || vim_strchr (name + 2, '#') != ((void *) 0)) return ((void *) 0);
    if (*name == 'b') return &curbuf->b_vars.dv_hashtab;
    if (*name == 'w') return &curwin->w_vars.dv_hashtab;
    if (*name == 't') return &curtab->tp_vars.dv_hashtab;
    if (*name == 'v') return &vimvardict.dv_hashtab;
    if (*name == 'a' && current_funccal != ((void *) 0)) return &current_funccal->l_avars.dv_hashtab;
    if (*name == 'l' && current_funccal != ((void *) 0)) return &current_funccal->l_vars.dv_hashtab;
    if (*name == 's' && current_SID > 0 && current_SID <= ga_scripts.ga_len) return 
      &((((scriptvar_T**)ga_scripts.ga_data)[(current_SID)-1])->sv_dict.dv_hashtab);
    return ((void *) 0);
}

char_u * get_var_value (name)
    char_u * name;
{
    dictitem_T * v;
    v = find_var (name, ((void *) 0));
    if (v == ((void *) 0)) return ((void *) 0);
    return get_tv_string (&v->di_tv);
}

void new_script_vars (id)
    scid_T id;
{
    int i;
    hashtab_T * ht;
    scriptvar_T * sv;
    if (ga_grow (&ga_scripts, (int) (id - ga_scripts.ga_len)) == 1) {
        for (i = 1; i <= ga_scripts.ga_len; ++i) {
            ht = &((((scriptvar_T**)ga_scripts.ga_data)[(i)-1])->sv_dict.dv_hashtab);
            if (ht -> ht_mask == 16 - 1) ht -> ht_array = ht -> ht_smallarray;
            sv = (((scriptvar_T * *) ga_scripts.ga_data) [(i) - 1]);
            sv -> sv_var.di_tv.vval.v_dict = &sv->sv_dict;
        }
        while (ga_scripts.ga_len < id) {
            sv = (((scriptvar_T * *) ga_scripts.ga_data) [(ga_scripts.ga_len + 1) - 1]) = (scriptvar_T *) alloc_clear (sizeof (
              scriptvar_T));
            init_var_dict (&sv->sv_dict, &sv->sv_var);
            ++ga_scripts.ga_len;
        }
    }
}

void init_var_dict (dict, dict_var)
    dict_T * dict;
    dictitem_T * dict_var;
{
    hash_init (&dict->dv_hashtab);
    dict -> dv_refcount = 99999;
    dict -> dv_copyID = 0;
    dict_var -> di_tv.vval.v_dict = dict;
    dict_var -> di_tv.v_type = 5;
    dict_var -> di_tv.v_lock = 2;
    dict_var -> di_flags = 1 | 4;
    dict_var -> di_key [0] = '\000';
}

void vars_clear (ht)
    hashtab_T * ht;
{
    vars_clear_ext (ht, 1);
}

static void vars_clear_ext (ht, free_val)
    hashtab_T * ht;
    int free_val;
{
    int todo;
    hashitem_T * hi;
    dictitem_T * v;
    hash_lock (ht);
    todo = (int) ht -> ht_used;
    for (hi = ht -> ht_array; todo > 0; ++hi) {
        if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
            --todo;
            v = ((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi)));
            if (free_val) clear_tv (&v->di_tv);
            if ((v -> di_flags & 4) == 0) vim_free (v);
        }
    }
    hash_clear (ht);
    ht -> ht_used = 0;
}

static void delete_var (ht, hi)
    hashtab_T * ht;
    hashitem_T * hi;
{
    dictitem_T * di = ((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi)));
    hash_remove (ht, hi);
    clear_tv (&di->di_tv);
    vim_free (di);
}

static void list_one_var (v, prefix, first)
    dictitem_T * v;
    char_u * prefix;
    int * first;
{
    char_u * tofree;
    char_u * s;
    char_u numbuf [30];
    current_copyID += 2;
    s = echo_string (&v->di_tv, &tofree, numbuf, current_copyID);
    list_one_var_a (prefix, v -> di_key, v -> di_tv.v_type, s == ((void *) 0) ? (char_u *) "" : s, first);
    vim_free (tofree);
}

static void list_one_var_a (prefix, name, type, string, first)
    char_u * prefix;
    char_u * name;
    int type;
    char_u * string;
    int * first;
{
    msg_start ();
    msg_puts (prefix);
    if (name != ((void *) 0)) msg_puts (name);
    msg_putchar (' ');
    msg_advance (22);
    if (type == 1) msg_putchar ('#');
    else if (type == 3) msg_putchar ('*');
    else if (type == 4) {
        msg_putchar ('[');
        if (*string == '[') ++string;
    }
    else if (type == 5) {
        msg_putchar ('{');
        if (*string == '{') ++string;
    }
    else msg_putchar (' ');
    msg_outtrans (string);
    if (type == 3) msg_puts ((char_u *) "()");
    if (*first) {
        msg_clr_eos ();
        * first = 0;
    }
}

static void set_var (name, tv, copy)
    char_u * name;
    typval_T * tv;
    int copy;
{
    dictitem_T * v;
    char_u * varname;
    hashtab_T * ht;
    char_u * p;
    ht = find_var_ht (name, &varname);
    if (ht == ((void *) 0) || *varname == '\000') {
        emsg2 ((char_u *) (((char *) (e_illvar))), (char_u *) (name));
        return;
    }
    v = find_var_in_ht (ht, varname, 1);
    if (tv -> v_type == 3) {
        if (!(vim_strchr((char_u*)"wbs",name[0])!=((void*)0)&&name[1]==':') && 
          !(((name[0]!='\000'&&name[1]==':')?name[2]:name[0])<0x7f&&isupper((name[0]!='\000'&&name[1]==':')?name[2]:name[0]))) {
            emsg2 ((char_u *) (((char *) ("E704: Funcref variable name must start with a capital: %s"))), (char_u *) (name));
            return;
        }
        if (v == ((void *) 0) && function_exists (name)) {
            emsg2 ((char_u *) (((char *) ("E705: Variable name conflicts with existing function: %s"))), (char_u *) (name));
            return;
        }
    }
    if (v != ((void *) 0)) {
        if (var_check_ro (v -> di_flags, name) || tv_check_lock (v -> di_tv.v_lock, name)) return;
        if (v -> di_tv.v_type != tv -> v_type && !((v->di_tv.v_type==2||v->di_tv.v_type==1)&&(tv->v_type==2||tv->v_type==1)) &&
          !((v->di_tv.v_type==1||v->di_tv.v_type==6)&&(tv->v_type==1||tv->v_type==6))) {
            emsg2 ((char_u *) (((char *) ("E706: Variable type mismatch for: %s"))), (char_u *) (name));
            return;
        }
        if (ht == &vimvardict.dv_hashtab) {
            if (v -> di_tv.v_type == 2) {
                vim_free (v -> di_tv.vval.v_string);
                if (copy || tv -> v_type != 2) v -> di_tv.vval.v_string = vim_strsave (get_tv_string (tv));
                else {
                    v -> di_tv.vval.v_string = tv -> vval.v_string;
                    tv -> vval.v_string = ((void *) 0);
                }
            }
            else if (v -> di_tv.v_type != 1) emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("set_var()"));
            else {
                v -> di_tv.vval.v_number = get_tv_number (tv);
                if (strcmp ((char *) (varname), (char *) ("searchforward")) == 0) set_search_direction (v -> di_tv.vval.
                  v_number ? '/' : '?');
            }
            return;
        }
        clear_tv (&v->di_tv);
    }
    else {
        if (ht == &vimvardict.dv_hashtab) {
            emsg2 ((char_u *) (((char *) (e_illvar))), (char_u *) (name));
            return;
        }
        for (p = varname; *p != '\000'; ++p) if (!eval_isnamec1(*p) && (p == varname || !((*p) >= '0' && (*p) <= '9')) && *p !=
          '#') {
            emsg2 ((char_u *) (((char *) (e_illvar))), (char_u *) (varname));
            return;
        }
        v = (dictitem_T *) alloc ((unsigned) (sizeof (dictitem_T) + strlen ((char *) (varname))));
        if (v == ((void *) 0)) return;
        ((__builtin_object_size ((char *) (v -> di_key), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (v -> di_key), (
          char *) (varname), __builtin_object_size ((char *) (v -> di_key), 1 > 1)) : __inline_strcpy_chk ((char *) (v -> di_key
          ), (char *) (varname)));
        if (hash_add (ht, ((v) -> di_key)) == 0) {
            vim_free (v);
            return;
        }
        v -> di_flags = 0;
    }
    if (copy || tv -> v_type == 1 || tv -> v_type == 6) copy_tv (tv, &v->di_tv);
    else {
        v -> di_tv = *tv;
        v -> di_tv.v_lock = 0;
        init_tv (tv);
    }
}

static int var_check_ro (flags, name)
    int flags;
    char_u * name;
{
    if (flags & 1) {
        emsg2 ((char_u *) (((char *) (e_readonlyvar))), (char_u *) (name));
        return 1;
    }
    if ((flags & 2) && sandbox) {
        emsg2 ((char_u *) (((char *) (e_readonlysbx))), (char_u *) (name));
        return 1;
    }
    return 0;
}

static int var_check_fixed (flags, name)
    int flags;
    char_u * name;
{
    if (flags & 4) {
        emsg2 ((char_u *) (((char *) ("E795: Cannot delete variable %s"))), (char_u *) (name));
        return 1;
    }
    return 0;
}

static int tv_check_lock (lock, name)
    int lock;
    char_u * name;
{
    if (lock & 1) {
        emsg2 ((char_u *) (((char *) ("E741: Value is locked: %s"))), (char_u *) (name == ((void *) 0) ? (char_u *) ((char *) (
          "Unknown")) : name));
        return 1;
    }
    if (lock & 2) {
        emsg2 ((char_u *) (((char *) ("E742: Cannot change value of %s"))), (char_u *) (name == ((void *) 0) ? (char_u *) ((
          char *) ("Unknown")) : name));
        return 1;
    }
    return 0;
}

void copy_tv (from, to)
    typval_T * from;
    typval_T * to;
{
    to -> v_type = from -> v_type;
    to -> v_lock = 0;
    switch (from -> v_type) {
    case 1 :
        to -> vval.v_number = from -> vval.v_number;
        break;
    case 6 :
        to -> vval.v_float = from -> vval.v_float;
        break;
    case 2 :
    case 3 :
        if (from -> vval.v_string == ((void *) 0)) to -> vval.v_string = ((void *) 0);
        else {
            to -> vval.v_string = vim_strsave (from -> vval.v_string);
            if (from -> v_type == 3) func_ref (to -> vval.v_string);
        }
        break;
    case 4 :
        if (from -> vval.v_list == ((void *) 0)) to -> vval.v_list = ((void *) 0);
        else {
            to -> vval.v_list = from -> vval.v_list;
            ++to->vval.v_list->lv_refcount;
        }
        break;
    case 5 :
        if (from -> vval.v_dict == ((void *) 0)) to -> vval.v_dict = ((void *) 0);
        else {
            to -> vval.v_dict = from -> vval.v_dict;
            ++to->vval.v_dict->dv_refcount;
        }
        break;
    default :
        emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("copy_tv()"));
        break;
    }
}

static int item_copy (from, to, deep, copyID)
    typval_T * from;
    typval_T * to;
    int deep;
    int copyID;
{
    static int recurse = 0;
    int ret = 1;
    if (recurse >= 100) {
        emsg ((char_u *) (((char *) ("E698: variable nested too deep for making a copy"))));
        return 0;
    }
    ++recurse;
    switch (from -> v_type) {
    case 1 :
    case 6 :
    case 2 :
    case 3 :
        copy_tv (from, to);
        break;
    case 4 :
        to -> v_type = 4;
        to -> v_lock = 0;
        if (from -> vval.v_list == ((void *) 0)) to -> vval.v_list = ((void *) 0);
        else if (copyID != 0 && from -> vval.v_list -> lv_copyID == copyID) {
            to -> vval.v_list = from -> vval.v_list -> lv_copylist;
            ++to->vval.v_list->lv_refcount;
        }
        else to -> vval.v_list = list_copy (from -> vval.v_list, deep, copyID);
        if (to -> vval.v_list == ((void *) 0)) ret = 0;
        break;
    case 5 :
        to -> v_type = 5;
        to -> v_lock = 0;
        if (from -> vval.v_dict == ((void *) 0)) to -> vval.v_dict = ((void *) 0);
        else if (copyID != 0 && from -> vval.v_dict -> dv_copyID == copyID) {
            to -> vval.v_dict = from -> vval.v_dict -> dv_copydict;
            ++to->vval.v_dict->dv_refcount;
        }
        else to -> vval.v_dict = dict_copy (from -> vval.v_dict, deep, copyID);
        if (to -> vval.v_dict == ((void *) 0)) ret = 0;
        break;
    default :
        emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("item_copy()"));
        ret = 0;
    }
    --recurse;
    return ret;
}

void ex_echo (eap)
    exarg_T * eap;
{
    char_u * arg = eap -> arg;
    typval_T rettv;
    char_u * tofree;
    char_u * p;
    int needclr = 1;
    int atstart = 1;
    char_u numbuf [30];
    if (eap -> skip) ++emsg_skip;
    while (*arg != '\000' && *arg != '|' && *arg != '\n' && !got_int) {
        need_clr_eos = needclr;
        p = arg;
        if (eval1 (&arg, &rettv, !eap->skip) == 0) {
            if (!aborting()) emsg2 ((char_u *) (((char *) (e_invexpr2))), (char_u *) (p));
            need_clr_eos = 0;
            break;
        }
        need_clr_eos = 0;
        if (!eap->skip) {
            if (atstart) {
                atstart = 0;
                if (eap -> cmdidx == CMD_echo) msg_start ();
            }
            else if (eap -> cmdidx == CMD_echo) msg_puts_attr ((char_u *) " ", echo_attr);
            current_copyID += 2;
            p = echo_string (&rettv, &tofree, numbuf, current_copyID);
            if (p != ((void *) 0)) for (; *p != '\000' && !got_int; ++p) {
                if (*p == '\n' || *p == '\r' || *p == '\011') {
                    if (*p != '\011' && needclr) {
                        msg_clr_eos ();
                        needclr = 0;
                    }
                    msg_putchar_attr (* p, echo_attr);
                }
                else {
                    (void) msg_outtrans_len_attr (p, 1, echo_attr);
                }
            }
            vim_free (tofree);
        }
        clear_tv (&rettv);
        arg = skipwhite (arg);
    }
    eap -> nextcmd = check_nextcmd (arg);
    if (eap -> skip) --emsg_skip;
    else {
        if (needclr) msg_clr_eos ();
        if (eap -> cmdidx == CMD_echo) msg_end ();
    }
}

void ex_echohl (eap)
    exarg_T * eap;
{
    int id;
    id = syn_name2id (eap -> arg);
    if (id == 0) echo_attr = 0;
    else echo_attr = syn_id2attr (id);
}

void ex_execute (eap)
    exarg_T * eap;
{
    char_u * arg = eap -> arg;
    typval_T rettv;
    int ret = 1;
    char_u * p;
    garray_T ga;
    int len;
    int save_did_emsg;
    ga_init2 (&ga, 1, 80);
    if (eap -> skip) ++emsg_skip;
    while (*arg != '\000' && *arg != '|' && *arg != '\n') {
        p = arg;
        if (eval1 (&arg, &rettv, !eap->skip) == 0) {
            if (!aborting()) emsg2 ((char_u *) (((char *) (e_invexpr2))), (char_u *) (p));
            ret = 0;
            break;
        }
        if (!eap->skip) {
            p = get_tv_string (&rettv);
            len = (int) strlen ((char *) (p));
            if (ga_grow (&ga, len + 2) == 0) {
                clear_tv (&rettv);
                ret = 0;
                break;
            }
            if (ga.ga_len) ((char_u *) (ga.ga_data)) [ga.ga_len ++] = ' ';
            ((__builtin_object_size ((char *) ((char_u *) (ga.ga_data) + ga.ga_len), 0) != (size_t) - 1) ?
              __builtin___strcpy_chk ((char *) ((char_u *) (ga.ga_data) + ga.ga_len), (char *) (p), __builtin_object_size ((
              char *) ((char_u *) (ga.ga_data) + ga.ga_len), 1 > 1)) : __inline_strcpy_chk ((char *) ((char_u *) (ga.ga_data) +
              ga.ga_len), (char *) (p)));
            ga.ga_len += len;
        }
        clear_tv (&rettv);
        arg = skipwhite (arg);
    }
    if (ret != 0 && ga.ga_data != ((void *) 0)) {
        if (eap -> cmdidx == CMD_echomsg) {
            msg_attr ((char_u *) (ga.ga_data), (echo_attr));
            out_flush ();
        }
        else if (eap -> cmdidx == CMD_echoerr) {
            save_did_emsg = did_emsg;
            emsg ((char_u *) ((char_u *) ga.ga_data));
            if (!force_abort) did_emsg = save_did_emsg;
        }
        else if (eap -> cmdidx == CMD_execute) do_cmdline ((char_u *) ga.ga_data, eap -> getline, eap -> cookie, 0x02 | 0x01);
    }
    ga_clear (&ga);
    if (eap -> skip) --emsg_skip;
    eap -> nextcmd = check_nextcmd (arg);
}

static char_u * find_option_end (arg, opt_flags)
    char_u * * arg;
    int * opt_flags;
{
    char_u * p = *arg;
    ++p;
    if (*p == 'g' && p [1] == ':') {
        * opt_flags = 2;
        p += 2;
    }
    else if (*p == 'l' && p [1] == ':') {
        * opt_flags = 4;
        p += 2;
    }
    else *opt_flags = 0;
    if (!((*p) < 0x7f && isalpha (*p))) return ((void *) 0);
    * arg = p;
    if (p [0] == 't' && p [1] == '_' && p [2] != '\000' && p [3] != '\000') p += 4;
    else while (((*p) < 0x7f && isalpha (*p))) ++p;
    return p;
}

void ex_function (eap)
    exarg_T * eap;
{
    char_u * theline;
    int j;
    int c;
    int saved_did_emsg;
    char_u * name = ((void *) 0);
    char_u * p;
    char_u * arg;
    char_u * line_arg = ((void *) 0);
    garray_T newargs;
    garray_T newlines;
    int varargs = 0;
    int mustend = 0;
    int flags = 0;
    ufunc_T * fp;
    int indent;
    int nesting;
    char_u * skip_until = ((void *) 0);
    dictitem_T * v;
    funcdict_T fudi;
    static int func_nr = 0;
    int paren;
    hashtab_T * ht;
    int todo;
    hashitem_T * hi;
    int sourcing_lnum_off;
    if (ends_excmd (*eap->arg)) {
        if (!eap->skip) {
            todo = (int) func_hashtab.ht_used;
            for (hi = func_hashtab.ht_array; todo > 0 && !got_int; ++hi) {
                if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
                    --todo;
                    fp = ((ufunc_T *) ((hi) -> hi_key - (dumuf.uf_name - (char_u *) &dumuf)));
                    if (!isdigit(*fp->uf_name)) list_func_head (fp, 0);
                }
            }
        }
        eap -> nextcmd = check_nextcmd (eap -> arg);
        return;
    }
    if (*eap->arg == '/') {
        p = skip_regexp (eap -> arg + 1, '/', 1, ((void *) 0));
        if (!eap->skip) {
            regmatch_T regmatch;
            c = *p;
            * p = '\000';
            regmatch.regprog = vim_regcomp (eap -> arg + 1, 1);
            * p = c;
            if (regmatch.regprog != ((void *) 0)) {
                regmatch.rm_ic = p_ic;
                todo = (int) func_hashtab.ht_used;
                for (hi = func_hashtab.ht_array; todo > 0 && !got_int; ++hi) {
                    if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
                        --todo;
                        fp = ((ufunc_T *) ((hi) -> hi_key - (dumuf.uf_name - (char_u *) &dumuf)));
                        if (!isdigit(*fp->uf_name) && vim_regexec (&regmatch, fp -> uf_name, 0)) list_func_head (fp, 0);
                    }
                }
                vim_free (regmatch.regprog);
            }
        }
        if (*p == '/') ++p;
        eap -> nextcmd = check_nextcmd (p);
        return;
    }
    p = eap -> arg;
    name = trans_function_name (&p, eap -> skip, 0, &fudi);
    paren = (vim_strchr (p, '(') != ((void *) 0));
    if (name == ((void *) 0) && (fudi.fd_dict == ((void *) 0) || !paren) && !eap->skip) {
        if (!aborting()) {
            if (!eap->skip && fudi.fd_newkey != ((void *) 0)) emsg2 ((char_u *) (((char *) (e_dictkey))), (char_u *) (fudi.
              fd_newkey));
            vim_free (fudi.fd_newkey);
            return;
        }
        else eap -> skip = 1;
    }
    saved_did_emsg = did_emsg;
    did_emsg = 0;
    if (!paren) {
        if (!ends_excmd(*skipwhite(p))) {
            emsg ((char_u *) (((char *) (e_trailing))));
            goto ret_free;
        }
        eap -> nextcmd = check_nextcmd (p);
        if (eap -> nextcmd != ((void *) 0)) *p = '\000';
        if (!eap->skip && !got_int) {
            fp = find_func (name);
            if (fp != ((void *) 0)) {
                list_func_head (fp, 1);
                for (j = 0; j < fp -> uf_lines.ga_len && !got_int; ++j) {
                    if (((char_u * *) (fp -> uf_lines.ga_data)) [j] == ((void *) 0)) continue;
                    msg_putchar ('\n');
                    msg_outnum ((long) (j + 1));
                    if (j < 9) msg_putchar (' ');
                    if (j < 99) msg_putchar (' ');
                    msg_prt_line (((char_u * *) (fp -> uf_lines.ga_data)) [j], 0);
                    out_flush ();
                    ui_breakcheck ();
                }
                if (!got_int) {
                    msg_putchar ('\n');
                    msg_puts ((char_u *) "   endfunction");
                }
            }
            else emsg_funcname ("E123: Undefined function: %s", name);
        }
        goto ret_free;
    }
    p = skipwhite (p);
    if (*p != '(') {
        if (!eap->skip) {
            emsg2 ((char_u *) (((char *) ("E124: Missing '(': %s"))), (char_u *) (eap -> arg));
            goto ret_free;
        }
        if (vim_strchr (p, '(') != ((void *) 0)) p = vim_strchr (p, '(');
    }
    p = skipwhite (p + 1);
    ga_init2 (&newargs, (int) sizeof (char_u *), 3);
    ga_init2 (&newlines, (int) sizeof (char_u *), 3);
    if (!eap->skip) {
        if (name != ((void *) 0)) arg = name;
        else arg = fudi.fd_newkey;
        if (arg != ((void *) 0) && (fudi.fd_di == ((void *) 0) || fudi.fd_di -> di_tv.v_type != 3)) {
            if (*arg == (0x80)) j = 3;
            else j = 0;
            while (arg [j] != '\000' && (j == 0 ? eval_isnamec1 (arg [j]) : eval_isnamec (arg [j]))) ++j;
            if (arg [j] != '\000') emsg_funcname ((char *) e_invarg2, arg);
        }
    }
    while (*p != ')') {
        if (p [0] == '.' && p [1] == '.' && p [2] == '.') {
            varargs = 1;
            p += 3;
            mustend = 1;
        }
        else {
            arg = p;
            while (((*p) < 0x7f && isalnum (*p)) || *p == '_') ++p;
            if (arg == p || isdigit (*arg) || (p - arg == 9 && strncmp ((char *) (arg), (char *) ("firstline"), (size_t) (9)) ==
              0) || (p - arg == 8 && strncmp ((char *) (arg), (char *) ("lastline"), (size_t) (8)) == 0)) {
                if (!eap->skip) emsg2 ((char_u *) (((char *) ("E125: Illegal argument: %s"))), (char_u *) (arg));
                break;
            }
            if (ga_grow (&newargs, 1) == 0) goto erret;
            c = *p;
            * p = '\000';
            arg = vim_strsave (arg);
            if (arg == ((void *) 0)) goto erret;
            ((char_u * *) (newargs.ga_data)) [newargs.ga_len] = arg;
            * p = c;
            newargs.ga_len ++;
            if (*p == ',') ++p;
            else mustend = 1;
        }
        p = skipwhite (p);
        if (mustend && *p != ')') {
            if (!eap->skip) emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (eap -> arg));
            break;
        }
    }
    ++p;
    for (;;) {
        p = skipwhite (p);
        if (strncmp ((char *) (p), (char *) ("range"), (size_t) (5)) == 0) {
            flags |= 2;
            p += 5;
        }
        else if (strncmp ((char *) (p), (char *) ("dict"), (size_t) (4)) == 0) {
            flags |= 4;
            p += 4;
        }
        else if (strncmp ((char *) (p), (char *) ("abort"), (size_t) (5)) == 0) {
            flags |= 1;
            p += 5;
        }
        else break;
    }
    if (*p == '\n') line_arg = p + 1;
    else if (*p != '\000' && *p != '"' && !eap->skip && !did_emsg) emsg ((char_u *) (((char *) (e_trailing))));
    if (KeyTyped) {
        if (!eap->skip && !eap->forceit) {
            if (fudi.fd_dict != ((void *) 0) && fudi.fd_newkey == ((void *) 0)) emsg ((char_u *) (((char *) (e_funcdict))));
            else if (name != ((void *) 0) && find_func (name) != ((void *) 0)) emsg_funcname (e_funcexts, name);
        }
        if (!eap->skip && did_emsg) goto erret;
        msg_putchar ('\n');
        cmdline_row = msg_row;
    }
    indent = 2;
    nesting = 0;
    for (;;) {
        msg_scroll = 1;
        need_wait_return = 0;
        sourcing_lnum_off = sourcing_lnum;
        if (line_arg != ((void *) 0)) {
            theline = line_arg;
            p = vim_strchr (theline, '\n');
            if (p == ((void *) 0)) line_arg += strlen ((char *) (line_arg));
            else {
                * p = '\000';
                line_arg = p + 1;
            }
        }
        else if (eap -> getline == ((void *) 0)) theline = getcmdline (':', 0L, indent);
        else theline = eap -> getline (':', eap -> cookie, indent);
        if (KeyTyped) lines_left = Rows - 1;
        if (theline == ((void *) 0)) {
            emsg ((char_u *) (((char *) ("E126: Missing :endfunction"))));
            goto erret;
        }
        if (sourcing_lnum > sourcing_lnum_off + 1) sourcing_lnum_off = sourcing_lnum - sourcing_lnum_off - 1;
        else sourcing_lnum_off = 0;
        if (skip_until != ((void *) 0)) {
            if (strcmp ((char *) (theline), (char *) (skip_until)) == 0) {
                vim_free (skip_until);
                skip_until = ((void *) 0);
            }
        }
        else {
            for (p = theline; ((*p) == ' ' || (*p) == '\t') || *p == ':'; ++p);
            if (checkforcmd (&p, "endfunction", 4) && nesting -- == 0) {
                if (line_arg == ((void *) 0)) vim_free (theline);
                break;
            }
            if (indent > 2 && strncmp ((char *) (p), (char *) ("end"), (size_t) (3)) == 0) indent -= 2;
            else if (strncmp ((char *) (p), (char *) ("if"), (size_t) (2)) == 0 || strncmp ((char *) (p), (char *) ("wh"), (
              size_t) (2)) == 0 || strncmp ((char *) (p), (char *) ("for"), (size_t) (3)) == 0 || strncmp ((char *) (p), (char *
              ) ("try"), (size_t) (3)) == 0) indent += 2;
            if (checkforcmd (&p, "function", 2)) {
                if (*p == '!') p = skipwhite (p + 1);
                p += eval_fname_script (p);
                if (((*p) < 0x7f && isalpha (*p))) {
                    vim_free (trans_function_name (&p, 1, 0, ((void *) 0)));
                    if (*skipwhite(p) == '(') {
                        ++nesting;
                        indent += 2;
                    }
                }
            }
            p = skip_range (p, ((void *) 0));
            if ((p [0] == 'a' && (!((p[1])<0x7f&&isalpha(p[1])) || p [1] == 'p')) || (p [0] == 'i' && 
              (!((p[1])<0x7f&&isalpha(p[1])) || (p [1] == 'n' && (!((p[2])<0x7f&&isalpha(p[2])) || (p [2] == 's'))))))
              skip_until = vim_strsave ((char_u *) ".");
            arg = skipwhite (skiptowhite (p));
            if (arg [0] == '<' && arg [1] == '<' && ((p [0] == 'p' && p [1] == 'y' && (!((p[2])<0x7f&&isalpha(p[2])) || p [2] ==
              't')) || (p [0] == 'p' && p [1] == 'e' && (!((p[2])<0x7f&&isalpha(p[2])) || p [2] == 'r')) || (p [0] == 't' && p [
              1] == 'c' && (!((p[2])<0x7f&&isalpha(p[2])) || p [2] == 'l')) || (p [0] == 'r' && p [1] == 'u' && p [2] == 'b' &&
              (!((p[3])<0x7f&&isalpha(p[3])) || p [3] == 'y')) || (p [0] == 'm' && p [1] == 'z' && 
              (!((p[2])<0x7f&&isalpha(p[2])) || p [2] == 's')))) {
                p = skipwhite (arg + 2);
                if (*p == '\000') skip_until = vim_strsave ((char_u *) ".");
                else skip_until = vim_strsave (p);
            }
        }
        if (ga_grow (&newlines, 1 + sourcing_lnum_off) == 0) {
            if (line_arg == ((void *) 0)) vim_free (theline);
            goto erret;
        }
        p = vim_strsave (theline);
        if (p != ((void *) 0)) {
            if (line_arg == ((void *) 0)) vim_free (theline);
            theline = p;
        }
        ((char_u * *) (newlines.ga_data)) [newlines.ga_len ++] = theline;
        while (sourcing_lnum_off -- > 0) ((char_u * *) (newlines.ga_data)) [newlines.ga_len ++] = ((void *) 0);
        if (line_arg != ((void *) 0) && *line_arg == '\000') line_arg = ((void *) 0);
    }
    if (eap -> skip || did_emsg) goto erret;
    if (fudi.fd_dict == ((void *) 0)) {
        v = find_var (name, &ht);
        if (v != ((void *) 0) && v -> di_tv.v_type == 3) {
            emsg_funcname ("E707: Function name conflicts with variable: %s", name);
            goto erret;
        }
        fp = find_func (name);
        if (fp != ((void *) 0)) {
            if (!eap->forceit) {
                emsg_funcname (e_funcexts, name);
                goto erret;
            }
            if (fp -> uf_calls > 0) {
                emsg_funcname ("E127: Cannot redefine function %s: It is in use", name);
                goto erret;
            }
            ga_clear_strings (&(fp->uf_args));
            ga_clear_strings (&(fp->uf_lines));
            vim_free (name);
            name = ((void *) 0);
        }
    }
    else {
        char numbuf [20];
        fp = ((void *) 0);
        if (fudi.fd_newkey == ((void *) 0) && !eap->forceit) {
            emsg ((char_u *) (((char *) (e_funcdict))));
            goto erret;
        }
        if (fudi.fd_di == ((void *) 0)) {
            if (tv_check_lock (fudi.fd_dict -> dv_lock, eap -> arg)) goto erret;
        }
        else if (tv_check_lock (fudi.fd_di -> di_tv.v_lock, eap -> arg)) goto erret;
        vim_free (name);
        __builtin___sprintf_chk (numbuf, 0, __builtin_object_size (numbuf, 1 > 1), "%d", ++func_nr);
        name = vim_strsave ((char_u *) numbuf);
        if (name == ((void *) 0)) goto erret;
    }
    if (fp == ((void *) 0)) {
        if (fudi.fd_dict == ((void *) 0) && vim_strchr (name, '#') != ((void *) 0)) {
            int slen, plen;
            char_u * scriptname;
            j = 0;
            if (sourcing_name != ((void *) 0)) {
                scriptname = autoload_name (name);
                if (scriptname != ((void *) 0)) {
                    p = vim_strchr (scriptname, '/');
                    plen = (int) strlen ((char *) (p));
                    slen = (int) strlen ((char *) (sourcing_name));
                    if (slen > plen && strcasecmp ((char *) (((p))), (char *) (((sourcing_name + slen - plen)))) == 0) j = 1;
                    vim_free (scriptname);
                }
            }
            if (j == 0) {
                emsg2 ((char_u *) (((char *) ("E746: Function name does not match script file name: %s"))), (char_u *) (name));
                goto erret;
            }
        }
        fp = (ufunc_T *) alloc ((unsigned) (sizeof (ufunc_T) + strlen ((char *) (name))));
        if (fp == ((void *) 0)) goto erret;
        if (fudi.fd_dict != ((void *) 0)) {
            if (fudi.fd_di == ((void *) 0)) {
                fudi.fd_di = dictitem_alloc (fudi.fd_newkey);
                if (fudi.fd_di == ((void *) 0)) {
                    vim_free (fp);
                    goto erret;
                }
                if (dict_add (fudi.fd_dict, fudi.fd_di) == 0) {
                    vim_free (fudi.fd_di);
                    vim_free (fp);
                    goto erret;
                }
            }
            else clear_tv (&fudi.fd_di->di_tv);
            fudi.fd_di -> di_tv.v_type = 3;
            fudi.fd_di -> di_tv.v_lock = 0;
            fudi.fd_di -> di_tv.vval.v_string = vim_strsave (name);
            fp -> uf_refcount = 1;
            flags |= 4;
        }
        ((__builtin_object_size ((char *) (fp -> uf_name), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (fp -> uf_name
          ), (char *) (name), __builtin_object_size ((char *) (fp -> uf_name), 1 > 1)) : __inline_strcpy_chk ((char *) (fp ->
          uf_name), (char *) (name)));
        hash_add (&func_hashtab, ((fp) -> uf_name));
    }
    fp -> uf_args = newargs;
    fp -> uf_lines = newlines;
    fp -> uf_varargs = varargs;
    fp -> uf_flags = flags;
    fp -> uf_calls = 0;
    fp -> uf_script_ID = current_SID;
    goto ret_free;
    erret : ga_clear_strings (&newargs);
    ga_clear_strings (&newlines);
    ret_free : vim_free (skip_until);
    vim_free (fudi.fd_newkey);
    vim_free (name);
    did_emsg |= saved_did_emsg;
}

static char_u * trans_function_name (pp, skip, flags, fdp)
    char_u * * pp;
    int skip;
    int flags;
    funcdict_T * fdp;
{
    char_u * name = ((void *) 0);
    char_u * start;
    char_u * end;
    int lead;
    char_u sid_buf [20];
    int len;
    lval_T lv;
    if (fdp != ((void *) 0)) ((__builtin_object_size ((fdp), 0) != (size_t) - 1) ? __builtin___memset_chk ((fdp), (0), (sizeof (
      funcdict_T)), __builtin_object_size ((fdp), 0)) : __inline_memset_chk ((fdp), (0), (sizeof (funcdict_T))));
    start = *pp;
    if ((*pp) [0] == (0x80) && (*pp) [1] == 253 && (*pp) [2] == (int) KE_SNR) {
        *pp += 3;
        len = get_id_len (pp) + 3;
        return vim_strnsave (start, len);
    }
    lead = eval_fname_script (start);
    if (lead > 2) start += lead;
    end = get_lval (start, ((void *) 0), &lv, 0, skip, flags & 2, lead > 2 ? 0 : 2);
    if (end == start) {
        if (!skip) emsg ((char_u *) (((char *) ("E129: Function name required"))));
        goto theend;
    }
    if (end == ((void *) 0) || (lv.ll_tv != ((void *) 0) && (lead > 2 || lv.ll_range))) {
        if (!aborting()) {
            if (end != ((void *) 0)) emsg2 ((char_u *) (((char *) (e_invarg2))), (char_u *) (start));
        }
        else *pp = find_name_end (start, ((void *) 0), ((void *) 0), 1);
        goto theend;
    }
    if (lv.ll_tv != ((void *) 0)) {
        if (fdp != ((void *) 0)) {
            fdp -> fd_dict = lv.ll_dict;
            fdp -> fd_newkey = lv.ll_newkey;
            lv.ll_newkey = ((void *) 0);
            fdp -> fd_di = lv.ll_di;
        }
        if (lv.ll_tv -> v_type == 3 && lv.ll_tv -> vval.v_string != ((void *) 0)) {
            name = vim_strsave (lv.ll_tv -> vval.v_string);
            * pp = end;
        }
        else {
            if (!skip && !(flags&2) && (fdp == ((void *) 0) || lv.ll_dict == ((void *) 0) || fdp -> fd_newkey == ((void *) 0)))
              emsg ((char_u *) (((char *) (e_funcref))));
            else *pp = end;
            name = ((void *) 0);
        }
        goto theend;
    }
    if (lv.ll_name == ((void *) 0)) {
        * pp = end;
        goto theend;
    }
    if (lv.ll_exp_name != ((void *) 0)) {
        len = (int) strlen ((char *) (lv.ll_exp_name));
        name = deref_func_name (lv.ll_exp_name, &len);
        if (name == lv.ll_exp_name) name = ((void *) 0);
    }
    else {
        len = (int) (end - *pp);
        name = deref_func_name (*pp, &len);
        if (name == *pp) name = ((void *) 0);
    }
    if (name != ((void *) 0)) {
        name = vim_strsave (name);
        * pp = end;
        goto theend;
    }
    if (lv.ll_exp_name != ((void *) 0)) {
        len = (int) strlen ((char *) (lv.ll_exp_name));
        if (lead <= 2 && lv.ll_name == lv.ll_exp_name && strncmp ((char *) (lv.ll_name), (char *) ("s:"), (size_t) (2)) == 0) {
            lv.ll_name += 2;
            len -= 2;
            lead = 2;
        }
    }
    else {
        if (lead == 2) lv.ll_name += 2;
        len = (int) (end - lv.ll_name);
    }
    if (skip) lead = 0;
    else if (lead > 0) {
        lead = 3;
        if ((lv.ll_exp_name != ((void *) 0) && eval_fname_sid (lv.ll_exp_name)) || eval_fname_sid (*pp)) {
            if (current_SID <= 0) {
                emsg ((char_u *) (((char *) (e_usingsid))));
                goto theend;
            }
            __builtin___sprintf_chk ((char *) sid_buf, 0, __builtin_object_size ((char *) sid_buf, 1 > 1), "%ld_", (long)
              current_SID);
            lead += (int) strlen ((char *) (sid_buf));
        }
    }
    else if (!(flags&1) && builtin_function (lv.ll_name)) {
        emsg2 ((char_u *) (((char *) ("E128: Function name must start with a capital or contain a colon: %s"))), (char_u *) (lv
          .ll_name));
        goto theend;
    }
    name = alloc ((unsigned) (len + lead + 1));
    if (name != ((void *) 0)) {
        if (lead > 0) {
            name [0] = (0x80);
            name [1] = 253;
            name [2] = (int) KE_SNR;
            if (lead > 3) ((__builtin_object_size ((char *) (name + 3), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (
              name + 3), (char *) (sid_buf), __builtin_object_size ((char *) (name + 3), 1 > 1)) : __inline_strcpy_chk ((char *
              ) (name + 3), (char *) (sid_buf)));
        }
        ((__builtin_object_size ((char *) (name + lead), 0) != (size_t) - 1) ? __builtin___memmove_chk ((char *) (name + lead),
          (char *) (lv.ll_name), (size_t) len, __builtin_object_size ((char *) (name + lead), 0)) : __inline_memmove_chk ((char
          *) (name + lead), (char *) (lv.ll_name), (size_t) len));
        name [len + lead] = '\000';
    }
    * pp = end;
    theend : clear_lval (&lv);
    return name;
}

static int eval_fname_script (p)
    char_u * p;
{
    if (p [0] == '<' && (strncasecmp ((char *) (p + 1), (char *) ("SID>"), (size_t) (4)) == 0 || strncasecmp ((char *) (p + 1),
      (char *) ("SNR>"), (size_t) (4)) == 0)) return 5;
    if (p [0] == 's' && p [1] == ':') return 2;
    return 0;
}

static int eval_fname_sid (p)
    char_u * p;
{
    return (*p == 's' || (((p [2]) < 'a' || (p [2]) > 'z') ? (p [2]) : (p [2]) - ('a' - 'A')) == 'I');
}

static void list_func_head (fp, indent)
    ufunc_T * fp;
    int indent;
{
    int j;
    msg_start ();
    if (indent) msg_puts ((char_u *) ("   "));
    msg_puts ((char_u *) ("function "));
    if (fp -> uf_name [0] == (0x80)) {
        msg_puts_attr ((char_u *) ("<SNR>"), (highlight_attr [(int) (HLF_8)]));
        msg_puts (fp -> uf_name + 3);
    }
    else msg_puts (fp -> uf_name);
    msg_putchar ('(');
    for (j = 0; j < fp -> uf_args.ga_len; ++j) {
        if (j) msg_puts ((char_u *) (", "));
        msg_puts (((char_u * *) (fp -> uf_args.ga_data)) [j]);
    }
    if (fp -> uf_varargs) {
        if (j) msg_puts ((char_u *) (", "));
        msg_puts ((char_u *) ("..."));
    }
    msg_putchar (')');
    msg_clr_eos ();
    if (p_verbose > 0) last_set_msg (fp -> uf_script_ID);
}

static ufunc_T * find_func (name)
    char_u * name;
{
    hashitem_T * hi;
    hi = hash_find (&func_hashtab, name);
    if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) return ((ufunc_T *) ((hi) -> hi_key - (dumuf.uf_name - (
      char_u *) &dumuf)));
    return ((void *) 0);
}

static int function_exists (name)
    char_u * name;
{
    char_u * nm = name;
    char_u * p;
    int n = 0;
    p = trans_function_name (&nm, 0, 1 | 2, ((void *) 0));
    nm = skipwhite (nm);
    if (p != ((void *) 0) && (*nm == '\000' || *nm == '(')) {
        if (builtin_function (p)) n = (find_internal_func (p) >= 0);
        else n = (find_func (p) != ((void *) 0));
    }
    vim_free (p);
    return n;
}

static int builtin_function (name)
    char_u * name;
{
    return ((name [0]) < 0x7f && islower (name [0])) && vim_strchr (name, ':') == ((void *) 0) && vim_strchr (name, '#') == ((
      void *) 0);
}

static int script_autoload (name, reload)
    char_u * name;
    int reload;
{
    char_u * p;
    char_u * scriptname, * tofree;
    int ret = 0;
    int i;
    if (no_autoload) return 0;
    p = vim_strchr (name, '#');
    if (p == ((void *) 0) || p == name) return 0;
    tofree = scriptname = autoload_name (name);
    for (i = 0; i < ga_loaded.ga_len; ++i) if (strcmp ((char *) (((char_u * *) ga_loaded.ga_data) [i] + 9), (char *) (
      scriptname + 9)) == 0) break;
    if (!reload && i < ga_loaded.ga_len) ret = 0;
    else {
        if (i == ga_loaded.ga_len && ga_grow (&ga_loaded, 1) == 1) {
            ((char_u * *) ga_loaded.ga_data) [ga_loaded.ga_len ++] = scriptname;
            tofree = ((void *) 0);
        }
        if (source_runtime (scriptname, 0) == 1) ret = 1;
    }
    vim_free (tofree);
    return ret;
}

static char_u * autoload_name (name)
    char_u * name;
{
    char_u * p;
    char_u * scriptname;
    scriptname = alloc ((unsigned) (strlen ((char *) (name)) + 14));
    if (scriptname == ((void *) 0)) return 0;
    ((__builtin_object_size ((char *) (scriptname), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (scriptname), (char *
      ) ("autoload/"), __builtin_object_size ((char *) (scriptname), 1 > 1)) : __inline_strcpy_chk ((char *) (scriptname), (
      char *) ("autoload/")));
    ((__builtin_object_size ((char *) (scriptname), 0) != (size_t) - 1) ? __builtin___strcat_chk ((char *) (scriptname), (char *
      ) (name), __builtin_object_size ((char *) (scriptname), 1 > 1)) : __inline_strcat_chk ((char *) (scriptname), (char *) (
      name)));
    *vim_strrchr(scriptname,'#') = '\000';
    ((__builtin_object_size ((char *) (scriptname), 0) != (size_t) - 1) ? __builtin___strcat_chk ((char *) (scriptname), (char *
      ) (".vim"), __builtin_object_size ((char *) (scriptname), 1 > 1)) : __inline_strcat_chk ((char *) (scriptname), (char *) (
      ".vim")));
    while ((p = vim_strchr (scriptname, '#')) != ((void *) 0)) *p = '/';
    return scriptname;
}

char_u * get_user_func_name (xp, idx)
    expand_T * xp;
    int idx;
{
    static long_u done;
    static hashitem_T * hi;
    ufunc_T * fp;
    if (idx == 0) {
        done = 0;
        hi = func_hashtab.ht_array;
    }
    if (done < func_hashtab.ht_used) {
        if (done ++ > 0) ++hi;
        while (((hi) -> hi_key == ((void *) 0) || (hi) -> hi_key == &hash_removed)) ++hi;
        fp = ((ufunc_T *) ((hi) -> hi_key - (dumuf.uf_name - (char_u *) &dumuf)));
        if (strlen ((char *) (fp -> uf_name)) + 4 >= (1024 + 1)) return fp -> uf_name;
        cat_func_name (IObuff, fp);
        if (xp -> xp_context != 19) {
            ((__builtin_object_size ((char *) (IObuff), 0) != (size_t) - 1) ? __builtin___strcat_chk ((char *) (IObuff), (char *
              ) ("("), __builtin_object_size ((char *) (IObuff), 1 > 1)) : __inline_strcat_chk ((char *) (IObuff), (char *) (
              "(")));
            if (!fp->uf_varargs && fp -> uf_args.ga_len == 0) ((__builtin_object_size ((char *) (IObuff), 0) != (size_t) - 1) ?
              __builtin___strcat_chk ((char *) (IObuff), (char *) (")"), __builtin_object_size ((char *) (IObuff), 1 > 1)) :
              __inline_strcat_chk ((char *) (IObuff), (char *) (")")));
        }
        return IObuff;
    }
    return ((void *) 0);
}

static void cat_func_name (buf, fp)
    char_u * buf;
    ufunc_T * fp;
{
    if (fp -> uf_name [0] == (0x80)) {
        ((__builtin_object_size ((char *) (buf), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (buf), (char *) (
          "<SNR>"), __builtin_object_size ((char *) (buf), 1 > 1)) : __inline_strcpy_chk ((char *) (buf), (char *) ("<SNR>")));
        ((__builtin_object_size ((char *) (buf), 0) != (size_t) - 1) ? __builtin___strcat_chk ((char *) (buf), (char *) (fp ->
          uf_name + 3), __builtin_object_size ((char *) (buf), 1 > 1)) : __inline_strcat_chk ((char *) (buf), (char *) (fp ->
          uf_name + 3)));
    }
    else ((__builtin_object_size ((char *) (buf), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (buf), (char *) (fp ->
      uf_name), __builtin_object_size ((char *) (buf), 1 > 1)) : __inline_strcpy_chk ((char *) (buf), (char *) (fp -> uf_name))
      );
}

void ex_delfunction (eap)
    exarg_T * eap;
{
    ufunc_T * fp = ((void *) 0);
    char_u * p;
    char_u * name;
    funcdict_T fudi;
    p = eap -> arg;
    name = trans_function_name (&p, eap -> skip, 0, &fudi);
    vim_free (fudi.fd_newkey);
    if (name == ((void *) 0)) {
        if (fudi.fd_dict != ((void *) 0) && !eap->skip) emsg ((char_u *) (((char *) (e_funcref))));
        return;
    }
    if (!ends_excmd(*skipwhite(p))) {
        vim_free (name);
        emsg ((char_u *) (((char *) (e_trailing))));
        return;
    }
    eap -> nextcmd = check_nextcmd (p);
    if (eap -> nextcmd != ((void *) 0)) *p = '\000';
    if (!eap->skip) fp = find_func (name);
    vim_free (name);
    if (!eap->skip) {
        if (fp == ((void *) 0)) {
            emsg2 ((char_u *) (((char *) (e_nofunc))), (char_u *) (eap -> arg));
            return;
        }
        if (fp -> uf_calls > 0) {
            emsg2 ((char_u *) (((char *) ("E131: Cannot delete function %s: It is in use"))), (char_u *) (eap -> arg));
            return;
        }
        if (fudi.fd_dict != ((void *) 0)) {
            dictitem_remove (fudi.fd_dict, fudi.fd_di);
        }
        else func_free (fp);
    }
}

static void func_free (fp)
    ufunc_T * fp;
{
    hashitem_T * hi;
    ga_clear_strings (&(fp->uf_args));
    ga_clear_strings (&(fp->uf_lines));
    hi = hash_find (&func_hashtab, ((fp) -> uf_name));
    if (((hi) -> hi_key == ((void *) 0) || (hi) -> hi_key == &hash_removed)) emsg2 ((char_u *) (((char *) (e_intern2))), (
      char_u *) ("func_free()"));
    else hash_remove (&func_hashtab, hi);
    vim_free (fp);
}

static void func_unref (name)
    char_u * name;
{
    ufunc_T * fp;
    if (name != ((void *) 0) && isdigit (*name)) {
        fp = find_func (name);
        if (fp == ((void *) 0)) emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("func_unref()"));
        else if (--fp->uf_refcount <= 0) {
            if (fp -> uf_calls == 0) func_free (fp);
        }
    }
}

static void func_ref (name)
    char_u * name;
{
    ufunc_T * fp;
    if (name != ((void *) 0) && isdigit (*name)) {
        fp = find_func (name);
        if (fp == ((void *) 0)) emsg2 ((char_u *) (((char *) (e_intern2))), (char_u *) ("func_ref()"));
        else ++fp->uf_refcount;
    }
}

static void call_user_func (fp, argcount, argvars, rettv, firstline, lastline, selfdict)
    ufunc_T * fp;
    int argcount;
    typval_T * argvars;
    typval_T * rettv;
    linenr_T firstline;
    linenr_T lastline;
    dict_T * selfdict;
{
    char_u * save_sourcing_name;
    linenr_T save_sourcing_lnum;
    scid_T save_current_SID;
    funccall_T * fc;
    int save_did_emsg;
    static int depth = 0;
    dictitem_T * v;
    int fixvar_idx = 0;
    int i;
    int ai;
    char_u numbuf [30];
    char_u * name;
    if (depth >= p_mfd) {
        emsg ((char_u *) (((char *) ("E132: Function call depth is higher than 'maxfuncdepth'"))));
        rettv -> v_type = 1;
        rettv -> vval.v_number = -1;
        return;
    }
    ++depth;
    line_breakcheck ();
    fc = (funccall_T *) alloc (sizeof (funccall_T));
    fc -> caller = current_funccal;
    current_funccal = fc;
    fc -> func = fp;
    fc -> rettv = rettv;
    rettv -> vval.v_number = 0;
    fc -> linenr = 0;
    fc -> returned = 0;
    fc -> level = ex_nesting_level;
    fc -> breakpoint = dbg_find_breakpoint (0, fp -> uf_name, (linenr_T) 0);
    fc -> dbg_tick = debug_tick;
    init_var_dict (&fc->l_vars, &fc->l_vars_var);
    if (selfdict != ((void *) 0)) {
        v = &fc->fixvar[fixvar_idx++].var;
        name = v -> di_key;
        ((__builtin_object_size ((char *) (name), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (name), (char *) (
          "self"), __builtin_object_size ((char *) (name), 1 > 1)) : __inline_strcpy_chk ((char *) (name), (char *) ("self")));
        v -> di_flags = 1 + 4;
        hash_add (&fc->l_vars.dv_hashtab, ((v) -> di_key));
        v -> di_tv.v_type = 5;
        v -> di_tv.v_lock = 0;
        v -> di_tv.vval.v_dict = selfdict;
        ++selfdict->dv_refcount;
    }
    init_var_dict (&fc->l_avars, &fc->l_avars_var);
    add_nr_var (&fc->l_avars, &fc->fixvar[fixvar_idx++].var, "0", (varnumber_T) (argcount - fp -> uf_args.ga_len));
    v = &fc->fixvar[fixvar_idx++].var;
    name = v -> di_key;
    ((__builtin_object_size ((char *) (name), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (name), (char *) ("000"),
      __builtin_object_size ((char *) (name), 1 > 1)) : __inline_strcpy_chk ((char *) (name), (char *) ("000")));
    v -> di_flags = 1 | 4;
    hash_add (&fc->l_avars.dv_hashtab, ((v) -> di_key));
    v -> di_tv.v_type = 4;
    v -> di_tv.v_lock = 2;
    v -> di_tv.vval.v_list = &fc->l_varlist;
    ((__builtin_object_size ((&fc->l_varlist), 0) != (size_t) - 1) ? __builtin___memset_chk ((&fc->l_varlist), (0), (sizeof (
      list_T)), __builtin_object_size ((&fc->l_varlist), 0)) : __inline_memset_chk ((&fc->l_varlist), (0), (sizeof (list_T))));
    fc -> l_varlist.lv_refcount = 99999;
    fc -> l_varlist.lv_lock = 2;
    add_nr_var (&fc->l_avars, &fc->fixvar[fixvar_idx++].var, "firstline", (varnumber_T) firstline);
    add_nr_var (&fc->l_avars, &fc->fixvar[fixvar_idx++].var, "lastline", (varnumber_T) lastline);
    for (i = 0; i < argcount; ++i) {
        ai = i - fp -> uf_args.ga_len;
        if (ai < 0) name = ((char_u * *) (fp -> uf_args.ga_data)) [i];
        else {
            __builtin___sprintf_chk ((char *) numbuf, 0, __builtin_object_size ((char *) numbuf, 1 > 1), "%d", ai + 1);
            name = numbuf;
        }
        if (fixvar_idx < 12 && strlen ((char *) (name)) <= 20) {
            v = &fc->fixvar[fixvar_idx++].var;
            v -> di_flags = 1 | 4;
        }
        else {
            v = (dictitem_T *) alloc ((unsigned) (sizeof (dictitem_T) + strlen ((char *) (name))));
            if (v == ((void *) 0)) break;
            v -> di_flags = 1;
        }
        ((__builtin_object_size ((char *) (v -> di_key), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (v -> di_key), (
          char *) (name), __builtin_object_size ((char *) (v -> di_key), 1 > 1)) : __inline_strcpy_chk ((char *) (v -> di_key),
          (char *) (name)));
        hash_add (&fc->l_avars.dv_hashtab, ((v) -> di_key));
        v -> di_tv = argvars [i];
        v -> di_tv.v_lock = 2;
        if (ai >= 0 && ai < 20) {
            list_append (&fc->l_varlist, &fc->l_listitems[ai]);
            fc -> l_listitems [ai].li_tv = argvars [i];
            fc -> l_listitems [ai].li_tv.v_lock = 2;
        }
    }
    ++RedrawingDisabled;
    save_sourcing_name = sourcing_name;
    save_sourcing_lnum = sourcing_lnum;
    sourcing_lnum = 1;
    sourcing_name = alloc ((unsigned) ((save_sourcing_name == ((void *) 0) ? 0 : strlen ((char *) (save_sourcing_name))) +
      strlen ((char *) (fp -> uf_name)) + 13));
    if (sourcing_name != ((void *) 0)) {
        if (save_sourcing_name != ((void *) 0) && strncmp ((char *) (save_sourcing_name), (char *) ("function "), (size_t) (9))
          == 0) __builtin___sprintf_chk ((char *) sourcing_name, 0, __builtin_object_size ((char *) sourcing_name, 1 > 1),
          "%s..", save_sourcing_name);
        else ((__builtin_object_size ((char *) (sourcing_name), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (
          sourcing_name), (char *) ("function "), __builtin_object_size ((char *) (sourcing_name), 1 > 1)) : __inline_strcpy_chk
          ((char *) (sourcing_name), (char *) ("function ")));
        cat_func_name (sourcing_name + strlen ((char *) (sourcing_name)), fp);
        if (p_verbose >= 12) {
            ++no_wait_return;
            verbose_enter_scroll ();
            smsg ((char_u *) ((char *) ("calling %s")), sourcing_name);
            if (p_verbose >= 14) {
                char_u buf [80];
                char_u numbuf2 [30];
                char_u * tofree;
                char_u * s;
                msg_puts ((char_u *) "(");
                for (i = 0; i < argcount; ++i) {
                    if (i > 0) msg_puts ((char_u *) ", ");
                    if (argvars [i].v_type == 1) msg_outnum ((long) argvars [i].vval.v_number);
                    else {
                        s = tv2string (&argvars[i], &tofree, numbuf2, 0);
                        if (s != ((void *) 0)) {
                            trunc_string (s, buf, 80);
                            msg_puts (buf);
                            vim_free (tofree);
                        }
                    }
                }
                msg_puts ((char_u *) ")");
            }
            msg_puts ((char_u *) "\n");
            verbose_leave_scroll ();
            --no_wait_return;
        }
    }
    save_current_SID = current_SID;
    current_SID = fp -> uf_script_ID;
    save_did_emsg = did_emsg;
    did_emsg = 0;
    do_cmdline (((void *) 0), get_func_line, (void *) fc, 0x02 | 0x01 | 0x04);
    --RedrawingDisabled;
    if ((did_emsg && (fp -> uf_flags & 1)) || rettv -> v_type == 0) {
        clear_tv (rettv);
        rettv -> v_type = 1;
        rettv -> vval.v_number = -1;
    }
    if (p_verbose >= 12) {
        ++no_wait_return;
        verbose_enter_scroll ();
        if (aborting ()) smsg ((char_u *) ((char *) ("%s aborted")), sourcing_name);
        else if (fc -> rettv -> v_type == 1) smsg ((char_u *) ((char *) ("%s returning #%ld")), sourcing_name, (long) fc ->
          rettv -> vval.v_number);
        else {
            char_u buf [80];
            char_u numbuf2 [30];
            char_u * tofree;
            char_u * s;
            s = tv2string (fc -> rettv, &tofree, numbuf2, 0);
            if (s != ((void *) 0)) {
                trunc_string (s, buf, 80);
                smsg ((char_u *) ((char *) ("%s returning %s")), sourcing_name, buf);
                vim_free (tofree);
            }
        }
        msg_puts ((char_u *) "\n");
        verbose_leave_scroll ();
        --no_wait_return;
    }
    vim_free (sourcing_name);
    sourcing_name = save_sourcing_name;
    sourcing_lnum = save_sourcing_lnum;
    current_SID = save_current_SID;
    if (p_verbose >= 12 && sourcing_name != ((void *) 0)) {
        ++no_wait_return;
        verbose_enter_scroll ();
        smsg ((char_u *) ((char *) ("continuing in %s")), sourcing_name);
        msg_puts ((char_u *) "\n");
        verbose_leave_scroll ();
        --no_wait_return;
    }
    did_emsg |= save_did_emsg;
    current_funccal = fc -> caller;
    --depth;
    if (fc -> l_varlist.lv_refcount == 99999 && fc -> l_vars.dv_refcount == 99999 && fc -> l_avars.dv_refcount == 99999) {
        free_funccal (fc, 0);
    }
    else {
        hashitem_T * hi;
        listitem_T * li;
        int todo;
        fc -> caller = previous_funccal;
        previous_funccal = fc;
        todo = (int) fc -> l_avars.dv_hashtab.ht_used;
        for (hi = fc -> l_avars.dv_hashtab.ht_array; todo > 0; ++hi) {
            if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
                --todo;
                v = ((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi)));
                copy_tv (&v->di_tv, &v->di_tv);
            }
        }
        for (li = fc -> l_varlist.lv_first; li != ((void *) 0); li = li -> li_next) copy_tv (&li->li_tv, &li->li_tv);
    }
}

static int can_free_funccal (fc, copyID)
    funccall_T * fc;
    int copyID;
{
    return (fc -> l_varlist.lv_copyID != copyID && fc -> l_vars.dv_copyID != copyID && fc -> l_avars.dv_copyID != copyID);
}

static void free_funccal (fc, free_val)
    funccall_T * fc;
    int free_val;
{
    listitem_T * li;
    vars_clear_ext (&fc->l_avars.dv_hashtab, free_val);
    vars_clear (&fc->l_vars.dv_hashtab);
    if (free_val) for (li = fc -> l_varlist.lv_first; li != ((void *) 0); li = li -> li_next) clear_tv (&li->li_tv);
    vim_free (fc);
}

static void add_nr_var (dp, v, name, nr)
    dict_T * dp;
    dictitem_T * v;
    char * name;
    varnumber_T nr;
{
    ((__builtin_object_size ((char *) (v -> di_key), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (v -> di_key), (
      char *) (name), __builtin_object_size ((char *) (v -> di_key), 1 > 1)) : __inline_strcpy_chk ((char *) (v -> di_key), (
      char *) (name)));
    v -> di_flags = 1 | 4;
    hash_add (&dp->dv_hashtab, ((v) -> di_key));
    v -> di_tv.v_type = 1;
    v -> di_tv.v_lock = 2;
    v -> di_tv.vval.v_number = nr;
}

void ex_return (eap)
    exarg_T * eap;
{
    char_u * arg = eap -> arg;
    typval_T rettv;
    int returning = 0;
    if (current_funccal == ((void *) 0)) {
        emsg ((char_u *) (((char *) ("E133: :return not inside a function"))));
        return;
    }
    if (eap -> skip) ++emsg_skip;
    eap -> nextcmd = ((void *) 0);
    if ((*arg != '\000' && *arg != '|' && *arg != '\n') && eval0 (arg, &rettv, &eap->nextcmd, !eap->skip) != 0) {
        if (!eap->skip) returning = do_return (eap, 0, 1, &rettv);
        else clear_tv (&rettv);
    }
    else if (!eap->skip) {
        if (!aborting()) returning = do_return (eap, 0, 1, ((void *) 0));
    }
    if (returning) eap -> nextcmd = ((void *) 0);
    else if (eap -> nextcmd == ((void *) 0)) eap -> nextcmd = check_nextcmd (arg);
    if (eap -> skip) --emsg_skip;
}

int do_return (eap, reanimate, is_cmd, rettv)
    exarg_T * eap;
    int reanimate;
    int is_cmd;
    void * rettv;
{
    int idx;
    struct condstack * cstack = eap -> cstack;
    if (reanimate) current_funccal -> returned = 0;
    idx = cleanup_conditionals (eap -> cstack, 0, 1);
    if (idx >= 0) {
        cstack -> cs_pending [idx] = 24;
        if (!is_cmd && !reanimate) cstack -> cs_pend.csp_rv [idx] = rettv;
        else {
            if (reanimate) rettv = current_funccal -> rettv;
            if (rettv != ((void *) 0)) {
                if ((cstack -> cs_pend.csp_rv [idx] = alloc_tv ()) != ((void *) 0)) *(typval_T*)cstack->cs_pend.csp_rv[idx] = 
                  *(typval_T*)rettv;
                else emsg ((char_u *) (((char *) (e_outofmem))));
            }
            else cstack -> cs_pend.csp_rv [idx] = ((void *) 0);
            if (reanimate) {
                current_funccal -> rettv -> v_type = 1;
                current_funccal -> rettv -> vval.v_number = 0;
            }
        }
        report_make_pending (24, rettv);
    }
    else {
        current_funccal -> returned = 1;
        if (!reanimate && rettv != ((void *) 0)) {
            clear_tv (current_funccal -> rettv);
            *current_funccal->rettv = *(typval_T*)rettv;
            if (!is_cmd) vim_free (rettv);
        }
    }
    return idx < 0;
}

void discard_pending_return (rettv)
    void * rettv;
{
    free_tv ((typval_T *) rettv);
}

char_u * get_return_cmd (rettv)
    void * rettv;
{
    char_u * s = ((void *) 0);
    char_u * tofree = ((void *) 0);
    char_u numbuf [30];
    if (rettv != ((void *) 0)) s = echo_string ((typval_T *) rettv, &tofree, numbuf, 0);
    if (s == ((void *) 0)) s = (char_u *) "";
    ((__builtin_object_size ((char *) (IObuff), 0) != (size_t) - 1) ? __builtin___strcpy_chk ((char *) (IObuff), (char *) (
      ":return "), __builtin_object_size ((char *) (IObuff), 1 > 1)) : __inline_strcpy_chk ((char *) (IObuff), (char *) (
      ":return ")));
    ((__builtin_object_size ((char *) (IObuff + 8), 0) != (size_t) - 1) ? __builtin___strncpy_chk ((char *) (IObuff + 8), (char
      *) (s), (size_t) ((1024 + 1) - 8), __builtin_object_size ((char *) (IObuff + 8), 1 > 1)) : __inline_strncpy_chk ((char *)
      (IObuff + 8), (char *) (s), (size_t) ((1024 + 1) - 8)));
    if (strlen ((char *) (s)) + 8 >= (1024 + 1)) ((__builtin_object_size ((char *) (IObuff + (1024 + 1) - 4), 0) != (size_t) - 1
      ) ? __builtin___strcpy_chk ((char *) (IObuff + (1024 + 1) - 4), (char *) ("..."), __builtin_object_size ((char *) (IObuff
      + (1024 + 1) - 4), 1 > 1)) : __inline_strcpy_chk ((char *) (IObuff + (1024 + 1) - 4), (char *) ("...")));
    vim_free (tofree);
    return vim_strsave (IObuff);
}

char_u * get_func_line (c, cookie, indent)
    int c __attribute__ ((unused));
    void * cookie;
    int indent __attribute__ ((unused));
{
    funccall_T * fcp = (funccall_T *) cookie;
    ufunc_T * fp = fcp -> func;
    char_u * retval;
    garray_T * gap;
    if (fcp -> dbg_tick != debug_tick) {
        fcp -> breakpoint = dbg_find_breakpoint (0, fp -> uf_name, sourcing_lnum);
        fcp -> dbg_tick = debug_tick;
    }
    gap = &fp->uf_lines;
    if (((fp -> uf_flags & 1) && did_emsg && !aborted_in_try()) || fcp -> returned) retval = ((void *) 0);
    else {
        while (fcp -> linenr < gap -> ga_len && ((char_u * *) (gap -> ga_data)) [fcp -> linenr] == ((void *) 0)) ++fcp->linenr;
        if (fcp -> linenr >= gap -> ga_len) retval = ((void *) 0);
        else {
            retval = vim_strsave (((char_u * *) (gap -> ga_data)) [fcp -> linenr ++]);
            sourcing_lnum = fcp -> linenr;
        }
    }
    if (fcp -> breakpoint != 0 && fcp -> breakpoint <= sourcing_lnum) {
        dbg_breakpoint (fp -> uf_name, sourcing_lnum);
        fcp -> breakpoint = dbg_find_breakpoint (0, fp -> uf_name, sourcing_lnum);
        fcp -> dbg_tick = debug_tick;
    }
    return retval;
}

int func_has_ended (cookie)
    void * cookie;
{
    funccall_T * fcp = (funccall_T *) cookie;
    return (((fcp -> func -> uf_flags & 1) && did_emsg && !aborted_in_try()) || fcp -> returned);
}

int func_has_abort (cookie)
    void * cookie;
{
    return ((funccall_T *) cookie) -> func -> uf_flags & 1;
}

typedef enum {VAR_FLAVOUR_DEFAULT, VAR_FLAVOUR_SESSION, VAR_FLAVOUR_VIMINFO} var_flavour_T;
static var_flavour_T var_flavour (char_u * varname);

static var_flavour_T var_flavour (varname)
    char_u * varname;
{
    char_u * p = varname;
    if (((*p) < 0x7f && isupper (*p))) {
        while (*(++p)) if (((*p) < 0x7f && islower (*p))) return VAR_FLAVOUR_SESSION;
        return VAR_FLAVOUR_VIMINFO;
    }
    else return VAR_FLAVOUR_DEFAULT;
}

int read_viminfo_varlist (virp, writing)
    vir_T * virp;
    int writing;
{
    char_u * tab;
    int type = 1;
    typval_T tv;
    if (!writing && (find_viminfo_parameter ('!') != ((void *) 0))) {
        tab = vim_strchr (virp -> vir_line + 1, '\t');
        if (tab != ((void *) 0)) {
            *tab++ = '\0';
            if (*tab == 'S') type = 2;
            else if (*tab == 'F') type = 6;
            tab = vim_strchr (tab, '\t');
            if (tab != ((void *) 0)) {
                tv.v_type = type;
                if (type == 2) tv.vval.v_string = viminfo_readstring (virp, (int) (tab - virp -> vir_line + 1), 1);
                else if (type == 6) (void) string2float (tab + 1, &tv.vval.v_float);
                else tv.vval.v_number = atol ((char *) tab + 1);
                set_var (virp -> vir_line + 1, &tv, 0);
                if (type == 2) vim_free (tv.vval.v_string);
            }
        }
    }
    return viminfo_readline (virp);
}

void write_viminfo_varlist (fp)
    FILE * fp;
{
    hashitem_T * hi;
    dictitem_T * this_var;
    int todo;
    char * s;
    char_u * p;
    char_u * tofree;
    char_u numbuf [30];
    if (find_viminfo_parameter ('!') == ((void *) 0)) return;
    fputs (((char *) ("\n# global variables:\n")), fp);
    todo = (int) globvardict.dv_hashtab.ht_used;
    for (hi = globvardict.dv_hashtab.ht_array; todo > 0; ++hi) {
        if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
            --todo;
            this_var = ((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi)));
            if (var_flavour (this_var -> di_key) == VAR_FLAVOUR_VIMINFO) {
                switch (this_var -> di_tv.v_type) {
                case 2 :
                    s = "STR";
                    break;
                case 1 :
                    s = "NUM";
                    break;
                case 6 :
                    s = "FLO";
                    break;
                default :
                    continue;
                }
                fprintf (fp, "!%s\t%s\t", this_var -> di_key, s);
                p = echo_string (&this_var->di_tv, &tofree, numbuf, 0);
                if (p != ((void *) 0)) viminfo_writestring (fp, p);
                vim_free (tofree);
            }
        }
    }
}

int store_session_globals (fd)
    FILE * fd;
{
    hashitem_T * hi;
    dictitem_T * this_var;
    int todo;
    char_u * p, * t;
    todo = (int) globvardict.dv_hashtab.ht_used;
    for (hi = globvardict.dv_hashtab.ht_array; todo > 0; ++hi) {
        if (!((hi)->hi_key==((void*)0)||(hi)->hi_key==&hash_removed)) {
            --todo;
            this_var = ((dictitem_T *) ((hi) -> hi_key - (dumdi.di_key - (char_u *) &dumdi)));
            if ((this_var -> di_tv.v_type == 1 || this_var -> di_tv.v_type == 2) && var_flavour (this_var -> di_key) ==
              VAR_FLAVOUR_SESSION) {
                p = vim_strsave_escaped (get_tv_string (&this_var->di_tv), (char_u *) "\\\"\n\r");
                if (p == ((void *) 0)) break;
                for (t = p; *t != '\000'; ++t) if (*t == '\n') *t = 'n';
                else if (*t == '\r') *t = 'r';
                if ((fprintf (fd, "let %s = %c%s%c", this_var -> di_key, (this_var -> di_tv.v_type == 2) ? '"' : ' ', p, (
                  this_var -> di_tv.v_type == 2) ? '"' : ' ') < 0) || put_eol (fd) == 0) {
                    vim_free (p);
                    return 0;
                }
                vim_free (p);
            }
            else if (this_var -> di_tv.v_type == 6 && var_flavour (this_var -> di_key) == VAR_FLAVOUR_SESSION) {
                float_T f = this_var -> di_tv.vval.v_float;
                int sign = ' ';
                if (f < 0) {
                    f = -f;
                    sign = '-';
                }
                if ((fprintf (fd, "let %s = %c&%f", this_var -> di_key, sign, f) < 0) || put_eol (fd) == 0) return 0;
            }
        }
    }
    return 1;
}

void last_set_msg (scriptID)
    scid_T scriptID;
{
    char_u * p;
    if (scriptID != 0) {
        p = home_replace_save (((void *) 0), get_scriptname (scriptID));
        if (p != ((void *) 0)) {
            verbose_enter ();
            msg_puts ((char_u *) (((char *) ("\n\tLast set from "))));
            msg_puts ((char_u *) (p));
            vim_free (p);
            verbose_leave ();
        }
    }
}

void ex_oldfiles (eap)
    exarg_T * eap __attribute__ ((unused));
{
    list_T * l = vimvars [54].vv_di.di_tv.vval.v_list;
    listitem_T * li;
    int nr = 0;
    if (l == ((void *) 0)) msg ((char_u *) ((char *) ("No old files")));
    else {
        msg_start ();
        msg_scroll = 1;
        for (li = l -> lv_first; li != ((void *) 0) && !got_int; li = li -> li_next) {
            msg_outnum ((long) ++nr);
            msg_puts ((char_u *) (": "));
            msg_outtrans (get_tv_string (&li->li_tv));
            msg_putchar ('\n');
            out_flush ();
            ui_breakcheck ();
        }
        got_int = 0;
        if (cmdmod.browse) {
            quit_more = 0;
            nr = prompt_for_number (0);
            msg_starthere ();
            if (nr > 0) {
                char_u * p = list_find_str (get_vim_var_list (54), (long) nr);
                if (p != ((void *) 0)) {
                    p = expand_env_save (p);
                    eap -> arg = p;
                    eap -> cmdidx = CMD_edit;
                    cmdmod.browse = 0;
                    do_exedit (eap, ((void *) 0));
                    vim_free (p);
                }
            }
        }
    }
}

int modify_fname (src, usedlen, fnamep, bufp, fnamelen)
    char_u * src;
    int * usedlen;
    char_u * * fnamep;
    char_u * * bufp;
    int * fnamelen;
{
    int valid = 0;
    char_u * tail;
    char_u * s, * p, * pbuf;
    char_u dirname [1024];
    int c;
    int has_fullname = 0;
    repeat : if (src [*usedlen] == ':' && src [*usedlen + 1] == 'p') {
        has_fullname = 1;
        valid |= 1;
        *usedlen += 2;
        if ((*fnamep) [0] == '~') {
            * fnamep = expand_env_save (*fnamep);
            vim_free (* bufp);
            * bufp = *fnamep;
            if (*fnamep == ((void *) 0)) return -1;
        }
        for (p = *fnamep; *p != '\000'; ++p) {
            if (vim_ispathsep (*p) && p [1] == '.' && (p [2] == '\000' || vim_ispathsep (p [2]) || (p [2] == '.' && (p [3] ==
              '\000' || vim_ispathsep (p [3]))))) break;
        }
        if (*p != '\000' || !vim_isAbsName(*fnamep)) {
            * fnamep = FullName_save (*fnamep, *p != '\000');
            vim_free (* bufp);
            * bufp = *fnamep;
            if (*fnamep == ((void *) 0)) return -1;
        }
        if (mch_isdir (*fnamep)) {
            * fnamep = vim_strnsave (*fnamep, (int) strlen ((char *) (*fnamep)) + 2);
            vim_free (* bufp);
            * bufp = *fnamep;
            if (*fnamep == ((void *) 0)) return -1;
            add_pathsep (* fnamep);
        }
    }
    while (src [*usedlen] == ':' && ((c = src [*usedlen + 1]) == '.' || c == '~' || c == '8')) {
        *usedlen += 2;
        if (c == '8') {
            continue;
        }
        pbuf = ((void *) 0);
        if (!has_fullname) {
            if (c == '.' && **fnamep == '~') p = pbuf = expand_env_save (*fnamep);
            else p = pbuf = FullName_save (*fnamep, 0);
        }
        else p = *fnamep;
        has_fullname = 0;
        if (p != ((void *) 0)) {
            if (c == '.') {
                mch_dirname (dirname, 1024);
                s = shorten_fname (p, dirname);
                if (s != ((void *) 0)) {
                    * fnamep = s;
                    if (pbuf != ((void *) 0)) {
                        vim_free (* bufp);
                        * bufp = pbuf;
                        pbuf = ((void *) 0);
                    }
                }
            }
            else {
                home_replace (((void *) 0), p, dirname, 1024, 1);
                if (*dirname == '~') {
                    s = vim_strsave (dirname);
                    if (s != ((void *) 0)) {
                        * fnamep = s;
                        vim_free (* bufp);
                        * bufp = s;
                    }
                }
            }
            vim_free (pbuf);
        }
    }
    tail = gettail (*fnamep);
    * fnamelen = (int) strlen ((char *) (*fnamep));
    while (src [*usedlen] == ':' && src [*usedlen + 1] == 'h') {
        valid |= 2;
        *usedlen += 2;
        s = get_past_head (*fnamep);
        while (tail > s && vim_ispathsep (*((tail)-1))) --tail;
        * fnamelen = (int) (tail - *fnamep);
        if (*fnamelen == 0) {
            p = vim_strsave ((char_u *) ".");
            if (p == ((void *) 0)) return -1;
            vim_free (* bufp);
            * bufp = *fnamep = tail = p;
            * fnamelen = 1;
        }
        else {
            while (tail > s && !vim_ispathsep(*((tail)-1))) --tail;
        }
    }
    if (src [*usedlen] == ':' && src [*usedlen + 1] == '8') {
        *usedlen += 2;
    }
    if (src [*usedlen] == ':' && src [*usedlen + 1] == 't') {
        *usedlen += 2;
        *fnamelen -= (int) (tail - *fnamep);
        * fnamep = tail;
    }
    while (src [*usedlen] == ':' && (src [*usedlen + 1] == 'e' || src [*usedlen + 1] == 'r')) {
        if (src [*usedlen + 1] == 'e' && *fnamep > tail) s = *fnamep - 2;
        else s = *fnamep + *fnamelen - 1;
        for (; s > tail; --s) if (s [0] == '.') break;
        if (src [*usedlen + 1] == 'e') {
            if (s > tail) {
                *fnamelen += (int) (*fnamep - (s + 1));
                * fnamep = s + 1;
            }
            else if (*fnamep <= tail) *fnamelen = 0;
        }
        else {
            if (s > tail) *fnamelen = (int) (s - *fnamep);
        }
        *usedlen += 2;
    }
    if (src [*usedlen] == ':' && (src [*usedlen + 1] == 's' || (src [*usedlen + 1] == 'g' && src [*usedlen + 2] == 's'))) {
        char_u * str;
        char_u * pat;
        char_u * sub;
        int sep;
        char_u * flags;
        int didit = 0;
        flags = (char_u *) "";
        s = src + *usedlen + 2;
        if (src [*usedlen + 1] == 'g') {
            flags = (char_u *) "g";
            ++s;
        }
        sep = *s++;
        if (sep) {
            p = vim_strchr (s, sep);
            if (p != ((void *) 0)) {
                pat = vim_strnsave (s, (int) (p - s));
                if (pat != ((void *) 0)) {
                    s = p + 1;
                    p = vim_strchr (s, sep);
                    if (p != ((void *) 0)) {
                        sub = vim_strnsave (s, (int) (p - s));
                        str = vim_strnsave (*fnamep, *fnamelen);
                        if (sub != ((void *) 0) && str != ((void *) 0)) {
                            * usedlen = (int) (p + 1 - src);
                            s = do_string_sub (str, pat, sub, flags);
                            if (s != ((void *) 0)) {
                                * fnamep = s;
                                * fnamelen = (int) strlen ((char *) (s));
                                vim_free (* bufp);
                                * bufp = s;
                                didit = 1;
                            }
                        }
                        vim_free (sub);
                        vim_free (str);
                    }
                    vim_free (pat);
                }
            }
            if (didit) goto repeat;
        }
    }
    return valid;
}

char_u * do_string_sub (str, pat, sub, flags)
    char_u * str;
    char_u * pat;
    char_u * sub;
    char_u * flags;
{
    int sublen;
    regmatch_T regmatch;
    int i;
    int do_all;
    char_u * tail;
    garray_T ga;
    char_u * ret;
    char_u * save_cpo;
    save_cpo = p_cpo;
    p_cpo = empty_option;
    ga_init2 (&ga, 1, 200);
    do_all = (flags [0] == 'g');
    regmatch.rm_ic = p_ic;
    regmatch.regprog = vim_regcomp (pat, 1 + 2);
    if (regmatch.regprog != ((void *) 0)) {
        tail = str;
        while (vim_regexec_nl (&regmatch, str, (colnr_T) (tail - str))) {
            sublen = vim_regsub (&regmatch, sub, tail, 0, 1, 0);
            if (ga_grow (&ga, (int) (strlen ((char *) (tail)) + sublen - (regmatch.endp [0] - regmatch.startp [0]))) == 0) {
                ga_clear (&ga);
                break;
            }
            i = (int) (regmatch.startp [0] - tail);
            ((__builtin_object_size ((char *) ((char_u *) ga.ga_data + ga.ga_len), 0) != (size_t) - 1) ? __builtin___memmove_chk
              ((char *) ((char_u *) ga.ga_data + ga.ga_len), (char *) (tail), (size_t) i, __builtin_object_size ((char *) ((
              char_u *) ga.ga_data + ga.ga_len), 0)) : __inline_memmove_chk ((char *) ((char_u *) ga.ga_data + ga.ga_len), (
              char *) (tail), (size_t) i));
            (void) vim_regsub (&regmatch, sub, (char_u *) ga.ga_data + ga.ga_len + i, 1, 1, 0);
            ga.ga_len += i + sublen - 1;
            if (tail == regmatch.endp [0]) {
                if (*tail == '\000') break;
                *((char_u*)ga.ga_data+ga.ga_len) = *tail++;
                ++ga.ga_len;
            }
            else {
                tail = regmatch.endp [0];
                if (*tail == '\000') break;
            }
            if (!do_all) break;
        }
        if (ga.ga_data != ((void *) 0)) ((__builtin_object_size ((char *) ((char *) ga.ga_data + ga.ga_len), 0) != (size_t) - 1
          ) ? __builtin___strcpy_chk ((char *) ((char *) ga.ga_data + ga.ga_len), (char *) (tail), __builtin_object_size ((char
          *) ((char *) ga.ga_data + ga.ga_len), 1 > 1)) : __inline_strcpy_chk ((char *) ((char *) ga.ga_data + ga.ga_len), (
          char *) (tail)));
        vim_free (regmatch.regprog);
    }
    ret = vim_strsave (ga.ga_data == ((void *) 0) ? str : (char_u *) ga.ga_data);
    ga_clear (&ga);
    if (p_cpo == empty_option) p_cpo = save_cpo;
    else free_string_option (save_cpo);
    return ret;
}

