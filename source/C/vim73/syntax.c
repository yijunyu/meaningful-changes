# 1 "syntax.c"
# 1 "/Users/yy66/Documents/research/mct/source/C/vim73/src//"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "syntax.c"
# 14 "syntax.c"
# 1 "vim.h" 1
# 33 "vim.h"
# 1 "auto/config.h" 1
# 34 "vim.h" 2
# 187 "vim.h"
# 1 "feature.h" 1
# 188 "vim.h" 2
# 265 "vim.h"
# 1 "os_unix.h" 1
# 21 "os_unix.h"
# 1 "/usr/include/stdio.h" 1 3 4
# 64 "/usr/include/stdio.h" 3 4
# 1 "/usr/include/_types.h" 1 3 4
# 27 "/usr/include/_types.h" 3 4
# 1 "/usr/include/sys/_types.h" 1 3 4
# 32 "/usr/include/sys/_types.h" 3 4
# 1 "/usr/include/sys/cdefs.h" 1 3 4
# 33 "/usr/include/sys/_types.h" 2 3 4
# 1 "/usr/include/machine/_types.h" 1 3 4
# 34 "/usr/include/machine/_types.h" 3 4
# 1 "/usr/include/i386/_types.h" 1 3 4
# 37 "/usr/include/i386/_types.h" 3 4
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
# 70 "/usr/include/i386/_types.h" 3 4
typedef int __darwin_ct_rune_t;





typedef union {
 char __mbstate8[128];
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
# 35 "/usr/include/machine/_types.h" 2 3 4
# 34 "/usr/include/sys/_types.h" 2 3 4
# 58 "/usr/include/sys/_types.h" 3 4
struct __darwin_pthread_handler_rec
{
 void (*__routine)(void *);
 void *__arg;
 struct __darwin_pthread_handler_rec *__next;
};
struct _opaque_pthread_attr_t { long __sig; char __opaque[56]; };
struct _opaque_pthread_cond_t { long __sig; char __opaque[40]; };
struct _opaque_pthread_condattr_t { long __sig; char __opaque[8]; };
struct _opaque_pthread_mutex_t { long __sig; char __opaque[56]; };
struct _opaque_pthread_mutexattr_t { long __sig; char __opaque[8]; };
struct _opaque_pthread_once_t { long __sig; char __opaque[8]; };
struct _opaque_pthread_rwlock_t { long __sig; char __opaque[192]; };
struct _opaque_pthread_rwlockattr_t { long __sig; char __opaque[16]; };
struct _opaque_pthread_t { long __sig; struct __darwin_pthread_handler_rec *__cleanup_stack; char __opaque[1168]; };
# 94 "/usr/include/sys/_types.h" 3 4
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
typedef struct _opaque_pthread_attr_t
   __darwin_pthread_attr_t;
typedef struct _opaque_pthread_cond_t
   __darwin_pthread_cond_t;
typedef struct _opaque_pthread_condattr_t
   __darwin_pthread_condattr_t;
typedef unsigned long __darwin_pthread_key_t;
typedef struct _opaque_pthread_mutex_t
   __darwin_pthread_mutex_t;
typedef struct _opaque_pthread_mutexattr_t
   __darwin_pthread_mutexattr_t;
typedef struct _opaque_pthread_once_t
   __darwin_pthread_once_t;
typedef struct _opaque_pthread_rwlock_t
   __darwin_pthread_rwlock_t;
typedef struct _opaque_pthread_rwlockattr_t
   __darwin_pthread_rwlockattr_t;
typedef struct _opaque_pthread_t
   *__darwin_pthread_t;
typedef __uint32_t __darwin_sigset_t;
typedef __int32_t __darwin_suseconds_t;
typedef __uint32_t __darwin_uid_t;
typedef __uint32_t __darwin_useconds_t;
typedef unsigned char __darwin_uuid_t[16];
typedef char __darwin_uuid_string_t[37];
# 28 "/usr/include/_types.h" 2 3 4
# 39 "/usr/include/_types.h" 3 4
typedef int __darwin_nl_item;
typedef int __darwin_wctrans_t;

typedef __uint32_t __darwin_wctype_t;
# 65 "/usr/include/stdio.h" 2 3 4





typedef __darwin_va_list va_list;




typedef __darwin_off_t off_t;




typedef __darwin_size_t size_t;






typedef __darwin_off_t fpos_t;
# 98 "/usr/include/stdio.h" 3 4
struct __sbuf {
 unsigned char *_base;
 int _size;
};


struct __sFILEX;
# 132 "/usr/include/stdio.h" 3 4
typedef struct __sFILE {
 unsigned char *_p;
 int _r;
 int _w;
 short _flags;
 short _file;
 struct __sbuf _bf;
 int _lbfsize;


 void *_cookie;
 int (*_close)(void *);
 int (*_read) (void *, char *, int);
 fpos_t (*_seek) (void *, fpos_t, int);
 int (*_write)(void *, const char *, int);


 struct __sbuf _ub;
 struct __sFILEX *_extra;
 int _ur;


 unsigned char _ubuf[3];
 unsigned char _nbuf[1];


 struct __sbuf _lb;


 int _blksize;
 fpos_t _offset;
} FILE;



extern FILE *__stdinp;
extern FILE *__stdoutp;
extern FILE *__stderrp;




# 248 "/usr/include/stdio.h" 3 4

void clearerr(FILE *);
int fclose(FILE *);
int feof(FILE *);
int ferror(FILE *);
int fflush(FILE *);
int fgetc(FILE *);
int fgetpos(FILE * , fpos_t *);
char *fgets(char * , int, FILE *);



FILE *fopen(const char * , const char * ) __asm("_" "fopen" );

int fprintf(FILE * , const char * , ...) ;
int fputc(int, FILE *);
int fputs(const char * , FILE * ) __asm("_" "fputs" );
size_t fread(void * , size_t, size_t, FILE * );
FILE *freopen(const char * , const char * ,
     FILE * ) __asm("_" "freopen" );
int fscanf(FILE * , const char * , ...) ;
int fseek(FILE *, long, int);
int fsetpos(FILE *, const fpos_t *);
long ftell(FILE *);
size_t fwrite(const void * , size_t, size_t, FILE * ) __asm("_" "fwrite" );
int getc(FILE *);
int getchar(void);
char *gets(char *);

extern const int sys_nerr;
extern const char *const sys_errlist[];

void perror(const char *);
int printf(const char * , ...) ;
int putc(int, FILE *);
int putchar(int);
int puts(const char *);
int remove(const char *);
int rename (const char *, const char *);
void rewind(FILE *);
int scanf(const char * , ...) ;
void setbuf(FILE * , char * );
int setvbuf(FILE * , char * , int, size_t);
int sprintf(char * , const char * , ...) ;
int sscanf(const char * , const char * , ...) ;
FILE *tmpfile(void);
char *tmpnam(char *);
int ungetc(int, FILE *);
int vfprintf(FILE * , const char * , va_list) ;
int vprintf(const char * , va_list) ;
int vsprintf(char * , const char * , va_list) ;

int asprintf(char **, const char *, ...) ;
int vasprintf(char **, const char *, va_list) ;










char *ctermid(char *);

char *ctermid_r(char *);




FILE *fdopen(int, const char *) __asm("_" "fdopen" );


char *fgetln(FILE *, size_t *);

int fileno(FILE *);
void flockfile(FILE *);

const char
 *fmtcheck(const char *, const char *);
int fpurge(FILE *);

int fseeko(FILE *, off_t, int);
off_t ftello(FILE *);
int ftrylockfile(FILE *);
void funlockfile(FILE *);
int getc_unlocked(FILE *);
int getchar_unlocked(void);

int getw(FILE *);

int pclose(FILE *);



FILE *popen(const char *, const char *) __asm("_" "popen" );

int putc_unlocked(int, FILE *);
int putchar_unlocked(int);

int putw(int, FILE *);
void setbuffer(FILE *, char *, int);
int setlinebuf(FILE *);

int snprintf(char * , size_t, const char * , ...) ;
char *tempnam(const char *, const char *) __asm("_" "tempnam" );
int vfscanf(FILE * , const char * , va_list) ;
int vscanf(const char * , va_list) ;
int vsnprintf(char * , size_t, const char * , va_list) ;
int vsscanf(const char * , const char * , va_list) ;

FILE *zopen(const char *, const char *, int);








FILE *funopen(const void *,
  int (*)(void *, char *, int),
  int (*)(void *, const char *, int),
  fpos_t (*)(void *, fpos_t, int),
  int (*)(void *));

# 383 "/usr/include/stdio.h" 3 4

int __srget(FILE *);
int __svfscanf(FILE *, const char *, va_list) ;
int __swbuf(int, FILE *);








static __inline int __sputc(int _c, FILE *_p) {
 if (--_p->_w >= 0 || (_p->_w >= _p->_lbfsize && (char)_c != '\n'))
  return (*_p->_p++ = _c);
 else
  return (__swbuf(_c, _p));
}
# 443 "/usr/include/stdio.h" 3 4
# 1 "/usr/include/secure/_stdio.h" 1 3 4
# 31 "/usr/include/secure/_stdio.h" 3 4
# 1 "/usr/include/secure/_common.h" 1 3 4
# 32 "/usr/include/secure/_stdio.h" 2 3 4
# 42 "/usr/include/secure/_stdio.h" 3 4
extern int __sprintf_chk (char * , int, size_t,
     const char * , ...)
  ;




extern int __snprintf_chk (char * , size_t, int, size_t,
      const char * , ...)
  ;




extern int __vsprintf_chk (char * , int, size_t,
      const char * , va_list)
  ;




extern int __vsnprintf_chk (char * , size_t, int, size_t,
       const char * , va_list)
  ;
# 444 "/usr/include/stdio.h" 2 3 4
# 22 "os_unix.h" 2
# 1 "/usr/include/ctype.h" 1 3 4
# 69 "/usr/include/ctype.h" 3 4
# 1 "/usr/include/runetype.h" 1 3 4
# 53 "/usr/include/runetype.h" 3 4
typedef __darwin_ct_rune_t ct_rune_t;




typedef __darwin_rune_t rune_t;





typedef __darwin_wchar_t wchar_t;





typedef __darwin_wint_t wint_t;
# 81 "/usr/include/runetype.h" 3 4
typedef struct {
 __darwin_rune_t __min;
 __darwin_rune_t __max;
 __darwin_rune_t __map;
 __uint32_t *__types;
} _RuneEntry;

typedef struct {
 int __nranges;
 _RuneEntry *__ranges;
} _RuneRange;

typedef struct {
 char __name[14];
 __uint32_t __mask;
} _RuneCharClass;

typedef struct {
 char __magic[8];
 char __encoding[32];

 __darwin_rune_t (*__sgetrune)(const char *, __darwin_size_t, char const **);
 int (*__sputrune)(__darwin_rune_t, char *, __darwin_size_t, char **);
 __darwin_rune_t __invalid_rune;

 __uint32_t __runetype[(1 <<8 )];
 __darwin_rune_t __maplower[(1 <<8 )];
 __darwin_rune_t __mapupper[(1 <<8 )];






 _RuneRange __runetype_ext;
 _RuneRange __maplower_ext;
 _RuneRange __mapupper_ext;

 void *__variable;
 int __variable_len;




 int __ncharclasses;
 _RuneCharClass *__charclasses;
} _RuneLocale;




extern _RuneLocale _DefaultRuneLocale;
extern _RuneLocale *_CurrentRuneLocale;

# 70 "/usr/include/ctype.h" 2 3 4
# 145 "/usr/include/ctype.h" 3 4

unsigned long ___runetype(__darwin_ct_rune_t);
__darwin_ct_rune_t ___tolower(__darwin_ct_rune_t);
__darwin_ct_rune_t ___toupper(__darwin_ct_rune_t);


static __inline int
isascii(int _c)
{
 return ((_c & ~0x7F) == 0);
}
# 164 "/usr/include/ctype.h" 3 4

int __maskrune(__darwin_ct_rune_t, unsigned long);



static __inline int
__istype(__darwin_ct_rune_t _c, unsigned long _f)
{



 return (isascii(_c) ? !!(_DefaultRuneLocale.__runetype[_c] & _f)
  : !!__maskrune(_c, _f));

}

static __inline __darwin_ct_rune_t
__isctype(__darwin_ct_rune_t _c, unsigned long _f)
{



 return (_c < 0 || _c >= (1 <<8 )) ? 0 :
  !!(_DefaultRuneLocale.__runetype[_c] & _f);

}
# 204 "/usr/include/ctype.h" 3 4

__darwin_ct_rune_t __toupper(__darwin_ct_rune_t);
__darwin_ct_rune_t __tolower(__darwin_ct_rune_t);



static __inline int
__wcwidth(__darwin_ct_rune_t _c)
{
 unsigned int _x;

 if (_c == 0)
  return (0);
 _x = (unsigned int)__maskrune(_c, 0xe0000000L|0x00040000L);
 if ((_x & 0xe0000000L) != 0)
  return ((_x & 0xe0000000L) >> 30);
 return ((_x & 0x00040000L) != 0 ? 1 : -1);
}






static __inline int
isalnum(int _c)
{
 return (__istype(_c, 0x00000100L|0x00000400L));
}

static __inline int
isalpha(int _c)
{
 return (__istype(_c, 0x00000100L));
}

static __inline int
isblank(int _c)
{
 return (__istype(_c, 0x00020000L));
}

static __inline int
iscntrl(int _c)
{
 return (__istype(_c, 0x00000200L));
}


static __inline int
isdigit(int _c)
{
 return (__isctype(_c, 0x00000400L));
}

static __inline int
isgraph(int _c)
{
 return (__istype(_c, 0x00000800L));
}

static __inline int
islower(int _c)
{
 return (__istype(_c, 0x00001000L));
}

static __inline int
isprint(int _c)
{
 return (__istype(_c, 0x00040000L));
}

static __inline int
ispunct(int _c)
{
 return (__istype(_c, 0x00002000L));
}

static __inline int
isspace(int _c)
{
 return (__istype(_c, 0x00004000L));
}

static __inline int
isupper(int _c)
{
 return (__istype(_c, 0x00008000L));
}


static __inline int
isxdigit(int _c)
{
 return (__isctype(_c, 0x00010000L));
}

static __inline int
toascii(int _c)
{
 return (_c & 0x7F);
}

static __inline int
tolower(int _c)
{
        return (__tolower(_c));
}

static __inline int
toupper(int _c)
{
        return (__toupper(_c));
}


static __inline int
digittoint(int _c)
{
 return (__maskrune(_c, 0x0F));
}

static __inline int
ishexnumber(int _c)
{
 return (__istype(_c, 0x00010000L));
}

static __inline int
isideogram(int _c)
{
 return (__istype(_c, 0x00080000L));
}

static __inline int
isnumber(int _c)
{
 return (__istype(_c, 0x00000400L));
}

static __inline int
isphonogram(int _c)
{
 return (__istype(_c, 0x00200000L));
}

static __inline int
isrune(int _c)
{
 return (__istype(_c, 0xFFFFFFF0L));
}

static __inline int
isspecial(int _c)
{
 return (__istype(_c, 0x00100000L));
}
# 23 "os_unix.h" 2





# 1 "/usr/include/sys/types.h" 1 3 4
# 72 "/usr/include/sys/types.h" 3 4
# 1 "/usr/include/sys/appleapiopts.h" 1 3 4
# 73 "/usr/include/sys/types.h" 2 3 4





# 1 "/usr/include/machine/types.h" 1 3 4
# 37 "/usr/include/machine/types.h" 3 4
# 1 "/usr/include/i386/types.h" 1 3 4
# 70 "/usr/include/i386/types.h" 3 4
# 1 "/usr/include/i386/_types.h" 1 3 4
# 71 "/usr/include/i386/types.h" 2 3 4







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
# 38 "/usr/include/machine/types.h" 2 3 4
# 79 "/usr/include/sys/types.h" 2 3 4


# 1 "/usr/include/machine/endian.h" 1 3 4
# 37 "/usr/include/machine/endian.h" 3 4
# 1 "/usr/include/i386/endian.h" 1 3 4
# 99 "/usr/include/i386/endian.h" 3 4
# 1 "/usr/include/sys/_endian.h" 1 3 4
# 124 "/usr/include/sys/_endian.h" 3 4
# 1 "/usr/include/libkern/_OSByteOrder.h" 1 3 4
# 66 "/usr/include/libkern/_OSByteOrder.h" 3 4
# 1 "/usr/include/libkern/i386/_OSByteOrder.h" 1 3 4
# 44 "/usr/include/libkern/i386/_OSByteOrder.h" 3 4
static __inline__
__uint16_t
_OSSwapInt16(
    __uint16_t _data
)
{
    return ((_data << 8) | (_data >> 8));
}

static __inline__
__uint32_t
_OSSwapInt32(
    __uint32_t _data
)
{



    __asm__ ("bswap   %0" : "+r" (_data));
    return _data;

}
# 91 "/usr/include/libkern/i386/_OSByteOrder.h" 3 4
static __inline__
__uint64_t
_OSSwapInt64(
    __uint64_t _data
)
{
    __asm__ ("bswap   %0" : "+r" (_data));
    return _data;
}
# 67 "/usr/include/libkern/_OSByteOrder.h" 2 3 4
# 125 "/usr/include/sys/_endian.h" 2 3 4
# 100 "/usr/include/i386/endian.h" 2 3 4
# 38 "/usr/include/machine/endian.h" 2 3 4
# 82 "/usr/include/sys/types.h" 2 3 4


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
# 176 "/usr/include/sys/types.h" 3 4
typedef int32_t segsz_t;
typedef int32_t swblk_t;


typedef __darwin_uid_t uid_t;
# 223 "/usr/include/sys/types.h" 3 4
typedef __darwin_clock_t clock_t;
# 235 "/usr/include/sys/types.h" 3 4
typedef __darwin_ssize_t ssize_t;




typedef __darwin_time_t time_t;




typedef __darwin_useconds_t useconds_t;




typedef __darwin_suseconds_t suseconds_t;
# 260 "/usr/include/sys/types.h" 3 4
# 1 "/usr/include/sys/_structs.h" 1 3 4
# 183 "/usr/include/sys/_structs.h" 3 4

typedef struct fd_set {
 __int32_t fds_bits[((((1024) % ((sizeof(__int32_t) * 8))) == 0) ? ((1024) / ((sizeof(__int32_t) * 8))) : (((1024) / ((sizeof(__int32_t) * 8))) + 1))];
} fd_set;



static __inline int
__darwin_fd_isset(int _n, const struct fd_set *_p)
{
 return (_p->fds_bits[_n/(sizeof(__int32_t) * 8)] & (1<<(_n % (sizeof(__int32_t) * 8))));
}
# 261 "/usr/include/sys/types.h" 2 3 4




typedef __int32_t fd_mask;
# 318 "/usr/include/sys/types.h" 3 4
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
# 29 "os_unix.h" 2
# 1 "/usr/include/sys/stat.h" 1 3 4
# 75 "/usr/include/sys/stat.h" 3 4
# 1 "/usr/include/Availability.h" 1 3 4
# 126 "/usr/include/Availability.h" 3 4
# 1 "/usr/include/AvailabilityInternal.h" 1 3 4
# 127 "/usr/include/Availability.h" 2 3 4
# 76 "/usr/include/sys/stat.h" 2 3 4



# 1 "/usr/include/sys/_structs.h" 1 3 4
# 88 "/usr/include/sys/_structs.h" 3 4
struct timespec
{
 __darwin_time_t tv_sec;
 long tv_nsec;
};
# 80 "/usr/include/sys/stat.h" 2 3 4
# 153 "/usr/include/sys/stat.h" 3 4
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
# 225 "/usr/include/sys/stat.h" 3 4
struct stat { dev_t st_dev; mode_t st_mode; nlink_t st_nlink; __darwin_ino64_t st_ino; uid_t st_uid; gid_t st_gid; dev_t st_rdev; struct timespec st_atimespec; struct timespec st_mtimespec; struct timespec st_ctimespec; struct timespec st_birthtimespec; off_t st_size; blkcnt_t st_blocks; blksize_t st_blksize; __uint32_t st_flags; __uint32_t st_gen; __int32_t st_lspare; __int64_t st_qspare[2]; };
# 264 "/usr/include/sys/stat.h" 3 4
struct stat64 { dev_t st_dev; mode_t st_mode; nlink_t st_nlink; __darwin_ino64_t st_ino; uid_t st_uid; gid_t st_gid; dev_t st_rdev; struct timespec st_atimespec; struct timespec st_mtimespec; struct timespec st_ctimespec; struct timespec st_birthtimespec; off_t st_size; blkcnt_t st_blocks; blksize_t st_blksize; __uint32_t st_flags; __uint32_t st_gen; __int32_t st_lspare; __int64_t st_qspare[2]; };
# 427 "/usr/include/sys/stat.h" 3 4


int chmod(const char *, mode_t) __asm("_" "chmod" );
int fchmod(int, mode_t) __asm("_" "fchmod" );
int fstat(int, struct stat *) __asm("_" "fstat" "$INODE64");
int lstat(const char *, struct stat *) __asm("_" "lstat" "$INODE64");
int mkdir(const char *, mode_t);
int mkfifo(const char *, mode_t);
int stat(const char *, struct stat *) __asm("_" "stat" "$INODE64");
int mknod(const char *, mode_t, dev_t);
mode_t umask(mode_t);



struct _filesec;
typedef struct _filesec *filesec_t;


int chflags(const char *, __uint32_t);
int chmodx_np(const char *, filesec_t);
int fchflags(int, __uint32_t);
int fchmodx_np(int, filesec_t);
int fstatx_np(int, struct stat *, filesec_t) __asm("_" "fstatx_np" "$INODE64");
int lchflags(const char *, __uint32_t);
int lchmod(const char *, mode_t);
int lstatx_np(const char *, struct stat *, filesec_t) __asm("_" "lstatx_np" "$INODE64");
int mkdirx_np(const char *, filesec_t);
int mkfifox_np(const char *, filesec_t);
int statx_np(const char *, struct stat *, filesec_t) __asm("_" "statx_np" "$INODE64");
int umaskx_np(filesec_t);



int fstatx64_np(int, struct stat64 *, filesec_t) __attribute__((deprecated,visibility("default")));
int lstatx64_np(const char *, struct stat64 *, filesec_t) __attribute__((deprecated,visibility("default")));
int statx64_np(const char *, struct stat64 *, filesec_t) __attribute__((deprecated,visibility("default")));
int fstat64(int, struct stat64 *) __attribute__((deprecated,visibility("default")));
int lstat64(const char *, struct stat64 *) __attribute__((deprecated,visibility("default")));
int stat64(const char *, struct stat64 *) __attribute__((deprecated,visibility("default")));




# 30 "os_unix.h" 2



# 1 "/usr/include/stdlib.h" 1 3 4
# 65 "/usr/include/stdlib.h" 3 4
# 1 "/usr/include/sys/wait.h" 1 3 4
# 79 "/usr/include/sys/wait.h" 3 4
typedef enum {
 P_ALL,
 P_PID,
 P_PGID
} idtype_t;
# 116 "/usr/include/sys/wait.h" 3 4
# 1 "/usr/include/sys/signal.h" 1 3 4
# 81 "/usr/include/sys/signal.h" 3 4
# 1 "/usr/include/machine/signal.h" 1 3 4
# 34 "/usr/include/machine/signal.h" 3 4
# 1 "/usr/include/i386/signal.h" 1 3 4
# 39 "/usr/include/i386/signal.h" 3 4
typedef int sig_atomic_t;
# 55 "/usr/include/i386/signal.h" 3 4
# 1 "/usr/include/i386/_structs.h" 1 3 4
# 56 "/usr/include/i386/signal.h" 2 3 4
# 35 "/usr/include/machine/signal.h" 2 3 4
# 82 "/usr/include/sys/signal.h" 2 3 4
# 154 "/usr/include/sys/signal.h" 3 4
# 1 "/usr/include/sys/_structs.h" 1 3 4
# 57 "/usr/include/sys/_structs.h" 3 4
# 1 "/usr/include/machine/_structs.h" 1 3 4
# 31 "/usr/include/machine/_structs.h" 3 4
# 1 "/usr/include/i386/_structs.h" 1 3 4
# 38 "/usr/include/i386/_structs.h" 3 4
# 1 "/usr/include/mach/i386/_structs.h" 1 3 4
# 43 "/usr/include/mach/i386/_structs.h" 3 4
struct __darwin_i386_thread_state
{
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
# 89 "/usr/include/mach/i386/_structs.h" 3 4
struct __darwin_fp_control
{
    unsigned short __invalid :1,
        __denorm :1,
    __zdiv :1,
    __ovrfl :1,
    __undfl :1,
    __precis :1,
      :2,
    __pc :2,





    __rc :2,






             :1,
      :3;
};
typedef struct __darwin_fp_control __darwin_fp_control_t;
# 147 "/usr/include/mach/i386/_structs.h" 3 4
struct __darwin_fp_status
{
    unsigned short __invalid :1,
        __denorm :1,
    __zdiv :1,
    __ovrfl :1,
    __undfl :1,
    __precis :1,
    __stkflt :1,
    __errsumm :1,
    __c0 :1,
    __c1 :1,
    __c2 :1,
    __tos :3,
    __c3 :1,
    __busy :1;
};
typedef struct __darwin_fp_status __darwin_fp_status_t;
# 191 "/usr/include/mach/i386/_structs.h" 3 4
struct __darwin_mmst_reg
{
 char __mmst_reg[10];
 char __mmst_rsrv[6];
};
# 210 "/usr/include/mach/i386/_structs.h" 3 4
struct __darwin_xmm_reg
{
 char __xmm_reg[16];
};
# 232 "/usr/include/mach/i386/_structs.h" 3 4
struct __darwin_i386_float_state
{
 int __fpu_reserved[2];
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
 char __fpu_rsrv4[14*16];
 int __fpu_reserved1;
};
# 308 "/usr/include/mach/i386/_structs.h" 3 4
struct __darwin_i386_exception_state
{
    unsigned int __trapno;
    unsigned int __err;
    unsigned int __faultvaddr;
};
# 326 "/usr/include/mach/i386/_structs.h" 3 4
struct __darwin_x86_debug_state32
{
 unsigned int __dr0;
 unsigned int __dr1;
 unsigned int __dr2;
 unsigned int __dr3;
 unsigned int __dr4;
 unsigned int __dr5;
 unsigned int __dr6;
 unsigned int __dr7;
};
# 358 "/usr/include/mach/i386/_structs.h" 3 4
struct __darwin_x86_thread_state64
{
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
# 413 "/usr/include/mach/i386/_structs.h" 3 4
struct __darwin_x86_float_state64
{
 int __fpu_reserved[2];
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
 char __fpu_rsrv4[6*16];
 int __fpu_reserved1;
};
# 517 "/usr/include/mach/i386/_structs.h" 3 4
struct __darwin_x86_exception_state64
{
    unsigned int __trapno;
    unsigned int __err;
    __uint64_t __faultvaddr;
};
# 535 "/usr/include/mach/i386/_structs.h" 3 4
struct __darwin_x86_debug_state64
{
 __uint64_t __dr0;
 __uint64_t __dr1;
 __uint64_t __dr2;
 __uint64_t __dr3;
 __uint64_t __dr4;
 __uint64_t __dr5;
 __uint64_t __dr6;
 __uint64_t __dr7;
};
# 39 "/usr/include/i386/_structs.h" 2 3 4
# 48 "/usr/include/i386/_structs.h" 3 4
struct __darwin_mcontext32
{
 struct __darwin_i386_exception_state __es;
 struct __darwin_i386_thread_state __ss;
 struct __darwin_i386_float_state __fs;
};
# 68 "/usr/include/i386/_structs.h" 3 4
struct __darwin_mcontext64
{
 struct __darwin_x86_exception_state64 __es;
 struct __darwin_x86_thread_state64 __ss;
 struct __darwin_x86_float_state64 __fs;
};
# 91 "/usr/include/i386/_structs.h" 3 4
typedef struct __darwin_mcontext64 *mcontext_t;
# 32 "/usr/include/machine/_structs.h" 2 3 4
# 58 "/usr/include/sys/_structs.h" 2 3 4
# 75 "/usr/include/sys/_structs.h" 3 4
struct __darwin_sigaltstack
{
 void *ss_sp;
 __darwin_size_t ss_size;
 int ss_flags;
};
# 128 "/usr/include/sys/_structs.h" 3 4
struct __darwin_ucontext
{
 int uc_onstack;
 __darwin_sigset_t uc_sigmask;
 struct __darwin_sigaltstack uc_stack;
 struct __darwin_ucontext *uc_link;
 __darwin_size_t uc_mcsize;
 struct __darwin_mcontext64 *uc_mcontext;



};
# 218 "/usr/include/sys/_structs.h" 3 4
typedef struct __darwin_sigaltstack stack_t;
# 227 "/usr/include/sys/_structs.h" 3 4
typedef struct __darwin_ucontext ucontext_t;
# 155 "/usr/include/sys/signal.h" 2 3 4
# 168 "/usr/include/sys/signal.h" 3 4
typedef __darwin_sigset_t sigset_t;
# 181 "/usr/include/sys/signal.h" 3 4
union sigval {

 int sival_int;
 void *sival_ptr;
};





struct sigevent {
 int sigev_notify;
 int sigev_signo;
 union sigval sigev_value;
 void (*sigev_notify_function)(union sigval);
 pthread_attr_t *sigev_notify_attributes;
};


typedef struct __siginfo {
 int si_signo;
 int si_errno;
 int si_code;
 pid_t si_pid;
 uid_t si_uid;
 int si_status;
 void *si_addr;
 union sigval si_value;
 long si_band;
 unsigned long __pad[7];
} siginfo_t;
# 292 "/usr/include/sys/signal.h" 3 4
union __sigaction_u {
 void (*__sa_handler)(int);
 void (*__sa_sigaction)(int, struct __siginfo *,
         void *);
};


struct __sigaction {
 union __sigaction_u __sigaction_u;
 void (*sa_tramp)(void *, int, int, siginfo_t *, void *);
 sigset_t sa_mask;
 int sa_flags;
};




struct sigaction {
 union __sigaction_u __sigaction_u;
 sigset_t sa_mask;
 int sa_flags;
};
# 354 "/usr/include/sys/signal.h" 3 4
typedef void (*sig_t)(int);
# 371 "/usr/include/sys/signal.h" 3 4
struct sigvec {
 void (*sv_handler)(int);
 int sv_mask;
 int sv_flags;
};
# 390 "/usr/include/sys/signal.h" 3 4
struct sigstack {
 char *ss_sp;
 int ss_onstack;
};
# 412 "/usr/include/sys/signal.h" 3 4

void (*signal(int, void (*)(int)))(int);

# 117 "/usr/include/sys/wait.h" 2 3 4
# 1 "/usr/include/sys/resource.h" 1 3 4
# 76 "/usr/include/sys/resource.h" 3 4
# 1 "/usr/include/sys/_structs.h" 1 3 4
# 100 "/usr/include/sys/_structs.h" 3 4
struct timeval
{
 __darwin_time_t tv_sec;
 __darwin_suseconds_t tv_usec;
};
# 77 "/usr/include/sys/resource.h" 2 3 4
# 88 "/usr/include/sys/resource.h" 3 4
typedef __uint64_t rlim_t;
# 142 "/usr/include/sys/resource.h" 3 4
struct rusage {
 struct timeval ru_utime;
 struct timeval ru_stime;
# 153 "/usr/include/sys/resource.h" 3 4
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
# 213 "/usr/include/sys/resource.h" 3 4
struct rlimit {
 rlim_t rlim_cur;
 rlim_t rlim_max;
};
# 235 "/usr/include/sys/resource.h" 3 4

int getpriority(int, id_t);

int getiopolicy_np(int, int);

int getrlimit(int, struct rlimit *) __asm("_" "getrlimit" );
int getrusage(int, struct rusage *);
int setpriority(int, id_t, int);

int setiopolicy_np(int, int, int);

int setrlimit(int, const struct rlimit *) __asm("_" "setrlimit" );

# 118 "/usr/include/sys/wait.h" 2 3 4
# 201 "/usr/include/sys/wait.h" 3 4
union wait {
 int w_status;



 struct {

  unsigned int w_Termsig:7,
    w_Coredump:1,
    w_Retcode:8,
    w_Filler:16;







 } w_T;





 struct {

  unsigned int w_Stopval:8,
    w_Stopsig:8,
    w_Filler:16;






 } w_S;
};
# 254 "/usr/include/sys/wait.h" 3 4

pid_t wait(int *) __asm("_" "wait" );
pid_t waitpid(pid_t, int *, int) __asm("_" "waitpid" );

int waitid(idtype_t, id_t, siginfo_t *, int) __asm("_" "waitid" );


pid_t wait3(int *, int, struct rusage *);
pid_t wait4(pid_t, int *, int, struct rusage *);


# 66 "/usr/include/stdlib.h" 2 3 4

# 1 "/usr/include/alloca.h" 1 3 4
# 35 "/usr/include/alloca.h" 3 4

void *alloca(size_t);

# 68 "/usr/include/stdlib.h" 2 3 4
# 97 "/usr/include/stdlib.h" 3 4
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
# 134 "/usr/include/stdlib.h" 3 4
extern int __mb_cur_max;
# 144 "/usr/include/stdlib.h" 3 4

void abort(void) __attribute__((__noreturn__));
int abs(int) __attribute__((__const__));
int atexit(void (*)(void));
double atof(const char *);
int atoi(const char *);
long atol(const char *);

long long
  atoll(const char *);

void *bsearch(const void *, const void *, size_t,
     size_t, int (*)(const void *, const void *));
void *calloc(size_t, size_t);
div_t div(int, int) __attribute__((__const__));
void exit(int) __attribute__((__noreturn__));
void free(void *);
char *getenv(const char *);
long labs(long) __attribute__((__const__));
ldiv_t ldiv(long, long) __attribute__((__const__));

long long
  llabs(long long);
lldiv_t lldiv(long long, long long);

void *malloc(size_t);
int mblen(const char *, size_t);
size_t mbstowcs(wchar_t * , const char * , size_t);
int mbtowc(wchar_t * , const char * , size_t);
int posix_memalign(void **, size_t, size_t);
void qsort(void *, size_t, size_t,
     int (*)(const void *, const void *));
int rand(void);
void *realloc(void *, size_t);
void srand(unsigned);
double strtod(const char *, char **) __asm("_" "strtod" );
float strtof(const char *, char **) __asm("_" "strtof" );
long strtol(const char *, char **, int);
long double
  strtold(const char *, char **) ;

long long
  strtoll(const char *, char **, int);

unsigned long
  strtoul(const char *, char **, int);

unsigned long long
  strtoull(const char *, char **, int);

int system(const char *) __asm("_" "system" );
size_t wcstombs(char * , const wchar_t * , size_t);
int wctomb(char *, wchar_t);


void _Exit(int) __attribute__((__noreturn__));
long a64l(const char *);
double drand48(void);
char *ecvt(double, int, int *, int *);
double erand48(unsigned short[3]);
char *fcvt(double, int, int *, int *);
char *gcvt(double, int, char *);
int getsubopt(char **, char * const *, char **);
int grantpt(int);

char *initstate(unsigned, char *, size_t);



long jrand48(unsigned short[3]);
char *l64a(long);
void lcong48(unsigned short[7]);
long lrand48(void);
char *mktemp(char *);
int mkstemp(char *);
long mrand48(void);
long nrand48(unsigned short[3]);
int posix_openpt(int);
char *ptsname(int);
int putenv(char *) __asm("_" "putenv" );
long random(void);
int rand_r(unsigned *);

char *realpath(const char * , char * ) __asm("_" "realpath" "$DARWIN_EXTSN");



unsigned short
 *seed48(unsigned short[3]);
int setenv(const char *, const char *, int) __asm("_" "setenv" );

void setkey(const char *) __asm("_" "setkey" );



char *setstate(const char *);
void srand48(long);

void srandom(unsigned);



int unlockpt(int);

int unsetenv(const char *) __asm("_" "unsetenv" );
# 267 "/usr/include/stdlib.h" 3 4
u_int32_t
  arc4random(void);
void arc4random_addrandom(unsigned char *dat, int datlen);
void arc4random_stir(void);

int atexit_b(void (^)(void));
void *bsearch_b(const void *, const void *, size_t,
     size_t, int (^)(const void *, const void *));



char *cgetcap(char *, const char *, int);
int cgetclose(void);
int cgetent(char **, char **, const char *);
int cgetfirst(char **, char **);
int cgetmatch(const char *, const char *);
int cgetnext(char **, char **);
int cgetnum(char *, const char *, long *);
int cgetset(const char *);
int cgetstr(char *, const char *, char **);
int cgetustr(char *, const char *, char **);

int daemon(int, int) __asm("_" "daemon" "$1050") __attribute__((deprecated,visibility("default")));
char *devname(dev_t, mode_t);
char *devname_r(dev_t, mode_t, char *buf, int len);
char *getbsize(int *, long *);
int getloadavg(double [], int);
const char
 *getprogname(void);

int heapsort(void *, size_t, size_t,
     int (*)(const void *, const void *));

int heapsort_b(void *, size_t, size_t,
     int (^)(const void *, const void *));

int mergesort(void *, size_t, size_t,
     int (*)(const void *, const void *));

int mergesort_b(void *, size_t, size_t,
     int (^)(const void *, const void *));

void psort(void *, size_t, size_t,
     int (*)(const void *, const void *));

void psort_b(void *, size_t, size_t,
     int (^)(const void *, const void *));

void psort_r(void *, size_t, size_t, void *,
     int (*)(void *, const void *, const void *));

void qsort_b(void *, size_t, size_t,
     int (^)(const void *, const void *));

void qsort_r(void *, size_t, size_t, void *,
     int (*)(void *, const void *, const void *));
int radixsort(const unsigned char **, int, const unsigned char *,
     unsigned);
void setprogname(const char *);
int sradixsort(const unsigned char **, int, const unsigned char *,
     unsigned);
void sranddev(void);
void srandomdev(void);
void *reallocf(void *, size_t);

long long
  strtoq(const char *, char **, int);
unsigned long long
  strtouq(const char *, char **, int);

extern char *suboptarg;
void *valloc(size_t);







# 34 "os_unix.h" 2
# 56 "os_unix.h"
# 1 "/usr/include/unistd.h" 1 3 4
# 72 "/usr/include/unistd.h" 3 4
# 1 "/usr/include/sys/unistd.h" 1 3 4
# 138 "/usr/include/sys/unistd.h" 3 4
struct accessx_descriptor {
 unsigned int ad_name_offset;
 int ad_flags;
 int ad_pad[2];
};
# 73 "/usr/include/unistd.h" 2 3 4
# 133 "/usr/include/unistd.h" 3 4
typedef __darwin_uuid_t uuid_t;
# 414 "/usr/include/unistd.h" 3 4


void _exit(int) __attribute__((__noreturn__));
int access(const char *, int);
unsigned int
  alarm(unsigned int);
int chdir(const char *);
int chown(const char *, uid_t, gid_t);
int close(int) __asm("_" "close" );
size_t confstr(int, char *, size_t) __asm("_" "confstr" );
char *crypt(const char *, const char *);
char *ctermid(char *);
int dup(int);
int dup2(int, int);

void encrypt(char *, int) __asm("_" "encrypt" );



int execl(const char *, const char *, ...);
int execle(const char *, const char *, ...);
int execlp(const char *, const char *, ...);
int execv(const char *, char * const *);
int execve(const char *, char * const *, char * const *);
int execvp(const char *, char * const *);
int fchown(int, uid_t, gid_t);
int fchdir(int);
pid_t fork(void);
long fpathconf(int, int);
int fsync(int) __asm("_" "fsync" );
int ftruncate(int, off_t);
char *getcwd(char *, size_t);
gid_t getegid(void);
uid_t geteuid(void);
gid_t getgid(void);



int getgroups(int, gid_t []);

long gethostid(void);
int gethostname(char *, size_t);
char *getlogin(void);
int getlogin_r(char *, size_t);
int getopt(int, char * const [], const char *) __asm("_" "getopt" );
pid_t getpgid(pid_t);
pid_t getpgrp(void);
pid_t getpid(void);
pid_t getppid(void);
pid_t getsid(pid_t);
uid_t getuid(void);
char *getwd(char *);
int isatty(int);
int lchown(const char *, uid_t, gid_t) __asm("_" "lchown" );
int link(const char *, const char *);
int lockf(int, int, off_t) __asm("_" "lockf" );
off_t lseek(int, off_t, int);
int nice(int) __asm("_" "nice" );
long pathconf(const char *, int);
int pause(void) __asm("_" "pause" );
int pipe(int [2]);
ssize_t pread(int, void *, size_t, off_t) __asm("_" "pread" );
ssize_t pwrite(int, const void *, size_t, off_t) __asm("_" "pwrite" );
ssize_t read(int, void *, size_t) __asm("_" "read" );
ssize_t readlink(const char * , char * , size_t);
int rmdir(const char *);
int setegid(gid_t);
int seteuid(uid_t);
int setgid(gid_t);
int setpgid(pid_t, pid_t);

pid_t setpgrp(void) __asm("_" "setpgrp" );



int setregid(gid_t, gid_t) __asm("_" "setregid" );
int setreuid(uid_t, uid_t) __asm("_" "setreuid" );
pid_t setsid(void);
int setuid(uid_t);
unsigned int
  sleep(unsigned int) __asm("_" "sleep" );
void swab(const void * , void * , ssize_t);
int symlink(const char *, const char *);
void sync(void);
long sysconf(int);
pid_t tcgetpgrp(int);
int tcsetpgrp(int, pid_t);
int truncate(const char *, off_t);
char *ttyname(int);

int ttyname_r(int, char *, size_t) __asm("_" "ttyname_r" );



useconds_t
  ualarm(useconds_t, useconds_t);
int unlink(const char *);
int usleep(useconds_t) __asm("_" "usleep" );
pid_t vfork(void);
ssize_t write(int, const void *, size_t) __asm("_" "write" );

extern char *optarg;
extern int optind, opterr, optopt;


# 1 "/usr/include/sys/select.h" 1 3 4
# 78 "/usr/include/sys/select.h" 3 4
# 1 "/usr/include/sys/_structs.h" 1 3 4
# 79 "/usr/include/sys/select.h" 2 3 4
# 134 "/usr/include/sys/select.h" 3 4



int pselect(int, fd_set * , fd_set * ,
  fd_set * , const struct timespec * ,
  const sigset_t * )




  __asm("_" "pselect" "$1050")




  ;


# 1 "/usr/include/sys/_select.h" 1 3 4
# 39 "/usr/include/sys/_select.h" 3 4
int select(int, fd_set * , fd_set * ,
  fd_set * , struct timeval * )




  __asm("_" "select" "$1050")




  ;
# 153 "/usr/include/sys/select.h" 2 3 4


# 520 "/usr/include/unistd.h" 2 3 4

void _Exit(int) __attribute__((__noreturn__));
int accessx_np(const struct accessx_descriptor *, size_t, int *, uid_t);
int acct(const char *);
int add_profil(char *, size_t, unsigned long, unsigned int);
void *brk(const void *);
int chroot(const char *);
void endusershell(void);
int execvP(const char *, const char *, char * const *);
char *fflagstostr(unsigned long);
int getdtablesize(void);
int getdomainname(char *, int);
int getgrouplist(const char *, int, int *, int *);
int gethostuuid(uuid_t, const struct timespec *);
mode_t getmode(const void *, mode_t);
int getpagesize(void) __attribute__((__const__));
char *getpass(const char *);
int getpeereid(int, uid_t *, gid_t *);
int getpgid(pid_t _pid);
int getsgroups_np(int *, uuid_t);
int getsid(pid_t _pid);
char *getusershell(void);
int getwgroups_np(int *, uuid_t);
int initgroups(const char *, int);
int iruserok(unsigned long, int, const char *, const char *);
int iruserok_sa(const void *, int, int, const char *, const char *);
int issetugid(void);
char *mkdtemp(char *);
int mknod(const char *, mode_t, dev_t);
int mkstemp(char *);
int mkstemps(char *, int);
char *mktemp(char *);
int nfssvc(int, void *);
int profil(char *, size_t, unsigned long, unsigned int);
int pthread_setugid_np(uid_t, gid_t);
int pthread_getugid_np( uid_t *, gid_t *);
int rcmd(char **, int, const char *, const char *, const char *, int *);
int rcmd_af(char **, int, const char *, const char *, const char *, int *,
  int);
int reboot(int);
int revoke(const char *);
int rresvport(int *);
int rresvport_af(int *, int);
int ruserok(const char *, int, const char *, const char *);
void *sbrk(int);
int setdomainname(const char *, int);
int setgroups(int, const gid_t *);
void sethostid(long);
int sethostname(const char *, int);

void setkey(const char *) __asm("_" "setkey" );



int setlogin(const char *);
void *setmode(const char *) __asm("_" "setmode" );
int setrgid(gid_t);
int setruid(uid_t);
int setsgroups_np(int, const uuid_t);
void setusershell(void);
int setwgroups_np(int, const uuid_t);
int strtofflags(char **, unsigned long *, unsigned long *);
int swapon(const char *);
int syscall(int, ...);
int ttyslot(void);
int undelete(const char *);
int unwhiteout(const char *);
void *valloc(size_t);

extern char *suboptarg;
int getsubopt(char **, char * const *, char **);



int fgetattrlist(int,void*,void*,size_t,unsigned int);
int fsetattrlist(int,void*,void*,size_t,unsigned int);
int getattrlist(const char*,void*,void*,size_t,unsigned int) __asm("_" "getattrlist" );
int setattrlist(const char*,void*,void*,size_t,unsigned int) __asm("_" "setattrlist" );
int exchangedata(const char*,const char*,unsigned int);
int getdirentriesattr(int,void*,void*,size_t,unsigned int*,unsigned int*,unsigned int*,unsigned int);
# 611 "/usr/include/unistd.h" 3 4
struct fssearchblock;
struct searchstate;

int searchfs(const char *, struct fssearchblock *, unsigned long *, unsigned int, unsigned int, struct searchstate *);
int fsctl(const char *,unsigned long,void*,unsigned int);
int ffsctl(int,unsigned long,void*,unsigned int);

extern int optreset;



# 57 "os_unix.h" 2



# 1 "/usr/include/libc.h" 1 3 4
# 31 "/usr/include/libc.h" 3 4
# 1 "/usr/include/standards.h" 1 3 4
# 32 "/usr/include/libc.h" 2 3 4






# 1 "/usr/include/string.h" 1 3 4
# 80 "/usr/include/string.h" 3 4

void *memchr(const void *, int, size_t);
int memcmp(const void *, const void *, size_t);
void *memcpy(void *, const void *, size_t);
void *memmove(void *, const void *, size_t);
void *memset(void *, int, size_t);

char *stpcpy(char *, const char *);
char *strcasestr(const char *, const char *);

char *strcat(char *, const char *);
char *strchr(const char *, int);
int strcmp(const char *, const char *);
int strcoll(const char *, const char *);
char *strcpy(char *, const char *);
size_t strcspn(const char *, const char *);
char *strerror(int) __asm("_" "strerror" );
int strerror_r(int, char *, size_t);
size_t strlen(const char *);
char *strncat(char *, const char *, size_t);
int strncmp(const char *, const char *, size_t);
char *strncpy(char *, const char *, size_t);

char *strnstr(const char *, const char *, size_t);

char *strpbrk(const char *, const char *);
char *strrchr(const char *, int);
size_t strspn(const char *, const char *);
char *strstr(const char *, const char *);
char *strtok(char *, const char *);
size_t strxfrm(char *, const char *, size_t);



void *memccpy(void *, const void *, int, size_t);
char *strtok_r(char *, const char *, char **);
char *strdup(const char *);

int bcmp(const void *, const void *, size_t);
void bcopy(const void *, void *, size_t);
void bzero(void *, size_t);
int ffs(int);
int ffsl(long);
int fls(int);
int flsl(long);
char *index(const char *, int);
void memset_pattern4(void *, const void *, size_t);
void memset_pattern8(void *, const void *, size_t);
void memset_pattern16(void *, const void *, size_t);
char *rindex(const char *, int);
int strcasecmp(const char *, const char *);
size_t strlcat(char *, const char *, size_t);
size_t strlcpy(char *, const char *, size_t);
void strmode(int, char *);
int strncasecmp(const char *, const char *, size_t);
char *strsep(char **, const char *);
char *strsignal(int sig);
void swab(const void * , void * , ssize_t);










# 1 "/usr/include/secure/_string.h" 1 3 4
# 55 "/usr/include/secure/_string.h" 3 4
static __inline void *
__inline_memcpy_chk (void *__dest, const void *__src, size_t __len)
{
  return __builtin___memcpy_chk (__dest, __src, __len, __builtin_object_size (__dest, 0));
}






static __inline void *
__inline_memmove_chk (void *__dest, const void *__src, size_t __len)
{
  return __builtin___memmove_chk (__dest, __src, __len, __builtin_object_size (__dest, 0));
}






static __inline void *
__inline_memset_chk (void *__dest, int __val, size_t __len)
{
  return __builtin___memset_chk (__dest, __val, __len, __builtin_object_size (__dest, 0));
}






static __inline char *
__inline_strcpy_chk (char * __dest, const char * __src)
{
  return __builtin___strcpy_chk (__dest, __src, __builtin_object_size (__dest, 1 > 1));
}







static __inline char *
__inline_stpcpy_chk (char *__dest, const char *__src)
{
  return __builtin___stpcpy_chk (__dest, __src, __builtin_object_size (__dest, 1 > 1));
}







static __inline char *
__inline_strncpy_chk (char * __dest, const char * __src,
        size_t __len)
{
  return __builtin___strncpy_chk (__dest, __src, __len, __builtin_object_size (__dest, 1 > 1));
}






static __inline char *
__inline_strcat_chk (char * __dest, const char * __src)
{
  return __builtin___strcat_chk (__dest, __src, __builtin_object_size (__dest, 1 > 1));
}






static __inline char *
__inline_strncat_chk (char * __dest, const char * __src,
        size_t __len)
{
  return __builtin___strncat_chk (__dest, __src, __len, __builtin_object_size (__dest, 1 > 1));
}
# 149 "/usr/include/string.h" 2 3 4
# 39 "/usr/include/libc.h" 2 3 4

# 1 "/usr/include/time.h" 1 3 4
# 69 "/usr/include/time.h" 3 4
# 1 "/usr/include/_structs.h" 1 3 4
# 24 "/usr/include/_structs.h" 3 4
# 1 "/usr/include/sys/_structs.h" 1 3 4
# 25 "/usr/include/_structs.h" 2 3 4
# 70 "/usr/include/time.h" 2 3 4
# 90 "/usr/include/time.h" 3 4
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
 char *tm_zone;
};
# 113 "/usr/include/time.h" 3 4
extern char *tzname[];


extern int getdate_err;

extern long timezone __asm("_" "timezone" );

extern int daylight;


char *asctime(const struct tm *);
clock_t clock(void) __asm("_" "clock" );
char *ctime(const time_t *);
double difftime(time_t, time_t);
struct tm *getdate(const char *);
struct tm *gmtime(const time_t *);
struct tm *localtime(const time_t *);
time_t mktime(struct tm *) __asm("_" "mktime" );
size_t strftime(char * , size_t, const char * , const struct tm * ) __asm("_" "strftime" );
char *strptime(const char * , const char * , struct tm * ) __asm("_" "strptime" );
time_t time(time_t *);


void tzset(void);



char *asctime_r(const struct tm * , char * );
char *ctime_r(const time_t *, char *);
struct tm *gmtime_r(const time_t * , struct tm * );
struct tm *localtime_r(const time_t * , struct tm * );


time_t posix2time(time_t);



void tzsetwall(void);
time_t time2posix(time_t);
time_t timelocal(struct tm * const);
time_t timegm(struct tm * const);



int nanosleep(const struct timespec *, struct timespec *) __asm("_" "nanosleep" );


# 41 "/usr/include/libc.h" 2 3 4
# 1 "/usr/lib/gcc/i686-apple-darwin10/4.2.1/include/stdarg.h" 1 3 4
# 43 "/usr/lib/gcc/i686-apple-darwin10/4.2.1/include/stdarg.h" 3 4
typedef __builtin_va_list __gnuc_va_list;
# 42 "/usr/include/libc.h" 2 3 4


# 1 "/usr/include/sys/param.h" 1 3 4
# 96 "/usr/include/sys/param.h" 3 4
# 1 "/usr/include/sys/syslimits.h" 1 3 4
# 97 "/usr/include/sys/param.h" 2 3 4
# 110 "/usr/include/sys/param.h" 3 4
# 1 "/usr/include/machine/param.h" 1 3 4
# 37 "/usr/include/machine/param.h" 3 4
# 1 "/usr/include/i386/param.h" 1 3 4
# 75 "/usr/include/i386/param.h" 3 4
# 1 "/usr/include/i386/_param.h" 1 3 4
# 76 "/usr/include/i386/param.h" 2 3 4
# 38 "/usr/include/machine/param.h" 2 3 4
# 111 "/usr/include/sys/param.h" 2 3 4


# 1 "/usr/lib/gcc/i686-apple-darwin10/4.2.1/include/limits.h" 1 3 4






# 1 "/usr/lib/gcc/i686-apple-darwin10/4.2.1/include/syslimits.h" 1 3 4
# 8 "/usr/lib/gcc/i686-apple-darwin10/4.2.1/include/limits.h" 2 3 4


# 1 "/usr/include/limits.h" 1 3 4
# 64 "/usr/include/limits.h" 3 4
# 1 "/usr/include/machine/limits.h" 1 3 4







# 1 "/usr/include/i386/limits.h" 1 3 4
# 40 "/usr/include/i386/limits.h" 3 4
# 1 "/usr/include/i386/_limits.h" 1 3 4
# 41 "/usr/include/i386/limits.h" 2 3 4
# 9 "/usr/include/machine/limits.h" 2 3 4
# 65 "/usr/include/limits.h" 2 3 4
# 11 "/usr/lib/gcc/i686-apple-darwin10/4.2.1/include/limits.h" 2 3 4
# 114 "/usr/include/sys/param.h" 2 3 4
# 45 "/usr/include/libc.h" 2 3 4
# 1 "/usr/include/sys/mount.h" 1 3 4
# 76 "/usr/include/sys/mount.h" 3 4
# 1 "/usr/include/sys/attr.h" 1 3 4
# 42 "/usr/include/sys/attr.h" 3 4
# 1 "/usr/include/sys/ucred.h" 1 3 4
# 76 "/usr/include/sys/ucred.h" 3 4
# 1 "/usr/include/bsm/audit.h" 1 3 4
# 168 "/usr/include/bsm/audit.h" 3 4


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
 u_int32_t at_addr[4];
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
 auditinfo_addr_t *as_aia_p;
 au_mask_t as_mask;
};
typedef struct au_session au_session_t;




typedef struct au_token token_t;
# 251 "/usr/include/bsm/audit.h" 3 4
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





int audit(const void *, int);
int auditon(int, void *, int);
int auditctl(const char *);
int getauid(au_id_t *);
int setauid(const au_id_t *);
int getaudit(struct auditinfo *);
int setaudit(const struct auditinfo *);
int getaudit_addr(struct auditinfo_addr *, int);
int setaudit_addr(const struct auditinfo_addr *, int);


# 1 "/usr/include/mach/port.h" 1 3 4
# 90 "/usr/include/mach/port.h" 3 4
# 1 "/usr/lib/gcc/i686-apple-darwin10/4.2.1/include/stdint.h" 1 3 4
# 40 "/usr/lib/gcc/i686-apple-darwin10/4.2.1/include/stdint.h" 3 4
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
# 97 "/usr/lib/gcc/i686-apple-darwin10/4.2.1/include/stdint.h" 3 4
typedef long int intmax_t;
# 106 "/usr/lib/gcc/i686-apple-darwin10/4.2.1/include/stdint.h" 3 4
typedef long unsigned int uintmax_t;
# 91 "/usr/include/mach/port.h" 2 3 4
# 1 "/usr/include/mach/boolean.h" 1 3 4
# 73 "/usr/include/mach/boolean.h" 3 4
# 1 "/usr/include/mach/machine/boolean.h" 1 3 4
# 35 "/usr/include/mach/machine/boolean.h" 3 4
# 1 "/usr/include/mach/i386/boolean.h" 1 3 4
# 69 "/usr/include/mach/i386/boolean.h" 3 4
typedef unsigned int boolean_t;
# 36 "/usr/include/mach/machine/boolean.h" 2 3 4
# 74 "/usr/include/mach/boolean.h" 2 3 4
# 92 "/usr/include/mach/port.h" 2 3 4
# 1 "/usr/include/mach/machine/vm_types.h" 1 3 4
# 35 "/usr/include/mach/machine/vm_types.h" 3 4
# 1 "/usr/include/mach/i386/vm_types.h" 1 3 4
# 73 "/usr/include/mach/i386/vm_types.h" 3 4
# 1 "/usr/include/mach/i386/vm_param.h" 1 3 4
# 74 "/usr/include/mach/i386/vm_types.h" 2 3 4
# 93 "/usr/include/mach/i386/vm_types.h" 3 4
typedef __darwin_natural_t natural_t;
typedef int integer_t;






typedef uintptr_t vm_offset_t;
# 112 "/usr/include/mach/i386/vm_types.h" 3 4
typedef uintptr_t vm_size_t;
# 124 "/usr/include/mach/i386/vm_types.h" 3 4
typedef uint64_t mach_vm_address_t;
typedef uint64_t mach_vm_offset_t;
typedef uint64_t mach_vm_size_t;

typedef uint64_t vm_map_offset_t;
typedef uint64_t vm_map_address_t;
typedef uint64_t vm_map_size_t;
# 36 "/usr/include/mach/machine/vm_types.h" 2 3 4
# 93 "/usr/include/mach/port.h" 2 3 4
# 106 "/usr/include/mach/port.h" 3 4
typedef natural_t mach_port_name_t;
typedef mach_port_name_t *mach_port_name_array_t;
# 128 "/usr/include/mach/port.h" 3 4
typedef mach_port_name_t mach_port_t;



typedef mach_port_t *mach_port_array_t;
# 190 "/usr/include/mach/port.h" 3 4
typedef natural_t mach_port_right_t;
# 200 "/usr/include/mach/port.h" 3 4
typedef natural_t mach_port_type_t;
typedef mach_port_type_t *mach_port_type_array_t;
# 233 "/usr/include/mach/port.h" 3 4
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
# 273 "/usr/include/mach/port.h" 3 4
typedef struct mach_port_limits {
 mach_port_msgcount_t mpl_qlimit;
} mach_port_limits_t;

typedef integer_t *mach_port_info_t;


typedef int mach_port_flavor_t;
# 295 "/usr/include/mach/port.h" 3 4
typedef struct mach_port_qos {
 unsigned int name:1;
 unsigned int prealloc:1;
 boolean_t pad1:30;
 natural_t len;
} mach_port_qos_t;
# 319 "/usr/include/bsm/audit.h" 2 3 4
mach_port_name_t audit_session_self(void);
au_asid_t audit_session_join(mach_port_name_t port);





# 77 "/usr/include/sys/ucred.h" 2 3 4

struct label;


# 1 "/usr/include/sys/queue.h" 1 3 4
# 82 "/usr/include/sys/ucred.h" 2 3 4







struct ucred {
 struct { struct ucred *tqe_next; struct ucred **tqe_prev; } cr_link;
 u_long cr_ref;





 uid_t cr_uid;
 uid_t cr_ruid;
 uid_t cr_svuid;
 short cr_ngroups;
 gid_t cr_groups[16];
 gid_t cr_rgid;
 gid_t cr_svgid;
 uid_t cr_gmuid;





 struct auditinfo cr_au;
 struct label *cr_label;

 int cr_flags;





 struct au_session cr_audit;
};


typedef struct ucred *kauth_cred_t;
# 136 "/usr/include/sys/ucred.h" 3 4
struct xucred {
        u_int cr_version;
        uid_t cr_uid;
        short cr_ngroups;
        gid_t cr_groups[16];
};
# 43 "/usr/include/sys/attr.h" 2 3 4
# 1 "/usr/include/sys/time.h" 1 3 4
# 77 "/usr/include/sys/time.h" 3 4
# 1 "/usr/include/sys/_structs.h" 1 3 4
# 78 "/usr/include/sys/time.h" 2 3 4
# 93 "/usr/include/sys/time.h" 3 4
struct itimerval {
 struct timeval it_interval;
 struct timeval it_value;
};
# 143 "/usr/include/sys/time.h" 3 4
struct timezone {
 int tz_minuteswest;
 int tz_dsttime;
};
# 186 "/usr/include/sys/time.h" 3 4
struct clockinfo {
 int hz;
 int tick;
 int tickadj;
 int stathz;
 int profhz;
};










int adjtime(const struct timeval *, struct timeval *);
int futimes(int, const struct timeval *);
int lutimes(const char *, const struct timeval *);
int settimeofday(const struct timeval *, const struct timezone *);


int getitimer(int, struct itimerval *);
int gettimeofday(struct timeval * , void * );



int setitimer(int, const struct itimerval * ,
  struct itimerval * );
int utimes(const char *, const struct timeval *);


# 44 "/usr/include/sys/attr.h" 2 3 4
# 59 "/usr/include/sys/attr.h" 3 4
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

typedef struct diskextent extentrecord[8];

typedef u_int32_t vol_capabilities_set_t[4];






typedef struct vol_capabilities_attr {
 vol_capabilities_set_t capabilities;
 vol_capabilities_set_t valid;
} vol_capabilities_attr_t;
# 304 "/usr/include/sys/attr.h" 3 4
typedef struct vol_attributes_attr {
 attribute_set_t validattr;
 attribute_set_t nativeattr;
} vol_attributes_attr_t;
# 426 "/usr/include/sys/attr.h" 3 4
struct fssearchblock {
 struct attrlist *returnattrs;
 void *returnbuffer;
 size_t returnbuffersize;
 u_long maxmatches;
 struct timeval timelimit;
 void *searchparams1;
 size_t sizeofsearchparams1;
 void *searchparams2;
 size_t sizeofsearchparams2;
 struct attrlist searchattrs;
};



struct searchstate {
 u_char reserved[556];
};
# 77 "/usr/include/sys/mount.h" 2 3 4






typedef struct fsid { int32_t val[2]; } fsid_t;
# 119 "/usr/include/sys/mount.h" 3 4
struct statfs64 { uint32_t f_bsize; int32_t f_iosize; uint64_t f_blocks; uint64_t f_bfree; uint64_t f_bavail; uint64_t f_files; uint64_t f_ffree; fsid_t f_fsid; uid_t f_owner; uint32_t f_type; uint32_t f_flags; uint32_t f_fssubtype; char f_fstypename[16]; char f_mntonname[1024]; char f_mntfromname[1024]; uint32_t f_reserved[8]; };





struct statfs { uint32_t f_bsize; int32_t f_iosize; uint64_t f_blocks; uint64_t f_bfree; uint64_t f_bavail; uint64_t f_files; uint64_t f_ffree; fsid_t f_fsid; uid_t f_owner; uint32_t f_type; uint32_t f_flags; uint32_t f_fssubtype; char f_fstypename[16]; char f_mntonname[1024]; char f_mntfromname[1024]; uint32_t f_reserved[8]; };
# 157 "/usr/include/sys/mount.h" 3 4
#pragma pack(4)

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
 char f_fstypename[16];
 char f_mntonname[1024];
 char f_mntfromname[1024];
 uint32_t f_fssubtype;
 void *f_reserved[2];
};

#pragma pack()
# 278 "/usr/include/sys/mount.h" 3 4
struct mount;
typedef struct mount * mount_t;
struct vnode;
typedef struct vnode * vnode_t;


struct vfsconf {
 uint32_t vfc_reserved1;
 char vfc_name[15];
 int vfc_typenum;
 int vfc_refcount;
 int vfc_flags;
 uint32_t vfc_reserved2;
 uint32_t vfc_reserved3;
};

struct vfsidctl {
 int vc_vers;
 fsid_t vc_fsid;
 void *vc_ptr;
 size_t vc_len;
 u_int32_t vc_spare[12];
};
# 318 "/usr/include/sys/mount.h" 3 4
struct vfsquery {
 u_int32_t vq_flags;
 u_int32_t vq_spare[31];
};
# 351 "/usr/include/sys/mount.h" 3 4
struct fhandle {
 int fh_len;
 unsigned char fh_data[128];
};
typedef struct fhandle fhandle_t;



int fhopen(const struct fhandle *, int);
int fstatfs(int, struct statfs *) __asm("_" "fstatfs" "$INODE64");

int fstatfs64(int, struct statfs64 *) __attribute__((deprecated,visibility("default")));

int getfh(const char *, fhandle_t *);
int getfsstat(struct statfs *, int, int) __asm("_" "getfsstat" "$INODE64");

int getfsstat64(struct statfs64 *, int, int) __attribute__((deprecated,visibility("default")));

int getmntinfo(struct statfs **, int) __asm("_" "getmntinfo" "$INODE64");

int getmntinfo64(struct statfs64 **, int) __attribute__((deprecated,visibility("default")));

int mount(const char *, const char *, int, void *);
int statfs(const char *, struct statfs *) __asm("_" "statfs" "$INODE64");

int statfs64(const char *, struct statfs64 *) __attribute__((deprecated,visibility("default")));

int unmount(const char *, int);
int getvfsbyname(const char *, struct vfsconf *);

# 46 "/usr/include/libc.h" 2 3 4



# 1 "/usr/include/sys/times.h" 1 3 4
# 85 "/usr/include/sys/times.h" 3 4
struct tms {
 clock_t tms_utime;
 clock_t tms_stime;
 clock_t tms_cutime;
 clock_t tms_cstime;
};


clock_t times(struct tms *);

# 50 "/usr/include/libc.h" 2 3 4

# 1 "/usr/include/signal.h" 1 3 4
# 71 "/usr/include/signal.h" 3 4
extern const char *const sys_signame[32];
extern const char *const sys_siglist[32];



int raise(int);




void (*bsd_signal(int, void (*)(int)))(int);
int kill(pid_t, int) __asm("_" "kill" );
int killpg(pid_t, int) __asm("_" "killpg" );
int pthread_kill(pthread_t, int);
int pthread_sigmask(int, const sigset_t *, sigset_t *) __asm("_" "pthread_sigmask" );
int sigaction(int, const struct sigaction * ,
     struct sigaction * );
int sigaddset(sigset_t *, int);
int sigaltstack(const stack_t * , stack_t * ) __asm("_" "sigaltstack" );
int sigdelset(sigset_t *, int);
int sigemptyset(sigset_t *);
int sigfillset(sigset_t *);
int sighold(int);
int sigignore(int);
int siginterrupt(int, int);
int sigismember(const sigset_t *, int);
int sigpause(int) __asm("_" "sigpause" );
int sigpending(sigset_t *);
int sigprocmask(int, const sigset_t * , sigset_t * );
int sigrelse(int);
void (*sigset(int, void (*)(int)))(int);
int sigsuspend(const sigset_t *) __asm("_" "sigsuspend" );
int sigwait(const sigset_t * , int * ) __asm("_" "sigwait" );

void psignal(unsigned int, const char *);
int sigblock(int);
int sigsetmask(int);
int sigvec(int, struct sigvec *, struct sigvec *);






static __inline int
__sigbits(int __signo)
{
    return __signo > 32 ? 0 : (1 << (__signo - 1));
}
# 52 "/usr/include/libc.h" 2 3 4


# 1 "/usr/include/sys/file.h" 1 3 4
# 69 "/usr/include/sys/file.h" 3 4
# 1 "/usr/include/sys/fcntl.h" 1 3 4
# 311 "/usr/include/sys/fcntl.h" 3 4
struct flock {
 off_t l_start;
 off_t l_len;
 pid_t l_pid;
 short l_type;
 short l_whence;
};
# 327 "/usr/include/sys/fcntl.h" 3 4
struct radvisory {
       off_t ra_offset;
       int ra_count;
};
# 339 "/usr/include/sys/fcntl.h" 3 4
typedef struct fsignatures {
 off_t fs_file_start;
 void *fs_blob_start;
 size_t fs_blob_size;
} fsignatures_t;
# 353 "/usr/include/sys/fcntl.h" 3 4
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
  void *fbt_buffer;
} fbootstraptransfer_t;
# 386 "/usr/include/sys/fcntl.h" 3 4
#pragma pack(4)

struct log2phys {
 unsigned int l2p_flags;
 off_t l2p_contigbytes;
 off_t l2p_devoffset;
};

#pragma pack()
# 409 "/usr/include/sys/fcntl.h" 3 4
typedef enum {
 FILESEC_OWNER = 1,
 FILESEC_GROUP = 2,
 FILESEC_UUID = 3,
 FILESEC_MODE = 4,
 FILESEC_ACL = 5,
 FILESEC_GRPUUID = 6,


 FILESEC_ACL_RAW = 100,
 FILESEC_ACL_ALLOCSIZE = 101
} filesec_property_t;






int open(const char *, int, ...) __asm("_" "open" );
int creat(const char *, mode_t) __asm("_" "creat" );
int fcntl(int, int, ...) __asm("_" "fcntl" );

int openx_np(const char *, int, filesec_t);
int flock(int, int);
filesec_t filesec_init(void);
filesec_t filesec_dup(filesec_t);
void filesec_free(filesec_t);
int filesec_get_property(filesec_t, filesec_property_t, void *);
int filesec_query_property(filesec_t, filesec_property_t, int *);
int filesec_set_property(filesec_t, filesec_property_t, const void *);
int filesec_unset_property(filesec_t, filesec_property_t);




# 70 "/usr/include/sys/file.h" 2 3 4
# 81 "/usr/include/sys/file.h" 3 4
#pragma pack(4)


struct extern_file {
 struct { struct extern_file *le_next; struct extern_file **le_prev; } f_list;
 short f_flag;
 short f_type;
 short f_count;
 short f_msgcount;
 kauth_cred_t f_cred;
 void * f_ops;
 off_t f_offset;
 caddr_t f_data;
};

#pragma pack()




# 55 "/usr/include/libc.h" 2 3 4
# 1 "/usr/include/sys/socket.h" 1 3 4
# 77 "/usr/include/sys/socket.h" 3 4
# 1 "/usr/include/machine/_param.h" 1 3 4
# 78 "/usr/include/sys/socket.h" 2 3 4
# 103 "/usr/include/sys/socket.h" 3 4
typedef __uint8_t sa_family_t;




typedef __darwin_socklen_t socklen_t;
# 128 "/usr/include/sys/socket.h" 3 4
struct iovec {
 void * iov_base;
 size_t iov_len;
};
# 213 "/usr/include/sys/socket.h" 3 4
struct linger {
 int l_onoff;
 int l_linger;
};
# 231 "/usr/include/sys/socket.h" 3 4
struct so_np_extensions {
 u_int32_t npx_flags;
 u_int32_t npx_mask;
};
# 316 "/usr/include/sys/socket.h" 3 4
struct sockaddr {
 __uint8_t sa_len;
 sa_family_t sa_family;
 char sa_data[14];
};
# 329 "/usr/include/sys/socket.h" 3 4
struct sockproto {
 __uint16_t sp_family;
 __uint16_t sp_protocol;
};
# 349 "/usr/include/sys/socket.h" 3 4
struct sockaddr_storage {
 __uint8_t ss_len;
 sa_family_t ss_family;
 char __ss_pad1[((sizeof(__int64_t)) - sizeof(__uint8_t) - sizeof(sa_family_t))];
 __int64_t __ss_align;
 char __ss_pad2[(128 - sizeof(__uint8_t) - sizeof(sa_family_t) - ((sizeof(__int64_t)) - sizeof(__uint8_t) - sizeof(sa_family_t)) - (sizeof(__int64_t)))];
};
# 456 "/usr/include/sys/socket.h" 3 4
struct msghdr {
 void *msg_name;
 socklen_t msg_namelen;
 struct iovec *msg_iov;
 int msg_iovlen;
 void *msg_control;
 socklen_t msg_controllen;
 int msg_flags;
};
# 494 "/usr/include/sys/socket.h" 3 4
struct cmsghdr {
 socklen_t cmsg_len;
 int cmsg_level;
 int cmsg_type;

};
# 583 "/usr/include/sys/socket.h" 3 4
struct sf_hdtr {
 struct iovec *headers;
 int hdr_cnt;
 struct iovec *trailers;
 int trl_cnt;
};





int accept(int, struct sockaddr * , socklen_t * )
  __asm("_" "accept" );
int bind(int, const struct sockaddr *, socklen_t) __asm("_" "bind" );
int connect(int, const struct sockaddr *, socklen_t) __asm("_" "connect" );
int getpeername(int, struct sockaddr * , socklen_t * )
  __asm("_" "getpeername" );
int getsockname(int, struct sockaddr * , socklen_t * )
  __asm("_" "getsockname" );
int getsockopt(int, int, int, void * , socklen_t * );
int listen(int, int) __asm("_" "listen" );
ssize_t recv(int, void *, size_t, int) __asm("_" "recv" );
ssize_t recvfrom(int, void *, size_t, int, struct sockaddr * ,
  socklen_t * ) __asm("_" "recvfrom" );
ssize_t recvmsg(int, struct msghdr *, int) __asm("_" "recvmsg" );
ssize_t send(int, const void *, size_t, int) __asm("_" "send" );
ssize_t sendmsg(int, const struct msghdr *, int) __asm("_" "sendmsg" );
ssize_t sendto(int, const void *, size_t,
  int, const struct sockaddr *, socklen_t) __asm("_" "sendto" );
int setsockopt(int, int, int, const void *, socklen_t);
int shutdown(int, int);
int sockatmark(int);
int socket(int, int, int);
int socketpair(int, int, int, int *) __asm("_" "socketpair" );


int sendfile(int, int, off_t, off_t *, struct sf_hdtr *, int);



void pfctlinput(int, struct sockaddr *);


# 56 "/usr/include/libc.h" 2 3 4
# 1 "/usr/include/sys/ioctl.h" 1 3 4
# 72 "/usr/include/sys/ioctl.h" 3 4
# 1 "/usr/include/sys/ttycom.h" 1 3 4
# 72 "/usr/include/sys/ttycom.h" 3 4
# 1 "/usr/include/sys/ioccom.h" 1 3 4
# 73 "/usr/include/sys/ttycom.h" 2 3 4
# 83 "/usr/include/sys/ttycom.h" 3 4
struct winsize {
 unsigned short ws_row;
 unsigned short ws_col;
 unsigned short ws_xpixel;
 unsigned short ws_ypixel;
};
# 73 "/usr/include/sys/ioctl.h" 2 3 4






struct ttysize {
 unsigned short ts_lines;
 unsigned short ts_cols;
 unsigned short ts_xxx;
 unsigned short ts_yyy;
};





# 1 "/usr/include/sys/filio.h" 1 3 4
# 91 "/usr/include/sys/ioctl.h" 2 3 4
# 1 "/usr/include/sys/sockio.h" 1 3 4
# 92 "/usr/include/sys/ioctl.h" 2 3 4





int ioctl(int, unsigned long, ...);

# 57 "/usr/include/libc.h" 2 3 4
# 1 "/usr/include/netinet/in.h" 1 3 4
# 304 "/usr/include/netinet/in.h" 3 4
struct in_addr {
 in_addr_t s_addr;
};
# 362 "/usr/include/netinet/in.h" 3 4
struct sockaddr_in {
 __uint8_t sin_len;
 sa_family_t sin_family;
 in_port_t sin_port;
 struct in_addr sin_addr;
 char sin_zero[8];
};
# 380 "/usr/include/netinet/in.h" 3 4
struct ip_opts {
 struct in_addr ip_dst;
 char ip_opts[40];
};
# 459 "/usr/include/netinet/in.h" 3 4
struct ip_mreq {
 struct in_addr imr_multiaddr;
 struct in_addr imr_interface;
};
# 511 "/usr/include/netinet/in.h" 3 4
# 1 "/usr/include/netinet6/in6.h" 1 3 4
# 158 "/usr/include/netinet6/in6.h" 3 4
struct in6_addr {
 union {
  __uint8_t __u6_addr8[16];
  __uint16_t __u6_addr16[8];
  __uint32_t __u6_addr32[4];
 } __u6_addr;
};
# 176 "/usr/include/netinet6/in6.h" 3 4
struct sockaddr_in6 {
 __uint8_t sin6_len;
 sa_family_t sin6_family;
 in_port_t sin6_port;
 __uint32_t sin6_flowinfo;
 struct in6_addr sin6_addr;
 __uint32_t sin6_scope_id;
};
# 209 "/usr/include/netinet6/in6.h" 3 4
extern const struct in6_addr in6addr_any;
extern const struct in6_addr in6addr_loopback;

extern const struct in6_addr in6addr_nodelocal_allnodes;
extern const struct in6_addr in6addr_linklocal_allnodes;
extern const struct in6_addr in6addr_linklocal_allrouters;
# 389 "/usr/include/netinet6/in6.h" 3 4
struct ipv6_mreq {
 struct in6_addr ipv6mr_multiaddr;
 unsigned int ipv6mr_interface;
};




struct in6_pktinfo {
 struct in6_addr ipi6_addr;
 unsigned int ipi6_ifindex;
};
# 471 "/usr/include/netinet6/in6.h" 3 4

struct cmsghdr;

extern int inet6_option_space(int);
extern int inet6_option_init(void *, struct cmsghdr **, int);
extern int inet6_option_append(struct cmsghdr *, const __uint8_t *,
 int, int);
extern __uint8_t *inet6_option_alloc(struct cmsghdr *, int, int, int);
extern int inet6_option_next(const struct cmsghdr *, __uint8_t **);
extern int inet6_option_find(const struct cmsghdr *, __uint8_t **, int);

extern size_t inet6_rthdr_space(int, int);
extern struct cmsghdr *inet6_rthdr_init(void *, int);
extern int inet6_rthdr_add(struct cmsghdr *, const struct in6_addr *,
  unsigned int);
extern int inet6_rthdr_lasthop(struct cmsghdr *, unsigned int);



extern int inet6_rthdr_segments(const struct cmsghdr *);
extern struct in6_addr *inet6_rthdr_getaddr(struct cmsghdr *, int);
extern int inet6_rthdr_getflags(const struct cmsghdr *, int);

extern int inet6_opt_init(void *, size_t);
extern int inet6_opt_append(void *, size_t, int, __uint8_t,
     size_t, __uint8_t, void **);
extern int inet6_opt_finish(void *, size_t, int);
extern int inet6_opt_set_val(void *, size_t, void *, int);

extern int inet6_opt_next(void *, size_t, int, __uint8_t *,
          size_t *, void **);
extern int inet6_opt_find(void *, size_t, int, __uint8_t,
     size_t *, void **);
extern int inet6_opt_get_val(void *, size_t, void *, int);
extern size_t inet6_rth_space(int, int);
extern void *inet6_rth_init(void *, int, int, int);
extern int inet6_rth_add(void *, const struct in6_addr *);
extern int inet6_rth_reverse(const void *, void *);
extern int inet6_rth_segments(const void *);
extern struct in6_addr *inet6_rth_getaddr(const void *, int);

# 512 "/usr/include/netinet/in.h" 2 3 4





int bindresvport(int, struct sockaddr_in *);
struct sockaddr;
int bindresvport_sa(int, struct sockaddr *);

# 58 "/usr/include/libc.h" 2 3 4
# 1 "/usr/include/arpa/inet.h" 1 3 4
# 95 "/usr/include/arpa/inet.h" 3 4


in_addr_t inet_addr(const char *);
char *inet_ntoa(struct in_addr);
const char *inet_ntop(int, const void *, char *, socklen_t);
int inet_pton(int, const char *, void *);

int ascii2addr(int, const char *, void *);
char *addr2ascii(int, const void *, int, char *);
int inet_aton(const char *, struct in_addr *);
in_addr_t inet_lnaof(struct in_addr);
struct in_addr inet_makeaddr(in_addr_t, in_addr_t);
in_addr_t inet_netof(struct in_addr);
in_addr_t inet_network(const char *);
char *inet_net_ntop(int, const void *, int, char *, __darwin_size_t);
int inet_net_pton(int, const char *, void *, __darwin_size_t);
char *inet_neta(in_addr_t, char *, __darwin_size_t);
unsigned int inet_nsap_addr(const char *, unsigned char *, int maxlen);
char *inet_nsap_ntoa(int, const unsigned char *, char *ascii);



# 59 "/usr/include/libc.h" 2 3 4


# 1 "/usr/include/mach/kern_return.h" 1 3 4
# 70 "/usr/include/mach/kern_return.h" 3 4
# 1 "/usr/include/mach/machine/kern_return.h" 1 3 4
# 35 "/usr/include/mach/machine/kern_return.h" 3 4
# 1 "/usr/include/mach/i386/kern_return.h" 1 3 4
# 71 "/usr/include/mach/i386/kern_return.h" 3 4
typedef int kern_return_t;
# 36 "/usr/include/mach/machine/kern_return.h" 2 3 4
# 71 "/usr/include/mach/kern_return.h" 2 3 4
# 62 "/usr/include/libc.h" 2 3 4

struct qelem {
        struct qelem *q_forw;
        struct qelem *q_back;
        char *q_data;
};




extern kern_return_t map_fd(int fd, vm_offset_t offset,
        vm_offset_t *addr, boolean_t find_space, vm_size_t numbytes);

# 61 "os_unix.h" 2
# 137 "os_unix.h"
# 1 "/usr/include/dirent.h" 1 3 4
# 65 "/usr/include/dirent.h" 3 4
# 1 "/usr/include/sys/dirent.h" 1 3 4
# 89 "/usr/include/sys/dirent.h" 3 4
#pragma pack(4)
# 101 "/usr/include/sys/dirent.h" 3 4
#pragma pack()
# 115 "/usr/include/sys/dirent.h" 3 4
struct dirent { __uint64_t d_ino; __uint64_t d_seekoff; __uint16_t d_reclen; __uint16_t d_namlen; __uint8_t d_type; char d_name[1024]; };
# 66 "/usr/include/dirent.h" 2 3 4


struct _telldir;


typedef struct {
 int __dd_fd;
 long __dd_loc;
 long __dd_size;
 char *__dd_buf;
 int __dd_len;
 long __dd_seek;
 long __dd_rewind;
 int __dd_flags;
 __darwin_pthread_mutex_t __dd_lock;
 struct _telldir *__dd_td;
} DIR;
# 102 "/usr/include/dirent.h" 3 4


int alphasort(const void *, const void *) __asm("_" "alphasort" "$INODE64");

int closedir(DIR *) __asm("_" "closedir" );

int getdirentries(int, char *, int, long *)





      __asm("_getdirentries_is_not_available_when_64_bit_inodes_are_in_effect")



;

DIR *opendir(const char *) __asm("_" "opendir" "$INODE64" );

DIR *__opendir2(const char *, int) __asm("_" "__opendir2" "$INODE64" );

struct dirent *readdir(DIR *) __asm("_" "readdir" "$INODE64");
int readdir_r(DIR *, struct dirent *, struct dirent **) __asm("_" "readdir_r" "$INODE64");
void rewinddir(DIR *) __asm("_" "rewinddir" "$INODE64" );

int scandir(const char *, struct dirent ***,
    int (*)(struct dirent *), int (*)(const void *, const void *)) __asm("_" "scandir" "$INODE64");

int scandir_b(const char *, struct dirent ***,
    int (^)(struct dirent *), int (^)(const void *, const void *)) __asm("_" "scandir_b" "$INODE64");


void seekdir(DIR *, long) __asm("_" "seekdir" "$INODE64" );
long telldir(DIR *) __asm("_" "telldir" "$INODE64" );

# 138 "os_unix.h" 2
# 188 "os_unix.h"
# 1 "/usr/include/errno.h" 1 3 4
# 23 "/usr/include/errno.h" 3 4
# 1 "/usr/include/sys/errno.h" 1 3 4
# 73 "/usr/include/sys/errno.h" 3 4

extern int * __error(void);


# 24 "/usr/include/errno.h" 2 3 4
# 189 "os_unix.h" 2



# 1 "/usr/include/pwd.h" 1 3 4
# 119 "/usr/include/pwd.h" 3 4
struct passwd {
 char *pw_name;
 char *pw_passwd;
 uid_t pw_uid;
 gid_t pw_gid;
 __darwin_time_t pw_change;
 char *pw_class;
 char *pw_gecos;
 char *pw_dir;
 char *pw_shell;
 __darwin_time_t pw_expire;
};




struct passwd *getpwuid(uid_t);
struct passwd *getpwnam(const char *);
int getpwuid_r(uid_t, struct passwd *, char *, size_t, struct passwd **);
int getpwnam_r(const char *, struct passwd *, char *, size_t, struct passwd **);
struct passwd *getpwent(void);

int setpassent(int);
char *user_from_uid(uid_t, int);

void setpwent(void);
void endpwent(void);

# 193 "os_unix.h" 2
# 526 "os_unix.h"
# 1 "/usr/include/setjmp.h" 1 3 4
# 26 "/usr/include/setjmp.h" 3 4
# 1 "/usr/include/machine/setjmp.h" 1 3 4
# 37 "/usr/include/machine/setjmp.h" 3 4
# 1 "/usr/include/i386/setjmp.h" 1 3 4
# 47 "/usr/include/i386/setjmp.h" 3 4
typedef int jmp_buf[((9 * 2) + 3 + 16)];
typedef int sigjmp_buf[((9 * 2) + 3 + 16) + 1];
# 65 "/usr/include/i386/setjmp.h" 3 4

int setjmp(jmp_buf);
void longjmp(jmp_buf, int);


int _setjmp(jmp_buf);
void _longjmp(jmp_buf, int);
int sigsetjmp(sigjmp_buf, int);
void siglongjmp(sigjmp_buf, int);



void longjmperror(void);


# 38 "/usr/include/machine/setjmp.h" 2 3 4
# 27 "/usr/include/setjmp.h" 2 3 4
# 527 "os_unix.h" 2
# 266 "vim.h" 2
# 335 "vim.h"
# 1 "os_mac.h" 1
# 50 "os_mac.h"
# 1 "/usr/include/curses.h" 1 3 4
# 66 "/usr/include/curses.h" 3 4
# 1 "/usr/include/ncurses_dll.h" 1 3 4
# 67 "/usr/include/curses.h" 2 3 4
# 136 "/usr/include/curses.h" 3 4
typedef unsigned int chtype;
typedef unsigned long mmask_t;



# 1 "/usr/include/unctrl.h" 1 3 4
# 54 "/usr/include/unctrl.h" 3 4
# 1 "/usr/include/curses.h" 1 3 4
# 55 "/usr/include/unctrl.h" 2 3 4


 char * unctrl (chtype);
# 142 "/usr/include/curses.h" 2 3 4
# 165 "/usr/include/curses.h" 3 4
typedef unsigned char NCURSES_BOOL;
# 175 "/usr/include/curses.h" 3 4
# 1 "/usr/lib/gcc/i686-apple-darwin10/4.2.1/include/stdbool.h" 1 3 4
# 176 "/usr/include/curses.h" 2 3 4
# 231 "/usr/include/curses.h" 3 4
extern chtype acs_map[];
# 321 "/usr/include/curses.h" 3 4
typedef struct screen SCREEN;
typedef struct _win_st WINDOW;

typedef chtype attr_t;
# 520 "/usr/include/curses.h" 3 4
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
extern int border (chtype,chtype,chtype,chtype,chtype,chtype,chtype,chtype);
extern int box (WINDOW *, chtype, chtype);
extern _Bool can_change_color (void);
extern int cbreak (void);
extern int chgat (int, attr_t, short, const void *);
extern int clear (void);
extern int clearok (WINDOW *,_Bool);
extern int clrtobot (void);
extern int clrtoeol (void);
extern int color_content (short,short*,short*,short*);
extern int color_set (short,void*);
extern int COLOR_PAIR (int);
extern int copywin (const WINDOW*,WINDOW*,int,int,int,int,int,int,int);
extern int curs_set (int);
extern int def_prog_mode (void);
extern int def_shell_mode (void);
extern int delay_output (int);
extern int delch (void);
extern void delscreen (SCREEN *);
extern int delwin (WINDOW *);
extern int deleteln (void);
extern WINDOW * derwin (WINDOW *,int,int,int,int);
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
extern int init_color (short,short,short,short);
extern int init_pair (short,short,short);
extern int innstr (char *, int);
extern int insch (chtype);
extern int insdelln (int);
extern int insertln (void);
extern int insnstr (const char *, int);
extern int insstr (const char *);
extern int instr (char *);
extern int intrflush (WINDOW *,_Bool);
extern _Bool isendwin (void);
extern _Bool is_linetouched (WINDOW *,int);
extern _Bool is_wintouched (WINDOW *);
extern char * keyname (int);
extern int keypad (WINDOW *,_Bool);
extern char killchar (void);
extern int leaveok (WINDOW *,_Bool);
extern char * longname (void);
extern int meta (WINDOW *,_Bool);
extern int move (int, int);
extern int mvaddch (int, int, const chtype);
extern int mvaddchnstr (int, int, const chtype *, int);
extern int mvaddchstr (int, int, const chtype *);
extern int mvaddnstr (int, int, const char *, int);
extern int mvaddstr (int, int, const char *);
extern int mvchgat (int, int, int, attr_t, short, const void *);
extern int mvcur (int,int,int,int);
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
extern int mvprintw (int,int, const char *,...)
  ;
extern int mvscanw (int,int, char *,...)
  ;
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
extern int mvwin (WINDOW *,int,int);
extern chtype mvwinch (WINDOW *, int, int);
extern int mvwinchnstr (WINDOW *, int, int, chtype *, int);
extern int mvwinchstr (WINDOW *, int, int, chtype *);
extern int mvwinnstr (WINDOW *, int, int, char *, int);
extern int mvwinsch (WINDOW *, int, int, chtype);
extern int mvwinsnstr (WINDOW *, int, int, const char *, int);
extern int mvwinsstr (WINDOW *, int, int, const char *);
extern int mvwinstr (WINDOW *, int, int, char *);
extern int mvwprintw (WINDOW*,int,int, const char *,...)
  ;
extern int mvwscanw (WINDOW *,int,int, char *,...)
  ;
extern int mvwvline (WINDOW *,int, int, chtype, int);
extern int napms (int);
extern WINDOW * newpad (int,int);
extern SCREEN * newterm ( char *,FILE *,FILE *);
extern WINDOW * newwin (int,int,int,int);
extern int nl (void);
extern int nocbreak (void);
extern int nodelay (WINDOW *,_Bool);
extern int noecho (void);
extern int nonl (void);
extern void noqiflush (void);
extern int noraw (void);
extern int notimeout (WINDOW *,_Bool);
extern int overlay (const WINDOW*,WINDOW *);
extern int overwrite (const WINDOW*,WINDOW *);
extern int pair_content (short,short*,short*);
extern int PAIR_NUMBER (int);
extern int pechochar (WINDOW *, const chtype);
extern int pnoutrefresh (WINDOW*,int,int,int,int,int,int);
extern int prefresh (WINDOW *,int,int,int,int,int,int);
extern int printw (const char *,...)
  ;
extern int putwin (WINDOW *, FILE *);
extern void qiflush (void);
extern int raw (void);
extern int redrawwin (WINDOW *);
extern int refresh (void);
extern int resetty (void);
extern int reset_prog_mode (void);
extern int reset_shell_mode (void);
extern int ripoffline (int, int (*)(WINDOW *, int));
extern int savetty (void);
extern int scanw ( char *,...)
  ;
extern int scr_dump (const char *);
extern int scr_init (const char *);
extern int scrl (int);
extern int scroll (WINDOW *);
extern int scrollok (WINDOW *,_Bool);
extern int scr_restore (const char *);
extern int scr_set (const char *);
extern int setscrreg (int,int);
extern SCREEN * set_term (SCREEN *);
extern int slk_attroff (const chtype);
extern int slk_attr_off (const attr_t, void *);
extern int slk_attron (const chtype);
extern int slk_attr_on (attr_t,void*);
extern int slk_attrset (const chtype);
extern attr_t slk_attr (void);
extern int slk_attr_set (const attr_t,short,void*);
extern int slk_clear (void);
extern int slk_color (short);
extern int slk_init (int);
extern char * slk_label (int);
extern int slk_noutrefresh (void);
extern int slk_refresh (void);
extern int slk_restore (void);
extern int slk_set (int,const char *,int);
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
extern int vidputs (chtype, int (*)(int));
extern int vline (chtype, int);
extern int vwprintw (WINDOW *, const char *,va_list);
extern int vw_printw (WINDOW *, const char *,va_list);
extern int vwscanw (WINDOW *, char *,va_list);
extern int vw_scanw (WINDOW *, char *,va_list);
extern int waddch (WINDOW *, const chtype);
extern int waddchnstr (WINDOW *,const chtype *,int);
extern int waddchstr (WINDOW *,const chtype *);
extern int waddnstr (WINDOW *,const char *,int);
extern int waddstr (WINDOW *,const char *);
extern int wattron (WINDOW *, int);
extern int wattroff (WINDOW *, int);
extern int wattrset (WINDOW *, int);
extern int wattr_get (WINDOW *, attr_t *, short *, void *);
extern int wattr_on (WINDOW *, attr_t, void *);
extern int wattr_off (WINDOW *, attr_t, void *);
extern int wattr_set (WINDOW *, attr_t, short, void *);
extern int wbkgd (WINDOW *, chtype);
extern void wbkgdset (WINDOW *,chtype);
extern int wborder (WINDOW *,chtype,chtype,chtype,chtype,chtype,chtype,chtype,chtype);
extern int wchgat (WINDOW *, int, attr_t, short, const void *);
extern int wclear (WINDOW *);
extern int wclrtobot (WINDOW *);
extern int wclrtoeol (WINDOW *);
extern int wcolor_set (WINDOW*,short,void*);
extern void wcursyncup (WINDOW *);
extern int wdelch (WINDOW *);
extern int wdeleteln (WINDOW *);
extern int wechochar (WINDOW *, const chtype);
extern int werase (WINDOW *);
extern int wgetch (WINDOW *);
extern int wgetnstr (WINDOW *,char *,int);
extern int wgetstr (WINDOW *, char *);
extern int whline (WINDOW *, chtype, int);
extern chtype winch (WINDOW *);
extern int winchnstr (WINDOW *, chtype *, int);
extern int winchstr (WINDOW *, chtype *);
extern int winnstr (WINDOW *, char *, int);
extern int winsch (WINDOW *, chtype);
extern int winsdelln (WINDOW *,int);
extern int winsertln (WINDOW *);
extern int winsnstr (WINDOW *, const char *,int);
extern int winsstr (WINDOW *, const char *);
extern int winstr (WINDOW *, char *);
extern int wmove (WINDOW *,int,int);
extern int wnoutrefresh (WINDOW *);
extern int wprintw (WINDOW *, const char *,...)
  ;
extern int wredrawln (WINDOW *,int,int);
extern int wrefresh (WINDOW *);
extern int wscanw (WINDOW *, char *,...)
  ;
extern int wscrl (WINDOW *,int);
extern int wsetscrreg (WINDOW *,int,int);
extern int wstandout (WINDOW *);
extern int wstandend (WINDOW *);
extern void wsyncdown (WINDOW *);
extern void wsyncup (WINDOW *);
extern void wtimeout (WINDOW *,int);
extern int wtouchln (WINDOW *,int,int,int);
extern int wvline (WINDOW *,chtype,int);




extern int tigetflag ( char *);
extern int tigetnum ( char *);
extern char * tigetstr ( char *);
extern int putp (const char *);


extern char * tparm ( char *, ...);
# 811 "/usr/include/curses.h" 3 4
extern int getattrs (const WINDOW *);
extern int getcurx (const WINDOW *);
extern int getcury (const WINDOW *);
extern int getbegx (const WINDOW *);
extern int getbegy (const WINDOW *);
extern int getmaxx (const WINDOW *);
extern int getmaxy (const WINDOW *);
extern int getparx (const WINDOW *);
extern int getpary (const WINDOW *);
# 834 "/usr/include/curses.h" 3 4
typedef int (*NCURSES_WINDOW_CB)(WINDOW *, void *);
typedef int (*NCURSES_SCREEN_CB)(SCREEN *, void *);
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
extern void nofilter(void);





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
# 1202 "/usr/include/curses.h" 3 4
extern WINDOW * curscr;
extern WINDOW * newscr;
extern WINDOW * stdscr;
extern char ttytype[];
extern int COLORS;
extern int COLOR_PAIRS;
extern int COLS;
extern int ESCDELAY;
extern int LINES;
extern int TABSIZE;
# 1667 "/usr/include/curses.h" 3 4
typedef struct
{
    short id;
    int x, y, z;
    mmask_t bstate;
}
MEVENT;

extern int getmouse (MEVENT *);
extern int ungetmouse (MEVENT *);
extern mmask_t mousemask (mmask_t, mmask_t *);
extern _Bool wenclose (const WINDOW *, int, int);
extern int mouseinterval (int);
extern _Bool wmouse_trafo (const WINDOW*, int*, int*, _Bool);
extern _Bool mouse_trafo (int*, int*, _Bool);





extern int mcprint (char *, int);
extern int has_key (int);



extern void _tracef (const char *, ...) ;
extern void _tracedump (const char *, WINDOW *);
extern char * _traceattr (attr_t);
extern char * _traceattr2 (int, chtype);
extern char * _nc_tracebits (void);
extern char * _tracechar (int);
extern char * _tracechtype (chtype);
extern char * _tracechtype2 (int, chtype);
# 1709 "/usr/include/curses.h" 3 4
extern char * _tracemouse (const MEVENT *);
extern void trace (const unsigned int);
# 51 "os_mac.h" 2






# 1 "/usr/include/errno.h" 1 3 4
# 58 "os_mac.h" 2
# 336 "vim.h" 2
# 354 "vim.h"
# 1 "/usr/include/locale.h" 1 3 4
# 40 "/usr/include/locale.h" 3 4
# 1 "/usr/include/_locale.h" 1 3 4
# 43 "/usr/include/_locale.h" 3 4
struct lconv {
 char *decimal_point;
 char *thousands_sep;
 char *grouping;
 char *int_curr_symbol;
 char *currency_symbol;
 char *mon_decimal_point;
 char *mon_thousands_sep;
 char *mon_grouping;
 char *positive_sign;
 char *negative_sign;
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






struct lconv *localeconv(void);

# 41 "/usr/include/locale.h" 2 3 4
# 52 "/usr/include/locale.h" 3 4

char *setlocale(int, const char *);

# 355 "vim.h" 2
# 388 "vim.h"
typedef unsigned char char_u;
typedef unsigned short short_u;
typedef unsigned int int_u;
# 409 "vim.h"
typedef unsigned long long_u;
typedef long long_i;
# 430 "vim.h"
typedef char_u schar_T;

typedef unsigned short sattr_T;
# 462 "vim.h"
# 1 "ascii.h" 1
# 463 "vim.h" 2
# 1 "keymap.h" 1
# 139 "keymap.h"
enum key_extra
{
    KE_NAME = 3

    , KE_S_UP
    , KE_S_DOWN

    , KE_S_F1
    , KE_S_F2
    , KE_S_F3
    , KE_S_F4
    , KE_S_F5
    , KE_S_F6
    , KE_S_F7
    , KE_S_F8
    , KE_S_F9
    , KE_S_F10

    , KE_S_F11
    , KE_S_F12
    , KE_S_F13
    , KE_S_F14
    , KE_S_F15
    , KE_S_F16
    , KE_S_F17
    , KE_S_F18
    , KE_S_F19
    , KE_S_F20

    , KE_S_F21
    , KE_S_F22
    , KE_S_F23
    , KE_S_F24
    , KE_S_F25
    , KE_S_F26
    , KE_S_F27
    , KE_S_F28
    , KE_S_F29
    , KE_S_F30

    , KE_S_F31
    , KE_S_F32
    , KE_S_F33
    , KE_S_F34
    , KE_S_F35
    , KE_S_F36
    , KE_S_F37

    , KE_MOUSE





    , KE_LEFTMOUSE
    , KE_LEFTDRAG
    , KE_LEFTRELEASE
    , KE_MIDDLEMOUSE
    , KE_MIDDLEDRAG
    , KE_MIDDLERELEASE
    , KE_RIGHTMOUSE
    , KE_RIGHTDRAG
    , KE_RIGHTRELEASE

    , KE_IGNORE

    , KE_TAB
    , KE_S_TAB_OLD

    , KE_SNIFF

    , KE_XF1
    , KE_XF2
    , KE_XF3
    , KE_XF4
    , KE_XEND
    , KE_ZEND
    , KE_XHOME
    , KE_ZHOME
    , KE_XUP
    , KE_XDOWN
    , KE_XLEFT
    , KE_XRIGHT

    , KE_LEFTMOUSE_NM
    , KE_LEFTRELEASE_NM

    , KE_S_XF1
    , KE_S_XF2
    , KE_S_XF3
    , KE_S_XF4




    , KE_MOUSEDOWN
    , KE_MOUSEUP
    , KE_MOUSELEFT
    , KE_MOUSERIGHT

    , KE_KINS
    , KE_KDEL

    , KE_CSI
    , KE_SNR
    , KE_PLUG
    , KE_CMDWIN

    , KE_C_LEFT
    , KE_C_RIGHT
    , KE_C_HOME
    , KE_C_END

    , KE_X1MOUSE
    , KE_X1DRAG
    , KE_X1RELEASE
    , KE_X2MOUSE
    , KE_X2DRAG
    , KE_X2RELEASE

    , KE_DROP
    , KE_CURSORHOLD
    , KE_NOP
    , KE_FOCUSGAINED
    , KE_FOCUSLOST
};
# 464 "vim.h" 2
# 1 "term.h" 1
# 26 "term.h"
enum SpecialKey
{
    KS_NAME = 0,
    KS_CE,
    KS_AL,
    KS_CAL,
    KS_DL,
    KS_CDL,
    KS_CS,
    KS_CL,
    KS_CD,
    KS_UT,
    KS_DA,
    KS_DB,
    KS_VI,
    KS_VE,
    KS_VS,
    KS_ME,
    KS_MR,
    KS_MD,
    KS_SE,
    KS_SO,
    KS_CZH,
    KS_CZR,
    KS_UE,
    KS_US,
    KS_UCE,
    KS_UCS,
    KS_MS,
    KS_CM,
    KS_SR,
    KS_CRI,
    KS_VB,
    KS_KS,
    KS_KE,
    KS_TI,
    KS_TE,
    KS_BC,
    KS_CCS,
    KS_CCO,
    KS_CSF,
    KS_CSB,
    KS_XS,
    KS_MB,
    KS_CAF,
    KS_CAB,
    KS_LE,
    KS_ND,
    KS_CIS,
    KS_CIE,
    KS_TS,
    KS_FS,
    KS_CWP,
    KS_CWS,
    KS_CRV,
    KS_CSI,
    KS_CEI,

    KS_CSV,

    KS_OP
};
# 99 "term.h"
extern char_u *(term_strings[]);
# 465 "vim.h" 2
# 1 "macros.h" 1
# 466 "vim.h" 2
# 499 "vim.h"
# 1 "/usr/include/assert.h" 1 3 4
# 75 "/usr/include/assert.h" 3 4

void __assert_rtn(const char *, const char *, int, const char *) __attribute__((__noreturn__));
void __eprintf(const char *, const char *, unsigned, const char *) __attribute__((__noreturn__));

# 500 "vim.h" 2





# 1 "/usr/include/inttypes.h" 1 3 4
# 265 "/usr/include/inttypes.h" 3 4



  extern intmax_t imaxabs(intmax_t j);


  typedef struct {
        intmax_t quot;
        intmax_t rem;
  } imaxdiv_t;

  extern imaxdiv_t imaxdiv(intmax_t numer, intmax_t denom);


  extern intmax_t strtoimax(const char * nptr, char ** endptr, int base);
  extern uintmax_t strtoumax(const char * nptr, char ** endptr, int base);
# 290 "/usr/include/inttypes.h" 3 4
  extern intmax_t wcstoimax(const wchar_t * nptr, wchar_t ** endptr, int base);
  extern uintmax_t wcstoumax(const wchar_t * nptr, wchar_t ** endptr, int base);







# 506 "vim.h" 2


# 1 "/usr/include/wctype.h" 1 3 4
# 39 "/usr/include/wctype.h" 3 4
typedef __darwin_wctrans_t wctrans_t;
# 53 "/usr/include/wctype.h" 3 4
# 1 "/usr/include/_wctype.h" 1 3 4
# 52 "/usr/include/_wctype.h" 3 4
typedef __darwin_wctype_t wctype_t;
# 71 "/usr/include/_wctype.h" 3 4
static __inline int
iswalnum(wint_t _wc)
{
 return (__istype(_wc, 0x00000100L|0x00000400L));
}

static __inline int
iswalpha(wint_t _wc)
{
 return (__istype(_wc, 0x00000100L));
}

static __inline int
iswcntrl(wint_t _wc)
{
 return (__istype(_wc, 0x00000200L));
}

static __inline int
iswctype(wint_t _wc, wctype_t _charclass)
{
 return (__istype(_wc, _charclass));
}

static __inline int
iswdigit(wint_t _wc)
{
 return (__isctype(_wc, 0x00000400L));
}

static __inline int
iswgraph(wint_t _wc)
{
 return (__istype(_wc, 0x00000800L));
}

static __inline int
iswlower(wint_t _wc)
{
 return (__istype(_wc, 0x00001000L));
}

static __inline int
iswprint(wint_t _wc)
{
 return (__istype(_wc, 0x00040000L));
}

static __inline int
iswpunct(wint_t _wc)
{
 return (__istype(_wc, 0x00002000L));
}

static __inline int
iswspace(wint_t _wc)
{
 return (__istype(_wc, 0x00004000L));
}

static __inline int
iswupper(wint_t _wc)
{
 return (__istype(_wc, 0x00008000L));
}

static __inline int
iswxdigit(wint_t _wc)
{
 return (__isctype(_wc, 0x00010000L));
}

static __inline wint_t
towlower(wint_t _wc)
{
        return (__tolower(_wc));
}

static __inline wint_t
towupper(wint_t _wc)
{
        return (__toupper(_wc));
}
# 176 "/usr/include/_wctype.h" 3 4

wctype_t
 wctype(const char *);

# 54 "/usr/include/wctype.h" 2 3 4
# 62 "/usr/include/wctype.h" 3 4
static __inline int
iswblank(wint_t _wc)
{
 return (__istype(_wc, 0x00020000L));
}


static __inline int
iswascii(wint_t _wc)
{
 return ((_wc & ~0x7F) == 0);
}

static __inline int
iswhexnumber(wint_t _wc)
{
 return (__istype(_wc, 0x00010000L));
}

static __inline int
iswideogram(wint_t _wc)
{
 return (__istype(_wc, 0x00080000L));
}

static __inline int
iswnumber(wint_t _wc)
{
 return (__istype(_wc, 0x00000400L));
}

static __inline int
iswphonogram(wint_t _wc)
{
 return (__istype(_wc, 0x00200000L));
}

static __inline int
iswrune(wint_t _wc)
{
 return (__istype(_wc, 0xFFFFFFF0L));
}

static __inline int
iswspecial(wint_t _wc)
{
 return (__istype(_wc, 0x00100000L));
}
# 130 "/usr/include/wctype.h" 3 4


wint_t nextwctype(wint_t, wctype_t);

wint_t towctrans(wint_t, wctrans_t);
wctrans_t
 wctrans(const char *);

# 509 "vim.h" 2
# 1207 "vim.h"
enum auto_event
{
    EVENT_BUFADD = 0,
    EVENT_BUFNEW,
    EVENT_BUFDELETE,
    EVENT_BUFWIPEOUT,
    EVENT_BUFENTER,
    EVENT_BUFFILEPOST,
    EVENT_BUFFILEPRE,
    EVENT_BUFLEAVE,
    EVENT_BUFNEWFILE,
    EVENT_BUFREADPOST,
    EVENT_BUFREADPRE,
    EVENT_BUFREADCMD,
    EVENT_BUFUNLOAD,
    EVENT_BUFHIDDEN,
    EVENT_BUFWINENTER,
    EVENT_BUFWINLEAVE,
    EVENT_BUFWRITEPOST,
    EVENT_BUFWRITEPRE,
    EVENT_BUFWRITECMD,
    EVENT_CMDWINENTER,
    EVENT_CMDWINLEAVE,
    EVENT_COLORSCHEME,
    EVENT_FILEAPPENDPOST,
    EVENT_FILEAPPENDPRE,
    EVENT_FILEAPPENDCMD,
    EVENT_FILECHANGEDSHELL,
    EVENT_FILECHANGEDSHELLPOST,
    EVENT_FILECHANGEDRO,
    EVENT_FILEREADPOST,
    EVENT_FILEREADPRE,
    EVENT_FILEREADCMD,
    EVENT_FILETYPE,
    EVENT_FILEWRITEPOST,
    EVENT_FILEWRITEPRE,
    EVENT_FILEWRITECMD,
    EVENT_FILTERREADPOST,
    EVENT_FILTERREADPRE,
    EVENT_FILTERWRITEPOST,
    EVENT_FILTERWRITEPRE,
    EVENT_FOCUSGAINED,
    EVENT_FOCUSLOST,
    EVENT_GUIENTER,
    EVENT_GUIFAILED,
    EVENT_INSERTCHANGE,
    EVENT_INSERTENTER,
    EVENT_INSERTLEAVE,
    EVENT_MENUPOPUP,
    EVENT_QUICKFIXCMDPOST,
    EVENT_QUICKFIXCMDPRE,
    EVENT_SESSIONLOADPOST,
    EVENT_STDINREADPOST,
    EVENT_STDINREADPRE,
    EVENT_SYNTAX,
    EVENT_TERMCHANGED,
    EVENT_TERMRESPONSE,
    EVENT_USER,
    EVENT_VIMENTER,
    EVENT_VIMLEAVE,
    EVENT_VIMLEAVEPRE,
    EVENT_VIMRESIZED,
    EVENT_WINENTER,
    EVENT_WINLEAVE,
    EVENT_ENCODINGCHANGED,
    EVENT_CURSORHOLD,
    EVENT_CURSORHOLDI,
    EVENT_FUNCUNDEFINED,
    EVENT_REMOTEREPLY,
    EVENT_SWAPEXISTS,
    EVENT_SOURCEPRE,
    EVENT_SOURCECMD,
    EVENT_SPELLFILEMISSING,
    EVENT_CURSORMOVED,
    EVENT_CURSORMOVEDI,
    EVENT_TABLEAVE,
    EVENT_TABENTER,
    EVENT_SHELLCMDPOST,
    EVENT_SHELLFILTERPOST,
    NUM_EVENTS
};

typedef enum auto_event event_T;






typedef enum
{
    HLF_8 = 0

    , HLF_AT

    , HLF_D
    , HLF_E
    , HLF_H
    , HLF_I
    , HLF_L
    , HLF_M
    , HLF_CM
    , HLF_N
    , HLF_R
    , HLF_S
    , HLF_SNC
    , HLF_C
    , HLF_T
    , HLF_V
    , HLF_VNC
    , HLF_W
    , HLF_WM
    , HLF_FL
    , HLF_FC
    , HLF_ADD
    , HLF_CHD
    , HLF_DED
    , HLF_TXD
    , HLF_CONCEAL
    , HLF_SC
    , HLF_SPB
    , HLF_SPC
    , HLF_SPR
    , HLF_SPL
    , HLF_PNI
    , HLF_PSI
    , HLF_PSB
    , HLF_PST
    , HLF_TP
    , HLF_TPS
    , HLF_TPF
    , HLF_CUC
    , HLF_CUL
    , HLF_MC
    , HLF_COUNT
} hlf_T;
# 1363 "vim.h"
typedef uint32_t UINT32_T;
# 1451 "vim.h"
# 1 "/usr/include/fcntl.h" 1 3 4
# 1452 "vim.h" 2
# 1561 "vim.h"
typedef long linenr_T;
typedef int colnr_T;
typedef unsigned short disptick_T;
# 1589 "vim.h"
typedef void *vim_acl_T;
# 1692 "vim.h"
typedef struct timeval proftime_T;







# 1 "option.h" 1
# 310 "option.h"
extern int p_acd;







extern int p_ar;
extern int p_aw;
extern int p_awa;
extern char_u *p_bs;
extern char_u *p_bg;
extern int p_bk;
extern char_u *p_bkc;
extern unsigned bkc_flags;
# 334 "option.h"
extern char_u *p_bdir;
extern char_u *p_bex;

extern char_u *p_bsk;


extern char_u *p_cm;
# 357 "option.h"
extern char_u *p_breakat;
# 376 "option.h"
extern char_u *p_cedit;
extern long p_cwh;


extern char_u *p_cb;

extern long p_ch;

extern int p_confirm;

extern int p_cp;

extern char_u *p_cot;
extern long p_ph;

extern char_u *p_cpo;
# 404 "option.h"
extern char_u *p_debug;

extern char_u *p_def;
extern char_u *p_inc;


extern char_u *p_dip;

extern char_u *p_dex;



extern char_u *p_dict;


extern int p_dg;

extern char_u *p_dir;
extern char_u *p_dy;
extern unsigned dy_flags;





extern int p_ed;

extern char_u *p_ead;

extern int p_ea;
extern char_u *p_ep;
extern int p_eb;

extern char_u *p_ef;
extern char_u *p_efm;
extern char_u *p_gefm;
extern char_u *p_gp;


extern char_u *p_ei;

extern int p_ek;
extern int p_exrc;



extern char_u *p_ffs;

extern char_u *p_fcl;
extern long p_fdls;
extern char_u *p_fdo;
extern unsigned fdo_flags;
# 473 "option.h"
extern char_u *p_fp;

extern int p_fs;

extern int p_gd;

extern char_u *p_pdev;

extern char_u *p_penc;
extern char_u *p_pexpr;





extern char_u *p_pfn;
extern char_u *p_popt;
extern char_u *p_header;

extern int p_prompt;
# 507 "option.h"
extern char_u *p_guicursor;
# 519 "option.h"
extern char_u *p_hf;

extern long p_hh;


extern char_u *p_hlg;

extern int p_hid;







extern char_u *p_hl;
extern int p_hls;
extern long p_hi;
# 549 "option.h"
extern int p_icon;
extern char_u *p_iconstring;

extern int p_ic;







extern int p_is;
extern int p_im;
extern char_u *p_isf;
extern char_u *p_isi;
extern char_u *p_isp;
extern int p_js;
extern char_u *p_kp;

extern char_u *p_km;





extern char_u *p_lm;





extern char_u *p_lispwords;


extern long p_ls;
extern long p_stal;

extern char_u *p_lcs;

extern int p_lz;
extern int p_lpl;



extern int p_magic;

extern char_u *p_mef;
extern char_u *p_mp;


extern char_u *p_cc;
extern int p_cc_cols[256];

extern long p_mat;




extern long p_mfd;

extern long p_mmd;
extern long p_mm;
extern long p_mmp;
extern long p_mmt;

extern long p_mis;


extern char_u *p_msm;

extern long p_mls;
extern char_u *p_mouse;




extern char_u *p_mousem;
extern long p_mouset;
extern int p_more;






extern char_u *p_opfunc;
extern char_u *p_para;
extern int p_paste;
extern char_u *p_pt;

extern char_u *p_pex;

extern char_u *p_pm;
extern char_u *p_path;

extern char_u *p_cdpath;


extern long p_rdt;

extern int p_remap;
extern long p_report;

extern long p_pvh;
# 662 "option.h"
extern int p_ru;


extern char_u *p_ruf;

extern char_u *p_rtp;
extern long p_sj;
extern long p_so;

extern char_u *p_sbo;

extern char_u *p_sections;
extern int p_secure;

extern char_u *p_sel;
extern char_u *p_slm;


extern char_u *p_ssop;
extern unsigned ssop_flags;
# 705 "option.h"
extern char_u *p_sh;
extern char_u *p_shcf;

extern char_u *p_sp;

extern char_u *p_shq;
extern char_u *p_sxq;
extern char_u *p_srr;



extern int p_stmp;




extern char_u *p_stl;

extern int p_sr;
extern char_u *p_shm;

extern char_u *p_sbr;


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

extern char_u *p_tal;



extern char_u *p_sps;


extern int p_spr;

extern int p_sol;
extern char_u *p_su;
extern char_u *p_sws;
extern char_u *p_swb;
extern unsigned swb_flags;







extern int p_tbs;
extern long p_tl;
extern int p_tr;
extern char_u *p_tags;
extern int p_tgst;






extern int p_terse;
extern int p_ta;
extern int p_to;
extern int p_timeout;
extern long p_tm;

extern int p_title;
extern long p_titlelen;
extern char_u *p_titleold;
extern char_u *p_titlestring;


extern char_u *p_tsr;

extern int p_ttimeout;
extern long p_ttm;
extern int p_tbi;
extern int p_tf;
# 814 "option.h"
extern long p_ttyscroll;

extern char_u *p_ttym;
extern unsigned ttym_flags;
# 828 "option.h"
extern char_u *p_udir;
extern long p_ul;
extern long p_ur;
extern long p_uc;
extern long p_ut;

extern char_u *p_fcs;


extern char_u *p_viminfo;


extern char_u *p_vdir;
extern char_u *p_vop;
extern unsigned vop_flags;

extern int p_vb;

extern char_u *p_ve;
extern unsigned ve_flags;
# 856 "option.h"
extern long p_verbose;
extern char_u *p_vfile;
extern int p_warn;

extern char_u *p_wop;

extern long p_window;






extern char_u *p_wig;

extern int p_wiv;
extern char_u *p_ww;
extern long p_wc;
extern long p_wcm;
extern char_u *p_wim;

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






enum
{
    BV_AI = 0
    , BV_AR

    , BV_BH
    , BV_BT
    , BV_EFM
    , BV_GP
    , BV_MP

    , BV_BIN
    , BV_BL



    , BV_CI

    , BV_CIN
    , BV_CINK
    , BV_CINO


    , BV_CINW

    , BV_CM

    , BV_CMS


    , BV_COM


    , BV_CPT
    , BV_DICT
    , BV_TSR


    , BV_CFU


    , BV_DEF
    , BV_INC

    , BV_EOL
    , BV_EP
    , BV_ET
    , BV_FENC

    , BV_BEXPR
    , BV_FEX

    , BV_FF
    , BV_FLP
    , BV_FO

    , BV_FT

    , BV_IMI
    , BV_IMS

    , BV_INDE
    , BV_INDK


    , BV_INEX

    , BV_INF
    , BV_ISK

    , BV_KEY




    , BV_KP

    , BV_LISP

    , BV_MA
    , BV_ML
    , BV_MOD
    , BV_MPS
    , BV_NF




    , BV_OFU

    , BV_PATH
    , BV_PI

    , BV_QE

    , BV_RO

    , BV_SI


    , BV_SN


    , BV_SMC
    , BV_SYN


    , BV_SPC
    , BV_SPF
    , BV_SPL

    , BV_STS

    , BV_SUA

    , BV_SW
    , BV_SWF
    , BV_TAGS
    , BV_TS
    , BV_TW
    , BV_TX
    , BV_UDF
    , BV_WM
    , BV_COUNT
};






enum
{
    WV_LIST = 0
# 1040 "option.h"
    , WV_CRBIND


    , WV_DIFF


    , WV_FDC
    , WV_FEN
    , WV_FDI
    , WV_FDL
    , WV_FDM
    , WV_FML
    , WV_FDN

    , WV_FDE
    , WV_FDT

    , WV_FMR


    , WV_LBR

    , WV_NU
    , WV_RNU

    , WV_NUW


    , WV_PVW






    , WV_SCBIND

    , WV_SCROLL

    , WV_SPELL


    , WV_CUC
    , WV_CUL
    , WV_CC


    , WV_STL


    , WV_WFH


    , WV_WFW

    , WV_WRAP
    , WV_COUNT
};
# 1701 "vim.h" 2



# 1 "structs.h" 1
# 26 "structs.h"
typedef struct
{
    linenr_T lnum;
    colnr_T col;

    colnr_T coladd;

} pos_T;
# 44 "structs.h"
typedef struct
{
    linenr_T lnum;
    colnr_T col;
} lpos_T;






typedef struct growarray
{
    int ga_len;
    int ga_maxlen;
    int ga_itemsize;
    int ga_growsize;
    void *ga_data;
} garray_T;






# 1 "regexp.h" 1
# 29 "regexp.h"
typedef struct
{
    int regstart;
    char_u reganch;
    char_u *regmust;
    int regmlen;
    unsigned regflags;
    char_u reghasz;
    char_u program[1];
} regprog_T;






typedef struct
{
    regprog_T *regprog;
    char_u *startp[10];
    char_u *endp[10];
    int rm_ic;
} regmatch_T;
# 61 "regexp.h"
typedef struct
{
    regprog_T *regprog;
    lpos_T startpos[10];
    lpos_T endpos[10];
    int rmm_ic;
    colnr_T rmm_maxcol;
} regmmatch_T;






typedef struct
{
    short refcnt;
    char_u *matches[10];
} reg_extmatch_T;
# 70 "structs.h" 2

typedef struct window_S win_T;
typedef struct wininfo_S wininfo_T;
typedef struct frame_S frame_T;
typedef int scid_T;
# 101 "structs.h"
typedef struct filemark
{
    pos_T mark;
    int fnum;
} fmark_T;


typedef struct xfilemark
{
    fmark_T fmark;
    char_u *fname;
} xfmark_T;




typedef struct taggy
{
    char_u *tagname;
    fmark_T fmark;
    int cur_match;
    int cur_fnum;
} taggy_T;






typedef struct
{





    int wo_diff;



    long wo_fdc;

    int wo_fen;

    char_u *wo_fdi;

    long wo_fdl;

    char_u *wo_fdm;

    long wo_fml;

    long wo_fdn;


    char_u *wo_fde;

    char_u *wo_fdt;


    char_u *wo_fmr;



    int wo_lbr;


    int wo_list;

    int wo_nu;

    int wo_rnu;


    long wo_nuw;



    int wo_wfh;

    int wo_wfw;



    int wo_pvw;
# 194 "structs.h"
    long wo_scr;


    int wo_spell;



    int wo_cuc;

    int wo_cul;

    char_u *wo_cc;



    char_u *wo_stl;



    int wo_scb;


    int wo_wrap;
# 225 "structs.h"
    int wo_crb;




    int wo_scriptID[WV_COUNT];


} winopt_T;
# 245 "structs.h"
struct wininfo_S
{
    wininfo_T *wi_next;
    wininfo_T *wi_prev;
    win_T *wi_win;
    pos_T wi_fpos;
    int wi_optset;
    winopt_T wi_opt;

    int wi_fold_manual;
    garray_T wi_folds;

};





typedef struct foldinfo
{
    int fi_level;

    int fi_lnum;
    int fi_low_level;

} foldinfo_T;


typedef struct
{
    pos_T vi_start;
    pos_T vi_end;
    int vi_mode;
    colnr_T vi_curswant;
} visualinfo_T;





typedef struct u_entry u_entry_T;
typedef struct u_header u_header_T;
struct u_entry
{
    u_entry_T *ue_next;
    linenr_T ue_top;
    linenr_T ue_bot;
    linenr_T ue_lcount;
    char_u **ue_array;
    long ue_size;



};

struct u_header
{


    union {
 u_header_T *ptr;
 long seq;
    } uh_next;
    union {
 u_header_T *ptr;
 long seq;
    } uh_prev;
    union {
 u_header_T *ptr;
 long seq;
    } uh_alt_next;
    union {
 u_header_T *ptr;
 long seq;
    } uh_alt_prev;
    long uh_seq;
    int uh_walk;
    u_entry_T *uh_entry;
    u_entry_T *uh_getbot_entry;
    pos_T uh_cursor;

    long uh_cursor_vcol;

    int uh_flags;
    pos_T uh_namedm[('z' - 'a' + 1)];

    visualinfo_T uh_visual;

    time_t uh_time;
    long uh_save_nr;




};
# 357 "structs.h"
typedef struct m_info minfo_T;




struct m_info
{

    long_u m_size;



    minfo_T *m_next;
};





typedef struct block_hdr bhdr_T;
typedef struct memfile memfile_T;
typedef long blocknr_T;
# 395 "structs.h"
struct block_hdr
{
    bhdr_T *bh_next;
    bhdr_T *bh_prev;
    bhdr_T *bh_hash_next;
    bhdr_T *bh_hash_prev;
    blocknr_T bh_bnum;
    char_u *bh_data;
    int bh_page_count;



    char bh_flags;
};







typedef struct nr_trans NR_TRANS;

struct nr_trans
{
    NR_TRANS *nt_next;
    NR_TRANS *nt_prev;
    blocknr_T nt_old_bnum;
    blocknr_T nt_new_bnum;
};




struct buffblock
{
    struct buffblock *b_next;
    char_u b_str[1];
};




struct buffheader
{
    struct buffblock bh_first;
    struct buffblock *bh_curr;
    int bh_index;
    int bh_space;
};




typedef struct expand
{
    int xp_context;
    char_u *xp_pattern;
    int xp_pattern_len;

    char_u *xp_arg;
    int xp_scriptID;

    int xp_backslash;

    int xp_shell;


    int xp_numfiles;

    char_u **xp_files;
} expand_T;
# 478 "structs.h"
typedef struct
{
    int hide;

    int browse;


    int split;
    int tab;


    int confirm;

    int keepalt;
    int keepmarks;
    int keepjumps;
    int lockmarks;

    char_u *save_ei;

} cmdmod_T;

typedef struct file_buffer buf_T;
# 510 "structs.h"
struct memfile
{
    char_u *mf_fname;
    char_u *mf_ffname;
    int mf_fd;
    bhdr_T *mf_free_first;
    bhdr_T *mf_used_first;
    bhdr_T *mf_used_last;
    unsigned mf_used_count;
    unsigned mf_used_count_max;
    bhdr_T *mf_hash[64];
    NR_TRANS *mf_trans[64];
    blocknr_T mf_blocknr_max;
    blocknr_T mf_blocknr_min;
    blocknr_T mf_neg_count;
    blocknr_T mf_infile_count;
    unsigned mf_page_size;
    int mf_dirty;

    buf_T *mf_buffer;
    char_u mf_seed[8];



    char_u *mf_old_key;
    int mf_old_cm;
    char_u mf_old_seed[8];

};
# 548 "structs.h"
typedef struct info_pointer
{
    blocknr_T ip_bnum;
    linenr_T ip_low;
    linenr_T ip_high;
    int ip_index;
} infoptr_T;


typedef struct ml_chunksize
{
    int mlcs_numlines;
    long mlcs_totalsize;
} chunksize_T;
# 573 "structs.h"
typedef struct memline
{
    linenr_T ml_line_count;

    memfile_T *ml_mfp;





    int ml_flags;

    infoptr_T *ml_stack;
    int ml_stack_top;
    int ml_stack_size;

    linenr_T ml_line_lnum;
    char_u *ml_line_ptr;

    bhdr_T *ml_locked;
    linenr_T ml_locked_low;
    linenr_T ml_locked_high;
    int ml_locked_lineadd;

    chunksize_T *ml_chunksize;
    int ml_numchunks;
    int ml_usedchunks;

} memline_T;


typedef struct signlist signlist_T;

struct signlist
{
    int id;
    linenr_T lnum;
    int typenr;
    signlist_T *next;

    signlist_T *prev;

};
# 628 "structs.h"
typedef struct arglist
{
    garray_T al_ga;
    int al_refcount;
} alist_T;






typedef struct argentry
{
    char_u *ae_fname;
    int ae_fnum;
} aentry_T;
# 664 "structs.h"
typedef struct eslist_elem eslist_T;
struct eslist_elem
{
    int saved_emsg_silent;
    eslist_T *next;
};







struct condstack
{
    short cs_flags[50];
    char cs_pending[50];
    union {
 void *csp_rv[50];
 void *csp_ex[50];
    } cs_pend;
    void *cs_forinfo[50];
    int cs_line[50];
    int cs_idx;
    int cs_looplevel;
    int cs_trylevel;
    eslist_T *cs_emsg_silent_list;
    char cs_lflags;
};
# 739 "structs.h"
struct msglist
{
    char_u *msg;
    char_u *throw_msg;
    struct msglist *next;
};





typedef struct vim_exception except_T;
struct vim_exception
{
    int type;
    char_u *value;
    struct msglist *messages;
    char_u *throw_name;
    linenr_T throw_lnum;
    except_T *caught;
};
# 773 "structs.h"
typedef struct cleanup_stuff cleanup_T;
struct cleanup_stuff
{
    int pending;
    except_T *exception;
};



struct sp_syn
{
    int inc_tag;
    short id;
    short *cont_in_list;
};




typedef struct keyentry keyentry_T;

struct keyentry
{
    keyentry_T *ke_next;
    struct sp_syn k_syn;
    short *next_list;
    int flags;
    int k_char;
    char_u keyword[1];
};




typedef struct buf_state
{
    int bs_idx;
    int bs_flags;




    reg_extmatch_T *bs_extmatch;
} bufstate_T;





typedef struct syn_state synstate_T;

struct syn_state
{
    synstate_T *sst_next;
    linenr_T sst_lnum;
    union
    {
 bufstate_T sst_stack[7];
 garray_T sst_ga;
    } sst_union;
    int sst_next_flags;
    int sst_stacksize;
    short *sst_next_list;

    disptick_T sst_tick;
    linenr_T sst_change_lnum;

};





typedef struct attr_entry
{
    short ae_attr;
    union
    {
 struct
 {
     char_u *start;
     char_u *stop;
 } term;
 struct
 {

     short_u fg_color;
     short_u bg_color;
 } cterm;
# 874 "structs.h"
    } ae_u;
} attrentry_T;
# 904 "structs.h"
typedef struct
{
    char_u *tb_buf;
    char_u *tb_noremap;
    int tb_buflen;
    int tb_off;
    int tb_len;
    int tb_maplen;
    int tb_silent;
    int tb_no_abbr_cnt;
    int tb_change_cnt;
} typebuf_T;


typedef struct
{
    typebuf_T save_typebuf;
    int typebuf_valid;
    int old_char;
    int old_mod_mask;
    struct buffheader save_stuffbuff;

    char_u *save_inputbuf;

} tasave_T;




typedef struct
{
    int vc_type;
    int vc_factor;







    int vc_fail;
} vimconv_T;




typedef struct
{
    char_u *vir_line;
    FILE *vir_fd;



} vir_T;
# 978 "structs.h"
typedef struct mapblock mapblock_T;
struct mapblock
{
    mapblock_T *m_next;
    char_u *m_keys;
    int m_keylen;
    char_u *m_str;
    int m_mode;
    int m_noremap;
    char m_silent;

    char m_expr;
    scid_T m_script_ID;

};




struct stl_hlrec
{
    char_u *start;
    int userhl;
};
# 1015 "structs.h"
typedef struct hashitem_S
{
    long_u hi_hash;
    char_u *hi_key;
} hashitem_T;
# 1030 "structs.h"
typedef struct hashtable_S
{
    long_u ht_mask;

    long_u ht_used;
    long_u ht_filled;
    int ht_locked;
    int ht_error;

    hashitem_T *ht_array;

    hashitem_T ht_smallarray[16];
} hashtab_T;

typedef long_u hash_T;





typedef int varnumber_T;

typedef double float_T;

typedef struct listvar_S list_T;
typedef struct dictvar_S dict_T;




typedef struct
{
    char v_type;
    char v_lock;
    union
    {
 varnumber_T v_number;

 float_T v_float;

 char_u *v_string;
 list_T *v_list;
 dict_T *v_dict;
    } vval;
} typval_T;
# 1092 "structs.h"
typedef struct listitem_S listitem_T;

struct listitem_S
{
    listitem_T *li_next;
    listitem_T *li_prev;
    typval_T li_tv;
};




typedef struct listwatch_S listwatch_T;

struct listwatch_S
{
    listitem_T *lw_item;
    listwatch_T *lw_next;
};




struct listvar_S
{
    listitem_T *lv_first;
    listitem_T *lv_last;
    int lv_refcount;
    int lv_len;
    listwatch_T *lv_watch;
    int lv_idx;
    listitem_T *lv_idx_item;
    int lv_copyID;
    list_T *lv_copylist;
    char lv_lock;
    list_T *lv_used_next;
    list_T *lv_used_prev;
};






struct dictitem_S
{
    typval_T di_tv;
    char_u di_flags;
    char_u di_key[1];
};

typedef struct dictitem_S dictitem_T;
# 1153 "structs.h"
struct dictvar_S
{
    int dv_refcount;
    hashtab_T dv_hashtab;
    int dv_copyID;
    dict_T *dv_copydict;
    char dv_lock;
    dict_T *dv_used_next;
    dict_T *dv_used_prev;
};
# 1177 "structs.h"
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
    char_u *b_syn_linecont_pat;
    regprog_T *b_syn_linecont_prog;
    int b_syn_linecont_ic;
    int b_syn_topgrp;




    int b_syn_folditems;
# 1223 "structs.h"
    synstate_T *b_sst_array;
    int b_sst_len;
    synstate_T *b_sst_first;
    synstate_T *b_sst_firstfree;
    int b_sst_freecount;
    linenr_T b_sst_check_lnum;
    short_u b_sst_lasttick;




    garray_T b_langp;
    char_u b_spell_ismw[256];



    char_u *b_p_spc;
    regprog_T *b_cap_prog;
    char_u *b_p_spf;
    char_u *b_p_spl;




} synblock_T;
# 1258 "structs.h"
struct file_buffer
{
    memline_T b_ml;


    buf_T *b_next;
    buf_T *b_prev;

    int b_nwindows;

    int b_flags;







    char_u *b_ffname;
    char_u *b_sfname;
    char_u *b_fname;


    int b_dev_valid;
    dev_t b_dev;
    ino_t b_ino;
# 1297 "structs.h"
    int b_fnum;

    int b_changed;

    int b_changedtick;

    int b_saving;






    int b_mod_set;

    linenr_T b_mod_top;
    linenr_T b_mod_bot;

    long b_mod_xlines;


    wininfo_T *b_wininfo;

    long b_mtime;
    long b_mtime_read;
    off_t b_orig_size;
    int b_orig_mode;

    pos_T b_namedm[('z' - 'a' + 1)];



    visualinfo_T b_visual;

    int b_visual_mode_eval;



    pos_T b_last_cursor;

    pos_T b_last_insert;
    pos_T b_last_change;





    pos_T b_changelist[100];
    int b_changelistlen;
    int b_new_change;






    char_u b_chartab[32];



    mapblock_T *(b_maphash[256]);


    mapblock_T *b_first_abbr;



    garray_T b_ucmds;




    pos_T b_op_start;
    pos_T b_op_end;


    int b_marks_read;





    u_header_T *b_u_oldhead;
    u_header_T *b_u_newhead;

    u_header_T *b_u_curhead;
    int b_u_numhead;
    int b_u_synced;
    long b_u_seq_last;
    long b_u_save_nr_last;
    long b_u_seq_cur;
    time_t b_u_time_cur;
    long b_u_save_nr_cur;




    char_u *b_u_line_ptr;
    linenr_T b_u_line_lnum;
    colnr_T b_u_line_colnr;


    int b_scanned;



    long b_p_iminsert;
    long b_p_imsearch;
# 1427 "structs.h"
    int b_p_initialized;


    int b_p_scriptID[BV_COUNT];


    int b_p_ai;
    int b_p_ai_nopaste;
    int b_p_ci;
    int b_p_bin;




    char_u *b_p_bh;
    char_u *b_p_bt;

    int b_p_bl;

    int b_p_cin;
    char_u *b_p_cino;
    char_u *b_p_cink;


    char_u *b_p_cinw;


    char_u *b_p_com;


    char_u *b_p_cms;


    char_u *b_p_cpt;


    char_u *b_p_cfu;
    char_u *b_p_ofu;

    int b_p_eol;
    int b_p_et;
    int b_p_et_nobin;



    char_u *b_p_ff;

    char_u *b_p_ft;

    char_u *b_p_fo;
    char_u *b_p_flp;
    int b_p_inf;
    char_u *b_p_isk;

    char_u *b_p_def;
    char_u *b_p_inc;

    char_u *b_p_inex;
    long_u b_p_inex_flags;



    char_u *b_p_inde;
    long_u b_p_inde_flags;
    char_u *b_p_indk;


    char_u *b_p_fex;
    long_u b_p_fex_flags;


    char_u *b_p_key;

    char_u *b_p_kp;

    int b_p_lisp;

    char_u *b_p_mps;
    int b_p_ml;
    int b_p_ml_nobin;
    int b_p_ma;
    char_u *b_p_nf;



    int b_p_pi;

    char_u *b_p_qe;

    int b_p_ro;
    long b_p_sw;

    int b_p_sn;


    int b_p_si;

    long b_p_sts;
    long b_p_sts_nopaste;

    char_u *b_p_sua;

    int b_p_swf;

    long b_p_smc;
    char_u *b_p_syn;

    long b_p_ts;
    int b_p_tx;
    long b_p_tw;
    long b_p_tw_nobin;
    long b_p_tw_nopaste;
    long b_p_wm;
    long b_p_wm_nobin;
    long b_p_wm_nopaste;






    char_u *b_p_gp;
    char_u *b_p_mp;
    char_u *b_p_efm;

    char_u *b_p_ep;
    char_u *b_p_path;
    int b_p_ar;
    char_u *b_p_tags;

    char_u *b_p_dict;
    char_u *b_p_tsr;


    int b_p_udf;




    int b_start_eol;
    int b_start_ffc;







    dictitem_T b_bufvar;
    dict_T b_vars;







    char_u *b_p_cm;






    int b_may_swap;
    int b_did_warn;







    int b_help;


    int b_spell;





    int b_shortname;
# 1637 "structs.h"
    synblock_T b_s;





    signlist_T *b_signlist;



    int b_netbeans_file;
    int b_was_netbeans_file;


};
# 1674 "structs.h"
typedef struct diffblock_S diff_T;
struct diffblock_S
{
    diff_T *df_next;
    linenr_T df_lnum[4];
    linenr_T df_count[4];
};
# 1697 "structs.h"
typedef struct tabpage_S tabpage_T;
struct tabpage_S
{
    tabpage_T *tp_next;
    frame_T *tp_topframe;
    win_T *tp_curwin;
    win_T *tp_prevwin;
    win_T *tp_firstwin;
    win_T *tp_lastwin;
    long tp_old_Rows;
    long tp_old_Columns;
    long tp_ch_used;






    diff_T *tp_first_diff;
    buf_T *(tp_diffbuf[4]);
    int tp_diff_invalid;

    frame_T *(tp_snapshot[2]);

    dictitem_T tp_winvar;
    dict_T tp_vars;

};
# 1738 "structs.h"
typedef struct w_line
{
    linenr_T wl_lnum;
    short_u wl_size;
    char wl_valid;

    char wl_folded;
    linenr_T wl_lastlnum;

} wline_T;





struct frame_S
{
    char fr_layout;

    int fr_width;
    int fr_newwidth;

    int fr_height;
    int fr_newheight;
    frame_T *fr_parent;
    frame_T *fr_next;

    frame_T *fr_prev;


    frame_T *fr_child;
    win_T *fr_win;
};
# 1782 "structs.h"
typedef struct
{
    regmmatch_T rm;

    buf_T *buf;
    linenr_T lnum;
    int attr;
    int attr_cur;
    linenr_T first_lnum;
    colnr_T startcol;
    colnr_T endcol;

    proftime_T tm;

} match_T;





typedef struct matchitem matchitem_T;
struct matchitem
{
    matchitem_T *next;
    int id;
    int priority;
    char_u *pattern;
    int hlg_id;
    regmmatch_T match;
    match_T hl;
};






struct window_S
{
    buf_T *w_buffer;



    synblock_T *w_s;



    win_T *w_prev;
    win_T *w_next;


    frame_T *w_frame;

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
# 1911 "structs.h"
    int w_valid;
    pos_T w_valid_cursor;

    colnr_T w_valid_leftcol;





    int w_cline_height;

    int w_cline_folded;


    int w_cline_row;

    colnr_T w_virtcol;
# 1939 "structs.h"
    int w_wrow, w_wcol;

    linenr_T w_botline;

    int w_empty_rows;

    int w_filler_rows;
# 1959 "structs.h"
    int w_lines_valid;
    wline_T *w_lines;


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


    alist_T *w_alist;

    int w_arg_idx;

    int w_arg_idx_invalid;

    char_u *w_localdir;
# 2017 "structs.h"
    winopt_T w_onebuf_opt;
    winopt_T w_allbuf_opt;



    long_u w_p_stl_flags;


    long_u w_p_fde_flags;
    long_u w_p_fdt_flags;


    int *w_p_cc_cols;






    long w_scbind_pos;



    dictitem_T w_winvar;
    dict_T w_vars;
# 2053 "structs.h"
    pos_T w_pcmark;
    pos_T w_prev_pcmark;





    xfmark_T w_jumplist[100];
    int w_jumplistlen;
    int w_jumplistidx;

    int w_changelistidx;



    matchitem_T *w_match_head;
    int w_next_match_id;
# 2078 "structs.h"
    taggy_T w_tagstack[20];
    int w_tagstackidx;
    int w_tagstacklen;







    int w_fraction;
    int w_prev_fraction_row;





    linenr_T w_nrwidth_line_count;

    int w_nrwidth_width;



    qf_info_T *w_llist;




    qf_info_T *w_llist_ref;
# 2133 "structs.h"
};




typedef struct oparg_S
{
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




typedef struct cmdarg_S
{
    oparg_T *oap;
    int prechar;
    int cmdchar;
    int nchar;




    int extra_char;
    long opcount;
    long count0;
    long count1;
    int arg;
    int retval;
    char_u *searchbuf;
} cmdarg_T;
# 2230 "structs.h"
typedef struct cursor_entry
{
    int shape;
    int mshape;
    int percentage;
    long blinkwait;
    long blinkon;
    long blinkoff;
    int id;
    int id_lm;
    char *name;
    char used_for;
} cursorentry_T;
# 2272 "structs.h"
typedef struct VimMenu vimmenu_T;

struct VimMenu
{
    int modes;
    int enabled;
    char_u *name;
    char_u *dname;

    char_u *en_name;

    char_u *en_dname;


    int mnemonic;
    char_u *actext;
    int priority;
# 2297 "structs.h"
    char_u *strings[7];
    int noremap[7];
    char silent[7];
    vimmenu_T *children;
    vimmenu_T *parent;
    vimmenu_T *next;
# 2351 "structs.h"
};
# 2362 "structs.h"
typedef struct
{
    buf_T *save_curbuf;

    int use_aucmd_win;
    win_T *save_curwin;
    win_T *new_curwin;
    buf_T *new_curbuf;
    char_u *globaldir;

} aco_save_T;




typedef struct
{
    const char *name;
    int hasnum;
    long number;
    char_u *string;
    int strlen;
    int present;
} option_table_T;




typedef struct
{
    long_u fg_color;
    long_u bg_color;
    int bold;
    int italic;
    int underline;
    int undercurl;
} prt_text_attr_T;




typedef struct
{
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
    char_u *jobname;

    char_u *outfile;
    char_u *arguments;

} prt_settings_T;






typedef struct
{
    char_u *pum_text;
    char_u *pum_kind;
    char_u *pum_extra;
    char_u *pum_info;
} pumitem_T;




typedef struct
{
    char_u *tn_tags;
    char_u *tn_np;
    int tn_did_filefind_init;
    int tn_hf_idx;
    void *tn_search_ctx;
} tagname_T;
# 2458 "structs.h"
typedef struct {
  UINT32_T total[2];
  UINT32_T state[8];
  char_u buffer[64];
} context_sha256_T;
# 1705 "vim.h" 2
# 1875 "vim.h"
typedef struct VimClipboard
{
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
# 1906 "vim.h"
} VimClipboard;
# 1918 "vim.h"
# 1 "ex_cmds.h" 1
# 62 "ex_cmds.h"
typedef struct exarg exarg_T;
# 93 "ex_cmds.h"
enum CMD_index

{
CMD_append,

CMD_abbreviate,

CMD_abclear,

CMD_aboveleft,

CMD_all,

CMD_amenu,

CMD_anoremenu,

CMD_args,

CMD_argadd,

CMD_argdelete,

CMD_argdo,

CMD_argedit,

CMD_argglobal,

CMD_arglocal,

CMD_argument,

CMD_ascii,

CMD_autocmd,

CMD_augroup,

CMD_aunmenu,

CMD_buffer,

CMD_bNext,

CMD_ball,

CMD_badd,

CMD_bdelete,

CMD_behave,

CMD_belowright,

CMD_bfirst,

CMD_blast,

CMD_bmodified,

CMD_bnext,

CMD_botright,

CMD_bprevious,

CMD_brewind,

CMD_break,

CMD_breakadd,

CMD_breakdel,

CMD_breaklist,

CMD_browse,

CMD_buffers,

CMD_bufdo,

CMD_bunload,

CMD_bwipeout,

CMD_change,

CMD_cNext,

CMD_cNfile,

CMD_cabbrev,

CMD_cabclear,

CMD_caddbuffer,

CMD_caddexpr,

CMD_caddfile,

CMD_call,

CMD_catch,

CMD_cbuffer,

CMD_cc,

CMD_cclose,

CMD_cd,

CMD_center,

CMD_cexpr,

CMD_cfile,

CMD_cfirst,

CMD_cgetfile,

CMD_cgetbuffer,

CMD_cgetexpr,

CMD_chdir,

CMD_changes,

CMD_checkpath,

CMD_checktime,

CMD_clist,

CMD_clast,

CMD_close,

CMD_cmap,

CMD_cmapclear,

CMD_cmenu,

CMD_cnext,

CMD_cnewer,

CMD_cnfile,

CMD_cnoremap,

CMD_cnoreabbrev,

CMD_cnoremenu,

CMD_copy,

CMD_colder,

CMD_colorscheme,

CMD_command,

CMD_comclear,

CMD_compiler,

CMD_continue,

CMD_confirm,

CMD_copen,

CMD_cprevious,

CMD_cpfile,

CMD_cquit,

CMD_crewind,

CMD_cscope,

CMD_cstag,

CMD_cunmap,

CMD_cunabbrev,

CMD_cunmenu,

CMD_cwindow,

CMD_delete,

CMD_delmarks,

CMD_debug,

CMD_debuggreedy,

CMD_delcommand,

CMD_delfunction,

CMD_display,

CMD_diffupdate,

CMD_diffget,

CMD_diffoff,

CMD_diffpatch,

CMD_diffput,

CMD_diffsplit,

CMD_diffthis,

CMD_digraphs,

CMD_djump,

CMD_dlist,

CMD_doautocmd,

CMD_doautoall,

CMD_drop,

CMD_dsearch,

CMD_dsplit,

CMD_edit,

CMD_earlier,

CMD_echo,

CMD_echoerr,

CMD_echohl,

CMD_echomsg,

CMD_echon,

CMD_else,

CMD_elseif,

CMD_emenu,

CMD_endif,

CMD_endfunction,

CMD_endfor,

CMD_endtry,

CMD_endwhile,

CMD_enew,

CMD_ex,

CMD_execute,

CMD_exit,

CMD_exusage,

CMD_file,

CMD_files,

CMD_filetype,

CMD_find,

CMD_finally,

CMD_finish,

CMD_first,

CMD_fixdel,

CMD_fold,

CMD_foldclose,

CMD_folddoopen,

CMD_folddoclosed,

CMD_foldopen,

CMD_for,

CMD_function,

CMD_global,

CMD_goto,

CMD_grep,

CMD_grepadd,

CMD_gui,

CMD_gvim,

CMD_help,

CMD_helpfind,

CMD_helpgrep,

CMD_helptags,

CMD_hardcopy,

CMD_highlight,

CMD_hide,

CMD_history,

CMD_insert,

CMD_iabbrev,

CMD_iabclear,

CMD_if,

CMD_ijump,

CMD_ilist,

CMD_imap,

CMD_imapclear,

CMD_imenu,

CMD_inoremap,

CMD_inoreabbrev,

CMD_inoremenu,

CMD_intro,

CMD_isearch,

CMD_isplit,

CMD_iunmap,

CMD_iunabbrev,

CMD_iunmenu,

CMD_join,

CMD_jumps,

CMD_k,

CMD_keepmarks,

CMD_keepjumps,

CMD_keepalt,

CMD_list,

CMD_lNext,

CMD_lNfile,

CMD_last,

CMD_language,

CMD_laddexpr,

CMD_laddbuffer,

CMD_laddfile,

CMD_later,

CMD_lbuffer,

CMD_lcd,

CMD_lchdir,

CMD_lclose,

CMD_lcscope,

CMD_left,

CMD_leftabove,

CMD_let,

CMD_lexpr,

CMD_lfile,

CMD_lfirst,

CMD_lgetfile,

CMD_lgetbuffer,

CMD_lgetexpr,

CMD_lgrep,

CMD_lgrepadd,

CMD_lhelpgrep,

CMD_ll,

CMD_llast,

CMD_llist,

CMD_lmap,

CMD_lmapclear,

CMD_lmake,

CMD_lnoremap,

CMD_lnext,

CMD_lnewer,

CMD_lnfile,

CMD_loadview,

CMD_loadkeymap,

CMD_lockmarks,

CMD_lockvar,

CMD_lolder,

CMD_lopen,

CMD_lprevious,

CMD_lpfile,

CMD_lrewind,

CMD_ltag,

CMD_lua,

CMD_luado,

CMD_luafile,

CMD_lunmap,

CMD_lvimgrep,

CMD_lvimgrepadd,

CMD_lwindow,

CMD_ls,

CMD_move,

CMD_mark,

CMD_make,

CMD_map,

CMD_mapclear,

CMD_marks,

CMD_match,

CMD_menu,

CMD_menutranslate,

CMD_messages,

CMD_mkexrc,

CMD_mksession,

CMD_mkspell,

CMD_mkvimrc,

CMD_mkview,

CMD_mode,

CMD_mzscheme,

CMD_mzfile,

CMD_next,

CMD_nbkey,

CMD_nbclose,

CMD_nbstart,

CMD_new,

CMD_nmap,

CMD_nmapclear,

CMD_nmenu,

CMD_nnoremap,

CMD_nnoremenu,

CMD_noremap,

CMD_noautocmd,

CMD_nohlsearch,

CMD_noreabbrev,

CMD_noremenu,

CMD_normal,

CMD_number,

CMD_nunmap,

CMD_nunmenu,

CMD_open,

CMD_oldfiles,

CMD_omap,

CMD_omapclear,

CMD_omenu,

CMD_only,

CMD_onoremap,

CMD_onoremenu,

CMD_options,

CMD_ounmap,

CMD_ounmenu,

CMD_ownsyntax,

CMD_print,

CMD_pclose,

CMD_perl,

CMD_perldo,

CMD_pedit,

CMD_pop,

CMD_popup,

CMD_ppop,

CMD_preserve,

CMD_previous,

CMD_promptfind,

CMD_promptrepl,

CMD_profile,

CMD_profdel,

CMD_psearch,

CMD_ptag,

CMD_ptNext,

CMD_ptfirst,

CMD_ptjump,

CMD_ptlast,

CMD_ptnext,

CMD_ptprevious,

CMD_ptrewind,

CMD_ptselect,

CMD_put,

CMD_pwd,

CMD_python,

CMD_pyfile,

CMD_py3,

CMD_python3,

CMD_py3file,

CMD_quit,

CMD_quitall,

CMD_qall,

CMD_read,

CMD_recover,

CMD_redo,

CMD_redir,

CMD_redraw,

CMD_redrawstatus,

CMD_registers,

CMD_resize,

CMD_retab,

CMD_return,

CMD_rewind,

CMD_right,

CMD_rightbelow,

CMD_runtime,

CMD_ruby,

CMD_rubydo,

CMD_rubyfile,

CMD_rundo,

CMD_rviminfo,

CMD_substitute,

CMD_sNext,

CMD_sargument,

CMD_sall,

CMD_sandbox,

CMD_saveas,

CMD_sbuffer,

CMD_sbNext,

CMD_sball,

CMD_sbfirst,

CMD_sblast,

CMD_sbmodified,

CMD_sbnext,

CMD_sbprevious,

CMD_sbrewind,

CMD_scriptnames,

CMD_scriptencoding,

CMD_scscope,

CMD_set,

CMD_setfiletype,

CMD_setglobal,

CMD_setlocal,

CMD_sfind,

CMD_sfirst,

CMD_shell,

CMD_simalt,

CMD_sign,

CMD_silent,

CMD_sleep,

CMD_slast,

CMD_smagic,

CMD_smap,

CMD_smapclear,

CMD_smenu,

CMD_snext,

CMD_sniff,

CMD_snomagic,

CMD_snoremap,

CMD_snoremenu,

CMD_source,

CMD_sort,

CMD_split,

CMD_spellgood,

CMD_spelldump,

CMD_spellinfo,

CMD_spellrepall,

CMD_spellundo,

CMD_spellwrong,

CMD_sprevious,

CMD_srewind,

CMD_stop,

CMD_stag,

CMD_startinsert,

CMD_startgreplace,

CMD_startreplace,

CMD_stopinsert,

CMD_stjump,

CMD_stselect,

CMD_sunhide,

CMD_sunmap,

CMD_sunmenu,

CMD_suspend,

CMD_sview,

CMD_swapname,

CMD_syntax,

CMD_syncbind,

CMD_t,

CMD_tNext,

CMD_tag,

CMD_tags,

CMD_tab,

CMD_tabclose,

CMD_tabdo,

CMD_tabedit,

CMD_tabfind,

CMD_tabfirst,

CMD_tabmove,

CMD_tablast,

CMD_tabnext,

CMD_tabnew,

CMD_tabonly,

CMD_tabprevious,

CMD_tabNext,

CMD_tabrewind,

CMD_tabs,

CMD_tcl,

CMD_tcldo,

CMD_tclfile,

CMD_tearoff,

CMD_tfirst,

CMD_throw,

CMD_tjump,

CMD_tlast,

CMD_tmenu,

CMD_tnext,

CMD_topleft,

CMD_tprevious,

CMD_trewind,

CMD_try,

CMD_tselect,

CMD_tunmenu,

CMD_undo,

CMD_undojoin,

CMD_undolist,

CMD_unabbreviate,

CMD_unhide,

CMD_unlet,

CMD_unlockvar,

CMD_unmap,

CMD_unmenu,

CMD_unsilent,

CMD_update,

CMD_vglobal,

CMD_version,

CMD_verbose,

CMD_vertical,

CMD_visual,

CMD_view,

CMD_vimgrep,

CMD_vimgrepadd,

CMD_viusage,

CMD_vmap,

CMD_vmapclear,

CMD_vmenu,

CMD_vnoremap,

CMD_vnew,

CMD_vnoremenu,

CMD_vsplit,

CMD_vunmap,

CMD_vunmenu,

CMD_write,

CMD_wNext,

CMD_wall,

CMD_while,

CMD_winsize,

CMD_wincmd,

CMD_windo,

CMD_winpos,

CMD_wnext,

CMD_wprevious,

CMD_wq,

CMD_wqall,

CMD_wsverb,

CMD_wundo,

CMD_wviminfo,

CMD_xit,

CMD_xall,

CMD_xmap,

CMD_xmapclear,

CMD_xmenu,

CMD_xnoremap,

CMD_xnoremenu,

CMD_xunmap,

CMD_xunmenu,

CMD_yank,

CMD_z,



CMD_bang,

CMD_pound,

CMD_and,

CMD_star,

CMD_lshift,

CMD_equal,

CMD_rshift,

CMD_at,

CMD_Next,

CMD_Print,

CMD_X,

CMD_tilde,




    CMD_SIZE,
    CMD_USER = -1,
    CMD_USER_BUF = -2




};




typedef enum CMD_index cmdidx_T;




struct exarg
{
    char_u *arg;
    char_u *nextcmd;
    char_u *cmd;
    char_u **cmdlinep;
    cmdidx_T cmdidx;
    long argt;
    int skip;
    int forceit;
    int addr_count;
    linenr_T line1;
    linenr_T line2;
    int flags;
    char_u *do_ecmd_cmd;
    linenr_T do_ecmd_lnum;
    int append;
    int usefilter;
    int amount;
    int regname;
    int force_bin;
    int read_edit;
    int force_ff;





    int useridx;

    char_u *errmsg;
    char_u *(*getline) (int, void *, int);
    void *cookie;

    struct condstack *cstack;

};
# 1919 "vim.h" 2
# 1 "proto.h" 1
# 39 "proto.h"
# 1 "proto/os_unix.pro" 1

int mch_chdir (char *path);
void mch_write (char_u *s, int len);
int mch_inchar (char_u *buf, int maxlen, long wtime, int tb_change_cnt);
int mch_char_avail (void);
long_u mch_total_mem (int special);
void mch_delay (long msec, int ignoreinput);
int mch_stackcheck (char *p);
void mch_startjmp (void);
void mch_endjmp (void);
void mch_didjmp (void);
void mch_suspend (void);
void mch_init (void);
void reset_signals (void);
int vim_handle_signal (int sig);
int mch_check_win (int argc, char **argv);
int mch_input_isatty (void);
int mch_can_restore_title (void);
int mch_can_restore_icon (void);
void mch_settitle (char_u *title, char_u *icon);
void mch_restore_title (int which);
int vim_is_xterm (char_u *name);
int use_xterm_like_mouse (char_u *name);
int use_xterm_mouse (void);
int vim_is_iris (char_u *name);
int vim_is_vt300 (char_u *name);
int vim_is_fastterm (char_u *name);
int mch_get_user_name (char_u *s, int len);
int mch_get_uname (uid_t uid, char_u *s, int len);
void mch_get_host_name (char_u *s, int len);
long mch_get_pid (void);
int mch_dirname (char_u *buf, int len);
void slash_adjust (char_u *p);
int mch_FullName (char_u *fname, char_u *buf, int len, int force);
int mch_isFullName (char_u *fname);
void fname_case (char_u *name, int len);
long mch_getperm (char_u *name);
int mch_setperm (char_u *name, long perm);
void mch_copy_sec (char_u *from_file, char_u *to_file);
vim_acl_T mch_get_acl (char_u *fname);
void mch_set_acl (char_u *fname, vim_acl_T aclent);
void mch_free_acl (vim_acl_T aclent);
void mch_hide (char_u *name);
int mch_isdir (char_u *name);
int mch_can_exe (char_u *name);
int mch_nodetype (char_u *name);
void mch_early_init (void);
void mch_free_mem (void);
void mch_exit (int r);
void mch_settmode (int tmode);
void get_stty (void);
void mch_setmouse (int on);
void check_mouse_termcode (void);
int mch_screenmode (char_u *arg);
int mch_get_shellsize (void);
void mch_set_shellsize (void);
void mch_new_shellsize (void);
int mch_call_shell (char_u *cmd, int options);
void mch_breakcheck (void);
int mch_expandpath (garray_T *gap, char_u *path, int flags);
int mch_expand_wildcards (int num_pat, char_u **pat, int *num_file, char_u ***file, int flags);
int mch_has_exp_wildcard (char_u *p);
int mch_has_wildcard (char_u *p);
int mch_libcall (char_u *libname, char_u *funcname, char_u *argstring, int argint, char_u **string_result, int *number_result);
void setup_term_clip (void);
void start_xterm_trace (int button);
void stop_xterm_trace (void);
void clear_xterm_clip (void);
int clip_xterm_own_selection (VimClipboard *cbd);
void clip_xterm_lose_selection (VimClipboard *cbd);
void clip_xterm_request_selection (VimClipboard *cbd);
void clip_xterm_set_selection (VimClipboard *cbd);
int xsmp_handle_requests (void);
void xsmp_init (void);
void xsmp_close (void);
# 40 "proto.h" 2
# 73 "proto.h"
# 1 "proto/blowfish.pro" 1

void bf_key_init (char_u *password, char_u *salt, int salt_len);
void bf_ofb_init (char_u *iv, int iv_len);
void bf_crypt_encode (char_u *from, size_t len, char_u *to);
void bf_crypt_decode (char_u *ptr, long len);
void bf_crypt_init_keys (char_u *passwd);
void bf_crypt_save (void);
void bf_crypt_restore (void);
int blowfish_self_test (void);
# 74 "proto.h" 2

# 1 "proto/buffer.pro" 1

int open_buffer (int read_stdin, exarg_T *eap, int flags);
int buf_valid (buf_T *buf);
void close_buffer (win_T *win, buf_T *buf, int action);
void buf_clear_file (buf_T *buf);
void buf_freeall (buf_T *buf, int flags);
void goto_buffer (exarg_T *eap, int start, int dir, int count);
void handle_swap_exists (buf_T *old_curbuf);
char_u *do_bufdel (int command, char_u *arg, int addr_count, int start_bnr, int end_bnr, int forceit);
int do_buffer (int action, int start, int dir, int count, int forceit);
void set_curbuf (buf_T *buf, int action);
void enter_buffer (buf_T *buf);
void do_autochdir (void);
buf_T *buflist_new (char_u *ffname, char_u *sfname, linenr_T lnum, int flags);
void free_buf_options (buf_T *buf, int free_p_ff);
int buflist_getfile (int n, linenr_T lnum, int options, int forceit);
void buflist_getfpos (void);
buf_T *buflist_findname_exp (char_u *fname);
buf_T *buflist_findname (char_u *ffname);
int buflist_findpat (char_u *pattern, char_u *pattern_end, int unlisted, int diffmode);
int ExpandBufnames (char_u *pat, int *num_file, char_u ***file, int options);
buf_T *buflist_findnr (int nr);
char_u *buflist_nr2name (int n, int fullname, int helptail);
void get_winopts (buf_T *buf);
pos_T *buflist_findfpos (buf_T *buf);
linenr_T buflist_findlnum (buf_T *buf);
void buflist_list (exarg_T *eap);
int buflist_name_nr (int fnum, char_u **fname, linenr_T *lnum);
int setfname (buf_T *buf, char_u *ffname, char_u *sfname, int message);
void buf_set_name (int fnum, char_u *name);
void buf_name_changed (buf_T *buf);
buf_T *setaltfname (char_u *ffname, char_u *sfname, linenr_T lnum);
char_u *getaltfname (int errmsg);
int buflist_add (char_u *fname, int flags);
void buflist_slash_adjust (void);
void buflist_altfpos (win_T *win);
int otherfile (char_u *ffname);
void buf_setino (buf_T *buf);
void fileinfo (int fullname, int shorthelp, int dont_truncate);
void col_print (char_u *buf, size_t buflen, int col, int vcol);
void maketitle (void);
void resettitle (void);
void free_titles (void);
int build_stl_str_hl (win_T *wp, char_u *out, size_t outlen, char_u *fmt, int use_sandbox, int fillchar, int maxwidth, struct stl_hlrec *hltab, struct stl_hlrec *tabtab);
void get_rel_pos (win_T *wp, char_u *buf, int buflen);
char_u *fix_fname (char_u *fname);
void fname_expand (buf_T *buf, char_u **ffname, char_u **sfname);
char_u *alist_name (aentry_T *aep);
void do_arg_all (int count, int forceit, int keep_tabs);
void ex_buffer_all (exarg_T *eap);
void do_modelines (int flags);
int read_viminfo_bufferlist (vir_T *virp, int writing);
void write_viminfo_bufferlist (FILE *fp);
char *buf_spname (buf_T *buf);
void buf_addsign (buf_T *buf, int id, linenr_T lnum, int typenr);
linenr_T buf_change_sign_type (buf_T *buf, int markId, int typenr);
int buf_getsigntype (buf_T *buf, linenr_T lnum, int type);
linenr_T buf_delsign (buf_T *buf, int id);
int buf_findsign (buf_T *buf, int id);
int buf_findsign_id (buf_T *buf, linenr_T lnum);
int buf_findsigntype_id (buf_T *buf, linenr_T lnum, int typenr);
int buf_signcount (buf_T *buf, linenr_T lnum);
void buf_delete_all_signs (void);
void sign_list_placed (buf_T *rbuf);
void sign_mark_adjust (linenr_T line1, linenr_T line2, long amount, long amount_after);
void set_buflisted (int on);
int buf_contents_changed (buf_T *buf);
void wipe_buffer (buf_T *buf, int aucmd);
# 76 "proto.h" 2
# 1 "proto/charset.pro" 1

int init_chartab (void);
int buf_init_chartab (buf_T *buf, int global);
void trans_characters (char_u *buf, int bufsize);
char_u *transstr (char_u *s);
char_u *str_foldcase (char_u *str, int orglen, char_u *buf, int buflen);
char_u *transchar (int c);
char_u *transchar_byte (int c);
void transchar_nonprint (char_u *buf, int c);
void transchar_hex (char_u *buf, int c);
int byte2cells (int b);
int char2cells (int c);
int ptr2cells (char_u *p);
int vim_strsize (char_u *s);
int vim_strnsize (char_u *s, int len);
int chartabsize (char_u *p, colnr_T col);
int linetabsize (char_u *s);
int linetabsize_col (int startcol, char_u *s);
int win_linetabsize (win_T *wp, char_u *p, colnr_T len);
int vim_isIDc (int c);
int vim_iswordc (int c);
int vim_iswordp (char_u *p);
int vim_iswordc_buf (char_u *p, buf_T *buf);
int vim_isfilec (int c);
int vim_isfilec_or_wc (int c);
int vim_isprintc (int c);
int vim_isprintc_strict (int c);
int lbr_chartabsize (unsigned char *s, colnr_T col);
int lbr_chartabsize_adv (char_u **s, colnr_T col);
int win_lbr_chartabsize (win_T *wp, char_u *s, colnr_T col, int *headp);
int in_win_border (win_T *wp, colnr_T vcol);
void getvcol (win_T *wp, pos_T *pos, colnr_T *start, colnr_T *cursor, colnr_T *end);
colnr_T getvcol_nolist (pos_T *posp);
void getvvcol (win_T *wp, pos_T *pos, colnr_T *start, colnr_T *cursor, colnr_T *end);
void getvcols (win_T *wp, pos_T *pos1, pos_T *pos2, colnr_T *left, colnr_T *right);
char_u *skipwhite (char_u *q);
char_u *skipdigits (char_u *q);
char_u *skiphex (char_u *q);
char_u *skiptodigit (char_u *q);
char_u *skiptohex (char_u *q);
int vim_isdigit (int c);
int vim_isxdigit (int c);
int vim_islower (int c);
int vim_isupper (int c);
int vim_toupper (int c);
int vim_tolower (int c);
char_u *skiptowhite (char_u *p);
char_u *skiptowhite_esc (char_u *p);
long getdigits (char_u **pp);
int vim_isblankline (char_u *lbuf);
void vim_str2nr (char_u *start, int *hexp, int *len, int dooct, int dohex, long *nptr, unsigned long *unptr);
int hex2nr (int c);
int hexhex2nr (char_u *p);
int rem_backslash (char_u *str);
void backslash_halve (char_u *p);
char_u *backslash_halve_save (char_u *p);
void ebcdic2ascii (char_u *buffer, int len);
# 77 "proto.h" 2



# 1 "proto/diff.pro" 1

void diff_buf_delete (buf_T *buf);
void diff_buf_adjust (win_T *win);
void diff_buf_add (buf_T *buf);
void diff_invalidate (buf_T *buf);
void diff_mark_adjust (linenr_T line1, linenr_T line2, long amount, long amount_after);
void ex_diffupdate (exarg_T *eap);
void ex_diffpatch (exarg_T *eap);
void ex_diffsplit (exarg_T *eap);
void ex_diffthis (exarg_T *eap);
void diff_win_options (win_T *wp, int addbuf);
void ex_diffoff (exarg_T *eap);
void diff_clear (tabpage_T *tp);
int diff_check (win_T *wp, linenr_T lnum);
int diff_check_fill (win_T *wp, linenr_T lnum);
void diff_set_topline (win_T *fromwin, win_T *towin);
int diffopt_changed (void);
int diffopt_horizontal (void);
int diff_find_change (win_T *wp, linenr_T lnum, int *startp, int *endp);
int diff_infold (win_T *wp, linenr_T lnum);
void nv_diffgetput (int put);
void ex_diffgetput (exarg_T *eap);
int diff_mode_buf (buf_T *buf);
int diff_move_to (int dir, long count);
linenr_T diff_get_corresponding_line (buf_T *buf1, linenr_T lnum1, buf_T *buf2, linenr_T lnum3);
linenr_T diff_lnum_win (linenr_T lnum, win_T *wp);
# 81 "proto.h" 2
# 1 "proto/digraph.pro" 1

int do_digraph (int c);
int get_digraph (int cmdline);
int getdigraph (int char1, int char2, int meta);
void putdigraph (char_u *str);
void listdigraphs (void);
char_u *keymap_init (void);
void ex_loadkeymap (exarg_T *eap);
# 82 "proto.h" 2
# 1 "proto/edit.pro" 1

int edit (int cmdchar, int startln, long count);
void edit_putchar (int c, int highlight);
void edit_unputchar (void);
void display_dollar (colnr_T col);
void change_indent (int type, int amount, int round, int replaced, int call_changed_bytes);
void truncate_spaces (char_u *line);
void backspace_until_column (int col);
int vim_is_ctrl_x_key (int c);
int ins_compl_add_infercase (char_u *str, int len, int icase, char_u *fname, int dir, int flags);
void set_completion (colnr_T startcol, list_T *list);
void ins_compl_show_pum (void);
char_u *find_word_start (char_u *ptr);
char_u *find_word_end (char_u *ptr);
int ins_compl_active (void);
int ins_compl_add_tv (typval_T *tv, int dir);
void ins_compl_check_keys (int frequency);
int get_literal (void);
void insertchar (int c, int flags, int second_indent);
void auto_format (int trailblank, int prev_line);
int comp_textwidth (int ff);
int stop_arrow (void);
void set_last_insert (int c);
void free_last_insert (void);
char_u *add_char2buf (int c, char_u *s);
void beginline (int flags);
int oneright (void);
int oneleft (void);
int cursor_up (long n, int upd_topline);
int cursor_down (long n, int upd_topline);
int stuff_inserted (int c, long count, int no_esc);
char_u *get_last_insert (void);
char_u *get_last_insert_save (void);
void replace_push (int c);
int replace_push_mb (char_u *p);
void fixthisline (int (*get_the_indent)(void));
void fix_indent (void);
int in_cinkeys (int keytyped, int when, int line_is_empty);
int hkmap (int c);
void ins_scroll (void);
void ins_horscroll (void);
# 83 "proto.h" 2
# 1 "proto/eval.pro" 1

void eval_init (void);
void eval_clear (void);
char_u *func_name (void *cookie);
linenr_T *func_breakpoint (void *cookie);
int *func_dbg_tick (void *cookie);
int func_level (void *cookie);
int current_func_returned (void);
void set_internal_string_var (char_u *name, char_u *value);
int var_redir_start (char_u *name, int append);
void var_redir_str (char_u *value, int value_len);
void var_redir_stop (void);
int eval_charconvert (char_u *enc_from, char_u *enc_to, char_u *fname_from, char_u *fname_to);
int eval_printexpr (char_u *fname, char_u *args);
void eval_diff (char_u *origfile, char_u *newfile, char_u *outfile);
void eval_patch (char_u *origfile, char_u *difffile, char_u *outfile);
int eval_to_bool (char_u *arg, int *error, char_u **nextcmd, int skip);
char_u *eval_to_string_skip (char_u *arg, char_u **nextcmd, int skip);
int skip_expr (char_u **pp);
char_u *eval_to_string (char_u *arg, char_u **nextcmd, int convert);
char_u *eval_to_string_safe (char_u *arg, char_u **nextcmd, int use_sandbox);
int eval_to_number (char_u *expr);
list_T *eval_spell_expr (char_u *badword, char_u *expr);
int get_spellword (list_T *list, char_u **pp);
typval_T *eval_expr (char_u *arg, char_u **nextcmd);
void *call_func_retstr (char_u *func, int argc, char_u **argv, int safe);
long call_func_retnr (char_u *func, int argc, char_u **argv, int safe);
void *call_func_retlist (char_u *func, int argc, char_u **argv, int safe);
void *save_funccal (void);
void restore_funccal (void *vfc);
void prof_child_enter (proftime_T *tm);
void prof_child_exit (proftime_T *tm);
int eval_foldexpr (char_u *arg, int *cp);
void ex_let (exarg_T *eap);
void *eval_for_line (char_u *arg, int *errp, char_u **nextcmdp, int skip);
int next_for_item (void *fi_void, char_u *arg);
void free_for_info (void *fi_void);
void set_context_for_expression (expand_T *xp, char_u *arg, cmdidx_T cmdidx);
void ex_call (exarg_T *eap);
void ex_unlet (exarg_T *eap);
void ex_lockvar (exarg_T *eap);
int do_unlet (char_u *name, int forceit);
void del_menutrans_vars (void);
char_u *get_user_var_name (expand_T *xp, int idx);
list_T *list_alloc (void);
void list_unref (list_T *l);
void list_free (list_T *l, int recurse);
dictitem_T *dict_lookup (hashitem_T *hi);
char_u *list_find_str (list_T *l, long idx);
int list_append_tv (list_T *l, typval_T *tv);
int list_append_dict (list_T *list, dict_T *dict);
int list_append_string (list_T *l, char_u *str, int len);
int garbage_collect (void);
dict_T *dict_alloc (void);
dictitem_T *dictitem_alloc (char_u *key);
void dictitem_free (dictitem_T *item);
int dict_add (dict_T *d, dictitem_T *item);
int dict_add_nr_str (dict_T *d, char *key, long nr, char_u *str);
int dict_add_list (dict_T *d, char *key, list_T *list);
dictitem_T *dict_find (dict_T *d, char_u *key, int len);
char_u *get_dict_string (dict_T *d, char_u *key, int save);
long get_dict_number (dict_T *d, char_u *key);
char_u *get_function_name (expand_T *xp, int idx);
char_u *get_expr_name (expand_T *xp, int idx);
long do_searchpair (char_u *spat, char_u *mpat, char_u *epat, int dir, char_u *skip, int flags, pos_T *match_pos, linenr_T lnum_stop, long time_limit);
void set_vim_var_nr (int idx, long val);
long get_vim_var_nr (int idx);
char_u *get_vim_var_str (int idx);
list_T *get_vim_var_list (int idx);
void set_vim_var_char (int c);
void set_vcount (long count, long count1, int set_prevcount);
void set_vim_var_string (int idx, char_u *val, int len);
void set_vim_var_list (int idx, list_T *val);
void set_reg_var (int c);
char_u *v_exception (char_u *oldval);
char_u *v_throwpoint (char_u *oldval);
char_u *set_cmdarg (exarg_T *eap, char_u *oldarg);
void free_tv (typval_T *varp);
void clear_tv (typval_T *varp);
long get_tv_number_chk (typval_T *varp, int *denote);
char_u *get_tv_string_chk (typval_T *varp);
char_u *get_var_value (char_u *name);
void new_script_vars (scid_T id);
void init_var_dict (dict_T *dict, dictitem_T *dict_var);
void vars_clear (hashtab_T *ht);
void copy_tv (typval_T *from, typval_T *to);
void ex_echo (exarg_T *eap);
void ex_echohl (exarg_T *eap);
void ex_execute (exarg_T *eap);
void ex_function (exarg_T *eap);
void free_all_functions (void);
void func_dump_profile (FILE *fd);
char_u *get_user_func_name (expand_T *xp, int idx);
void ex_delfunction (exarg_T *eap);
void ex_return (exarg_T *eap);
int do_return (exarg_T *eap, int reanimate, int is_cmd, void *rettv);
void discard_pending_return (void *rettv);
char_u *get_return_cmd (void *rettv);
char_u *get_func_line (int c, void *cookie, int indent);
void func_line_start (void *cookie);
void func_line_exec (void *cookie);
void func_line_end (void *cookie);
int func_has_ended (void *cookie);
int func_has_abort (void *cookie);
int read_viminfo_varlist (vir_T *virp, int writing);
void write_viminfo_varlist (FILE *fp);
int store_session_globals (FILE *fd);
void last_set_msg (scid_T scriptID);
void ex_oldfiles (exarg_T *eap);
int modify_fname (char_u *src, int *usedlen, char_u **fnamep, char_u **bufp, int *fnamelen);
char_u *do_string_sub (char_u *str, char_u *pat, char_u *sub, char_u *flags);
# 84 "proto.h" 2
# 1 "proto/ex_cmds.pro" 1

void do_ascii (exarg_T *eap);
void ex_align (exarg_T *eap);
void ex_sort (exarg_T *eap);
void ex_retab (exarg_T *eap);
int do_move (linenr_T line1, linenr_T line2, linenr_T dest);
void ex_copy (linenr_T line1, linenr_T line2, linenr_T n);
void free_prev_shellcmd (void);
void do_bang (int addr_count, exarg_T *eap, int forceit, int do_in, int do_out);
void do_shell (char_u *cmd, int flags);
char_u *make_filter_cmd (char_u *cmd, char_u *itmp, char_u *otmp);
void append_redir (char_u *buf, int buflen, char_u *opt, char_u *fname);
int viminfo_error (char *errnum, char *message, char_u *line);
int read_viminfo (char_u *file, int flags);
void write_viminfo (char_u *file, int forceit);
int viminfo_readline (vir_T *virp);
char_u *viminfo_readstring (vir_T *virp, int off, int convert);
void viminfo_writestring (FILE *fd, char_u *p);
void do_fixdel (exarg_T *eap);
void print_line_no_prefix (linenr_T lnum, int use_number, int list);
void print_line (linenr_T lnum, int use_number, int list);
void ex_file (exarg_T *eap);
void ex_update (exarg_T *eap);
void ex_write (exarg_T *eap);
int do_write (exarg_T *eap);
void ex_wnext (exarg_T *eap);
void do_wqall (exarg_T *eap);
int not_writing (void);
int getfile (int fnum, char_u *ffname, char_u *sfname, int setpm, linenr_T lnum, int forceit);
int do_ecmd (int fnum, char_u *ffname, char_u *sfname, exarg_T *eap, linenr_T newlnum, int flags, win_T *oldwin);
void ex_append (exarg_T *eap);
void ex_change (exarg_T *eap);
void ex_z (exarg_T *eap);
int check_restricted (void);
int check_secure (void);
void do_sub (exarg_T *eap);
int do_sub_msg (int count_only);
void ex_global (exarg_T *eap);
void global_exe (char_u *cmd);
int read_viminfo_sub_string (vir_T *virp, int force);
void write_viminfo_sub_string (FILE *fp);
void free_old_sub (void);
int prepare_tagpreview (int undo_sync);
void ex_help (exarg_T *eap);
char_u *check_help_lang (char_u *arg);
int help_heuristic (char_u *matched_string, int offset, int wrong_case);
int find_help_tags (char_u *arg, int *num_matches, char_u ***matches, int keep_lang);
void fix_help_buffer (void);
void ex_exusage (exarg_T *eap);
void ex_viusage (exarg_T *eap);
void ex_helptags (exarg_T *eap);
void ex_sign (exarg_T *eap);
void sign_gui_started (void);
int sign_get_attr (int typenr, int line);
char_u *sign_get_text (int typenr);
void *sign_get_image (int typenr);
char_u *sign_typenr2name (int typenr);
void free_signs (void);
char_u *get_sign_name (expand_T *xp, int idx);
void set_context_in_sign_cmd (expand_T *xp, char_u *arg);
void ex_drop (exarg_T *eap);
# 85 "proto.h" 2
# 1 "proto/ex_cmds2.pro" 1

void do_debug (char_u *cmd);
void ex_debug (exarg_T *eap);
void dbg_check_breakpoint (exarg_T *eap);
int dbg_check_skipped (exarg_T *eap);
void ex_breakadd (exarg_T *eap);
void ex_debuggreedy (exarg_T *eap);
void ex_breakdel (exarg_T *eap);
void ex_breaklist (exarg_T *eap);
linenr_T dbg_find_breakpoint (int file, char_u *fname, linenr_T after);
int has_profiling (int file, char_u *fname, int *fp);
void dbg_breakpoint (char_u *name, linenr_T lnum);
void profile_start (proftime_T *tm);
void profile_end (proftime_T *tm);
void profile_sub (proftime_T *tm, proftime_T *tm2);
char *profile_msg (proftime_T *tm);
void profile_setlimit (long msec, proftime_T *tm);
int profile_passed_limit (proftime_T *tm);
void profile_zero (proftime_T *tm);
void profile_add (proftime_T *tm, proftime_T *tm2);
void profile_self (proftime_T *self, proftime_T *total, proftime_T *children);
void profile_get_wait (proftime_T *tm);
void profile_sub_wait (proftime_T *tm, proftime_T *tma);
int profile_equal (proftime_T *tm1, proftime_T *tm2);
int profile_cmp (proftime_T *tm1, proftime_T *tm2);
void ex_profile (exarg_T *eap);
char_u *get_profile_name (expand_T *xp, int idx);
void set_context_in_profile_cmd (expand_T *xp, char_u *arg);
void profile_dump (void);
void script_prof_save (proftime_T *tm);
void script_prof_restore (proftime_T *tm);
void prof_inchar_enter (void);
void prof_inchar_exit (void);
int prof_def_func (void);
int autowrite (buf_T *buf, int forceit);
void autowrite_all (void);
int check_changed (buf_T *buf, int checkaw, int mult_win, int forceit, int allbuf);
void browse_save_fname (buf_T *buf);
void dialog_changed (buf_T *buf, int checkall);
int can_abandon (buf_T *buf, int forceit);
int check_changed_any (int hidden);
int check_fname (void);
int buf_write_all (buf_T *buf, int forceit);
int get_arglist (garray_T *gap, char_u *str);
int get_arglist_exp (char_u *str, int *fcountp, char_u ***fnamesp);
void set_arglist (char_u *str);
void check_arg_idx (win_T *win);
void ex_args (exarg_T *eap);
void ex_previous (exarg_T *eap);
void ex_rewind (exarg_T *eap);
void ex_last (exarg_T *eap);
void ex_argument (exarg_T *eap);
void do_argfile (exarg_T *eap, int argn);
void ex_next (exarg_T *eap);
void ex_argedit (exarg_T *eap);
void ex_argadd (exarg_T *eap);
void ex_argdelete (exarg_T *eap);
void ex_listdo (exarg_T *eap);
void ex_compiler (exarg_T *eap);
void ex_runtime (exarg_T *eap);
int source_runtime (char_u *name, int all);
int do_in_runtimepath (char_u *name, int all, void (*callback)(char_u *fname, void *ck), void *cookie);
void ex_options (exarg_T *eap);
void ex_source (exarg_T *eap);
linenr_T *source_breakpoint (void *cookie);
int *source_dbg_tick (void *cookie);
int source_level (void *cookie);
int do_source (char_u *fname, int check_other, int is_vimrc);
void ex_scriptnames (exarg_T *eap);
void scriptnames_slash_adjust (void);
char_u *get_scriptname (scid_T id);
void free_scriptnames (void);
char *fgets_cr (char *s, int n, FILE *stream);
char_u *getsourceline (int c, void *cookie, int indent);
void script_line_start (void);
void script_line_exec (void);
void script_line_end (void);
void ex_scriptencoding (exarg_T *eap);
void ex_finish (exarg_T *eap);
void do_finish (exarg_T *eap, int reanimate);
int source_finished (char_u *(*fgetline)(int, void *, int), void *cookie);
void ex_checktime (exarg_T *eap);
char_u *get_mess_lang (void);
void set_lang_var (void);
void ex_language (exarg_T *eap);
char_u *get_lang_arg (expand_T *xp, int idx);
# 86 "proto.h" 2
# 1 "proto/ex_docmd.pro" 1

void do_exmode (int improved);
int do_cmdline_cmd (char_u *cmd);
int do_cmdline (char_u *cmdline, char_u *(*getline)(int, void *, int), void *cookie, int flags);
int getline_equal (char_u *(*fgetline)(int, void *, int), void *cookie, char_u *(*func)(int, void *, int));
void *getline_cookie (char_u *(*fgetline)(int, void *, int), void *cookie);
int checkforcmd (char_u **pp, char *cmd, int len);
int modifier_len (char_u *cmd);
int cmd_exists (char_u *name);
char_u *set_one_cmd_context (expand_T *xp, char_u *buff);
char_u *skip_range (char_u *cmd, int *ctx);
void ex_ni (exarg_T *eap);
int expand_filename (exarg_T *eap, char_u **cmdlinep, char_u **errormsgp);
void separate_nextcmd (exarg_T *eap);
int ends_excmd (int c);
char_u *find_nextcmd (char_u *p);
char_u *check_nextcmd (char_u *p);
char_u *get_command_name (expand_T *xp, int idx);
void ex_comclear (exarg_T *eap);
void uc_clear (garray_T *gap);
char_u *get_user_commands (expand_T *xp, int idx);
char_u *get_user_cmd_flags (expand_T *xp, int idx);
char_u *get_user_cmd_nargs (expand_T *xp, int idx);
char_u *get_user_cmd_complete (expand_T *xp, int idx);
int parse_compl_arg (char_u *value, int vallen, int *complp, long *argt, char_u **compl_arg);
void not_exiting (void);
void tabpage_close (int forceit);
void tabpage_close_other (tabpage_T *tp, int forceit);
void ex_all (exarg_T *eap);
void handle_drop (int filec, char_u **filev, int split);
void alist_clear (alist_T *al);
void alist_init (alist_T *al);
void alist_unlink (alist_T *al);
void alist_new (void);
void alist_expand (int *fnum_list, int fnum_len);
void alist_set (alist_T *al, int count, char_u **files, int use_curbuf, int *fnum_list, int fnum_len);
void alist_add (alist_T *al, char_u *fname, int set_fnum);
void alist_slash_adjust (void);
void ex_splitview (exarg_T *eap);
void tabpage_new (void);
void do_exedit (exarg_T *eap, win_T *old_curwin);
void free_cd_dir (void);
void ex_cd (exarg_T *eap);
void do_sleep (long msec);
int vim_mkdir_emsg (char_u *name, int prot);
FILE *open_exfile (char_u *fname, int forceit, char *mode);
void update_topline_cursor (void);
void exec_normal_cmd (char_u *cmd, int remap, int silent);
int find_cmdline_var (char_u *src, int *usedlen);
char_u *eval_vars (char_u *src, char_u *srcstart, int *usedlen, linenr_T *lnump, char_u **errormsg, int *escaped);
char_u *expand_sfile (char_u *arg);
int put_eol (FILE *fd);
int put_line (FILE *fd, char *s);
void dialog_msg (char_u *buff, char *format, char_u *fname);
char_u *get_behave_arg (expand_T *xp, int idx);
# 87 "proto.h" 2
# 1 "proto/ex_eval.pro" 1

int aborting (void);
void update_force_abort (void);
int should_abort (int retcode);
int aborted_in_try (void);
int cause_errthrow (char_u *mesg, int severe, int *ignore);
void do_errthrow (struct condstack *cstack, char_u *cmdname);
int do_intthrow (struct condstack *cstack);
void discard_current_exception (void);
void report_make_pending (int pending, void *value);
void report_resume_pending (int pending, void *value);
void report_discard_pending (int pending, void *value);
void ex_if (exarg_T *eap);
void ex_endif (exarg_T *eap);
void ex_else (exarg_T *eap);
void ex_while (exarg_T *eap);
void ex_continue (exarg_T *eap);
void ex_break (exarg_T *eap);
void ex_endwhile (exarg_T *eap);
void ex_throw (exarg_T *eap);
void do_throw (struct condstack *cstack);
void ex_try (exarg_T *eap);
void ex_catch (exarg_T *eap);
void ex_finally (exarg_T *eap);
void ex_endtry (exarg_T *eap);
void enter_cleanup (cleanup_T *csp);
void leave_cleanup (cleanup_T *csp);
int cleanup_conditionals (struct condstack *cstack, int searched_cond, int inclusive);
void rewind_conditionals (struct condstack *cstack, int idx, int cond_type, int *cond_level);
void ex_endfunction (exarg_T *eap);
int has_loop_cmd (char_u *p);
# 88 "proto.h" 2
# 1 "proto/ex_getln.pro" 1

char_u *getcmdline (int firstc, long count, int indent);
char_u *getcmdline_prompt (int firstc, char_u *prompt, int attr, int xp_context, char_u *xp_arg);
int text_locked (void);
void text_locked_msg (void);
int curbuf_locked (void);
int allbuf_locked (void);
char_u *getexline (int c, void *cookie, int indent);
char_u *getexmodeline (int promptc, void *cookie, int indent);
int cmdline_overstrike (void);
int cmdline_at_end (void);
colnr_T cmdline_getvcol_cursor (void);
void free_cmdline_buf (void);
void putcmdline (int c, int shift);
void unputcmdline (void);
int put_on_cmdline (char_u *str, int len, int redraw);
char_u *save_cmdline_alloc (void);
void restore_cmdline_alloc (char_u *p);
void cmdline_paste_str (char_u *s, int literally);
void redrawcmdline (void);
void redrawcmd (void);
void compute_cmdrow (void);
void gotocmdline (int clr);
char_u *ExpandOne (expand_T *xp, char_u *str, char_u *orig, int options, int mode);
void ExpandInit (expand_T *xp);
void ExpandCleanup (expand_T *xp);
void ExpandEscape (expand_T *xp, char_u *str, int numfiles, char_u **files, int options);
char_u *vim_strsave_fnameescape (char_u *fname, int shell);
void tilde_replace (char_u *orig_pat, int num_files, char_u **files);
char_u *sm_gettail (char_u *s);
char_u *addstar (char_u *fname, int len, int context);
void set_cmd_context (expand_T *xp, char_u *str, int len, int col);
int expand_cmdline (expand_T *xp, char_u *str, int col, int *matchcount, char_u ***matches);
int ExpandGeneric (expand_T *xp, regmatch_T *regmatch, int *num_file, char_u ***file, char_u *((*func)(expand_T *, int)));
char_u *globpath (char_u *path, char_u *file, int expand_options);
void init_history (void);
int get_histtype (char_u *name);
void add_to_history (int histype, char_u *new_entry, int in_map, int sep);
int get_history_idx (int histype);
char_u *get_cmdline_str (void);
int get_cmdline_pos (void);
int set_cmdline_pos (int pos);
int get_cmdline_type (void);
char_u *get_history_entry (int histype, int idx);
int clr_history (int histype);
int del_history_entry (int histype, char_u *str);
int del_history_idx (int histype, int idx);
void remove_key_from_history (void);
int get_list_range (char_u **str, int *num1, int *num2);
void ex_history (exarg_T *eap);
void prepare_viminfo_history (int asklen);
int read_viminfo_history (vir_T *virp);
void finish_viminfo_history (void);
void write_viminfo_history (FILE *fp);
void cmd_pchar (int c, int offset);
int cmd_gchar (int offset);
char_u *script_get (exarg_T *eap, char_u *cmd);
# 89 "proto.h" 2
# 1 "proto/fileio.pro" 1

void filemess (buf_T *buf, char_u *name, char_u *s, int attr);
int readfile (char_u *fname, char_u *sfname, linenr_T from, linenr_T lines_to_skip, linenr_T lines_to_read, exarg_T *eap, int flags);
int prep_exarg (exarg_T *eap, buf_T *buf);
int prepare_crypt_read (FILE *fp);
char_u *prepare_crypt_write (buf_T *buf, int *lenp);
int check_file_readonly (char_u *fname, int perm);
int buf_write (buf_T *buf, char_u *fname, char_u *sfname, linenr_T start, linenr_T end, exarg_T *eap, int append, int forceit, int reset_changed, int filtering);
void msg_add_fname (buf_T *buf, char_u *fname);
void msg_add_lines (int insert_space, long lnum, off_t nchars);
char_u *shorten_fname1 (char_u *full_path);
char_u *shorten_fname (char_u *full_path, char_u *dir_name);
void shorten_fnames (int force);
void shorten_filenames (char_u **fnames, int count);
char_u *modname (char_u *fname, char_u *ext, int prepend_dot);
char_u *buf_modname (int shortname, char_u *fname, char_u *ext, int prepend_dot);
int vim_fgets (char_u *buf, int size, FILE *fp);
int tag_fgets (char_u *buf, int size, FILE *fp);
int vim_rename (char_u *from, char_u *to);
int check_timestamps (int focus);
int buf_check_timestamp (buf_T *buf, int focus);
void buf_reload (buf_T *buf, int orig_mode);
void buf_store_time (buf_T *buf, struct stat *st, char_u *fname);
void write_lnum_adjust (linenr_T offset);
void vim_deltempdir (void);
char_u *vim_tempname (int extra_char);
void forward_slash (char_u *fname);
void aubuflocal_remove (buf_T *buf);
int au_has_group (char_u *name);
void do_augroup (char_u *arg, int del_group);
void free_all_autocmds (void);
int check_ei (void);
char_u *au_event_disable (char *what);
void au_event_restore (char_u *old_ei);
void do_autocmd (char_u *arg, int forceit);
int do_doautocmd (char_u *arg, int do_msg);
void ex_doautoall (exarg_T *eap);
void aucmd_prepbuf (aco_save_T *aco, buf_T *buf);
void aucmd_restbuf (aco_save_T *aco);
int apply_autocmds (event_T event, char_u *fname, char_u *fname_io, int force, buf_T *buf);
int apply_autocmds_retval (event_T event, char_u *fname, char_u *fname_io, int force, buf_T *buf, int *retval);
int has_cursorhold (void);
int trigger_cursorhold (void);
int has_cursormoved (void);
int has_cursormovedI (void);
void block_autocmds (void);
void unblock_autocmds (void);
int has_autocmd (event_T event, char_u *sfname, buf_T *buf);
char_u *get_augroup_name (expand_T *xp, int idx);
char_u *set_context_in_autocmd (expand_T *xp, char_u *arg, int doautocmd);
char_u *get_event_name (expand_T *xp, int idx);
int autocmd_supported (char_u *name);
int au_exists (char_u *arg);
int match_file_pat (char_u *pattern, regprog_T *prog, char_u *fname, char_u *sfname, char_u *tail, int allow_dirs);
int match_file_list (char_u *list, char_u *sfname, char_u *ffname);
char_u *file_pat_to_reg_pat (char_u *pat, char_u *pat_end, char *allow_dirs, int no_bslash);
# 90 "proto.h" 2
# 1 "proto/fold.pro" 1

void copyFoldingState (win_T *wp_from, win_T *wp_to);
int hasAnyFolding (win_T *win);
int hasFolding (linenr_T lnum, linenr_T *firstp, linenr_T *lastp);
int hasFoldingWin (win_T *win, linenr_T lnum, linenr_T *firstp, linenr_T *lastp, int cache, foldinfo_T *infop);
int foldLevel (linenr_T lnum);
int lineFolded (win_T *win, linenr_T lnum);
long foldedCount (win_T *win, linenr_T lnum, foldinfo_T *infop);
int foldmethodIsManual (win_T *wp);
int foldmethodIsIndent (win_T *wp);
int foldmethodIsExpr (win_T *wp);
int foldmethodIsMarker (win_T *wp);
int foldmethodIsSyntax (win_T *wp);
int foldmethodIsDiff (win_T *wp);
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
void clearFolding (win_T *win);
void foldUpdate (win_T *wp, linenr_T top, linenr_T bot);
void foldUpdateAll (win_T *win);
int foldMoveTo (int updown, int dir, long count);
void foldInitWin (win_T *newwin);
int find_wl_entry (win_T *win, linenr_T lnum);
void foldAdjustVisual (void);
void foldAdjustCursor (void);
void cloneFoldGrowArray (garray_T *from, garray_T *to);
void deleteFoldRecurse (garray_T *gap);
void foldMarkAdjust (win_T *wp, linenr_T line1, linenr_T line2, long amount, long amount_after);
int getDeepestNesting (void);
char_u *get_foldtext (win_T *wp, linenr_T lnum, linenr_T lnume, foldinfo_T *foldinfo, char_u *buf);
void foldtext_cleanup (char_u *str);
int put_folds (FILE *fd, win_T *wp);
# 91 "proto.h" 2
# 1 "proto/getchar.pro" 1

void free_buff (struct buffheader *buf);
char_u *get_recorded (void);
char_u *get_inserted (void);
int stuff_empty (void);
void typeahead_noflush (int c);
void flush_buffers (int typeahead);
void ResetRedobuff (void);
void saveRedobuff (void);
void restoreRedobuff (void);
void AppendToRedobuff (char_u *s);
void AppendToRedobuffLit (char_u *str, int len);
void AppendCharToRedobuff (int c);
void AppendNumberToRedobuff (long n);
void stuffReadbuff (char_u *s);
void stuffReadbuffLen (char_u *s, long len);
void stuffReadbuffSpec (char_u *s);
void stuffcharReadbuff (int c);
void stuffnumReadbuff (long n);
int start_redo (long count, int old_redo);
int start_redo_ins (void);
void stop_redo_ins (void);
int ins_typebuf (char_u *str, int noremap, int offset, int nottyped, int silent);
void ins_char_typebuf (int c);
int typebuf_changed (int tb_change_cnt);
int typebuf_typed (void);
int typebuf_maplen (void);
void del_typebuf (int len, int offset);
int alloc_typebuf (void);
void free_typebuf (void);
int save_typebuf (void);
void save_typeahead (tasave_T *tp);
void restore_typeahead (tasave_T *tp);
void openscript (char_u *name, int directly);
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
int inchar (char_u *buf, int maxlen, long wait_time, int tb_change_cnt);
int fix_input_buffer (char_u *buf, int len, int script);
int input_available (void);
int do_map (int maptype, char_u *arg, int mode, int abbrev);
int get_map_mode (char_u **cmdp, int forceit);
void map_clear (char_u *cmdp, char_u *arg, int forceit, int abbr);
void map_clear_int (buf_T *buf, int mode, int local, int abbr);
int map_to_exists (char_u *str, char_u *modechars, int abbr);
int map_to_exists_mode (char_u *rhs, int mode, int abbr);
char_u *set_context_in_map_cmd (expand_T *xp, char_u *cmd, char_u *arg, int forceit, int isabbrev, int isunmap, cmdidx_T cmdidx);
int ExpandMappings (regmatch_T *regmatch, int *num_file, char_u ***file);
int check_abbr (int c, char_u *ptr, int col, int mincol);
char_u *vim_strsave_escape_csi (char_u *p);
void vim_unescape_csi (char_u *p);
int makemap (FILE *fd, buf_T *buf);
int put_escstr (FILE *fd, char_u *strstart, int what);
void check_map_keycodes (void);
char_u *check_map (char_u *keys, int mode, int exact, int ign_mod, int abbr);
void init_mappings (void);
void add_map (char_u *map, int mode);
# 92 "proto.h" 2



# 1 "proto/hardcopy.pro" 1

char_u *parse_printoptions (void);
char_u *parse_printmbfont (void);
int prt_header_height (void);
int prt_use_number (void);
int prt_get_unit (int idx);
void ex_hardcopy (exarg_T *eap);
void mch_print_cleanup (void);
int mch_print_init (prt_settings_T *psettings, char_u *jobname, int forceit);
int mch_print_begin (prt_settings_T *psettings);
void mch_print_end (prt_settings_T *psettings);
int mch_print_end_page (void);
int mch_print_begin_page (char_u *str);
int mch_print_blank_page (void);
void mch_print_start_line (int margin, int page_line);
int mch_print_text_out (char_u *p, int len);
void mch_print_set_font (int iBold, int iItalic, int iUnderline);
void mch_print_set_bg (long_u bgcol);
void mch_print_set_fg (long_u fgcol);
# 96 "proto.h" 2
# 1 "proto/hashtab.pro" 1

void hash_init (hashtab_T *ht);
void hash_clear (hashtab_T *ht);
void hash_clear_all (hashtab_T *ht, int off);
hashitem_T *hash_find (hashtab_T *ht, char_u *key);
hashitem_T *hash_lookup (hashtab_T *ht, char_u *key, hash_T hash);
void hash_debug_results (void);
int hash_add (hashtab_T *ht, char_u *key);
int hash_add_item (hashtab_T *ht, hashitem_T *hi, char_u *key, hash_T hash);
void hash_remove (hashtab_T *ht, hashitem_T *hi);
void hash_lock (hashtab_T *ht);
void hash_unlock (hashtab_T *ht);
hash_T hash_hash (char_u *key);
# 97 "proto.h" 2
# 1 "proto/main.pro" 1

void main_loop (int cmdwin, int noexmode);
void getout_preserve_modified (int exitval);
void getout (int exitval);
int process_env (char_u *env, int is_viminit);
void mainerr_arg_missing (char_u *str);
void time_push (void *tv_rel, void *tv_start);
void time_pop (void *tp);
void time_msg (char *mesg, void *tv_start);
void server_to_input_buf (char_u *str);
char_u *eval_client_expr_to_string (char_u *expr);
char_u *serverConvert (char_u *client_enc, char_u *data, char_u **tofree);
int toF_TyA (int c);
int fkmap (int c);
void conv_to_pvim (void);
void conv_to_pstd (void);
char_u *lrswap (char_u *ibuf);
char_u *lrFswap (char_u *cmdbuf, int len);
char_u *lrF_sub (char_u *ibuf);
int cmdl_fkmap (int c);
int F_isalpha (int c);
int F_isdigit (int c);
int F_ischar (int c);
void farsi_fkey (cmdarg_T *cap);
int arabic_shape (int c, int *ccp, int *c1p, int prev_c, int prev_c1, int next_c);
# 98 "proto.h" 2
# 1 "proto/mark.pro" 1

int setmark (int c);
int setmark_pos (int c, pos_T *pos, int fnum);
void setpcmark (void);
void checkpcmark (void);
pos_T *movemark (int count);
pos_T *movechangelist (int count);
pos_T *getmark (int c, int changefile);
pos_T *getmark_fnum (int c, int changefile, int *fnum);
pos_T *getnextmark (pos_T *startpos, int dir, int begin_line);
void fmarks_check_names (buf_T *buf);
int check_mark (pos_T *pos);
void clrallmarks (buf_T *buf);
char_u *fm_getname (fmark_T *fmark, int lead_len);
void do_marks (exarg_T *eap);
void ex_delmarks (exarg_T *eap);
void ex_jumps (exarg_T *eap);
void ex_changes (exarg_T *eap);
void mark_adjust (linenr_T line1, linenr_T line2, long amount, long amount_after);
void mark_col_adjust (linenr_T lnum, colnr_T mincol, long lnum_amount, long col_amount);
void copy_jumplist (win_T *from, win_T *to);
void free_jumplist (win_T *wp);
void set_last_cursor (win_T *win);
void free_all_marks (void);
int read_viminfo_filemark (vir_T *virp, int force);
void write_viminfo_filemarks (FILE *fp);
int removable (char_u *name);
int write_viminfo_marks (FILE *fp_out);
void copy_viminfo_marks (vir_T *virp, FILE *fp_out, int count, int eof, int flags);
# 99 "proto.h" 2
# 1 "proto/memfile.pro" 1

memfile_T *mf_open (char_u *fname, int flags);
int mf_open_file (memfile_T *mfp, char_u *fname);
void mf_close (memfile_T *mfp, int del_file);
void mf_close_file (buf_T *buf, int getlines);
void mf_new_page_size (memfile_T *mfp, unsigned new_size);
bhdr_T *mf_new (memfile_T *mfp, int negative, int page_count);
bhdr_T *mf_get (memfile_T *mfp, blocknr_T nr, int page_count);
void mf_put (memfile_T *mfp, bhdr_T *hp, int dirty, int infile);
void mf_free (memfile_T *mfp, bhdr_T *hp);
int mf_sync (memfile_T *mfp, int flags);
void mf_set_dirty (memfile_T *mfp);
int mf_release_all (void);
blocknr_T mf_trans_del (memfile_T *mfp, blocknr_T old_nr);
void mf_set_ffname (memfile_T *mfp);
void mf_fullname (memfile_T *mfp);
int mf_need_trans (memfile_T *mfp);
# 100 "proto.h" 2
# 1 "proto/memline.pro" 1

int ml_open (buf_T *buf);
void ml_set_crypt_key (buf_T *buf, char_u *old_key, int old_cm);
void ml_setname (buf_T *buf);
void ml_open_files (void);
void ml_open_file (buf_T *buf);
void check_need_swap (int newfile);
void ml_close (buf_T *buf, int del_file);
void ml_close_all (int del_file);
void ml_close_notmod (void);
void ml_timestamp (buf_T *buf);
void ml_recover (void);
int recover_names (char_u *fname, int list, int nr, char_u **fname_out);
void ml_sync_all (int check_file, int check_char);
void ml_preserve (buf_T *buf, int message);
char_u *ml_get (linenr_T lnum);
char_u *ml_get_pos (pos_T *pos);
char_u *ml_get_curline (void);
char_u *ml_get_cursor (void);
char_u *ml_get_buf (buf_T *buf, linenr_T lnum, int will_change);
int ml_line_alloced (void);
int ml_append (linenr_T lnum, char_u *line, colnr_T len, int newfile);
int ml_append_buf (buf_T *buf, linenr_T lnum, char_u *line, colnr_T len, int newfile);
int ml_replace (linenr_T lnum, char_u *line, int copy);
int ml_delete (linenr_T lnum, int message);
void ml_setmarked (linenr_T lnum);
linenr_T ml_firstmarked (void);
void ml_clearmarked (void);
int resolve_symlink (char_u *fname, char_u *buf);
char_u *makeswapname (char_u *fname, char_u *ffname, buf_T *buf, char_u *dir_name);
char_u *get_file_in_dir (char_u *fname, char_u *dname);
void ml_setflags (buf_T *buf);
char_u *ml_encrypt_data (memfile_T *mfp, char_u *data, off_t offset, unsigned size);
void ml_decrypt_data (memfile_T *mfp, char_u *data, off_t offset, unsigned size);
long ml_find_line_or_offset (buf_T *buf, linenr_T lnum, long *offp);
void goto_byte (long cnt);
# 101 "proto.h" 2

# 1 "proto/menu.pro" 1

void ex_menu (exarg_T *eap);
char_u *set_context_in_menu_cmd (expand_T *xp, char_u *cmd, char_u *arg, int forceit);
char_u *get_menu_name (expand_T *xp, int idx);
char_u *get_menu_names (expand_T *xp, int idx);
char_u *menu_name_skip (char_u *name);
int get_menu_index (vimmenu_T *menu, int state);
int menu_is_menubar (char_u *name);
int menu_is_popup (char_u *name);
int menu_is_child_of_popup (vimmenu_T *menu);
int menu_is_toolbar (char_u *name);
int menu_is_separator (char_u *name);
int check_menu_pointer (vimmenu_T *root, vimmenu_T *menu_to_check);
void gui_create_initial_menus (vimmenu_T *menu);
void gui_update_menus (int modes);
int gui_is_menu_shortcut (int key);
void gui_show_popupmenu (void);
void gui_mch_toggle_tearoffs (int enable);
void ex_emenu (exarg_T *eap);
vimmenu_T *gui_find_menu (char_u *path_name);
void ex_menutranslate (exarg_T *eap);
# 103 "proto.h" 2





int



smsg (char_u *, ...);

int



smsg_attr (int, char_u *, ...);

int



vim_snprintf_add (char *, size_t, char *, ...);

int



vim_snprintf (char *, size_t, char *, ...);


int vim_vsnprintf(char *str, size_t str_m, char *fmt, va_list ap, typval_T *tvs);



# 1 "proto/message.pro" 1

int msg (char_u *s);
int verb_msg (char_u *s);
int msg_attr (char_u *s, int attr);
int msg_attr_keep (char_u *s, int attr, int keep);
char_u *msg_strtrunc (char_u *s, int force);
void trunc_string (char_u *s, char_u *buf, int room);
void reset_last_sourcing (void);
void msg_source (int attr);
int emsg_not_now (void);
int emsg (char_u *s);
int emsg2 (char_u *s, char_u *a1);
void emsg_invreg (int name);
char_u *msg_trunc_attr (char_u *s, int force, int attr);
char_u *msg_may_trunc (int force, char_u *s);
int delete_first_msg (void);
void ex_messages (exarg_T *eap);
void msg_end_prompt (void);
void wait_return (int redraw);
void set_keep_msg (char_u *s, int attr);
void set_keep_msg_from_hist (void);
void msg_start (void);
void msg_starthere (void);
void msg_putchar (int c);
void msg_putchar_attr (int c, int attr);
void msg_outnum (long n);
void msg_home_replace (char_u *fname);
void msg_home_replace_hl (char_u *fname);
int msg_outtrans (char_u *str);
int msg_outtrans_attr (char_u *str, int attr);
int msg_outtrans_len (char_u *str, int len);
char_u *msg_outtrans_one (char_u *p, int attr);
int msg_outtrans_len_attr (char_u *msgstr, int len, int attr);
void msg_make (char_u *arg);
int msg_outtrans_special (char_u *strstart, int from);
char_u *str2special (char_u **sp, int from);
void str2specialbuf (char_u *sp, char_u *buf, int len);
void msg_prt_line (char_u *s, int list);
void msg_puts (char_u *s);
void msg_puts_title (char_u *s);
void msg_puts_long_attr (char_u *longstr, int attr);
void msg_puts_long_len_attr (char_u *longstr, int len, int attr);
void msg_puts_attr (char_u *s, int attr);
void may_clear_sb_text (void);
void clear_sb_text (void);
void show_sb_text (void);
int msg_use_printf (void);
void mch_errmsg (char *str);
void mch_msg (char *str);
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
void give_warning (char_u *message, int hl);
void msg_advance (int col);
int do_dialog (int type, char_u *title, char_u *message, char_u *buttons, int dfltbutton, char_u *textfield);
void display_confirm_msg (void);
int vim_dialog_yesno (int type, char_u *title, char_u *message, int dflt);
int vim_dialog_yesnocancel (int type, char_u *title, char_u *message, int dflt);
int vim_dialog_yesnoallcancel (int type, char_u *title, char_u *message, int dflt);
char_u *do_browse (int flags, char_u *title, char_u *dflt, char_u *ext, char_u *initdir, char_u *filter, buf_T *buf);
# 138 "proto.h" 2
# 1 "proto/misc1.pro" 1

int get_indent (void);
int get_indent_lnum (linenr_T lnum);
int get_indent_buf (buf_T *buf, linenr_T lnum);
int get_indent_str (char_u *ptr, int ts);
int set_indent (int size, int flags);
int get_number_indent (linenr_T lnum);
int open_line (int dir, int flags, int old_indent);
int get_leader_len (char_u *line, char_u **flags, int backward);
int plines (linenr_T lnum);
int plines_win (win_T *wp, linenr_T lnum, int winheight);
int plines_nofill (linenr_T lnum);
int plines_win_nofill (win_T *wp, linenr_T lnum, int winheight);
int plines_win_nofold (win_T *wp, linenr_T lnum);
int plines_win_col (win_T *wp, linenr_T lnum, long column);
int plines_m_win (win_T *wp, linenr_T first, linenr_T last);
void ins_bytes (char_u *p);
void ins_bytes_len (char_u *p, int len);
void ins_char (int c);
void ins_char_bytes (char_u *buf, int charlen);
void ins_str (char_u *s);
int del_char (int fixpos);
int del_chars (long count, int fixpos);
int del_bytes (long count, int fixpos_arg, int use_delcombine);
int truncate_line (int fixpos);
void del_lines (long nlines, int undo);
int gchar_pos (pos_T *pos);
int gchar_cursor (void);
void pchar_cursor (int c);
int inindent (int extra);
char_u *skip_to_option_part (char_u *p);
void changed (void);
void changed_int (void);
void changed_bytes (linenr_T lnum, colnr_T col);
void appended_lines (linenr_T lnum, long count);
void appended_lines_mark (linenr_T lnum, long count);
void deleted_lines (linenr_T lnum, long count);
void deleted_lines_mark (linenr_T lnum, long count);
void changed_lines (linenr_T lnum, colnr_T col, linenr_T lnume, long xtra);
void unchanged (buf_T *buf, int ff);
void check_status (buf_T *buf);
void change_warning (int col);
int ask_yesno (char_u *str, int direct);
int get_keystroke (void);
int get_number (int colon, int *mouse_used);
int prompt_for_number (int *mouse_used);
void msgmore (long n);
void beep_flush (void);
void vim_beep (void);
void init_homedir (void);
void free_homedir (void);
char_u *expand_env_save (char_u *src);
char_u *expand_env_save_opt (char_u *src, int one);
void expand_env (char_u *src, char_u *dst, int dstlen);
void expand_env_esc (char_u *srcp, char_u *dst, int dstlen, int esc, int one, char_u *startstr);
char_u *vim_getenv (char_u *name, int *mustfree);
void vim_setenv (char_u *name, char_u *val);
char_u *get_env_name (expand_T *xp, int idx);
void home_replace (buf_T *buf, char_u *src, char_u *dst, int dstlen, int one);
char_u *home_replace_save (buf_T *buf, char_u *src);
int fullpathcmp (char_u *s1, char_u *s2, int checkname);
char_u *gettail (char_u *fname);
char_u *gettail_sep (char_u *fname);
char_u *getnextcomp (char_u *fname);
char_u *get_past_head (char_u *path);
int vim_ispathsep (int c);
int vim_ispathlistsep (int c);
void shorten_dir (char_u *str);
int dir_of_file_exists (char_u *fname);
int vim_fnamecmp (char_u *x, char_u *y);
int vim_fnamencmp (char_u *x, char_u *y, size_t len);
char_u *concat_fnames (char_u *fname1, char_u *fname2, int sep);
char_u *concat_str (char_u *str1, char_u *str2);
void add_pathsep (char_u *p);
char_u *FullName_save (char_u *fname, int force);
pos_T *find_start_comment (int ind_maxcomment);
void do_c_expr_indent (void);
int cin_islabel (int ind_maxcomment);
int cin_iscase (char_u *s, int strict);
int cin_isscopedecl (char_u *s);
int get_c_indent (void);
int get_expr_indent (void);
int get_lisp_indent (void);
void prepare_to_exit (void);
void preserve_exit (void);
int vim_fexists (char_u *fname);
void line_breakcheck (void);
void fast_breakcheck (void);
int expand_wildcards_eval (char_u **pat, int *num_file, char_u ***file, int flags);
int expand_wildcards (int num_pat, char_u **pat, int *num_file, char_u ***file, int flags);
int match_suffix (char_u *fname);
int unix_expandpath (garray_T *gap, char_u *path, int wildoff, int flags, int didstar);
void remove_duplicates (garray_T *gap);
int gen_expand_wildcards (int num_pat, char_u **pat, int *num_file, char_u ***file, int flags);
void addfile (garray_T *gap, char_u *f, int flags);
char_u *get_cmd_output (char_u *cmd, char_u *infile, int flags);
void FreeWild (int count, char_u **files);
int goto_im (void);
# 139 "proto.h" 2
# 1 "proto/misc2.pro" 1

int virtual_active (void);
int getviscol (void);
int getviscol2 (colnr_T col, colnr_T coladd);
int coladvance_force (colnr_T wcol);
int coladvance (colnr_T wcol);
int getvpos (pos_T *pos, colnr_T wcol);
int inc_cursor (void);
int inc (pos_T *lp);
int incl (pos_T *lp);
int dec_cursor (void);
int dec (pos_T *lp);
int decl (pos_T *lp);
linenr_T get_cursor_rel_lnum (win_T *wp, linenr_T lnum);
void check_cursor_lnum (void);
void check_cursor_col (void);
void check_cursor (void);
void adjust_cursor_col (void);
int leftcol_changed (void);
void vim_mem_profile_dump (void);
char_u *alloc (unsigned size);
char_u *alloc_clear (unsigned size);
char_u *alloc_check (unsigned size);
char_u *lalloc_clear (long_u size, int message);
char_u *lalloc (long_u size, int message);
void *mem_realloc (void *ptr, size_t size);
void do_outofmem_msg (long_u size);
void free_all_mem (void);
char_u *vim_strsave (char_u *string);
char_u *vim_strnsave (char_u *string, int len);
char_u *vim_strsave_escaped (char_u *string, char_u *esc_chars);
char_u *vim_strsave_escaped_ext (char_u *string, char_u *esc_chars, int cc, int bsl);
int csh_like_shell (void);
char_u *vim_strsave_shellescape (char_u *string, int do_special);
char_u *vim_strsave_up (char_u *string);
char_u *vim_strnsave_up (char_u *string, int len);
void vim_strup (char_u *p);
char_u *strup_save (char_u *orig);
void copy_spaces (char_u *ptr, size_t count);
void copy_chars (char_u *ptr, size_t count, int c);
void del_trailing_spaces (char_u *ptr);
void vim_strncpy (char_u *to, char_u *from, size_t len);
int copy_option_part (char_u **option, char_u *buf, int maxlen, char *sep_chars);
void vim_free (void *x);
int vim_stricmp (char *s1, char *s2);
int vim_strnicmp (char *s1, char *s2, size_t len);
char_u *vim_strchr (char_u *string, int c);
char_u *vim_strbyte (char_u *string, int c);
char_u *vim_strrchr (char_u *string, int c);
int vim_isspace (int x);
void ga_clear (garray_T *gap);
void ga_clear_strings (garray_T *gap);
void ga_init (garray_T *gap);
void ga_init2 (garray_T *gap, int itemsize, int growsize);
int ga_grow (garray_T *gap, int n);
char_u *ga_concat_strings (garray_T *gap);
void ga_concat (garray_T *gap, char_u *s);
void ga_append (garray_T *gap, int c);
int name_to_mod_mask (int c);
int simplify_key (int key, int *modifiers);
int handle_x_keys (int key);
char_u *get_special_key_name (int c, int modifiers);
int trans_special (char_u **srcp, char_u *dst, int keycode);
int find_special_key (char_u **srcp, int *modp, int keycode, int keep_x_key);
int extract_modifiers (int key, int *modp);
int find_special_key_in_table (int c);
int get_special_key_code (char_u *name);
char_u *get_key_name (int i);
int get_mouse_button (int code, int *is_click, int *is_drag);
int get_pseudo_mouse_code (int button, int is_click, int is_drag);
int get_fileformat (buf_T *buf);
int get_fileformat_force (buf_T *buf, exarg_T *eap);
void set_fileformat (int t, int opt_flags);
int default_fileformat (void);
int call_shell (char_u *cmd, int opt);
int get_real_state (void);
int after_pathsep (char_u *b, char_u *p);
int same_directory (char_u *f1, char_u *f2);
int vim_chdirfile (char_u *fname);
int illegal_slash (char *name);
char_u *parse_shape_opt (int what);
int get_shape_idx (int mouse);
void update_mouseshape (int shape_idx);
int crypt_method_from_string (char_u *s);
int get_crypt_method (buf_T *buf);
void set_crypt_method (buf_T *buf, int method);
void crypt_push_state (void);
void crypt_pop_state (void);
void crypt_encode (char_u *from, size_t len, char_u *to);
void crypt_decode (char_u *ptr, long len);
void crypt_init_keys (char_u *passwd);
void free_crypt_key (char_u *key);
char_u *get_crypt_key (int store, int twice);
void *vim_findfile_init (char_u *path, char_u *filename, char_u *stopdirs, int level, int free_visited, int find_what, void *search_ctx_arg, int tagfile, char_u *rel_fname);
char_u *vim_findfile_stopdir (char_u *buf);
void vim_findfile_cleanup (void *ctx);
char_u *vim_findfile (void *search_ctx_arg);
void vim_findfile_free_visited (void *search_ctx_arg);
char_u *find_file_in_path (char_u *ptr, int len, int options, int first, char_u *rel_fname);
char_u *find_directory_in_path (char_u *ptr, int len, int options, char_u *rel_fname);
char_u *find_file_in_path_option (char_u *ptr, int len, int options, int first, char_u *path_option, int find_what, char_u *rel_fname, char_u *suffixes);
int vim_chdir (char_u *new_dir);
int get_user_name (char_u *buf, int len);
void sort_strings (char_u **files, int count);
int pathcmp (const char *p, const char *q, int maxlen);
int filewritable (char_u *fname);
int emsg3 (char_u *s, char_u *a1, char_u *a2);
int emsgn (char_u *s, long n);
int get2c (FILE *fd);
int get3c (FILE *fd);
int get4c (FILE *fd);
time_t get8ctime (FILE *fd);
char_u *read_string (FILE *fd, int cnt);
int put_bytes (FILE *fd, long_u nr, int len);
void put_time (FILE *fd, time_t the_time);
# 140 "proto.h" 2







# 1 "proto/move.pro" 1

void update_topline_redraw (void);
void update_topline (void);
void update_curswant (void);
void check_cursor_moved (win_T *wp);
void changed_window_setting (void);
void changed_window_setting_win (win_T *wp);
void set_topline (win_T *wp, linenr_T lnum);
void changed_cline_bef_curs (void);
void changed_cline_bef_curs_win (win_T *wp);
void changed_line_abv_curs (void);
void changed_line_abv_curs_win (win_T *wp);
void validate_botline (void);
void invalidate_botline (void);
void invalidate_botline_win (win_T *wp);
void approximate_botline_win (win_T *wp);
int cursor_valid (void);
void validate_cursor (void);
void validate_cline_row (void);
void validate_virtcol (void);
void validate_virtcol_win (win_T *wp);
void validate_cursor_col (void);
int win_col_off (win_T *wp);
int curwin_col_off (void);
int win_col_off2 (win_T *wp);
int curwin_col_off2 (void);
void curs_columns (int scroll);
void scrolldown (long line_count, int byfold);
void scrollup (long line_count, int byfold);
void check_topfill (win_T *wp, int down);
void scrolldown_clamp (void);
void scrollup_clamp (void);
void scroll_cursor_top (int min_scroll, int always);
void set_empty_rows (win_T *wp, int used);
void scroll_cursor_bot (int min_scroll, int set_topbot);
void scroll_cursor_halfway (int atend);
void cursor_correct (void);
int onepage (int dir, long count);
void halfpage (int flag, linenr_T Prenum);
void do_check_cursorbind (void);
# 148 "proto.h" 2


# 1 "proto/mbyte.pro" 1

int enc_canon_props (char_u *name);
char_u *mb_init (void);
int bomb_size (void);
int mb_get_class (char_u *p);
int dbcs_class (unsigned lead, unsigned trail);
int latin_char2len (int c);
int latin_char2bytes (int c, char_u *buf);
int latin_ptr2len (char_u *p);
int latin_ptr2len_len (char_u *p, int size);
int utf_char2cells (int c);
int latin_ptr2cells (char_u *p);
int utf_ptr2cells (char_u *p);
int dbcs_ptr2cells (char_u *p);
int latin_ptr2cells_len (char_u *p, int size);
int latin_char2cells (int c);
int mb_string2cells (char_u *p, int len);
int latin_off2cells (unsigned off, unsigned max_off);
int dbcs_off2cells (unsigned off, unsigned max_off);
int utf_off2cells (unsigned off, unsigned max_off);
int latin_ptr2char (char_u *p);
int utf_ptr2char (char_u *p);
int mb_ptr2char_adv (char_u **pp);
int mb_cptr2char_adv (char_u **pp);
int arabic_combine (int one, int two);
int arabic_maycombine (int two);
int utf_composinglike (char_u *p1, char_u *p2);
int utfc_ptr2char (char_u *p, int *pcc);
int utfc_ptr2char_len (char_u *p, int *pcc, int maxlen);
int utfc_char2bytes (int off, char_u *buf);
int utf_ptr2len (char_u *p);
int utf_byte2len (int b);
int utf_ptr2len_len (char_u *p, int size);
int utfc_ptr2len (char_u *p);
int utfc_ptr2len_len (char_u *p, int size);
int utf_char2len (int c);
int utf_char2bytes (int c, char_u *buf);
int utf_iscomposing (int c);
int utf_printable (int c);
int utf_class (int c);
int utf_fold (int a);
int utf_toupper (int a);
int utf_islower (int a);
int utf_tolower (int a);
int utf_isupper (int a);
int mb_strnicmp (char_u *s1, char_u *s2, size_t nn);
void show_utf8 (void);
int latin_head_off (char_u *base, char_u *p);
int dbcs_head_off (char_u *base, char_u *p);
int dbcs_screen_head_off (char_u *base, char_u *p);
int utf_head_off (char_u *base, char_u *p);
void mb_copy_char (char_u **fp, char_u **tp);
int mb_off_next (char_u *base, char_u *p);
int mb_tail_off (char_u *base, char_u *p);
void utf_find_illegal (void);
int utf_valid_string (char_u *s, char_u *end);
int dbcs_screen_tail_off (char_u *base, char_u *p);
void mb_adjust_cursor (void);
void mb_adjustpos (pos_T *lp);
char_u *mb_prevptr (char_u *line, char_u *p);
int mb_charlen (char_u *str);
int mb_charlen_len (char_u *str, int len);
char_u *mb_unescape (char_u **pp);
int mb_lefthalve (int row, int col);
int mb_fix_col (int col, int row);
char_u *enc_skip (char_u *p);
char_u *enc_canonize (char_u *enc);
char_u *enc_locale (void);
int encname2codepage (char_u *name);
void *my_iconv_open (char_u *to, char_u *from);
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
int xim_queue_key_press_event (int *event, int down);
int im_get_status (void);
int preedit_get_status (void);
int im_is_preediting (void);
void xim_set_status_area (void);
int xim_get_status_area_height (void);
int convert_setup (vimconv_T *vcp, char_u *from, char_u *to);
int convert_setup_ext (vimconv_T *vcp, char_u *from, int from_unicode_is_utf8, char_u *to, int to_unicode_is_utf8);
int convert_input (char_u *ptr, int len, int maxlen);
int convert_input_safe (char_u *ptr, int len, int maxlen, char_u **restp, int *restlenp);
char_u *string_convert (vimconv_T *vcp, char_u *ptr, int *lenp);
char_u *string_convert_ext (vimconv_T *vcp, char_u *ptr, int *lenp, int *unconvlenp);
# 151 "proto.h" 2

# 1 "proto/normal.pro" 1

void init_normal_cmds (void);
void normal_cmd (oparg_T *oap, int toplevel);
void do_pending_operator (cmdarg_T *cap, int old_col, int gui_yank);
int do_mouse (oparg_T *oap, int c, int dir, long count, int fixindent);
void check_visual_highlight (void);
void end_visual_mode (void);
void reset_VIsual_and_resel (void);
void reset_VIsual (void);
int find_ident_under_cursor (char_u **string, int find_type);
int find_ident_at_pos (win_T *wp, linenr_T lnum, colnr_T startcol, char_u **string, int find_type);
void clear_showcmd (void);
int add_to_showcmd (int c);
void add_to_showcmd_c (int c);
void push_showcmd (void);
void pop_showcmd (void);
void do_check_scrollbind (int check);
void check_scrollbind (linenr_T topline_diff, long leftcol_diff);
int find_decl (char_u *ptr, int len, int locally, int thisblock, int searchflags);
void scroll_redraw (int up, long count);
void handle_tabmenu (void);
void do_nv_ident (int c1, int c2);
int get_visual_text (cmdarg_T *cap, char_u **pp, int *lenp);
void start_selection (void);
void may_start_select (int c);
# 153 "proto.h" 2
# 1 "proto/ops.pro" 1

int get_op_type (int char1, int char2);
int op_on_lines (int op);
int get_op_char (int optype);
int get_extra_op_char (int optype);
void op_shift (oparg_T *oap, int curs_top, int amount);
void shift_line (int left, int round, int amount, int call_changed_bytes);
void op_reindent (oparg_T *oap, int (*how)(void));
int get_expr_register (void);
void set_expr_line (char_u *new_line);
char_u *get_expr_line (void);
char_u *get_expr_line_src (void);
int valid_yank_reg (int regname, int writing);
void get_yank_register (int regname, int writing);
int may_get_selection (int regname);
void *get_register (int name, int copy);
void put_register (int name, void *reg);
int yank_register_mline (int regname);
int do_record (int c);
int do_execreg (int regname, int colon, int addcr, int silent);
int insert_reg (int regname, int literally);
int get_spec_reg (int regname, char_u **argp, int *allocated, int errmsg);
int cmdline_paste_reg (int regname, int literally, int remcr);
void adjust_clip_reg (int *rp);
int op_delete (oparg_T *oap);
int op_replace (oparg_T *oap, int c);
void op_tilde (oparg_T *oap);
int swapchar (int op_type, pos_T *pos);
void op_insert (oparg_T *oap, long count1);
int op_change (oparg_T *oap);
void init_yank (void);
void clear_registers (void);
int op_yank (oparg_T *oap, int deleting, int mess);
void do_put (int regname, int dir, long count, int flags);
void adjust_cursor_eol (void);
int preprocs_left (void);
int get_register_name (int num);
void ex_display (exarg_T *eap);
int do_join (long count, int insert_space, int save_undo);
void op_format (oparg_T *oap, int keep_cursor);
void op_formatexpr (oparg_T *oap);
int fex_format (linenr_T lnum, long count, int c);
void format_lines (linenr_T line_count, int avoid_fex);
int paragraph_start (linenr_T lnum);
int do_addsub (int command, linenr_T Prenum1);
int read_viminfo_register (vir_T *virp, int force);
void write_viminfo_registers (FILE *fp);
void x11_export_final_selection (void);
void clip_free_selection (VimClipboard *cbd);
void clip_get_selection (VimClipboard *cbd);
void clip_yank_selection (int type, char_u *str, long len, VimClipboard *cbd);
int clip_convert_selection (char_u **str, long_u *len, VimClipboard *cbd);
void dnd_yank_drag_data (char_u *str, long len);
char_u get_reg_type (int regname, long *reglen);
char_u *get_reg_contents (int regname, int allowexpr, int expr_src);
void write_reg_contents (int name, char_u *str, int maxlen, int must_append);
void write_reg_contents_ex (int name, char_u *str, int maxlen, int must_append, int yank_type, long block_len);
void clear_oparg (oparg_T *oap);
void cursor_pos_info (void);
# 154 "proto.h" 2
# 1 "proto/option.pro" 1

void set_init_1 (void);
void set_string_default (char *name, char_u *val);
void set_number_default (char *name, long val);
void free_all_options (void);
void set_init_2 (void);
void set_init_3 (void);
void set_helplang_default (char_u *lang);
void init_gui_options (void);
void set_title_defaults (void);
int do_set (char_u *arg, int opt_flags);
void set_options_bin (int oldval, int newval, int opt_flags);
int get_viminfo_parameter (int type);
char_u *find_viminfo_parameter (int type);
void check_options (void);
void check_buf_options (buf_T *buf);
void free_string_option (char_u *p);
void clear_string_option (char_u **pp);
void set_term_option_alloced (char_u **p);
int was_set_insecurely (char_u *opt, int opt_flags);
void set_string_option_direct (char_u *name, int opt_idx, char_u *val, int opt_flags, int set_sid);
char_u *check_colorcolumn (win_T *wp);
char_u *check_stl_option (char_u *s);
int get_option_value (char_u *name, long *numval, char_u **stringval, int opt_flags);
void set_option_value (char_u *name, long number, char_u *string, int opt_flags);
char_u *get_term_code (char_u *tname);
char_u *get_highlight_default (void);
char_u *get_encoding_default (void);
int makeset (FILE *fd, int opt_flags, int local_only);
int makefoldset (FILE *fd);
void clear_termoptions (void);
void free_termoptions (void);
void free_one_termoption (char_u *var);
void set_term_defaults (void);
void comp_col (void);
char_u *get_equalprg (void);
void win_copy_options (win_T *wp_from, win_T *wp_to);
void copy_winopt (winopt_T *from, winopt_T *to);
void check_win_options (win_T *win);
void check_winopt (winopt_T *wop);
void clear_winopt (winopt_T *wop);
void buf_copy_options (buf_T *buf, int flags);
void reset_modifiable (void);
void set_iminsert_global (void);
void set_imsearch_global (void);
void set_context_in_set_cmd (expand_T *xp, char_u *arg, int opt_flags);
int ExpandSettings (expand_T *xp, regmatch_T *regmatch, int *num_file, char_u ***file);
int ExpandOldSetting (int *num_file, char_u ***file);
int langmap_adjust_mb (int c);
int has_format_option (int x);
int shortmess (int x);
void vimrc_found (char_u *fname, char_u *envname);
void change_compatible (int on);
int option_was_set (char_u *name);
int can_bs (int what);
void save_file_ff (buf_T *buf);
int file_ff_differs (buf_T *buf);
int check_ff_value (char_u *p);
# 155 "proto.h" 2
# 1 "proto/popupmnu.pro" 1

void pum_display (pumitem_T *array, int size, int selected);
void pum_redraw (void);
void pum_undisplay (void);
void pum_clear (void);
int pum_visible (void);
int pum_get_height (void);
# 156 "proto.h" 2

# 1 "proto/quickfix.pro" 1

int qf_init (win_T *wp, char_u *efile, char_u *errorformat, int newlist, char_u *qf_title);
void qf_free_all (win_T *wp);
void copy_loclist (win_T *from, win_T *to);
void qf_jump (qf_info_T *qi, int dir, int errornr, int forceit);
void qf_list (exarg_T *eap);
void qf_age (exarg_T *eap);
void qf_mark_adjust (win_T *wp, linenr_T line1, linenr_T line2, long amount, long amount_after);
void ex_cwindow (exarg_T *eap);
void ex_cclose (exarg_T *eap);
void ex_copen (exarg_T *eap);
linenr_T qf_current_entry (win_T *wp);
int bt_quickfix (buf_T *buf);
int bt_nofile (buf_T *buf);
int bt_dontwrite (buf_T *buf);
int bt_dontwrite_msg (buf_T *buf);
int buf_hide (buf_T *buf);
int grep_internal (cmdidx_T cmdidx);
void ex_make (exarg_T *eap);
void ex_cc (exarg_T *eap);
void ex_cnext (exarg_T *eap);
void ex_cfile (exarg_T *eap);
void ex_vimgrep (exarg_T *eap);
char_u *skip_vimgrep_pat (char_u *p, char_u **s, int *flags);
int get_errorlist (win_T *wp, list_T *list);
int set_errorlist (win_T *wp, list_T *list, int action, char_u *title);
void ex_cbuffer (exarg_T *eap);
void ex_cexpr (exarg_T *eap);
void ex_helpgrep (exarg_T *eap);
# 158 "proto.h" 2

# 1 "proto/regexp.pro" 1

int re_multiline (regprog_T *prog);
int re_lookbehind (regprog_T *prog);
char_u *skip_regexp (char_u *startp, int dirc, int magic, char_u **newp);
regprog_T *vim_regcomp (char_u *expr, int re_flags);
int vim_regcomp_had_eol (void);
void free_regexp_stuff (void);
int vim_regexec (regmatch_T *rmp, char_u *line, colnr_T col);
int vim_regexec_nl (regmatch_T *rmp, char_u *line, colnr_T col);
long vim_regexec_multi (regmmatch_T *rmp, win_T *win, buf_T *buf, linenr_T lnum, colnr_T col, proftime_T *tm);
reg_extmatch_T *ref_extmatch (reg_extmatch_T *em);
void unref_extmatch (reg_extmatch_T *em);
char_u *regtilde (char_u *source, int magic);
int vim_regsub (regmatch_T *rmp, char_u *source, char_u *dest, int copy, int magic, int backslash);
int vim_regsub_multi (regmmatch_T *rmp, linenr_T lnum, char_u *source, char_u *dest, int copy, int magic, int backslash);
char_u *reg_submatch (int no);
# 160 "proto.h" 2
# 1 "proto/screen.pro" 1

void redraw_later (int type);
void redraw_win_later (win_T *wp, int type);
void redraw_later_clear (void);
void redraw_all_later (int type);
void redraw_curbuf_later (int type);
void redraw_buf_later (buf_T *buf, int type);
void redrawWinline (linenr_T lnum, int invalid);
void update_curbuf (int type);
void update_screen (int type);
int conceal_cursor_line (win_T *wp);
void conceal_check_cursur_line (void);
void update_single_line (win_T *wp, linenr_T lnum);
void update_debug_sign (buf_T *buf, linenr_T lnum);
void updateWindow (win_T *wp);
void rl_mirror (char_u *str);
void status_redraw_all (void);
void status_redraw_curbuf (void);
void redraw_statuslines (void);
void win_redraw_last_status (frame_T *frp);
void win_redr_status_matches (expand_T *xp, int num_matches, char_u **matches, int match, int showtail);
void win_redr_status (win_T *wp);
int stl_connected (win_T *wp);
int get_keymap_str (win_T *wp, char_u *buf, int len);
void screen_putchar (int c, int row, int col, int attr);
void screen_getbytes (int row, int col, char_u *bytes, int *attrp);
void screen_puts (char_u *text, int row, int col, int attr);
void screen_puts_len (char_u *text, int len, int row, int col, int attr);
void screen_stop_highlight (void);
void reset_cterm_colors (void);
void screen_draw_rectangle (int row, int col, int height, int width, int invert);
void screen_fill (int start_row, int end_row, int start_col, int end_col, int c1, int c2, int attr);
void check_for_delay (int check_msg_scroll);
int screen_valid (int clear);
void screenalloc (int clear);
void free_screenlines (void);
void screenclear (void);
int can_clear (char_u *p);
void screen_start (void);
void windgoto (int row, int col);
void setcursor (void);
int win_ins_lines (win_T *wp, int row, int line_count, int invalid, int mayclear);
int win_del_lines (win_T *wp, int row, int line_count, int invalid, int mayclear);
int screen_ins_lines (int off, int row, int line_count, int end, win_T *wp);
int screen_del_lines (int off, int row, int line_count, int end, int force, win_T *wp);
int showmode (void);
void unshowmode (int force);
void get_trans_bufname (buf_T *buf);
int redrawing (void);
int messaging (void);
void showruler (int always);
int number_width (win_T *wp);
# 161 "proto.h" 2

# 1 "proto/sha256.pro" 1

void sha256_start (context_sha256_T *ctx);
void sha256_update (context_sha256_T *ctx, char_u *input, UINT32_T length);
void sha256_finish (context_sha256_T *ctx, char_u digest[32]);
char_u *sha256_key (char_u *buf, char_u *salt, int salt_len);
int sha256_self_test (void);
void sha2_seed (char_u *header, int header_len, char_u *salt, int salt_len);
# 163 "proto.h" 2

# 1 "proto/search.pro" 1

int search_regcomp (char_u *pat, int pat_save, int pat_use, int options, regmmatch_T *regmatch);
char_u *get_search_pat (void);
char_u *reverse_text (char_u *s);
void save_search_patterns (void);
void restore_search_patterns (void);
void free_search_patterns (void);
int ignorecase (char_u *pat);
int pat_has_uppercase (char_u *pat);
char_u *last_search_pat (void);
void reset_search_dir (void);
void set_last_search_pat (char_u *s, int idx, int magic, int setlast);
void last_pat_prog (regmmatch_T *regmatch);
int searchit (win_T *win, buf_T *buf, pos_T *pos, int dir, char_u *pat, long count, int options, int pat_use, linenr_T stop_lnum, proftime_T *tm);
void set_search_direction (int cdir);
int do_search (oparg_T *oap, int dirc, char_u *pat, long count, int options, proftime_T *tm);
int search_for_exact_line (buf_T *buf, pos_T *pos, int dir, char_u *pat);
int searchc (cmdarg_T *cap, int t_cmd);
pos_T *findmatch (oparg_T *oap, int initc);
pos_T *findmatchlimit (oparg_T *oap, int initc, int flags, int maxtravel);
void showmatch (int c);
int findsent (int dir, long count);
int findpar (int *pincl, int dir, long count, int what, int both);
int startPS (linenr_T lnum, int para, int both);
int fwd_word (long count, int bigword, int eol);
int bck_word (long count, int bigword, int stop);
int end_word (long count, int bigword, int stop, int empty);
int bckend_word (long count, int bigword, int eol);
int current_word (oparg_T *oap, long count, int include, int bigword);
int current_sent (oparg_T *oap, long count, int include);
int current_block (oparg_T *oap, long count, int include, int what, int other);
int current_tagblock (oparg_T *oap, long count_arg, int include);
int current_par (oparg_T *oap, long count, int include, int type);
int current_quote (oparg_T *oap, long count, int include, int quotechar);
int linewhite (linenr_T lnum);
void find_pattern_in_path (char_u *ptr, int dir, int len, int whole, int skip_comments, int type, long count, int action, linenr_T start_lnum, linenr_T end_lnum);
int read_viminfo_search_pattern (vir_T *virp, int force);
void write_viminfo_search_pattern (FILE *fp);
# 165 "proto.h" 2
# 1 "proto/spell.pro" 1

int spell_check (win_T *wp, char_u *ptr, hlf_T *attrp, int *capcol, int docount);
int spell_move_to (win_T *wp, int dir, int allwords, int curline, hlf_T *attrp);
void spell_cat_line (char_u *buf, char_u *line, int maxlen);
char_u *did_set_spelllang (win_T *wp);
void spell_free_all (void);
void spell_reload (void);
int spell_check_msm (void);
void ex_mkspell (exarg_T *eap);
void ex_spell (exarg_T *eap);
void spell_add_word (char_u *word, int len, int bad, int idx, int undo);
void init_spell_chartab (void);
int spell_check_sps (void);
void spell_suggest (int count);
void ex_spellrepall (exarg_T *eap);
void spell_suggest_list (garray_T *gap, char_u *word, int maxcount, int need_cap, int interactive);
char_u *eval_soundfold (char_u *word);
void ex_spellinfo (exarg_T *eap);
void ex_spelldump (exarg_T *eap);
void spell_dump_compl (char_u *pat, int ic, int *dir, int dumpflags_arg);
char_u *spell_to_word_end (char_u *start, win_T *win);
int spell_word_start (int startcol);
void spell_expand_check_cap (colnr_T col);
int expand_spelling (linenr_T lnum, char_u *pat, char_u ***matchp);
# 166 "proto.h" 2
# 1 "proto/syntax.pro" 1

void syntax_start (win_T *wp, linenr_T lnum);
void syn_stack_free_all (synblock_T *block);
void syn_stack_apply_changes (buf_T *buf);
void syntax_end_parsing (linenr_T lnum);
int syntax_check_changed (linenr_T lnum);
int get_syntax_attr (colnr_T col, int *can_spell, int keep_state);
void syntax_clear (synblock_T *block);
void reset_synblock (win_T *wp);
void ex_syntax (exarg_T *eap);
void ex_ownsyntax (exarg_T *eap);
int syntax_present (win_T *win);
void reset_expand_highlight (void);
void set_context_in_echohl_cmd (expand_T *xp, char_u *arg);
void set_context_in_syntax_cmd (expand_T *xp, char_u *arg);
char_u *get_syntax_name (expand_T *xp, int idx);
int syn_get_id (win_T *wp, long lnum, colnr_T col, int trans, int *spellp, int keep_state);
int get_syntax_info (int *seqnrp);
int syn_get_sub_char (void);
int syn_get_stack_item (int i);
int syn_get_foldlevel (win_T *wp, long lnum);
void init_highlight (int both, int reset);
int load_colors (char_u *name);
void do_highlight (char_u *line, int forceit, int init);
void free_highlight (void);
void restore_cterm_colors (void);
void set_normal_colors (void);
char_u *hl_get_font_name (void);
void hl_set_font_name (char_u *font_name);
void hl_set_bg_color_name (char_u *name);
void hl_set_fg_color_name (char_u *name);
void clear_hl_tables (void);
int hl_combine_attr (int char_attr, int prim_attr);
attrentry_T *syn_gui_attr2entry (int attr);
int syn_attr2attr (int attr);
attrentry_T *syn_term_attr2entry (int attr);
attrentry_T *syn_cterm_attr2entry (int attr);
char_u *highlight_has_attr (int id, int flag, int modec);
char_u *highlight_color (int id, char_u *what, int modec);
long_u highlight_gui_color_rgb (int id, int fg);
int syn_name2id (char_u *name);
int highlight_exists (char_u *name);
char_u *syn_id2name (int id);
int syn_namen2id (char_u *linep, int len);
int syn_check_group (char_u *pp, int len);
int syn_id2attr (int hl_id);
int syn_id2colors (int hl_id, int *fgp, int *bgp);
int syn_get_final_id (int hl_id);
void highlight_gui_started (void);
int highlight_changed (void);
void set_context_in_highlight_cmd (expand_T *xp, char_u *arg);
char_u *get_highlight_name (expand_T *xp, int idx);
void free_highlight_fonts (void);
# 167 "proto.h" 2
# 1 "proto/tag.pro" 1

int do_tag (char_u *tag, int type, int count, int forceit, int verbose);
void tag_freematch (void);
void do_tags (exarg_T *eap);
int find_tags (char_u *pat, int *num_matches, char_u ***matchesp, int flags, int mincount, char_u *buf_ffname);
void free_tag_stuff (void);
int get_tagfname (tagname_T *tnp, int first, char_u *buf);
void tagname_free (tagname_T *tnp);
void simplify_filename (char_u *filename);
int expand_tags (int tagnames, char_u *pat, int *num_file, char_u ***file);
int get_tags (list_T *list, char_u *pat);
# 168 "proto.h" 2
# 1 "proto/term.pro" 1

int set_termname (char_u *term);
void set_mouse_termcode (int n, char_u *s);
void del_mouse_termcode (int n);
void getlinecol (long *cp, long *rp);
int add_termcap_entry (char_u *name, int force);
int term_is_8bit (char_u *name);
int term_is_gui (char_u *name);
char_u *tltoa (unsigned long i);
void termcapinit (char_u *name);
void out_flush (void);
void out_flush_check (void);
void out_trash (void);
void out_char (unsigned c);
void out_str_nf (char_u *s);
void out_str (char_u *s);
void term_windgoto (int row, int col);
void term_cursor_right (int i);
void term_append_lines (int line_count);
void term_delete_lines (int line_count);
void term_set_winpos (int x, int y);
void term_set_winsize (int width, int height);
void term_fg_color (int n);
void term_bg_color (int n);
void term_settitle (char_u *title);
void ttest (int pairs);
void add_long_to_buf (long_u val, char_u *dst);
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
void scroll_region_set (win_T *wp, int off);
void scroll_region_reset (void);
void clear_termcodes (void);
void add_termcode (char_u *name, char_u *string, int flags);
char_u *find_termcode (char_u *name);
char_u *get_termcode (int i);
void del_termcode (char_u *name);
void set_mouse_topline (win_T *wp);
int check_termcode (int max_offset, char_u *buf, int buflen);
char_u *replace_termcodes (char_u *from, char_u **bufp, int from_part, int do_lt, int special);
int find_term_bykeys (char_u *src);
void show_termcodes (void);
int show_one_termcode (char_u *name, char_u *code, int printit);
char_u *translate_mapping (char_u *str, int expmap);
void update_tcap (int attr);
# 169 "proto.h" 2



# 1 "proto/ui.pro" 1

void ui_write (char_u *s, int len);
void ui_inchar_undo (char_u *s, int len);
int ui_inchar (char_u *buf, int maxlen, long wtime, int tb_change_cnt);
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
void clip_own_selection (VimClipboard *cbd);
void clip_lose_selection (VimClipboard *cbd);
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
int clip_gen_own_selection (VimClipboard *cbd);
void clip_gen_lose_selection (VimClipboard *cbd);
void clip_gen_set_selection (VimClipboard *cbd);
void clip_gen_request_selection (VimClipboard *cbd);
int vim_is_input_buf_full (void);
int vim_is_input_buf_empty (void);
int vim_free_in_input_buf (void);
int vim_used_in_input_buf (void);
char_u *get_input_buf (void);
void set_input_buf (char_u *p);
void add_to_input_buf (char_u *s, int len);
void add_to_input_buf_csi (char_u *str, int len);
void push_raw_key (char_u *s, int len);
void trash_input_buf (void);
int read_from_input_buf (char_u *buf, long maxlen);
void fill_input_buf (int exit_on_error);
void read_error_exit (void);
void ui_cursor_shape (void);
int check_col (int col);
int check_row (int row);
void open_app_context (void);
void x11_setup_atoms (int *dpy);
void x11_setup_selection (int w);
void clip_x11_request_selection (int myShell, int *dpy, VimClipboard *cbd);
void clip_x11_lose_selection (int myShell, VimClipboard *cbd);
int clip_x11_own_selection (int myShell, VimClipboard *cbd);
void clip_x11_set_selection (VimClipboard *cbd);
void yank_cut_buffer0 (int *dpy, VimClipboard *cbd);
int jump_to_mouse (int flags, int *inclusive, int which_button);
int mouse_comp_pos (win_T *win, int *rowp, int *colp, linenr_T *lnump);
win_T *mouse_find_win (int *rowp, int *colp);
int get_fpos_of_mouse (pos_T *mpos);
int vcol2col (win_T *wp, linenr_T lnum, int vcol);
void ui_focus_change (int in_focus);
void im_save_status (long *psave);
# 173 "proto.h" 2
# 1 "proto/undo.pro" 1

int u_save_cursor (void);
int u_save (linenr_T top, linenr_T bot);
int u_savesub (linenr_T lnum);
int u_inssub (linenr_T lnum);
int u_savedel (linenr_T lnum, long nlines);
int undo_allowed (void);
int u_savecommon (linenr_T top, linenr_T bot, linenr_T newbot, int reload);
void u_compute_hash (char_u *hash);
char_u *u_get_undo_file_name (char_u *buf_ffname, int reading);
void u_write_undo (char_u *name, int forceit, buf_T *buf, char_u *hash);
void u_read_undo (char_u *name, char_u *hash, char_u *orig_name);
void u_undo (int count);
void u_redo (int count);
void undo_time (long step, int sec, int file, int absolute);
void u_sync (int force);
void ex_undolist (exarg_T *eap);
void ex_undojoin (exarg_T *eap);
void u_unchanged (buf_T *buf);
void u_find_first_changed (void);
void u_update_save_nr (buf_T *buf);
void u_clearall (buf_T *buf);
void u_saveline (linenr_T lnum);
void u_clearline (void);
void u_undoline (void);
void u_blockfree (buf_T *buf);
int bufIsChanged (buf_T *buf);
int curbufIsChanged (void);
void u_eval_tree (u_header_T *first_uhp, list_T *list);
# 174 "proto.h" 2
# 1 "proto/version.pro" 1

void make_version (void);
int highest_patch (void);
int has_patch (int n);
void ex_version (exarg_T *eap);
void list_version (void);
void intro_message (int colon);
void ex_intro (exarg_T *eap);
# 175 "proto.h" 2
# 1 "proto/window.pro" 1

void do_window (int nchar, long Prenum, int xchar);
int win_split (int size, int flags);
int win_split_ins (int size, int flags, win_T *newwin, int dir);
int win_valid (win_T *win);
int win_count (void);
int make_windows (int count, int vertical);
void win_move_after (win_T *win1, win_T *win2);
void win_equal (win_T *next_curwin, int current, int dir);
void close_windows (buf_T *buf, int keep_curwin);
void win_close (win_T *win, int free_buf);
void win_close_othertab (win_T *win, int free_buf, tabpage_T *tp);
void win_free_all (void);
win_T *winframe_remove (win_T *win, int *dirp, tabpage_T *tp);
void close_others (int message, int forceit);
void curwin_init (void);
void win_init_empty (win_T *wp);
int win_alloc_first (void);
void win_alloc_aucmd_win (void);
void win_init_size (void);
void free_tabpage (tabpage_T *tp);
int win_new_tabpage (int after);
int may_open_tabpage (void);
int make_tabpages (int maxcount);
int valid_tabpage (tabpage_T *tpc);
tabpage_T *find_tabpage (int n);
int tabpage_index (tabpage_T *ftp);
void goto_tabpage (int n);
void goto_tabpage_tp (tabpage_T *tp);
void goto_tabpage_win (tabpage_T *tp, win_T *wp);
void tabpage_move (int nr);
void win_goto (win_T *wp);
win_T *win_find_nr (int winnr);
void win_enter (win_T *wp, int undo_sync);
win_T *buf_jump_open_win (buf_T *buf);
win_T *buf_jump_open_tab (buf_T *buf);
void win_append (win_T *after, win_T *wp);
void win_remove (win_T *wp, tabpage_T *tp);
int win_alloc_lines (win_T *wp);
void win_free_lsize (win_T *wp);
void shell_new_rows (void);
void shell_new_columns (void);
void win_size_save (garray_T *gap);
void win_size_restore (garray_T *gap);
int win_comp_pos (void);
void win_setheight (int height);
void win_setheight_win (int height, win_T *win);
void win_setwidth (int width);
void win_setwidth_win (int width, win_T *wp);
void win_setminheight (void);
void win_drag_status_line (win_T *dragwin, int offset);
void win_drag_vsep_line (win_T *dragwin, int offset);
void win_comp_scroll (win_T *wp);
void command_height (void);
void last_status (int morewin);
int tabline_height (void);
char_u *grab_file_name (long count, linenr_T *file_lnum);
char_u *file_name_at_cursor (int options, long count, linenr_T *file_lnum);
char_u *file_name_in_line (char_u *line, int col, int options, long count, char_u *rel_fname, linenr_T *file_lnum);
char_u *find_file_name_in_path (char_u *ptr, int len, int options, long count, char_u *rel_fname);
int path_with_url (char_u *fname);
int vim_isAbsName (char_u *name);
int vim_FullName (char_u *fname, char_u *buf, int len, int force);
int min_rows (void);
int only_one_window (void);
void check_lnums (int do_curwin);
void make_snapshot (int idx);
void restore_snapshot (int idx, int close_curwin);
int win_hasvertsplit (void);
int match_add (win_T *wp, char_u *grp, char_u *pat, int prio, int id);
int match_delete (win_T *wp, int id, int perr);
void clear_matches (win_T *wp);
matchitem_T *get_match (win_T *wp, int id);
# 176 "proto.h" 2
# 208 "proto.h"
# 1 "proto/netbeans.pro" 1

void netbeans_parse_messages (void);
void netbeans_read (void);
int isNetbeansBuffer (buf_T *bufp);
int isNetbeansModified (buf_T *bufp);
void netbeans_end (void);
void ex_nbclose (exarg_T *eap);
void ex_nbkey (exarg_T *eap);
void ex_nbstart (exarg_T *eap);
void netbeans_beval_cb (int *beval, int state);
int netbeans_active (void);
int netbeans_filedesc (void);
void netbeans_gui_register (void);
void netbeans_open (char *params, int doabort);
void netbeans_send_disconnect (void);
void netbeans_frame_moved (int new_x, int new_y);
void netbeans_file_activated (buf_T *bufp);
void netbeans_file_opened (buf_T *bufp);
void netbeans_file_killed (buf_T *bufp);
void netbeans_inserted (buf_T *bufp, linenr_T linenr, colnr_T col, char_u *txt, int newlen);
void netbeans_removed (buf_T *bufp, linenr_T linenr, colnr_T col, long len);
void netbeans_unmodified (buf_T *bufp);
void netbeans_button_release (int button);
int netbeans_keycommand (int key);
void netbeans_save_buffer (buf_T *bufp);
void netbeans_deleted_all_lines (buf_T *bufp);
int netbeans_is_guarded (linenr_T top, linenr_T bot);
void netbeans_draw_multisign_indicator (int row);
void netbeans_gutter_click (linenr_T lnum);
# 209 "proto.h" 2
# 290 "proto.h"
void clip_mch_lose_selection(VimClipboard *cbd);
int clip_mch_own_selection(VimClipboard *cbd);
void clip_mch_request_selection(VimClipboard *cbd);
void clip_mch_set_selection(VimClipboard *cbd);
# 1920 "vim.h" 2
# 1945 "vim.h"
# 1 "globals.h" 1
# 20 "globals.h"
extern long Rows







       ;
extern long Columns ;
# 42 "globals.h"
extern schar_T *ScreenLines ;
extern sattr_T *ScreenAttrs ;
extern unsigned *LineOffset ;
extern char_u *LineWraps ;
# 74 "globals.h"
extern short *TabPageIdxs ;


extern int screen_Rows ;
extern int screen_Columns ;





extern int mod_mask ;
# 95 "globals.h"
extern int cmdline_row;

extern int redraw_cmdline ;
extern int clear_cmdline ;
extern int mode_displayed ;

extern int cmdline_star ;


extern int exec_from_reg ;

extern int screen_cleared ;


extern int use_crypt_method ;
# 118 "globals.h"
extern colnr_T dollar_vcol ;
# 127 "globals.h"
extern int compl_length ;



extern int compl_interrupted ;


extern int compl_cont_status ;
# 154 "globals.h"
extern int msg_col;
extern int msg_row;
extern int msg_scrolled;

extern int msg_scrolled_ign ;




extern char_u *keep_msg ;
extern int keep_msg_attr ;
extern int keep_msg_more ;
extern int need_fileinfo ;
extern int msg_scroll ;
extern int msg_didout ;
extern int msg_didany ;
extern int msg_nowait ;
extern int emsg_off ;

extern int info_message ;
extern int msg_hist_off ;

extern int need_clr_eos ;

extern int emsg_skip ;

extern int emsg_severe ;

extern int did_endif ;

extern int did_emsg;

extern int called_emsg;
extern int ex_exitval ;
extern int emsg_on_display ;
extern int rc_did_emsg ;

extern int no_wait_return ;
extern int need_wait_return ;
extern int did_wait_return ;


extern int need_maketitle ;


extern int quit_more ;

extern int newline_on_exit ;
extern int intr_char ;
# 212 "globals.h"
extern int ex_keep_indent ;
extern int vgetc_busy ;

extern int didset_vim ;
extern int didset_vimruntime ;





extern int lines_left ;
extern int msg_no_more ;


extern char_u *sourcing_name ;
extern linenr_T sourcing_lnum ;


extern int ex_nesting_level ;
extern int debug_break_level ;
extern int debug_did_msg ;
extern int debug_tick ;
# 243 "globals.h"
extern except_T *current_exception;





extern int did_throw ;





extern int need_rethrow ;






extern int check_cstack ;





extern int trylevel ;
# 278 "globals.h"
extern int force_abort ;
# 290 "globals.h"
extern struct msglist **msg_list ;







extern int suppress_errthrow ;







extern except_T *caught_stack ;
# 319 "globals.h"
extern int may_garbage_collect ;
extern int want_garbage_collect ;
extern int garbage_collect_at_exit ;


extern scid_T current_SID ;





extern char_u hash_removed;



extern int scroll_region ;
extern int t_colors ;







extern int highlight_match ;
extern linenr_T search_match_lines;
extern colnr_T search_match_endcol;

extern int no_smartcase ;

extern int need_check_timestamps ;

extern int did_check_timestamps ;

extern int no_check_timestamps ;

extern int highlight_attr[HLF_COUNT];




extern int highlight_user[9];

extern int highlight_stlnc[9];





extern int cterm_normal_fg_color ;
extern int cterm_normal_fg_bold ;
extern int cterm_normal_bg_color ;


extern int autocmd_busy ;
extern int autocmd_no_enter ;
extern int autocmd_no_leave ;
extern int modified_was_set;
extern int did_filetype ;
extern int keep_filetype ;





extern buf_T *au_new_curbuf ;






extern int mouse_row;
extern int mouse_col;
extern int mouse_past_bottom ;
extern int mouse_past_eol ;
extern int mouse_dragging ;
# 431 "globals.h"
extern int diff_context ;
extern int diff_foldcolumn ;
extern int diff_need_scrollbind ;




extern vimmenu_T *root_menu ;




extern int sys_menu ;




extern int updating_screen ;
# 508 "globals.h"
extern VimClipboard clip_star;





extern int clip_unnamed ;
extern int clip_autoselect ;
extern int clip_autoselectml ;
extern int clip_html ;
extern regprog_T *clip_exclude_prog ;
# 528 "globals.h"
extern win_T *firstwin;
extern win_T *lastwin;
extern win_T *prevwin ;
# 545 "globals.h"
extern win_T *curwin;


extern win_T *aucmd_win;
extern int aucmd_win_used ;






extern frame_T *topframe;






extern tabpage_T *first_tabpage;
extern tabpage_T *curtab;
extern int redraw_tabline ;






extern buf_T *firstbuf ;
extern buf_T *lastbuf ;
extern buf_T *curbuf ;



extern int mf_dont_release ;





extern alist_T global_alist;
extern int arg_had_last ;


extern int ru_col;

extern int ru_wid;

extern int sc_col;


extern char_u *vim_tempdir ;







extern int starting ;


extern int exiting ;



extern int really_exiting ;



extern volatile int full_screen ;



extern int restricted ;

extern int secure ;




extern int textlock ;




extern int curbuf_lock ;


extern int allbuf_lock ;







extern int sandbox ;





extern int silent_mode ;




extern pos_T VIsual;
extern int VIsual_active ;

extern int VIsual_select ;

extern int VIsual_reselect;



extern int VIsual_mode ;


extern int redo_VIsual_busy ;
# 673 "globals.h"
extern pos_T where_paste_started;
# 682 "globals.h"
extern int did_ai ;





extern colnr_T ai_col ;
# 697 "globals.h"
extern int end_comment_pending ;
# 707 "globals.h"
extern int did_syncbind ;







extern int did_si ;





extern int can_si ;





extern int can_si_back ;


extern pos_T saved_cursor



 ;




extern pos_T Insstart;





extern int orig_line_count ;
extern int vr_lines_changed ;
# 759 "globals.h"
extern sigjmp_buf lc_jump_env;


extern volatile int lc_signal;



extern volatile int lc_active ;
# 885 "globals.h"
extern int State ;


extern int finish_op ;
extern int opcount ;




extern int exmode_active ;
extern int ex_no_reprint ;

extern int Recording ;
extern int Exec_reg ;

extern int no_mapping ;
extern int no_zero_mapping ;
extern int allow_keys ;

extern int no_u_sync ;

extern int restart_edit ;
extern int arrow_used;



extern int ins_at_eol ;


extern char_u *edit_submode ;
extern char_u *edit_submode_pre ;
extern char_u *edit_submode_extra ;
extern hlf_T edit_submode_highl;
extern int ctrl_x_mode ;


extern int no_abbr ;





extern char_u *exe_name;





extern int mapped_ctrl_c ;
extern int ctrl_c_interrupts ;

extern cmdmod_T cmdmod;

extern int msg_silent ;
extern int emsg_silent ;
extern int cmd_silent ;




extern int swap_exists_action ;


extern int swap_exists_did_quit ;



extern char_u *IObuff;

extern char_u *NameBuff;

extern char_u msg_buf[80];


extern int RedrawingDisabled ;

extern int readonlymode ;
extern int recoverymode ;

extern struct buffheader stuffbuff



      ;
extern typebuf_T typebuf



      ;

extern int ex_normal_busy ;
extern int ex_normal_lock ;


extern int ignore_script ;

extern int stop_insert_mode;

extern int KeyTyped;
extern int KeyStuffed;




extern int maptick ;

extern char_u chartab[256];


extern int must_redraw ;
extern int skip_redraw ;
extern int do_redraw ;

extern int need_highlight_changed ;
extern char_u *use_viminfo ;


extern FILE *scriptin[15];
extern int curscript ;
extern FILE *scriptout ;
extern int read_cmd_fd ;


extern volatile int got_int ;




extern int termcap_active ;
extern int cur_tmode ;
extern int bangredo ;
extern int searchcmdlen;

extern int reg_do_extmatch ;


extern reg_extmatch_T *re_extmatch_in ;

extern reg_extmatch_T *re_extmatch_out ;



extern int did_outofmem_msg ;

extern int did_swapwrite_msg ;

extern int undo_off ;
extern int global_busy ;
extern int listcmd_busy ;

extern int need_start_insertmode ;

extern char_u *last_cmdline ;
extern char_u *repeat_cmdline ;

extern char_u *new_last_cmdline ;


extern char_u *autocmd_fname ;
extern int autocmd_fname_full;
extern int autocmd_bufnr ;
extern char_u *autocmd_match ;
extern int did_cursorhold ;
extern pos_T last_cursormoved



   ;


extern linenr_T write_no_eol_lnum ;




extern int postponed_split ;
extern int postponed_split_flags ;
extern int postponed_split_tab ;

extern int g_do_tagpreview ;



extern int replace_offset ;

extern char_u *escape_chars ;


extern int keep_help_flag ;






extern char_u *empty_option ;

extern int redir_off ;
extern FILE *redir_fd ;

extern int redir_reg ;
extern int redir_vname ;







extern int save_p_ls ;
extern int save_p_wmh ;
extern int wild_menu_showing ;
# 1107 "globals.h"
extern char breakat_flags[256];



extern char *Version;



extern char *longVersion;







extern char_u *default_vim_dir;
extern char_u *default_vimruntime_dir;
extern char_u *all_cflags;
extern char_u *all_lflags;




extern char_u *compiled_user;
extern char_u *compiled_sys;





extern char_u *globaldir ;


extern int lcs_eol ;
extern int lcs_ext ;
extern int lcs_prec ;
extern int lcs_nbsp ;
extern int lcs_tab1 ;
extern int lcs_tab2 ;
extern int lcs_trail ;







extern int fill_stl ;
extern int fill_stlnc ;


extern int fill_vert ;
extern int fill_fold ;
extern int fill_diff ;




extern int km_stopsel ;
extern int km_startsel ;



extern int cedit_key ;
extern int cmdwin_type ;
extern int cmdwin_result ;


extern char_u no_lines_msg[] ;






extern long sub_nsubs;
extern linenr_T sub_nlines;


extern char_u wim_flags[4];





extern int stl_syntax ;




extern int no_hlsearch ;
# 1212 "globals.h"
extern cursorentry_T shape_table[17];
# 1236 "globals.h"
extern option_table_T printer_opts[14]
# 1256 "globals.h"
;
# 1270 "globals.h"
extern linenr_T printer_page_num;
# 1296 "globals.h"
extern int typebuf_was_filled ;
# 1316 "globals.h"
extern int term_is_xterm ;
# 1332 "globals.h"
extern int virtual_op ;




extern disptick_T display_tick ;





extern linenr_T spell_redraw_lnum ;
# 1369 "globals.h"
extern char *netbeansArg ;
extern int netbeansFireChanges ;
extern int netbeansForcedQuit ;
extern int netbeansReadFile ;
extern int netbeansSuppressNoLines ;






extern char_u e_abort[] ;
extern char_u e_argreq[] ;
extern char_u e_backslash[] ;

extern char_u e_cmdwin[] ;

extern char_u e_curdir[] ;

extern char_u e_endif[] ;
extern char_u e_endtry[] ;
extern char_u e_endwhile[] ;
extern char_u e_endfor[] ;
extern char_u e_while[] ;
extern char_u e_for[] ;

extern char_u e_exists[] ;
extern char_u e_failed[] ;





extern char_u e_font[] ;




extern char_u e_internal[] ;
extern char_u e_interr[] ;
extern char_u e_invaddr[] ;
extern char_u e_invarg[] ;
extern char_u e_invarg2[] ;

extern char_u e_invexpr2[] ;

extern char_u e_invrange[] ;
extern char_u e_invcmd[] ;

extern char_u e_isadir2[] ;


extern char_u e_libcall[] ;
# 1434 "globals.h"
extern char_u e_markinval[] ;
extern char_u e_marknotset[] ;
extern char_u e_modifiable[] ;
extern char_u e_nesting[] ;
extern char_u e_noalt[] ;
extern char_u e_noabbr[] ;
extern char_u e_nobang[] ;

extern char_u e_nogvim[] ;


extern char_u e_nohebrew[] ;


extern char_u e_nofarsi[] ;


extern char_u e_noarabic[] ;


extern char_u e_nogroup[] ;

extern char_u e_noinstext[] ;
extern char_u e_nolastcmd[] ;
extern char_u e_nomap[] ;
extern char_u e_nomatch[] ;
extern char_u e_nomatch2[] ;
extern char_u e_noname[] ;
extern char_u e_nopresub[] ;
extern char_u e_noprev[] ;
extern char_u e_noprevre[] ;
extern char_u e_norange[] ;

extern char_u e_noroom[] ;




extern char_u e_notcreate[] ;
extern char_u e_notmp[] ;
extern char_u e_notopen[] ;
extern char_u e_notread[] ;
extern char_u e_nowrtmsg[] ;
extern char_u e_null[] ;

extern char_u e_number_exp[] ;


extern char_u e_openerrf[] ;




extern char_u e_outofmem[] ;

extern char_u e_patnotf[] ;

extern char_u e_patnotf2[] ;
extern char_u e_positive[] ;

extern char_u e_prev_dir[] ;



extern char_u e_quickfix[] ;
extern char_u e_loclist[] ;

extern char_u e_re_damg[] ;
extern char_u e_re_corr[] ;
extern char_u e_readonly[] ;

extern char_u e_readonlyvar[] ;
extern char_u e_readonlysbx[] ;


extern char_u e_readerrf[] ;


extern char_u e_sandbox[] ;

extern char_u e_secure[] ;


extern char_u e_screenmode[] ;

extern char_u e_scroll[] ;
extern char_u e_shellempty[] ;



extern char_u e_swapclose[] ;
extern char_u e_tagstack[] ;
extern char_u e_toocompl[] ;
extern char_u e_longname[] ;
extern char_u e_toomsbra[] ;
extern char_u e_toomany[] ;
extern char_u e_trailing[] ;
extern char_u e_umark[] ;
extern char_u e_wildexpand[] ;

extern char_u e_winheight[] ;

extern char_u e_winwidth[] ;


extern char_u e_write[] ;
extern char_u e_zerocount[] ;

extern char_u e_usingsid[] ;





extern char_u e_guarded[] ;
extern char_u e_nbreadonly[] ;

extern char_u e_intern2[] ;
extern char_u e_maxmempat[] ;
extern char_u e_emptybuf[] ;


extern char_u e_invalpat[] ;

extern char_u e_bufloaded[] ;


extern char_u e_notset[] ;



extern short disallow_gui ;


extern char top_bot_msg[] ;
extern char bot_top_msg[] ;


extern char need_key_msg[] ;
# 1583 "globals.h"
extern time_t starttime;


extern FILE *time_fd ;







extern int ignored;
extern char *ignoredp;
# 1946 "vim.h" 2
# 15 "syntax.c" 2






struct hl_group
{
    char_u *sg_name;
    char_u *sg_name_u;

    int sg_term;
    char_u *sg_start;
    char_u *sg_stop;
    int sg_term_attr;

    int sg_cterm;
    int sg_cterm_bold;
    int sg_cterm_fg;
    int sg_cterm_bg;
    int sg_cterm_attr;
# 50 "syntax.c"
    int sg_gui;
    char_u *sg_gui_fg_name;
    char_u *sg_gui_bg_name;
    char_u *sg_gui_sp_name;

    int sg_link;
    int sg_set;

    scid_T sg_scriptID;

};






static garray_T highlight_ga;





static int include_none = 0;
static int include_default = 0;
static int include_link = 0;






static char *(hl_name_table[]) =
    {"bold", "standout", "underline", "undercurl",
          "italic", "reverse", "inverse", "NONE"};
static int hl_attr_table[] =
    {0x02, 0x20, 0x08, 0x10, 0x04, 0x01, 0x01, 0};

static int get_attr_entry (garray_T *table, attrentry_T *aep);
static void syn_unadd_group (void);
static void set_hl_attr (int idx);
static void highlight_list_one (int id);
static int highlight_list_arg (int id, int didh, int type, int iarg, char_u *sarg, char *name);
static int syn_add_group (char_u *name);
static int syn_list_header (int did_header, int outlen, int id);
static int hl_has_settings (int idx, int check_link);
static void highlight_clear (int idx);
# 128 "syntax.c"
static char *(spo_name_tab[7]) =
     {"ms=", "me=", "hs=", "he=", "rs=", "re=", "lc="};
# 142 "syntax.c"
typedef struct syn_pattern
{
    char sp_type;
    char sp_syncing;
    int sp_flags;



    struct sp_syn sp_syn;
    short sp_syn_match_id;
    char_u *sp_pattern;
    regprog_T *sp_prog;
    int sp_ic;
    short sp_off_flags;
    int sp_offsets[7];
    short *sp_cont_list;
    short *sp_next_list;
    int sp_sync_idx;
    int sp_line_id;
    int sp_startcol;
} synpat_T;
# 193 "syntax.c"
static int current_attr = 0;

static int current_id = 0;
static int current_trans_id = 0;







typedef struct syn_cluster_S
{
    char_u *scl_name;
    char_u *scl_name_u;
    short *scl_list;
} syn_cluster_T;
# 238 "syntax.c"
static char_u **syn_cmdlinep;






static int current_syn_inc_tag = 0;
static int running_syn_inc_tag = 0;
# 255 "syntax.c"
static keyentry_T dumkey;
# 265 "syntax.c"
static int keepend_level = -1;






typedef struct state_item
{
    int si_idx;

    int si_id;
    int si_trans_id;
    int si_m_lnum;
    int si_m_startcol;
    lpos_T si_m_endpos;
    lpos_T si_h_startpos;
    lpos_T si_h_endpos;
    lpos_T si_eoe_pos;
    int si_end_idx;
    int si_ends;
    int si_attr;
    long si_flags;





    short *si_cont_list;
    short *si_next_list;
    reg_extmatch_T *si_extmatch;

} stateitem_T;
# 311 "syntax.c"
typedef struct
{
    int flags;
    int keyword;
    int *sync_idx;

    char has_cont_list;
    short *cont_list;
    short *cont_in_list;
    short *next_list;
} syn_opt_arg_T;
# 330 "syntax.c"
static int next_match_col;
static lpos_T next_match_m_endpos;
static lpos_T next_match_h_startpos;
static lpos_T next_match_h_endpos;
static int next_match_idx;
static long next_match_flags;
static lpos_T next_match_eos_pos;
static lpos_T next_match_eoe_pos;
static int next_match_end_idx;
static reg_extmatch_T *next_match_extmatch = ((void *)0);
# 352 "syntax.c"
static win_T *syn_win;
static buf_T *syn_buf;
static synblock_T *syn_block;
static linenr_T current_lnum = 0;
static colnr_T current_col = 0;
static int current_state_stored = 0;

static int current_finished = 0;
static garray_T current_state
  = {0, 0, 0, 0, ((void *)0)};
static short *current_next_list = ((void *)0);
static int current_next_flags = 0;
static int current_line_id = 0;



static void syn_sync (win_T *wp, linenr_T lnum, synstate_T *last_valid);
static int syn_match_linecont (linenr_T lnum);
static void syn_start_line (void);
static void syn_update_ends (int startofline);
static void syn_stack_alloc (void);
static int syn_stack_cleanup (void);
static void syn_stack_free_entry (synblock_T *block, synstate_T *p);
static synstate_T *syn_stack_find_entry (linenr_T lnum);
static synstate_T *store_current_state (void);
static void load_current_state (synstate_T *from);
static void invalidate_current_state (void);
static int syn_stack_equal (synstate_T *sp);
static void validate_current_state (void);
static int syn_finish_line (int syncing);
static int syn_current_attr (int syncing, int displaying, int *can_spell, int keep_state);
static int did_match_already (int idx, garray_T *gap);
static stateitem_T *push_next_match (stateitem_T *cur_si);
static void check_state_ends (void);
static void update_si_attr (int idx);
static void check_keepend (void);
static void update_si_end (stateitem_T *sip, int startcol, int force);
static short *copy_id_list (short *list);
static int in_id_list (stateitem_T *item, short *cont_list, struct sp_syn *ssp, int contained);
static int push_current_state (int idx);
static void pop_current_state (void);

static void syn_stack_apply_changes_block (synblock_T *block, buf_T *buf);
static void find_endpos (int idx, lpos_T *startpos, lpos_T *m_endpos, lpos_T *hl_endpos, long *flagsp, lpos_T *end_endpos, int *end_idx, reg_extmatch_T *start_ext);
static void clear_syn_state (synstate_T *p);
static void clear_current_state (void);

static void limit_pos (lpos_T *pos, lpos_T *limit);
static void limit_pos_zero (lpos_T *pos, lpos_T *limit);
static void syn_add_end_off (lpos_T *result, regmmatch_T *regmatch, synpat_T *spp, int idx, int extra);
static void syn_add_start_off (lpos_T *result, regmmatch_T *regmatch, synpat_T *spp, int idx, int extra);
static char_u *syn_getcurline (void);
static int syn_regexec (regmmatch_T *rmp, linenr_T lnum, colnr_T col);
static int check_keyword_id (char_u *line, int startcol, int *endcol, long *flags, short **next_list, stateitem_T *cur_si, int *ccharp);
static void syn_cmd_case (exarg_T *eap, int syncing);
static void syn_cmd_spell (exarg_T *eap, int syncing);
static void syntax_sync_clear (void);
static void syn_remove_pattern (synblock_T *block, int idx);
static void syn_clear_pattern (synblock_T *block, int i);
static void syn_clear_cluster (synblock_T *block, int i);
static void syn_cmd_clear (exarg_T *eap, int syncing);
static void syn_cmd_conceal (exarg_T *eap, int syncing);
static void syn_clear_one (int id, int syncing);
static void syn_cmd_on (exarg_T *eap, int syncing);
static void syn_cmd_enable (exarg_T *eap, int syncing);
static void syn_cmd_reset (exarg_T *eap, int syncing);
static void syn_cmd_manual (exarg_T *eap, int syncing);
static void syn_cmd_off (exarg_T *eap, int syncing);
static void syn_cmd_onoff (exarg_T *eap, char *name);
static void syn_cmd_list (exarg_T *eap, int syncing);
static void syn_lines_msg (void);
static void syn_match_msg (void);
static void syn_stack_free_block (synblock_T *block);
static void syn_list_one (int id, int syncing, int link_only);
static void syn_list_cluster (int id);
static void put_id_list (char_u *name, short *list, int attr);
static void put_pattern (char *s, int c, synpat_T *spp, int attr);
static int syn_list_keywords (int id, hashtab_T *ht, int did_header, int attr);
static void syn_clear_keyword (int id, hashtab_T *ht);
static void clear_keywtab (hashtab_T *ht);
static void add_keyword (char_u *name, int id, int flags, short *cont_in_list, short *next_list, int conceal_char);
static char_u *get_group_name (char_u *arg, char_u **name_end);
static char_u *get_syn_options (char_u *arg, syn_opt_arg_T *opt, int *conceal_char);
static void syn_cmd_include (exarg_T *eap, int syncing);
static void syn_cmd_keyword (exarg_T *eap, int syncing);
static void syn_cmd_match (exarg_T *eap, int syncing);
static void syn_cmd_region (exarg_T *eap, int syncing);



static int syn_compare_stub (const void *v1, const void *v2);

static void syn_cmd_cluster (exarg_T *eap, int syncing);
static int syn_scl_name2id (char_u *name);
static int syn_scl_namen2id (char_u *linep, int len);
static int syn_check_cluster (char_u *pp, int len);
static int syn_add_cluster (char_u *name);
static void init_syn_patterns (void);
static char_u *get_syn_pattern (char_u *arg, synpat_T *ci);
static void syn_cmd_sync (exarg_T *eap, int syncing);
static int get_id_list (char_u **arg, int keylen, short **list);
static void syn_combine_list (short **clstr1, short **clstr2, int list_op);
static void syn_incl_toplevel (int id, int *flagsp);
# 463 "syntax.c"
    void
syntax_start(wp, lnum)
    win_T *wp;
    linenr_T lnum;
{
    synstate_T *p;
    synstate_T *last_valid = ((void *)0);
    synstate_T *last_min_valid = ((void *)0);
    synstate_T *sp, *prev = ((void *)0);
    linenr_T parsed_lnum;
    linenr_T first_stored;
    int dist;
    static int changedtick = 0;
# 486 "syntax.c"
    if (syn_block != wp->w_s || changedtick != syn_buf->b_changedtick)
    {
 invalidate_current_state();
 syn_buf = wp->w_buffer;
 syn_block = wp->w_s;
    }
    changedtick = syn_buf->b_changedtick;
    syn_win = wp;




    syn_stack_alloc();
    if (syn_block->b_sst_array == ((void *)0))
 return;
    syn_block->b_sst_lasttick = display_tick;




    if (((&current_state)->ga_itemsize != 0)
     && current_lnum < lnum
     && current_lnum < syn_buf->b_ml.ml_line_count)
    {
 (void)syn_finish_line(0);
 if (!current_state_stored)
 {
     ++current_lnum;
     (void)store_current_state();
 }






 if (current_lnum != lnum)
     invalidate_current_state();
    }
    else
 invalidate_current_state();





    if (((&current_state)->ga_itemsize == 0) && syn_block->b_sst_array != ((void *)0))
    {

 for (p = syn_block->b_sst_first; p != ((void *)0); p = p->sst_next)
 {
     if (p->sst_lnum > lnum)
  break;
     if (p->sst_lnum <= lnum && p->sst_change_lnum == 0)
     {
  last_valid = p;
  if (p->sst_lnum >= lnum - syn_block->b_syn_sync_minlines)
      last_min_valid = p;
     }
 }
 if (last_min_valid != ((void *)0))
     load_current_state(last_min_valid);
    }





    if (((&current_state)->ga_itemsize == 0))
    {
 syn_sync(wp, lnum, last_valid);
 first_stored = current_lnum + syn_block->b_syn_sync_minlines;
    }
    else
 first_stored = current_lnum;





    if (syn_block->b_sst_len <= Rows)
 dist = 999999;
    else
 dist = syn_buf->b_ml.ml_line_count / (syn_block->b_sst_len - Rows) + 1;
    while (current_lnum < lnum)
    {
 syn_start_line();
 (void)syn_finish_line(0);
 ++current_lnum;



 if (current_lnum >= first_stored)
 {



     if (prev == ((void *)0))
  prev = syn_stack_find_entry(current_lnum - 1);
     if (prev == ((void *)0))
  sp = syn_block->b_sst_first;
     else
  sp = prev;
     while (sp != ((void *)0) && sp->sst_lnum < current_lnum)
  sp = sp->sst_next;
     if (sp != ((void *)0)
      && sp->sst_lnum == current_lnum
      && syn_stack_equal(sp))
     {
  parsed_lnum = current_lnum;
  prev = sp;
  while (sp != ((void *)0) && sp->sst_change_lnum <= parsed_lnum)
  {
      if (sp->sst_lnum <= lnum)

   prev = sp;
      else if (sp->sst_change_lnum == 0)

   break;
      sp->sst_change_lnum = 0;
      sp = sp->sst_next;
  }
  load_current_state(prev);
     }



     else if (prev == ((void *)0)
   || current_lnum == lnum
   || current_lnum >= prev->sst_lnum + dist)
  prev = store_current_state();
 }



 line_breakcheck();
 if (got_int)
 {
     current_lnum = lnum;
     break;
 }
    }

    syn_start_line();
}





    static void
clear_syn_state(p)
    synstate_T *p;
{
    int i;
    garray_T *gap;

    if (p->sst_stacksize > 7)
    {
 gap = &(p->sst_union.sst_ga);
 for (i = 0; i < gap->ga_len; i++)
     unref_extmatch(((bufstate_T *)((gap)->ga_data))[i].bs_extmatch);
 ga_clear(gap);
    }
    else
    {
 for (i = 0; i < p->sst_stacksize; i++)
     unref_extmatch(p->sst_union.sst_stack[i].bs_extmatch);
    }
}




    static void
clear_current_state()
{
    int i;
    stateitem_T *sip;

    sip = (stateitem_T *)(current_state.ga_data);
    for (i = 0; i < current_state.ga_len; i++)
 unref_extmatch(sip[i].si_extmatch);
    ga_clear(&current_state);
}
# 681 "syntax.c"
    static void
syn_sync(wp, start_lnum, last_valid)
    win_T *wp;
    linenr_T start_lnum;
    synstate_T *last_valid;
{
    buf_T *curbuf_save;
    win_T *curwin_save;
    pos_T cursor_save;
    int idx;
    linenr_T lnum;
    linenr_T end_lnum;
    linenr_T break_lnum;
    int had_sync_point;
    stateitem_T *cur_si;
    synpat_T *spp;
    char_u *line;
    int found_flags = 0;
    int found_match_idx = 0;
    linenr_T found_current_lnum = 0;
    int found_current_col= 0;
    lpos_T found_m_endpos;
    colnr_T prev_current_col;




    invalidate_current_state();
# 718 "syntax.c"
    if (syn_block->b_syn_sync_minlines > start_lnum)
 start_lnum = 1;
    else
    {
 if (syn_block->b_syn_sync_minlines == 1)
     lnum = 1;
 else if (syn_block->b_syn_sync_minlines < 10)
     lnum = syn_block->b_syn_sync_minlines * 2;
 else
     lnum = syn_block->b_syn_sync_minlines * 3 / 2;
 if (syn_block->b_syn_sync_maxlines != 0
         && lnum > syn_block->b_syn_sync_maxlines)
     lnum = syn_block->b_syn_sync_maxlines;
 if (lnum >= start_lnum)
     start_lnum = 1;
 else
     start_lnum -= lnum;
    }
    current_lnum = start_lnum;




    if (syn_block->b_syn_sync_flags & 0x01)
    {


 curwin_save = curwin;
 curwin = wp;
 curbuf_save = curbuf;
 curbuf = syn_buf;




 for ( ; start_lnum > 1; --start_lnum)
 {
     line = ml_get(start_lnum - 1);
     if (*line == '\000' || *(line + strlen((char *)(line)) - 1) != '\\')
  break;
 }
 current_lnum = start_lnum;


 cursor_save = wp->w_cursor;
 wp->w_cursor.lnum = start_lnum;
 wp->w_cursor.col = 0;






 if (find_start_comment((int)syn_block->b_syn_sync_maxlines) != ((void *)0))
 {
     for (idx = syn_block->b_syn_patterns.ga_len; --idx >= 0; )
  if (((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[idx].sp_syn.id
         == syn_block->b_syn_sync_id
   && ((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[idx].sp_type == 2)
  {
      validate_current_state();
      if (push_current_state(idx) == 1)
   update_si_attr(current_state.ga_len - 1);
      break;
  }
 }


 wp->w_cursor = cursor_save;
 curwin = curwin_save;
 curbuf = curbuf_save;
    }




    else if (syn_block->b_syn_sync_flags & 0x02)
    {
 if (syn_block->b_syn_sync_maxlines != 0
          && start_lnum > syn_block->b_syn_sync_maxlines)
     break_lnum = start_lnum - syn_block->b_syn_sync_maxlines;
 else
     break_lnum = 0;

 found_m_endpos.lnum = 0;
 found_m_endpos.col = 0;
 end_lnum = start_lnum;
 lnum = start_lnum;
 while (--lnum > break_lnum)
 {

     line_breakcheck();
     if (got_int)
     {
  invalidate_current_state();
  current_lnum = start_lnum;
  break;
     }


     if (last_valid != ((void *)0) && lnum == last_valid->sst_lnum)
     {
  load_current_state(last_valid);
  break;
     }




     if (lnum > 1 && syn_match_linecont(lnum - 1))
  continue;




     validate_current_state();

     for (current_lnum = lnum; current_lnum < end_lnum; ++current_lnum)
     {
  syn_start_line();
  for (;;)
  {
      had_sync_point = syn_finish_line(1);




      if (had_sync_point && current_state.ga_len)
      {
   cur_si = &((stateitem_T *)(current_state.ga_data))[current_state.ga_len - 1];
   if (cur_si->si_m_endpos.lnum > start_lnum)
   {

       current_lnum = end_lnum;
       break;
   }
   if (cur_si->si_idx < 0)
   {

       found_flags = 0;
       found_match_idx = -1;
   }
   else
   {
       spp = &(((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[cur_si->si_idx]);
       found_flags = spp->sp_flags;
       found_match_idx = spp->sp_sync_idx;
   }
   found_current_lnum = current_lnum;
   found_current_col = current_col;
   found_m_endpos = cur_si->si_m_endpos;




   if (found_m_endpos.lnum > current_lnum)
   {
       current_lnum = found_m_endpos.lnum;
       current_col = found_m_endpos.col;
       if (current_lnum >= end_lnum)
    break;
   }
   else if (found_m_endpos.col > current_col)
       current_col = found_m_endpos.col;
   else
       ++current_col;




   prev_current_col = current_col;
   if (syn_getcurline()[current_col] != '\000')
       ++current_col;
   check_state_ends();
   current_col = prev_current_col;
      }
      else
   break;
  }
     }




     if (found_flags)
     {





  clear_current_state();
  if (found_match_idx >= 0
   && push_current_state(found_match_idx) == 1)
      update_si_attr(current_state.ga_len - 1);







  if (found_flags & 0x10)
  {
      if (current_state.ga_len)
      {
   cur_si = &((stateitem_T *)(current_state.ga_data))[current_state.ga_len - 1];
   cur_si->si_h_startpos.lnum = found_current_lnum;
   cur_si->si_h_startpos.col = found_current_col;
   update_si_end(cur_si, (int)current_col, 1);
   check_keepend();
      }
      current_col = found_m_endpos.col;
      current_lnum = found_m_endpos.lnum;
      (void)syn_finish_line(0);
      ++current_lnum;
  }
  else
      current_lnum = start_lnum;

  break;
     }

     end_lnum = lnum;
     invalidate_current_state();
 }


 if (lnum <= break_lnum)
 {
     invalidate_current_state();
     current_lnum = break_lnum + 1;
 }
    }

    validate_current_state();
}




    static int
syn_match_linecont(lnum)
    linenr_T lnum;
{
    regmmatch_T regmatch;

    if (syn_block->b_syn_linecont_prog != ((void *)0))
    {
 regmatch.rmm_ic = syn_block->b_syn_linecont_ic;
 regmatch.regprog = syn_block->b_syn_linecont_prog;
 return syn_regexec(&regmatch, lnum, (colnr_T)0);
    }
    return 0;
}




    static void
syn_start_line()
{
    current_finished = 0;
    current_col = 0;





    if (current_state.ga_len > 0)
 syn_update_ends(1);

    next_match_idx = -1;
    ++current_line_id;
}






    static void
syn_update_ends(startofline)
    int startofline;
{
    stateitem_T *cur_si;
    int i;
    int seen_keepend;

    if (startofline)
    {


 for (i = 0; i < current_state.ga_len; ++i)
 {
     cur_si = &((stateitem_T *)(current_state.ga_data))[i];
     if (cur_si->si_idx >= 0
      && (((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[cur_si->si_idx]).sp_type
              == 1
      && cur_si->si_m_endpos.lnum < current_lnum)
     {
  cur_si->si_flags |= 0x8000;
  cur_si->si_m_endpos.lnum = 0;
  cur_si->si_m_endpos.col = 0;
  cur_si->si_h_endpos = cur_si->si_m_endpos;
  cur_si->si_ends = 1;
     }
 }
    }
# 1037 "syntax.c"
    i = current_state.ga_len - 1;
    if (keepend_level >= 0)
 for ( ; i > keepend_level; --i)
     if (((stateitem_T *)(current_state.ga_data))[i].si_flags & 0x4000)
  break;

    seen_keepend = 0;
    for ( ; i < current_state.ga_len; ++i)
    {
 cur_si = &((stateitem_T *)(current_state.ga_data))[i];
 if ((cur_si->si_flags & 0x400)
       || (seen_keepend && !startofline)
       || (i == current_state.ga_len - 1 && startofline))
 {
     cur_si->si_h_startpos.col = 0;
     cur_si->si_h_startpos.lnum = current_lnum;

     if (!(cur_si->si_flags & 0x8000))
  update_si_end(cur_si, (int)current_col, !startofline);

     if (!startofline && (cur_si->si_flags & 0x400))
  seen_keepend = 1;
 }
    }
    check_keepend();
    check_state_ends();
}
# 1101 "syntax.c"
    static void
syn_stack_free_block(block)
    synblock_T *block;
{
    synstate_T *p;

    if (block->b_sst_array != ((void *)0))
    {
 for (p = block->b_sst_first; p != ((void *)0); p = p->sst_next)
     clear_syn_state(p);
 vim_free(block->b_sst_array);
 block->b_sst_array = ((void *)0);
 block->b_sst_len = 0;
    }
}




    void
syn_stack_free_all(block)
    synblock_T *block;
{
    win_T *wp;

    syn_stack_free_block(block);




    for (wp = firstwin; wp != ((void *)0); wp = wp->w_next)
    {
 if (wp->w_s == block && foldmethodIsSyntax(wp))
     foldUpdateAll(wp);
    }

}







    static void
syn_stack_alloc()
{
    long len;
    synstate_T *to, *from;
    synstate_T *sstp;

    len = syn_buf->b_ml.ml_line_count / 16 + Rows * 2;
    if (len < 150)
 len = 150;
    else if (len > 1000)
 len = 1000;
    if (syn_block->b_sst_len > len * 2 || syn_block->b_sst_len < len)
    {

 len = syn_buf->b_ml.ml_line_count;
 len = (len + len / 2) / 16 + Rows * 2;
 if (len < 150)
     len = 150;
 else if (len > 1000)
     len = 1000;

 if (syn_block->b_sst_array != ((void *)0))
 {


     while (syn_block->b_sst_len - syn_block->b_sst_freecount + 2 > len
      && syn_stack_cleanup())
  ;
     if (len < syn_block->b_sst_len - syn_block->b_sst_freecount + 2)
  len = syn_block->b_sst_len - syn_block->b_sst_freecount + 2;
 }

 sstp = (synstate_T *)alloc_clear((unsigned)(len * sizeof(synstate_T)));
 if (sstp == ((void *)0))
     return;

 to = sstp - 1;
 if (syn_block->b_sst_array != ((void *)0))
 {

     for (from = syn_block->b_sst_first; from != ((void *)0);
       from = from->sst_next)
     {
  ++to;
  *to = *from;
  to->sst_next = to + 1;
     }
 }
 if (to != sstp - 1)
 {
     to->sst_next = ((void *)0);
     syn_block->b_sst_first = sstp;
     syn_block->b_sst_freecount = len - (int)(to - sstp) - 1;
 }
 else
 {
     syn_block->b_sst_first = ((void *)0);
     syn_block->b_sst_freecount = len;
 }


 syn_block->b_sst_firstfree = to + 1;
 while (++to < sstp + len)
     to->sst_next = to + 1;
 (sstp + len - 1)->sst_next = ((void *)0);

 vim_free(syn_block->b_sst_array);
 syn_block->b_sst_array = sstp;
 syn_block->b_sst_len = len;
    }
}







    void
syn_stack_apply_changes(buf)
    buf_T *buf;
{
    win_T *wp;

    syn_stack_apply_changes_block(&buf->b_s, buf);

    for (wp = firstwin; wp != ((void *)0); wp = wp->w_next)
    {
 if ((wp->w_buffer == buf) && (wp->w_s != &buf->b_s))
     syn_stack_apply_changes_block(wp->w_s, buf);
    }
}

    static void
syn_stack_apply_changes_block(block, buf)
    synblock_T *block;
    buf_T *buf;
{
    synstate_T *p, *prev, *np;
    linenr_T n;

    if (block->b_sst_array == ((void *)0))
 return;

    prev = ((void *)0);
    for (p = block->b_sst_first; p != ((void *)0); )
    {
 if (p->sst_lnum + block->b_syn_sync_linebreaks > buf->b_mod_top)
 {
     n = p->sst_lnum + buf->b_mod_xlines;
     if (n <= buf->b_mod_bot)
     {

  np = p->sst_next;
  if (prev == ((void *)0))
      block->b_sst_first = np;
  else
      prev->sst_next = np;
  syn_stack_free_entry(block, p);
  p = np;
  continue;
     }



     if (p->sst_change_lnum != 0 && p->sst_change_lnum > buf->b_mod_top)
     {
  if (p->sst_change_lnum + buf->b_mod_xlines > buf->b_mod_top)
      p->sst_change_lnum += buf->b_mod_xlines;
  else
      p->sst_change_lnum = buf->b_mod_top;
     }
     if (p->sst_change_lnum == 0
      || p->sst_change_lnum < buf->b_mod_bot)
  p->sst_change_lnum = buf->b_mod_bot;

     p->sst_lnum = n;
 }
 prev = p;
 p = p->sst_next;
    }
}





    static int
syn_stack_cleanup()
{
    synstate_T *p, *prev;
    disptick_T tick;
    int above;
    int dist;
    int retval = 0;

    if (syn_block->b_sst_array == ((void *)0) || syn_block->b_sst_first == ((void *)0))
 return retval;


    if (syn_block->b_sst_len <= Rows)
 dist = 999999;
    else
 dist = syn_buf->b_ml.ml_line_count / (syn_block->b_sst_len - Rows) + 1;






    tick = syn_block->b_sst_lasttick;
    above = 0;
    prev = syn_block->b_sst_first;
    for (p = prev->sst_next; p != ((void *)0); prev = p, p = p->sst_next)
    {
 if (prev->sst_lnum + dist > p->sst_lnum)
 {
     if (p->sst_tick > syn_block->b_sst_lasttick)
     {
  if (!above || p->sst_tick < tick)
      tick = p->sst_tick;
  above = 1;
     }
     else if (!above && p->sst_tick < tick)
  tick = p->sst_tick;
 }
    }





    prev = syn_block->b_sst_first;
    for (p = prev->sst_next; p != ((void *)0); prev = p, p = p->sst_next)
    {
 if (p->sst_tick == tick && prev->sst_lnum + dist > p->sst_lnum)
 {

     prev->sst_next = p->sst_next;
     syn_stack_free_entry(syn_block, p);
     p = prev;
     retval = 1;
 }
    }
    return retval;
}





    static void
syn_stack_free_entry(block, p)
    synblock_T *block;
    synstate_T *p;
{
    clear_syn_state(p);
    p->sst_next = block->b_sst_firstfree;
    block->b_sst_firstfree = p;
    ++block->b_sst_freecount;
}





    static synstate_T *
syn_stack_find_entry(lnum)
    linenr_T lnum;
{
    synstate_T *p, *prev;

    prev = ((void *)0);
    for (p = syn_block->b_sst_first; p != ((void *)0); prev = p, p = p->sst_next)
    {
 if (p->sst_lnum == lnum)
     return p;
 if (p->sst_lnum > lnum)
     break;
    }
    return prev;
}





    static synstate_T *
store_current_state()
{
    int i;
    synstate_T *p;
    bufstate_T *bp;
    stateitem_T *cur_si;
    synstate_T *sp = syn_stack_find_entry(current_lnum);





    for (i = current_state.ga_len - 1; i >= 0; --i)
    {
 cur_si = &((stateitem_T *)(current_state.ga_data))[i];
 if (cur_si->si_h_startpos.lnum >= current_lnum
  || cur_si->si_m_endpos.lnum >= current_lnum
  || cur_si->si_h_endpos.lnum >= current_lnum
  || (cur_si->si_end_idx
      && cur_si->si_eoe_pos.lnum >= current_lnum))
     break;
    }
    if (i >= 0)
    {
 if (sp != ((void *)0))
 {

     if (syn_block->b_sst_first == sp)

  syn_block->b_sst_first = sp->sst_next;
     else
     {

  for (p = syn_block->b_sst_first; p != ((void *)0); p = p->sst_next)
      if (p->sst_next == sp)
   break;
  if (p != ((void *)0))
      p->sst_next = sp->sst_next;
     }
     syn_stack_free_entry(syn_block, sp);
     sp = ((void *)0);
 }
    }
    else if (sp == ((void *)0) || sp->sst_lnum != current_lnum)
    {




 if (syn_block->b_sst_freecount == 0)
 {
     (void)syn_stack_cleanup();

     sp = syn_stack_find_entry(current_lnum);
 }

 if (syn_block->b_sst_freecount == 0)
     sp = ((void *)0);
 else
 {


     p = syn_block->b_sst_firstfree;
     syn_block->b_sst_firstfree = p->sst_next;
     --syn_block->b_sst_freecount;
     if (sp == ((void *)0))
     {

  p->sst_next = syn_block->b_sst_first;
  syn_block->b_sst_first = p;
     }
     else
     {

  p->sst_next = sp->sst_next;
  sp->sst_next = p;
     }
     sp = p;
     sp->sst_stacksize = 0;
     sp->sst_lnum = current_lnum;
 }
    }
    if (sp != ((void *)0))
    {

 clear_syn_state(sp);
 sp->sst_stacksize = current_state.ga_len;
 if (current_state.ga_len > 7)
 {


     ga_init2(&sp->sst_union.sst_ga, (int)sizeof(bufstate_T), 1);
     if (ga_grow(&sp->sst_union.sst_ga, current_state.ga_len) == 0)
  sp->sst_stacksize = 0;
     else
  sp->sst_union.sst_ga.ga_len = current_state.ga_len;
     bp = ((bufstate_T *)((&(sp->sst_union.sst_ga))->ga_data));
 }
 else
     bp = sp->sst_union.sst_stack;
 for (i = 0; i < sp->sst_stacksize; ++i)
 {
     bp[i].bs_idx = ((stateitem_T *)(current_state.ga_data))[i].si_idx;
     bp[i].bs_flags = ((stateitem_T *)(current_state.ga_data))[i].si_flags;




     bp[i].bs_extmatch = ref_extmatch(((stateitem_T *)(current_state.ga_data))[i].si_extmatch);
 }
 sp->sst_next_flags = current_next_flags;
 sp->sst_next_list = current_next_list;
 sp->sst_tick = display_tick;
 sp->sst_change_lnum = 0;
    }
    current_state_stored = 1;
    return sp;
}




    static void
load_current_state(from)
    synstate_T *from;
{
    int i;
    bufstate_T *bp;

    clear_current_state();
    validate_current_state();
    keepend_level = -1;
    if (from->sst_stacksize
     && ga_grow(&current_state, from->sst_stacksize) != 0)
    {
 if (from->sst_stacksize > 7)
     bp = ((bufstate_T *)((&(from->sst_union.sst_ga))->ga_data));
 else
     bp = from->sst_union.sst_stack;
 for (i = 0; i < from->sst_stacksize; ++i)
 {
     ((stateitem_T *)(current_state.ga_data))[i].si_idx = bp[i].bs_idx;
     ((stateitem_T *)(current_state.ga_data))[i].si_flags = bp[i].bs_flags;




     ((stateitem_T *)(current_state.ga_data))[i].si_extmatch = ref_extmatch(bp[i].bs_extmatch);
     if (keepend_level < 0 && (((stateitem_T *)(current_state.ga_data))[i].si_flags & 0x400))
  keepend_level = i;
     ((stateitem_T *)(current_state.ga_data))[i].si_ends = 0;
     ((stateitem_T *)(current_state.ga_data))[i].si_m_lnum = 0;
     if (((stateitem_T *)(current_state.ga_data))[i].si_idx >= 0)
  ((stateitem_T *)(current_state.ga_data))[i].si_next_list =
       (((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[((stateitem_T *)(current_state.ga_data))[i].si_idx]).sp_next_list;
     else
  ((stateitem_T *)(current_state.ga_data))[i].si_next_list = ((void *)0);
     update_si_attr(i);
 }
 current_state.ga_len = from->sst_stacksize;
    }
    current_next_list = from->sst_next_list;
    current_next_flags = from->sst_next_flags;
    current_lnum = from->sst_lnum;
}





    static int
syn_stack_equal(sp)
    synstate_T *sp;
{
    int i, j;
    bufstate_T *bp;
    reg_extmatch_T *six, *bsx;


    if (sp->sst_stacksize == current_state.ga_len
     && sp->sst_next_list == current_next_list)
    {

 if (sp->sst_stacksize > 7)
     bp = ((bufstate_T *)((&(sp->sst_union.sst_ga))->ga_data));
 else
     bp = sp->sst_union.sst_stack;

 for (i = current_state.ga_len; --i >= 0; )
 {

     if (bp[i].bs_idx != ((stateitem_T *)(current_state.ga_data))[i].si_idx)
  break;
     if (bp[i].bs_extmatch != ((stateitem_T *)(current_state.ga_data))[i].si_extmatch)
     {



  bsx = bp[i].bs_extmatch;
  six = ((stateitem_T *)(current_state.ga_data))[i].si_extmatch;


  if (bsx == ((void *)0) || six == ((void *)0))
      break;
  for (j = 0; j < 10; ++j)
  {


      if (bsx->matches[j] != six->matches[j])
      {



   if (bsx->matches[j] == ((void *)0)
    || six->matches[j] == ((void *)0))
       break;
   if ((((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[((stateitem_T *)(current_state.ga_data))[i].si_idx]).sp_ic
    ? strcasecmp((char *)((bsx->matches[j])), (char *)((six->matches[j]))) != 0

    : strcmp((char *)(bsx->matches[j]), (char *)(six->matches[j])) != 0)
       break;
      }
  }
  if (j != 10)
      break;
     }
 }
 if (i < 0)
     return 1;
    }
    return 0;
}
# 1637 "syntax.c"
    void
syntax_end_parsing(lnum)
    linenr_T lnum;
{
    synstate_T *sp;

    sp = syn_stack_find_entry(lnum);
    if (sp != ((void *)0) && sp->sst_lnum < lnum)
 sp = sp->sst_next;

    if (sp != ((void *)0) && sp->sst_change_lnum != 0)
 sp->sst_change_lnum = lnum;
}





    static void
invalidate_current_state()
{
    clear_current_state();
    current_state.ga_itemsize = 0;
    current_next_list = ((void *)0);
    keepend_level = -1;
}

    static void
validate_current_state()
{
    current_state.ga_itemsize = sizeof(stateitem_T);
    current_state.ga_growsize = 3;
}






    int
syntax_check_changed(lnum)
    linenr_T lnum;
{
    int retval = 1;
    synstate_T *sp;
# 1690 "syntax.c"
    if (((&current_state)->ga_itemsize != 0) && lnum == current_lnum + 1)
    {
 sp = syn_stack_find_entry(lnum);
 if (sp != ((void *)0) && sp->sst_lnum == lnum)
 {




     (void)syn_finish_line(0);





     if (syn_stack_equal(sp))
  retval = 0;




     ++current_lnum;
     (void)store_current_state();
 }
    }

    return retval;
}







    static int
syn_finish_line(syncing)
    int syncing;
{
    stateitem_T *cur_si;
    colnr_T prev_current_col;

    if (!current_finished)
    {
 while (!current_finished)
 {
     (void)syn_current_attr(syncing, 0, ((void *)0), 0);



     if (syncing && current_state.ga_len)
     {



  cur_si = &((stateitem_T *)(current_state.ga_data))[current_state.ga_len - 1];
  if (cur_si->si_idx >= 0
   && (((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[cur_si->si_idx].sp_flags
           & (0x10|0x20)))
      return 1;




  prev_current_col = current_col;
  if (syn_getcurline()[current_col] != '\000')
      ++current_col;
  check_state_ends();
  current_col = prev_current_col;
     }
     ++current_col;
 }
    }
    return 0;
}
# 1775 "syntax.c"
    int
get_syntax_attr(col, can_spell, keep_state)
    colnr_T col;
    int *can_spell;
    int keep_state;
{
    int attr = 0;

    if (can_spell != ((void *)0))


 *can_spell = syn_block->b_syn_spell == 0
      ? (syn_block->b_spell_cluster_id == 0)
      : (syn_block->b_syn_spell == 1);


    if (syn_block->b_sst_array == ((void *)0))
 return 0;


    if (syn_buf->b_p_smc > 0 && col >= (colnr_T)syn_buf->b_p_smc)
    {
 clear_current_state();

 current_id = 0;
 current_trans_id = 0;




 return 0;
    }


    if (((&current_state)->ga_itemsize == 0))
 validate_current_state();




    while (current_col <= col)
    {
 attr = syn_current_attr(0, 1, can_spell,
         current_col == col ? keep_state : 0);
 ++current_col;
    }

    return attr;
}




    static int
syn_current_attr(syncing, displaying, can_spell, keep_state)
    int syncing;
    int displaying;
    int *can_spell;
    int keep_state;
{
    int syn_id;
    lpos_T endpos;
    lpos_T hl_startpos;
    lpos_T hl_endpos;
    lpos_T eos_pos;
    lpos_T eoe_pos;
    int end_idx;
    int idx;
    synpat_T *spp;
    stateitem_T *cur_si, *sip = ((void *)0);
    int startcol;
    int endcol;
    long flags;
    int cchar;
    short *next_list;
    int found_match;
    static int try_next_column = 0;
    int do_keywords;
    regmmatch_T regmatch;
    lpos_T pos;
    int lc_col;
    reg_extmatch_T *cur_extmatch = ((void *)0);
    char_u *line;



    int keep_next_list;
    int zero_width_next_list = 0;
    garray_T zero_width_next_ga;





    line = syn_getcurline();
    if (line[current_col] == '\000' && current_col != 0)
    {



 if (next_match_idx >= 0 && next_match_col >= (int)current_col
        && next_match_col != (0x7fffffffL))
     (void)push_next_match(((void *)0));

 current_finished = 1;
 current_state_stored = 0;
 return 0;
    }


    if (line[current_col] == '\000' || line[current_col + 1] == '\000')
    {
 current_finished = 1;
 current_state_stored = 0;
    }






    if (try_next_column)
    {
 next_match_idx = -1;
 try_next_column = 0;
    }


    do_keywords = !syncing
      && (syn_block->b_keywtab.ht_used > 0
       || syn_block->b_keywtab_ic.ht_used > 0);



    ga_init2(&zero_width_next_ga, (int)sizeof(int), 10);






    do
    {
 found_match = 0;
 keep_next_list = 0;
 syn_id = 0;
# 1929 "syntax.c"
 if (current_state.ga_len)
     cur_si = &((stateitem_T *)(current_state.ga_data))[current_state.ga_len - 1];
 else
     cur_si = ((void *)0);

 if (syn_block->b_syn_containedin || cur_si == ((void *)0)
           || cur_si->si_cont_list != ((void *)0))
 {




     if (do_keywords)
     {
       line = syn_getcurline();
       if (vim_iswordc_buf(line + current_col, syn_buf)
        && (current_col == 0
     || !vim_iswordc_buf(line + current_col - 1





          , syn_buf)))
       {
  syn_id = check_keyword_id(line, (int)current_col,
      &endcol, &flags, &next_list, cur_si,
      &cchar);
  if (syn_id != 0)
  {
      if (push_current_state(-1) == 1)
      {
   cur_si = &((stateitem_T *)(current_state.ga_data))[current_state.ga_len - 1];
   cur_si->si_m_startcol = current_col;
   cur_si->si_h_startpos.lnum = current_lnum;
   cur_si->si_h_startpos.col = 0;
   cur_si->si_m_endpos.lnum = current_lnum;
   cur_si->si_m_endpos.col = endcol;
   cur_si->si_h_endpos.lnum = current_lnum;
   cur_si->si_h_endpos.col = endcol;
   cur_si->si_ends = 1;
   cur_si->si_end_idx = 0;
   cur_si->si_flags = flags;
# 1980 "syntax.c"
   cur_si->si_id = syn_id;
   cur_si->si_trans_id = syn_id;
   if (flags & 0x02)
   {
       if (current_state.ga_len < 2)
       {
    cur_si->si_attr = 0;
    cur_si->si_trans_id = 0;
       }
       else
       {
    cur_si->si_attr = ((stateitem_T *)(current_state.ga_data))[current_state.ga_len - 2].si_attr;

    cur_si->si_trans_id = ((stateitem_T *)(current_state.ga_data))[current_state.ga_len - 2].si_trans_id;

       }
   }
   else
       cur_si->si_attr = syn_id2attr(syn_id);
   cur_si->si_cont_list = ((void *)0);
   cur_si->si_next_list = next_list;
   check_keepend();
      }
      else
   vim_free(next_list);
  }
       }
     }




     if (syn_id == 0 && syn_block->b_syn_patterns.ga_len)
     {




  if (next_match_idx < 0 || next_match_col < (int)current_col)
  {






      next_match_idx = 0;
      next_match_col = (0x7fffffffL);
      for (idx = syn_block->b_syn_patterns.ga_len; --idx >= 0; )
      {
   spp = &(((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[idx]);
   if ( spp->sp_syncing == syncing
    && (displaying || !(spp->sp_flags & 0x1000))
    && (spp->sp_type == 1
        || spp->sp_type == 2)
    && (current_next_list != ((void *)0)
        ? in_id_list(((void *)0), current_next_list,
             &spp->sp_syn, 0)
        : (cur_si == ((void *)0)
     ? !(spp->sp_flags & 0x01)
     : in_id_list(cur_si,
         cur_si->si_cont_list, &spp->sp_syn,
         spp->sp_flags & 0x01))))
   {



       if (spp->sp_line_id == current_line_id
        && spp->sp_startcol >= next_match_col)
    continue;
       spp->sp_line_id = current_line_id;

       lc_col = current_col - spp->sp_offsets[6];
       if (lc_col < 0)
    lc_col = 0;

       regmatch.rmm_ic = spp->sp_ic;
       regmatch.regprog = spp->sp_prog;
       if (!syn_regexec(&regmatch, current_lnum,
            (colnr_T)lc_col))
       {

    spp->sp_startcol = (0x7fffffffL);
    continue;
       }




       syn_add_start_off(&pos, &regmatch,
        spp, 0, -1);
       if (pos.lnum > current_lnum)
       {


    spp->sp_startcol = (0x7fffffffL);
    continue;
       }
       startcol = pos.col;



       spp->sp_startcol = startcol;





       if (startcol >= next_match_col)
    continue;






       if (did_match_already(idx, &zero_width_next_ga))
       {
    try_next_column = 1;
    continue;
       }

       endpos.lnum = regmatch.endpos[0].lnum;
       endpos.col = regmatch.endpos[0].col;


       syn_add_start_off(&hl_startpos, &regmatch,
        spp, 2, -1);



       syn_add_end_off(&eos_pos, &regmatch,
        spp, 4, 0);





       unref_extmatch(cur_extmatch);
       cur_extmatch = re_extmatch_out;
       re_extmatch_out = ((void *)0);

       flags = 0;
       eoe_pos.lnum = 0;
       eoe_pos.col = 0;
       end_idx = 0;
       hl_endpos.lnum = 0;







       if (spp->sp_type == 2
           && (spp->sp_flags & 0x04))
       {
    lpos_T startpos;

    startpos = endpos;
    find_endpos(idx, &startpos, &endpos, &hl_endpos,
        &flags, &eoe_pos, &end_idx, cur_extmatch);
    if (endpos.lnum == 0)
        continue;
       }






       else if (spp->sp_type == 1)
       {
    syn_add_end_off(&hl_endpos, &regmatch, spp,
              3, 0);
    syn_add_end_off(&endpos, &regmatch, spp,
              1, 0);
    if (endpos.lnum == current_lnum
          && (int)endpos.col + syncing < startcol)
    {




        if (regmatch.startpos[0].col
          == regmatch.endpos[0].col)
     try_next_column = 1;
        continue;
    }
       }






       if (hl_startpos.lnum == current_lnum
        && (int)hl_startpos.col < startcol)
    hl_startpos.col = startcol;
       limit_pos_zero(&hl_endpos, &endpos);

       next_match_idx = idx;
       next_match_col = startcol;
       next_match_m_endpos = endpos;
       next_match_h_endpos = hl_endpos;
       next_match_h_startpos = hl_startpos;
       next_match_flags = flags;
       next_match_eos_pos = eos_pos;
       next_match_eoe_pos = eoe_pos;
       next_match_end_idx = end_idx;
       unref_extmatch(next_match_extmatch);
       next_match_extmatch = cur_extmatch;
       cur_extmatch = ((void *)0);
   }
      }
  }




  if (next_match_idx >= 0 && next_match_col == (int)current_col)
  {
      synpat_T *lspp;



      lspp = &(((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[next_match_idx]);
      if (next_match_m_endpos.lnum == current_lnum
       && next_match_m_endpos.col == current_col
       && lspp->sp_next_list != ((void *)0))
      {
   current_next_list = lspp->sp_next_list;
   current_next_flags = lspp->sp_flags;
   keep_next_list = 1;
   zero_width_next_list = 1;




   if (ga_grow(&zero_width_next_ga, 1) == 1)
   {
       ((int *)(zero_width_next_ga.ga_data))
    [zero_width_next_ga.ga_len++] = next_match_idx;
   }
   next_match_idx = -1;
      }
      else
   cur_si = push_next_match(cur_si);
      found_match = 1;
  }
     }
 }




 if (current_next_list != ((void *)0) && !keep_next_list)
 {





     if (!found_match)
     {
  line = syn_getcurline();
  if (((current_next_flags & 0x100)
       && ((line[current_col]) == ' ' || (line[current_col]) == '\t'))
   || ((current_next_flags & 0x200)
       && *line == '\000'))
      break;
     }
# 2261 "syntax.c"
     current_next_list = ((void *)0);
     next_match_idx = -1;
     if (!zero_width_next_list)
  found_match = 1;
 }

    } while (found_match);





    current_attr = 0;

    current_id = 0;
    current_trans_id = 0;




    if (cur_si != ((void *)0))
    {



 for (idx = current_state.ga_len - 1; idx >= 0; --idx)
 {
     sip = &((stateitem_T *)(current_state.ga_data))[idx];
     if ((current_lnum > sip->si_h_startpos.lnum
   || (current_lnum == sip->si_h_startpos.lnum
       && current_col >= sip->si_h_startpos.col))
      && (sip->si_h_endpos.lnum == 0
   || current_lnum < sip->si_h_endpos.lnum
   || (current_lnum == sip->si_h_endpos.lnum
       && current_col < sip->si_h_endpos.col)))
     {
  current_attr = sip->si_attr;

  current_id = sip->si_id;

  current_trans_id = sip->si_trans_id;





  break;
     }
 }

 if (can_spell != ((void *)0))
 {
     struct sp_syn sps;





     if (syn_block->b_spell_cluster_id == 0)
     {


  if (syn_block->b_nospell_cluster_id == 0
           || current_trans_id == 0)
      *can_spell = (syn_block->b_syn_spell != 2);
  else
  {
      sps.inc_tag = 0;
      sps.id = syn_block->b_nospell_cluster_id;
      sps.cont_in_list = ((void *)0);
      *can_spell = !in_id_list(sip, sip->si_cont_list, &sps, 0);
  }
     }
     else
     {




  if (current_trans_id == 0)
      *can_spell = (syn_block->b_syn_spell == 1);
  else
  {
      sps.inc_tag = 0;
      sps.id = syn_block->b_spell_cluster_id;
      sps.cont_in_list = ((void *)0);
      *can_spell = in_id_list(sip, sip->si_cont_list, &sps, 0);

      if (syn_block->b_nospell_cluster_id != 0)
      {
   sps.id = syn_block->b_nospell_cluster_id;
   if (in_id_list(sip, sip->si_cont_list, &sps, 0))
       *can_spell = 0;
      }
  }
     }
 }
# 2368 "syntax.c"
 if (!syncing && !keep_state)
 {
     check_state_ends();
     if (current_state.ga_len > 0
          && syn_getcurline()[current_col] != '\000')
     {
  ++current_col;
  check_state_ends();
  --current_col;
     }
 }
    }
    else if (can_spell != ((void *)0))


 *can_spell = syn_block->b_syn_spell == 0
      ? (syn_block->b_spell_cluster_id == 0)
      : (syn_block->b_syn_spell == 1);


    if (current_next_list != ((void *)0)
     && syn_getcurline()[current_col + 1] == '\000'
     && !(current_next_flags & (0x80 | 0x200)))
 current_next_list = ((void *)0);

    if (zero_width_next_ga.ga_len > 0)
 ga_clear(&zero_width_next_ga);


    unref_extmatch(re_extmatch_out);
    re_extmatch_out = ((void *)0);
    unref_extmatch(cur_extmatch);

    return current_attr;
}





    static int
did_match_already(idx, gap)
    int idx;
    garray_T *gap;
{
    int i;

    for (i = current_state.ga_len; --i >= 0; )
 if (((stateitem_T *)(current_state.ga_data))[i].si_m_startcol == (int)current_col
  && ((stateitem_T *)(current_state.ga_data))[i].si_m_lnum == (int)current_lnum
  && ((stateitem_T *)(current_state.ga_data))[i].si_idx == idx)
     return 1;



    for (i = gap->ga_len; --i >= 0; )
 if (((int *)(gap->ga_data))[i] == idx)
     return 1;

    return 0;
}




    static stateitem_T *
push_next_match(cur_si)
    stateitem_T *cur_si;
{
    synpat_T *spp;




    spp = &(((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[next_match_idx]);




    if (push_current_state(next_match_idx) == 1)
    {




 cur_si = &((stateitem_T *)(current_state.ga_data))[current_state.ga_len - 1];
 cur_si->si_h_startpos = next_match_h_startpos;
 cur_si->si_m_startcol = current_col;
 cur_si->si_m_lnum = current_lnum;
 cur_si->si_flags = spp->sp_flags;







 cur_si->si_next_list = spp->sp_next_list;
 cur_si->si_extmatch = ref_extmatch(next_match_extmatch);
 if (spp->sp_type == 2 && !(spp->sp_flags & 0x04))
 {

     update_si_end(cur_si, (int)(next_match_m_endpos.col), 1);
     check_keepend();
 }
 else
 {
     cur_si->si_m_endpos = next_match_m_endpos;
     cur_si->si_h_endpos = next_match_h_endpos;
     cur_si->si_ends = 1;
     cur_si->si_flags |= next_match_flags;
     cur_si->si_eoe_pos = next_match_eoe_pos;
     cur_si->si_end_idx = next_match_end_idx;
 }
 if (keepend_level < 0 && (cur_si->si_flags & 0x400))
     keepend_level = current_state.ga_len - 1;
 check_keepend();
 update_si_attr(current_state.ga_len - 1);
# 2494 "syntax.c"
 if ( spp->sp_type == 2
  && spp->sp_syn_match_id != 0
  && push_current_state(next_match_idx) == 1)
 {
     cur_si = &((stateitem_T *)(current_state.ga_data))[current_state.ga_len - 1];
     cur_si->si_h_startpos = next_match_h_startpos;
     cur_si->si_m_startcol = current_col;
     cur_si->si_m_lnum = current_lnum;
     cur_si->si_m_endpos = next_match_eos_pos;
     cur_si->si_h_endpos = next_match_eos_pos;
     cur_si->si_ends = 1;
     cur_si->si_end_idx = 0;
     cur_si->si_flags = 0x40;






     cur_si->si_next_list = ((void *)0);
     check_keepend();
     update_si_attr(current_state.ga_len - 1);
 }
    }

    next_match_idx = -1;

    return cur_si;
}




    static void
check_state_ends()
{
    stateitem_T *cur_si;
    int had_extend = 0;

    cur_si = &((stateitem_T *)(current_state.ga_data))[current_state.ga_len - 1];
    for (;;)
    {
 if (cur_si->si_ends
  && (cur_si->si_m_endpos.lnum < current_lnum
      || (cur_si->si_m_endpos.lnum == current_lnum
   && cur_si->si_m_endpos.col <= current_col)))
 {






     if (cur_si->si_end_idx
      && (cur_si->si_eoe_pos.lnum > current_lnum
   || (cur_si->si_eoe_pos.lnum == current_lnum
       && cur_si->si_eoe_pos.col > current_col)))
     {
  cur_si->si_idx = cur_si->si_end_idx;
  cur_si->si_end_idx = 0;
  cur_si->si_m_endpos = cur_si->si_eoe_pos;
  cur_si->si_h_endpos = cur_si->si_eoe_pos;
  cur_si->si_flags |= 0x40;





  update_si_attr(current_state.ga_len - 1);


  next_match_idx = 0;
  next_match_col = (0x7fffffffL);
  break;
     }
     else
     {


  current_next_list = cur_si->si_next_list;
  current_next_flags = cur_si->si_flags;
  if (!(current_next_flags & (0x80 | 0x200))
   && syn_getcurline()[current_col] == '\000')
      current_next_list = ((void *)0);



   if (cur_si->si_flags & 0x4000)
       had_extend = 1;

  pop_current_state();

  if (current_state.ga_len == 0)
      break;

  if (had_extend && keepend_level >= 0)
  {
      syn_update_ends(0);
      if (current_state.ga_len == 0)
   break;
  }

  cur_si = &((stateitem_T *)(current_state.ga_data))[current_state.ga_len - 1];
# 2607 "syntax.c"
  if (cur_si->si_idx >= 0
   && ((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[cur_si->si_idx].sp_type
              == 2
   && !(cur_si->si_flags & (0x40 | 0x400)))
  {
      update_si_end(cur_si, (int)current_col, 1);
      check_keepend();
      if ((current_next_flags & 0x08)
       && keepend_level < 0
       && syn_getcurline()[current_col] == '\000')
   break;
  }
     }
 }
 else
     break;
    }
}





    static void
update_si_attr(idx)
    int idx;
{
    stateitem_T *sip = &((stateitem_T *)(current_state.ga_data))[idx];
    synpat_T *spp;


    if (sip->si_idx < 0)
 return;

    spp = &(((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[sip->si_idx]);
    if (sip->si_flags & 0x40)
 sip->si_id = spp->sp_syn_match_id;
    else
 sip->si_id = spp->sp_syn.id;
    sip->si_attr = syn_id2attr(sip->si_id);
    sip->si_trans_id = sip->si_id;
    if (sip->si_flags & 0x40)
 sip->si_cont_list = ((void *)0);
    else
 sip->si_cont_list = spp->sp_cont_list;






    if ((spp->sp_flags & 0x02) && !(sip->si_flags & 0x40))
    {
 if (idx == 0)
 {
     sip->si_attr = 0;
     sip->si_trans_id = 0;
     if (sip->si_cont_list == ((void *)0))
  sip->si_cont_list = (short *)-1;
 }
 else
 {
     sip->si_attr = ((stateitem_T *)(current_state.ga_data))[idx - 1].si_attr;
     sip->si_trans_id = ((stateitem_T *)(current_state.ga_data))[idx - 1].si_trans_id;
     sip->si_h_startpos = ((stateitem_T *)(current_state.ga_data))[idx - 1].si_h_startpos;
     sip->si_h_endpos = ((stateitem_T *)(current_state.ga_data))[idx - 1].si_h_endpos;
     if (sip->si_cont_list == ((void *)0))
     {
  sip->si_flags |= 0x10000;
  sip->si_cont_list = ((stateitem_T *)(current_state.ga_data))[idx - 1].si_cont_list;
     }
 }
    }
}





    static void
check_keepend()
{
    int i;
    lpos_T maxpos;
    lpos_T maxpos_h;
    stateitem_T *sip;





    if (keepend_level < 0)
 return;






    for (i = current_state.ga_len - 1; i > keepend_level; --i)
 if (((stateitem_T *)(current_state.ga_data))[i].si_flags & 0x4000)
     break;

    maxpos.lnum = 0;
    maxpos.col = 0;
    maxpos_h.lnum = 0;
    maxpos_h.col = 0;
    for ( ; i < current_state.ga_len; ++i)
    {
 sip = &((stateitem_T *)(current_state.ga_data))[i];
 if (maxpos.lnum != 0)
 {
     limit_pos_zero(&sip->si_m_endpos, &maxpos);
     limit_pos_zero(&sip->si_h_endpos, &maxpos_h);
     limit_pos_zero(&sip->si_eoe_pos, &maxpos);
     sip->si_ends = 1;
 }
 if (sip->si_ends && (sip->si_flags & 0x400))
 {
     if (maxpos.lnum == 0
      || maxpos.lnum > sip->si_m_endpos.lnum
      || (maxpos.lnum == sip->si_m_endpos.lnum
   && maxpos.col > sip->si_m_endpos.col))
  maxpos = sip->si_m_endpos;
     if (maxpos_h.lnum == 0
      || maxpos_h.lnum > sip->si_h_endpos.lnum
      || (maxpos_h.lnum == sip->si_h_endpos.lnum
   && maxpos_h.col > sip->si_h_endpos.col))
  maxpos_h = sip->si_h_endpos;
 }
    }
}







    static void
update_si_end(sip, startcol, force)
    stateitem_T *sip;
    int startcol;
    int force;
{
    lpos_T startpos;
    lpos_T endpos;
    lpos_T hl_endpos;
    lpos_T end_endpos;
    int end_idx;


    if (sip->si_idx < 0)
 return;




    if (!force && sip->si_m_endpos.lnum >= current_lnum)
 return;





    end_idx = 0;
    startpos.lnum = current_lnum;
    startpos.col = startcol;
    find_endpos(sip->si_idx, &startpos, &endpos, &hl_endpos,
     &(sip->si_flags), &end_endpos, &end_idx, sip->si_extmatch);

    if (endpos.lnum == 0)
    {

 if (((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[sip->si_idx].sp_flags & 0x04)
 {

     sip->si_ends = 1;
     sip->si_m_endpos.lnum = current_lnum;
     sip->si_m_endpos.col = (colnr_T)strlen((char *)(syn_getcurline()));
 }
 else
 {

     sip->si_ends = 0;
     sip->si_m_endpos.lnum = 0;
 }
 sip->si_h_endpos = sip->si_m_endpos;
    }
    else
    {

 sip->si_m_endpos = endpos;
 sip->si_h_endpos = hl_endpos;
 sip->si_eoe_pos = end_endpos;
 sip->si_ends = 1;
 sip->si_end_idx = end_idx;
    }
}






    static int
push_current_state(idx)
    int idx;
{
    if (ga_grow(&current_state, 1) == 0)
 return 0;
    ((__builtin_object_size ((&((stateitem_T *)(current_state.ga_data))[current_state.ga_len]), 0) != (size_t) -1) ? __builtin___memset_chk ((&((stateitem_T *)(current_state.ga_data))[current_state.ga_len]), (0), (sizeof(stateitem_T)), __builtin_object_size ((&((stateitem_T *)(current_state.ga_data))[current_state.ga_len]), 0)) : __inline_memset_chk ((&((stateitem_T *)(current_state.ga_data))[current_state.ga_len]), (0), (sizeof(stateitem_T))));
    ((stateitem_T *)(current_state.ga_data))[current_state.ga_len].si_idx = idx;
    ++current_state.ga_len;
    return 1;
}




    static void
pop_current_state()
{
    if (current_state.ga_len)
    {
 unref_extmatch(((stateitem_T *)(current_state.ga_data))[current_state.ga_len - 1].si_extmatch);
 --current_state.ga_len;
    }

    next_match_idx = -1;


    if (keepend_level >= current_state.ga_len)
 keepend_level = -1;
}
# 2852 "syntax.c"
    static void
find_endpos(idx, startpos, m_endpos, hl_endpos, flagsp, end_endpos,
          end_idx, start_ext)
    int idx;
    lpos_T *startpos;
    lpos_T *m_endpos;
    lpos_T *hl_endpos;
    long *flagsp;
    lpos_T *end_endpos;
    int *end_idx;
    reg_extmatch_T *start_ext;
{
    colnr_T matchcol;
    synpat_T *spp, *spp_skip;
    int start_idx;
    int best_idx;
    regmmatch_T regmatch;
    regmmatch_T best_regmatch;
    lpos_T pos;
    char_u *line;
    int had_match = 0;


    if (idx < 0)
 return;






    spp = &(((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[idx]);
    if (spp->sp_type != 2)
    {
 *hl_endpos = *startpos;
 return;
    }




    for (;;)
    {
 spp = &(((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[idx]);
 if (spp->sp_type != 2)
     break;
 ++idx;
    }




    if (spp->sp_type == 4)
    {
 spp_skip = spp;
 ++idx;
    }
    else
 spp_skip = ((void *)0);


    unref_extmatch(re_extmatch_in);
    re_extmatch_in = ref_extmatch(start_ext);

    matchcol = startpos->col;
    start_idx = idx;
    best_regmatch.startpos[0].col = 0;
    for (;;)
    {



 best_idx = -1;
 for (idx = start_idx; idx < syn_block->b_syn_patterns.ga_len; ++idx)
 {
     int lc_col = matchcol;

     spp = &(((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[idx]);
     if (spp->sp_type != 3)
  break;
     lc_col -= spp->sp_offsets[6];
     if (lc_col < 0)
  lc_col = 0;

     regmatch.rmm_ic = spp->sp_ic;
     regmatch.regprog = spp->sp_prog;
     if (syn_regexec(&regmatch, startpos->lnum, lc_col))
     {
  if (best_idx == -1 || regmatch.startpos[0].col
           < best_regmatch.startpos[0].col)
  {
      best_idx = idx;
      best_regmatch.startpos[0] = regmatch.startpos[0];
      best_regmatch.endpos[0] = regmatch.endpos[0];
  }
     }
 }





 if (best_idx == -1)
     break;





 if (spp_skip != ((void *)0))
 {
     int lc_col = matchcol - spp_skip->sp_offsets[6];

     if (lc_col < 0)
  lc_col = 0;
     regmatch.rmm_ic = spp_skip->sp_ic;
     regmatch.regprog = spp_skip->sp_prog;
     if (syn_regexec(&regmatch, startpos->lnum, lc_col)
      && regmatch.startpos[0].col
          <= best_regmatch.startpos[0].col)
     {

  syn_add_end_off(&pos, &regmatch, spp_skip, 1, 1);



  if (pos.lnum > startpos->lnum)
      break;

  line = ml_get_buf(syn_buf, startpos->lnum, 0);


  if (pos.col <= matchcol)
      ++matchcol;
  else if (pos.col <= regmatch.endpos[0].col)
      matchcol = pos.col;
  else

      for (matchcol = regmatch.endpos[0].col;
       line[matchcol] != '\000' && matchcol < pos.col;
           ++matchcol)
   ;


  if (line[matchcol] == '\000')
      break;

  continue;
     }
 }





 spp = &(((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[best_idx]);
 syn_add_end_off(m_endpos, &best_regmatch, spp, 1, 1);

 if (m_endpos->lnum == startpos->lnum && m_endpos->col < startpos->col)
     m_endpos->col = startpos->col;

 syn_add_end_off(end_endpos, &best_regmatch, spp, 3, 1);

 if (end_endpos->lnum == startpos->lnum
        && end_endpos->col < startpos->col)
     end_endpos->col = startpos->col;

 limit_pos(end_endpos, m_endpos);




 if (spp->sp_syn_match_id != spp->sp_syn.id && spp->sp_syn_match_id != 0)
 {
     *end_idx = best_idx;
     if (spp->sp_off_flags & (1 << (5 + 7)))
     {
  hl_endpos->lnum = best_regmatch.endpos[0].lnum;
  hl_endpos->col = best_regmatch.endpos[0].col;
     }
     else
     {
  hl_endpos->lnum = best_regmatch.startpos[0].lnum;
  hl_endpos->col = best_regmatch.startpos[0].col;
     }
     hl_endpos->col += spp->sp_offsets[5];


     if (hl_endpos->lnum == startpos->lnum
         && hl_endpos->col < startpos->col)
  hl_endpos->col = startpos->col;
     limit_pos(hl_endpos, m_endpos);



     *m_endpos = *hl_endpos;
 }
 else
 {
     *end_idx = 0;
     *hl_endpos = *end_endpos;
 }

 *flagsp = spp->sp_flags;

 had_match = 1;
 break;
    }


    if (!had_match)
 m_endpos->lnum = 0;


    unref_extmatch(re_extmatch_in);
    re_extmatch_in = ((void *)0);
}




    static void
limit_pos(pos, limit)
    lpos_T *pos;
    lpos_T *limit;
{
    if (pos->lnum > limit->lnum)
 *pos = *limit;
    else if (pos->lnum == limit->lnum && pos->col > limit->col)
 pos->col = limit->col;
}




    static void
limit_pos_zero(pos, limit)
    lpos_T *pos;
    lpos_T *limit;
{
    if (pos->lnum == 0)
 *pos = *limit;
    else
 limit_pos(pos, limit);
}




    static void
syn_add_end_off(result, regmatch, spp, idx, extra)
    lpos_T *result;
    regmmatch_T *regmatch;
    synpat_T *spp;
    int idx;
    int extra;
{
    int col;
    int off;
    char_u *base;
    char_u *p;

    if (spp->sp_off_flags & (1 << idx))
    {
 result->lnum = regmatch->startpos[0].lnum;
 col = regmatch->startpos[0].col;
 off = spp->sp_offsets[idx] + extra;
    }
    else
    {
 result->lnum = regmatch->endpos[0].lnum;
 col = regmatch->endpos[0].col;
 off = spp->sp_offsets[idx];
    }


    if (result->lnum > syn_buf->b_ml.ml_line_count)
 col = 0;
    else if (off != 0)
    {
 base = ml_get_buf(syn_buf, result->lnum, 0);
 p = base + col;
 if (off > 0)
 {
     while (off-- > 0 && *p != '\000')
  ++p;
 }
 else if (off < 0)
 {
     while (off++ < 0 && base < p)
  --p;
 }
 col = (int)(p - base);
    }
    result->col = col;
}





    static void
syn_add_start_off(result, regmatch, spp, idx, extra)
    lpos_T *result;
    regmmatch_T *regmatch;
    synpat_T *spp;
    int idx;
    int extra;
{
    int col;
    int off;
    char_u *base;
    char_u *p;

    if (spp->sp_off_flags & (1 << (idx + 7)))
    {
 result->lnum = regmatch->endpos[0].lnum;
 col = regmatch->endpos[0].col;
 off = spp->sp_offsets[idx] + extra;
    }
    else
    {
 result->lnum = regmatch->startpos[0].lnum;
 col = regmatch->startpos[0].col;
 off = spp->sp_offsets[idx];
    }
    if (result->lnum > syn_buf->b_ml.ml_line_count)
    {

 result->lnum = syn_buf->b_ml.ml_line_count;
 col = (int)strlen((char *)(ml_get_buf(syn_buf, result->lnum, 0)));
    }
    if (off != 0)
    {
 base = ml_get_buf(syn_buf, result->lnum, 0);
 p = base + col;
 if (off > 0)
 {
     while (off-- && *p != '\000')
  ++p;
 }
 else if (off < 0)
 {
     while (off++ && base < p)
  --p;
 }
 col = (int)(p - base);
    }
    result->col = col;
}




    static char_u *
syn_getcurline()
{
    return ml_get_buf(syn_buf, current_lnum, 0);
}





    static int
syn_regexec(rmp, lnum, col)
    regmmatch_T *rmp;
    linenr_T lnum;
    colnr_T col;
{
    rmp->rmm_maxcol = syn_buf->b_p_smc;
    if (vim_regexec_multi(rmp, syn_win, syn_buf, lnum, col, ((void *)0)) > 0)
    {
 rmp->startpos[0].lnum += lnum;
 rmp->endpos[0].lnum += lnum;
 return 1;
    }
    return 0;
}






    static int
check_keyword_id(line, startcol, endcolp, flagsp, next_listp, cur_si, ccharp)
    char_u *line;
    int startcol;
    int *endcolp;
    long *flagsp;
    short **next_listp;
    stateitem_T *cur_si;
    int *ccharp __attribute__((unused));
{
    keyentry_T *kp;
    char_u *kwp;
    int round;
    int kwlen;
    char_u keyword[80 + 1];
    hashtab_T *ht;
    hashitem_T *hi;



    kwp = line + startcol;
    kwlen = 0;
    do
    {





     ++kwlen;
    }
    while (vim_iswordc_buf(kwp + kwlen, syn_buf));

    if (kwlen > 80)
 return 0;





    vim_strncpy(keyword, kwp, kwlen);






    for (round = 1; round <= 2; ++round)
    {
 ht = round == 1 ? &syn_block->b_keywtab : &syn_block->b_keywtab_ic;
 if (ht->ht_used == 0)
     continue;
 if (round == 2)
     (void)str_foldcase(kwp, kwlen, keyword, 80 + 1);
# 3299 "syntax.c"
 hi = hash_find(ht, keyword);
 if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
     for (kp = ((keyentry_T *)(((hi)->hi_key) - (dumkey.keyword - (char_u *)&dumkey))); kp != ((void *)0); kp = kp->ke_next)
     {
  if (current_next_list != 0
   ? in_id_list(((void *)0), current_next_list, &kp->k_syn, 0)
   : (cur_si == ((void *)0)
       ? !(kp->flags & 0x01)
       : in_id_list(cur_si, cur_si->si_cont_list,
          &kp->k_syn, kp->flags & 0x01)))
  {
      *endcolp = startcol + kwlen;
      *flagsp = kp->flags;
      *next_listp = kp->next_list;



      return kp->k_syn.id;
  }
     }
    }
    return 0;
}




    static void
syn_cmd_conceal(eap, syncing)
    exarg_T *eap __attribute__((unused));
    int syncing __attribute__((unused));
{
# 3347 "syntax.c"
}




    static void
syn_cmd_case(eap, syncing)
    exarg_T *eap;
    int syncing __attribute__((unused));
{
    char_u *arg = eap->arg;
    char_u *next;

    eap->nextcmd = find_nextcmd(arg);
    if (eap->skip)
 return;

    next = skiptowhite(arg);
    if (strncasecmp((char *)(arg), (char *)("match"), (size_t)(5)) == 0 && next - arg == 5)
 curwin->w_s->b_syn_ic = 0;
    else if (strncasecmp((char *)(arg), (char *)("ignore"), (size_t)(6)) == 0 && next - arg == 6)
 curwin->w_s->b_syn_ic = 1;
    else
 emsg2((char_u *)(((char *)("E390: Illegal argument: %s"))), (char_u *)(arg));
}




    static void
syn_cmd_spell(eap, syncing)
    exarg_T *eap;
    int syncing __attribute__((unused));
{
    char_u *arg = eap->arg;
    char_u *next;

    eap->nextcmd = find_nextcmd(arg);
    if (eap->skip)
 return;

    next = skiptowhite(arg);
    if (strncasecmp((char *)(arg), (char *)("toplevel"), (size_t)(8)) == 0 && next - arg == 8)
 curwin->w_s->b_syn_spell = 1;
    else if (strncasecmp((char *)(arg), (char *)("notoplevel"), (size_t)(10)) == 0 && next - arg == 10)
 curwin->w_s->b_syn_spell = 2;
    else if (strncasecmp((char *)(arg), (char *)("default"), (size_t)(7)) == 0 && next - arg == 7)
 curwin->w_s->b_syn_spell = 0;
    else
 emsg2((char_u *)(((char *)("E390: Illegal argument: %s"))), (char_u *)(arg));
}




    void
syntax_clear(block)
    synblock_T *block;
{
    int i;

    block->b_syn_error = 0;
    block->b_syn_ic = 0;
    block->b_syn_spell = 0;
    block->b_syn_containedin = 0;


    clear_keywtab(&block->b_keywtab);
    clear_keywtab(&block->b_keywtab_ic);


    for (i = block->b_syn_patterns.ga_len; --i >= 0; )
 syn_clear_pattern(block, i);
    ga_clear(&block->b_syn_patterns);


    for (i = block->b_syn_clusters.ga_len; --i >= 0; )
 syn_clear_cluster(block, i);
    ga_clear(&block->b_syn_clusters);
    block->b_spell_cluster_id = 0;
    block->b_nospell_cluster_id = 0;

    block->b_syn_sync_flags = 0;
    block->b_syn_sync_minlines = 0;
    block->b_syn_sync_maxlines = 0;
    block->b_syn_sync_linebreaks = 0;

    vim_free(block->b_syn_linecont_prog);
    block->b_syn_linecont_prog = ((void *)0);
    vim_free(block->b_syn_linecont_pat);
    block->b_syn_linecont_pat = ((void *)0);

    block->b_syn_folditems = 0;



    syn_stack_free_all(block);
    invalidate_current_state();
}




    void
reset_synblock(wp)
    win_T *wp;
{
    if (wp->w_s != &wp->w_buffer->b_s)
    {
 syntax_clear(wp->w_s);
 vim_free(wp->w_s);
 wp->w_s = &wp->w_buffer->b_s;
    }
}




    static void
syntax_sync_clear()
{
    int i;


    for (i = curwin->w_s->b_syn_patterns.ga_len; --i >= 0; )
 if (((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[i].sp_syncing)
     syn_remove_pattern(curwin->w_s, i);

    curwin->w_s->b_syn_sync_flags = 0;
    curwin->w_s->b_syn_sync_minlines = 0;
    curwin->w_s->b_syn_sync_maxlines = 0;
    curwin->w_s->b_syn_sync_linebreaks = 0;

    vim_free(curwin->w_s->b_syn_linecont_prog);
    curwin->w_s->b_syn_linecont_prog = ((void *)0);
    vim_free(curwin->w_s->b_syn_linecont_pat);
    curwin->w_s->b_syn_linecont_pat = ((void *)0);

    syn_stack_free_all(curwin->w_s);
}




    static void
syn_remove_pattern(block, idx)
    synblock_T *block;
    int idx;
{
    synpat_T *spp;

    spp = &(((synpat_T *)((block)->b_syn_patterns.ga_data))[idx]);

    if (spp->sp_flags & 0x2000)
 --block->b_syn_folditems;

    syn_clear_pattern(block, idx);
    ((__builtin_object_size ((char *)(spp), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(spp), (char *)(spp + 1), sizeof(synpat_T) * (block->b_syn_patterns.ga_len - idx - 1), __builtin_object_size ((char *)(spp), 0)) : __inline_memmove_chk ((char *)(spp), (char *)(spp + 1), sizeof(synpat_T) * (block->b_syn_patterns.ga_len - idx - 1)));

    --block->b_syn_patterns.ga_len;
}





    static void
syn_clear_pattern(block, i)
    synblock_T *block;
    int i;
{
    vim_free(((synpat_T *)((block)->b_syn_patterns.ga_data))[i].sp_pattern);
    vim_free(((synpat_T *)((block)->b_syn_patterns.ga_data))[i].sp_prog);

    if (i == 0 || ((synpat_T *)((block)->b_syn_patterns.ga_data))[i - 1].sp_type != 2)
    {
 vim_free(((synpat_T *)((block)->b_syn_patterns.ga_data))[i].sp_cont_list);
 vim_free(((synpat_T *)((block)->b_syn_patterns.ga_data))[i].sp_next_list);
 vim_free(((synpat_T *)((block)->b_syn_patterns.ga_data))[i].sp_syn.cont_in_list);
    }
}




    static void
syn_clear_cluster(block, i)
    synblock_T *block;
    int i;
{
    vim_free(((syn_cluster_T *)((block)->b_syn_clusters.ga_data))[i].scl_name);
    vim_free(((syn_cluster_T *)((block)->b_syn_clusters.ga_data))[i].scl_name_u);
    vim_free(((syn_cluster_T *)((block)->b_syn_clusters.ga_data))[i].scl_list);
}




    static void
syn_cmd_clear(eap, syncing)
    exarg_T *eap;
    int syncing;
{
    char_u *arg = eap->arg;
    char_u *arg_end;
    int id;

    eap->nextcmd = find_nextcmd(arg);
    if (eap->skip)
 return;







    if (curwin->w_s->b_syn_topgrp != 0)
 return;

    if (ends_excmd(*arg))
    {



 if (syncing)
     syntax_sync_clear();
 else
 {
     syntax_clear(curwin->w_s);
     if (curwin->w_s == &curwin->w_buffer->b_s)
  do_unlet((char_u *)"b:current_syntax", 1);
     do_unlet((char_u *)"w:current_syntax", 1);
 }
    }
    else
    {



 while (!ends_excmd(*arg))
 {
     arg_end = skiptowhite(arg);
     if (*arg == '@')
     {
  id = syn_scl_namen2id(arg + 1, (int)(arg_end - arg - 1));
  if (id == 0)
  {
      emsg2((char_u *)(((char *)("E391: No such syntax cluster: %s"))), (char_u *)(arg));
      break;
  }
  else
  {





      short scl_id = id - 25000;

      vim_free(((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[scl_id].scl_list);
      ((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[scl_id].scl_list = ((void *)0);
  }
     }
     else
     {
  id = syn_namen2id(arg, (int)(arg_end - arg));
  if (id == 0)
  {
      emsg2((char_u *)(((char *)(e_nogroup))), (char_u *)(arg));
      break;
  }
  else
      syn_clear_one(id, syncing);
     }
     arg = skipwhite(arg_end);
 }
    }
    redraw_curbuf_later(35);
    syn_stack_free_all(curwin->w_s);
}




    static void
syn_clear_one(id, syncing)
    int id;
    int syncing;
{
    synpat_T *spp;
    int idx;


    if (!syncing)
    {
 (void)syn_clear_keyword(id, &curwin->w_s->b_keywtab);
 (void)syn_clear_keyword(id, &curwin->w_s->b_keywtab_ic);
    }


    for (idx = curwin->w_s->b_syn_patterns.ga_len; --idx >= 0; )
    {
 spp = &(((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx]);
 if (spp->sp_syn.id != id || spp->sp_syncing != syncing)
     continue;
 syn_remove_pattern(curwin->w_s, idx);
    }
}




    static void
syn_cmd_on(eap, syncing)
    exarg_T *eap;
    int syncing __attribute__((unused));
{
    syn_cmd_onoff(eap, "syntax");
}




    static void
syn_cmd_enable(eap, syncing)
    exarg_T *eap;
    int syncing __attribute__((unused));
{
    set_internal_string_var((char_u *)"syntax_cmd", (char_u *)"enable");
    syn_cmd_onoff(eap, "syntax");
    do_unlet((char_u *)"g:syntax_cmd", 1);
}




    static void
syn_cmd_reset(eap, syncing)
    exarg_T *eap;
    int syncing __attribute__((unused));
{
    eap->nextcmd = check_nextcmd(eap->arg);
    if (!eap->skip)
    {
 set_internal_string_var((char_u *)"syntax_cmd", (char_u *)"reset");
 do_cmdline_cmd((char_u *)"runtime! syntax/syncolor.vim");
 do_unlet((char_u *)"g:syntax_cmd", 1);
    }
}




    static void
syn_cmd_manual(eap, syncing)
    exarg_T *eap;
    int syncing __attribute__((unused));
{
    syn_cmd_onoff(eap, "manual");
}




    static void
syn_cmd_off(eap, syncing)
    exarg_T *eap;
    int syncing __attribute__((unused));
{
    syn_cmd_onoff(eap, "nosyntax");
}

    static void
syn_cmd_onoff(eap, name)
    exarg_T *eap;
    char *name;
{
    char_u buf[100];

    eap->nextcmd = check_nextcmd(eap->arg);
    if (!eap->skip)
    {
 ((__builtin_object_size ((char *)(buf), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(buf), (char *)("so "), __builtin_object_size ((char *)(buf), 1 > 1)) : __inline_strcpy_chk ((char *)(buf), (char *)("so ")));
 vim_snprintf((char *)buf + 3, sizeof(buf) - 3, "$VIMRUNTIME/syntax/%s.vim", name);
 do_cmdline_cmd(buf);
    }
}




    static void
syn_cmd_list(eap, syncing)
    exarg_T *eap;
    int syncing;
{
    char_u *arg = eap->arg;
    int id;
    char_u *arg_end;

    eap->nextcmd = find_nextcmd(arg);
    if (eap->skip)
 return;

    if (!syntax_present(curwin))
    {
 msg((char_u *)(((char *)("No Syntax items defined for this buffer"))));
 return;
    }

    if (syncing)
    {
 if (curwin->w_s->b_syn_sync_flags & 0x01)
 {
     msg_puts((char_u *)(((char *)("syncing on C-style comments"))));
     syn_lines_msg();
     syn_match_msg();
     return;
 }
 else if (!(curwin->w_s->b_syn_sync_flags & 0x02))
 {
     if (curwin->w_s->b_syn_sync_minlines == 0)
  msg_puts((char_u *)(((char *)("no syncing"))));
     else
     {
  msg_puts((char_u *)(((char *)("syncing starts "))));
  msg_outnum(curwin->w_s->b_syn_sync_minlines);
  msg_puts((char_u *)(((char *)(" lines before top line"))));
  syn_match_msg();
     }
     return;
 }
 msg_puts_title((char_u *)(((char *)("\n--- Syntax sync items ---"))));
 if (curwin->w_s->b_syn_sync_minlines > 0
  || curwin->w_s->b_syn_sync_maxlines > 0
  || curwin->w_s->b_syn_sync_linebreaks > 0)
 {
     msg_puts((char_u *)(((char *)("\nsyncing on items"))));
     syn_lines_msg();
     syn_match_msg();
 }
    }
    else
 msg_puts_title((char_u *)(((char *)("\n--- Syntax items ---"))));
    if (ends_excmd(*arg))
    {



 for (id = 1; id <= highlight_ga.ga_len && !got_int; ++id)
     syn_list_one(id, syncing, 0);
 for (id = 0; id < curwin->w_s->b_syn_clusters.ga_len && !got_int; ++id)
     syn_list_cluster(id);
    }
    else
    {



 while (!ends_excmd(*arg) && !got_int)
 {
     arg_end = skiptowhite(arg);
     if (*arg == '@')
     {
  id = syn_scl_namen2id(arg + 1, (int)(arg_end - arg - 1));
  if (id == 0)
      emsg2((char_u *)(((char *)("E392: No such syntax cluster: %s"))), (char_u *)(arg));
  else
      syn_list_cluster(id - 25000);
     }
     else
     {
  id = syn_namen2id(arg, (int)(arg_end - arg));
  if (id == 0)
      emsg2((char_u *)(((char *)(e_nogroup))), (char_u *)(arg));
  else
      syn_list_one(id, syncing, 1);
     }
     arg = skipwhite(arg_end);
 }
    }
    eap->nextcmd = check_nextcmd(arg);
}

    static void
syn_lines_msg()
{
    if (curwin->w_s->b_syn_sync_maxlines > 0
          || curwin->w_s->b_syn_sync_minlines > 0)
    {
 msg_puts((char_u *)("; "));
 if (curwin->w_s->b_syn_sync_minlines > 0)
 {
     msg_puts((char_u *)(((char *)("minimal "))));
     msg_outnum(curwin->w_s->b_syn_sync_minlines);
     if (curwin->w_s->b_syn_sync_maxlines)
  msg_puts((char_u *)(", "));
 }
 if (curwin->w_s->b_syn_sync_maxlines > 0)
 {
     msg_puts((char_u *)(((char *)("maximal "))));
     msg_outnum(curwin->w_s->b_syn_sync_maxlines);
 }
 msg_puts((char_u *)(((char *)(" lines before top line"))));
    }
}

    static void
syn_match_msg()
{
    if (curwin->w_s->b_syn_sync_linebreaks > 0)
    {
 msg_puts((char_u *)(((char *)("; match "))));
 msg_outnum(curwin->w_s->b_syn_sync_linebreaks);
 msg_puts((char_u *)(((char *)(" line breaks"))));
    }
}

static int last_matchgroup;

struct name_list
{
    int flag;
    char *name;
};

static void syn_list_flags (struct name_list *nl, int flags, int attr);




    static void
syn_list_one(id, syncing, link_only)
    int id;
    int syncing;
    int link_only;
{
    int attr;
    int idx;
    int did_header = 0;
    synpat_T *spp;
    static struct name_list namelist1[] =
  {
      {0x1000, "display"},
      {0x01, "contained"},
      {0x04, "oneline"},
      {0x400, "keepend"},
      {0x4000, "extend"},
      {0x800, "excludenl"},
      {0x02, "transparent"},
      {0x2000, "fold"},




      {0, ((void *)0)}
  };
    static struct name_list namelist2[] =
  {
      {0x100, "skipwhite"},
      {0x80, "skipnl"},
      {0x200, "skipempty"},
      {0, ((void *)0)}
  };

    attr = highlight_attr[(int)(HLF_D)];


    if (!syncing)
    {
 did_header = syn_list_keywords(id, &curwin->w_s->b_keywtab, 0, attr);
 did_header = syn_list_keywords(id, &curwin->w_s->b_keywtab_ic,
           did_header, attr);
    }


    for (idx = 0; idx < curwin->w_s->b_syn_patterns.ga_len && !got_int; ++idx)
    {
 spp = &(((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx]);
 if (spp->sp_syn.id != id || spp->sp_syncing != syncing)
     continue;

 (void)syn_list_header(did_header, 999, id);
 did_header = 1;
 last_matchgroup = 0;
 if (spp->sp_type == 1)
 {
     put_pattern("match", ' ', spp, attr);
     msg_putchar(' ');
 }
 else if (spp->sp_type == 2)
 {
     while (((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_type == 2)
  put_pattern("start", '=', &((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx++], attr);
     if (((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_type == 4)
  put_pattern("skip", '=', &((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx++], attr);
     while (idx < curwin->w_s->b_syn_patterns.ga_len
         && ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_type == 3)
  put_pattern("end", '=', &((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx++], attr);
     --idx;
     msg_putchar(' ');
 }
 syn_list_flags(namelist1, spp->sp_flags, attr);

 if (spp->sp_cont_list != ((void *)0))
     put_id_list((char_u *)"contains", spp->sp_cont_list, attr);

 if (spp->sp_syn.cont_in_list != ((void *)0))
     put_id_list((char_u *)"containedin",
           spp->sp_syn.cont_in_list, attr);

 if (spp->sp_next_list != ((void *)0))
 {
     put_id_list((char_u *)"nextgroup", spp->sp_next_list, attr);
     syn_list_flags(namelist2, spp->sp_flags, attr);
 }
 if (spp->sp_flags & (0x10|0x20))
 {
     if (spp->sp_flags & 0x10)
  msg_puts_attr((char_u *)"grouphere", attr);
     else
  msg_puts_attr((char_u *)"groupthere", attr);
     msg_putchar(' ');
     if (spp->sp_sync_idx >= 0)
  msg_outtrans(((struct hl_group *)((highlight_ga.ga_data)))[((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))
       [spp->sp_sync_idx].sp_syn.id - 1].sg_name);
     else
  msg_puts((char_u *)("NONE"));
     msg_putchar(' ');
 }
    }


    if (((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_link && (did_header || link_only) && !got_int)
    {
 (void)syn_list_header(did_header, 999, id);
 msg_puts_attr((char_u *)"links to", attr);
 msg_putchar(' ');
 msg_outtrans(((struct hl_group *)((highlight_ga.ga_data)))[((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_link - 1].sg_name);
    }
}

    static void
syn_list_flags(nl, flags, attr)
    struct name_list *nl;
    int flags;
    int attr;
{
    int i;

    for (i = 0; nl[i].flag != 0; ++i)
 if (flags & nl[i].flag)
 {
     msg_puts_attr((char_u *)nl[i].name, attr);
     msg_putchar(' ');
 }
}




    static void
syn_list_cluster(id)
    int id;
{
    int endcol = 15;


    msg_putchar('\n');
    msg_outtrans(((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[id].scl_name);

    if (msg_col >= endcol)
 endcol = msg_col + 1;
    if (Columns <= endcol)
 endcol = Columns - 1;

    msg_advance(endcol);
    if (((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[id].scl_list != ((void *)0))
    {
 put_id_list((char_u *)"cluster", ((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[id].scl_list,
      highlight_attr[(int)(HLF_D)]);
    }
    else
    {
 msg_puts_attr((char_u *)"cluster", highlight_attr[(int)(HLF_D)]);
 msg_puts((char_u *)"=NONE");
    }
}

    static void
put_id_list(name, list, attr)
    char_u *name;
    short *list;
    int attr;
{
    short *p;

    msg_puts_attr(name, attr);
    msg_putchar('=');
    for (p = list; *p; ++p)
    {
 if (*p >= 10000 && *p < 15000)
 {
     if (p[1])
  msg_puts((char_u *)("ALLBUT"));
     else
  msg_puts((char_u *)("ALL"));
 }
 else if (*p >= 15000 && *p < 20000)
 {
     msg_puts((char_u *)("TOP"));
 }
 else if (*p >= 20000 && *p < 25000)
 {
     msg_puts((char_u *)("CONTAINED"));
 }
 else if (*p >= 25000)
 {
     short scl_id = *p - 25000;

     msg_putchar('@');
     msg_outtrans(((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[scl_id].scl_name);
 }
 else
     msg_outtrans(((struct hl_group *)((highlight_ga.ga_data)))[*p - 1].sg_name);
 if (p[1])
     msg_putchar(',');
    }
    msg_putchar(' ');
}

    static void
put_pattern(s, c, spp, attr)
    char *s;
    int c;
    synpat_T *spp;
    int attr;
{
    long n;
    int mask;
    int first;
    static char *sepchars = "/+=-#@\"|'^&";
    int i;


    if (last_matchgroup != spp->sp_syn_match_id)
    {
 last_matchgroup = spp->sp_syn_match_id;
 msg_puts_attr((char_u *)"matchgroup", attr);
 msg_putchar('=');
 if (last_matchgroup == 0)
     msg_outtrans((char_u *)"NONE");
 else
     msg_outtrans(((struct hl_group *)((highlight_ga.ga_data)))[last_matchgroup - 1].sg_name);
 msg_putchar(' ');
    }


    msg_puts_attr((char_u *)s, attr);
    msg_putchar(c);


    for (i = 0; vim_strchr(spp->sp_pattern, sepchars[i]) != ((void *)0); )
 if (sepchars[++i] == '\000')
 {
     i = 0;
     break;
 }
    msg_putchar(sepchars[i]);
    msg_outtrans(spp->sp_pattern);
    msg_putchar(sepchars[i]);


    first = 1;
    for (i = 0; i < 7; ++i)
    {
 mask = (1 << i);
 if (spp->sp_off_flags & (mask + (mask << 7)))
 {
     if (!first)
  msg_putchar(',');
     msg_puts((char_u *)spo_name_tab[i]);
     n = spp->sp_offsets[i];
     if (i != 6)
     {
  if (spp->sp_off_flags & mask)
      msg_putchar('s');
  else
      msg_putchar('e');
  if (n > 0)
      msg_putchar('+');
     }
     if (n || i == 6)
  msg_outnum(n);
     first = 0;
 }
    }
    msg_putchar(' ');
}





    static int
syn_list_keywords(id, ht, did_header, attr)
    int id;
    hashtab_T *ht;
    int did_header;
    int attr;
{
    int outlen;
    hashitem_T *hi;
    keyentry_T *kp;
    int todo;
    int prev_contained = 0;
    short *prev_next_list = ((void *)0);
    short *prev_cont_in_list = ((void *)0);
    int prev_skipnl = 0;
    int prev_skipwhite = 0;
    int prev_skipempty = 0;





    todo = (int)ht->ht_used;
    for (hi = ht->ht_array; todo > 0 && !got_int; ++hi)
    {
 if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
 {
     --todo;
     for (kp = ((keyentry_T *)(((hi)->hi_key) - (dumkey.keyword - (char_u *)&dumkey))); kp != ((void *)0) && !got_int; kp = kp->ke_next)
     {
  if (kp->k_syn.id == id)
  {
      if (prev_contained != (kp->flags & 0x01)
       || prev_skipnl != (kp->flags & 0x80)
       || prev_skipwhite != (kp->flags & 0x100)
       || prev_skipempty != (kp->flags & 0x200)
       || prev_cont_in_list != kp->k_syn.cont_in_list
       || prev_next_list != kp->next_list)
   outlen = 9999;
      else
   outlen = (int)strlen((char *)(kp->keyword));

      if (syn_list_header(did_header, outlen, id))
      {
   prev_contained = 0;
   prev_next_list = ((void *)0);
   prev_cont_in_list = ((void *)0);
   prev_skipnl = 0;
   prev_skipwhite = 0;
   prev_skipempty = 0;
      }
      did_header = 1;
      if (prev_contained != (kp->flags & 0x01))
      {
   msg_puts_attr((char_u *)"contained", attr);
   msg_putchar(' ');
   prev_contained = (kp->flags & 0x01);
      }
      if (kp->k_syn.cont_in_list != prev_cont_in_list)
      {
   put_id_list((char_u *)"containedin",
      kp->k_syn.cont_in_list, attr);
   msg_putchar(' ');
   prev_cont_in_list = kp->k_syn.cont_in_list;
      }
      if (kp->next_list != prev_next_list)
      {
   put_id_list((char_u *)"nextgroup", kp->next_list, attr);
   msg_putchar(' ');
   prev_next_list = kp->next_list;
   if (kp->flags & 0x80)
   {
       msg_puts_attr((char_u *)"skipnl", attr);
       msg_putchar(' ');
       prev_skipnl = (kp->flags & 0x80);
   }
   if (kp->flags & 0x100)
   {
       msg_puts_attr((char_u *)"skipwhite", attr);
       msg_putchar(' ');
       prev_skipwhite = (kp->flags & 0x100);
   }
   if (kp->flags & 0x200)
   {
       msg_puts_attr((char_u *)"skipempty", attr);
       msg_putchar(' ');
       prev_skipempty = (kp->flags & 0x200);
   }
      }
      msg_outtrans(kp->keyword);
  }
     }
 }
    }

    return did_header;
}

    static void
syn_clear_keyword(id, ht)
    int id;
    hashtab_T *ht;
{
    hashitem_T *hi;
    keyentry_T *kp;
    keyentry_T *kp_prev;
    keyentry_T *kp_next;
    int todo;

    hash_lock(ht);
    todo = (int)ht->ht_used;
    for (hi = ht->ht_array; todo > 0; ++hi)
    {
 if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
 {
     --todo;
     kp_prev = ((void *)0);
     for (kp = ((keyentry_T *)(((hi)->hi_key) - (dumkey.keyword - (char_u *)&dumkey))); kp != ((void *)0); )
     {
  if (kp->k_syn.id == id)
  {
      kp_next = kp->ke_next;
      if (kp_prev == ((void *)0))
      {
   if (kp_next == ((void *)0))
       hash_remove(ht, hi);
   else
       hi->hi_key = ((kp_next)->keyword);
      }
      else
   kp_prev->ke_next = kp_next;
      vim_free(kp->next_list);
      vim_free(kp->k_syn.cont_in_list);
      vim_free(kp);
      kp = kp_next;
  }
  else
  {
      kp_prev = kp;
      kp = kp->ke_next;
  }
     }
 }
    }
    hash_unlock(ht);
}




    static void
clear_keywtab(ht)
    hashtab_T *ht;
{
    hashitem_T *hi;
    int todo;
    keyentry_T *kp;
    keyentry_T *kp_next;

    todo = (int)ht->ht_used;
    for (hi = ht->ht_array; todo > 0; ++hi)
    {
 if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
 {
     --todo;
     for (kp = ((keyentry_T *)(((hi)->hi_key) - (dumkey.keyword - (char_u *)&dumkey))); kp != ((void *)0); kp = kp_next)
     {
  kp_next = kp->ke_next;
  vim_free(kp->next_list);
  vim_free(kp->k_syn.cont_in_list);
  vim_free(kp);
     }
 }
    }
    hash_clear(ht);
    hash_init(ht);
}




    static void
add_keyword(name, id, flags, cont_in_list, next_list, conceal_char)
    char_u *name;
    int id;
    int flags;
    short *cont_in_list;
    short *next_list;
    int conceal_char;
{
    keyentry_T *kp;
    hashtab_T *ht;
    hashitem_T *hi;
    char_u *name_ic;
    long_u hash;
    char_u name_folded[80 + 1];

    if (curwin->w_s->b_syn_ic)
 name_ic = str_foldcase(name, (int)strlen((char *)(name)),
       name_folded, 80 + 1);
    else
 name_ic = name;
    kp = (keyentry_T *)alloc((int)(sizeof(keyentry_T) + strlen((char *)(name_ic))));
    if (kp == ((void *)0))
 return;
    ((__builtin_object_size ((char *)(kp->keyword), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(kp->keyword), (char *)(name_ic), __builtin_object_size ((char *)(kp->keyword), 1 > 1)) : __inline_strcpy_chk ((char *)(kp->keyword), (char *)(name_ic)));
    kp->k_syn.id = id;
    kp->k_syn.inc_tag = current_syn_inc_tag;
    kp->flags = flags;
    kp->k_char = conceal_char;
    kp->k_syn.cont_in_list = copy_id_list(cont_in_list);
    if (cont_in_list != ((void *)0))
 curwin->w_s->b_syn_containedin = 1;
    kp->next_list = copy_id_list(next_list);

    if (curwin->w_s->b_syn_ic)
 ht = &curwin->w_s->b_keywtab_ic;
    else
 ht = &curwin->w_s->b_keywtab;

    hash = hash_hash(kp->keyword);
    hi = hash_lookup(ht, kp->keyword, hash);
    if (((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
    {

 kp->ke_next = ((void *)0);
 hash_add_item(ht, hi, kp->keyword, hash);
    }
    else
    {

 kp->ke_next = ((keyentry_T *)(((hi)->hi_key) - (dumkey.keyword - (char_u *)&dumkey)));
 hi->hi_key = ((kp)->keyword);
    }
}






    static char_u *
get_group_name(arg, name_end)
    char_u *arg;
    char_u **name_end;
{
    char_u *rest;

    *name_end = skiptowhite(arg);
    rest = skipwhite(*name_end);





    if (ends_excmd(*arg) || *rest == '\000')
 return ((void *)0);
    return rest;
}
# 4420 "syntax.c"
    static char_u *
get_syn_options(arg, opt, conceal_char)
    char_u *arg;
    syn_opt_arg_T *opt;
    int *conceal_char __attribute__((unused));
{
    char_u *gname_start, *gname;
    int syn_id;
    int len;
    char *p;
    int i;
    int fidx;
    static struct flag
    {
 char *name;
 int argtype;
 int flags;
    } flagtab[] = { {"cCoOnNtTaAiInNeEdD", 0, 0x01},
      {"oOnNeElLiInNeE", 0, 0x04},
      {"kKeEeEpPeEnNdD", 0, 0x400},
      {"eExXtTeEnNdD", 0, 0x4000},
      {"eExXcClLuUdDeEnNlL", 0, 0x800},
      {"tTrRaAnNsSpPaArReEnNtT", 0, 0x02},
      {"sSkKiIpPnNlL", 0, 0x80},
      {"sSkKiIpPwWhHiItTeE", 0, 0x100},
      {"sSkKiIpPeEmMpPtTyY", 0, 0x200},
      {"gGrRoOuUpPhHeErReE", 0, 0x10},
      {"gGrRoOuUpPtThHeErReE", 0, 0x20},
      {"dDiIsSpPlLaAyY", 0, 0x1000},
      {"fFoOlLdD", 0, 0x2000},
      {"cCoOnNcCeEaAlL", 0, 0x20000},
      {"cCoOnNcCeEaAlLeEnNdDsS", 0, 0x40000},
      {"cCcChHaArR", 11, 0},
      {"cCoOnNtTaAiInNsS", 1, 0},
      {"cCoOnNtTaAiInNeEdDiInN", 2, 0},
      {"nNeExXtTgGrRoOuUpP", 3, 0},
  };
    static char *first_letters = "cCoOkKeEtTsSgGdDfFnN";

    if (arg == ((void *)0))
 return ((void *)0);






    for (;;)
    {





 if (strchr(first_letters, *arg) == ((void *)0))
     break;

 for (fidx = sizeof(flagtab) / sizeof(struct flag); --fidx >= 0; )
 {
     p = flagtab[fidx].name;
     for (i = 0, len = 0; p[i] != '\000'; i += 2, ++len)
  if (arg[len] != p[i] && arg[len] != p[i + 1])
      break;
     if (p[i] == '\000' && (((arg[len]) == ' ' || (arg[len]) == '\t')
        || (flagtab[fidx].argtype > 0
      ? arg[len] == '='
      : ends_excmd(arg[len]))))
     {
  if (opt->keyword
   && (flagtab[fidx].flags == 0x1000
       || flagtab[fidx].flags == 0x2000
       || flagtab[fidx].flags == 0x4000))

      fidx = -1;
  break;
     }
 }
 if (fidx < 0)
     break;

 if (flagtab[fidx].argtype == 1)
 {
     if (!opt->has_cont_list)
     {
  emsg((char_u *)(((char *)("E395: contains argument not accepted here"))));
  return ((void *)0);
     }
     if (get_id_list(&arg, 8, &opt->cont_list) == 0)
  return ((void *)0);
 }
 else if (flagtab[fidx].argtype == 2)
 {
     if (get_id_list(&arg, 11, &opt->cont_in_list) == 0)
  return ((void *)0);
 }
 else if (flagtab[fidx].argtype == 3)
 {
     if (get_id_list(&arg, 9, &opt->next_list) == 0)
  return ((void *)0);
 }
 else if (flagtab[fidx].argtype == 11 && arg[5] == '=')
 {
# 4533 "syntax.c"
     {



  ;

     }
     arg = skipwhite(arg + 7);
 }
 else
 {
     opt->flags |= flagtab[fidx].flags;
     arg = skipwhite(arg + len);

     if (flagtab[fidx].flags == 0x10
      || flagtab[fidx].flags == 0x20)
     {
  if (opt->sync_idx == ((void *)0))
  {
      emsg((char_u *)(((char *)("E393: group[t]here not accepted here"))));
      return ((void *)0);
  }
  gname_start = arg;
  arg = skiptowhite(arg);
  if (gname_start == arg)
      return ((void *)0);
  gname = vim_strnsave(gname_start, (int)(arg - gname_start));
  if (gname == ((void *)0))
      return ((void *)0);
  if (strcmp((char *)(gname), (char *)("NONE")) == 0)
      *opt->sync_idx = -2;
  else
  {
      syn_id = syn_name2id(gname);
      for (i = curwin->w_s->b_syn_patterns.ga_len; --i >= 0; )
   if (((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[i].sp_syn.id == syn_id
         && ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[i].sp_type == 2)
   {
       *opt->sync_idx = i;
       break;
   }
      if (i < 0)
      {
   emsg2((char_u *)(((char *)("E394: Didn't find region item for %s"))), (char_u *)(gname));
   vim_free(gname);
   return ((void *)0);
      }
  }

  vim_free(gname);
  arg = skipwhite(arg);
     }

     else if (flagtab[fidx].flags == 0x2000
      && foldmethodIsSyntax(curwin))

  foldUpdateAll(curwin);

 }
    }

    return arg;
}






    static void
syn_incl_toplevel(id, flagsp)
    int id;
    int *flagsp;
{
    if ((*flagsp & 0x01) || curwin->w_s->b_syn_topgrp == 0)
 return;
    *flagsp |= 0x01;
    if (curwin->w_s->b_syn_topgrp >= 25000)
    {

 short *grp_list = (short *)alloc((unsigned)(2 * sizeof(short)));
 int tlg_id = curwin->w_s->b_syn_topgrp - 25000;

 if (grp_list != ((void *)0))
 {
     grp_list[0] = id;
     grp_list[1] = 0;
     syn_combine_list(&((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[tlg_id].scl_list, &grp_list,
    2);
 }
    }
}




    static void
syn_cmd_include(eap, syncing)
    exarg_T *eap;
    int syncing __attribute__((unused));
{
    char_u *arg = eap->arg;
    int sgl_id = 1;
    char_u *group_name_end;
    char_u *rest;
    char_u *errormsg = ((void *)0);
    int prev_toplvl_grp;
    int prev_syn_inc_tag;
    int source = 0;

    eap->nextcmd = find_nextcmd(arg);
    if (eap->skip)
 return;

    if (arg[0] == '@')
    {
 ++arg;
 rest = get_group_name(arg, &group_name_end);
 if (rest == ((void *)0))
 {
     emsg((char_u *)((char_u *)((char *)("E397: Filename required"))));
     return;
 }
 sgl_id = syn_check_cluster(arg, (int)(group_name_end - arg));

 eap->arg = rest;
    }





    eap->argt |= (0x008 | 0x010);
    separate_nextcmd(eap);
    if (*eap->arg == '<' || *eap->arg == '$' || mch_isFullName(eap->arg))
    {



 source = 1;
 if (expand_filename(eap, syn_cmdlinep, &errormsg) == 0)
 {
     if (errormsg != ((void *)0))
  emsg((char_u *)(errormsg));
     return;
 }
    }





    prev_syn_inc_tag = current_syn_inc_tag;
    current_syn_inc_tag = ++running_syn_inc_tag;
    prev_toplvl_grp = curwin->w_s->b_syn_topgrp;
    curwin->w_s->b_syn_topgrp = sgl_id;
    if (source ? do_source(eap->arg, 0, 0) == 0
    : source_runtime(eap->arg, 1) == 0)
 emsg2((char_u *)(((char *)(e_notopen))), (char_u *)(eap->arg));
    curwin->w_s->b_syn_topgrp = prev_toplvl_grp;
    current_syn_inc_tag = prev_syn_inc_tag;
}




    static void
syn_cmd_keyword(eap, syncing)
    exarg_T *eap;
    int syncing __attribute__((unused));
{
    char_u *arg = eap->arg;
    char_u *group_name_end;
    int syn_id;
    char_u *rest;
    char_u *keyword_copy;
    char_u *p;
    char_u *kw;
    syn_opt_arg_T syn_opt_arg;
    int cnt;
    int conceal_char = '\000';

    rest = get_group_name(arg, &group_name_end);

    if (rest != ((void *)0))
    {
 syn_id = syn_check_group(arg, (int)(group_name_end - arg));


 keyword_copy = alloc((unsigned)strlen((char *)(rest)) + 1);
 if (keyword_copy != ((void *)0))
 {
     syn_opt_arg.flags = 0;
     syn_opt_arg.keyword = 1;
     syn_opt_arg.sync_idx = ((void *)0);
     syn_opt_arg.has_cont_list = 0;
     syn_opt_arg.cont_in_list = ((void *)0);
     syn_opt_arg.next_list = ((void *)0);






     cnt = 0;
     p = keyword_copy;
     for ( ; rest != ((void *)0) && !ends_excmd(*rest); rest = skipwhite(rest))
     {
  rest = get_syn_options(rest, &syn_opt_arg, &conceal_char);
  if (rest == ((void *)0) || ends_excmd(*rest))
      break;

  while (*rest != '\000' && !((*rest) == ' ' || (*rest) == '\t'))
  {
      if (*rest == '\\' && rest[1] != '\000')
   ++rest;
      *p++ = *rest++;
  }
  *p++ = '\000';
  ++cnt;
     }

     if (!eap->skip)
     {

  syn_incl_toplevel(syn_id, &syn_opt_arg.flags);




  for (kw = keyword_copy; --cnt >= 0; kw += strlen((char *)(kw)) + 1)
  {
      for (p = vim_strchr(kw, '['); ; )
      {
   if (p != ((void *)0))
       *p = '\000';
   add_keyword(kw, syn_id, syn_opt_arg.flags,
    syn_opt_arg.cont_in_list,
      syn_opt_arg.next_list, conceal_char);
   if (p == ((void *)0))
       break;
   if (p[1] == '\000')
   {
       emsg2((char_u *)(((char *)("E789: Missing ']': %s"))), (char_u *)(kw));
       kw = p + 2;
       break;
   }
   if (p[1] == ']')
   {
       kw = p + 1;
       break;
   }
# 4795 "syntax.c"
   {
       p[0] = p[1];
       ++p;
   }
      }
  }
     }

     vim_free(keyword_copy);
     vim_free(syn_opt_arg.cont_in_list);
     vim_free(syn_opt_arg.next_list);
 }
    }

    if (rest != ((void *)0))
 eap->nextcmd = check_nextcmd(rest);
    else
 emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(arg));

    redraw_curbuf_later(35);
    syn_stack_free_all(curwin->w_s);
}






    static void
syn_cmd_match(eap, syncing)
    exarg_T *eap;
    int syncing;
{
    char_u *arg = eap->arg;
    char_u *group_name_end;
    char_u *rest;
    synpat_T item;
    int syn_id;
    int idx;
    syn_opt_arg_T syn_opt_arg;
    int sync_idx = 0;
    int conceal_char = '\000';


    rest = get_group_name(arg, &group_name_end);


    syn_opt_arg.flags = 0;
    syn_opt_arg.keyword = 0;
    syn_opt_arg.sync_idx = syncing ? &sync_idx : ((void *)0);
    syn_opt_arg.has_cont_list = 1;
    syn_opt_arg.cont_list = ((void *)0);
    syn_opt_arg.cont_in_list = ((void *)0);
    syn_opt_arg.next_list = ((void *)0);
    rest = get_syn_options(rest, &syn_opt_arg, &conceal_char);


    init_syn_patterns();
    ((__builtin_object_size ((&item), 0) != (size_t) -1) ? __builtin___memset_chk ((&item), (0), (sizeof(item)), __builtin_object_size ((&item), 0)) : __inline_memset_chk ((&item), (0), (sizeof(item))));
    rest = get_syn_pattern(rest, &item);
    if (vim_regcomp_had_eol() && !(syn_opt_arg.flags & 0x800))
 syn_opt_arg.flags |= 0x08;


    rest = get_syn_options(rest, &syn_opt_arg, &conceal_char);

    if (rest != ((void *)0))
    {



 eap->nextcmd = check_nextcmd(rest);
 if (!ends_excmd(*rest) || eap->skip)
     rest = ((void *)0);
 else if (ga_grow(&curwin->w_s->b_syn_patterns, 1) != 0
  && (syn_id = syn_check_group(arg,
        (int)(group_name_end - arg))) != 0)
 {
     syn_incl_toplevel(syn_id, &syn_opt_arg.flags);



     idx = curwin->w_s->b_syn_patterns.ga_len;
     ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx] = item;
     ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_syncing = syncing;
     ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_type = 1;
     ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_syn.id = syn_id;
     ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_syn.inc_tag = current_syn_inc_tag;
     ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_flags = syn_opt_arg.flags;
     ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_sync_idx = sync_idx;
     ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_cont_list = syn_opt_arg.cont_list;
     ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_syn.cont_in_list =
           syn_opt_arg.cont_in_list;



     if (syn_opt_arg.cont_in_list != ((void *)0))
  curwin->w_s->b_syn_containedin = 1;
     ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_next_list = syn_opt_arg.next_list;
     ++curwin->w_s->b_syn_patterns.ga_len;


     if (syn_opt_arg.flags & (0x10|0x20))
  curwin->w_s->b_syn_sync_flags |= 0x02;

     if (syn_opt_arg.flags & 0x2000)
  ++curwin->w_s->b_syn_folditems;


     redraw_curbuf_later(35);
     syn_stack_free_all(curwin->w_s);
     return;
 }
    }




    vim_free(item.sp_prog);
    vim_free(item.sp_pattern);
    vim_free(syn_opt_arg.cont_list);
    vim_free(syn_opt_arg.cont_in_list);
    vim_free(syn_opt_arg.next_list);

    if (rest == ((void *)0))
 emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(arg));
}





    static void
syn_cmd_region(eap, syncing)
    exarg_T *eap;
    int syncing;
{
    char_u *arg = eap->arg;
    char_u *group_name_end;
    char_u *rest;
    char_u *key_end;
    char_u *key = ((void *)0);
    char_u *p;
    int item;




    struct pat_ptr
    {
 synpat_T *pp_synp;
 int pp_matchgroup_id;
 struct pat_ptr *pp_next;
    } *(pat_ptrs[3]);

    struct pat_ptr *ppp;
    struct pat_ptr *ppp_next;
    int pat_count = 0;
    int syn_id;
    int matchgroup_id = 0;
    int not_enough = 0;
    int illegal = 0;
    int success = 0;
    int idx;
    syn_opt_arg_T syn_opt_arg;
    int conceal_char = '\000';


    rest = get_group_name(arg, &group_name_end);

    pat_ptrs[0] = ((void *)0);
    pat_ptrs[1] = ((void *)0);
    pat_ptrs[2] = ((void *)0);

    init_syn_patterns();

    syn_opt_arg.flags = 0;
    syn_opt_arg.keyword = 0;
    syn_opt_arg.sync_idx = ((void *)0);
    syn_opt_arg.has_cont_list = 1;
    syn_opt_arg.cont_list = ((void *)0);
    syn_opt_arg.cont_in_list = ((void *)0);
    syn_opt_arg.next_list = ((void *)0);




    while (rest != ((void *)0) && !ends_excmd(*rest))
    {

 rest = get_syn_options(rest, &syn_opt_arg, &conceal_char);
 if (rest == ((void *)0) || ends_excmd(*rest))
     break;


 key_end = rest;
 while (*key_end && !((*key_end) == ' ' || (*key_end) == '\t') && *key_end != '=')
     ++key_end;
 vim_free(key);
 key = vim_strnsave_up(rest, (int)(key_end - rest));
 if (key == ((void *)0))
 {
     rest = ((void *)0);
     break;
 }
 if (strcmp((char *)(key), (char *)("MATCHGROUP")) == 0)
     item = 3;
 else if (strcmp((char *)(key), (char *)("START")) == 0)
     item = 0;
 else if (strcmp((char *)(key), (char *)("END")) == 0)
     item = 2;
 else if (strcmp((char *)(key), (char *)("SKIP")) == 0)
 {
     if (pat_ptrs[1] != ((void *)0))
     {
  illegal = 1;
  break;
     }
     item = 1;
 }
 else
     break;
 rest = skipwhite(key_end);
 if (*rest != '=')
 {
     rest = ((void *)0);
     emsg2((char_u *)(((char *)("E398: Missing '=': %s"))), (char_u *)(arg));
     break;
 }
 rest = skipwhite(rest + 1);
 if (*rest == '\000')
 {
     not_enough = 1;
     break;
 }

 if (item == 3)
 {
     p = skiptowhite(rest);
     if ((p - rest == 4 && strncmp((char *)(rest), (char *)("NONE"), (size_t)(4)) == 0) || eap->skip)
  matchgroup_id = 0;
     else
     {
  matchgroup_id = syn_check_group(rest, (int)(p - rest));
  if (matchgroup_id == 0)
  {
      illegal = 1;
      break;
  }
     }
     rest = skipwhite(p);
 }
 else
 {





     ppp = (struct pat_ptr *)alloc((unsigned)sizeof(struct pat_ptr));
     if (ppp == ((void *)0))
     {
  rest = ((void *)0);
  break;
     }
     ppp->pp_next = pat_ptrs[item];
     pat_ptrs[item] = ppp;
     ppp->pp_synp = (synpat_T *)alloc_clear((unsigned)sizeof(synpat_T));
     if (ppp->pp_synp == ((void *)0))
     {
  rest = ((void *)0);
  break;
     }





     if (item == 0)
  reg_do_extmatch = 1;
     else if (item == 1 || item == 2)
  reg_do_extmatch = 2;
     rest = get_syn_pattern(rest, ppp->pp_synp);
     reg_do_extmatch = 0;
     if (item == 2 && vim_regcomp_had_eol()
           && !(syn_opt_arg.flags & 0x800))
  ppp->pp_synp->sp_flags |= 0x08;
     ppp->pp_matchgroup_id = matchgroup_id;
     ++pat_count;
 }
    }
    vim_free(key);
    if (illegal || not_enough)
 rest = ((void *)0);




    if (rest != ((void *)0) && (pat_ptrs[0] == ((void *)0) ||
        pat_ptrs[2] == ((void *)0)))
    {
 not_enough = 1;
 rest = ((void *)0);
    }

    if (rest != ((void *)0))
    {




 eap->nextcmd = check_nextcmd(rest);
 if (!ends_excmd(*rest) || eap->skip)
     rest = ((void *)0);
 else if (ga_grow(&(curwin->w_s->b_syn_patterns), pat_count) != 0
  && (syn_id = syn_check_group(arg,
        (int)(group_name_end - arg))) != 0)
 {
     syn_incl_toplevel(syn_id, &syn_opt_arg.flags);



     idx = curwin->w_s->b_syn_patterns.ga_len;
     for (item = 0; item <= 2; ++item)
     {
  for (ppp = pat_ptrs[item]; ppp != ((void *)0); ppp = ppp->pp_next)
  {
      ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx] = *(ppp->pp_synp);
      ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_syncing = syncing;
      ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_type =
       (item == 0) ? 2 :
       (item == 1) ? 4 : 3;
      ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_flags |= syn_opt_arg.flags;
      ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_syn.id = syn_id;
      ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_syn.inc_tag = current_syn_inc_tag;
      ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_syn_match_id =
       ppp->pp_matchgroup_id;



      if (item == 0)
      {
   ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_cont_list =
       syn_opt_arg.cont_list;
   ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_syn.cont_in_list =
           syn_opt_arg.cont_in_list;
   if (syn_opt_arg.cont_in_list != ((void *)0))
       curwin->w_s->b_syn_containedin = 1;
   ((synpat_T *)((curwin->w_s)->b_syn_patterns.ga_data))[idx].sp_next_list =
       syn_opt_arg.next_list;
      }
      ++curwin->w_s->b_syn_patterns.ga_len;
      ++idx;

      if (syn_opt_arg.flags & 0x2000)
   ++curwin->w_s->b_syn_folditems;

  }
     }

     redraw_curbuf_later(35);
     syn_stack_free_all(curwin->w_s);
     success = 1;
 }
    }




    for (item = 0; item <= 2; ++item)
 for (ppp = pat_ptrs[item]; ppp != ((void *)0); ppp = ppp_next)
 {
     if (!success)
     {
  vim_free(ppp->pp_synp->sp_prog);
  vim_free(ppp->pp_synp->sp_pattern);
     }
     vim_free(ppp->pp_synp);
     ppp_next = ppp->pp_next;
     vim_free(ppp);
 }

    if (!success)
    {
 vim_free(syn_opt_arg.cont_list);
 vim_free(syn_opt_arg.cont_in_list);
 vim_free(syn_opt_arg.next_list);
 if (not_enough)
     emsg2((char_u *)(((char *)("E399: Not enough arguments: syntax region %s"))), (char_u *)(arg));
 else if (illegal || rest == ((void *)0))
     emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(arg));
    }
}




    static int



syn_compare_stub(v1, v2)
    const void *v1;
    const void *v2;
{
    const short *s1 = v1;
    const short *s2 = v2;

    return (*s1 > *s2 ? 1 : *s1 < *s2 ? -1 : 0);
}





    static void
syn_combine_list(clstr1, clstr2, list_op)
    short **clstr1;
    short **clstr2;
    int list_op;
{
    int count1 = 0;
    int count2 = 0;
    short *g1;
    short *g2;
    short *clstr = ((void *)0);
    int count;
    int round;




    if (*clstr2 == ((void *)0))
 return;
    if (*clstr1 == ((void *)0) || list_op == 1)
    {
 if (list_op == 1)
     vim_free(*clstr1);
 if (list_op == 1 || list_op == 2)
     *clstr1 = *clstr2;
 else
     vim_free(*clstr2);
 return;
    }

    for (g1 = *clstr1; *g1; g1++)
 ++count1;
    for (g2 = *clstr2; *g2; g2++)
 ++count2;




    qsort(*clstr1, (size_t)count1, sizeof(short), syn_compare_stub);
    qsort(*clstr2, (size_t)count2, sizeof(short), syn_compare_stub);







    for (round = 1; round <= 2; round++)
    {
 g1 = *clstr1;
 g2 = *clstr2;
 count = 0;




 while (*g1 && *g2)
 {



     if (*g1 < *g2)
     {
  if (round == 2)
      clstr[count] = *g1;
  count++;
  g1++;
  continue;
     }




     if (list_op == 2)
     {
  if (round == 2)
      clstr[count] = *g2;
  count++;
     }
     if (*g1 == *g2)
  g1++;
     g2++;
 }






 for (; *g1; g1++, count++)
     if (round == 2)
  clstr[count] = *g1;
 if (list_op == 2)
     for (; *g2; g2++, count++)
  if (round == 2)
      clstr[count] = *g2;

 if (round == 1)
 {




     if (count == 0)
     {
  clstr = ((void *)0);
  break;
     }
     clstr = (short *)alloc((unsigned)((count + 1) * sizeof(short)));
     if (clstr == ((void *)0))
  break;
     clstr[count] = 0;
 }
    }




    vim_free(*clstr1);
    vim_free(*clstr2);
    *clstr1 = clstr;
}





    static int
syn_scl_name2id(name)
    char_u *name;
{
    int i;
    char_u *name_u;


    name_u = vim_strsave_up(name);
    if (name_u == ((void *)0))
 return 0;
    for (i = curwin->w_s->b_syn_clusters.ga_len; --i >= 0; )
 if (((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[i].scl_name_u != ((void *)0)
  && strcmp((char *)(name_u), (char *)(((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[i].scl_name_u)) == 0)
     break;
    vim_free(name_u);
    return (i < 0 ? 0 : i + 25000);
}




    static int
syn_scl_namen2id(linep, len)
    char_u *linep;
    int len;
{
    char_u *name;
    int id = 0;

    name = vim_strnsave(linep, len);
    if (name != ((void *)0))
    {
 id = syn_scl_name2id(name);
 vim_free(name);
    }
    return id;
}







    static int
syn_check_cluster(pp, len)
    char_u *pp;
    int len;
{
    int id;
    char_u *name;

    name = vim_strnsave(pp, len);
    if (name == ((void *)0))
 return 0;

    id = syn_scl_name2id(name);
    if (id == 0)
 id = syn_add_cluster(name);
    else
 vim_free(name);
    return id;
}






    static int
syn_add_cluster(name)
    char_u *name;
{
    int len;




    if (curwin->w_s->b_syn_clusters.ga_data == ((void *)0))
    {
 curwin->w_s->b_syn_clusters.ga_itemsize = sizeof(syn_cluster_T);
 curwin->w_s->b_syn_clusters.ga_growsize = 10;
    }




    if (ga_grow(&curwin->w_s->b_syn_clusters, 1) == 0)
    {
 vim_free(name);
 return 0;
    }
    len = curwin->w_s->b_syn_clusters.ga_len;

    ((__builtin_object_size ((&(((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[len])), 0) != (size_t) -1) ? __builtin___memset_chk ((&(((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[len])), (0), (sizeof(syn_cluster_T)), __builtin_object_size ((&(((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[len])), 0)) : __inline_memset_chk ((&(((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[len])), (0), (sizeof(syn_cluster_T))));
    ((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[len].scl_name = name;
    ((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[len].scl_name_u = vim_strsave_up(name);
    ((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[len].scl_list = ((void *)0);
    ++curwin->w_s->b_syn_clusters.ga_len;

    if (strcasecmp((char *)(name), (char *)("Spell")) == 0)
 curwin->w_s->b_spell_cluster_id = len + 25000;
    if (strcasecmp((char *)(name), (char *)("NoSpell")) == 0)
 curwin->w_s->b_nospell_cluster_id = len + 25000;

    return len + 25000;
}





    static void
syn_cmd_cluster(eap, syncing)
    exarg_T *eap;
    int syncing __attribute__((unused));
{
    char_u *arg = eap->arg;
    char_u *group_name_end;
    char_u *rest;
    int scl_id;
    short *clstr_list;
    int got_clstr = 0;
    int opt_len;
    int list_op;

    eap->nextcmd = find_nextcmd(arg);
    if (eap->skip)
 return;

    rest = get_group_name(arg, &group_name_end);

    if (rest != ((void *)0))
    {
 scl_id = syn_check_cluster(arg, (int)(group_name_end - arg))
             - 25000;

 for (;;)
 {
     if (strncasecmp((char *)(rest), (char *)("add"), (size_t)(3)) == 0
      && (((rest[3]) == ' ' || (rest[3]) == '\t') || rest[3] == '='))
     {
  opt_len = 3;
  list_op = 2;
     }
     else if (strncasecmp((char *)(rest), (char *)("remove"), (size_t)(6)) == 0
      && (((rest[6]) == ' ' || (rest[6]) == '\t') || rest[6] == '='))
     {
  opt_len = 6;
  list_op = 3;
     }
     else if (strncasecmp((char *)(rest), (char *)("contains"), (size_t)(8)) == 0
   && (((rest[8]) == ' ' || (rest[8]) == '\t') || rest[8] == '='))
     {
  opt_len = 8;
  list_op = 1;
     }
     else
  break;

     clstr_list = ((void *)0);
     if (get_id_list(&rest, opt_len, &clstr_list) == 0)
     {
  emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(rest));
  break;
     }
     syn_combine_list(&((syn_cluster_T *)((curwin->w_s)->b_syn_clusters.ga_data))[scl_id].scl_list,
        &clstr_list, list_op);
     got_clstr = 1;
 }

 if (got_clstr)
 {
     redraw_curbuf_later(35);
     syn_stack_free_all(curwin->w_s);
 }
    }

    if (!got_clstr)
 emsg((char_u *)(((char *)("E400: No cluster specified"))));
    if (rest == ((void *)0) || !ends_excmd(*rest))
 emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(arg));
}




    static void
init_syn_patterns()
{
    curwin->w_s->b_syn_patterns.ga_itemsize = sizeof(synpat_T);
    curwin->w_s->b_syn_patterns.ga_growsize = 10;
}






    static char_u *
get_syn_pattern(arg, ci)
    char_u *arg;
    synpat_T *ci;
{
    char_u *end;
    int *p;
    int idx;
    char_u *cpo_save;


    if (arg == ((void *)0) || arg[1] == '\000' || arg[2] == '\000')
 return ((void *)0);

    end = skip_regexp(arg + 1, *arg, 1, ((void *)0));
    if (*end != *arg)
    {
 emsg2((char_u *)(((char *)("E401: Pattern delimiter not found: %s"))), (char_u *)(arg));
 return ((void *)0);
    }

    if ((ci->sp_pattern = vim_strnsave(arg + 1, (int)(end - arg - 1))) == ((void *)0))
 return ((void *)0);


    cpo_save = p_cpo;
    p_cpo = (char_u *)"";
    ci->sp_prog = vim_regcomp(ci->sp_pattern, 1);
    p_cpo = cpo_save;

    if (ci->sp_prog == ((void *)0))
 return ((void *)0);
    ci->sp_ic = curwin->w_s->b_syn_ic;




    ++end;
    do
    {
 for (idx = 7; --idx >= 0; )
     if (strncmp((char *)(end), (char *)(spo_name_tab[idx]), (size_t)(3)) == 0)
  break;
 if (idx >= 0)
 {
     p = &(ci->sp_offsets[idx]);
     if (idx != 6)
  switch (end[3])
  {
      case 's': break;
      case 'b': break;
      case 'e': idx += 7; break;
      default: idx = -1; break;
  }
     if (idx >= 0)
     {
  ci->sp_off_flags |= (1 << idx);
  if (idx == 6)
  {
      end += 3;
      *p = getdigits(&end);


      if (!(ci->sp_off_flags & (1 << 0)))
      {
   ci->sp_off_flags |= (1 << 0);
   ci->sp_offsets[0] = *p;
      }
  }
  else
  {
      end += 4;
      if (*end == '+')
      {
   ++end;
   *p = getdigits(&end);
      }
      else if (*end == '-')
      {
   ++end;
   *p = -getdigits(&end);
      }
  }
  if (*end != ',')
      break;
  ++end;
     }
 }
    } while (idx >= 0);

    if (!ends_excmd(*end) && !((*end) == ' ' || (*end) == '\t'))
    {
 emsg2((char_u *)(((char *)("E402: Garbage after pattern: %s"))), (char_u *)(arg));
 return ((void *)0);
    }
    return skipwhite(end);
}




    static void
syn_cmd_sync(eap, syncing)
    exarg_T *eap;
    int syncing __attribute__((unused));
{
    char_u *arg_start = eap->arg;
    char_u *arg_end;
    char_u *key = ((void *)0);
    char_u *next_arg;
    int illegal = 0;
    int finished = 0;
    long n;
    char_u *cpo_save;

    if (ends_excmd(*arg_start))
    {
 syn_cmd_list(eap, 1);
 return;
    }

    while (!ends_excmd(*arg_start))
    {
 arg_end = skiptowhite(arg_start);
 next_arg = skipwhite(arg_end);
 vim_free(key);
 key = vim_strnsave_up(arg_start, (int)(arg_end - arg_start));
 if (strcmp((char *)(key), (char *)("CCOMMENT")) == 0)
 {
     if (!eap->skip)
  curwin->w_s->b_syn_sync_flags |= 0x01;
     if (!ends_excmd(*next_arg))
     {
  arg_end = skiptowhite(next_arg);
  if (!eap->skip)
      curwin->w_s->b_syn_sync_id = syn_check_group(next_arg,
         (int)(arg_end - next_arg));
  next_arg = skipwhite(arg_end);
     }
     else if (!eap->skip)
  curwin->w_s->b_syn_sync_id = syn_name2id((char_u *)"Comment");
 }
 else if ( strncmp((char *)(key), (char *)("LINES"), (size_t)(5)) == 0
  || strncmp((char *)(key), (char *)("MINLINES"), (size_t)(8)) == 0
  || strncmp((char *)(key), (char *)("MAXLINES"), (size_t)(8)) == 0
  || strncmp((char *)(key), (char *)("LINEBREAKS"), (size_t)(10)) == 0)
 {
     if (key[4] == 'S')
  arg_end = key + 6;
     else if (key[0] == 'L')
  arg_end = key + 11;
     else
  arg_end = key + 9;
     if (arg_end[-1] != '=' || !((*arg_end) >= '0' && (*arg_end) <= '9'))
     {
  illegal = 1;
  break;
     }
     n = getdigits(&arg_end);
     if (!eap->skip)
     {
  if (key[4] == 'B')
      curwin->w_s->b_syn_sync_linebreaks = n;
  else if (key[1] == 'A')
      curwin->w_s->b_syn_sync_maxlines = n;
  else
      curwin->w_s->b_syn_sync_minlines = n;
     }
 }
 else if (strcmp((char *)(key), (char *)("FROMSTART")) == 0)
 {
     if (!eap->skip)
     {
  curwin->w_s->b_syn_sync_minlines = (0x7fffffffL);
  curwin->w_s->b_syn_sync_maxlines = 0;
     }
 }
 else if (strcmp((char *)(key), (char *)("LINECONT")) == 0)
 {
     if (curwin->w_s->b_syn_linecont_pat != ((void *)0))
     {
  emsg((char_u *)(((char *)("E403: syntax sync: line continuations pattern specified twice"))));
  finished = 1;
  break;
     }
     arg_end = skip_regexp(next_arg + 1, *next_arg, 1, ((void *)0));
     if (*arg_end != *next_arg)
     {
  illegal = 1;
  break;
     }

     if (!eap->skip)
     {

  if ((curwin->w_s->b_syn_linecont_pat = vim_strnsave(next_arg + 1,
          (int)(arg_end - next_arg - 1))) == ((void *)0))
  {
      finished = 1;
      break;
  }
  curwin->w_s->b_syn_linecont_ic = curwin->w_s->b_syn_ic;


  cpo_save = p_cpo;
  p_cpo = (char_u *)"";
  curwin->w_s->b_syn_linecont_prog =
       vim_regcomp(curwin->w_s->b_syn_linecont_pat, 1);
  p_cpo = cpo_save;

  if (curwin->w_s->b_syn_linecont_prog == ((void *)0))
  {
      vim_free(curwin->w_s->b_syn_linecont_pat);
      curwin->w_s->b_syn_linecont_pat = ((void *)0);
      finished = 1;
      break;
  }
     }
     next_arg = skipwhite(arg_end + 1);
 }
 else
 {
     eap->arg = next_arg;
     if (strcmp((char *)(key), (char *)("MATCH")) == 0)
  syn_cmd_match(eap, 1);
     else if (strcmp((char *)(key), (char *)("REGION")) == 0)
  syn_cmd_region(eap, 1);
     else if (strcmp((char *)(key), (char *)("CLEAR")) == 0)
  syn_cmd_clear(eap, 1);
     else
  illegal = 1;
     finished = 1;
     break;
 }
 arg_start = next_arg;
    }
    vim_free(key);
    if (illegal)
 emsg2((char_u *)(((char *)("E404: Illegal arguments: %s"))), (char_u *)(arg_start));
    else if (!finished)
    {
 eap->nextcmd = check_nextcmd(arg_start);
 redraw_curbuf_later(35);
 syn_stack_free_all(curwin->w_s);
    }
}
# 5791 "syntax.c"
    static int
get_id_list(arg, keylen, list)
    char_u **arg;
    int keylen;
    short **list;

{
    char_u *p = ((void *)0);
    char_u *end;
    int round;
    int count;
    int total_count = 0;
    short *retval = ((void *)0);
    char_u *name;
    regmatch_T regmatch;
    int id;
    int i;
    int failed = 0;
# 5817 "syntax.c"
    for (round = 1; round <= 2; ++round)
    {



 p = skipwhite(*arg + keylen);
 if (*p != '=')
 {
     emsg2((char_u *)(((char *)("E405: Missing equal sign: %s"))), (char_u *)(*arg));
     break;
 }
 p = skipwhite(p + 1);
 if (ends_excmd(*p))
 {
     emsg2((char_u *)(((char *)("E406: Empty argument: %s"))), (char_u *)(*arg));
     break;
 }




 count = 0;
 while (!ends_excmd(*p))
 {
     for (end = p; *end && !((*end) == ' ' || (*end) == '\t') && *end != ','; ++end)
  ;
     name = alloc((int)(end - p + 3));
     if (name == ((void *)0))
     {
  failed = 1;
  break;
     }
     vim_strncpy(name + 1, p, end - p);
     if ( strcmp((char *)(name + 1), (char *)("ALLBUT")) == 0
      || strcmp((char *)(name + 1), (char *)("ALL")) == 0
      || strcmp((char *)(name + 1), (char *)("TOP")) == 0
      || strcmp((char *)(name + 1), (char *)("CONTAINED")) == 0)
     {
  if ((((**arg) < 'a' || (**arg) > 'z') ? (**arg) : (**arg) - ('a' - 'A')) != 'C')
  {
      emsg2((char_u *)(((char *)("E407: %s not allowed here"))), (char_u *)(name + 1));
      failed = 1;
      vim_free(name);
      break;
  }
  if (count != 0)
  {
      emsg2((char_u *)(((char *)("E408: %s must be first in contains list"))), (char_u *)(name + 1));
      failed = 1;
      vim_free(name);
      break;
  }
  if (name[1] == 'A')
      id = 10000;
  else if (name[1] == 'T')
      id = 15000;
  else
      id = 20000;
  id += current_syn_inc_tag;
     }
     else if (name[1] == '@')
     {
  id = syn_check_cluster(name + 2, (int)(end - p - 1));
     }
     else
     {



  if ((char_u *)strpbrk((char *)(name + 1), (char *)((char_u *)"\\.*^$~[")) == ((void *)0))
      id = syn_check_group(name + 1, (int)(end - p));
  else
  {



      *name = '^';
      ((__builtin_object_size ((char *)(name), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(name), (char *)("$"), __builtin_object_size ((char *)(name), 1 > 1)) : __inline_strcat_chk ((char *)(name), (char *)("$")));
      regmatch.regprog = vim_regcomp(name, 1);
      if (regmatch.regprog == ((void *)0))
      {
   failed = 1;
   vim_free(name);
   break;
      }

      regmatch.rm_ic = 1;
      id = 0;
      for (i = highlight_ga.ga_len; --i >= 0; )
      {
   if (vim_regexec(&regmatch, ((struct hl_group *)((highlight_ga.ga_data)))[i].sg_name,
          (colnr_T)0))
   {
       if (round == 2)
       {




    if (count >= total_count)
    {
        vim_free(retval);
        round = 1;
    }
    else
        retval[count] = i + 1;
       }
       ++count;
       id = -1;
   }
      }
      vim_free(regmatch.regprog);
  }
     }
     vim_free(name);
     if (id == 0)
     {
  emsg2((char_u *)(((char *)("E409: Unknown group name: %s"))), (char_u *)(p));
  failed = 1;
  break;
     }
     if (id > 0)
     {
  if (round == 2)
  {

      if (count >= total_count)
      {
   vim_free(retval);
   round = 1;
      }
      else
   retval[count] = id;
  }
  ++count;
     }
     p = skipwhite(end);
     if (*p != ',')
  break;
     p = skipwhite(p + 1);
 }
 if (failed)
     break;
 if (round == 1)
 {
     retval = (short *)alloc((unsigned)((count + 1) * sizeof(short)));
     if (retval == ((void *)0))
  break;
     retval[count] = 0;
     total_count = count;
 }
    }

    *arg = p;
    if (failed || retval == ((void *)0))
    {
 vim_free(retval);
 return 0;
    }

    if (*list == ((void *)0))
 *list = retval;
    else
 vim_free(retval);

    return 1;
}




    static short *
copy_id_list(list)
    short *list;
{
    int len;
    int count;
    short *retval;

    if (list == ((void *)0))
 return ((void *)0);

    for (count = 0; list[count]; ++count)
 ;
    len = (count + 1) * sizeof(short);
    retval = (short *)alloc((unsigned)len);
    if (retval != ((void *)0))
 ((__builtin_object_size ((char *)(retval), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(retval), (char *)(list), (size_t)len, __builtin_object_size ((char *)(retval), 0)) : __inline_memmove_chk ((char *)(retval), (char *)(list), (size_t)len));

    return retval;
}
# 6016 "syntax.c"
    static int
in_id_list(cur_si, list, ssp, contained)
    stateitem_T *cur_si;
    short *list;
    struct sp_syn *ssp;
    int contained;
{
    int retval;
    short *scl_list;
    short item;
    short id = ssp->id;
    static int depth = 0;
    int r;


    if (cur_si != ((void *)0) && ssp->cont_in_list != ((void *)0)
         && !(cur_si->si_flags & 0x40))
    {


 while ((cur_si->si_flags & 0x10000)
  && cur_si > (stateitem_T *)(current_state.ga_data))
     --cur_si;

 if (cur_si->si_idx >= 0 && in_id_list(((void *)0), ssp->cont_in_list,
  &(((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[cur_si->si_idx].sp_syn),
    ((synpat_T *)((syn_block)->b_syn_patterns.ga_data))[cur_si->si_idx].sp_flags & 0x01))
     return 1;
    }

    if (list == ((void *)0))
 return 0;





    if (list == (short *)-1)
 return !contained;






    item = *list;
    if (item >= 10000 && item < 25000)
    {
 if (item < 15000)
 {

     if (item - 10000 != ssp->inc_tag)
  return 0;
 }
 else if (item < 20000)
 {

     if (item - 15000 != ssp->inc_tag || contained)
  return 0;
 }
 else
 {

     if (item - 20000 != ssp->inc_tag || !contained)
  return 0;
 }
 item = *++list;
 retval = 0;
    }
    else
 retval = 1;




    while (item != 0)
    {
 if (item == id)
     return retval;
 if (item >= 25000)
 {
     scl_list = ((syn_cluster_T *)((syn_block)->b_syn_clusters.ga_data))[item - 25000].scl_list;


     if (scl_list != ((void *)0) && depth < 30)
     {
  ++depth;
  r = in_id_list(((void *)0), scl_list, ssp, contained);
  --depth;
  if (r)
      return retval;
     }
 }
 item = *++list;
    }
    return !retval;
}

struct subcommand
{
    char *name;
    void (*func)(exarg_T *, int);
};

static struct subcommand subcommands[] =
{
    {"case", syn_cmd_case},
    {"clear", syn_cmd_clear},
    {"cluster", syn_cmd_cluster},
    {"conceal", syn_cmd_conceal},
    {"enable", syn_cmd_enable},
    {"include", syn_cmd_include},
    {"keyword", syn_cmd_keyword},
    {"list", syn_cmd_list},
    {"manual", syn_cmd_manual},
    {"match", syn_cmd_match},
    {"on", syn_cmd_on},
    {"off", syn_cmd_off},
    {"region", syn_cmd_region},
    {"reset", syn_cmd_reset},
    {"spell", syn_cmd_spell},
    {"sync", syn_cmd_sync},
    {"", syn_cmd_list},
    {((void *)0), ((void *)0)}
};






    void
ex_syntax(eap)
    exarg_T *eap;
{
    char_u *arg = eap->arg;
    char_u *subcmd_end;
    char_u *subcmd_name;
    int i;

    syn_cmdlinep = eap->cmdlinep;


    for (subcmd_end = arg; ((*subcmd_end) < 0x7f && isalpha(*subcmd_end)); ++subcmd_end)
 ;
    subcmd_name = vim_strnsave(arg, (int)(subcmd_end - arg));
    if (subcmd_name != ((void *)0))
    {
 if (eap->skip)
     ++emsg_skip;
 for (i = 0; ; ++i)
 {
     if (subcommands[i].name == ((void *)0))
     {
  emsg2((char_u *)(((char *)("E410: Invalid :syntax subcommand: %s"))), (char_u *)(subcmd_name));
  break;
     }
     if (strcmp((char *)(subcmd_name), (char *)((char_u *)subcommands[i].name)) == 0)
     {
  eap->arg = skipwhite(subcmd_end);
  (subcommands[i].func)(eap, 0);
  break;
     }
 }
 vim_free(subcmd_name);
 if (eap->skip)
     --emsg_skip;
    }
}

    void
ex_ownsyntax(eap)
    exarg_T *eap;
{
    char_u *old_value;
    char_u *new_value;

    if (curwin->w_s == &curwin->w_buffer->b_s)
    {
 curwin->w_s = (synblock_T *)alloc(sizeof(synblock_T));
 ((__builtin_object_size (curwin->w_s, 0) != (size_t) -1) ? __builtin___memset_chk (curwin->w_s, 0, sizeof(synblock_T), __builtin_object_size (curwin->w_s, 0)) : __inline_memset_chk (curwin->w_s, 0, sizeof(synblock_T)));

 curwin->w_onebuf_opt.wo_spell = 0;
 clear_string_option(&curwin->w_s->b_p_spc);
 clear_string_option(&curwin->w_s->b_p_spf);
 vim_free(curwin->w_s->b_cap_prog);
 curwin->w_s->b_cap_prog = ((void *)0);
 clear_string_option(&curwin->w_s->b_p_spl);

    }


    old_value = get_var_value((char_u *)"b:current_syntax");
    if (old_value != ((void *)0))
 old_value = vim_strsave(old_value);



    apply_autocmds(EVENT_SYNTAX, eap->arg, curbuf->b_fname, 1, curbuf);


    new_value = get_var_value((char_u *)"b:current_syntax");
    if (new_value != ((void *)0))
 set_internal_string_var((char_u *)"w:current_syntax", new_value);


    if (old_value == ((void *)0))
 do_unlet((char_u *)"b:current_syntax", 1);
    else
    {
 set_internal_string_var((char_u *)"b:current_syntax", old_value);
 vim_free(old_value);
    }
}

    int
syntax_present(win)
    win_T *win;
{
    return (win->w_s->b_syn_patterns.ga_len != 0
     || win->w_s->b_syn_clusters.ga_len != 0
     || win->w_s->b_keywtab.ht_used > 0
     || win->w_s->b_keywtab_ic.ht_used > 0);
}



static enum
{
    EXP_SUBCMD,
    EXP_CASE
} expand_what;





    void
reset_expand_highlight()
{
    include_link = include_default = include_none = 0;
}





    void
set_context_in_echohl_cmd(xp, arg)
    expand_T *xp;
    char_u *arg;
{
    xp->xp_context = 13;
    xp->xp_pattern = arg;
    include_none = 1;
}




    void
set_context_in_syntax_cmd(xp, arg)
    expand_T *xp;
    char_u *arg;
{
    char_u *p;


    xp->xp_context = 12;
    expand_what = EXP_SUBCMD;
    xp->xp_pattern = arg;
    include_link = 0;
    include_default = 0;


    if (*arg != '\000')
    {
 p = skiptowhite(arg);
 if (*p != '\000')
 {
     xp->xp_pattern = skipwhite(p);
     if (*skiptowhite(xp->xp_pattern) != '\000')
  xp->xp_context = 0;
     else if (strncasecmp((char *)(arg), (char *)("case"), (size_t)(p - arg)) == 0)
  expand_what = EXP_CASE;
     else if ( strncasecmp((char *)(arg), (char *)("keyword"), (size_t)(p - arg)) == 0
      || strncasecmp((char *)(arg), (char *)("region"), (size_t)(p - arg)) == 0
      || strncasecmp((char *)(arg), (char *)("match"), (size_t)(p - arg)) == 0
      || strncasecmp((char *)(arg), (char *)("list"), (size_t)(p - arg)) == 0)
  xp->xp_context = 13;
     else
  xp->xp_context = 0;
 }
    }
}

static char *(case_args[]) = {"match", "ignore", ((void *)0)};





    char_u *
get_syntax_name(xp, idx)
    expand_T *xp __attribute__((unused));
    int idx;
{
    if (expand_what == EXP_SUBCMD)
 return (char_u *)subcommands[idx].name;
    return (char_u *)case_args[idx];
}






    int
syn_get_id(wp, lnum, col, trans, spellp, keep_state)
    win_T *wp;
    long lnum;
    colnr_T col;
    int trans;
    int *spellp;
    int keep_state;
{


    if (wp->w_buffer != syn_buf
     || lnum != current_lnum
     || col < current_col)
 syntax_start(wp, lnum);

    (void)get_syntax_attr(col, spellp, keep_state);

    return (trans ? current_trans_id : current_id);
}
# 6385 "syntax.c"
    int
syn_get_stack_item(i)
    int i;
{
    if (i >= current_state.ga_len)
    {


 invalidate_current_state();
 current_col = (0x7fffffffL);
 return -1;
    }
    return ((stateitem_T *)(current_state.ga_data))[i].si_id;
}






    int
syn_get_foldlevel(wp, lnum)
    win_T *wp;
    long lnum;
{
    int level = 0;
    int i;


    if (wp->w_s->b_syn_folditems != 0)
    {
 syntax_start(wp, lnum);

 for (i = 0; i < current_state.ga_len; ++i)
     if (((stateitem_T *)(current_state.ga_data))[i].si_flags & 0x2000)
  ++level;
    }
    if (level > wp->w_onebuf_opt.wo_fdn)
    {
 level = wp->w_onebuf_opt.wo_fdn;
 if (level < 0)
     level = 0;
    }
    return level;
}
# 6451 "syntax.c"
static char *(highlight_init_both[]) =
    {
 "ErrorMsg term=standout ctermbg=DarkRed ctermfg=White guibg=Red guifg=White",

 "IncSearch term=reverse cterm=reverse gui=reverse",

 "ModeMsg term=bold cterm=bold gui=bold",

 "NonText term=bold ctermfg=Blue gui=bold guifg=Blue",

 "StatusLine term=reverse,bold cterm=reverse,bold gui=reverse,bold",

 "StatusLineNC term=reverse cterm=reverse gui=reverse",


 "VertSplit term=reverse cterm=reverse gui=reverse",



 "VisualNOS term=underline,bold cterm=underline,bold gui=underline,bold",



 "DiffText term=reverse cterm=bold ctermbg=Red gui=bold guibg=Red",



 "PmenuThumb cterm=reverse gui=reverse",

 "PmenuSbar ctermbg=Grey guibg=Grey",



 "TabLineSel term=bold cterm=bold gui=bold",

 "TabLineFill term=reverse cterm=reverse gui=reverse",






 ((void *)0)
    };

static char *(highlight_init_light[]) =
    {
 "Directory term=bold ctermfg=DarkBlue guifg=Blue",

 "LineNr term=underline ctermfg=Brown guifg=Brown",

 "MoreMsg term=bold ctermfg=DarkGreen gui=bold guifg=SeaGreen",

 "Question term=standout ctermfg=DarkGreen gui=bold guifg=SeaGreen",

 "Search term=reverse ctermbg=Yellow ctermfg=NONE guibg=Yellow guifg=NONE",


 "SpellBad term=reverse ctermbg=LightRed guisp=Red gui=undercurl",

 "SpellCap term=reverse ctermbg=LightBlue guisp=Blue gui=undercurl",

 "SpellRare term=reverse ctermbg=LightMagenta guisp=Magenta gui=undercurl",

 "SpellLocal term=underline ctermbg=Cyan guisp=DarkCyan gui=undercurl",



 "Pmenu ctermbg=LightMagenta guibg=LightMagenta",

 "PmenuSel ctermbg=LightGrey guibg=Grey",


 "SpecialKey term=bold ctermfg=DarkBlue guifg=Blue",

 "Title term=bold ctermfg=DarkMagenta gui=bold guifg=Magenta",

 "WarningMsg term=standout ctermfg=DarkRed guifg=Red",


 "WildMenu term=standout ctermbg=Yellow ctermfg=Black guibg=Yellow guifg=Black",



 "Folded term=standout ctermbg=Grey ctermfg=DarkBlue guibg=LightGrey guifg=DarkBlue",

 "FoldColumn term=standout ctermbg=Grey ctermfg=DarkBlue guibg=Grey guifg=DarkBlue",



 "SignColumn term=standout ctermbg=Grey ctermfg=DarkBlue guibg=Grey guifg=DarkBlue",



 "Visual term=reverse guibg=LightGrey",



 "DiffAdd term=bold ctermbg=LightBlue guibg=LightBlue",

 "DiffChange term=bold ctermbg=LightMagenta guibg=LightMagenta",

 "DiffDelete term=bold ctermfg=Blue ctermbg=LightCyan gui=bold guifg=Blue guibg=LightCyan",



 "TabLine term=underline cterm=underline ctermfg=black ctermbg=LightGrey gui=underline guibg=LightGrey",



 "CursorColumn term=reverse ctermbg=LightGrey guibg=Grey90",

 "CursorLine term=underline cterm=underline guibg=Grey90",

 "ColorColumn term=reverse ctermbg=LightRed guibg=LightRed",







 "MatchParen term=reverse ctermbg=Cyan guibg=Cyan",





 ((void *)0)
    };

static char *(highlight_init_dark[]) =
    {
 "Directory term=bold ctermfg=LightCyan guifg=Cyan",

 "LineNr term=underline ctermfg=Yellow guifg=Yellow",

 "MoreMsg term=bold ctermfg=LightGreen gui=bold guifg=SeaGreen",

 "Question term=standout ctermfg=LightGreen gui=bold guifg=Green",

 "Search term=reverse ctermbg=Yellow ctermfg=Black guibg=Yellow guifg=Black",

 "SpecialKey term=bold ctermfg=LightBlue guifg=Cyan",


 "SpellBad term=reverse ctermbg=Red guisp=Red gui=undercurl",

 "SpellCap term=reverse ctermbg=Blue guisp=Blue gui=undercurl",

 "SpellRare term=reverse ctermbg=Magenta guisp=Magenta gui=undercurl",

 "SpellLocal term=underline ctermbg=Cyan guisp=Cyan gui=undercurl",



 "Pmenu ctermbg=Magenta guibg=Magenta",

 "PmenuSel ctermbg=DarkGrey guibg=DarkGrey",


 "Title term=bold ctermfg=LightMagenta gui=bold guifg=Magenta",

 "WarningMsg term=standout ctermfg=LightRed guifg=Red",


 "WildMenu term=standout ctermbg=Yellow ctermfg=Black guibg=Yellow guifg=Black",



 "Folded term=standout ctermbg=DarkGrey ctermfg=Cyan guibg=DarkGrey guifg=Cyan",

 "FoldColumn term=standout ctermbg=DarkGrey ctermfg=Cyan guibg=Grey guifg=Cyan",



 "SignColumn term=standout ctermbg=DarkGrey ctermfg=Cyan guibg=Grey guifg=Cyan",



 "Visual term=reverse guibg=DarkGrey",



 "DiffAdd term=bold ctermbg=DarkBlue guibg=DarkBlue",

 "DiffChange term=bold ctermbg=DarkMagenta guibg=DarkMagenta",

 "DiffDelete term=bold ctermfg=Blue ctermbg=DarkCyan gui=bold guifg=Blue guibg=DarkCyan",



 "TabLine term=underline cterm=underline ctermfg=white ctermbg=DarkGrey gui=underline guibg=DarkGrey",



 "CursorColumn term=reverse ctermbg=DarkGrey guibg=Grey40",

 "CursorLine term=underline cterm=underline guibg=Grey40",

 "ColorColumn term=reverse ctermbg=DarkRed guibg=DarkRed",



 "MatchParen term=reverse ctermbg=DarkCyan guibg=DarkCyan",
# 6665 "syntax.c"
 ((void *)0)
    };

    void
init_highlight(both, reset)
    int both;
    int reset;
{
    int i;
    char **pp;
    static int had_both = 0;

    char_u *p;





    p = get_var_value((char_u *)"g:colors_name");
    if (p != ((void *)0) && load_colors(p) == 1)
 return;





    if (both)
    {
 had_both = 1;
 pp = highlight_init_both;
 for (i = 0; pp[i] != ((void *)0); ++i)
     do_highlight((char_u *)pp[i], reset, 1);
    }
    else if (!had_both)



 return;

    if (*p_bg == 'l')
 pp = highlight_init_light;
    else
 pp = highlight_init_dark;
    for (i = 0; pp[i] != ((void *)0); ++i)
 do_highlight((char_u *)pp[i], reset, 1);






    if (t_colors > 8)
 do_highlight((char_u *)(*p_bg == 'l'
      ? "Visual cterm=NONE ctermbg=LightGrey"
      : "Visual cterm=NONE ctermbg=DarkGrey"), 0, 1);
    else
    {
 do_highlight((char_u *)"Visual cterm=reverse ctermbg=NONE",
         0, 1);
 if (*p_bg == 'l')
     do_highlight((char_u *)"Search ctermfg=black", 0, 1);
    }





    if (get_var_value((char_u *)"g:syntax_on") != ((void *)0))
    {
 static int recursive = 0;

 if (recursive >= 5)
     emsg((char_u *)(((char *)("E679: recursive loop loading syncolor.vim"))));
 else
 {
     ++recursive;
     (void)source_runtime((char_u *)"syntax/syncolor.vim", 1);
     --recursive;
 }
    }

}





    int
load_colors(name)
    char_u *name;
{
    char_u *buf;
    int retval = 0;
    static int recursive = 0;




    if (recursive)
 return 1;

    recursive = 1;
    buf = alloc((unsigned)(strlen((char *)(name)) + 12));
    if (buf != ((void *)0))
    {
 __builtin___sprintf_chk ((char *)buf, 0, __builtin_object_size ((char *)buf, 1 > 1), "colors/%s.vim", name);
 retval = source_runtime(buf, 0);
 vim_free(buf);

 apply_autocmds(EVENT_COLORSCHEME, ((void *)0), ((void *)0), 0, curbuf);

    }
    recursive = 0;

    return retval;
}






    void
do_highlight(line, forceit, init)
    char_u *line;
    int forceit;
    int init;
{
    char_u *name_end;
    char_u *p;
    char_u *linep;
    char_u *key_start;
    char_u *arg_start;
    char_u *key = ((void *)0), *arg = ((void *)0);
    long i;
    int off;
    int len;
    int attr;
    int id;
    int idx;
    int dodefault = 0;
    int doclear = 0;
    int dolink = 0;
    int error = 0;
    int color;
    int is_normal_group = 0;
# 6824 "syntax.c"
    if (ends_excmd(*line))
    {
 for (i = 1; i <= highlight_ga.ga_len && !got_int; ++i)

     highlight_list_one((int)i);
 return;
    }




    name_end = skiptowhite(line);
    linep = skipwhite(name_end);




    if (strncmp((char *)(line), (char *)("default"), (size_t)(name_end - line)) == 0)
    {
 dodefault = 1;
 line = linep;
 name_end = skiptowhite(line);
 linep = skipwhite(name_end);
    }




    if (strncmp((char *)(line), (char *)("clear"), (size_t)(name_end - line)) == 0)
 doclear = 1;
    if (strncmp((char *)(line), (char *)("link"), (size_t)(name_end - line)) == 0)
 dolink = 1;




    if (!doclear && !dolink && ends_excmd(*linep))
    {
 id = syn_namen2id(line, (int)(name_end - line));
 if (id == 0)
     emsg2((char_u *)(((char *)("E411: highlight group not found: %s"))), (char_u *)(line));
 else
     highlight_list_one(id);
 return;
    }




    if (dolink)
    {
 char_u *from_start = linep;
 char_u *from_end;
 char_u *to_start;
 char_u *to_end;
 int from_id;
 int to_id;

 from_end = skiptowhite(from_start);
 to_start = skipwhite(from_end);
 to_end = skiptowhite(to_start);

 if (ends_excmd(*from_start) || ends_excmd(*to_start))
 {
     emsg2((char_u *)(((char *)("E412: Not enough arguments: \":highlight link %s\""))), (char_u *)(from_start));

     return;
 }

 if (!ends_excmd(*skipwhite(to_end)))
 {
     emsg2((char_u *)(((char *)("E413: Too many arguments: \":highlight link %s\""))), (char_u *)(from_start));
     return;
 }

 from_id = syn_check_group(from_start, (int)(from_end - from_start));
 if (strncmp((char *)(to_start), (char *)("NONE"), (size_t)(4)) == 0)
     to_id = 0;
 else
     to_id = syn_check_group(to_start, (int)(to_end - to_start));

 if (from_id > 0 && (!init || ((struct hl_group *)((highlight_ga.ga_data)))[from_id - 1].sg_set == 0))
 {




     if (to_id > 0 && !forceit && !init
       && hl_has_settings(from_id - 1, dodefault))
     {
  if (sourcing_name == ((void *)0) && !dodefault)
      emsg((char_u *)(((char *)("E414: group has settings, highlight link ignored"))));
     }
     else
     {
  if (!init)
      ((struct hl_group *)((highlight_ga.ga_data)))[from_id - 1].sg_set |= 8;
  ((struct hl_group *)((highlight_ga.ga_data)))[from_id - 1].sg_link = to_id;

  ((struct hl_group *)((highlight_ga.ga_data)))[from_id - 1].sg_scriptID = current_SID;

  redraw_all_later(35);
     }
 }


 need_highlight_changed = 1;

 return;
    }

    if (doclear)
    {



 line = linep;
 if (ends_excmd(*line))
 {
# 6988 "syntax.c"
     do_unlet((char_u *)"colors_name", 1);

     restore_cterm_colors();




     for (idx = 0; idx < highlight_ga.ga_len; ++idx)
  highlight_clear(idx);
     init_highlight(1, 1);




     highlight_changed();
     redraw_later_clear();
     return;
 }
 name_end = skiptowhite(line);
 linep = skipwhite(name_end);
    }




    id = syn_check_group(line, (int)(name_end - line));
    if (id == 0)
 return;
    idx = id - 1;


    if (dodefault && hl_has_settings(idx, 1))
 return;

    if (strcmp((char *)(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_name_u), (char *)("NORMAL")) == 0)
 is_normal_group = 1;
# 7034 "syntax.c"
    if (doclear || (forceit && init))
    {
 highlight_clear(idx);
 if (!doclear)
     ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set = 0;
    }

    if (!doclear)
      while (!ends_excmd(*linep))
      {
 key_start = linep;
 if (*linep == '=')
 {
     emsg2((char_u *)(((char *)("E415: unexpected equal sign: %s"))), (char_u *)(key_start));
     error = 1;
     break;
 }





 while (*linep && !((*linep) == ' ' || (*linep) == '\t') && *linep != '=')
     ++linep;
 vim_free(key);
 key = vim_strnsave_up(key_start, (int)(linep - key_start));
 if (key == ((void *)0))
 {
     error = 1;
     break;
 }
 linep = skipwhite(linep);

 if (strcmp((char *)(key), (char *)("NONE")) == 0)
 {
     if (!init || ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set == 0)
     {
  if (!init)
      ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set |= 1 +2 +4;
  highlight_clear(idx);
     }
     continue;
 }




 if (*linep != '=')
 {
     emsg2((char_u *)(((char *)("E416: missing equal sign: %s"))), (char_u *)(key_start));
     error = 1;
     break;
 }
 ++linep;




 linep = skipwhite(linep);
 if (*linep == '\'')
 {
     arg_start = ++linep;
     linep = vim_strchr(linep, '\'');
     if (linep == ((void *)0))
     {
  emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(key_start));
  error = 1;
  break;
     }
 }
 else
 {
     arg_start = linep;
     linep = skiptowhite(linep);
 }
 if (linep == arg_start)
 {
     emsg2((char_u *)(((char *)("E417: missing argument: %s"))), (char_u *)(key_start));
     error = 1;
     break;
 }
 vim_free(arg);
 arg = vim_strnsave(arg_start, (int)(linep - arg_start));
 if (arg == ((void *)0))
 {
     error = 1;
     break;
 }
 if (*linep == '\'')
     ++linep;




 if ( strcmp((char *)(key), (char *)("TERM")) == 0
  || strcmp((char *)(key), (char *)("CTERM")) == 0
  || strcmp((char *)(key), (char *)("GUI")) == 0)
 {
     attr = 0;
     off = 0;
     while (arg[off] != '\000')
     {
  for (i = sizeof(hl_attr_table) / sizeof(int); --i >= 0; )
  {
      len = (int)strlen((char *)(hl_name_table[i]));
      if (strncasecmp((char *)(arg + off), (char *)(hl_name_table[i]), (size_t)(len)) == 0)
      {
   attr |= hl_attr_table[i];
   off += len;
   break;
      }
  }
  if (i < 0)
  {
      emsg2((char_u *)(((char *)("E418: Illegal value: %s"))), (char_u *)(arg));
      error = 1;
      break;
  }
  if (arg[off] == ',')
      ++off;
     }
     if (error)
  break;
     if (*key == 'T')
     {
  if (!init || !(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set & 1))
  {
      if (!init)
   ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set |= 1;
      ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_term = attr;
  }
     }
     else if (*key == 'C')
     {
  if (!init || !(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set & 2))
  {
      if (!init)
   ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set |= 2;
      ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm = attr;
      ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm_bold = 0;
  }
     }

     else
     {
  if (!init || !(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set & 4))
  {
      if (!init)
   ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set |= 4;
      ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui = attr;
  }
     }

 }
 else if (strcmp((char *)(key), (char *)("FONT")) == 0)
 {
# 7243 "syntax.c"
 }
 else if (strcmp((char *)(key), (char *)("CTERMFG")) == 0 || strcmp((char *)(key), (char *)("CTERMBG")) == 0)
 {
   if (!init || !(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set & 2))
   {
     if (!init)
  ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set |= 2;



     if (key[5] == 'F' && ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm_bold)
     {
  ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm &= ~0x02;
  ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm_bold = 0;
     }

     if (((*arg) >= '0' && (*arg) <= '9'))
  color = atoi((char *)arg);
     else if (strcasecmp((char *)(arg), (char *)("fg")) == 0)
     {
  if (cterm_normal_fg_color)
      color = cterm_normal_fg_color - 1;
  else
  {
      emsg((char_u *)(((char *)("E419: FG color unknown"))));
      error = 1;
      break;
  }
     }
     else if (strcasecmp((char *)(arg), (char *)("bg")) == 0)
     {
  if (cterm_normal_bg_color > 0)
      color = cterm_normal_bg_color - 1;
  else
  {
      emsg((char_u *)(((char *)("E420: BG color unknown"))));
      error = 1;
      break;
  }
     }
     else
     {
  static char *(color_names[28]) = {
       "Black", "DarkBlue", "DarkGreen", "DarkCyan",
       "DarkRed", "DarkMagenta", "Brown", "DarkYellow",
       "Gray", "Grey",
       "LightGray", "LightGrey", "DarkGray", "DarkGrey",
       "Blue", "LightBlue", "Green", "LightGreen",
       "Cyan", "LightCyan", "Red", "LightRed", "Magenta",
       "LightMagenta", "Yellow", "LightYellow", "White", "NONE"};
  static int color_numbers_16[28] = {0, 1, 2, 3,
       4, 5, 6, 6,
       7, 7,
       7, 7, 8, 8,
       9, 9, 10, 10,
       11, 11, 12, 12, 13,
       13, 14, 14, 15, -1};

  static int color_numbers_88[28] = {0, 4, 2, 6,
       1, 5, 32, 72,
       84, 84,
       7, 7, 82, 82,
       12, 43, 10, 61,
       14, 63, 9, 74, 13,
       75, 11, 78, 15, -1};

  static int color_numbers_256[28] = {0, 4, 2, 6,
       1, 5, 130, 130,
       248, 248,
       7, 7, 242, 242,
       12, 81, 10, 121,
       14, 159, 9, 224, 13,
       225, 11, 229, 15, -1};

  static int color_numbers_8[28] = {0, 4, 2, 6,
       1, 5, 3, 3,
       7, 7,
       7, 7, 0+8, 0+8,
       4+8, 4+8, 2+8, 2+8,
       6+8, 6+8, 1+8, 1+8, 5+8,
       5+8, 3+8, 3+8, 7+8, -1};
# 7332 "syntax.c"
  off = (((*arg) < 'a' || (*arg) > 'z') ? (*arg) : (*arg) - ('a' - 'A'));
  for (i = (sizeof(color_names) / sizeof(char *)); --i >= 0; )
      if (off == color_names[i][0]
     && strcasecmp((char *)(arg + 1), (char *)(color_names[i] + 1)) == 0)
   break;
  if (i < 0)
  {
      emsg2((char_u *)(((char *)("E421: Color name or number not recognized: %s"))), (char_u *)(key_start));
      error = 1;
      break;
  }


  color = color_numbers_16[i];
  if (color >= 0)
  {
      if (t_colors == 8)
      {




   color = color_numbers_8[i];

   if (key[5] == 'F')
   {


       if (color & 8)
       {
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm |= 0x02;
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm_bold = 1;
       }
       else
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm &= ~0x02;
   }
   color &= 7;
      }
      else if (t_colors == 16 || t_colors == 88
          || t_colors == 256)
      {





   if (*(term_strings[(int)(KS_CAF)]) != '\000')
       p = (term_strings[(int)(KS_CAF)]);
   else
       p = (term_strings[(int)(KS_CSF)]);
   if (*p != '\000' && *(p + strlen((char *)(p)) - 1) == 'm')
       switch (t_colors)
       {
    case 16:
        color = color_numbers_8[i];
        break;
    case 88:
        color = color_numbers_88[i];
        break;
    case 256:
        color = color_numbers_256[i];
        break;
       }
      }
  }
     }


     if (key[5] == 'F')
     {
  ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm_fg = color + 1;
  if (is_normal_group)
  {
      cterm_normal_fg_color = color + 1;
      cterm_normal_fg_bold = (((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm & 0x02);




      {
   must_redraw = 50;
   if (termcap_active && color >= 0)
       term_fg_color(color);
      }
  }
     }
     else
     {
  ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm_bg = color + 1;
  if (is_normal_group)
  {
      cterm_normal_bg_color = color + 1;




      {
   must_redraw = 50;
   if (color >= 0)
   {
       if (termcap_active)
    term_bg_color(color);
       if (t_colors < 16)
    i = (color == 0 || color == 4);
       else
    i = (color < 7 || color == 8);


       if (i != (*p_bg == 'd'))
    set_option_value((char_u *)"bg", 0L,
     i ? (char_u *)"dark"
       : (char_u *)"light", 0);
   }
      }
  }
     }
   }
 }
 else if (strcmp((char *)(key), (char *)("GUIFG")) == 0)
 {

     if (!init || !(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set & 4))
     {
  if (!init)
      ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set |= 4;
# 7465 "syntax.c"
      vim_free(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_fg_name);
      if (strcmp((char *)(arg), (char *)("NONE")))
   ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_fg_name = vim_strsave(arg);
      else
   ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_fg_name = ((void *)0);
# 7484 "syntax.c"
     }

 }
 else if (strcmp((char *)(key), (char *)("GUIBG")) == 0)
 {

     if (!init || !(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set & 4))
     {
  if (!init)
      ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set |= 4;
# 7502 "syntax.c"
      vim_free(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_bg_name);
      if (strcmp((char *)(arg), (char *)("NONE")) != 0)
   ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_bg_name = vim_strsave(arg);
      else
   ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_bg_name = ((void *)0);
# 7521 "syntax.c"
     }

 }
 else if (strcmp((char *)(key), (char *)("GUISP")) == 0)
 {

     if (!init || !(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set & 4))
     {
  if (!init)
      ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set |= 4;







      vim_free(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_sp_name);
      if (strcmp((char *)(arg), (char *)("NONE")) != 0)
   ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_sp_name = vim_strsave(arg);
      else
   ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_sp_name = ((void *)0);



     }

 }
 else if (strcmp((char *)(key), (char *)("START")) == 0 || strcmp((char *)(key), (char *)("STOP")) == 0)
 {
     char_u buf[100];
     char_u *tname;

     if (!init)
  ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set |= 1;





     if (strncmp((char *)(arg), (char *)("t_"), (size_t)(2)) == 0)
     {
  off = 0;
  buf[0] = 0;
  while (arg[off] != '\000')
  {

      for (len = 0; arg[off + len] &&
       arg[off + len] != ','; ++len)
   ;
      tname = vim_strnsave(arg + off, len);
      if (tname == ((void *)0))
      {
   error = 1;
   break;
      }

      p = get_term_code(tname);
      vim_free(tname);
      if (p == ((void *)0))
   p = (char_u *)"";


      if ((int)(strlen((char *)(buf)) + strlen((char *)(p))) >= 99)
      {
   emsg2((char_u *)(((char *)("E422: terminal code too long: %s"))), (char_u *)(arg));
   error = 1;
   break;
      }
      ((__builtin_object_size ((char *)(buf), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(buf), (char *)(p), __builtin_object_size ((char *)(buf), 1 > 1)) : __inline_strcat_chk ((char *)(buf), (char *)(p)));


      off += len;
      if (arg[off] == ',')
   ++off;
  }
     }
     else
     {



  for (p = arg, off = 0; off < 100 && *p; )
  {
      len = trans_special(&p, buf + off, 0);
      if (len)
   off += len;
      else
   buf[off++] = *p++;
  }
  buf[off] = '\000';
     }
     if (error)
  break;

     if (strcmp((char *)(buf), (char *)("NONE")) == 0)
  p = ((void *)0);
     else
  p = vim_strsave(buf);
     if (key[2] == 'A')
     {
  vim_free(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_start);
  ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_start = p;
     }
     else
     {
  vim_free(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_stop);
  ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_stop = p;
     }
 }
 else
 {
     emsg2((char_u *)(((char *)("E423: Illegal argument: %s"))), (char_u *)(key_start));
     error = 1;
     break;
 }




 if (!init || !(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set & 8))
     ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_link = 0;




 linep = skipwhite(linep);
      }




    if (error && idx == highlight_ga.ga_len)
 syn_unadd_group();
    else
    {
 if (is_normal_group)
 {
     ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_term_attr = 0;
     ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm_attr = 0;
# 7670 "syntax.c"
 }
# 7692 "syntax.c"
 else
     set_hl_attr(idx);

 ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_scriptID = current_SID;

 redraw_all_later(40);
    }
    vim_free(key);
    vim_free(arg);


    need_highlight_changed = 1;
}
# 7726 "syntax.c"
    void
restore_cterm_colors()
{






    cterm_normal_fg_color = 0;
    cterm_normal_fg_bold = 0;
    cterm_normal_bg_color = 0;

}





    static int
hl_has_settings(idx, check_link)
    int idx;
    int check_link;
{
    return ( ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_term_attr != 0
     || ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm_attr != 0



     || (check_link && (((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_set & 8)));
}




    static void
highlight_clear(idx)
    int idx;
{
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_term = 0;
    vim_free(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_start);
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_start = ((void *)0);
    vim_free(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_stop);
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_stop = ((void *)0);
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_term_attr = 0;
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm = 0;
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm_bold = 0;
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm_fg = 0;
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm_bg = 0;
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_cterm_attr = 0;

    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui = 0;
    vim_free(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_fg_name);
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_fg_name = ((void *)0);
    vim_free(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_bg_name);
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_bg_name = ((void *)0);
    vim_free(((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_sp_name);
    ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_gui_sp_name = ((void *)0);
# 7802 "syntax.c"
    if (((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_link == 0)
 ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_scriptID = 0;

}
# 8109 "syntax.c"
static garray_T term_attr_table = {0, 0, 0, 0, ((void *)0)};



static garray_T cterm_attr_table = {0, 0, 0, 0, ((void *)0)};
# 8129 "syntax.c"
    static int
get_attr_entry(table, aep)
    garray_T *table;
    attrentry_T *aep;
{
    int i;
    attrentry_T *taep;
    static int recursive = 0;




    table->ga_itemsize = sizeof(attrentry_T);
    table->ga_growsize = 7;




    for (i = 0; i < table->ga_len; ++i)
    {
 taep = &(((attrentry_T *)table->ga_data)[i]);
 if ( aep->ae_attr == taep->ae_attr
  && (
# 8166 "syntax.c"
         (table == &term_attr_table
   && (aep->ae_u.term.start == ((void *)0))
         == (taep->ae_u.term.start == ((void *)0))
   && (aep->ae_u.term.start == ((void *)0)
       || strcmp((char *)(aep->ae_u.term.start), (char *)(taep->ae_u.term.start)) == 0)

   && (aep->ae_u.term.stop == ((void *)0))
          == (taep->ae_u.term.stop == ((void *)0))
   && (aep->ae_u.term.stop == ((void *)0)
       || strcmp((char *)(aep->ae_u.term.stop), (char *)(taep->ae_u.term.stop)) == 0))

      || (table == &cterm_attr_table
       && aep->ae_u.cterm.fg_color
        == taep->ae_u.cterm.fg_color
       && aep->ae_u.cterm.bg_color
       == taep->ae_u.cterm.bg_color)
       ))

 return i + (0x3f + 1);
    }

    if (table->ga_len + (0x3f + 1) > 65535)
    {





 if (recursive)
 {
     emsg((char_u *)(((char *)("E424: Too many different highlighting attributes in use"))));
     return 0;
 }
 recursive = 1;

 clear_hl_tables();

 must_redraw = 50;

 for (i = 0; i < highlight_ga.ga_len; ++i)
     set_hl_attr(i);

 recursive = 0;
    }




    if (ga_grow(table, 1) == 0)
 return 0;

    taep = &(((attrentry_T *)table->ga_data)[table->ga_len]);
    ((__builtin_object_size ((taep), 0) != (size_t) -1) ? __builtin___memset_chk ((taep), (0), (sizeof(attrentry_T)), __builtin_object_size ((taep), 0)) : __inline_memset_chk ((taep), (0), (sizeof(attrentry_T))));
    taep->ae_attr = aep->ae_attr;
# 8232 "syntax.c"
    if (table == &term_attr_table)
    {
 if (aep->ae_u.term.start == ((void *)0))
     taep->ae_u.term.start = ((void *)0);
 else
     taep->ae_u.term.start = vim_strsave(aep->ae_u.term.start);
 if (aep->ae_u.term.stop == ((void *)0))
     taep->ae_u.term.stop = ((void *)0);
 else
     taep->ae_u.term.stop = vim_strsave(aep->ae_u.term.stop);
    }
    else if (table == &cterm_attr_table)
    {
 taep->ae_u.cterm.fg_color = aep->ae_u.cterm.fg_color;
 taep->ae_u.cterm.bg_color = aep->ae_u.cterm.bg_color;
    }
    ++table->ga_len;
    return (table->ga_len - 1 + (0x3f + 1));
}




    void
clear_hl_tables()
{
    int i;
    attrentry_T *taep;




    for (i = 0; i < term_attr_table.ga_len; ++i)
    {
 taep = &(((attrentry_T *)term_attr_table.ga_data)[i]);
 vim_free(taep->ae_u.term.start);
 vim_free(taep->ae_u.term.stop);
    }
    ga_clear(&term_attr_table);
    ga_clear(&cterm_attr_table);
}
# 8284 "syntax.c"
    int
hl_combine_attr(char_attr, prim_attr)
    int char_attr;
    int prim_attr;
{
    attrentry_T *char_aep = ((void *)0);
    attrentry_T *spell_aep;
    attrentry_T new_en;

    if (char_attr == 0)
 return prim_attr;
    if (char_attr <= 0x3f && prim_attr <= 0x3f)
 return char_attr | prim_attr;
# 8340 "syntax.c"
    if (t_colors > 1)
    {
 if (char_attr > 0x3f)
     char_aep = syn_cterm_attr2entry(char_attr);
 if (char_aep != ((void *)0))
     new_en = *char_aep;
 else
 {
     ((__builtin_object_size ((&new_en), 0) != (size_t) -1) ? __builtin___memset_chk ((&new_en), (0), (sizeof(new_en)), __builtin_object_size ((&new_en), 0)) : __inline_memset_chk ((&new_en), (0), (sizeof(new_en))));
     if (char_attr <= 0x3f)
  new_en.ae_attr = char_attr;
 }

 if (prim_attr <= 0x3f)
     new_en.ae_attr |= prim_attr;
 else
 {
     spell_aep = syn_cterm_attr2entry(prim_attr);
     if (spell_aep != ((void *)0))
     {
  new_en.ae_attr |= spell_aep->ae_attr;
  if (spell_aep->ae_u.cterm.fg_color > 0)
      new_en.ae_u.cterm.fg_color = spell_aep->ae_u.cterm.fg_color;
  if (spell_aep->ae_u.cterm.bg_color > 0)
      new_en.ae_u.cterm.bg_color = spell_aep->ae_u.cterm.bg_color;
     }
 }
 return get_attr_entry(&cterm_attr_table, &new_en);
    }

    if (char_attr > 0x3f)
 char_aep = syn_term_attr2entry(char_attr);
    if (char_aep != ((void *)0))
 new_en = *char_aep;
    else
    {
 ((__builtin_object_size ((&new_en), 0) != (size_t) -1) ? __builtin___memset_chk ((&new_en), (0), (sizeof(new_en)), __builtin_object_size ((&new_en), 0)) : __inline_memset_chk ((&new_en), (0), (sizeof(new_en))));
 if (char_attr <= 0x3f)
     new_en.ae_attr = char_attr;
    }

    if (prim_attr <= 0x3f)
 new_en.ae_attr |= prim_attr;
    else
    {
 spell_aep = syn_term_attr2entry(prim_attr);
 if (spell_aep != ((void *)0))
 {
     new_en.ae_attr |= spell_aep->ae_attr;
     if (spell_aep->ae_u.term.start != ((void *)0))
     {
  new_en.ae_u.term.start = spell_aep->ae_u.term.start;
  new_en.ae_u.term.stop = spell_aep->ae_u.term.stop;
     }
 }
    }
    return get_attr_entry(&term_attr_table, &new_en);
}
# 8417 "syntax.c"
    int
syn_attr2attr(attr)
    int attr;
{
    attrentry_T *aep;






 if (t_colors > 1)
 aep = syn_cterm_attr2entry(attr);
    else
 aep = syn_term_attr2entry(attr);

    if (aep == ((void *)0))
 return 0;
    return aep->ae_attr;
}


    attrentry_T *
syn_term_attr2entry(attr)
    int attr;
{
    attr -= (0x3f + 1);
    if (attr >= term_attr_table.ga_len)
 return ((void *)0);
    return &(((attrentry_T *)term_attr_table.ga_data)[attr]);
}

    attrentry_T *
syn_cterm_attr2entry(attr)
    int attr;
{
    attr -= (0x3f + 1);
    if (attr >= cterm_attr_table.ga_len)
 return ((void *)0);
    return &(((attrentry_T *)cterm_attr_table.ga_data)[attr]);
}





    static void
highlight_list_one(id)
    int id;
{
    struct hl_group *sgp;
    int didh = 0;

    sgp = &((struct hl_group *)((highlight_ga.ga_data)))[id - 1];

    didh = highlight_list_arg(id, didh, 1,
        sgp->sg_term, ((void *)0), "term");
    didh = highlight_list_arg(id, didh, 2,
        0, sgp->sg_start, "start");
    didh = highlight_list_arg(id, didh, 2,
        0, sgp->sg_stop, "stop");

    didh = highlight_list_arg(id, didh, 1,
        sgp->sg_cterm, ((void *)0), "cterm");
    didh = highlight_list_arg(id, didh, 3,
        sgp->sg_cterm_fg, ((void *)0), "ctermfg");
    didh = highlight_list_arg(id, didh, 3,
        sgp->sg_cterm_bg, ((void *)0), "ctermbg");


    didh = highlight_list_arg(id, didh, 1,
        sgp->sg_gui, ((void *)0), "gui");
    didh = highlight_list_arg(id, didh, 2,
        0, sgp->sg_gui_fg_name, "guifg");
    didh = highlight_list_arg(id, didh, 2,
        0, sgp->sg_gui_bg_name, "guibg");
    didh = highlight_list_arg(id, didh, 2,
        0, sgp->sg_gui_sp_name, "guisp");






    if (sgp->sg_link && !got_int)
    {
 (void)syn_list_header(didh, 9999, id);
 didh = 1;
 msg_puts_attr((char_u *)"links to", highlight_attr[(int)(HLF_D)]);
 msg_putchar(' ');
 msg_outtrans(((struct hl_group *)((highlight_ga.ga_data)))[((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_link - 1].sg_name);
    }

    if (!didh)
 highlight_list_arg(id, didh, 2, 0, (char_u *)"cleared", "");

    if (p_verbose > 0)
 last_set_msg(sgp->sg_scriptID);

}

    static int
highlight_list_arg(id, didh, type, iarg, sarg, name)
    int id;
    int didh;
    int type;
    int iarg;
    char_u *sarg;
    char *name;
{
    char_u buf[100];
    char_u *ts;
    int i;

    if (got_int)
 return 0;
    if (type == 2 ? (sarg != ((void *)0)) : (iarg != 0))
    {
 ts = buf;
 if (type == 3)
     __builtin___sprintf_chk ((char *)buf, 0, __builtin_object_size ((char *)buf, 1 > 1), "%d", iarg - 1);
 else if (type == 2)
     ts = sarg;
 else
 {
     buf[0] = '\000';
     for (i = 0; hl_attr_table[i] != 0; ++i)
     {
  if (iarg & hl_attr_table[i])
  {
      if (buf[0] != '\000')
   ((__builtin_object_size ((char *)(buf), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(buf), (char *)(","), __builtin_object_size ((char *)(buf), 1 > 1)) : __inline_strcat_chk ((char *)(buf), (char *)(",")));
      ((__builtin_object_size ((char *)(buf), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(buf), (char *)(hl_name_table[i]), __builtin_object_size ((char *)(buf), 1 > 1)) : __inline_strcat_chk ((char *)(buf), (char *)(hl_name_table[i])));
      iarg &= ~hl_attr_table[i];
  }
     }
 }

 (void)syn_list_header(didh,
          (int)(vim_strsize(ts) + strlen((char *)(name)) + 1), id);
 didh = 1;
 if (!got_int)
 {
     if (*name != '\000')
     {
  msg_puts_attr((char_u *)(name), (highlight_attr[(int)(HLF_D)]));
  msg_puts_attr((char_u *)("="), (highlight_attr[(int)(HLF_D)]));
     }
     msg_outtrans(ts);
 }
    }
    return didh;
}






    char_u *
highlight_has_attr(id, flag, modec)
    int id;
    int flag;
    int modec;
{
    int attr;

    if (id <= 0 || id > highlight_ga.ga_len)
 return ((void *)0);


    if (modec == 'g')
 attr = ((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_gui;
    else

  if (modec == 'c')
 attr = ((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_cterm;
    else
 attr = ((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_term;

    if (attr & flag)
 return (char_u *)"1";
    return ((void *)0);
}






    char_u *
highlight_color(id, what, modec)
    int id;
    char_u *what;
    int modec;
{
    static char_u name[20];
    int n;
    int fg = 0;
    int sp = 0;
    int font = 0;

    if (id <= 0 || id > highlight_ga.ga_len)
 return ((void *)0);

    if ((((what[0]) < 'A' || (what[0]) > 'Z') ? (what[0]) : (what[0]) + ('a' - 'A')) == 'f' && (((what[1]) < 'A' || (what[1]) > 'Z') ? (what[1]) : (what[1]) + ('a' - 'A')) == 'g')
 fg = 1;
    else if ((((what[0]) < 'A' || (what[0]) > 'Z') ? (what[0]) : (what[0]) + ('a' - 'A')) == 'f' && (((what[1]) < 'A' || (what[1]) > 'Z') ? (what[1]) : (what[1]) + ('a' - 'A')) == 'o'
      && (((what[2]) < 'A' || (what[2]) > 'Z') ? (what[2]) : (what[2]) + ('a' - 'A')) == 'n' && (((what[3]) < 'A' || (what[3]) > 'Z') ? (what[3]) : (what[3]) + ('a' - 'A')) == 't')
 font = 1;
    else if ((((what[0]) < 'A' || (what[0]) > 'Z') ? (what[0]) : (what[0]) + ('a' - 'A')) == 's' && (((what[1]) < 'A' || (what[1]) > 'Z') ? (what[1]) : (what[1]) + ('a' - 'A')) == 'p')
 sp = 1;
    else if (!((((what[0]) < 'A' || (what[0]) > 'Z') ? (what[0]) : (what[0]) + ('a' - 'A')) == 'b' && (((what[1]) < 'A' || (what[1]) > 'Z') ? (what[1]) : (what[1]) + ('a' - 'A')) == 'g'))
 return ((void *)0);
    if (modec == 'g')
    {
# 8661 "syntax.c"
 if (fg)
     return (((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_gui_fg_name);
 if (sp)
     return (((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_gui_sp_name);
 return (((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_gui_bg_name);
    }
    if (font || sp)
 return ((void *)0);
    if (modec == 'c')
    {
 if (fg)
     n = ((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_cterm_fg - 1;
 else
     n = ((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_cterm_bg - 1;
 __builtin___sprintf_chk ((char *)name, 0, __builtin_object_size ((char *)name, 1 > 1), "%d", n);
 return name;
    }

    return ((void *)0);
}
# 8714 "syntax.c"
    static int
syn_list_header(did_header, outlen, id)
    int did_header;
    int outlen;
    int id;
{
    int endcol = 19;
    int newline = 1;

    if (!did_header)
    {
 msg_putchar('\n');
 if (got_int)
     return 1;
 msg_outtrans(((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_name);
 endcol = 15;
    }
    else if (msg_col + outlen + 1 >= Columns)
    {
 msg_putchar('\n');
 if (got_int)
     return 1;
    }
    else
    {
 if (msg_col >= endcol)
     newline = 0;
    }

    if (msg_col >= endcol)
 endcol = msg_col + 1;
    if (Columns <= endcol)
 endcol = Columns - 1;

    msg_advance(endcol);


    if (!did_header)
    {
 msg_puts_attr((char_u *)"xxx", syn_id2attr(id));
 msg_putchar(' ');
    }

    return newline;
}





    static void
set_hl_attr(idx)
    int idx;
{
    attrentry_T at_en;
    struct hl_group *sgp = ((struct hl_group *)((highlight_ga.ga_data))) + idx;


    if (sgp->sg_name_u != ((void *)0) && strcmp((char *)(sgp->sg_name_u), (char *)("NORMAL")) == 0)
 return;
# 8808 "syntax.c"
    if (sgp->sg_start == ((void *)0) && sgp->sg_stop == ((void *)0))
 sgp->sg_term_attr = sgp->sg_term;
    else
    {
 at_en.ae_attr = sgp->sg_term;
 at_en.ae_u.term.start = sgp->sg_start;
 at_en.ae_u.term.stop = sgp->sg_stop;
 sgp->sg_term_attr = get_attr_entry(&term_attr_table, &at_en);
    }





    if (sgp->sg_cterm_fg == 0 && sgp->sg_cterm_bg == 0)
 sgp->sg_cterm_attr = sgp->sg_cterm;
    else
    {
 at_en.ae_attr = sgp->sg_cterm;
 at_en.ae_u.cterm.fg_color = sgp->sg_cterm_fg;
 at_en.ae_u.cterm.bg_color = sgp->sg_cterm_bg;
 sgp->sg_cterm_attr = get_attr_entry(&cterm_attr_table, &at_en);
    }
}





    int
syn_name2id(name)
    char_u *name;
{
    int i;
    char_u name_u[200];




    vim_strncpy(name_u, name, 199);
    vim_strup(name_u);
    for (i = highlight_ga.ga_len; --i >= 0; )
 if (((struct hl_group *)((highlight_ga.ga_data)))[i].sg_name_u != ((void *)0)
  && strcmp((char *)(name_u), (char *)(((struct hl_group *)((highlight_ga.ga_data)))[i].sg_name_u)) == 0)
     break;
    return i + 1;
}





    int
highlight_exists(name)
    char_u *name;
{
    return (syn_name2id(name) > 0);
}






    char_u *
syn_id2name(id)
    int id;
{
    if (id <= 0 || id > highlight_ga.ga_len)
 return (char_u *)"";
    return ((struct hl_group *)((highlight_ga.ga_data)))[id - 1].sg_name;
}






    int
syn_namen2id(linep, len)
    char_u *linep;
    int len;
{
    char_u *name;
    int id = 0;

    name = vim_strnsave(linep, len);
    if (name != ((void *)0))
    {
 id = syn_name2id(name);
 vim_free(name);
    }
    return id;
}







    int
syn_check_group(pp, len)
    char_u *pp;
    int len;
{
    int id;
    char_u *name;

    name = vim_strnsave(pp, len);
    if (name == ((void *)0))
 return 0;

    id = syn_name2id(name);
    if (id == 0)
 id = syn_add_group(name);
    else
 vim_free(name);
    return id;
}






    static int
syn_add_group(name)
    char_u *name;
{
    char_u *p;


    for (p = name; *p != '\000'; ++p)
    {
 if (!vim_isprintc(*p))
 {
     emsg((char_u *)(((char *)("E669: Unprintable character in group name"))));
     vim_free(name);
     return 0;
 }
 else if (!((*p) < 0x7f && isalnum(*p)) && *p != '_')
 {


     msg_source(highlight_attr[(int)(HLF_W)]);
     msg((char_u *)(((char *)("W18: Invalid character in group name"))));
     break;
 }
    }




    if (highlight_ga.ga_data == ((void *)0))
    {
 highlight_ga.ga_itemsize = sizeof(struct hl_group);
 highlight_ga.ga_growsize = 10;
    }




    if (ga_grow(&highlight_ga, 1) == 0)
    {
 vim_free(name);
 return 0;
    }

    ((__builtin_object_size ((&(((struct hl_group *)((highlight_ga.ga_data)))[highlight_ga.ga_len])), 0) != (size_t) -1) ? __builtin___memset_chk ((&(((struct hl_group *)((highlight_ga.ga_data)))[highlight_ga.ga_len])), (0), (sizeof(struct hl_group)), __builtin_object_size ((&(((struct hl_group *)((highlight_ga.ga_data)))[highlight_ga.ga_len])), 0)) : __inline_memset_chk ((&(((struct hl_group *)((highlight_ga.ga_data)))[highlight_ga.ga_len])), (0), (sizeof(struct hl_group))));
    ((struct hl_group *)((highlight_ga.ga_data)))[highlight_ga.ga_len].sg_name = name;
    ((struct hl_group *)((highlight_ga.ga_data)))[highlight_ga.ga_len].sg_name_u = vim_strsave_up(name);





    ++highlight_ga.ga_len;

    return highlight_ga.ga_len;
}





    static void
syn_unadd_group()
{
    --highlight_ga.ga_len;
    vim_free(((struct hl_group *)((highlight_ga.ga_data)))[highlight_ga.ga_len].sg_name);
    vim_free(((struct hl_group *)((highlight_ga.ga_data)))[highlight_ga.ga_len].sg_name_u);
}




    int
syn_id2attr(hl_id)
    int hl_id;
{
    int attr;
    struct hl_group *sgp;

    hl_id = syn_get_final_id(hl_id);
    sgp = &((struct hl_group *)((highlight_ga.ga_data)))[hl_id - 1];
# 9023 "syntax.c"
 if (t_colors > 1)
     attr = sgp->sg_cterm_attr;
 else
     attr = sgp->sg_term_attr;

    return attr;
}
# 9056 "syntax.c"
    int
syn_get_final_id(hl_id)
    int hl_id;
{
    int count;
    struct hl_group *sgp;

    if (hl_id > highlight_ga.ga_len || hl_id < 1)
 return 0;





    for (count = 100; --count >= 0; )
    {
 sgp = &((struct hl_group *)((highlight_ga.ga_data)))[hl_id - 1];
 if (sgp->sg_link == 0 || sgp->sg_link > highlight_ga.ga_len)
     break;
 hl_id = sgp->sg_link;
    }

    return hl_id;
}
# 9146 "syntax.c"
    int
highlight_changed()
{
    int hlf;
    int i;
    char_u *p;
    int attr;
    char_u *end;
    int id;

    char_u userhl[10];

    int id_SNC = -1;
    int id_S = -1;
    int hlcnt;


    static int hl_flags[HLF_COUNT] = {'8', '@', 'd', 'e', 'h', 'i', 'l', 'm', 'M', 'n', 'r', 's', 'S', 'c', 't', 'v', 'V', 'w', 'W', 'f', 'F', 'A', 'C', 'D', 'T', '-', '>', 'B', 'P', 'R', 'L', '+', '=', 'x', 'X', '*', '#', '_', '!', '.', 'o'};

    need_highlight_changed = 0;




    for (hlf = 0; hlf < (int)HLF_COUNT; ++hlf)
 highlight_attr[hlf] = 0;





    for (i = 0; i < 2; ++i)
    {
 if (i)
     p = p_hl;
 else
     p = get_highlight_default();
 if (p == ((void *)0))
     continue;

 while (*p)
 {
     for (hlf = 0; hlf < (int)HLF_COUNT; ++hlf)
  if (hl_flags[hlf] == *p)
      break;
     ++p;
     if (hlf == (int)HLF_COUNT || *p == '\000')
  return 0;





     attr = 0;
     for ( ; *p && *p != ','; ++p)
     {
  if (((*p) == ' ' || (*p) == '\t'))
      continue;

  if (attr > 0x3f)
      return 0;

  switch (*p)
  {
      case 'b': attr |= 0x02;
    break;
      case 'i': attr |= 0x04;
    break;
      case '-':
      case 'n':
    break;
      case 'r': attr |= 0x01;
    break;
      case 's': attr |= 0x20;
    break;
      case 'u': attr |= 0x08;
    break;
      case 'c': attr |= 0x10;
    break;
      case ':': ++p;
    if (attr || *p == '\000')
        return 0;
    end = vim_strchr(p, ',');
    if (end == ((void *)0))
        end = p + strlen((char *)(p));
    id = syn_check_group(p, (int)(end - p));
    if (id == 0)
        return 0;
    attr = syn_id2attr(id);
    p = end - 1;

    if (hlf == (int)HLF_SNC)
        id_SNC = syn_get_final_id(id);
    else if (hlf == (int)HLF_S)
        id_S = syn_get_final_id(id);

    break;
      default: return 0;
  }
     }
     highlight_attr[hlf] = attr;

     p = skip_to_option_part(p);
 }
    }
# 9259 "syntax.c"
    if (ga_grow(&highlight_ga, 10) == 0)
 return 0;
    hlcnt = highlight_ga.ga_len;
    if (id_S == 0)
    {
 ((__builtin_object_size ((&((struct hl_group *)((highlight_ga.ga_data)))[hlcnt + 9]), 0) != (size_t) -1) ? __builtin___memset_chk ((&((struct hl_group *)((highlight_ga.ga_data)))[hlcnt + 9]), (0), (sizeof(struct hl_group)), __builtin_object_size ((&((struct hl_group *)((highlight_ga.ga_data)))[hlcnt + 9]), 0)) : __inline_memset_chk ((&((struct hl_group *)((highlight_ga.ga_data)))[hlcnt + 9]), (0), (sizeof(struct hl_group))));
 ((struct hl_group *)((highlight_ga.ga_data)))[hlcnt + 9].sg_term = highlight_attr[HLF_S];
 id_S = hlcnt + 10;
    }

    for (i = 0; i < 9; i++)
    {
 __builtin___sprintf_chk ((char *)userhl, 0, __builtin_object_size ((char *)userhl, 1 > 1), "User%d", i + 1);
 id = syn_name2id(userhl);
 if (id == 0)
 {
     highlight_user[i] = 0;

     highlight_stlnc[i] = 0;

 }
 else
 {

     struct hl_group *hlt = ((struct hl_group *)((highlight_ga.ga_data)));


     highlight_user[i] = syn_id2attr(id);

     if (id_SNC == 0)
     {
  ((__builtin_object_size ((&hlt[hlcnt + i]), 0) != (size_t) -1) ? __builtin___memset_chk ((&hlt[hlcnt + i]), (0), (sizeof(struct hl_group)), __builtin_object_size ((&hlt[hlcnt + i]), 0)) : __inline_memset_chk ((&hlt[hlcnt + i]), (0), (sizeof(struct hl_group))));
  hlt[hlcnt + i].sg_term = highlight_attr[HLF_SNC];
  hlt[hlcnt + i].sg_cterm = highlight_attr[HLF_SNC];

  hlt[hlcnt + i].sg_gui = highlight_attr[HLF_SNC];

     }
     else
  ((__builtin_object_size ((char *)(&hlt[hlcnt + i]), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(&hlt[hlcnt + i]), (char *)(&hlt[id_SNC - 1]), sizeof(struct hl_group), __builtin_object_size ((char *)(&hlt[hlcnt + i]), 0)) : __inline_memmove_chk ((char *)(&hlt[hlcnt + i]), (char *)(&hlt[id_SNC - 1]), sizeof(struct hl_group)));


     hlt[hlcnt + i].sg_link = 0;


     hlt[hlcnt + i].sg_term ^=
  hlt[id - 1].sg_term ^ hlt[id_S - 1].sg_term;
     if (hlt[id - 1].sg_start != hlt[id_S - 1].sg_start)
  hlt[hlcnt + i].sg_start = hlt[id - 1].sg_start;
     if (hlt[id - 1].sg_stop != hlt[id_S - 1].sg_stop)
  hlt[hlcnt + i].sg_stop = hlt[id - 1].sg_stop;
     hlt[hlcnt + i].sg_cterm ^=
  hlt[id - 1].sg_cterm ^ hlt[id_S - 1].sg_cterm;
     if (hlt[id - 1].sg_cterm_fg != hlt[id_S - 1].sg_cterm_fg)
  hlt[hlcnt + i].sg_cterm_fg = hlt[id - 1].sg_cterm_fg;
     if (hlt[id - 1].sg_cterm_bg != hlt[id_S - 1].sg_cterm_bg)
  hlt[hlcnt + i].sg_cterm_bg = hlt[id - 1].sg_cterm_bg;

     hlt[hlcnt + i].sg_gui ^=
  hlt[id - 1].sg_gui ^ hlt[id_S - 1].sg_gui;
# 9334 "syntax.c"
     highlight_ga.ga_len = hlcnt + i + 1;
     set_hl_attr(hlcnt + i);
     highlight_stlnc[i] = syn_id2attr(hlcnt + i + 1);

 }
    }

    highlight_ga.ga_len = hlcnt;




    return 1;
}



static void highlight_list (void);
static void highlight_list_two (int cnt, int attr);




    void
set_context_in_highlight_cmd(xp, arg)
    expand_T *xp;
    char_u *arg;
{
    char_u *p;


    xp->xp_context = 13;
    xp->xp_pattern = arg;
    include_link = 2;
    include_default = 1;


    if (*arg != '\000')
    {
 p = skiptowhite(arg);
 if (*p != '\000')
 {
     include_default = 0;
     if (strncmp((char *)("default"), (char *)(arg), (size_t)(p - arg)) == 0)
     {
  arg = skipwhite(p);
  xp->xp_pattern = arg;
  p = skiptowhite(arg);
     }
     if (*p != '\000')
     {
  include_link = 0;
  if (arg[1] == 'i' && arg[0] == 'N')
      highlight_list();
  if (strncmp((char *)("link"), (char *)(arg), (size_t)(p - arg)) == 0
   || strncmp((char *)("clear"), (char *)(arg), (size_t)(p - arg)) == 0)
  {
      xp->xp_pattern = skipwhite(p);
      p = skiptowhite(xp->xp_pattern);
      if (*p != '\000')
      {
   xp->xp_pattern = skipwhite(p);
   p = skiptowhite(xp->xp_pattern);
      }
  }
  if (*p != '\000')
      xp->xp_context = 0;
     }
 }
    }
}




    static void
highlight_list()
{
    int i;

    for (i = 10; --i >= 0; )
 highlight_list_two(i, highlight_attr[(int)(HLF_D)]);
    for (i = 40; --i >= 0; )
 highlight_list_two(99, 0);
}

    static void
highlight_list_two(cnt, attr)
    int cnt;
    int attr;
{
    msg_puts_attr((char_u *)("N \bI \b!  \b" + cnt / 11), attr);
    msg_clr_eos();
    out_flush();
    ui_delay(cnt == 99 ? 40L : (long)cnt * 50L, 0);
}
# 9439 "syntax.c"
    char_u *
get_highlight_name(xp, idx)
    expand_T *xp __attribute__((unused));
    int idx;
{

    if (idx == highlight_ga.ga_len && include_none != 0)
 return (char_u *)"none";
    if (idx == highlight_ga.ga_len + include_none && include_default != 0)
 return (char_u *)"default";
    if (idx == highlight_ga.ga_len + include_none + include_default
        && include_link != 0)
 return (char_u *)"link";
    if (idx == highlight_ga.ga_len + include_none + include_default + 1
        && include_link != 0)
 return (char_u *)"clear";

    if (idx < 0 || idx >= highlight_ga.ga_len)
 return ((void *)0);
    return ((struct hl_group *)((highlight_ga.ga_data)))[idx].sg_name;
}
