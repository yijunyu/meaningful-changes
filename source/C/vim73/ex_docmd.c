# 1 "ex_docmd.c"
# 1 "/Users/yy66/Documents/research/mct/source/C/vim73/src//"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "ex_docmd.c"
# 14 "ex_docmd.c"
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
# 15 "ex_docmd.c" 2

static int quitmore = 0;
static int ex_pressedreturn = 0;





typedef struct ucmd
{
    char_u *uc_name;
    long_u uc_argt;
    char_u *uc_rep;
    long uc_def;
    int uc_compl;

    scid_T uc_scriptID;

    char_u *uc_compl_arg;


} ucmd_T;



static garray_T ucmds = {0, 0, sizeof(ucmd_T), 4, ((void *)0)};




static void do_ucmd (exarg_T *eap);
static void ex_command (exarg_T *eap);
static void ex_delcommand (exarg_T *eap);

static char_u *get_user_command_name (int idx);
# 59 "ex_docmd.c"
static char_u *do_one_cmd (char_u **, int, struct condstack *, char_u *(*fgetline)(int, void *, int), void *cookie);




static char_u *find_command (exarg_T *eap, int *full);

static void ex_abbreviate (exarg_T *eap);
static void ex_map (exarg_T *eap);
static void ex_unmap (exarg_T *eap);
static void ex_mapclear (exarg_T *eap);
static void ex_abclear (exarg_T *eap);






static void ex_autocmd (exarg_T *eap);
static void ex_doautocmd (exarg_T *eap);






static void ex_bunload (exarg_T *eap);
static void ex_buffer (exarg_T *eap);
static void ex_bmodified (exarg_T *eap);
static void ex_bnext (exarg_T *eap);
static void ex_bprevious (exarg_T *eap);
static void ex_brewind (exarg_T *eap);
static void ex_blast (exarg_T *eap);
# 106 "ex_docmd.c"
static char_u *getargcmd (char_u **);
static char_u *skip_cmd_arg (char_u *p, int rembs);
static int getargopt (exarg_T *eap);
# 129 "ex_docmd.c"
static int check_more (int, int);
static linenr_T get_address (char_u **, int skip, int to_other_file);
static void get_flags (exarg_T *eap);







static void ex_script_ni (exarg_T *eap);

static char_u *invalid_range (exarg_T *eap);
static void correct_range (exarg_T *eap);

static char_u *replace_makeprg (exarg_T *eap, char_u *p, char_u **cmdlinep);

static char_u *repl_cmdline (exarg_T *eap, char_u *src, int srclen, char_u *repl, char_u **cmdlinep);
static void ex_highlight (exarg_T *eap);
static void ex_colorscheme (exarg_T *eap);
static void ex_quit (exarg_T *eap);
static void ex_cquit (exarg_T *eap);
static void ex_quit_all (exarg_T *eap);

static void ex_close (exarg_T *eap);
static void ex_win_close (int forceit, win_T *win, tabpage_T *tp);
static void ex_only (exarg_T *eap);
static void ex_resize (exarg_T *eap);
static void ex_stag (exarg_T *eap);
static void ex_tabclose (exarg_T *eap);
static void ex_tabonly (exarg_T *eap);
static void ex_tabnext (exarg_T *eap);
static void ex_tabmove (exarg_T *eap);
static void ex_tabs (exarg_T *eap);
# 177 "ex_docmd.c"
static void ex_pclose (exarg_T *eap);
static void ex_ptag (exarg_T *eap);
static void ex_pedit (exarg_T *eap);





static void ex_hide (exarg_T *eap);
static void ex_stop (exarg_T *eap);
static void ex_exit (exarg_T *eap);
static void ex_print (exarg_T *eap);

static void ex_goto (exarg_T *eap);



static void ex_shell (exarg_T *eap);
static void ex_preserve (exarg_T *eap);
static void ex_recover (exarg_T *eap);






static void ex_mode (exarg_T *eap);
static void ex_wrongmodifier (exarg_T *eap);
static void ex_find (exarg_T *eap);
static void ex_open (exarg_T *eap);
static void ex_edit (exarg_T *eap);





static void ex_nogui (exarg_T *eap);
# 292 "ex_docmd.c"
static void ex_swapname (exarg_T *eap);
static void ex_syncbind (exarg_T *eap);
static void ex_read (exarg_T *eap);
static void ex_pwd (exarg_T *eap);
static void ex_equal (exarg_T *eap);
static void ex_sleep (exarg_T *eap);
static void do_exmap (exarg_T *eap, int isabbrev);
static void ex_winsize (exarg_T *eap);

static void ex_wincmd (exarg_T *eap);




static void ex_winpos (exarg_T *eap);



static void ex_operators (exarg_T *eap);
static void ex_put (exarg_T *eap);
static void ex_copymove (exarg_T *eap);
static void ex_may_print (exarg_T *eap);
static void ex_submagic (exarg_T *eap);
static void ex_join (exarg_T *eap);
static void ex_at (exarg_T *eap);
static void ex_bang (exarg_T *eap);
static void ex_undo (exarg_T *eap);

static void ex_wundo (exarg_T *eap);
static void ex_rundo (exarg_T *eap);

static void ex_redo (exarg_T *eap);
static void ex_later (exarg_T *eap);
static void ex_redir (exarg_T *eap);
static void ex_redraw (exarg_T *eap);
static void ex_redrawstatus (exarg_T *eap);
static void close_redir (void);
static void ex_mkrc (exarg_T *eap);
static void ex_mark (exarg_T *eap);

static char_u *uc_fun_cmd (void);
static char_u *find_ucmd (exarg_T *eap, char_u *p, int *full, expand_T *xp, int *compl);


static void ex_normal (exarg_T *eap);
static void ex_startinsert (exarg_T *eap);
static void ex_stopinsert (exarg_T *eap);
# 349 "ex_docmd.c"
static void ex_checkpath (exarg_T *eap);
static void ex_findpat (exarg_T *eap);





static void ex_psearch (exarg_T *eap);



static void ex_tag (exarg_T *eap);
static void ex_tag_cmd (exarg_T *eap, char_u *name);
# 393 "ex_docmd.c"
static char_u *arg_all (void);

static int makeopens (FILE *fd, char_u *dirnow);
static int put_view (FILE *fd, win_T *wp, int add_edit, unsigned *flagp, int current_arg_idx);
static void ex_loadview (exarg_T *eap);
static char_u *get_view_file (int c);
static int did_lcd;







static void ex_viminfo (exarg_T *eap);



static void ex_behave (exarg_T *eap);

static void ex_filetype (exarg_T *eap);
static void ex_setfiletype (exarg_T *eap);
# 427 "ex_docmd.c"
static void ex_digraphs (exarg_T *eap);
static void ex_set (exarg_T *eap);




static void ex_nohlsearch (exarg_T *eap);
static void ex_match (exarg_T *eap);





static void ex_X (exarg_T *eap);




static void ex_fold (exarg_T *eap);
static void ex_foldopen (exarg_T *eap);
static void ex_folddo (exarg_T *eap);
# 493 "ex_docmd.c"
# 1 "ex_cmds.h" 1
# 79 "ex_cmds.h"
typedef void (*ex_func_T) (exarg_T *eap);

static struct cmdname
{
    char_u *cmd_name;
    ex_func_T cmd_func;
    long_u cmd_argt;
}



cmdnames[] =




{
{(char_u *)"append", ex_append, (long_u)(0x002|0x001|0x1000|0x100|0x100000L|0x200000L)},

{(char_u *)"abbreviate", ex_abbreviate, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"abclear", ex_abclear, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"aboveleft", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"all", ex_all, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"amenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"anoremenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"args", ex_args, (long_u)(0x002|(0x008 | 0x004)|0x8000|0x40000L|0x100)},

{(char_u *)"argadd", ex_argadd, (long_u)(0x002|0x080|0x001|0x4000|0x1000|(0x008 | 0x004)|0x100)},

{(char_u *)"argdelete", ex_argdelete, (long_u)(0x002|0x001|0x4000|(0x008 | 0x004)|0x100)},

{(char_u *)"argdo", ex_listdo, (long_u)(0x002|0x080|0x004|0x800)},

{(char_u *)"argedit", ex_argedit, (long_u)(0x002|0x080|0x001|0x4000|((0x008 | 0x004) | 0x010)|0x8000|0x40000L|0x100)},

{(char_u *)"argglobal", ex_args, (long_u)(0x002|(0x008 | 0x004)|0x8000|0x40000L|0x100)},

{(char_u *)"arglocal", ex_args, (long_u)(0x002|(0x008 | 0x004)|0x8000|0x40000L|0x100)},

{(char_u *)"argument", ex_argument, (long_u)(0x002|0x001|0x4000|0x400|0x004|0x8000|0x40000L|0x100)},

{(char_u *)"ascii", do_ascii, (long_u)(0x100|0x80000L|0x100000L)},

{(char_u *)"autocmd", ex_autocmd, (long_u)(0x002|0x004|0x800|0x2000|0x100000L)},

{(char_u *)"augroup", ex_autocmd, (long_u)(0x002|(0x004 | 0x010)|0x100|0x100000L)},

{(char_u *)"aunmenu", ex_menu, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"buffer", ex_buffer, (long_u)(0x002|0x001|0x4000|0x10000L|0x20000L|0x400|0x004|0x100)},

{(char_u *)"bNext", ex_bprevious, (long_u)(0x002|0x001|0x4000|0x400|0x100)},

{(char_u *)"ball", ex_buffer_all, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"badd", ex_edit, (long_u)(0x080|((0x008 | 0x004) | 0x010)|0x8000|0x100|0x100000L)},

{(char_u *)"bdelete", ex_bunload, (long_u)(0x002|0x001|0x4000|0x10000L|0x400|0x004|0x100)},

{(char_u *)"behave", ex_behave, (long_u)(0x080|(0x004 | 0x010)|0x100|0x100000L)},

{(char_u *)"belowright", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"bfirst", ex_brewind, (long_u)(0x002|0x001|0x4000|0x100)},

{(char_u *)"blast", ex_blast, (long_u)(0x002|0x001|0x4000|0x100)},

{(char_u *)"bmodified", ex_bmodified, (long_u)(0x002|0x001|0x4000|0x400|0x100)},

{(char_u *)"bnext", ex_bnext, (long_u)(0x002|0x001|0x4000|0x400|0x100)},

{(char_u *)"botright", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"bprevious", ex_bprevious, (long_u)(0x002|0x001|0x4000|0x400|0x100)},

{(char_u *)"brewind", ex_brewind, (long_u)(0x002|0x001|0x4000|0x100)},

{(char_u *)"break", ex_break, (long_u)(0x100|0x80000L|0x100000L)},

{(char_u *)"breakadd", ex_breakadd, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"breakdel", ex_breakdel, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"breaklist", ex_breaklist, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"browse", ex_wrongmodifier, (long_u)(0x080|0x004|0x800|0x100000L)},

{(char_u *)"buffers", buflist_list, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"bufdo", ex_listdo, (long_u)(0x002|0x080|0x004|0x800)},

{(char_u *)"bunload", ex_bunload, (long_u)(0x002|0x001|0x4000|0x10000L|0x400|0x004|0x100)},

{(char_u *)"bwipeout", ex_bunload, (long_u)(0x002|0x001|0x4000|0x10000L|0x20000L|0x400|0x004|0x100)},

{(char_u *)"change", ex_change, (long_u)(0x002|0x040|0x001|0x400|0x100|0x100000L|0x200000L)},

{(char_u *)"cNext", ex_cnext, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"cNfile", ex_cnext, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"cabbrev", ex_abbreviate, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"cabclear", ex_abclear, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"caddbuffer", ex_cbuffer, (long_u)(0x001|0x4000|(0x004 | 0x010)|0x100)},

{(char_u *)"caddexpr", ex_cexpr, (long_u)(0x080|(0x004 | 0x010)|0x800|0x100)},

{(char_u *)"caddfile", ex_cfile, (long_u)(0x100|((0x008 | 0x004) | 0x010))},

{(char_u *)"call", ex_call, (long_u)(0x001|0x080|0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"catch", ex_catch, (long_u)(0x004|0x80000L|0x100000L)},

{(char_u *)"cbuffer", ex_cbuffer, (long_u)(0x002|0x001|0x4000|(0x004 | 0x010)|0x100)},

{(char_u *)"cc", ex_cc, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"cclose", ex_cclose, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"cd", ex_cd, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x100|0x100000L)},

{(char_u *)"center", ex_align, (long_u)(0x100|0x001|0x040|0x004|0x100000L|0x200000L)},

{(char_u *)"cexpr", ex_cexpr, (long_u)(0x080|(0x004 | 0x010)|0x800|0x100|0x002)},

{(char_u *)"cfile", ex_cfile, (long_u)(0x100|((0x008 | 0x004) | 0x010)|0x002)},

{(char_u *)"cfirst", ex_cc, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"cgetfile", ex_cfile, (long_u)(0x100|((0x008 | 0x004) | 0x010))},

{(char_u *)"cgetbuffer", ex_cbuffer, (long_u)(0x001|0x4000|(0x004 | 0x010)|0x100)},

{(char_u *)"cgetexpr", ex_cexpr, (long_u)(0x080|(0x004 | 0x010)|0x800|0x100)},

{(char_u *)"chdir", ex_cd, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x100|0x100000L)},

{(char_u *)"changes", ex_changes, (long_u)(0x100|0x100000L)},

{(char_u *)"checkpath", ex_checkpath, (long_u)(0x100|0x002|0x100000L)},

{(char_u *)"checktime", ex_checktime, (long_u)(0x001|0x4000|0x10000L|0x400|0x004|0x100)},

{(char_u *)"clist", qf_list, (long_u)(0x002|0x004|0x100|0x100000L)},

{(char_u *)"clast", ex_cc, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"close", ex_close, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"cmap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"cmapclear", ex_mapclear, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"cmenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"cnext", ex_cnext, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"cnewer", qf_age, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"cnfile", ex_cnext, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"cnoremap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"cnoreabbrev", ex_abbreviate, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"cnoremenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"copy", ex_copymove, (long_u)(0x001|0x040|0x004|0x100|0x100000L|0x200000L)},

{(char_u *)"colder", qf_age, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"colorscheme", ex_colorscheme, (long_u)((0x004 | 0x010)|0x100|0x100000L)},

{(char_u *)"command", ex_command, (long_u)(0x004|0x002|0x800|0x2000|0x100000L)},

{(char_u *)"comclear", ex_comclear, (long_u)(0x100|0x100000L)},

{(char_u *)"compiler", ex_compiler, (long_u)(0x002|0x100|(0x004 | 0x010)|0x100000L)},

{(char_u *)"continue", ex_continue, (long_u)(0x100|0x80000L|0x100000L)},

{(char_u *)"confirm", ex_wrongmodifier, (long_u)(0x080|0x004|0x800|0x100000L)},

{(char_u *)"copen", ex_copen, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"cprevious", ex_cnext, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"cpfile", ex_cnext, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"cquit", ex_cquit, (long_u)(0x100|0x002)},

{(char_u *)"crewind", ex_cc, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"cscope", ex_ni, (long_u)(0x004|0x800|0x008)},

{(char_u *)"cstag", ex_ni, (long_u)(0x002|0x100|(0x004 | 0x010))},

{(char_u *)"cunmap", ex_unmap, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"cunabbrev", ex_abbreviate, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"cunmenu", ex_menu, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"cwindow", ex_cwindow, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"delete", ex_operators, (long_u)(0x001|0x040|0x200|0x400|0x100|0x100000L|0x200000L)},

{(char_u *)"delmarks", ex_delmarks, (long_u)(0x002|0x004|0x100|0x100000L)},

{(char_u *)"debug", ex_debug, (long_u)(0x080|0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"debuggreedy", ex_debuggreedy, (long_u)(0x001|0x4000|0x1000|0x100|0x100000L)},

{(char_u *)"delcommand", ex_delcommand, (long_u)(0x080|(0x004 | 0x010)|0x100|0x100000L)},

{(char_u *)"delfunction", ex_delfunction, (long_u)(0x080|(0x004 | 0x010)|0x100000L)},

{(char_u *)"display", ex_display, (long_u)(0x004|0x800|0x100|0x80000L|0x100000L)},

{(char_u *)"diffupdate", ex_diffupdate, (long_u)(0x100)},

{(char_u *)"diffget", ex_diffgetput, (long_u)(0x001|0x004|0x100|0x200000L)},

{(char_u *)"diffoff", ex_diffoff, (long_u)(0x002|0x100)},

{(char_u *)"diffpatch", ex_diffpatch, (long_u)(0x004|((0x008 | 0x004) | 0x010)|0x100|0x200000L)},

{(char_u *)"diffput", ex_diffgetput, (long_u)(0x001|0x004|0x100)},

{(char_u *)"diffsplit", ex_diffsplit, (long_u)(0x004|((0x008 | 0x004) | 0x010)|0x100)},

{(char_u *)"diffthis", ex_diffthis, (long_u)(0x100)},

{(char_u *)"digraphs", ex_digraphs, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"djump", ex_findpat, (long_u)(0x002|0x001|0x020|0x040|0x004)},

{(char_u *)"dlist", ex_findpat, (long_u)(0x002|0x001|0x020|0x040|0x004|0x100000L)},

{(char_u *)"doautocmd", ex_doautocmd, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"doautoall", ex_doautoall, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"drop", ex_ni, (long_u)((0x008 | 0x004)|0x8000|0x080|0x40000L|0x100)},

{(char_u *)"dsearch", ex_findpat, (long_u)(0x002|0x001|0x020|0x040|0x004|0x100000L)},

{(char_u *)"dsplit", ex_findpat, (long_u)(0x002|0x001|0x020|0x040|0x004)},

{(char_u *)"edit", ex_edit, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x8000|0x40000L|0x100)},

{(char_u *)"earlier", ex_later, (long_u)(0x100|0x004|0x010|0x100000L)},

{(char_u *)"echo", ex_echo, (long_u)(0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"echoerr", ex_execute, (long_u)(0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"echohl", ex_echohl, (long_u)(0x004|0x100|0x80000L|0x100000L)},

{(char_u *)"echomsg", ex_execute, (long_u)(0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"echon", ex_echo, (long_u)(0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"else", ex_else, (long_u)(0x100|0x80000L|0x100000L)},

{(char_u *)"elseif", ex_else, (long_u)(0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"emenu", ex_emenu, (long_u)(0x080|0x004|0x100|0x800|0x001|0x4000|0x100000L)},

{(char_u *)"endif", ex_endif, (long_u)(0x100|0x80000L|0x100000L)},

{(char_u *)"endfunction", ex_endfunction, (long_u)(0x100|0x100000L)},

{(char_u *)"endfor", ex_endwhile, (long_u)(0x100|0x80000L|0x100000L)},

{(char_u *)"endtry", ex_endtry, (long_u)(0x100|0x80000L|0x100000L)},

{(char_u *)"endwhile", ex_endwhile, (long_u)(0x100|0x80000L|0x100000L)},

{(char_u *)"enew", ex_edit, (long_u)(0x002|0x100)},

{(char_u *)"ex", ex_edit, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x8000|0x40000L|0x100)},

{(char_u *)"execute", ex_execute, (long_u)(0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"exit", ex_exit, (long_u)(0x001|0x040|0x002|((0x008 | 0x004) | 0x010)|0x40000L|0x020|0x100|0x100000L)},

{(char_u *)"exusage", ex_exusage, (long_u)(0x100)},

{(char_u *)"file", ex_file, (long_u)(0x001|0x4000|0x1000|0x002|((0x008 | 0x004) | 0x010)|0x100)},

{(char_u *)"files", buflist_list, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"filetype", ex_filetype, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"find", ex_find, (long_u)(0x001|0x4000|0x002|((0x008 | 0x004) | 0x010)|0x8000|0x40000L|0x100)},

{(char_u *)"finally", ex_finally, (long_u)(0x100|0x80000L|0x100000L)},

{(char_u *)"finish", ex_finish, (long_u)(0x100|0x80000L|0x100000L)},

{(char_u *)"first", ex_rewind, (long_u)(0x004|0x002|0x8000|0x40000L|0x100)},

{(char_u *)"fixdel", do_fixdel, (long_u)(0x100|0x100000L)},

{(char_u *)"fold", ex_fold, (long_u)(0x001|0x040|0x100|0x80000L|0x100000L)},

{(char_u *)"foldclose", ex_foldopen, (long_u)(0x001|0x002|0x040|0x100|0x80000L|0x100000L)},

{(char_u *)"folddoopen", ex_folddo, (long_u)(0x001|0x020|0x080|0x004|0x800)},

{(char_u *)"folddoclosed", ex_folddo, (long_u)(0x001|0x020|0x080|0x004|0x800)},

{(char_u *)"foldopen", ex_foldopen, (long_u)(0x001|0x002|0x040|0x100|0x80000L|0x100000L)},

{(char_u *)"for", ex_while, (long_u)(0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"function", ex_function, (long_u)(0x004|0x002|0x100000L)},

{(char_u *)"global", ex_global, (long_u)(0x001|0x040|0x002|0x004|0x020|0x80000L|0x100000L)},

{(char_u *)"goto", ex_goto, (long_u)(0x001|0x4000|0x400|0x100|0x80000L|0x100000L)},

{(char_u *)"grep", ex_make, (long_u)(0x001|0x4000|0x002|0x080|0x004|0x800|0x100|0x008)},

{(char_u *)"grepadd", ex_make, (long_u)(0x001|0x4000|0x002|0x080|0x004|0x800|0x100|0x008)},

{(char_u *)"gui", ex_nogui, (long_u)(0x002|(0x008 | 0x004)|0x8000|0x40000L|0x100|0x100000L)},

{(char_u *)"gvim", ex_nogui, (long_u)(0x002|(0x008 | 0x004)|0x8000|0x40000L|0x100|0x100000L)},

{(char_u *)"help", ex_help, (long_u)(0x002|0x004|0x800)},

{(char_u *)"helpfind", ex_ni, (long_u)(0x004|0x800)},

{(char_u *)"helpgrep", ex_helpgrep, (long_u)(0x004|0x800|0x080)},

{(char_u *)"helptags", ex_helptags, (long_u)(0x080|(0x008 | 0x004)|0x100|0x100000L)},

{(char_u *)"hardcopy", ex_hardcopy, (long_u)(0x001|0x400|0x004|0x100|0x020|0x002)},

{(char_u *)"highlight", ex_highlight, (long_u)(0x002|0x004|0x100|0x80000L|0x100000L)},

{(char_u *)"hide", ex_hide, (long_u)(0x002|0x004|0x800)},

{(char_u *)"history", ex_history, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"insert", ex_append, (long_u)(0x002|0x001|0x100|0x100000L|0x200000L)},

{(char_u *)"iabbrev", ex_abbreviate, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"iabclear", ex_abclear, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"if", ex_if, (long_u)(0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"ijump", ex_findpat, (long_u)(0x002|0x001|0x020|0x040|0x004)},

{(char_u *)"ilist", ex_findpat, (long_u)(0x002|0x001|0x020|0x040|0x004|0x100000L)},

{(char_u *)"imap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"imapclear", ex_mapclear, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"imenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"inoremap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"inoreabbrev", ex_abbreviate, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"inoremenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"intro", ex_intro, (long_u)(0x100|0x100000L)},

{(char_u *)"isearch", ex_findpat, (long_u)(0x002|0x001|0x020|0x040|0x004|0x100000L)},

{(char_u *)"isplit", ex_findpat, (long_u)(0x002|0x001|0x020|0x040|0x004)},

{(char_u *)"iunmap", ex_unmap, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"iunabbrev", ex_abbreviate, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"iunmenu", ex_menu, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"join", ex_join, (long_u)(0x002|0x001|0x040|0x400|0x400000L|0x100|0x100000L|0x200000L)},

{(char_u *)"jumps", ex_jumps, (long_u)(0x100|0x100000L)},

{(char_u *)"k", ex_mark, (long_u)(0x001|(0x004 | 0x010)|0x100|0x80000L|0x100000L)},

{(char_u *)"keepmarks", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"keepjumps", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"keepalt", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"list", ex_print, (long_u)(0x001|0x040|0x400|0x400000L|0x100|0x100000L)},

{(char_u *)"lNext", ex_cnext, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"lNfile", ex_cnext, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"last", ex_last, (long_u)(0x004|0x002|0x8000|0x40000L|0x100)},

{(char_u *)"language", ex_ni, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"laddexpr", ex_cexpr, (long_u)(0x080|(0x004 | 0x010)|0x800|0x100)},

{(char_u *)"laddbuffer", ex_cbuffer, (long_u)(0x001|0x4000|(0x004 | 0x010)|0x100)},

{(char_u *)"laddfile", ex_cfile, (long_u)(0x100|((0x008 | 0x004) | 0x010))},

{(char_u *)"later", ex_later, (long_u)(0x100|0x004|0x010|0x100000L)},

{(char_u *)"lbuffer", ex_cbuffer, (long_u)(0x002|0x001|0x4000|(0x004 | 0x010)|0x100)},

{(char_u *)"lcd", ex_cd, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x100|0x100000L)},

{(char_u *)"lchdir", ex_cd, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x100|0x100000L)},

{(char_u *)"lclose", ex_cclose, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"lcscope", ex_ni, (long_u)(0x004|0x800|0x008)},

{(char_u *)"left", ex_align, (long_u)(0x100|0x001|0x040|0x004|0x100000L|0x200000L)},

{(char_u *)"leftabove", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"let", ex_let, (long_u)(0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"lexpr", ex_cexpr, (long_u)(0x080|(0x004 | 0x010)|0x800|0x100|0x002)},

{(char_u *)"lfile", ex_cfile, (long_u)(0x100|((0x008 | 0x004) | 0x010)|0x002)},

{(char_u *)"lfirst", ex_cc, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"lgetfile", ex_cfile, (long_u)(0x100|((0x008 | 0x004) | 0x010))},

{(char_u *)"lgetbuffer", ex_cbuffer, (long_u)(0x001|0x4000|(0x004 | 0x010)|0x100)},

{(char_u *)"lgetexpr", ex_cexpr, (long_u)(0x080|(0x004 | 0x010)|0x800|0x100)},

{(char_u *)"lgrep", ex_make, (long_u)(0x001|0x4000|0x002|0x080|0x004|0x800|0x100|0x008)},

{(char_u *)"lgrepadd", ex_make, (long_u)(0x001|0x4000|0x002|0x080|0x004|0x800|0x100|0x008)},

{(char_u *)"lhelpgrep", ex_helpgrep, (long_u)(0x004|0x800|0x080)},

{(char_u *)"ll", ex_cc, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"llast", ex_cc, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"llist", qf_list, (long_u)(0x002|0x004|0x100|0x100000L)},

{(char_u *)"lmap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"lmapclear", ex_mapclear, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"lmake", ex_make, (long_u)(0x002|0x004|0x800|0x100|0x008)},

{(char_u *)"lnoremap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"lnext", ex_cnext, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"lnewer", qf_age, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"lnfile", ex_cnext, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"loadview", ex_loadview, (long_u)(((0x008 | 0x004) | 0x010)|0x100)},

{(char_u *)"loadkeymap", ex_ni, (long_u)(0x100000L)},

{(char_u *)"lockmarks", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"lockvar", ex_lockvar, (long_u)(0x002|0x004|0x080|0x80000L|0x100000L)},

{(char_u *)"lolder", qf_age, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"lopen", ex_copen, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"lprevious", ex_cnext, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"lpfile", ex_cnext, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"lrewind", ex_cc, (long_u)(0x001|0x4000|0x400|0x100|0x002)},

{(char_u *)"ltag", ex_tag, (long_u)(0x4000|0x100|0x002|(0x004 | 0x010))},

{(char_u *)"lua", ex_script_ni, (long_u)(0x001|0x004|0x080|0x100000L)},

{(char_u *)"luado", ex_ni, (long_u)(0x001|0x020|0x004|0x080|0x100000L)},

{(char_u *)"luafile", ex_ni, (long_u)(0x001|((0x008 | 0x004) | 0x010)|0x080|0x100000L)},

{(char_u *)"lunmap", ex_unmap, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"lvimgrep", ex_vimgrep, (long_u)(0x001|0x4000|0x002|0x080|0x004|0x800|0x100|0x008)},

{(char_u *)"lvimgrepadd", ex_vimgrep, (long_u)(0x001|0x4000|0x002|0x080|0x004|0x800|0x100|0x008)},

{(char_u *)"lwindow", ex_cwindow, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"ls", buflist_list, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"move", ex_copymove, (long_u)(0x001|0x040|0x004|0x100|0x100000L|0x200000L)},

{(char_u *)"mark", ex_mark, (long_u)(0x001|(0x004 | 0x010)|0x100|0x80000L|0x100000L)},

{(char_u *)"make", ex_make, (long_u)(0x002|0x004|0x800|0x100|0x008)},

{(char_u *)"map", ex_map, (long_u)(0x002|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"mapclear", ex_mapclear, (long_u)(0x004|0x002|0x100|0x100000L)},

{(char_u *)"marks", do_marks, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"match", ex_match, (long_u)(0x001|0x4000|0x004|0x100000L)},

{(char_u *)"menu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x002|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"menutranslate", ex_menutranslate, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"messages", ex_messages, (long_u)(0x100|0x100000L)},

{(char_u *)"mkexrc", ex_mkrc, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x100|0x100000L)},

{(char_u *)"mksession", ex_mkrc, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x100)},

{(char_u *)"mkspell", ex_mkspell, (long_u)(0x002|0x080|0x004|0x800|0x100|0x008)},

{(char_u *)"mkvimrc", ex_mkrc, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x100|0x100000L)},

{(char_u *)"mkview", ex_mkrc, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x100)},

{(char_u *)"mode", ex_mode, (long_u)((0x004 | 0x010)|0x100|0x100000L)},

{(char_u *)"mzscheme", ex_script_ni, (long_u)(0x001|0x004|0x020|0x080|0x100000L|0x80000L)},

{(char_u *)"mzfile", ex_ni, (long_u)(0x001|((0x008 | 0x004) | 0x010)|0x080|0x100000L)},

{(char_u *)"next", ex_next, (long_u)(0x001|0x4000|0x002|(0x008 | 0x004)|0x8000|0x40000L|0x100)},

{(char_u *)"nbkey", ex_nbkey, (long_u)(0x004|0x4000|0x080)},

{(char_u *)"nbclose", ex_nbclose, (long_u)(0x100|0x100000L)},

{(char_u *)"nbstart", ex_nbstart, (long_u)((0x004 | 0x010)|0x100|0x100000L)},

{(char_u *)"new", ex_splitview, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x001|0x4000|0x8000|0x40000L|0x100)},

{(char_u *)"nmap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"nmapclear", ex_mapclear, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"nmenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"nnoremap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"nnoremenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"noremap", ex_map, (long_u)(0x002|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"noautocmd", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"nohlsearch", ex_nohlsearch, (long_u)(0x100|0x80000L|0x100000L)},

{(char_u *)"noreabbrev", ex_abbreviate, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"noremenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x002|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"normal", ex_normal, (long_u)(0x001|0x002|0x004|0x080|0x800|0x2000|0x80000L|0x100000L)},

{(char_u *)"number", ex_print, (long_u)(0x001|0x040|0x400|0x400000L|0x100|0x100000L)},

{(char_u *)"nunmap", ex_unmap, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"nunmenu", ex_menu, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"open", ex_open, (long_u)(0x001|0x004)},

{(char_u *)"oldfiles", ex_oldfiles, (long_u)(0x002|0x100|0x80000L|0x100000L)},

{(char_u *)"omap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"omapclear", ex_mapclear, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"omenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"only", ex_only, (long_u)(0x002|0x100)},

{(char_u *)"onoremap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"onoremenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"options", ex_options, (long_u)(0x100)},

{(char_u *)"ounmap", ex_unmap, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"ounmenu", ex_menu, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"ownsyntax", ex_ownsyntax, (long_u)(0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"print", ex_print, (long_u)(0x001|0x040|0x400|0x400000L|0x100|0x100000L|0x80000L)},

{(char_u *)"pclose", ex_pclose, (long_u)(0x002|0x100)},

{(char_u *)"perl", ex_script_ni, (long_u)(0x001|0x004|0x020|0x080|0x80000L|0x100000L)},

{(char_u *)"perldo", ex_ni, (long_u)(0x001|0x004|0x020|0x080|0x100000L)},

{(char_u *)"pedit", ex_pedit, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x8000|0x40000L|0x100)},

{(char_u *)"pop", ex_tag, (long_u)(0x001|0x4000|0x002|0x400|0x100|0x1000)},

{(char_u *)"popup", ex_ni, (long_u)(0x080|0x004|0x002|0x100|0x800|0x100000L)},

{(char_u *)"ppop", ex_ptag, (long_u)(0x001|0x4000|0x002|0x400|0x100|0x1000)},

{(char_u *)"preserve", ex_preserve, (long_u)(0x100)},

{(char_u *)"previous", ex_previous, (long_u)(0x004|0x001|0x4000|0x400|0x002|0x8000|0x40000L|0x100)},

{(char_u *)"promptfind", ex_ni, (long_u)(0x004|0x800|0x100000L)},

{(char_u *)"promptrepl", ex_ni, (long_u)(0x004|0x800|0x100000L)},

{(char_u *)"profile", ex_ni, (long_u)(0x002|0x004|0x100|0x100000L)},

{(char_u *)"profdel", ex_breakdel, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"psearch", ex_psearch, (long_u)(0x002|0x001|0x040|0x020|0x004)},

{(char_u *)"ptag", ex_ptag, (long_u)(0x001|0x4000|0x002|(0x004 | 0x010)|0x100|0x1000)},

{(char_u *)"ptNext", ex_ptag, (long_u)(0x001|0x4000|0x002|0x100|0x1000)},

{(char_u *)"ptfirst", ex_ptag, (long_u)(0x001|0x4000|0x002|0x100|0x1000)},

{(char_u *)"ptjump", ex_ptag, (long_u)(0x002|0x100|(0x004 | 0x010))},

{(char_u *)"ptlast", ex_ptag, (long_u)(0x002|0x100)},

{(char_u *)"ptnext", ex_ptag, (long_u)(0x001|0x4000|0x002|0x100|0x1000)},

{(char_u *)"ptprevious", ex_ptag, (long_u)(0x001|0x4000|0x002|0x100|0x1000)},

{(char_u *)"ptrewind", ex_ptag, (long_u)(0x001|0x4000|0x002|0x100|0x1000)},

{(char_u *)"ptselect", ex_ptag, (long_u)(0x002|0x100|(0x004 | 0x010))},

{(char_u *)"put", ex_put, (long_u)(0x001|0x040|0x002|0x200|0x100|0x1000|0x100000L|0x200000L)},

{(char_u *)"pwd", ex_pwd, (long_u)(0x100|0x100000L)},

{(char_u *)"python", ex_script_ni, (long_u)(0x001|0x004|0x080|0x100000L)},

{(char_u *)"pyfile", ex_ni, (long_u)(0x001|((0x008 | 0x004) | 0x010)|0x080|0x100000L)},

{(char_u *)"py3", ex_script_ni, (long_u)(0x001|0x004|0x080|0x100000L)},

{(char_u *)"python3", ex_script_ni, (long_u)(0x001|0x004|0x080|0x100000L)},

{(char_u *)"py3file", ex_ni, (long_u)(0x001|((0x008 | 0x004) | 0x010)|0x080|0x100000L)},

{(char_u *)"quit", ex_quit, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"quitall", ex_quit_all, (long_u)(0x002|0x100)},

{(char_u *)"qall", ex_quit_all, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"read", ex_read, (long_u)(0x002|0x001|0x040|((0x008 | 0x004) | 0x010)|0x40000L|0x100|0x1000|0x100000L|0x200000L)},

{(char_u *)"recover", ex_recover, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x100)},

{(char_u *)"redo", ex_redo, (long_u)(0x100|0x100000L)},

{(char_u *)"redir", ex_redir, (long_u)(0x002|(0x008 | 0x004)|0x100|0x100000L)},

{(char_u *)"redraw", ex_redraw, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"redrawstatus", ex_redrawstatus, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"registers", ex_display, (long_u)(0x004|0x800|0x100|0x100000L)},

{(char_u *)"resize", ex_resize, (long_u)(0x001|0x4000|0x100|(0x004 | 0x010))},

{(char_u *)"retab", ex_retab, (long_u)(0x100|0x001|0x040|0x020|0x002|(0x004 | 0x010)|0x100000L|0x200000L)},

{(char_u *)"return", ex_return, (long_u)(0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"rewind", ex_rewind, (long_u)(0x004|0x002|0x8000|0x40000L|0x100)},

{(char_u *)"right", ex_align, (long_u)(0x100|0x001|0x040|0x004|0x100000L|0x200000L)},

{(char_u *)"rightbelow", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"runtime", ex_runtime, (long_u)(0x002|0x080|(0x008 | 0x004)|0x100|0x80000L|0x100000L)},

{(char_u *)"ruby", ex_script_ni, (long_u)(0x001|0x004|0x080|0x100000L)},

{(char_u *)"rubydo", ex_ni, (long_u)(0x001|0x020|0x004|0x080|0x100000L)},

{(char_u *)"rubyfile", ex_ni, (long_u)(0x001|((0x008 | 0x004) | 0x010)|0x080|0x100000L)},

{(char_u *)"rundo", ex_rundo, (long_u)(0x080|0x004|0x008)},

{(char_u *)"rviminfo", ex_viminfo, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x100|0x100000L)},

{(char_u *)"substitute", do_sub, (long_u)(0x001|0x040|0x004|0x100000L)},

{(char_u *)"sNext", ex_previous, (long_u)(0x004|0x001|0x4000|0x400|0x002|0x8000|0x40000L|0x100)},

{(char_u *)"sargument", ex_argument, (long_u)(0x002|0x001|0x4000|0x400|0x004|0x8000|0x40000L|0x100)},

{(char_u *)"sall", ex_all, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"sandbox", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"saveas", ex_write, (long_u)(0x002|0x020|((0x008 | 0x004) | 0x010)|0x40000L|0x100000L|0x100)},

{(char_u *)"sbuffer", ex_buffer, (long_u)(0x002|0x001|0x4000|0x10000L|0x20000L|0x400|0x004|0x100)},

{(char_u *)"sbNext", ex_bprevious, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"sball", ex_buffer_all, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"sbfirst", ex_brewind, (long_u)(0x100)},

{(char_u *)"sblast", ex_blast, (long_u)(0x100)},

{(char_u *)"sbmodified", ex_bmodified, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"sbnext", ex_bnext, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"sbprevious", ex_bprevious, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"sbrewind", ex_brewind, (long_u)(0x100)},

{(char_u *)"scriptnames", ex_scriptnames, (long_u)(0x100|0x100000L)},

{(char_u *)"scriptencoding", ex_scriptencoding, (long_u)((0x004 | 0x010)|0x100|0x100000L)},

{(char_u *)"scscope", ex_ni, (long_u)(0x004|0x800)},

{(char_u *)"set", ex_set, (long_u)(0x100|0x004|0x100000L|0x80000L)},

{(char_u *)"setfiletype", ex_setfiletype, (long_u)(0x100|0x004|0x080|0x100000L)},

{(char_u *)"setglobal", ex_set, (long_u)(0x100|0x004|0x100000L)},

{(char_u *)"setlocal", ex_set, (long_u)(0x100|0x004|0x100000L)},

{(char_u *)"sfind", ex_splitview, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x001|0x4000|0x8000|0x40000L|0x100)},

{(char_u *)"sfirst", ex_rewind, (long_u)(0x004|0x002|0x8000|0x40000L|0x100)},

{(char_u *)"shell", ex_shell, (long_u)(0x100|0x100000L)},

{(char_u *)"simalt", ex_ni, (long_u)(0x080|(0x004 | 0x010)|0x100|0x100000L)},

{(char_u *)"sign", ex_sign, (long_u)(0x080|0x001|0x4000|0x004|0x100000L)},

{(char_u *)"silent", ex_wrongmodifier, (long_u)(0x080|0x004|0x002|0x800|0x80000L|0x100000L)},

{(char_u *)"sleep", ex_sleep, (long_u)(0x001|0x4000|0x400|0x004|0x100|0x100000L)},

{(char_u *)"slast", ex_last, (long_u)(0x004|0x002|0x8000|0x40000L|0x100)},

{(char_u *)"smagic", ex_submagic, (long_u)(0x001|0x040|0x004|0x100000L)},

{(char_u *)"smap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"smapclear", ex_mapclear, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"smenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"snext", ex_next, (long_u)(0x001|0x4000|0x002|(0x008 | 0x004)|0x8000|0x40000L|0x100)},

{(char_u *)"sniff", ex_ni, (long_u)(0x004|0x100)},

{(char_u *)"snomagic", ex_submagic, (long_u)(0x001|0x040|0x004|0x100000L)},

{(char_u *)"snoremap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"snoremenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"source", ex_source, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x100|0x80000L|0x100000L)},

{(char_u *)"sort", ex_sort, (long_u)(0x001|0x020|0x040|0x002|0x004|0x800|0x200000L)},

{(char_u *)"split", ex_splitview, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x001|0x4000|0x8000|0x40000L|0x100)},

{(char_u *)"spellgood", ex_spell, (long_u)(0x002|0x001|0x4000|0x080|0x004|0x100)},

{(char_u *)"spelldump", ex_spelldump, (long_u)(0x002|0x100)},

{(char_u *)"spellinfo", ex_spellinfo, (long_u)(0x100)},

{(char_u *)"spellrepall", ex_spellrepall, (long_u)(0x100)},

{(char_u *)"spellundo", ex_spell, (long_u)(0x002|0x001|0x4000|0x080|0x004|0x100)},

{(char_u *)"spellwrong", ex_spell, (long_u)(0x002|0x001|0x4000|0x080|0x004|0x100)},

{(char_u *)"sprevious", ex_previous, (long_u)(0x004|0x001|0x4000|0x400|0x002|0x8000|0x40000L|0x100)},

{(char_u *)"srewind", ex_rewind, (long_u)(0x004|0x002|0x8000|0x40000L|0x100)},

{(char_u *)"stop", ex_stop, (long_u)(0x100|0x002|0x100000L)},

{(char_u *)"stag", ex_stag, (long_u)(0x001|0x4000|0x002|(0x004 | 0x010)|0x100|0x1000)},

{(char_u *)"startinsert", ex_startinsert, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"startgreplace", ex_startinsert, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"startreplace", ex_startinsert, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"stopinsert", ex_stopinsert, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"stjump", ex_stag, (long_u)(0x002|0x100|(0x004 | 0x010))},

{(char_u *)"stselect", ex_stag, (long_u)(0x002|0x100|(0x004 | 0x010))},

{(char_u *)"sunhide", ex_buffer_all, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"sunmap", ex_unmap, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"sunmenu", ex_menu, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"suspend", ex_stop, (long_u)(0x100|0x002|0x100000L)},

{(char_u *)"sview", ex_splitview, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x001|0x4000|0x8000|0x40000L|0x100)},

{(char_u *)"swapname", ex_swapname, (long_u)(0x100|0x100000L)},

{(char_u *)"syntax", ex_syntax, (long_u)(0x004|0x800|0x100000L)},

{(char_u *)"syncbind", ex_syncbind, (long_u)(0x100)},

{(char_u *)"t", ex_copymove, (long_u)(0x001|0x040|0x004|0x100|0x100000L|0x200000L)},

{(char_u *)"tNext", ex_tag, (long_u)(0x001|0x4000|0x002|0x100|0x1000)},

{(char_u *)"tag", ex_tag, (long_u)(0x001|0x4000|0x002|(0x004 | 0x010)|0x100|0x1000)},

{(char_u *)"tags", do_tags, (long_u)(0x100|0x100000L)},

{(char_u *)"tab", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"tabclose", ex_tabclose, (long_u)(0x001|0x4000|0x400|0x002|0x100|0x100000L)},

{(char_u *)"tabdo", ex_listdo, (long_u)(0x080|0x004|0x800)},

{(char_u *)"tabedit", ex_splitview, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x001|0x4000|0x1000|0x8000|0x40000L|0x100)},

{(char_u *)"tabfind", ex_splitview, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x001|0x4000|0x1000|0x8000|0x40000L|0x080|0x100)},

{(char_u *)"tabfirst", ex_tabnext, (long_u)(0x100)},

{(char_u *)"tabmove", ex_tabmove, (long_u)(0x001|0x4000|0x1000|0x400|0x100|0x1000)},

{(char_u *)"tablast", ex_tabnext, (long_u)(0x100)},

{(char_u *)"tabnext", ex_tabnext, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"tabnew", ex_splitview, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x001|0x4000|0x1000|0x8000|0x40000L|0x100)},

{(char_u *)"tabonly", ex_tabonly, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"tabprevious", ex_tabnext, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"tabNext", ex_tabnext, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"tabrewind", ex_tabnext, (long_u)(0x100)},

{(char_u *)"tabs", ex_tabs, (long_u)(0x100|0x100000L)},

{(char_u *)"tcl", ex_script_ni, (long_u)(0x001|0x004|0x080|0x100000L)},

{(char_u *)"tcldo", ex_ni, (long_u)(0x001|0x020|0x004|0x080|0x100000L)},

{(char_u *)"tclfile", ex_ni, (long_u)(0x001|((0x008 | 0x004) | 0x010)|0x080|0x100000L)},

{(char_u *)"tearoff", ex_ni, (long_u)(0x080|0x004|0x100|0x800|0x100000L)},

{(char_u *)"tfirst", ex_tag, (long_u)(0x001|0x4000|0x002|0x100|0x1000)},

{(char_u *)"throw", ex_throw, (long_u)(0x004|0x080|0x80000L|0x100000L)},

{(char_u *)"tjump", ex_tag, (long_u)(0x002|0x100|(0x004 | 0x010))},

{(char_u *)"tlast", ex_tag, (long_u)(0x002|0x100)},

{(char_u *)"tmenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"tnext", ex_tag, (long_u)(0x001|0x4000|0x002|0x100|0x1000)},

{(char_u *)"topleft", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"tprevious", ex_tag, (long_u)(0x001|0x4000|0x002|0x100|0x1000)},

{(char_u *)"trewind", ex_tag, (long_u)(0x001|0x4000|0x002|0x100|0x1000)},

{(char_u *)"try", ex_try, (long_u)(0x100|0x80000L|0x100000L)},

{(char_u *)"tselect", ex_tag, (long_u)(0x002|0x100|(0x004 | 0x010))},

{(char_u *)"tunmenu", ex_menu, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"undo", ex_undo, (long_u)(0x001|0x4000|0x400|0x1000|0x100|0x100000L)},

{(char_u *)"undojoin", ex_undojoin, (long_u)(0x100|0x100000L)},

{(char_u *)"undolist", ex_undolist, (long_u)(0x100|0x100000L)},

{(char_u *)"unabbreviate", ex_abbreviate, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"unhide", ex_buffer_all, (long_u)(0x001|0x4000|0x400|0x100)},

{(char_u *)"unlet", ex_unlet, (long_u)(0x002|0x004|0x080|0x80000L|0x100000L)},

{(char_u *)"unlockvar", ex_lockvar, (long_u)(0x002|0x004|0x080|0x80000L|0x100000L)},

{(char_u *)"unmap", ex_unmap, (long_u)(0x002|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"unmenu", ex_menu, (long_u)(0x002|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"unsilent", ex_wrongmodifier, (long_u)(0x080|0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"update", ex_update, (long_u)(0x001|0x040|0x002|((0x008 | 0x004) | 0x010)|0x40000L|0x020|0x100)},

{(char_u *)"vglobal", ex_global, (long_u)(0x001|0x040|0x004|0x020|0x100000L)},

{(char_u *)"version", ex_version, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"verbose", ex_wrongmodifier, (long_u)(0x080|0x001|0x4000|0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"vertical", ex_wrongmodifier, (long_u)(0x080|0x004|0x800)},

{(char_u *)"visual", ex_edit, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x8000|0x40000L|0x100)},

{(char_u *)"view", ex_edit, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x8000|0x40000L|0x100)},

{(char_u *)"vimgrep", ex_vimgrep, (long_u)(0x001|0x4000|0x002|0x080|0x004|0x800|0x100|0x008)},

{(char_u *)"vimgrepadd", ex_vimgrep, (long_u)(0x001|0x4000|0x002|0x080|0x004|0x800|0x100|0x008)},

{(char_u *)"viusage", ex_viusage, (long_u)(0x100)},

{(char_u *)"vmap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"vmapclear", ex_mapclear, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"vmenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"vnoremap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"vnew", ex_splitview, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x001|0x4000|0x8000|0x40000L|0x100)},

{(char_u *)"vnoremenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"vsplit", ex_splitview, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x001|0x4000|0x8000|0x40000L|0x100)},

{(char_u *)"vunmap", ex_unmap, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"vunmenu", ex_menu, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"write", ex_write, (long_u)(0x001|0x040|0x002|((0x008 | 0x004) | 0x010)|0x40000L|0x020|0x100|0x100000L)},

{(char_u *)"wNext", ex_wnext, (long_u)(0x001|0x040|0x4000|0x002|((0x008 | 0x004) | 0x010)|0x40000L|0x100)},

{(char_u *)"wall", do_wqall, (long_u)(0x002|0x100|0x100000L)},

{(char_u *)"while", ex_while, (long_u)(0x004|0x800|0x80000L|0x100000L)},

{(char_u *)"winsize", ex_winsize, (long_u)(0x004|0x080|0x100)},

{(char_u *)"wincmd", ex_wincmd, (long_u)(0x080|(0x004 | 0x010)|0x001|0x4000)},

{(char_u *)"windo", ex_listdo, (long_u)(0x002|0x080|0x004|0x800)},

{(char_u *)"winpos", ex_winpos, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"wnext", ex_wnext, (long_u)(0x001|0x4000|0x002|((0x008 | 0x004) | 0x010)|0x40000L|0x100)},

{(char_u *)"wprevious", ex_wnext, (long_u)(0x001|0x4000|0x002|((0x008 | 0x004) | 0x010)|0x40000L|0x100)},

{(char_u *)"wq", ex_exit, (long_u)(0x001|0x040|0x002|((0x008 | 0x004) | 0x010)|0x40000L|0x020|0x100)},

{(char_u *)"wqall", do_wqall, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x40000L|0x020|0x100)},

{(char_u *)"wsverb", ex_ni, (long_u)(0x004|0x4000|0x080)},

{(char_u *)"wundo", ex_wundo, (long_u)(0x002|0x080|0x004|0x008)},

{(char_u *)"wviminfo", ex_viminfo, (long_u)(0x002|((0x008 | 0x004) | 0x010)|0x100|0x100000L)},

{(char_u *)"xit", ex_exit, (long_u)(0x001|0x040|0x002|((0x008 | 0x004) | 0x010)|0x40000L|0x020|0x100|0x100000L)},

{(char_u *)"xall", do_wqall, (long_u)(0x002|0x100)},

{(char_u *)"xmap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"xmapclear", ex_mapclear, (long_u)(0x004|0x100|0x100000L)},

{(char_u *)"xmenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"xnoremap", ex_map, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"xnoremenu", ex_menu, (long_u)(0x001|0x4000|0x1000|0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"xunmap", ex_unmap, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"xunmenu", ex_menu, (long_u)(0x004|0x100|0x800|0x2000|0x100000L)},

{(char_u *)"yank", ex_operators, (long_u)(0x001|0x040|0x200|0x400|0x100|0x100000L)},

{(char_u *)"z", ex_z, (long_u)(0x001|0x040|0x004|0x400000L|0x100|0x100000L)},



{(char_u *)"!", ex_bang, (long_u)(0x001|0x040|0x002|(0x008 | 0x004)|0x100000L)},

{(char_u *)"#", ex_print, (long_u)(0x001|0x040|0x400|0x400000L|0x100|0x100000L)},

{(char_u *)"&", do_sub, (long_u)(0x001|0x040|0x004|0x100000L|0x200000L)},

{(char_u *)"*", ex_at, (long_u)(0x001|0x040|0x004|0x100|0x100000L)},

{(char_u *)"<", ex_operators, (long_u)(0x001|0x040|0x400|0x400000L|0x100|0x100000L|0x200000L)},

{(char_u *)"=", ex_equal, (long_u)(0x001|0x100|0x020|0x400000L|0x100000L)},

{(char_u *)">", ex_operators, (long_u)(0x001|0x040|0x400|0x400000L|0x100|0x100000L|0x200000L)},

{(char_u *)"@", ex_at, (long_u)(0x001|0x040|0x004|0x100|0x100000L)},

{(char_u *)"Next", ex_previous, (long_u)(0x004|0x001|0x4000|0x400|0x002|0x8000|0x40000L|0x100)},

{(char_u *)"Print", ex_print, (long_u)(0x001|0x040|0x400|0x400000L|0x100|0x100000L)},

{(char_u *)"X", ex_X, (long_u)(0x100)},

{(char_u *)"~", do_sub, (long_u)(0x001|0x040|0x004|0x100000L|0x200000L)},
# 1142 "ex_cmds.h"
};
# 494 "ex_docmd.c" 2




static cmdidx_T cmdidxs[27] =
{
 CMD_append,
 CMD_buffer,
 CMD_change,
 CMD_delete,
 CMD_edit,
 CMD_file,
 CMD_global,
 CMD_help,
 CMD_insert,
 CMD_join,
 CMD_k,
 CMD_list,
 CMD_move,
 CMD_next,
 CMD_open,
 CMD_print,
 CMD_quit,
 CMD_read,
 CMD_substitute,
 CMD_t,
 CMD_undo,
 CMD_vglobal,
 CMD_write,
 CMD_xit,
 CMD_yank,
 CMD_z,
 CMD_bang
};

static char_u dollar_command[2] = {'$', 0};




typedef struct
{
    char_u *line;
    linenr_T lnum;
} wcmd_T;






struct loop_cookie
{
    garray_T *lines_gap;
    int current_line;
    int repeating;

    char_u *(*getline) (int, void *, int);
    void *cookie;
};

static char_u *get_loop_line (int c, void *cookie, int indent);
static int store_loop_line (garray_T *gap, char_u *line);
static void free_cmdlines (garray_T *gap);


struct dbg_stuff
{
    int trylevel;
    int force_abort;
    except_T *caught_stack;
    char_u *vv_exception;
    char_u *vv_throwpoint;
    int did_emsg;
    int got_int;
    int did_throw;
    int need_rethrow;
    int check_cstack;
    except_T *current_exception;
};

static void save_dbg_stuff (struct dbg_stuff *dsp);
static void restore_dbg_stuff (struct dbg_stuff *dsp);

    static void
save_dbg_stuff(dsp)
    struct dbg_stuff *dsp;
{
    dsp->trylevel = trylevel; trylevel = 0;
    dsp->force_abort = force_abort; force_abort = 0;
    dsp->caught_stack = caught_stack; caught_stack = ((void *)0);
    dsp->vv_exception = v_exception(((void *)0));
    dsp->vv_throwpoint = v_throwpoint(((void *)0));


    dsp->did_emsg = did_emsg; did_emsg = 0;
    dsp->got_int = got_int; got_int = 0;
    dsp->did_throw = did_throw; did_throw = 0;
    dsp->need_rethrow = need_rethrow; need_rethrow = 0;
    dsp->check_cstack = check_cstack; check_cstack = 0;
    dsp->current_exception = current_exception; current_exception = ((void *)0);
}

    static void
restore_dbg_stuff(dsp)
    struct dbg_stuff *dsp;
{
    suppress_errthrow = 0;
    trylevel = dsp->trylevel;
    force_abort = dsp->force_abort;
    caught_stack = dsp->caught_stack;
    (void)v_exception(dsp->vv_exception);
    (void)v_throwpoint(dsp->vv_throwpoint);
    did_emsg = dsp->did_emsg;
    got_int = dsp->got_int;
    did_throw = dsp->did_throw;
    need_rethrow = dsp->need_rethrow;
    check_cstack = dsp->check_cstack;
    current_exception = dsp->current_exception;
}







    void
do_exmode(improved)
    int improved;
{
    int save_msg_scroll;
    int prev_msg_row;
    linenr_T prev_line;
    int changedtick;

    if (improved)
 exmode_active = 2;
    else
 exmode_active = 1;
    State = 0x01;



    if (global_busy)
 return;

    save_msg_scroll = msg_scroll;
    ++RedrawingDisabled;
    ++no_wait_return;
# 652 "ex_docmd.c"
    msg((char_u *)(((char *)("Entering Ex mode.  Type \"visual\" to go to Normal mode."))));
    while (exmode_active)
    {


 if (ex_normal_busy > 0 && typebuf.tb_len == 0)
 {
     exmode_active = 0;
     break;
 }

 msg_scroll = 1;
 need_wait_return = 0;
 ex_pressedreturn = 0;
 ex_no_reprint = 0;
 changedtick = curbuf->b_changedtick;
 prev_msg_row = msg_row;
 prev_line = curwin->w_cursor.lnum;



 if (improved)
 {
     cmdline_row = msg_row;
     do_cmdline(((void *)0), getexline, ((void *)0), 0);
 }
 else
     do_cmdline(((void *)0), getexmodeline, ((void *)0), 0x02);
 lines_left = Rows - 1;

 if ((prev_line != curwin->w_cursor.lnum
      || changedtick != curbuf->b_changedtick) && !ex_no_reprint)
 {
     if (curbuf->b_ml.ml_flags & 1)
  emsg((char_u *)(((char *)(e_emptybuf))));
     else
     {
  if (ex_pressedreturn)
  {


      msg_row = prev_msg_row;
      if (prev_msg_row == Rows - 1)
   msg_row--;
  }
  msg_col = 0;
  print_line_no_prefix(curwin->w_cursor.lnum, 0, 0);
  msg_clr_eos();
     }
 }
 else if (ex_pressedreturn && !ex_no_reprint)
 {
     if (curbuf->b_ml.ml_flags & 1)
  emsg((char_u *)(((char *)(e_emptybuf))));
     else
  emsg((char_u *)(((char *)("E501: At end-of-file"))));
 }
    }




    --RedrawingDisabled;
    --no_wait_return;
    update_screen(50);
    need_wait_return = 0;
    msg_scroll = save_msg_scroll;
}




    int
do_cmdline_cmd(cmd)
    char_u *cmd;
{
    return do_cmdline(cmd, ((void *)0), ((void *)0),
       0x01|0x02|0x08);
}
# 751 "ex_docmd.c"
    int
do_cmdline(cmdline, getline, cookie, flags)
    char_u *cmdline;
    char_u *(*getline) (int, void *, int);
    void *cookie;
    int flags;
{
    char_u *next_cmdline;
    char_u *cmdline_copy = ((void *)0);
    int used_getline = 0;
    static int recursive = 0;
    int msg_didout_before_start = 0;
    int count = 0;
    int did_inc = 0;
    int retval = 1;

    struct condstack cstack;
    garray_T lines_ga;
    int current_line = 0;
    char_u *fname = ((void *)0);
    linenr_T *breakpoint = ((void *)0);
    int *dbg_tick = ((void *)0);
    struct dbg_stuff debug_saved;
    int initial_trylevel;
    struct msglist **saved_msg_list = ((void *)0);
    struct msglist *private_msg_list;


    char_u *(*cmd_getline) (int, void *, int);
    void *cmd_cookie;
    struct loop_cookie cmd_loop_cookie;
    void *real_cookie;
    int getline_is_func;




    static int call_depth = 0;
# 797 "ex_docmd.c"
    saved_msg_list = msg_list;
    msg_list = &private_msg_list;
    private_msg_list = ((void *)0);




    if (call_depth == 200)
    {
 emsg((char_u *)(((char *)("E169: Command too recursive"))));



 do_errthrow((struct condstack *)((void *)0), (char_u *)((void *)0));
 msg_list = saved_msg_list;

 return 0;
    }
    ++call_depth;


    cstack.cs_idx = -1;
    cstack.cs_looplevel = 0;
    cstack.cs_trylevel = 0;
    cstack.cs_emsg_silent_list = ((void *)0);
    cstack.cs_lflags = 0;
    ga_init2(&lines_ga, (int)sizeof(wcmd_T), 10);

    real_cookie = getline_cookie(getline, cookie);


    getline_is_func = getline_equal(getline, cookie, get_func_line);
    if (getline_is_func && ex_nesting_level == func_level(real_cookie))
 ++ex_nesting_level;



    if (getline_is_func)
    {
 fname = func_name(real_cookie);
 breakpoint = func_breakpoint(real_cookie);
 dbg_tick = func_dbg_tick(real_cookie);
    }
    else if (getline_equal(getline, cookie, getsourceline))
    {
 fname = sourcing_name;
 breakpoint = source_breakpoint(real_cookie);
 dbg_tick = source_dbg_tick(real_cookie);
    }




    if (!recursive)
    {
 force_abort = 0;
 suppress_errthrow = 0;
    }






    if (flags & 0x10)
 save_dbg_stuff(&debug_saved);
    else
 ((__builtin_object_size ((&debug_saved), 0) != (size_t) -1) ? __builtin___memset_chk ((&debug_saved), (0), (1), __builtin_object_size ((&debug_saved), 0)) : __inline_memset_chk ((&debug_saved), (0), (1)));

    initial_trylevel = trylevel;




    did_throw = 0;






    did_emsg = 0;





    if (!(flags & 0x08) && !getline_equal(getline, cookie, getexline))
 KeyTyped = 0;







    next_cmdline = cmdline;
    do
    {

 getline_is_func = getline_equal(getline, cookie, get_func_line);



 if (next_cmdline == ((void *)0)

  && !force_abort
  && cstack.cs_idx < 0
  && !(getline_is_func && func_has_abort(real_cookie))

       )
     did_emsg = 0;
# 918 "ex_docmd.c"
 if (cstack.cs_looplevel > 0 && current_line < lines_ga.ga_len)
 {


     vim_free(cmdline_copy);
     cmdline_copy = ((void *)0);



     if (getline_is_func)
     {




  if (func_has_ended(real_cookie))
  {
      retval = 0;
      break;
  }
     }







     if (source_finished(getline, cookie))
     {
  retval = 0;
  break;
     }


     if (breakpoint != ((void *)0) && dbg_tick != ((void *)0)
         && *dbg_tick != debug_tick)
     {
  *breakpoint = dbg_find_breakpoint(
    getline_equal(getline, cookie, getsourceline),
       fname, sourcing_lnum);
  *dbg_tick = debug_tick;
     }

     next_cmdline = ((wcmd_T *)(lines_ga.ga_data))[current_line].line;
     sourcing_lnum = ((wcmd_T *)(lines_ga.ga_data))[current_line].lnum;


     if (breakpoint != ((void *)0) && *breakpoint != 0
           && *breakpoint <= sourcing_lnum)
     {
  dbg_breakpoint(fname, sourcing_lnum);

  *breakpoint = dbg_find_breakpoint(
    getline_equal(getline, cookie, getsourceline),
       fname, sourcing_lnum);
  *dbg_tick = debug_tick;
     }
# 985 "ex_docmd.c"
 }

 if (cstack.cs_looplevel > 0)
 {





     cmd_getline = get_loop_line;
     cmd_cookie = (void *)&cmd_loop_cookie;
     cmd_loop_cookie.lines_gap = &lines_ga;
     cmd_loop_cookie.current_line = current_line;
     cmd_loop_cookie.getline = getline;
     cmd_loop_cookie.cookie = cookie;
     cmd_loop_cookie.repeating = (current_line < lines_ga.ga_len);
 }
 else
 {
     cmd_getline = getline;
     cmd_cookie = cookie;
 }



 if (next_cmdline == ((void *)0))
 {




     if (count == 1 && getline_equal(getline, cookie, getexline))
  msg_didout = 1;
     if (getline == ((void *)0) || (next_cmdline = getline(':', cookie,

      cstack.cs_idx < 0 ? 0 : (cstack.cs_idx + 1) * 2



       )) == ((void *)0))
     {



  if (KeyTyped && !(flags & 0x04))
      need_wait_return = 0;
  retval = 0;
  break;
     }
     used_getline = 1;




     if (flags & 0x20)
     {
  vim_free(repeat_cmdline);
  if (count == 0)
      repeat_cmdline = vim_strsave(next_cmdline);
  else
      repeat_cmdline = ((void *)0);
     }
 }


 else if (cmdline_copy == ((void *)0))
 {
     next_cmdline = vim_strsave(next_cmdline);
     if (next_cmdline == ((void *)0))
     {
  emsg((char_u *)(((char *)(e_outofmem))));
  retval = 0;
  break;
     }
 }
 cmdline_copy = next_cmdline;
# 1070 "ex_docmd.c"
 if (current_line == lines_ga.ga_len
  && (cstack.cs_looplevel || has_loop_cmd(next_cmdline)))
 {
     if (store_loop_line(&lines_ga, next_cmdline) == 0)
     {
  retval = 0;
  break;
     }
 }
 did_endif = 0;


 if (count++ == 0)
 {






     if (!(flags & 0x02) && !recursive)
     {
  msg_didout_before_start = msg_didout;
  msg_didany = 0;
  msg_start();
  msg_scroll = 1;
  ++no_wait_return;
  ++RedrawingDisabled;
  did_inc = 1;
     }
 }

 if (p_verbose >= 15 && sourcing_name != ((void *)0))
 {
     ++no_wait_return;
     verbose_enter_scroll();

     smsg((char_u *)((char *)("line %ld: %s")),
        (long)sourcing_lnum, cmdline_copy);
     if (msg_silent == 0)
  msg_puts((char_u *)"\n");

     verbose_leave_scroll();
     --no_wait_return;
 }






 ++recursive;
 next_cmdline = do_one_cmd(&cmdline_copy, flags & 0x01,

    &cstack,

    cmd_getline, cmd_cookie);
 --recursive;


 if (cmd_cookie == (void *)&cmd_loop_cookie)


     current_line = cmd_loop_cookie.current_line;


 if (next_cmdline == ((void *)0))
 {
     vim_free(cmdline_copy);
     cmdline_copy = ((void *)0);





     if (getline_equal(getline, cookie, getexline)
        && new_last_cmdline != ((void *)0))
     {
  vim_free(last_cmdline);
  last_cmdline = new_last_cmdline;
  new_last_cmdline = ((void *)0);
     }

 }
 else
 {


     ((__builtin_object_size ((char *)((cmdline_copy)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((cmdline_copy)), (char *)((next_cmdline)), strlen((char *)(next_cmdline)) + 1, __builtin_object_size ((char *)((cmdline_copy)), 0)) : __inline_memmove_chk ((char *)((cmdline_copy)), (char *)((next_cmdline)), strlen((char *)(next_cmdline)) + 1));
     next_cmdline = cmdline_copy;
 }




 if (did_emsg && !force_abort
  && getline_equal(getline, cookie, get_func_line)
           && !func_has_abort(real_cookie))
     did_emsg = 0;

 if (cstack.cs_looplevel > 0)
 {
     ++current_line;







     if (cstack.cs_lflags & (4 | 2))
     {
  cstack.cs_lflags &= ~(4 | 2);





  if (!did_emsg && !got_int && !did_throw
   && cstack.cs_idx >= 0
   && (cstack.cs_flags[cstack.cs_idx]
            & (0x0008 | 0x0010))
   && cstack.cs_line[cstack.cs_idx] >= 0
   && (cstack.cs_flags[cstack.cs_idx] & 0x0002))
  {
      current_line = cstack.cs_line[cstack.cs_idx];

      cstack.cs_lflags |= 1;
      line_breakcheck();



      if (breakpoint != ((void *)0))
      {
   *breakpoint = dbg_find_breakpoint(
    getline_equal(getline, cookie, getsourceline),
         fname,
      ((wcmd_T *)lines_ga.ga_data)[current_line].lnum-1);
   *dbg_tick = debug_tick;
      }
  }
  else
  {

      if (cstack.cs_idx >= 0)
   rewind_conditionals(&cstack, cstack.cs_idx - 1,
       0x0008 | 0x0010, &cstack.cs_looplevel);
  }
     }




     else if (cstack.cs_lflags & 1)
     {
  cstack.cs_lflags &= ~1;
  cstack.cs_line[cstack.cs_idx] = current_line - 1;
     }
 }




 if (cstack.cs_looplevel == 0)
 {
     if (lines_ga.ga_len > 0)
     {
  sourcing_lnum =
         ((wcmd_T *)lines_ga.ga_data)[lines_ga.ga_len - 1].lnum;
  free_cmdlines(&lines_ga);
     }
     current_line = 0;
 }
# 1251 "ex_docmd.c"
 if (cstack.cs_lflags & 8)
 {
     cstack.cs_lflags &= ~8;
     report_make_pending(cstack.cs_pending[cstack.cs_idx]
      & (1 | 2 | 4),
      did_throw ? (void *)current_exception : ((void *)0));
     did_emsg = got_int = did_throw = 0;
     cstack.cs_flags[cstack.cs_idx] |= 0x0002 | 0x0200;
 }



 trylevel = initial_trylevel + cstack.cs_trylevel;
# 1272 "ex_docmd.c"
 if (trylevel == 0 && !did_emsg && !got_int && !did_throw)
     force_abort = 0;


 (void)do_intthrow(&cstack);


    }
# 1289 "ex_docmd.c"
    while (!((got_int

      || (did_emsg && force_abort) || did_throw

      )

  && cstack.cs_trylevel == 0

     )
     && !(did_emsg && used_getline
     && (getline_equal(getline, cookie, getexmodeline)
    || getline_equal(getline, cookie, getexline)))
     && (next_cmdline != ((void *)0)

   || cstack.cs_idx >= 0

   || (flags & 0x04)));

    vim_free(cmdline_copy);

    free_cmdlines(&lines_ga);
    ga_clear(&lines_ga);

    if (cstack.cs_idx >= 0)
    {




 if (!got_int && !did_throw
  && ((getline_equal(getline, cookie, getsourceline)
   && !source_finished(getline, cookie))
      || (getline_equal(getline, cookie, get_func_line)
         && !func_has_ended(real_cookie))))
 {
     if (cstack.cs_flags[cstack.cs_idx] & 0x0100)
  emsg((char_u *)(((char *)(e_endtry))));
     else if (cstack.cs_flags[cstack.cs_idx] & 0x0008)
  emsg((char_u *)(((char *)(e_endwhile))));
     else if (cstack.cs_flags[cstack.cs_idx] & 0x0010)
  emsg((char_u *)(((char *)(e_endfor))));
     else
  emsg((char_u *)(((char *)(e_endif))));
 }
# 1341 "ex_docmd.c"
 do
 {
     int idx = cleanup_conditionals(&cstack, 0, 1);

     if (idx >= 0)
  --idx;
     rewind_conditionals(&cstack, idx, 0x0008 | 0x0010,
       &cstack.cs_looplevel);
 }
 while (cstack.cs_idx >= 0);
 trylevel = initial_trylevel;
    }




    do_errthrow(&cstack, getline_equal(getline, cookie, get_func_line)
      ? (char_u *)"endfunction" : (char_u *)((void *)0));

    if (trylevel == 0)
    {






 if (did_throw)
 {
     void *p = ((void *)0);
     char_u *saved_sourcing_name;
     int saved_sourcing_lnum;
     struct msglist *messages = ((void *)0), *next;







     switch (current_exception->type)
     {
  case 0:
      vim_snprintf((char *)IObuff, (1024+1),
       ((char *)("E605: Exception not caught: %s")),
       current_exception->value);
      p = vim_strsave(IObuff);
      break;
  case 1:
      messages = current_exception->messages;
      current_exception->messages = ((void *)0);
      break;
  case 2:
      break;
  default:
      p = vim_strsave((char_u *)((char *)(e_internal)));
     }

     saved_sourcing_name = sourcing_name;
     saved_sourcing_lnum = sourcing_lnum;
     sourcing_name = current_exception->throw_name;
     sourcing_lnum = current_exception->throw_lnum;
     current_exception->throw_name = ((void *)0);

     discard_current_exception();
     suppress_errthrow = 1;
     force_abort = 1;

     if (messages != ((void *)0))
     {
  do
  {
      next = messages->next;
      emsg(messages->msg);
      vim_free(messages->msg);
      vim_free(messages);
      messages = next;
  }
  while (messages != ((void *)0));
     }
     else if (p != ((void *)0))
     {
  emsg(p);
  vim_free(p);
     }
     vim_free(sourcing_name);
     sourcing_name = saved_sourcing_name;
     sourcing_lnum = saved_sourcing_lnum;
 }
# 1438 "ex_docmd.c"
 else if (got_int || (did_emsg && force_abort))
     suppress_errthrow = 1;
    }
# 1450 "ex_docmd.c"
    if (did_throw)
 need_rethrow = 1;
    if ((getline_equal(getline, cookie, getsourceline)
  && ex_nesting_level > source_level(real_cookie))
     || (getline_equal(getline, cookie, get_func_line)
  && ex_nesting_level > func_level(real_cookie) + 1))
    {
 if (!did_throw)
     check_cstack = 1;
    }
    else
    {

 if (getline_equal(getline, cookie, get_func_line))
     --ex_nesting_level;




 if ((getline_equal(getline, cookie, getsourceline)
      || getline_equal(getline, cookie, get_func_line))
  && ex_nesting_level + 1 <= debug_break_level)
     do_debug(getline_equal(getline, cookie, getsourceline)
      ? (char_u *)((char *)("End of sourced file"))
      : (char_u *)((char *)("End of function")));
    }





    if (flags & 0x10)
 restore_dbg_stuff(&debug_saved);

    msg_list = saved_msg_list;







    if (did_inc)
    {
 --RedrawingDisabled;
 --no_wait_return;
 msg_scroll = 0;





 if (retval == 0

  || (did_endif && KeyTyped && !did_emsg)

         )
 {
     need_wait_return = 0;
     msg_didany = 0;
 }
 else if (need_wait_return)
 {





     msg_didout |= msg_didout_before_start;
     wait_return(0);
 }
    }
# 1531 "ex_docmd.c"
    --call_depth;
    return retval;
}





    static char_u *
get_loop_line(c, cookie, indent)
    int c;
    void *cookie;
    int indent;
{
    struct loop_cookie *cp = (struct loop_cookie *)cookie;
    wcmd_T *wp;
    char_u *line;

    if (cp->current_line + 1 >= cp->lines_gap->ga_len)
    {
 if (cp->repeating)
     return ((void *)0);


 if (cp->getline == ((void *)0))
     line = getcmdline(c, 0L, indent);
 else
     line = cp->getline(c, cp->cookie, indent);
 if (line != ((void *)0) && store_loop_line(cp->lines_gap, line) == 1)
     ++cp->current_line;

 return line;
    }

    KeyTyped = 0;
    ++cp->current_line;
    wp = (wcmd_T *)(cp->lines_gap->ga_data) + cp->current_line;
    sourcing_lnum = wp->lnum;
    return vim_strsave(wp->line);
}




    static int
store_loop_line(gap, line)
    garray_T *gap;
    char_u *line;
{
    if (ga_grow(gap, 1) == 0)
 return 0;
    ((wcmd_T *)(gap->ga_data))[gap->ga_len].line = vim_strsave(line);
    ((wcmd_T *)(gap->ga_data))[gap->ga_len].lnum = sourcing_lnum;
    ++gap->ga_len;
    return 1;
}




    static void
free_cmdlines(gap)
    garray_T *gap;
{
    while (gap->ga_len > 0)
    {
 vim_free(((wcmd_T *)(gap->ga_data))[gap->ga_len - 1].line);
 --gap->ga_len;
    }
}






    int
getline_equal(fgetline, cookie, func)
    char_u *(*fgetline) (int, void *, int);
    void *cookie __attribute__((unused));
    char_u *(*func) (int, void *, int);
{

    char_u *(*gp) (int, void *, int);
    struct loop_cookie *cp;




    gp = fgetline;
    cp = (struct loop_cookie *)cookie;
    while (gp == get_loop_line)
    {
 gp = cp->getline;
 cp = cp->cookie;
    }
    return gp == func;



}






    void *
getline_cookie(fgetline, cookie)
    char_u *(*fgetline) (int, void *, int) __attribute__((unused));
    void *cookie;
{

    char_u *(*gp) (int, void *, int);
    struct loop_cookie *cp;




    gp = fgetline;
    cp = (struct loop_cookie *)cookie;
    while (gp == get_loop_line)
    {
 gp = cp->getline;
 cp = cp->cookie;
    }
    return cp;



}
# 1686 "ex_docmd.c"
    static char_u *
do_one_cmd(cmdlinep, sourcing,

       cstack,

        fgetline, cookie)
    char_u **cmdlinep;
    int sourcing;

    struct condstack *cstack;

    char_u *(*fgetline) (int, void *, int);
    void *cookie;
{
    char_u *p;
    linenr_T lnum;
    long n;
    char_u *errormsg = ((void *)0);
    exarg_T ea;
    long verbose_save = -1;
    int save_msg_scroll = msg_scroll;
    int save_msg_silent = -1;
    int did_esilent = 0;

    int did_sandbox = 0;

    cmdmod_T save_cmdmod;
    int ni;

    ((__builtin_object_size ((&ea), 0) != (size_t) -1) ? __builtin___memset_chk ((&ea), (0), (sizeof(ea)), __builtin_object_size ((&ea), 0)) : __inline_memset_chk ((&ea), (0), (sizeof(ea))));
    ea.line1 = 1;
    ea.line2 = 1;

    ++ex_nesting_level;



    if (quitmore


     && !getline_equal(fgetline, cookie, get_func_line)

     )
 --quitmore;





    save_cmdmod = cmdmod;
    ((__builtin_object_size ((&cmdmod), 0) != (size_t) -1) ? __builtin___memset_chk ((&cmdmod), (0), (sizeof(cmdmod)), __builtin_object_size ((&cmdmod), 0)) : __inline_memset_chk ((&cmdmod), (0), (sizeof(cmdmod))));


    if ((*cmdlinep)[0] == '#' && (*cmdlinep)[1] == '!')
 goto doend;




    ea.cmd = *cmdlinep;
    for (;;)
    {



 while (*ea.cmd == ' ' || *ea.cmd == '\t' || *ea.cmd == ':')
     ++ea.cmd;


 if (*ea.cmd == '\000' && exmode_active
   && (getline_equal(fgetline, cookie, getexmodeline)
       || getline_equal(fgetline, cookie, getexline))
   && curwin->w_cursor.lnum < curbuf->b_ml.ml_line_count)
 {
     ea.cmd = (char_u *)"+";
     ex_pressedreturn = 1;
 }


 if (*ea.cmd == '"')
     goto doend;
 if (*ea.cmd == '\000')
 {
     ex_pressedreturn = 1;
     goto doend;
 }




 p = ea.cmd;
 if (((*ea.cmd) >= '0' && (*ea.cmd) <= '9'))
     p = skipwhite(skipdigits(ea.cmd));
 switch (*p)
 {

     case 'a': if (!checkforcmd(&ea.cmd, "aboveleft", 3))
       break;

   cmdmod.split |= 64;

   continue;

     case 'b': if (checkforcmd(&ea.cmd, "belowright", 3))
   {

       cmdmod.split |= 32;

       continue;
   }
   if (checkforcmd(&ea.cmd, "browse", 3))
   {

       cmdmod.browse = 1;

       continue;
   }
   if (!checkforcmd(&ea.cmd, "botright", 2))
       break;

   cmdmod.split |= 8;

   continue;

     case 'c': if (!checkforcmd(&ea.cmd, "confirm", 4))
       break;

   cmdmod.confirm = 1;

   continue;

     case 'k': if (checkforcmd(&ea.cmd, "keepmarks", 3))
   {
       cmdmod.keepmarks = 1;
       continue;
   }
   if (checkforcmd(&ea.cmd, "keepalt", 5))
   {
       cmdmod.keepalt = 1;
       continue;
   }
   if (!checkforcmd(&ea.cmd, "keepjumps", 5))
       break;
   cmdmod.keepjumps = 1;
   continue;


     case 'h': if (p != ea.cmd || !checkforcmd(&p, "hide", 3)
            || *p == '\000' || ends_excmd(*p))
       break;
   ea.cmd = p;
   cmdmod.hide = 1;
   continue;

     case 'l': if (checkforcmd(&ea.cmd, "lockmarks", 3))
   {
       cmdmod.lockmarks = 1;
       continue;
   }

   if (!checkforcmd(&ea.cmd, "leftabove", 5))
       break;

   cmdmod.split |= 64;

   continue;

     case 'n': if (!checkforcmd(&ea.cmd, "noautocmd", 3))
       break;

   if (cmdmod.save_ei == ((void *)0))
   {


       cmdmod.save_ei = vim_strsave(p_ei);
       set_string_option_direct((char_u *)"ei", -1,
      (char_u *)"all", 1, -6);
   }

   continue;

     case 'r': if (!checkforcmd(&ea.cmd, "rightbelow", 6))
       break;

   cmdmod.split |= 32;

   continue;

     case 's': if (checkforcmd(&ea.cmd, "sandbox", 3))
   {

       if (!did_sandbox)
    ++sandbox;
       did_sandbox = 1;

       continue;
   }
   if (!checkforcmd(&ea.cmd, "silent", 3))
       break;
   if (save_msg_silent == -1)
       save_msg_silent = msg_silent;
   ++msg_silent;
   if (*ea.cmd == '!' && !((ea.cmd[-1]) == ' ' || (ea.cmd[-1]) == '\t'))
   {

       ea.cmd = skipwhite(ea.cmd + 1);
       ++emsg_silent;
       ++did_esilent;
   }
   continue;

     case 't': if (checkforcmd(&p, "tab", 3))
   {

       if (vim_isdigit(*ea.cmd))
    cmdmod.tab = atoi((char *)ea.cmd) + 1;
       else
    cmdmod.tab = tabpage_index(curtab) + 1;
       ea.cmd = p;

       continue;
   }
   if (!checkforcmd(&ea.cmd, "topleft", 2))
       break;

   cmdmod.split |= 4;

   continue;

     case 'u': if (!checkforcmd(&ea.cmd, "unsilent", 3))
       break;
   if (save_msg_silent == -1)
       save_msg_silent = msg_silent;
   msg_silent = 0;
   continue;

     case 'v': if (checkforcmd(&ea.cmd, "vertical", 4))
   {

       cmdmod.split |= 2;

       continue;
   }
   if (!checkforcmd(&p, "verbose", 4))
       break;
   if (verbose_save < 0)
       verbose_save = p_verbose;
   if (vim_isdigit(*ea.cmd))
       p_verbose = atoi((char *)ea.cmd);
   else
       p_verbose = 1;
   ea.cmd = p;
   continue;
 }
 break;
    }


    ea.skip = did_emsg || got_int || did_throw || (cstack->cs_idx >= 0
    && !(cstack->cs_flags[cstack->cs_idx] & 0x0002));
# 1964 "ex_docmd.c"
    dbg_check_breakpoint(&ea);
    if (!ea.skip && got_int)
    {
 ea.skip = 1;
 (void)do_intthrow(cstack);
    }
# 1990 "ex_docmd.c"
    for (;;)
    {
 ea.line1 = ea.line2;
 ea.line2 = curwin->w_cursor.lnum;
 ea.cmd = skipwhite(ea.cmd);
 lnum = get_address(&ea.cmd, ea.skip, ea.addr_count == 0);
 if (ea.cmd == ((void *)0))
     goto doend;
 if (lnum == (0x7fffffffL))
 {
     if (*ea.cmd == '%')
     {
  ++ea.cmd;
  ea.line1 = 1;
  ea.line2 = curbuf->b_ml.ml_line_count;
  ++ea.addr_count;
     }

     else if (*ea.cmd == '*' && vim_strchr(p_cpo, '*') == ((void *)0))
     {
  pos_T *fp;

  ++ea.cmd;
  if (!ea.skip)
  {
      fp = getmark('<', 0);
      if (check_mark(fp) == 0)
   goto doend;
      ea.line1 = fp->lnum;
      fp = getmark('>', 0);
      if (check_mark(fp) == 0)
   goto doend;
      ea.line2 = fp->lnum;
      ++ea.addr_count;
  }
     }
 }
 else
     ea.line2 = lnum;
 ea.addr_count++;

 if (*ea.cmd == ';')
 {
     if (!ea.skip)
  curwin->w_cursor.lnum = ea.line2;
 }
 else if (*ea.cmd != ',')
     break;
 ++ea.cmd;
    }


    if (ea.addr_count == 1)
    {
 ea.line1 = ea.line2;

 if (lnum == (0x7fffffffL))
     ea.addr_count = 0;
    }


    check_cursor_lnum();
# 2060 "ex_docmd.c"
    ea.cmd = skipwhite(ea.cmd);
    while (*ea.cmd == ':')
 ea.cmd = skipwhite(ea.cmd + 1);





    if (*ea.cmd == '\000' || *ea.cmd == '"' ||
          (ea.nextcmd = check_nextcmd(ea.cmd)) != ((void *)0))
    {






 if (ea.skip)
     goto doend;
 if (*ea.cmd == '|' || (exmode_active && ea.line1 != ea.line2))
 {
     ea.cmdidx = CMD_print;
     ea.argt = 0x001 +0x400 +0x100;
     if ((errormsg = invalid_range(&ea)) == ((void *)0))
     {
  correct_range(&ea);
  ex_print(&ea);
     }
 }
 else if (ea.addr_count != 0)
 {
     if (ea.line2 > curbuf->b_ml.ml_line_count)
     {


  if (vim_strchr(p_cpo, '-') != ((void *)0))
      ea.line2 = -1;
  else
      ea.line2 = curbuf->b_ml.ml_line_count;
     }

     if (ea.line2 < 0)
  errormsg = (char_u *)((char *)(e_invrange));
     else
     {
  if (ea.line2 == 0)
      curwin->w_cursor.lnum = 1;
  else
      curwin->w_cursor.lnum = ea.line2;
  beginline(2 | 4);
     }
 }
 goto doend;
    }


    p = find_command(&ea, ((void *)0));


    if (p == ((void *)0))
    {
 if (!ea.skip)
     errormsg = (char_u *)((char *)("E464: Ambiguous use of user-defined command"));
 goto doend;
    }

    if (*p == '!' && ea.cmd[1] == 0151 && ea.cmd[0] == 78)
    {
 errormsg = uc_fun_cmd();
 goto doend;
    }

    if (ea.cmdidx == CMD_SIZE)
    {
 if (!ea.skip)
 {
     ((__builtin_object_size ((char *)(IObuff), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(IObuff), (char *)(((char *)("E492: Not an editor command"))), __builtin_object_size ((char *)(IObuff), 1 > 1)) : __inline_strcpy_chk ((char *)(IObuff), (char *)(((char *)("E492: Not an editor command")))));
     if (!sourcing)
     {
  ((__builtin_object_size ((char *)(IObuff), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(IObuff), (char *)(": "), __builtin_object_size ((char *)(IObuff), 1 > 1)) : __inline_strcat_chk ((char *)(IObuff), (char *)(": ")));
  ((__builtin_object_size ((char *)(IObuff), 0) != (size_t) -1) ? __builtin___strncat_chk ((char *)(IObuff), (char *)(*cmdlinep), (size_t)(40), __builtin_object_size ((char *)(IObuff), 1 > 1)) : __inline_strncat_chk ((char *)(IObuff), (char *)(*cmdlinep), (size_t)(40)));
     }
     errormsg = IObuff;
 }
 goto doend;
    }

    ni = (

     !((int)(ea.cmdidx) < 0) &&

     (cmdnames[ea.cmdidx].cmd_func == ex_ni

      || cmdnames[ea.cmdidx].cmd_func == ex_script_ni

      ));
# 2174 "ex_docmd.c"
    if (*p == '!' && ea.cmdidx != CMD_substitute
     && ea.cmdidx != CMD_smagic && ea.cmdidx != CMD_snomagic)
    {
 ++p;
 ea.forceit = 1;
    }
    else
 ea.forceit = 0;





    if (!((int)(ea.cmdidx) < 0))

 ea.argt = (long)cmdnames[(int)ea.cmdidx].cmd_argt;

    if (!ea.skip)
    {

 if (sandbox != 0 && !(ea.argt & 0x80000L))
 {

     errormsg = (char_u *)((char *)(e_sandbox));
     goto doend;
 }

 if (!curbuf->b_p_ma && (ea.argt & 0x200000L))
 {

     errormsg = (char_u *)((char *)(e_modifiable));
     goto doend;
 }

 if (text_locked() && !(ea.argt & 0x100000L)

  && !((int)(ea.cmdidx) < 0)

    )
 {


     if (cmdwin_type != 0)
  errormsg = (char_u *)((char *)(e_cmdwin));
     else

  errormsg = (char_u *)((char *)(e_secure));
     goto doend;
 }




 if (!(ea.argt & 0x100000L)
  && ea.cmdidx != CMD_edit
  && ea.cmdidx != CMD_checktime

  && !((int)(ea.cmdidx) < 0)

  && curbuf_locked())
     goto doend;


 if (!ni && !(ea.argt & 0x001) && ea.addr_count > 0)
 {

     errormsg = (char_u *)((char *)(e_norange));
     goto doend;
 }
    }

    if (!ni && !(ea.argt & 0x002) && ea.forceit)
    {
 errormsg = (char_u *)((char *)(e_nobang));
 goto doend;
    }





    if (!ea.skip && !ni)
    {





 if (!global_busy && ea.line1 > ea.line2)
 {
     if (msg_silent == 0)
     {
  if (sourcing || exmode_active)
  {
      errormsg = (char_u *)((char *)("E493: Backwards range given"));
      goto doend;
  }
  if (ask_yesno((char_u *)
   ((char *)("Backwards range given, OK to swap")), 0) != 'y')
      goto doend;
     }
     lnum = ea.line1;
     ea.line1 = ea.line2;
     ea.line2 = lnum;
 }
 if ((errormsg = invalid_range(&ea)) != ((void *)0))
     goto doend;
    }

    if ((ea.argt & 0x4000) && ea.addr_count == 0)
 ea.line2 = 1;

    correct_range(&ea);


    if (((ea.argt & 0x040) || ea.addr_count >= 2) && !global_busy)
    {


 (void)hasFolding(ea.line1, &ea.line1, ((void *)0));
 (void)hasFolding(ea.line2, ((void *)0), &ea.line2);
    }







    p = replace_makeprg(&ea, p, cmdlinep);
    if (p == ((void *)0))
 goto doend;






    if (ea.cmdidx == CMD_bang)
 ea.arg = p;
    else
 ea.arg = skipwhite(p);





    if (ea.argt & 0x40000L)
 while (ea.arg[0] == '+' && ea.arg[1] == '+')
     if (getargopt(&ea) == 0 && !ni)
     {
  errormsg = (char_u *)((char *)(e_invarg));
  goto doend;
     }

    if (ea.cmdidx == CMD_write || ea.cmdidx == CMD_update)
    {
 if (*ea.arg == '>')
 {
     if (*++ea.arg != '>')
     {
  errormsg = (char_u *)((char *)("E494: Use w or w>>"));
  goto doend;
     }
     ea.arg = skipwhite(ea.arg + 1);
     ea.append = 1;
 }
 else if (*ea.arg == '!' && ea.cmdidx == CMD_write)
 {
     ++ea.arg;
     ea.usefilter = 1;
 }
    }

    if (ea.cmdidx == CMD_read)
    {
 if (ea.forceit)
 {
     ea.usefilter = 1;
     ea.forceit = 0;
 }
 else if (*ea.arg == '!')
 {
     ++ea.arg;
     ea.usefilter = 1;
 }
    }

    if (ea.cmdidx == CMD_lshift || ea.cmdidx == CMD_rshift)
    {
 ea.amount = 1;
 while (*ea.arg == *ea.cmd)
 {
     ++ea.arg;
     ++ea.amount;
 }
 ea.arg = skipwhite(ea.arg);
    }





    if ((ea.argt & 0x8000) && !ea.usefilter)
 ea.do_ecmd_cmd = getargcmd(&ea.arg);





    if ((ea.argt & 0x100) && !ea.usefilter)
 separate_nextcmd(&ea);






    else if (ea.cmdidx == CMD_bang
     || ea.cmdidx == CMD_global
     || ea.cmdidx == CMD_vglobal
     || ea.usefilter)
    {
 for (p = ea.arg; *p; ++p)
 {






     if (*p == '\\' && p[1] == '\n')
  ((__builtin_object_size ((char *)((p)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((p)), (char *)((p + 1)), strlen((char *)(p + 1)) + 1, __builtin_object_size ((char *)((p)), 0)) : __inline_memmove_chk ((char *)((p)), (char *)((p + 1)), strlen((char *)(p + 1)) + 1));
     else if (*p == '\n')
     {
  ea.nextcmd = p + 1;
  *p = '\000';
  break;
     }
 }
    }

    if ((ea.argt & 0x020) && ea.addr_count == 0)
    {
 ea.line1 = 1;
 ea.line2 = curbuf->b_ml.ml_line_count;
    }


    if ( (ea.argt & 0x200)
     && *ea.arg != '\000'

     && valid_yank_reg(*ea.arg, (ea.cmdidx != CMD_put
         && ((int)(ea.cmdidx) < 0)))

     && (!((int)(ea.cmdidx) < 0) || *ea.arg != '=')



     && !((ea.argt & 0x400) && ((*ea.arg) >= '0' && (*ea.arg) <= '9')))
    {
 ea.regname = *ea.arg++;


 if (ea.arg[-1] == '=' && ea.arg[0] != '\000')
 {
     set_expr_line(vim_strsave(ea.arg));
     ea.arg += strlen((char *)(ea.arg));
 }

 ea.arg = skipwhite(ea.arg);
    }





    if ((ea.argt & 0x400) && ((*ea.arg) >= '0' && (*ea.arg) <= '9')
     && (!(ea.argt & 0x10000L) || *(p = skipdigits(ea.arg)) == '\000'
         || ((*p) == ' ' || (*p) == '\t')))
    {
 n = getdigits(&ea.arg);
 ea.arg = skipwhite(ea.arg);
 if (n <= 0 && !ni && (ea.argt & 0x1000) == 0)
 {
     errormsg = (char_u *)((char *)(e_zerocount));
     goto doend;
 }
 if (ea.argt & 0x4000)
 {
     ea.line2 = n;
     if (ea.addr_count == 0)
  ea.addr_count = 1;
 }
 else
 {
     ea.line1 = ea.line2;
     ea.line2 += n - 1;
     ++ea.addr_count;



     if (ea.line2 > curbuf->b_ml.ml_line_count)
  ea.line2 = curbuf->b_ml.ml_line_count;
 }
    }




    if (ea.argt & 0x400000L)
 get_flags(&ea);

    if (!ni && !(ea.argt & 0x004) && *ea.arg != '\000'
     && *ea.arg != '"' && (*ea.arg != '|' || (ea.argt & 0x100) == 0))
    {
 errormsg = (char_u *)((char *)(e_trailing));
 goto doend;
    }

    if (!ni && (ea.argt & 0x080) && *ea.arg == '\000')
    {
 errormsg = (char_u *)((char *)(e_argreq));
 goto doend;
    }
# 2507 "ex_docmd.c"
    if (ea.skip)
    {
 switch (ea.cmdidx)
 {

     case CMD_while:
     case CMD_endwhile:
     case CMD_for:
     case CMD_endfor:
     case CMD_if:
     case CMD_elseif:
     case CMD_else:
     case CMD_endif:
     case CMD_try:
     case CMD_catch:
     case CMD_finally:
     case CMD_endtry:
     case CMD_function:
    break;




     case CMD_aboveleft:
     case CMD_and:
     case CMD_belowright:
     case CMD_botright:
     case CMD_browse:
     case CMD_call:
     case CMD_confirm:
     case CMD_delfunction:
     case CMD_djump:
     case CMD_dlist:
     case CMD_dsearch:
     case CMD_dsplit:
     case CMD_echo:
     case CMD_echoerr:
     case CMD_echomsg:
     case CMD_echon:
     case CMD_execute:
     case CMD_help:
     case CMD_hide:
     case CMD_ijump:
     case CMD_ilist:
     case CMD_isearch:
     case CMD_isplit:
     case CMD_keepalt:
     case CMD_keepjumps:
     case CMD_keepmarks:
     case CMD_leftabove:
     case CMD_let:
     case CMD_lockmarks:
     case CMD_lua:
     case CMD_match:
     case CMD_mzscheme:
     case CMD_perl:
     case CMD_psearch:
     case CMD_python:
     case CMD_py3:
     case CMD_python3:
     case CMD_return:
     case CMD_rightbelow:
     case CMD_ruby:
     case CMD_silent:
     case CMD_smagic:
     case CMD_snomagic:
     case CMD_substitute:
     case CMD_syntax:
     case CMD_tab:
     case CMD_tcl:
     case CMD_throw:
     case CMD_tilde:
     case CMD_topleft:
     case CMD_unlet:
     case CMD_verbose:
     case CMD_vertical:
    break;

     default: goto doend;
 }
    }


    if (ea.argt & 0x008)
    {
 if (expand_filename(&ea, cmdlinep, &errormsg) == 0)
     goto doend;
    }






    if ((ea.argt & 0x10000L) && *ea.arg != '\000' && ea.addr_count == 0

     && !((int)(ea.cmdidx) < 0)

     )
    {





 if (ea.cmdidx == CMD_bdelete || ea.cmdidx == CMD_bwipeout
        || ea.cmdidx == CMD_bunload)
     p = skiptowhite_esc(ea.arg);
 else
 {
     p = ea.arg + strlen((char *)(ea.arg));
     while (p > ea.arg && ((p[-1]) == ' ' || (p[-1]) == '\t'))
  --p;
 }
 ea.line2 = buflist_findpat(ea.arg, p, (ea.argt & 0x20000L) != 0, 0);
 if (ea.line2 < 0)
     goto doend;
 ea.addr_count = 1;
 ea.arg = skipwhite(p);
    }







    ea.cmdlinep = cmdlinep;
    ea.getline = fgetline;
    ea.cookie = cookie;

    ea.cstack = cstack;



    if (((int)(ea.cmdidx) < 0))
    {



 do_ucmd(&ea);
    }
    else

    {



 ea.errmsg = ((void *)0);
 (cmdnames[ea.cmdidx].cmd_func)(&ea);
 if (ea.errmsg != ((void *)0))
     errormsg = (char_u *)((char *)(ea.errmsg));
    }
# 2669 "ex_docmd.c"
    if (need_rethrow)
 do_throw(cstack);
    else if (check_cstack)
    {
 if (source_finished(fgetline, cookie))
     do_finish(&ea, 1);
 else if (getline_equal(fgetline, cookie, get_func_line)
         && current_func_returned())
     do_return(&ea, 1, 0, ((void *)0));
    }
    need_rethrow = check_cstack = 0;


doend:
    if (curwin->w_cursor.lnum == 0)
 curwin->w_cursor.lnum = 1;

    if (errormsg != ((void *)0) && *errormsg != '\000' && !did_emsg)
    {
 if (sourcing)
 {
     if (errormsg != IObuff)
     {
  ((__builtin_object_size ((char *)(IObuff), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(IObuff), (char *)(errormsg), __builtin_object_size ((char *)(IObuff), 1 > 1)) : __inline_strcpy_chk ((char *)(IObuff), (char *)(errormsg)));
  errormsg = IObuff;
     }
     ((__builtin_object_size ((char *)(errormsg), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(errormsg), (char *)(": "), __builtin_object_size ((char *)(errormsg), 1 > 1)) : __inline_strcat_chk ((char *)(errormsg), (char *)(": ")));
     ((__builtin_object_size ((char *)(errormsg), 0) != (size_t) -1) ? __builtin___strncat_chk ((char *)(errormsg), (char *)(*cmdlinep), (size_t)((1024+1) - strlen((char *)(IObuff)) - 1), __builtin_object_size ((char *)(errormsg), 1 > 1)) : __inline_strncat_chk ((char *)(errormsg), (char *)(*cmdlinep), (size_t)((1024+1) - strlen((char *)(IObuff)) - 1)));
 }
 emsg(errormsg);
    }

    do_errthrow(cstack,
     (ea.cmdidx != CMD_SIZE

      && !((int)(ea.cmdidx) < 0)

     ) ? cmdnames[(int)ea.cmdidx].cmd_name : (char_u *)((void *)0));


    if (verbose_save >= 0)
 p_verbose = verbose_save;

    if (cmdmod.save_ei != ((void *)0))
    {

 set_string_option_direct((char_u *)"ei", -1, cmdmod.save_ei,
         1, -6);
 free_string_option(cmdmod.save_ei);
    }


    cmdmod = save_cmdmod;

    if (save_msg_silent != -1)
    {


 if (!did_emsg || msg_silent > save_msg_silent)
     msg_silent = save_msg_silent;
 emsg_silent -= did_esilent;
 if (emsg_silent < 0)
     emsg_silent = 0;


 msg_scroll = save_msg_scroll;



 if (redirecting())
     msg_col = 0;
    }


    if (did_sandbox)
 --sandbox;


    if (ea.nextcmd && *ea.nextcmd == '\000')
 ea.nextcmd = ((void *)0);


    --ex_nesting_level;


    return ea.nextcmd;
}
# 2764 "ex_docmd.c"
    int
checkforcmd(pp, cmd, len)
    char_u **pp;
    char *cmd;
    int len;
{
    int i;

    for (i = 0; cmd[i] != '\000'; ++i)
 if (((char_u *)cmd)[i] != (*pp)[i])
     break;
    if (i >= len && !isalpha((*pp)[i]))
    {
 *pp = skipwhite(*pp + i);
 return 1;
    }
    return 0;
}
# 2790 "ex_docmd.c"
    static char_u *
find_command(eap, full)
    exarg_T *eap;
    int *full __attribute__((unused));
{
    int len;
    char_u *p;
    int i;
# 2808 "ex_docmd.c"
    p = eap->cmd;
    if (*p == 'k')
    {
 eap->cmdidx = CMD_k;
 ++p;
    }
    else if (p[0] == 's'
     && ((p[1] == 'c' && p[2] != 's' && p[2] != 'r'
      && p[3] != 'i' && p[4] != 'p')
  || p[1] == 'g'
  || (p[1] == 'i' && p[2] != 'm' && p[2] != 'l' && p[2] != 'g')
  || p[1] == 'I'
  || (p[1] == 'r' && p[2] != 'e')))
    {
 eap->cmdidx = CMD_substitute;
 ++p;
    }
    else
    {
 while (((*p) < 0x7f && isalpha(*p)))
     ++p;

 if (eap->cmd[0] == 'p' && eap->cmd[1] == 'y')
     while (((*p) < 0x7f && isalnum(*p)))
  ++p;


 if (p == eap->cmd && vim_strchr((char_u *)"@*!=><&~#", *p) != ((void *)0))
     ++p;
 len = (int)(p - eap->cmd);
 if (*eap->cmd == 'd' && (p[-1] == 'l' || p[-1] == 'p'))
 {


     for (i = 0; i < len; ++i)
  if (eap->cmd[i] != ((char_u *)"delete")[i])
      break;
     if (i == len - 1)
     {
  --len;
  if (p[-1] == 'l')
      eap->flags |= 0x01;
  else
      eap->flags |= 0x04;
     }
 }

 if (((*eap->cmd) < 0x7f && islower(*eap->cmd)))
     eap->cmdidx = cmdidxs[((*eap->cmd) - 'a')];
 else
     eap->cmdidx = cmdidxs[26];

 for ( ; (int)eap->cmdidx < (int)CMD_SIZE;
          eap->cmdidx = (cmdidx_T)((int)eap->cmdidx + 1))
     if (strncmp((char *)(cmdnames[(int)eap->cmdidx].cmd_name), (char *)((char *)eap->cmd), (size_t)((size_t)len)) == 0)

     {

  if (full != ((void *)0)
      && cmdnames[(int)eap->cmdidx].cmd_name[len] == '\000')
      *full = 1;

  break;
     }



 if (eap->cmdidx == CMD_SIZE && *eap->cmd >= 'A' && *eap->cmd <= 'Z')
 {

     while (((*p) < 0x7f && isalnum(*p)))
  ++p;
     p = find_ucmd(eap, p, full, ((void *)0), ((void *)0));
 }

 if (p == eap->cmd)
     eap->cmdidx = CMD_SIZE;
    }

    return p;
}
# 2897 "ex_docmd.c"
    static char_u *
find_ucmd(eap, p, full, xp, compl)
    exarg_T *eap;
    char_u *p;
    int *full;
    expand_T *xp;
    int *compl;
{
    int len = (int)(p - eap->cmd);
    int j, k, matchlen = 0;
    ucmd_T *uc;
    int found = 0;
    int possible = 0;
    char_u *cp, *np;
    garray_T *gap;
    int amb_local = 0;





    gap = &curbuf->b_ucmds;
    for (;;)
    {
 for (j = 0; j < gap->ga_len; ++j)
 {
     uc = (&((ucmd_T *)((gap)->ga_data))[j]);
     cp = eap->cmd;
     np = uc->uc_name;
     k = 0;
     while (k < len && *np != '\000' && *cp++ == *np++)
  k++;
     if (k == len || (*np == '\000' && vim_isdigit(eap->cmd[k])))
     {



  if (k == len && found && *np != '\000')
  {
      if (gap == &ucmds)
   return ((void *)0);
      amb_local = 1;
  }

  if (!found || (k == len && *np == '\000'))
  {




      if (k == len)
   found = 1;
      else
   possible = 1;

      if (gap == &ucmds)
   eap->cmdidx = CMD_USER;
      else
   eap->cmdidx = CMD_USER_BUF;
      eap->argt = (long)uc->uc_argt;
      eap->useridx = j;


      if (compl != ((void *)0))
   *compl = uc->uc_compl;

      if (xp != ((void *)0))
      {
   xp->xp_arg = uc->uc_compl_arg;
   xp->xp_scriptID = uc->uc_scriptID;
      }




      matchlen = k;
      if (k == len && *np == '\000')
      {
   if (full != ((void *)0))
       *full = 1;
   amb_local = 0;
   break;
      }
  }
     }
 }


 if (j < gap->ga_len || gap == &ucmds)
     break;
 gap = &ucmds;
    }


    if (amb_local)
    {
 if (xp != ((void *)0))
     xp->xp_context = (-2);
 return ((void *)0);
    }



    if (found || possible)
 return p + (matchlen - len);
    return p;
}



static struct cmdmod
{
    char *name;
    int minlen;
    int has_count;
} cmdmods[] = {
    {"aboveleft", 3, 0},
    {"belowright", 3, 0},
    {"botright", 2, 0},
    {"browse", 3, 0},
    {"confirm", 4, 0},
    {"hide", 3, 0},
    {"keepalt", 5, 0},
    {"keepjumps", 5, 0},
    {"keepmarks", 3, 0},
    {"leftabove", 5, 0},
    {"lockmarks", 3, 0},
    {"noautocmd", 3, 0},
    {"rightbelow", 6, 0},
    {"sandbox", 3, 0},
    {"silent", 3, 0},
    {"tab", 3, 1},
    {"topleft", 2, 0},
    {"unsilent", 3, 0},
    {"verbose", 4, 1},
    {"vertical", 4, 0},
};





    int
modifier_len(cmd)
    char_u *cmd;
{
    int i, j;
    char_u *p = cmd;

    if (((*cmd) >= '0' && (*cmd) <= '9'))
 p = skipwhite(skipdigits(cmd));
    for (i = 0; i < (int)(sizeof(cmdmods) / sizeof(struct cmdmod)); ++i)
    {
 for (j = 0; p[j] != '\000'; ++j)
     if (p[j] != cmdmods[i].name[j])
  break;
 if (!isalpha(p[j]) && j >= cmdmods[i].minlen
     && (p == cmd || cmdmods[i].has_count))
     return j + (int)(p - cmd);
    }
    return 0;
}






    int
cmd_exists(name)
    char_u *name;
{
    exarg_T ea;
    int full = 0;
    int i;
    int j;
    char_u *p;


    for (i = 0; i < (int)(sizeof(cmdmods) / sizeof(struct cmdmod)); ++i)
    {
 for (j = 0; name[j] != '\000'; ++j)
     if (name[j] != cmdmods[i].name[j])
  break;
 if (name[j] == '\000' && j >= cmdmods[i].minlen)
     return (cmdmods[i].name[j] == '\000' ? 2 : 1);
    }



    ea.cmd = (*name == '2' || *name == '3') ? name + 1 : name;
    ea.cmdidx = (cmdidx_T)0;
    p = find_command(&ea, &full);
    if (p == ((void *)0))
 return 3;
    if (vim_isdigit(*name) && ea.cmdidx != CMD_match)
 return 0;
    if (*skipwhite(p) != '\000')
 return 0;
    return (ea.cmdidx == CMD_SIZE ? 0 : (full ? 2 : 1));
}
# 3107 "ex_docmd.c"
    char_u *
set_one_cmd_context(xp, buff)
    expand_T *xp;
    char_u *buff;
{
    char_u *p;
    char_u *cmd, *arg;
    int len = 0;
    exarg_T ea;

    int compl = 0;


    int delim;

    int forceit = 0;
    int usefilter = 0;

    ExpandInit(xp);
    xp->xp_pattern = buff;
    xp->xp_context = 1;
    ea.argt = 0;




    for (cmd = buff; vim_strchr((char_u *)" \t:|", *cmd) != ((void *)0); cmd++)
 ;
    xp->xp_pattern = cmd;

    if (*cmd == '\000')
 return ((void *)0);
    if (*cmd == '"')
    {
 xp->xp_context = 0;
 return ((void *)0);
    }




    cmd = skip_range(cmd, &xp->xp_context);




    xp->xp_pattern = cmd;
    if (*cmd == '\000')
 return ((void *)0);
    if (*cmd == '"')
    {
 xp->xp_context = 0;
 return ((void *)0);
    }

    if (*cmd == '|' || *cmd == '\n')
 return cmd + 1;
# 3172 "ex_docmd.c"
    if (*cmd == 'k' && cmd[1] != 'e')
    {
 ea.cmdidx = CMD_k;
 p = cmd + 1;
    }
    else
    {
 p = cmd;
 while (((*p) < 0x7f && isalpha(*p)) || *p == '*')
     ++p;

 if (p == cmd && vim_strchr((char_u *)"@*!=><&~#", *p) != ((void *)0))
     ++p;
 len = (int)(p - cmd);

 if (len == 0)
 {
     xp->xp_context = (-2);
     return ((void *)0);
 }
 for (ea.cmdidx = (cmdidx_T)0; (int)ea.cmdidx < (int)CMD_SIZE;
       ea.cmdidx = (cmdidx_T)((int)ea.cmdidx + 1))
     if (strncmp((char *)(cmdnames[(int)ea.cmdidx].cmd_name), (char *)(cmd), (size_t)((size_t)len)) == 0)

  break;


 if (cmd[0] >= 'A' && cmd[0] <= 'Z')
     while (((*p) < 0x7f && isalnum(*p)) || *p == '*')
  ++p;

    }





    if (*p == '\000' && ((p[-1]) < 0x7f && isalnum(p[-1])))
 return ((void *)0);

    if (ea.cmdidx == CMD_SIZE)
    {
 if (*cmd == 's' && vim_strchr((char_u *)"cgriI", cmd[1]) != ((void *)0))
 {
     ea.cmdidx = CMD_substitute;
     p = cmd + 1;
 }

 else if (cmd[0] >= 'A' && cmd[0] <= 'Z')
 {
     ea.cmd = cmd;
     p = find_ucmd(&ea, p, ((void *)0), xp,

      &compl



      );
     if (p == ((void *)0))
  ea.cmdidx = CMD_SIZE;
 }

    }
    if (ea.cmdidx == CMD_SIZE)
    {

 xp->xp_context = (-2);
 return ((void *)0);
    }

    xp->xp_context = 0;

    if (*p == '!')
    {
 forceit = 1;
 ++p;
    }





    if (!((int)(ea.cmdidx) < 0))

 ea.argt = (long)cmdnames[(int)ea.cmdidx].cmd_argt;

    arg = skipwhite(p);

    if (ea.cmdidx == CMD_write || ea.cmdidx == CMD_update)
    {
 if (*arg == '>')
 {
     if (*++arg == '>')
  ++arg;
     arg = skipwhite(arg);
 }
 else if (*arg == '!' && ea.cmdidx == CMD_write)
 {
     ++arg;
     usefilter = 1;
 }
    }

    if (ea.cmdidx == CMD_read)
    {
 usefilter = forceit;
 if (*arg == '!')
 {
     ++arg;
     usefilter = 1;
 }
    }

    if (ea.cmdidx == CMD_lshift || ea.cmdidx == CMD_rshift)
    {
 while (*arg == *cmd)
     ++arg;
 arg = skipwhite(arg);
    }


    if ((ea.argt & 0x8000) && !usefilter && *arg == '+')
    {

 p = arg + 1;
 arg = skip_cmd_arg(arg, 0);


 if (*arg == '\000')
     return p;


 arg = skipwhite(arg);
    }





    if ((ea.argt & 0x100) && !usefilter)
    {
 p = arg;

 if (ea.cmdidx == CMD_redir && p[0] == '@' && p[1] == '"')
     p += 2;
 while (*p)
 {
     if (*p == 22)
     {
  if (p[1] != '\000')
      ++p;
     }
     else if ( (*p == '"' && !(ea.argt & 0x800))
      || *p == '|' || *p == '\n')
     {
  if (*(p - 1) != '\\')
  {
      if (*p == '|' || *p == '\n')
   return p + 1;
      return ((void *)0);
  }
     }
     ++p;
 }
    }


    if (!(ea.argt & 0x004) && *arg != '\000' &&
        vim_strchr((char_u *)"|\"", *arg) == ((void *)0))
 return ((void *)0);


    p = buff + strlen((char *)(buff));
    while (p != arg && *p != ' ' && *p != '\011')
 p--;
    if (*p == ' ' || *p == '\011')
 p++;
    xp->xp_pattern = p;

    if (ea.argt & 0x008)
    {
 int c;
 int in_quote = 0;
 char_u *bow = ((void *)0);





 xp->xp_pattern = skipwhite(arg);
 p = xp->xp_pattern;
 while (*p != '\000')
 {





  c = *p;
     if (c == '\\' && p[1] != '\000')
  ++p;
     else if (c == '`')
     {
  if (!in_quote)
  {
      xp->xp_pattern = p;
      bow = p + 1;
  }
  in_quote = !in_quote;
     }


     else if (c == '|' || c == '\n' || c == '"' || (((c) == ' ' || (c) == '\t')

      && (!(ea.argt & 0x010) || usefilter)

      ))
     {
  len = 0;
  while (*p != '\000')
  {





   c = *p;
      if (c == '`' || vim_isfilec_or_wc(c))
   break;





   len = 1;
      ++p;
  }
  if (in_quote)
      bow = p;
  else
      xp->xp_pattern = p;
  p -= len;
     }
     ++p;
 }





 if (bow != ((void *)0) && in_quote)
     xp->xp_pattern = bow;
 xp->xp_context = 2;


 if (usefilter || ea.cmdidx == CMD_bang)
 {

     xp->xp_shell = 1;


     if (xp->xp_pattern == skipwhite(arg))
  xp->xp_context = 32;
 }


 if (*xp->xp_pattern == '$'



  )
 {
     for (p = xp->xp_pattern + 1; *p != '\000'; ++p)
  if (!vim_isIDc(*p))
      break;
     if (*p == '\000')
     {
  xp->xp_context = 26;
  ++xp->xp_pattern;


  if (compl != 30 && compl != 31)
      compl = 26;

     }
 }
    }




    switch (ea.cmdidx)
    {
 case CMD_find:
 case CMD_sfind:
 case CMD_tabfind:
     xp->xp_context = 38;
     break;
 case CMD_cd:
 case CMD_chdir:
 case CMD_lcd:
 case CMD_lchdir:
     if (xp->xp_context == 2)
  xp->xp_context = 3;
     break;
 case CMD_help:
     xp->xp_context = 8;
     xp->xp_pattern = arg;
     break;



 case CMD_aboveleft:
 case CMD_argdo:
 case CMD_belowright:
 case CMD_botright:
 case CMD_browse:
 case CMD_bufdo:
 case CMD_confirm:
 case CMD_debug:
 case CMD_folddoclosed:
 case CMD_folddoopen:
 case CMD_hide:
 case CMD_keepalt:
 case CMD_keepjumps:
 case CMD_keepmarks:
 case CMD_leftabove:
 case CMD_lockmarks:
 case CMD_rightbelow:
 case CMD_sandbox:
 case CMD_silent:
 case CMD_tab:
 case CMD_topleft:
 case CMD_verbose:
 case CMD_vertical:
 case CMD_windo:
     return arg;



 case CMD_match:
     if (*arg == '\000' || !ends_excmd(*arg))
     {

  set_context_in_echohl_cmd(xp, arg);
  arg = skipwhite(skiptowhite(arg));
  if (*arg != '\000')
  {
      xp->xp_context = 0;
      arg = skip_regexp(arg + 1, *arg, p_magic, ((void *)0));
  }
     }
     return find_nextcmd(arg);







 case CMD_command:

     while (*arg == '-')
     {
  arg++;
  p = skiptowhite(arg);
  if (*p == '\000')
  {

      p = vim_strchr(arg, '=');
      if (p == ((void *)0))
      {

   xp->xp_context = 23;
   xp->xp_pattern = arg;
   return ((void *)0);
      }




      if (strncasecmp((char *)(arg), (char *)("complete"), (size_t)(p - arg)) == 0)
      {
   xp->xp_context = 25;
   xp->xp_pattern = p + 1;
   return ((void *)0);
      }
      else if (strncasecmp((char *)(arg), (char *)("nargs"), (size_t)(p - arg)) == 0)
      {
   xp->xp_context = 24;
   xp->xp_pattern = p + 1;
   return ((void *)0);
      }
      return ((void *)0);
  }
  arg = skipwhite(p);
     }


     p = skiptowhite(arg);
     if (*p == '\000')
     {
  xp->xp_context = 22;
  xp->xp_pattern = arg;
  break;
     }


     return skipwhite(p);

 case CMD_delcommand:
     xp->xp_context = 22;
     xp->xp_pattern = arg;
     break;


 case CMD_global:
 case CMD_vglobal:
     delim = *arg;
     if (delim)
  ++arg;

     while (arg[0] != '\000' && arg[0] != delim)
     {
  if (arg[0] == '\\' && arg[1] != '\000')
      ++arg;
  ++arg;
     }
     if (arg[0] != '\000')
  return arg + 1;
     break;
 case CMD_and:
 case CMD_substitute:
     delim = *arg;
     if (delim)
     {

  ++arg;
  arg = skip_regexp(arg, delim, p_magic, ((void *)0));
     }

     while (arg[0] != '\000' && arg[0] != delim)
     {
  if (arg[0] == '\\' && arg[1] != '\000')
      ++arg;
  ++arg;
     }
     if (arg[0] != '\000')
  ++arg;
     while (arg[0] && vim_strchr((char_u *)"|\"#", arg[0]) == ((void *)0))
  ++arg;
     if (arg[0] != '\000')
  return arg;
     break;
 case CMD_isearch:
 case CMD_dsearch:
 case CMD_ilist:
 case CMD_dlist:
 case CMD_ijump:
 case CMD_psearch:
 case CMD_djump:
 case CMD_isplit:
 case CMD_dsplit:
     arg = skipwhite(skipdigits(arg));
     if (*arg == '/')
     {
  for (++arg; *arg && *arg != '/'; arg++)
      if (*arg == '\\' && arg[1] != '\000')
   arg++;
  if (*arg)
  {
      arg = skipwhite(arg + 1);


      if (*arg && vim_strchr((char_u *)"|\"\n", *arg) == ((void *)0))
   xp->xp_context = 0;
      else
   return arg;
  }
     }
     break;

 case CMD_autocmd:
     return set_context_in_autocmd(xp, arg, 0);

 case CMD_doautocmd:
 case CMD_doautoall:
     return set_context_in_autocmd(xp, arg, 1);

 case CMD_set:
     set_context_in_set_cmd(xp, arg, 0);
     break;
 case CMD_setglobal:
     set_context_in_set_cmd(xp, arg, 2);
     break;
 case CMD_setlocal:
     set_context_in_set_cmd(xp, arg, 4);
     break;
 case CMD_tag:
 case CMD_stag:
 case CMD_ptag:
 case CMD_ltag:
 case CMD_tselect:
 case CMD_stselect:
 case CMD_ptselect:
 case CMD_tjump:
 case CMD_stjump:
 case CMD_ptjump:
     if (*p_wop != '\000')
  xp->xp_context = 17;
     else
  xp->xp_context = 6;
     xp->xp_pattern = arg;
     break;
 case CMD_augroup:
     xp->xp_context = 14;
     xp->xp_pattern = arg;
     break;

 case CMD_syntax:
     set_context_in_syntax_cmd(xp, arg);
     break;


 case CMD_let:
 case CMD_if:
 case CMD_elseif:
 case CMD_while:
 case CMD_for:
 case CMD_echo:
 case CMD_echon:
 case CMD_execute:
 case CMD_echomsg:
 case CMD_echoerr:
 case CMD_call:
 case CMD_return:
     set_context_for_expression(xp, arg, ea.cmdidx);
     break;

 case CMD_unlet:
     while ((xp->xp_pattern = vim_strchr(arg, ' ')) != ((void *)0))
  arg = xp->xp_pattern + 1;
     xp->xp_context = 15;
     xp->xp_pattern = arg;
     break;

 case CMD_function:
 case CMD_delfunction:
     xp->xp_context = 19;
     xp->xp_pattern = arg;
     break;

 case CMD_echohl:
     set_context_in_echohl_cmd(xp, arg);
     break;

 case CMD_highlight:
     set_context_in_highlight_cmd(xp, arg);
     break;
# 3739 "ex_docmd.c"
 case CMD_sign:
     set_context_in_sign_cmd(xp, arg);
     break;


 case CMD_bdelete:
 case CMD_bwipeout:
 case CMD_bunload:
     while ((xp->xp_pattern = vim_strchr(arg, ' ')) != ((void *)0))
  arg = xp->xp_pattern + 1;

 case CMD_buffer:
 case CMD_sbuffer:
 case CMD_checktime:
     xp->xp_context = 9;
     xp->xp_pattern = arg;
     break;


 case CMD_USER:
 case CMD_USER_BUF:
     if (compl != 0)
     {

  if (!(ea.argt & 0x008))
  {

      if (compl == 11)
   return set_context_in_menu_cmd(xp, cmd, arg, forceit);

      if (compl == 1)
   return arg;
      if (compl == 16)
   return set_context_in_map_cmd(xp, (char_u *)"map",
      arg, forceit, 0, 0, CMD_map);
      while ((xp->xp_pattern = vim_strchr(arg, ' ')) != ((void *)0))
   arg = xp->xp_pattern + 1;
      xp->xp_pattern = arg;
  }
  xp->xp_context = compl;
     }
     break;

 case CMD_map: case CMD_noremap:
 case CMD_nmap: case CMD_nnoremap:
 case CMD_vmap: case CMD_vnoremap:
 case CMD_omap: case CMD_onoremap:
 case CMD_imap: case CMD_inoremap:
 case CMD_cmap: case CMD_cnoremap:
 case CMD_lmap: case CMD_lnoremap:
     return set_context_in_map_cmd(xp, cmd, arg, forceit,
           0, 0, ea.cmdidx);
 case CMD_unmap:
 case CMD_nunmap:
 case CMD_vunmap:
 case CMD_ounmap:
 case CMD_iunmap:
 case CMD_cunmap:
 case CMD_lunmap:
     return set_context_in_map_cmd(xp, cmd, arg, forceit,
            0, 1, ea.cmdidx);
 case CMD_abbreviate: case CMD_noreabbrev:
 case CMD_cabbrev: case CMD_cnoreabbrev:
 case CMD_iabbrev: case CMD_inoreabbrev:
     return set_context_in_map_cmd(xp, cmd, arg, forceit,
            1, 0, ea.cmdidx);
 case CMD_unabbreviate:
 case CMD_cunabbrev:
 case CMD_iunabbrev:
     return set_context_in_map_cmd(xp, cmd, arg, forceit,
             1, 1, ea.cmdidx);

 case CMD_menu: case CMD_noremenu: case CMD_unmenu:
 case CMD_amenu: case CMD_anoremenu: case CMD_aunmenu:
 case CMD_nmenu: case CMD_nnoremenu: case CMD_nunmenu:
 case CMD_vmenu: case CMD_vnoremenu: case CMD_vunmenu:
 case CMD_omenu: case CMD_onoremenu: case CMD_ounmenu:
 case CMD_imenu: case CMD_inoremenu: case CMD_iunmenu:
 case CMD_cmenu: case CMD_cnoremenu: case CMD_cunmenu:
 case CMD_tmenu: case CMD_tunmenu:
 case CMD_popup: case CMD_tearoff: case CMD_emenu:
     return set_context_in_menu_cmd(xp, cmd, arg, forceit);


 case CMD_colorscheme:
     xp->xp_context = 28;
     xp->xp_pattern = arg;
     break;

 case CMD_compiler:
     xp->xp_context = 29;
     xp->xp_pattern = arg;
     break;

 case CMD_ownsyntax:
     xp->xp_context = 39;
     xp->xp_pattern = arg;
     break;

 case CMD_setfiletype:
     xp->xp_context = 37;
     xp->xp_pattern = arg;
     break;
# 3860 "ex_docmd.c"
 case CMD_behave:
     xp->xp_context = 36;
     break;



 default:
     break;
    }
    return ((void *)0);
}
# 3881 "ex_docmd.c"
    char_u *
skip_range(cmd, ctx)
    char_u *cmd;
    int *ctx;
{
    unsigned delim;

    while (vim_strchr((char_u *)" \t0123456789.$%'/?-+,;", *cmd) != ((void *)0))
    {
 if (*cmd == '\'')
 {
     if (*++cmd == '\000' && ctx != ((void *)0))
  *ctx = 0;
 }
 else if (*cmd == '/' || *cmd == '?')
 {
     delim = *cmd++;
     while (*cmd != '\000' && *cmd != delim)
  if (*cmd++ == '\\' && *cmd != '\000')
      ++cmd;
     if (*cmd == '\000' && ctx != ((void *)0))
  *ctx = 0;
 }
 if (*cmd != '\000')
     ++cmd;
    }


    while (*cmd == ':')
 cmd = skipwhite(cmd + 1);

    return cmd;
}
# 3923 "ex_docmd.c"
    static linenr_T
get_address(ptr, skip, to_other_file)
    char_u **ptr;
    int skip;
    int to_other_file;
{
    int c;
    int i;
    long n;
    char_u *cmd;
    pos_T pos;
    pos_T *fp;
    linenr_T lnum;

    cmd = skipwhite(*ptr);
    lnum = (0x7fffffffL);
    do
    {
 switch (*cmd)
 {
     case '.':
   ++cmd;
   lnum = curwin->w_cursor.lnum;
   break;

     case '$':
   ++cmd;
   lnum = curbuf->b_ml.ml_line_count;
   break;

     case '\'':
   if (*++cmd == '\000')
   {
       cmd = ((void *)0);
       goto error;
   }
   if (skip)
       ++cmd;
   else
   {


       fp = getmark(*cmd, to_other_file && cmd[1] == '\000');
       ++cmd;
       if (fp == (pos_T *)-1)

    lnum = curwin->w_cursor.lnum;
       else
       {
    if (check_mark(fp) == 0)
    {
        cmd = ((void *)0);
        goto error;
    }
    lnum = fp->lnum;
       }
   }
   break;

     case '/':
     case '?':
   c = *cmd++;
   if (skip)
   {
       cmd = skip_regexp(cmd, c, (int)p_magic, ((void *)0));
       if (*cmd == c)
    ++cmd;
   }
   else
   {
       pos = curwin->w_cursor;




       if (lnum != (0x7fffffffL))
    curwin->w_cursor.lnum = lnum;







       if (c == '/')
    curwin->w_cursor.col = (0x7fffffffL);
       else
    curwin->w_cursor.col = 0;
       searchcmdlen = 0;
       if (!do_search(((void *)0), c, cmd, 1L,
            0x20 | 0x0c, ((void *)0)))
       {
    curwin->w_cursor = pos;
    cmd = ((void *)0);
    goto error;
       }
       lnum = curwin->w_cursor.lnum;
       curwin->w_cursor = pos;

       cmd += searchcmdlen;
   }
   break;

     case '\\':
   ++cmd;
   if (*cmd == '&')
       i = 1;
   else if (*cmd == '?' || *cmd == '/')
       i = 0;
   else
   {
       emsg((char_u *)(((char *)(e_backslash))));
       cmd = ((void *)0);
       goto error;
   }

   if (!skip)
   {




       if (lnum != (0x7fffffffL))
    pos.lnum = lnum;
       else
    pos.lnum = curwin->w_cursor.lnum;





       if (*cmd != '?')
    pos.col = (0x7fffffffL);
       else
    pos.col = 0;
       if (searchit(curwin, curbuf, &pos,
     *cmd == '?' ? (-1) : 1,
     (char_u *)"", 1L, 0x0c,
      i, (linenr_T)0, ((void *)0)) != 0)
    lnum = pos.lnum;
       else
       {
    cmd = ((void *)0);
    goto error;
       }
   }
   ++cmd;
   break;

     default:
   if (((*cmd) >= '0' && (*cmd) <= '9'))
       lnum = getdigits(&cmd);
 }

 for (;;)
 {
     cmd = skipwhite(cmd);
     if (*cmd != '-' && *cmd != '+' && !((*cmd) >= '0' && (*cmd) <= '9'))
  break;

     if (lnum == (0x7fffffffL))
  lnum = curwin->w_cursor.lnum;
     if (((*cmd) >= '0' && (*cmd) <= '9'))
  i = '+';
     else
  i = *cmd++;
     if (!((*cmd) >= '0' && (*cmd) <= '9'))
  n = 1;
     else
  n = getdigits(&cmd);
     if (i == '-')
  lnum -= n;
     else
  lnum += n;
 }
    } while (*cmd == '/' || *cmd == '?');

error:
    *ptr = cmd;
    return lnum;
}




    static void
get_flags(eap)
    exarg_T *eap;
{
    while (vim_strchr((char_u *)"lp#", *eap->arg) != ((void *)0))
    {
 if (*eap->arg == 'l')
     eap->flags |= 0x01;
 else if (*eap->arg == 'p')
     eap->flags |= 0x04;
 else
     eap->flags |= 0x02;
 eap->arg = skipwhite(eap->arg + 1);
    }
}




    void
ex_ni(eap)
    exarg_T *eap;
{
    if (!eap->skip)
 eap->errmsg = (char_u *)"E319: Sorry, the command is not available in this version";
}






    static void
ex_script_ni(eap)
    exarg_T *eap;
{
    if (!eap->skip)
 ex_ni(eap);
    else
 vim_free(script_get(eap, eap->arg));
}






    static char_u *
invalid_range(eap)
    exarg_T *eap;
{
    if ( eap->line1 < 0
     || eap->line2 < 0
     || eap->line1 > eap->line2
     || ((eap->argt & 0x001)
  && !(eap->argt & 0x4000)
  && eap->line2 > curbuf->b_ml.ml_line_count

   + (eap->cmdidx == CMD_diffget)

  ))
 return (char_u *)((char *)(e_invrange));
    return ((void *)0);
}




    static void
correct_range(eap)
    exarg_T *eap;
{
    if (!(eap->argt & 0x1000))
    {
 if (eap->line1 == 0)
     eap->line1 = 1;
 if (eap->line2 == 0)
     eap->line2 = 1;
    }
}


static char_u *skip_grep_pat (exarg_T *eap);





    static char_u *
skip_grep_pat(eap)
    exarg_T *eap;
{
    char_u *p = eap->arg;

    if (*p != '\000' && (eap->cmdidx == CMD_vimgrep || eap->cmdidx == CMD_lvimgrep
  || eap->cmdidx == CMD_vimgrepadd
  || eap->cmdidx == CMD_lvimgrepadd
  || grep_internal(eap->cmdidx)))
    {
 p = skip_vimgrep_pat(p, ((void *)0), ((void *)0));
 if (p == ((void *)0))
     p = eap->arg;
    }
    return p;
}





    static char_u *
replace_makeprg(eap, p, cmdlinep)
    exarg_T *eap;
    char_u *p;
    char_u **cmdlinep;
{
    char_u *new_cmdline;
    char_u *program;
    char_u *pos;
    char_u *ptr;
    int len;
    int i;




    if ((eap->cmdidx == CMD_make || eap->cmdidx == CMD_lmake
       || eap->cmdidx == CMD_grep || eap->cmdidx == CMD_lgrep
       || eap->cmdidx == CMD_grepadd
       || eap->cmdidx == CMD_lgrepadd)
     && !grep_internal(eap->cmdidx))
    {
 if (eap->cmdidx == CMD_grep || eap->cmdidx == CMD_lgrep
     || eap->cmdidx == CMD_grepadd || eap->cmdidx == CMD_lgrepadd)
 {
     if (*curbuf->b_p_gp == '\000')
  program = p_gp;
     else
  program = curbuf->b_p_gp;
 }
 else
 {
     if (*curbuf->b_p_mp == '\000')
  program = p_mp;
     else
  program = curbuf->b_p_mp;
 }

 p = skipwhite(p);

 if ((pos = (char_u *)strstr((char *)program, "$*")) != ((void *)0))
 {

     i = 1;
     while ((pos = (char_u *)strstr((char *)pos + 2, "$*")) != ((void *)0))
  ++i;
     len = (int)strlen((char *)(p));
     new_cmdline = alloc((int)(strlen((char *)(program)) + i * (len - 2) + 1));
     if (new_cmdline == ((void *)0))
  return ((void *)0);
     ptr = new_cmdline;
     while ((pos = (char_u *)strstr((char *)program, "$*")) != ((void *)0))
     {
  i = (int)(pos - program);
  ((__builtin_object_size ((char *)(ptr), 0) != (size_t) -1) ? __builtin___strncpy_chk ((char *)(ptr), (char *)(program), (size_t)(i), __builtin_object_size ((char *)(ptr), 1 > 1)) : __inline_strncpy_chk ((char *)(ptr), (char *)(program), (size_t)(i)));
  ((__builtin_object_size ((char *)(ptr += i), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(ptr += i), (char *)(p), __builtin_object_size ((char *)(ptr += i), 1 > 1)) : __inline_strcpy_chk ((char *)(ptr += i), (char *)(p)));
  ptr += len;
  program = pos + 2;
     }
     ((__builtin_object_size ((char *)(ptr), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(ptr), (char *)(program), __builtin_object_size ((char *)(ptr), 1 > 1)) : __inline_strcpy_chk ((char *)(ptr), (char *)(program)));
 }
 else
 {
     new_cmdline = alloc((int)(strlen((char *)(program)) + strlen((char *)(p)) + 2));
     if (new_cmdline == ((void *)0))
  return ((void *)0);
     ((__builtin_object_size ((char *)(new_cmdline), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(new_cmdline), (char *)(program), __builtin_object_size ((char *)(new_cmdline), 1 > 1)) : __inline_strcpy_chk ((char *)(new_cmdline), (char *)(program)));
     ((__builtin_object_size ((char *)(new_cmdline), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(new_cmdline), (char *)(" "), __builtin_object_size ((char *)(new_cmdline), 1 > 1)) : __inline_strcat_chk ((char *)(new_cmdline), (char *)(" ")));
     ((__builtin_object_size ((char *)(new_cmdline), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(new_cmdline), (char *)(p), __builtin_object_size ((char *)(new_cmdline), 1 > 1)) : __inline_strcat_chk ((char *)(new_cmdline), (char *)(p)));
 }
 msg_make(p);


 vim_free(*cmdlinep);
 *cmdlinep = new_cmdline;
 p = new_cmdline;
    }
    return p;
}






    int
expand_filename(eap, cmdlinep, errormsgp)
    exarg_T *eap;
    char_u **cmdlinep;
    char_u **errormsgp;
{
    int has_wildcards;
    char_u *repl;
    int srclen;
    char_u *p;
    int n;
    int escaped;



    p = skip_grep_pat(eap);
# 4328 "ex_docmd.c"
    has_wildcards = mch_has_wildcard(p);
    while (*p != '\000')
    {


 if (p[0] == '`' && p[1] == '=')
 {
     p += 2;
     (void)skip_expr(&p);
     if (*p == '`')
  ++p;
     continue;
 }





 if (vim_strchr((char_u *)"%#<", *p) == ((void *)0))
 {
     ++p;
     continue;
 }




 repl = eval_vars(p, eap->arg, &srclen, &(eap->do_ecmd_lnum),
        errormsgp, &escaped);
 if (*errormsgp != ((void *)0))
     return 0;
 if (repl == ((void *)0))
 {
     p += srclen;
     continue;
 }



 if (vim_strchr(repl, '$') != ((void *)0) || vim_strchr(repl, '~') != ((void *)0))
 {
     char_u *l = repl;

     repl = expand_env_save(repl);
     vim_free(l);
 }
# 4382 "ex_docmd.c"
 if (!eap->usefilter
  && !escaped
  && eap->cmdidx != CMD_bang
  && eap->cmdidx != CMD_make
  && eap->cmdidx != CMD_lmake
  && eap->cmdidx != CMD_grep
  && eap->cmdidx != CMD_lgrep
  && eap->cmdidx != CMD_grepadd
  && eap->cmdidx != CMD_lgrepadd



  )
 {
     char_u *l;
# 4406 "ex_docmd.c"
     for (l = repl; *l; ++l)
  if (vim_strchr(escape_chars, *l) != ((void *)0))
  {
      l = vim_strsave_escaped(repl, escape_chars);
      if (l != ((void *)0))
      {
   vim_free(repl);
   repl = l;
      }
      break;
  }
 }


 if ((eap->usefilter || eap->cmdidx == CMD_bang)
       && (char_u *)strpbrk((char *)(repl), (char *)((char_u *)"!&;()<>")) != ((void *)0))
 {
     char_u *l;

     l = vim_strsave_escaped(repl, (char_u *)"!&;()<>");
     if (l != ((void *)0))
     {
  vim_free(repl);
  repl = l;

  if (strstr((char *)p_sh, "sh") != ((void *)0))
  {
      l = vim_strsave_escaped(repl, (char_u *)"!");
      if (l != ((void *)0))
      {
   vim_free(repl);
   repl = l;
      }
  }
     }
 }

 p = repl_cmdline(eap, p, srclen, repl, cmdlinep);
 vim_free(repl);
 if (p == ((void *)0))
     return 0;
    }





    if ((eap->argt & 0x010) && !eap->usefilter)
    {





 for (n = 1; n <= 2; ++n)
 {
     if (n == 2)
     {
# 4473 "ex_docmd.c"
  if (!has_wildcards)
      for (p = eap->arg; *p; ++p)
      {

   if (p[1] && (*p == '\\' || *p == 22))
       ++p;
   else if (((*p) == ' ' || (*p) == '\t'))
   {
       *errormsgp = (char_u *)((char *)("E172: Only one file name allowed"));
       return 0;
   }
      }
# 4493 "ex_docmd.c"
  if (!has_wildcards)

      backslash_halve(eap->arg);
     }

     if (has_wildcards)
     {
  if (n == 1)
  {







      if (vim_strchr(eap->arg, '$') != ((void *)0)
       || vim_strchr(eap->arg, '~') != ((void *)0))
      {
   expand_env_esc(eap->arg, NameBuff, 1024,
           1, 1, ((void *)0));
   has_wildcards = mch_has_wildcard(NameBuff);
   p = NameBuff;
      }
      else
   p = ((void *)0);
  }
  else
  {
      expand_T xpc;

      ExpandInit(&xpc);
      xpc.xp_context = 2;
      p = ExpandOne(&xpc, eap->arg, ((void *)0),
         1|16,
         2);
      if (p == ((void *)0))
   return 0;
  }
  if (p != ((void *)0))
  {
      (void)repl_cmdline(eap, eap->arg, (int)strlen((char *)(eap->arg)),
         p, cmdlinep);
      if (n == 2)
   vim_free(p);
  }
     }
 }
    }
    return 1;
}
# 4553 "ex_docmd.c"
    static char_u *
repl_cmdline(eap, src, srclen, repl, cmdlinep)
    exarg_T *eap;
    char_u *src;
    int srclen;
    char_u *repl;
    char_u **cmdlinep;
{
    int len;
    int i;
    char_u *new_cmdline;






    len = (int)strlen((char *)(repl));
    i = (int)(src - *cmdlinep) + (int)strlen((char *)(src + srclen)) + len + 3;
    if (eap->nextcmd != ((void *)0))
 i += (int)strlen((char *)(eap->nextcmd));
    if ((new_cmdline = alloc((unsigned)i)) == ((void *)0))
 return ((void *)0);







    i = (int)(src - *cmdlinep);
    ((__builtin_object_size ((char *)(new_cmdline), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(new_cmdline), (char *)(*cmdlinep), (size_t)i, __builtin_object_size ((char *)(new_cmdline), 0)) : __inline_memmove_chk ((char *)(new_cmdline), (char *)(*cmdlinep), (size_t)i));

    ((__builtin_object_size ((char *)(new_cmdline + i), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(new_cmdline + i), (char *)(repl), (size_t)len, __builtin_object_size ((char *)(new_cmdline + i), 0)) : __inline_memmove_chk ((char *)(new_cmdline + i), (char *)(repl), (size_t)len));
    i += len;
    ((__builtin_object_size ((char *)(new_cmdline + i), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(new_cmdline + i), (char *)(src + srclen), __builtin_object_size ((char *)(new_cmdline + i), 1 > 1)) : __inline_strcpy_chk ((char *)(new_cmdline + i), (char *)(src + srclen)));
    src = new_cmdline + i;

    if (eap->nextcmd != ((void *)0))
    {
 i = (int)strlen((char *)(new_cmdline)) + 1;
 ((__builtin_object_size ((char *)(new_cmdline + i), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(new_cmdline + i), (char *)(eap->nextcmd), __builtin_object_size ((char *)(new_cmdline + i), 1 > 1)) : __inline_strcpy_chk ((char *)(new_cmdline + i), (char *)(eap->nextcmd)));
 eap->nextcmd = new_cmdline + i;
    }
    eap->cmd = new_cmdline + (eap->cmd - *cmdlinep);
    eap->arg = new_cmdline + (eap->arg - *cmdlinep);
    if (eap->do_ecmd_cmd != ((void *)0) && eap->do_ecmd_cmd != dollar_command)
 eap->do_ecmd_cmd = new_cmdline + (eap->do_ecmd_cmd - *cmdlinep);
    vim_free(*cmdlinep);
    *cmdlinep = new_cmdline;

    return src;
}




    void
separate_nextcmd(eap)
    exarg_T *eap;
{
    char_u *p;


    p = skip_grep_pat(eap);




    for ( ; *p; ++p)
    {
 if (*p == 22)
 {
     if (eap->argt & (0x2000 | 0x008))
  ++p;
     else

  ((__builtin_object_size ((char *)((p)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((p)), (char *)((p + 1)), strlen((char *)(p + 1)) + 1, __builtin_object_size ((char *)((p)), 0)) : __inline_memmove_chk ((char *)((p)), (char *)((p + 1)), strlen((char *)(p + 1)) + 1));
     if (*p == '\000')
  break;
 }



 else if (p[0] == '`' && p[1] == '=' && (eap->argt & 0x008))
 {
     p += 2;
     (void)skip_expr(&p);
 }





 else if ((*p == '"' && !(eap->argt & 0x800)
      && ((eap->cmdidx != CMD_at && eap->cmdidx != CMD_star)
   || p != eap->arg)
      && (eap->cmdidx != CMD_redir
   || p != eap->arg + 1 || p[-1] != '@'))
  || *p == '|' || *p == '\n')
 {




     if ((vim_strchr(p_cpo, 'b') == ((void *)0)
         || !(eap->argt & 0x2000)) && *(p - 1) == '\\')
     {
  ((__builtin_object_size ((char *)((p - 1)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((p - 1)), (char *)((p)), strlen((char *)(p)) + 1, __builtin_object_size ((char *)((p - 1)), 0)) : __inline_memmove_chk ((char *)((p - 1)), (char *)((p)), strlen((char *)(p)) + 1));
  --p;
     }
     else
     {
  eap->nextcmd = check_nextcmd(p);
  *p = '\000';
  break;
     }
 }
    }

    if (!(eap->argt & 0x800))
 del_trailing_spaces(eap->arg);
}




    static char_u *
getargcmd(argp)
    char_u **argp;
{
    char_u *arg = *argp;
    char_u *command = ((void *)0);

    if (*arg == '+')
    {
 ++arg;
 if (vim_isspace(*arg))
     command = dollar_command;
 else
 {
     command = arg;
     arg = skip_cmd_arg(command, 1);
     if (*arg != '\000')
  *arg++ = '\000';
 }

 arg = skipwhite(arg);
 *argp = arg;
    }
    return command;
}




    static char_u *
skip_cmd_arg(p, rembs)
    char_u *p;
    int rembs;
{
    while (*p && !vim_isspace(*p))
    {
 if (*p == '\\' && p[1] != '\000')
 {
     if (rembs)
  ((__builtin_object_size ((char *)((p)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((p)), (char *)((p + 1)), strlen((char *)(p + 1)) + 1, __builtin_object_size ((char *)((p)), 0)) : __inline_memmove_chk ((char *)((p)), (char *)((p + 1)), strlen((char *)(p + 1)) + 1));
     else
  ++p;
 }
 ++p;
    }
    return p;
}





    static int
getargopt(eap)
    exarg_T *eap;
{
    char_u *arg = eap->arg + 2;
    int *pp = ((void *)0);






    if (strncmp((char *)(arg), (char *)("bin"), (size_t)(3)) == 0 || strncmp((char *)(arg), (char *)("nobin"), (size_t)(5)) == 0)
    {
 if (*arg == 'n')
 {
     arg += 2;
     eap->force_bin = 2;
 }
 else
     eap->force_bin = 1;
 if (!checkforcmd(&arg, "binary", 3))
     return 0;
 eap->arg = skipwhite(arg);
 return 1;
    }


    if (strncmp((char *)(arg), (char *)("edit"), (size_t)(4)) == 0)
    {
 eap->read_edit = 1;
 eap->arg = skipwhite(arg + 4);
 return 1;
    }

    if (strncmp((char *)(arg), (char *)("ff"), (size_t)(2)) == 0)
    {
 arg += 2;
 pp = &eap->force_ff;
    }
    else if (strncmp((char *)(arg), (char *)("fileformat"), (size_t)(10)) == 0)
    {
 arg += 10;
 pp = &eap->force_ff;
    }
# 4795 "ex_docmd.c"
    if (pp == ((void *)0) || *arg != '=')
 return 0;

    ++arg;
    *pp = (int)(arg - eap->cmd);
    arg = skip_cmd_arg(arg, 0);
    eap->arg = skipwhite(arg);
    *arg = '\000';





 if (check_ff_value(eap->cmd + eap->force_ff) == 0)
     return 0;
# 4834 "ex_docmd.c"
    return 1;
}




    static void
ex_abbreviate(eap)
    exarg_T *eap;
{
    do_exmap(eap, 1);
}




    static void
ex_map(eap)
    exarg_T *eap;
{




    if (secure)
    {
 secure = 2;
 msg_outtrans(eap->cmd);
 msg_putchar('\n');
    }
    do_exmap(eap, 0);
}




    static void
ex_unmap(eap)
    exarg_T *eap;
{
    do_exmap(eap, 0);
}




    static void
ex_mapclear(eap)
    exarg_T *eap;
{
    map_clear(eap->cmd, eap->arg, eap->forceit, 0);
}




    static void
ex_abclear(eap)
    exarg_T *eap;
{
    map_clear(eap->cmd, eap->arg, 1, 1);
}


    static void
ex_autocmd(eap)
    exarg_T *eap;
{




    if (secure)
    {
 secure = 2;
 eap->errmsg = e_curdir;
    }
    else if (eap->cmdidx == CMD_autocmd)
 do_autocmd(eap->arg, eap->forceit);
    else
 do_augroup(eap->arg, eap->forceit);
}




    static void
ex_doautocmd(eap)
    exarg_T *eap;
{
    (void)do_doautocmd(eap->arg, 1);
    do_modelines(0);
}
# 4935 "ex_docmd.c"
    static void
ex_bunload(eap)
    exarg_T *eap;
{
    eap->errmsg = do_bufdel(
     eap->cmdidx == CMD_bdelete ? 3
  : eap->cmdidx == CMD_bwipeout ? 4
  : 2, eap->arg,
     eap->addr_count, (int)eap->line1, (int)eap->line2, eap->forceit);
}





    static void
ex_buffer(eap)
    exarg_T *eap;
{
    if (*eap->arg)
 eap->errmsg = e_trailing;
    else
    {
 if (eap->addr_count == 0)
     goto_buffer(eap, 0, 1, 0);
 else
     goto_buffer(eap, 1, 1, (int)eap->line2);
    }
}





    static void
ex_bmodified(eap)
    exarg_T *eap;
{
    goto_buffer(eap, 3, 1, (int)eap->line2);
}





    static void
ex_bnext(eap)
    exarg_T *eap;
{
    goto_buffer(eap, 0, 1, (int)eap->line2);
}







    static void
ex_bprevious(eap)
    exarg_T *eap;
{
    goto_buffer(eap, 0, (-1), (int)eap->line2);
}







    static void
ex_brewind(eap)
    exarg_T *eap;
{
    goto_buffer(eap, 1, 1, 0);
}





    static void
ex_blast(eap)
    exarg_T *eap;
{
    goto_buffer(eap, 2, (-1), 0);
}


    int
ends_excmd(c)
    int c;
{
    return (c == '\000' || c == '|' || c == '"' || c == '\n');
}







    char_u *
find_nextcmd(p)
    char_u *p;
{
    while (*p != '|' && *p != '\n')
    {
 if (*p == '\000')
     return ((void *)0);
 ++p;
    }
    return (p + 1);
}






    char_u *
check_nextcmd(p)
    char_u *p;
{
    p = skipwhite(p);
    if (*p == '|' || *p == '\n')
 return (p + 1);
    else
 return ((void *)0);
}
# 5075 "ex_docmd.c"
    static int
check_more(message, forceit)
    int message;
    int forceit;
{
    int n = ((curwin)->w_alist->al_ga.ga_len) - curwin->w_arg_idx - 1;

    if (!forceit && only_one_window()
     && ((curwin)->w_alist->al_ga.ga_len) > 1 && !arg_had_last && n >= 0 && quitmore == 0)
    {
 if (message)
 {

     if ((p_confirm || cmdmod.confirm) && curbuf->b_fname != ((void *)0))
     {
  char_u buff[(1024+1)];

  if (n == 1)
      ((__builtin_object_size ((char *)(buff), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(buff), (char *)(((char *)("1 more file to edit.  Quit anyway?"))), __builtin_object_size ((char *)(buff), 1 > 1)) : __inline_strcpy_chk ((char *)(buff), (char *)(((char *)("1 more file to edit.  Quit anyway?")))));
  else
      vim_snprintf((char *)buff, (1024+1),
         ((char *)("%d more files to edit.  Quit anyway?")), n);
  if (vim_dialog_yesno(4, ((void *)0), buff, 1) == 2)
      return 1;
  return 0;
     }

     if (n == 1)
  emsg((char_u *)(((char *)("E173: 1 more file to edit"))));
     else
  emsgn((char_u *)(((char *)("E173: %ld more files to edit"))), (long)(n));
     quitmore = 2;
 }
 return 0;
    }
    return 1;
}





    char_u *
get_command_name(xp, idx)
    expand_T *xp __attribute__((unused));
    int idx;
{
    if (idx >= (int)CMD_SIZE)

 return get_user_command_name(idx);



    return cmdnames[idx].cmd_name;
}



static int uc_add_command (char_u *name, size_t name_len, char_u *rep, long argt, long def, int flags, int compl, char_u *compl_arg, int force);
static void uc_list (char_u *name, size_t name_len);
static int uc_scan_attr (char_u *attr, size_t len, long *argt, long *def, int *flags, int *compl, char_u **compl_arg);
static char_u *uc_split_args (char_u *arg, size_t *lenp);
static size_t uc_check_code (char_u *code, size_t len, char_u *buf, ucmd_T *cmd, exarg_T *eap, char_u **split_buf, size_t *split_len);

    static int
uc_add_command(name, name_len, rep, argt, def, flags, compl, compl_arg, force)
    char_u *name;
    size_t name_len;
    char_u *rep;
    long argt;
    long def;
    int flags;
    int compl;
    char_u *compl_arg;
    int force;
{
    ucmd_T *cmd = ((void *)0);
    char_u *p;
    int i;
    int cmp = 1;
    char_u *rep_buf = ((void *)0);
    garray_T *gap;

    replace_termcodes(rep, &rep_buf, 0, 0, 0);
    if (rep_buf == ((void *)0))
    {

 rep_buf = vim_strsave(rep);


 if (rep_buf == ((void *)0))
     return 0;
    }


    if (flags & 1)
    {
 gap = &curbuf->b_ucmds;
 if (gap->ga_itemsize == 0)
     ga_init2(gap, (int)sizeof(ucmd_T), 4);
    }
    else
 gap = &ucmds;


    for (i = 0; i < gap->ga_len; ++i)
    {
 size_t len;

 cmd = (&((ucmd_T *)((gap)->ga_data))[i]);
 len = strlen((char *)(cmd->uc_name));
 cmp = strncmp((char *)(name), (char *)(cmd->uc_name), (size_t)(name_len));
 if (cmp == 0)
 {
     if (name_len < len)
  cmp = -1;
     else if (name_len > len)
  cmp = 1;
 }

 if (cmp == 0)
 {
     if (!force)
     {
  emsg((char_u *)(((char *)("E174: Command already exists: add ! to replace it"))));
  goto fail;
     }

     vim_free(cmd->uc_rep);
     cmd->uc_rep = ((void *)0);

     vim_free(cmd->uc_compl_arg);
     cmd->uc_compl_arg = ((void *)0);

     break;
 }


 if (cmp < 0)
     break;
    }


    if (cmp != 0)
    {
 if (ga_grow(gap, 1) != 1)
     goto fail;
 if ((p = vim_strnsave(name, (int)name_len)) == ((void *)0))
     goto fail;

 cmd = (&((ucmd_T *)((gap)->ga_data))[i]);
 ((__builtin_object_size ((char *)(cmd + 1), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(cmd + 1), (char *)(cmd), (gap->ga_len - i) * sizeof(ucmd_T), __builtin_object_size ((char *)(cmd + 1), 0)) : __inline_memmove_chk ((char *)(cmd + 1), (char *)(cmd), (gap->ga_len - i) * sizeof(ucmd_T)));

 ++gap->ga_len;

 cmd->uc_name = p;
    }

    cmd->uc_rep = rep_buf;
    cmd->uc_argt = argt;
    cmd->uc_def = def;
    cmd->uc_compl = compl;

    cmd->uc_scriptID = current_SID;

    cmd->uc_compl_arg = compl_arg;



    return 1;

fail:
    vim_free(rep_buf);

    vim_free(compl_arg);

    return 0;
}





static struct
{
    int expand;
    char *name;
} command_complete[] =
{
    {14, "augroup"},
    {9, "buffer"},
    {1, "command"},




    {30, "custom"},
    {31, "customlist"},

    {3, "dir"},
    {26, "environment"},
    {10, "event"},
    {20, "expression"},
    {2, "file"},
    {37, "filetype"},
    {18, "function"},
    {8, "help"},
    {13, "highlight"},
    {16, "mapping"},
    {11, "menu"},
    {39, "syntax"},
    {4, "option"},
    {32, "shellcmd"},

    {34, "sign"},

    {6, "tag"},
    {17, "tag_listfiles"},
    {15, "var"},
    {0, ((void *)0)}
};

    static void
uc_list(name, name_len)
    char_u *name;
    size_t name_len;
{
    int i, j;
    int found = 0;
    ucmd_T *cmd;
    int len;
    long a;
    garray_T *gap;

    gap = &curbuf->b_ucmds;
    for (;;)
    {
 for (i = 0; i < gap->ga_len; ++i)
 {
     cmd = (&((ucmd_T *)((gap)->ga_data))[i]);
     a = (long)cmd->uc_argt;


     if (strncmp((char *)(name), (char *)(cmd->uc_name), (size_t)(name_len)) != 0)
  continue;


     if (!found)
  msg_puts_title((char_u *)(((char *)("\n    Name        Args Range Complete  Definition"))));
     found = 1;
     msg_putchar('\n');
     if (got_int)
  break;


     msg_putchar(a & 0x002 ? '!' : ' ');
     msg_putchar(a & 0x200 ? '"' : ' ');
     msg_putchar(gap != &ucmds ? 'b' : ' ');
     msg_putchar(' ');

     msg_outtrans_attr(cmd->uc_name, highlight_attr[(int)(HLF_D)]);
     len = (int)strlen((char *)(cmd->uc_name)) + 4;

     do {
  msg_putchar(' ');
  ++len;
     } while (len < 16);

     len = 0;


     switch ((int)(a & (0x004|0x010|0x080)))
     {
     case 0: IObuff[len++] = '0'; break;
     case (0x004): IObuff[len++] = '*'; break;
     case (0x004|0x010): IObuff[len++] = '?'; break;
     case (0x004|0x080): IObuff[len++] = '+'; break;
     case (0x004|0x010|0x080): IObuff[len++] = '1'; break;
     }

     do {
  IObuff[len++] = ' ';
     } while (len < 5);


     if (a & (0x001|0x400))
     {
  if (a & 0x400)
  {

      __builtin___sprintf_chk ((char *)IObuff + len, 0, __builtin_object_size ((char *)IObuff + len, 1 > 1), "%ldc", cmd->uc_def);
      len += (int)strlen((char *)(IObuff + len));
  }
  else if (a & 0x020)
      IObuff[len++] = '%';
  else if (cmd->uc_def >= 0)
  {

      __builtin___sprintf_chk ((char *)IObuff + len, 0, __builtin_object_size ((char *)IObuff + len, 1 > 1), "%ld", cmd->uc_def);
      len += (int)strlen((char *)(IObuff + len));
  }
  else
      IObuff[len++] = '.';
     }

     do {
  IObuff[len++] = ' ';
     } while (len < 11);


     for (j = 0; command_complete[j].expand != 0; ++j)
  if (command_complete[j].expand == cmd->uc_compl)
  {
      ((__builtin_object_size ((char *)(IObuff + len), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(IObuff + len), (char *)(command_complete[j].name), __builtin_object_size ((char *)(IObuff + len), 1 > 1)) : __inline_strcpy_chk ((char *)(IObuff + len), (char *)(command_complete[j].name)));
      len += (int)strlen((char *)(IObuff + len));
      break;
  }

     do {
  IObuff[len++] = ' ';
     } while (len < 21);

     IObuff[len] = '\0';
     msg_outtrans(IObuff);

     msg_outtrans_special(cmd->uc_rep, 0);

     if (p_verbose > 0)
  last_set_msg(cmd->uc_scriptID);

     out_flush();
     ui_breakcheck();
     if (got_int)
  break;
 }
 if (gap == &ucmds || i < gap->ga_len)
     break;
 gap = &ucmds;
    }

    if (!found)
 msg((char_u *)(((char *)("No user-defined commands found"))));
}

    static char_u *
uc_fun_cmd()
{
    static char_u fcmd[] = {0x84, 0xaf, 0x60, 0xb9, 0xaf, 0xb5, 0x60, 0xa4,
       0xa5, 0xad, 0xa1, 0xae, 0xa4, 0x60, 0xa1, 0x60,
       0xb3, 0xa8, 0xb2, 0xb5, 0xa2, 0xa2, 0xa5, 0xb2,
       0xb9, 0x7f, 0};
    int i;

    for (i = 0; fcmd[i]; ++i)
 IObuff[i] = fcmd[i] - 0x40;
    IObuff[i] = 0;
    return IObuff;
}

    static int
uc_scan_attr(attr, len, argt, def, flags, compl, compl_arg)
    char_u *attr;
    size_t len;
    long *argt;
    long *def;
    int *flags;
    int *compl;
    char_u **compl_arg;
{
    char_u *p;

    if (len == 0)
    {
 emsg((char_u *)(((char *)("E175: No attribute specified"))));
 return 0;
    }


    if (strncasecmp((char *)(attr), (char *)("bang"), (size_t)(len)) == 0)
 *argt |= 0x002;
    else if (strncasecmp((char *)(attr), (char *)("buffer"), (size_t)(len)) == 0)
 *flags |= 1;
    else if (strncasecmp((char *)(attr), (char *)("register"), (size_t)(len)) == 0)
 *argt |= 0x200;
    else if (strncasecmp((char *)(attr), (char *)("bar"), (size_t)(len)) == 0)
 *argt |= 0x100;
    else
    {
 int i;
 char_u *val = ((void *)0);
 size_t vallen = 0;
 size_t attrlen = len;


 for (i = 0; i < (int)len; ++i)
 {
     if (attr[i] == '=')
     {
  val = &attr[i + 1];
  vallen = len - i - 1;
  attrlen = i;
  break;
     }
 }

 if (strncasecmp((char *)(attr), (char *)("nargs"), (size_t)(attrlen)) == 0)
 {
     if (vallen == 1)
     {
  if (*val == '0')
                                            ;
  else if (*val == '1')
      *argt |= (0x004 | 0x010 | 0x080);
  else if (*val == '*')
      *argt |= 0x004;
  else if (*val == '?')
      *argt |= (0x004 | 0x010);
  else if (*val == '+')
      *argt |= (0x004 | 0x080);
  else
      goto wrong_nargs;
     }
     else
     {
wrong_nargs:
  emsg((char_u *)(((char *)("E176: Invalid number of arguments"))));
  return 0;
     }
 }
 else if (strncasecmp((char *)(attr), (char *)("range"), (size_t)(attrlen)) == 0)
 {
     *argt |= 0x001;
     if (vallen == 1 && *val == '%')
  *argt |= 0x020;
     else if (val != ((void *)0))
     {
  p = val;
  if (*def >= 0)
  {
two_count:
      emsg((char_u *)(((char *)("E177: Count cannot be specified twice"))));
      return 0;
  }

  *def = getdigits(&p);
  *argt |= (0x1000 | 0x4000);

  if (p != val + vallen || vallen == 0)
  {
invalid_count:
      emsg((char_u *)(((char *)("E178: Invalid default value for count"))));
      return 0;
  }
     }
 }
 else if (strncasecmp((char *)(attr), (char *)("count"), (size_t)(attrlen)) == 0)
 {
     *argt |= (0x400 | 0x1000 | 0x001 | 0x4000);

     if (val != ((void *)0))
     {
  p = val;
  if (*def >= 0)
      goto two_count;

  *def = getdigits(&p);

  if (p != val + vallen)
      goto invalid_count;
     }

     if (*def < 0)
  *def = 0;
 }
 else if (strncasecmp((char *)(attr), (char *)("complete"), (size_t)(attrlen)) == 0)
 {
     if (val == ((void *)0))
     {
  emsg((char_u *)(((char *)("E179: argument required for -complete"))));
  return 0;
     }

     if (parse_compl_arg(val, (int)vallen, compl, argt, compl_arg)
              == 0)
  return 0;
 }
 else
 {
     char_u ch = attr[len];
     attr[len] = '\0';
     emsg2((char_u *)(((char *)("E181: Invalid attribute: %s"))), (char_u *)(attr));
     attr[len] = ch;
     return 0;
 }
    }

    return 1;
}




    static void
ex_command(eap)
    exarg_T *eap;
{
    char_u *name;
    char_u *end;
    char_u *p;
    long argt = 0;
    long def = -1;
    int flags = 0;
    int compl = 0;
    char_u *compl_arg = ((void *)0);
    int has_attr = (eap->arg[0] == '-');

    p = eap->arg;


    while (*p == '-')
    {
 ++p;
 end = skiptowhite(p);
 if (uc_scan_attr(p, end - p, &argt, &def, &flags, &compl, &compl_arg)
  == 0)
     return;
 p = skipwhite(end);
    }


    name = p;
    if (((*p) < 0x7f && isalpha(*p)))
 while (((*p) < 0x7f && isalnum(*p)))
     ++p;
    if (!ends_excmd(*p) && !((*p) == ' ' || (*p) == '\t'))
    {
 emsg((char_u *)(((char *)("E182: Invalid command name"))));
 return;
    }
    end = p;




    p = skipwhite(end);
    if (!has_attr && ends_excmd(*p))
    {
 uc_list(name, end - name);
    }
    else if (!((*name) < 0x7f && isupper(*name)))
    {
 emsg((char_u *)(((char *)("E183: User defined commands must start with an uppercase letter"))));
 return;
    }
    else
 uc_add_command(name, end - name, p, argt, def, flags, compl, compl_arg,
        eap->forceit);
}





    void
ex_comclear(eap)
    exarg_T *eap __attribute__((unused));
{
    uc_clear(&ucmds);
    uc_clear(&curbuf->b_ucmds);
}




    void
uc_clear(gap)
    garray_T *gap;
{
    int i;
    ucmd_T *cmd;

    for (i = 0; i < gap->ga_len; ++i)
    {
 cmd = (&((ucmd_T *)((gap)->ga_data))[i]);
 vim_free(cmd->uc_name);
 vim_free(cmd->uc_rep);

 vim_free(cmd->uc_compl_arg);

    }
    ga_clear(gap);
}

    static void
ex_delcommand(eap)
    exarg_T *eap;
{
    int i = 0;
    ucmd_T *cmd = ((void *)0);
    int cmp = -1;
    garray_T *gap;

    gap = &curbuf->b_ucmds;
    for (;;)
    {
 for (i = 0; i < gap->ga_len; ++i)
 {
     cmd = (&((ucmd_T *)((gap)->ga_data))[i]);
     cmp = strcmp((char *)(eap->arg), (char *)(cmd->uc_name));
     if (cmp <= 0)
  break;
 }
 if (gap == &ucmds || cmp == 0)
     break;
 gap = &ucmds;
    }

    if (cmp != 0)
    {
 emsg2((char_u *)(((char *)("E184: No such user-defined command: %s"))), (char_u *)(eap->arg));
 return;
    }

    vim_free(cmd->uc_name);
    vim_free(cmd->uc_rep);

    vim_free(cmd->uc_compl_arg);


    --gap->ga_len;

    if (i < gap->ga_len)
 ((__builtin_object_size ((char *)(cmd), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(cmd), (char *)(cmd + 1), (gap->ga_len - i) * sizeof(ucmd_T), __builtin_object_size ((char *)(cmd), 0)) : __inline_memmove_chk ((char *)(cmd), (char *)(cmd + 1), (gap->ga_len - i) * sizeof(ucmd_T)));
}




    static char_u *
uc_split_args(arg, lenp)
    char_u *arg;
    size_t *lenp;
{
    char_u *buf;
    char_u *p;
    char_u *q;
    int len;


    p = arg;
    len = 2;

    while (*p)
    {
 if (p[0] == '\\' && p[1] == '\\')
 {
     len += 2;
     p += 2;
 }
 else if (p[0] == '\\' && ((p[1]) == ' ' || (p[1]) == '\t'))
 {
     len += 1;
     p += 2;
 }
 else if (*p == '\\' || *p == '"')
 {
     len += 2;
     p += 1;
 }
 else if (((*p) == ' ' || (*p) == '\t'))
 {
     p = skipwhite(p);
     if (*p == '\000')
  break;
     len += 3;
 }
 else
 {
     ++len;
     ++p;
 }
    }

    buf = alloc(len + 1);
    if (buf == ((void *)0))
    {
 *lenp = 0;
 return buf;
    }

    p = arg;
    q = buf;
    *q++ = '"';
    while (*p)
    {
 if (p[0] == '\\' && p[1] == '\\')
 {
     *q++ = '\\';
     *q++ = '\\';
     p += 2;
 }
 else if (p[0] == '\\' && ((p[1]) == ' ' || (p[1]) == '\t'))
 {
     *q++ = p[1];
     p += 2;
 }
 else if (*p == '\\' || *p == '"')
 {
     *q++ = '\\';
     *q++ = *p++;
 }
 else if (((*p) == ' ' || (*p) == '\t'))
 {
     p = skipwhite(p);
     if (*p == '\000')
  break;
     *q++ = '"';
     *q++ = ',';
     *q++ = '"';
 }
 else
 {
     *q++ = *p++;
 }
    }
    *q++ = '"';
    *q = 0;

    *lenp = len;
    return buf;
}
# 5816 "ex_docmd.c"
    static size_t
uc_check_code(code, len, buf, cmd, eap, split_buf, split_len)
    char_u *code;
    size_t len;
    char_u *buf;
    ucmd_T *cmd;
    exarg_T *eap;
    char_u **split_buf;
    size_t *split_len;
{
    size_t result = 0;
    char_u *p = code + 1;
    size_t l = len - 2;
    int quote = 0;
    enum { ct_ARGS, ct_BANG, ct_COUNT, ct_LINE1, ct_LINE2, ct_REGISTER,
 ct_LT, ct_NONE } type = ct_NONE;

    if ((vim_strchr((char_u *)"qQfF", *p) != ((void *)0)) && p[1] == '-')
    {
 quote = (*p == 'q' || *p == 'Q') ? 1 : 2;
 p += 2;
 l -= 2;
    }

    ++l;
    if (l <= 1)
 type = ct_NONE;
    else if (strncasecmp((char *)(p), (char *)("args>"), (size_t)(l)) == 0)
 type = ct_ARGS;
    else if (strncasecmp((char *)(p), (char *)("bang>"), (size_t)(l)) == 0)
 type = ct_BANG;
    else if (strncasecmp((char *)(p), (char *)("count>"), (size_t)(l)) == 0)
 type = ct_COUNT;
    else if (strncasecmp((char *)(p), (char *)("line1>"), (size_t)(l)) == 0)
 type = ct_LINE1;
    else if (strncasecmp((char *)(p), (char *)("line2>"), (size_t)(l)) == 0)
 type = ct_LINE2;
    else if (strncasecmp((char *)(p), (char *)("lt>"), (size_t)(l)) == 0)
 type = ct_LT;
    else if (strncasecmp((char *)(p), (char *)("reg>"), (size_t)(l)) == 0 || strncasecmp((char *)(p), (char *)("register>"), (size_t)(l)) == 0)
 type = ct_REGISTER;

    switch (type)
    {
    case ct_ARGS:

 if (*eap->arg == '\000')
 {
     if (quote == 1)
     {
  result = 2;
  if (buf != ((void *)0))
      ((__builtin_object_size ((char *)(buf), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(buf), (char *)("''"), __builtin_object_size ((char *)(buf), 1 > 1)) : __inline_strcpy_chk ((char *)(buf), (char *)("''")));
     }
     else
  result = 0;
     break;
 }



 if ((eap->argt & 0x010) && quote == 2)
     quote = 1;

 switch (quote)
 {
 case 0:
     result = strlen((char *)(eap->arg));
     if (buf != ((void *)0))
  ((__builtin_object_size ((char *)(buf), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(buf), (char *)(eap->arg), __builtin_object_size ((char *)(buf), 1 > 1)) : __inline_strcpy_chk ((char *)(buf), (char *)(eap->arg)));
     break;
 case 1:
     result = strlen((char *)(eap->arg)) + 2;
     for (p = eap->arg; *p; ++p)
     {
  if (*p == '\\' || *p == '"')
      ++result;
     }

     if (buf != ((void *)0))
     {
  *buf++ = '"';
  for (p = eap->arg; *p; ++p)
  {
      if (*p == '\\' || *p == '"')
   *buf++ = '\\';
      *buf++ = *p;
  }
  *buf = '"';
     }

     break;
 case 2:

     if (*split_buf == ((void *)0))
  *split_buf = uc_split_args(eap->arg, split_len);

     result = *split_len;
     if (buf != ((void *)0) && result != 0)
  ((__builtin_object_size ((char *)(buf), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(buf), (char *)(*split_buf), __builtin_object_size ((char *)(buf), 1 > 1)) : __inline_strcpy_chk ((char *)(buf), (char *)(*split_buf)));

     break;
 }
 break;

    case ct_BANG:
 result = eap->forceit ? 1 : 0;
 if (quote)
     result += 2;
 if (buf != ((void *)0))
 {
     if (quote)
  *buf++ = '"';
     if (eap->forceit)
  *buf++ = '!';
     if (quote)
  *buf = '"';
 }
 break;

    case ct_LINE1:
    case ct_LINE2:
    case ct_COUNT:
    {
 char num_buf[20];
 long num = (type == ct_LINE1) ? eap->line1 :
     (type == ct_LINE2) ? eap->line2 :
     (eap->addr_count > 0) ? eap->line2 : cmd->uc_def;
 size_t num_len;

 __builtin___sprintf_chk (num_buf, 0, __builtin_object_size (num_buf, 1 > 1), "%ld", num);
 num_len = strlen((char *)(num_buf));
 result = num_len;

 if (quote)
     result += 2;

 if (buf != ((void *)0))
 {
     if (quote)
  *buf++ = '"';
     ((__builtin_object_size ((char *)(buf), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(buf), (char *)(num_buf), __builtin_object_size ((char *)(buf), 1 > 1)) : __inline_strcpy_chk ((char *)(buf), (char *)(num_buf)));
     buf += num_len;
     if (quote)
  *buf = '"';
 }

 break;
    }

    case ct_REGISTER:
 result = eap->regname ? 1 : 0;
 if (quote)
     result += 2;
 if (buf != ((void *)0))
 {
     if (quote)
  *buf++ = '\'';
     if (eap->regname)
  *buf++ = eap->regname;
     if (quote)
  *buf = '\'';
 }
 break;

    case ct_LT:
 result = 1;
 if (buf != ((void *)0))
     *buf = '<';
 break;

    default:

 result = (size_t)-1;
 if (buf != ((void *)0))
     *buf = '<';
 break;
    }

    return result;
}

    static void
do_ucmd(eap)
    exarg_T *eap;
{
    char_u *buf;
    char_u *p;
    char_u *q;

    char_u *start;
    char_u *end = ((void *)0);
    char_u *ksp;
    size_t len, totlen;

    size_t split_len = 0;
    char_u *split_buf = ((void *)0);
    ucmd_T *cmd;

    scid_T save_current_SID = current_SID;


    if (eap->cmdidx == CMD_USER)
 cmd = (&((ucmd_T *)(ucmds.ga_data))[eap->useridx]);
    else
 cmd = (&((ucmd_T *)((&curbuf->b_ucmds)->ga_data))[eap->useridx]);






    buf = ((void *)0);
    for (;;)
    {
 p = cmd->uc_rep;
 q = buf;
 totlen = 0;

 for (;;)
 {
     start = vim_strchr(p, '<');
     if (start != ((void *)0))
  end = vim_strchr(start + 1, '>');
     if (buf != ((void *)0))
     {
  ksp = vim_strchr(p, (0x80));
  if (ksp != ((void *)0) && (start == ((void *)0) || ksp < start || end == ((void *)0))
   && ((ksp[1] == 254 && ksp[2] == ('X'))



       ))
  {




      len = ksp - p;
      if (len > 0)
      {
   ((__builtin_object_size ((char *)(q), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(q), (char *)(p), len, __builtin_object_size ((char *)(q), 0)) : __inline_memmove_chk ((char *)(q), (char *)(p), len));
   q += len;
      }
      *q++ = ksp[1] == 254 ? (0x80) : 0x9b;
      p = ksp + 3;
      continue;
  }
     }


     if (start == ((void *)0) || end == ((void *)0))
  break;


     ++end;


     len = start - p;
     if (buf == ((void *)0))
  totlen += len;
     else
     {
  ((__builtin_object_size ((char *)(q), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(q), (char *)(p), len, __builtin_object_size ((char *)(q), 0)) : __inline_memmove_chk ((char *)(q), (char *)(p), len));
  q += len;
     }

     len = uc_check_code(start, end - start, q, cmd, eap,
        &split_buf, &split_len);
     if (len == (size_t)-1)
     {

  p = start + 1;
  len = 1;
     }
     else
  p = end;
     if (buf == ((void *)0))
  totlen += len;
     else
  q += len;
 }
 if (buf != ((void *)0))
 {
     ((__builtin_object_size ((char *)(q), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(q), (char *)(p), __builtin_object_size ((char *)(q), 1 > 1)) : __inline_strcpy_chk ((char *)(q), (char *)(p)));
     break;
 }

 totlen += strlen((char *)(p));
 buf = alloc((unsigned)(totlen + 1));
 if (buf == ((void *)0))
 {
     vim_free(split_buf);
     return;
 }
    }


    current_SID = cmd->uc_scriptID;

    (void)do_cmdline(buf, eap->getline, eap->cookie,
       0x01|0x02|0x08);

    current_SID = save_current_SID;

    vim_free(buf);
    vim_free(split_buf);
}


    static char_u *
get_user_command_name(idx)
    int idx;
{
    return get_user_commands(((void *)0), idx - (int)CMD_SIZE);
}




    char_u *
get_user_commands(xp, idx)
    expand_T *xp __attribute__((unused));
    int idx;
{
    if (idx < curbuf->b_ucmds.ga_len)
 return (&((ucmd_T *)((&curbuf->b_ucmds)->ga_data))[idx])->uc_name;
    idx -= curbuf->b_ucmds.ga_len;
    if (idx < ucmds.ga_len)
 return (&((ucmd_T *)(ucmds.ga_data))[idx])->uc_name;
    return ((void *)0);
}





    char_u *
get_user_cmd_flags(xp, idx)
    expand_T *xp __attribute__((unused));
    int idx;
{
    static char *user_cmd_flags[] =
 {"bang", "bar", "buffer", "complete", "count",
     "nargs", "range", "register"};

    if (idx >= (int)(sizeof(user_cmd_flags) / sizeof(user_cmd_flags[0])))
 return ((void *)0);
    return (char_u *)user_cmd_flags[idx];
}




    char_u *
get_user_cmd_nargs(xp, idx)
    expand_T *xp __attribute__((unused));
    int idx;
{
    static char *user_cmd_nargs[] = {"0", "1", "*", "?", "+"};

    if (idx >= (int)(sizeof(user_cmd_nargs) / sizeof(user_cmd_nargs[0])))
 return ((void *)0);
    return (char_u *)user_cmd_nargs[idx];
}




    char_u *
get_user_cmd_complete(xp, idx)
    expand_T *xp __attribute__((unused));
    int idx;
{
    return (char_u *)command_complete[idx].name;
}
# 6204 "ex_docmd.c"
    int
parse_compl_arg(value, vallen, complp, argt, compl_arg)
    char_u *value;
    int vallen;
    int *complp;
    long *argt;
    char_u **compl_arg;
{
    char_u *arg = ((void *)0);
    size_t arglen = 0;
    int i;
    int valend = vallen;


    for (i = 0; i < vallen; ++i)
    {
 if (value[i] == ',')
 {
     arg = &value[i + 1];
     arglen = vallen - i - 1;
     valend = i;
     break;
 }
    }

    for (i = 0; command_complete[i].expand != 0; ++i)
    {
 if ((int)strlen((char *)(command_complete[i].name)) == valend
  && strncmp((char *)(value), (char *)(command_complete[i].name), (size_t)(valend)) == 0)
 {
     *complp = command_complete[i].expand;
     if (command_complete[i].expand == 9)
  *argt |= 0x10000L;
     else if (command_complete[i].expand == 3
      || command_complete[i].expand == 2)
  *argt |= 0x008;
     break;
 }
    }

    if (command_complete[i].expand == 0)
    {
 emsg2((char_u *)(((char *)("E180: Invalid complete value: %s"))), (char_u *)(value));
 return 0;
    }


    if (*complp != 30 && *complp != 31
              && arg != ((void *)0))



    {
 emsg((char_u *)(((char *)("E468: Completion argument only allowed for custom completion"))));
 return 0;
    }


    if ((*complp == 30 || *complp == 31)
              && arg == ((void *)0))
    {
 emsg((char_u *)(((char *)("E467: Custom completion requires a function argument"))));
 return 0;
    }

    if (arg != ((void *)0))
 *compl_arg = vim_strnsave(arg, (int)arglen);

    return 1;
}


    static void
ex_colorscheme(eap)
    exarg_T *eap;
{
    if (*eap->arg == '\000')
    {

 char_u *expr = vim_strsave((char_u *)"g:colors_name");
 char_u *p = ((void *)0);

 if (expr != ((void *)0))
 {
     ++emsg_off;
     p = eval_to_string(expr, ((void *)0), 0);
     --emsg_off;
     vim_free(expr);
 }
 if (p != ((void *)0))
 {
     msg((char_u *)(p));
     vim_free(p);
 }
 else
     msg((char_u *)("default"));



    }
    else if (load_colors(eap->arg) == 0)
 emsg2((char_u *)(((char *)("E185: Cannot find color scheme %s"))), (char_u *)(eap->arg));
}

    static void
ex_highlight(eap)
    exarg_T *eap;
{
    if (*eap->arg == '\000' && eap->cmd[2] == '!')
 msg((char_u *)(((char *)("Greetings, Vim user!"))));
    do_highlight(eap->arg, eap->forceit, 0);
}






    void
not_exiting()
{
    exiting = 0;
    settmode(2);
}




    static void
ex_quit(eap)
    exarg_T *eap;
{

    if (cmdwin_type != 0)
    {
 cmdwin_result = 3;
 return;
    }


    if (text_locked())
    {
 text_locked_msg();
 return;
    }

    if (curbuf_locked())
 return;



    netbeansForcedQuit = eap->forceit;





    if (check_more(0, eap->forceit) == 1 && only_one_window())
 exiting = 1;
    if ((!(buf_hide(curbuf))
  && check_changed(curbuf, p_awa, 0, eap->forceit, 0))
     || check_more(1, eap->forceit) == 0
     || (only_one_window() && check_changed_any(eap->forceit)))
    {
 not_exiting();
    }
    else
    {

 if (only_one_window())

     getout(0);





 win_close(curwin, !(buf_hide(curwin->w_buffer)) || eap->forceit);

    }
}




    static void
ex_cquit(eap)
    exarg_T *eap __attribute__((unused));
{
    getout(1);

}




    static void
ex_quit_all(eap)
    exarg_T *eap;
{

    if (cmdwin_type != 0)
    {
 if (eap->forceit)
     cmdwin_result = (-((253) + ((int)(KE_XF1) << 8)));
 else
     cmdwin_result = (-((253) + ((int)(KE_XF2) << 8)));
 return;
    }



    if (text_locked())
    {
 text_locked_msg();
 return;
    }

    if (curbuf_locked())
 return;


    exiting = 1;
    if (eap->forceit || !check_changed_any(0))
 getout(0);
    not_exiting();
}





    static void
ex_close(eap)
    exarg_T *eap;
{

    if (cmdwin_type != 0)
 cmdwin_result = (-((253) + ((int)(KE_IGNORE) << 8)));
    else

 if (!text_locked()

  && !curbuf_locked()

  )
     ex_win_close(eap->forceit, curwin, ((void *)0));
}





    static void
ex_pclose(eap)
    exarg_T *eap;
{
    win_T *win;

    for (win = firstwin; win != ((void *)0); win = win->w_next)
 if (win->w_onebuf_opt.wo_pvw)
 {
     ex_win_close(eap->forceit, win, ((void *)0));
     break;
 }
}






    static void
ex_win_close(forceit, win, tp)
    int forceit;
    win_T *win;
    tabpage_T *tp;
{
    int need_hide;
    buf_T *buf = win->w_buffer;

    need_hide = (bufIsChanged(buf) && buf->b_nwindows <= 1);
    if (need_hide && !(buf_hide(buf)) && !forceit)
    {

 if ((p_confirm || cmdmod.confirm) && p_write)
 {
     dialog_changed(buf, 0);
     if (buf_valid(buf) && bufIsChanged(buf))
  return;
     need_hide = 0;
 }
 else

 {
     emsg((char_u *)(((char *)(e_nowrtmsg))));
     return;
 }
    }






    if (tp == ((void *)0))
 win_close(win, !need_hide && !(buf_hide(buf)));
    else
 win_close_othertab(win, !need_hide && !(buf_hide(buf)), tp);
}





    static void
ex_tabclose(eap)
    exarg_T *eap;
{
    tabpage_T *tp;


    if (cmdwin_type != 0)
 cmdwin_result = (-((253) + ((int)(KE_IGNORE) << 8)));
    else

 if (first_tabpage->tp_next == ((void *)0))
     emsg((char_u *)(((char *)("E784: Cannot close last tab page"))));
 else
 {
     if (eap->addr_count > 0)
     {
  tp = find_tabpage((int)eap->line2);
  if (tp == ((void *)0))
  {
      beep_flush();
      return;
  }
  if (tp != curtab)
  {
      tabpage_close_other(tp, eap->forceit);
      return;
  }
     }
     if (!text_locked()

      && !curbuf_locked()

        )
  tabpage_close(eap->forceit);
 }
}




    static void
ex_tabonly(eap)
    exarg_T *eap;
{
    tabpage_T *tp;
    int done;


    if (cmdwin_type != 0)
 cmdwin_result = (-((253) + ((int)(KE_IGNORE) << 8)));
    else

 if (first_tabpage->tp_next == ((void *)0))
     msg((char_u *)(((char *)("Already only one tab page"))));
 else
 {


     for (done = 0; done < 1000; ++done)
     {
  for (tp = first_tabpage; tp != ((void *)0); tp = tp->tp_next)
      if (tp->tp_topframe != topframe)
      {
   tabpage_close_other(tp, eap->forceit);

   if (valid_tabpage(tp))
       done = 1000;

   break;
      }
  if (first_tabpage->tp_next == ((void *)0))
      break;
     }
 }
}




    void
tabpage_close(forceit)
    int forceit;
{


    if (lastwin != firstwin)
 close_others(1, forceit);
    if (lastwin == firstwin)
 ex_win_close(forceit, curwin, ((void *)0));



}







    void
tabpage_close_other(tp, forceit)
    tabpage_T *tp;
    int forceit;
{
    int done = 0;
    win_T *wp;
    int h = tabline_height();



    while (++done < 1000)
    {
 wp = tp->tp_firstwin;
 ex_win_close(forceit, wp, tp);



 if (!valid_tabpage(tp) || tp->tp_firstwin == wp)
     break;
    }

    redraw_tabline = 1;
    if (h != tabline_height())
 shell_new_rows();
}




    static void
ex_only(eap)
    exarg_T *eap;
{



    close_others(1, eap->forceit);
}





    void
ex_all(eap)
    exarg_T *eap;
{
    if (eap->addr_count == 0)
 eap->line2 = 9999;
    do_arg_all((int)eap->line2, eap->forceit, eap->cmdidx == CMD_drop);
}


    static void
ex_hide(eap)
    exarg_T *eap;
{
    if (*eap->arg != '\000' && check_nextcmd(eap->arg) == ((void *)0))
 eap->errmsg = e_invarg;
    else
    {

 eap->nextcmd = check_nextcmd(eap->arg);

 if (!eap->skip)
 {



     win_close(curwin, 0);
 }

    }
}




    static void
ex_stop(eap)
    exarg_T *eap;
{



    if (!check_restricted()






     )
    {
 if (!eap->forceit)
     autowrite_all();
 windgoto((int)Rows - 1, 0);
 out_char('\n');
 out_flush();
 stoptermcap();
 out_flush();

 mch_restore_title(3);

 ui_suspend();

 maketitle();
 resettitle();

 starttermcap();
 scroll_start();
 redraw_later_clear();
 shell_resized();
    }
}




    static void
ex_exit(eap)
    exarg_T *eap;
{

    if (cmdwin_type != 0)
    {
 cmdwin_result = 3;
 return;
    }


    if (text_locked())
    {
 text_locked_msg();
 return;
    }

    if (curbuf_locked())
 return;





    if (check_more(0, eap->forceit) == 1 && only_one_window())
 exiting = 1;
    if ( ((eap->cmdidx == CMD_wq
      || curbufIsChanged())
  && do_write(eap) == 0)
     || check_more(1, eap->forceit) == 0
     || (only_one_window() && check_changed_any(eap->forceit)))
    {
 not_exiting();
    }
    else
    {

 if (only_one_window())

     getout(0);





 win_close(curwin, !(buf_hide(curwin->w_buffer)));

    }
}




    static void
ex_print(eap)
    exarg_T *eap;
{
    if (curbuf->b_ml.ml_flags & 1)
 emsg((char_u *)(((char *)(e_emptybuf))));
    else
    {
 for ( ;!got_int; ui_breakcheck())
 {
     print_line(eap->line1,
      (eap->cmdidx == CMD_number || eap->cmdidx == CMD_pound
       || (eap->flags & 0x02)),
      eap->cmdidx == CMD_list || (eap->flags & 0x01));
     if (++eap->line1 > eap->line2)
  break;
     out_flush();
 }
 setpcmark();

 curwin->w_cursor.lnum = eap->line2;
 beginline(2 | 4);
    }

    ex_no_reprint = 1;
}


    static void
ex_goto(eap)
    exarg_T *eap;
{
    goto_byte(eap->line2);
}





    static void
ex_shell(eap)
    exarg_T *eap __attribute__((unused));
{
    do_shell(((void *)0), 0);
}
# 6940 "ex_docmd.c"
    void
alist_clear(al)
    alist_T *al;
{
    while (--al->al_ga.ga_len >= 0)
 vim_free(((aentry_T *)((al)->al_ga.ga_data))[al->al_ga.ga_len].ae_fname);
    ga_clear(&al->al_ga);
}




    void
alist_init(al)
    alist_T *al;
{
    ga_init2(&al->al_ga, (int)sizeof(aentry_T), 5);
}
# 6966 "ex_docmd.c"
    void
alist_unlink(al)
    alist_T *al;
{
    if (al != &global_alist && --al->al_refcount <= 0)
    {
 alist_clear(al);
 vim_free(al);
    }
}





    void
alist_new()
{
    curwin->w_alist = (alist_T *)alloc((unsigned)sizeof(alist_T));
    if (curwin->w_alist == ((void *)0))
    {
 curwin->w_alist = &global_alist;
 ++global_alist.al_refcount;
    }
    else
    {
 curwin->w_alist->al_refcount = 1;
 alist_init(curwin->w_alist);
    }
}
# 7045 "ex_docmd.c"
    void
alist_set(al, count, files, use_curbuf, fnum_list, fnum_len)
    alist_T *al;
    int count;
    char_u **files;
    int use_curbuf;
    int *fnum_list;
    int fnum_len;
{
    int i;

    alist_clear(al);
    if (ga_grow(&al->al_ga, count) == 1)
    {
 for (i = 0; i < count; ++i)
 {
     if (got_int)
     {


  while (i < count)
      vim_free(files[i++]);
  break;
     }



     if (fnum_list != ((void *)0) && i < fnum_len)
  buf_set_name(fnum_list[i], files[i]);

     alist_add(al, files[i], use_curbuf ? 2 : 1);
     ui_breakcheck();
 }
 vim_free(files);
    }
    else
 FreeWild(count, files);

    if (al == &global_alist)

 arg_had_last = 0;
}





    void
alist_add(al, fname, set_fnum)
    alist_T *al;
    char_u *fname;
    int set_fnum;
{
    if (fname == ((void *)0))
 return;



    ((aentry_T *)((al)->al_ga.ga_data))[al->al_ga.ga_len].ae_fname = fname;
    if (set_fnum > 0)
 ((aentry_T *)((al)->al_ga.ga_data))[al->al_ga.ga_len].ae_fnum =
     buflist_add(fname, 2 | (set_fnum == 2 ? 1 : 0));
    ++al->al_ga.ga_len;
}
# 7139 "ex_docmd.c"
    static void
ex_preserve(eap)
    exarg_T *eap __attribute__((unused));
{
    curbuf->b_flags |= 0x100;
    ml_preserve(curbuf, 1);
}




    static void
ex_recover(eap)
    exarg_T *eap;
{

    recoverymode = 1;
    if (!check_changed(curbuf, p_awa, 1, eap->forceit, 0)
     && (*eap->arg == '\000'
        || setfname(curbuf, eap->arg, ((void *)0), 1) == 1))
 ml_recover();
    recoverymode = 0;
}




    static void
ex_wrongmodifier(eap)
    exarg_T *eap;
{
    eap->errmsg = e_invcmd;
}
# 7187 "ex_docmd.c"
    void
ex_splitview(eap)
    exarg_T *eap;
{
    win_T *old_curwin = curwin;

    char_u *fname = ((void *)0);
# 7214 "ex_docmd.c"
    if (bt_quickfix(curbuf) && cmdmod.tab == 0)
    {
 if (eap->cmdidx == CMD_split)
     eap->cmdidx = CMD_new;

 if (eap->cmdidx == CMD_vsplit)
     eap->cmdidx = CMD_vnew;

    }



    if (eap->cmdidx == CMD_sfind || eap->cmdidx == CMD_tabfind)
    {
 fname = find_file_in_path(eap->arg, (int)strlen((char *)(eap->arg)),
       1, 1, curbuf->b_ffname);
 if (fname == ((void *)0))
     goto theend;
 eap->arg = fname;
    }
# 7273 "ex_docmd.c"
    if (eap->cmdidx == CMD_tabedit
     || eap->cmdidx == CMD_tabfind
     || eap->cmdidx == CMD_tabnew)
    {
 if (win_new_tabpage(cmdmod.tab != 0 ? cmdmod.tab
    : eap->addr_count == 0 ? 0
            : (int)eap->line2 + 1) != 0)
 {
     do_exedit(eap, old_curwin);


     if (curwin != old_curwin
      && win_valid(old_curwin)
      && old_curwin->w_buffer != curbuf
      && !cmdmod.keepalt)
  old_curwin->w_alt_fnum = curbuf->b_fnum;
 }
    }
    else if (win_split(eap->addr_count > 0 ? (int)eap->line2 : 0,
         *eap->cmd == 'v' ? 2 : 0) != 0)
    {



 if (*eap->arg != '\000'



    )
     curwin->w_onebuf_opt.wo_scb = 0;
 else
     do_check_scrollbind(0);

 do_exedit(eap, old_curwin);
    }






theend:
    vim_free(fname);

}




    void
tabpage_new()
{
    exarg_T ea;

    ((__builtin_object_size ((&ea), 0) != (size_t) -1) ? __builtin___memset_chk ((&ea), (0), (sizeof(ea)), __builtin_object_size ((&ea), 0)) : __inline_memset_chk ((&ea), (0), (sizeof(ea))));
    ea.cmdidx = CMD_tabnew;
    ea.cmd = (char_u *)"tabn";
    ea.arg = (char_u *)"";
    ex_splitview(&ea);
}




    static void
ex_tabnext(eap)
    exarg_T *eap;
{
    switch (eap->cmdidx)
    {
 case CMD_tabfirst:
 case CMD_tabrewind:
     goto_tabpage(1);
     break;
 case CMD_tablast:
     goto_tabpage(9999);
     break;
 case CMD_tabprevious:
 case CMD_tabNext:
     goto_tabpage(eap->addr_count == 0 ? -1 : -(int)eap->line2);
     break;
 default:
     goto_tabpage(eap->addr_count == 0 ? 0 : (int)eap->line2);
     break;
    }
}




    static void
ex_tabmove(eap)
    exarg_T *eap;
{
    tabpage_move(eap->addr_count == 0 ? 9999 : (int)eap->line2);
}




    static void
ex_tabs(eap)
    exarg_T *eap __attribute__((unused));
{
    tabpage_T *tp;
    win_T *wp;
    int tabcount = 1;

    msg_start();
    msg_scroll = 1;
    for (tp = first_tabpage; tp != ((void *)0) && !got_int; tp = tp->tp_next)
    {
 msg_putchar('\n');
 vim_snprintf((char *)IObuff, (1024+1), ((char *)("Tab page %d")), tabcount++);
 msg_outtrans_attr(IObuff, highlight_attr[(int)(HLF_T)]);
 out_flush();
 ui_breakcheck();

 if (tp == curtab)
     wp = firstwin;
 else
     wp = tp->tp_firstwin;
 for ( ; wp != ((void *)0) && !got_int; wp = wp->w_next)
 {
     msg_putchar('\n');
     msg_putchar(wp == curwin ? '>' : ' ');
     msg_putchar(' ');
     msg_putchar(bufIsChanged(wp->w_buffer) ? '+' : ' ');
     msg_putchar(' ');
     if (buf_spname(wp->w_buffer) != ((void *)0))
  ((__builtin_object_size ((char *)(IObuff), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(IObuff), (char *)(buf_spname(wp->w_buffer)), __builtin_object_size ((char *)(IObuff), 1 > 1)) : __inline_strcpy_chk ((char *)(IObuff), (char *)(buf_spname(wp->w_buffer))));
     else
  home_replace(wp->w_buffer, wp->w_buffer->b_fname,
       IObuff, (1024+1), 1);
     msg_outtrans(IObuff);
     out_flush();
     ui_breakcheck();
 }
    }
}







    static void
ex_mode(eap)
    exarg_T *eap;
{
    if (*eap->arg == '\000')
 shell_resized();
    else
 mch_screenmode(eap->arg);
}






    static void
ex_resize(eap)
    exarg_T *eap;
{
    int n;
    win_T *wp = curwin;

    if (eap->addr_count > 0)
    {
 n = eap->line2;
 for (wp = firstwin; wp->w_next != ((void *)0) && --n > 0; wp = wp->w_next)
     ;
    }




    n = atol((char *)eap->arg);

    if (cmdmod.split & 2)
    {
 if (*eap->arg == '-' || *eap->arg == '+')
     n += (curwin->w_width);
 else if (n == 0 && eap->arg[0] == '\000')
     n = 9999;
 win_setwidth_win((int)n, wp);
    }
    else

    {
 if (*eap->arg == '-' || *eap->arg == '+')
     n += curwin->w_height;
 else if (n == 0 && eap->arg[0] == '\000')
     n = 9999;
 win_setheight_win((int)n, wp);
    }
}





    static void
ex_find(eap)
    exarg_T *eap;
{

    char_u *fname;
    int count;

    fname = find_file_in_path(eap->arg, (int)strlen((char *)(eap->arg)), 1,
            1, curbuf->b_ffname);
    if (eap->addr_count > 0)
    {


 count = eap->line2;
 while (fname != ((void *)0) && --count > 0)
 {
     vim_free(fname);
     fname = find_file_in_path(((void *)0), 0, 1,
           0, curbuf->b_ffname);
 }
    }

    if (fname != ((void *)0))
    {
 eap->arg = fname;

 do_exedit(eap, ((void *)0));

 vim_free(fname);
    }

}




    static void
ex_open(eap)
    exarg_T *eap;
{
    regmatch_T regmatch;
    char_u *p;

    curwin->w_cursor.lnum = eap->line2;
    beginline(2 | 4);
    if (*eap->arg == '/')
    {

 ++eap->arg;
 p = skip_regexp(eap->arg, '/', p_magic, ((void *)0));
 *p = '\000';
 regmatch.regprog = vim_regcomp(eap->arg, p_magic ? 1 : 0);
 if (regmatch.regprog != ((void *)0))
 {
     regmatch.rm_ic = p_ic;
     p = ml_get_curline();
     if (vim_regexec(&regmatch, p, (colnr_T)0))
  curwin->w_cursor.col = (colnr_T)(regmatch.startp[0] - p);
     else
  emsg((char_u *)(((char *)(e_nomatch))));
     vim_free(regmatch.regprog);
 }

 eap->arg += strlen((char *)(eap->arg));
    }
    check_cursor();

    eap->cmdidx = CMD_visual;
    do_exedit(eap, ((void *)0));
}




    static void
ex_edit(eap)
    exarg_T *eap;
{
    do_exedit(eap, ((void *)0));
}




    void
do_exedit(eap, old_curwin)
    exarg_T *eap;
    win_T *old_curwin;
{
    int n;

    int need_hide;

    int exmode_was = exmode_active;




    if (exmode_active && (eap->cmdidx == CMD_visual
      || eap->cmdidx == CMD_view))
    {
 exmode_active = 0;
 if (*eap->arg == '\000')
 {

     if (global_busy)
     {
  int rd = RedrawingDisabled;
  int nwr = no_wait_return;
  int ms = msg_scroll;




  if (eap->nextcmd != ((void *)0))
  {
      stuffReadbuff(eap->nextcmd);
      eap->nextcmd = ((void *)0);
  }

  if (exmode_was != 2)
      settmode(2);
  RedrawingDisabled = 0;
  no_wait_return = 0;
  need_wait_return = 0;
  msg_scroll = 0;



  must_redraw = 50;

  main_loop(0, 1);

  RedrawingDisabled = rd;
  no_wait_return = nwr;
  msg_scroll = ms;



     }
     return;
 }
    }

    if ((eap->cmdidx == CMD_new
  || eap->cmdidx == CMD_tabnew
  || eap->cmdidx == CMD_tabedit

  || eap->cmdidx == CMD_vnew

  ) && *eap->arg == '\000')
    {

 setpcmark();
 (void)do_ecmd(0, ((void *)0), ((void *)0), eap, (linenr_T)1,
        0x01 + (eap->forceit ? 0x08 : 0),
        old_curwin == ((void *)0) ? curwin : ((void *)0));
    }
    else if ((eap->cmdidx != CMD_split

  && eap->cmdidx != CMD_vsplit

  )
     || *eap->arg != '\000'



     )
    {



 if (*eap->arg != '\000' && curbuf_locked())
     return;

 n = readonlymode;
 if (eap->cmdidx == CMD_view || eap->cmdidx == CMD_sview)
     readonlymode = 1;
 else if (eap->cmdidx == CMD_enew)
     readonlymode = 0;

 setpcmark();
 if (do_ecmd(0, (eap->cmdidx == CMD_enew ? ((void *)0) : eap->arg),
      ((void *)0), eap,

      (*eap->arg == '\000' && eap->do_ecmd_lnum == 0
          && vim_strchr(p_cpo, 'g') != ((void *)0))
            ? (linenr_T)1 : eap->do_ecmd_lnum,
      ((buf_hide(curbuf)) ? 0x01 : 0)
      + (eap->forceit ? 0x08 : 0)

      + (eap->cmdidx == CMD_badd ? 0x10 : 0 )

      , old_curwin == ((void *)0) ? curwin : ((void *)0)) == 0)
 {


     if (old_curwin != ((void *)0))
     {
  need_hide = (curbufIsChanged() && curbuf->b_nwindows <= 1);
  if (!need_hide || (buf_hide(curbuf)))
  {

      cleanup_T cs;



      enter_cleanup(&cs);




      win_close(curwin, !need_hide && !(buf_hide(curbuf)));





      leave_cleanup(&cs);

  }
     }

 }
 else if (readonlymode && curbuf->b_nwindows == 1)
 {




     curbuf->b_p_ro = 1;
 }
 readonlymode = n;
    }
    else
    {
 if (eap->do_ecmd_cmd != ((void *)0))
     do_cmdline_cmd(eap->do_ecmd_cmd);

 n = curwin->w_arg_idx_invalid;

 check_arg_idx(curwin);

 if (n != curwin->w_arg_idx_invalid)
     maketitle();

    }






    if (old_curwin != ((void *)0)
     && *eap->arg != '\000'
     && curwin != old_curwin
     && win_valid(old_curwin)
     && old_curwin->w_buffer != curbuf
     && !cmdmod.keepalt)
 old_curwin->w_alt_fnum = curbuf->b_fnum;


    ex_no_reprint = 1;
}





    static void
ex_nogui(eap)
    exarg_T *eap;
{
    eap->errmsg = e_nogvim;
}
# 7773 "ex_docmd.c"
    static void
ex_swapname(eap)
    exarg_T *eap __attribute__((unused));
{
    if (curbuf->b_ml.ml_mfp == ((void *)0) || curbuf->b_ml.ml_mfp->mf_fname == ((void *)0))
 msg((char_u *)(((char *)("No swap file"))));
    else
 msg(curbuf->b_ml.ml_mfp->mf_fname);
}






    static void
ex_syncbind(eap)
    exarg_T *eap __attribute__((unused));
{

    win_T *wp;
    long topline;
    long y;
    linenr_T old_linenr = curwin->w_cursor.lnum;

    setpcmark();




    if (curwin->w_onebuf_opt.wo_scb)
    {
 topline = curwin->w_topline;
 for (wp = firstwin; wp; wp = wp->w_next)
 {
     if (wp->w_onebuf_opt.wo_scb && wp->w_buffer)
     {
  y = wp->w_buffer->b_ml.ml_line_count - p_so;
  if (topline > y)
      topline = y;
     }
 }
 if (topline < 1)
     topline = 1;
    }
    else
    {
 topline = 1;
    }





    wp = curwin;
    for (curwin = firstwin; curwin; curwin = curwin->w_next)
    {
 if (curwin->w_onebuf_opt.wo_scb)
 {
     y = topline - curwin->w_topline;
     if (y > 0)
  scrollup(y, 1);
     else
  scrolldown(-y, 1);
     curwin->w_scbind_pos = topline;
     redraw_later(10);
     cursor_correct();

     curwin->w_redr_status = 1;

 }
    }
    curwin = wp;
    if (curwin->w_onebuf_opt.wo_scb)
    {
 did_syncbind = 1;
 checkpcmark();
 if (old_linenr != curwin->w_cursor.lnum)
 {
     char_u ctrl_o[2];

     ctrl_o[0] = 15;
     ctrl_o[1] = 0;
     ins_typebuf(ctrl_o, -1, 0, 1, 0);
 }
    }

}


    static void
ex_read(eap)
    exarg_T *eap;
{
    int i;
    int empty = (curbuf->b_ml.ml_flags & 1);
    linenr_T lnum;

    if (eap->usefilter)
 do_bang(1, eap, 0, 0, 1);
    else
    {
 if (u_save(eap->line2, (linenr_T)(eap->line2 + 1)) == 0)
     return;
# 7896 "ex_docmd.c"
      if (*eap->arg == '\000')
 {
     if (check_fname() == 0)
  return;
     i = readfile(curbuf->b_ffname, curbuf->b_fname,
     eap->line2, (linenr_T)0, (linenr_T)(0x7fffffffL), eap, 0);
 }
 else
 {
     if (vim_strchr(p_cpo, 'a') != ((void *)0))
  (void)setaltfname(eap->arg, eap->arg, (linenr_T)1);
     i = readfile(eap->arg, ((void *)0),
     eap->line2, (linenr_T)0, (linenr_T)(0x7fffffffL), eap, 0);

 }
 if (i == 0)
 {

     if (!aborting())

  emsg2((char_u *)(((char *)(e_notopen))), (char_u *)(eap->arg));
 }
 else
 {
     if (empty && exmode_active)
     {


  if (eap->line2 == 0)
      lnum = curbuf->b_ml.ml_line_count;
  else
      lnum = 1;
  if (*ml_get(lnum) == '\000' && u_savedel(lnum, 1L) == 1)
  {
      ml_delete(lnum, 0);
      if (curwin->w_cursor.lnum > 1
          && curwin->w_cursor.lnum >= lnum)
   --curwin->w_cursor.lnum;
      deleted_lines_mark(lnum, 1L);
  }
     }
     redraw_curbuf_later(10);
 }
    }
}

static char_u *prev_dir = ((void *)0);
# 7960 "ex_docmd.c"
    void
ex_cd(eap)
    exarg_T *eap;
{
    char_u *new_dir;
    char_u *tofree;

    new_dir = eap->arg;






    {

 if (allbuf_locked())
     return;

 if (vim_strchr(p_cpo, '.') != ((void *)0) && curbufIsChanged()
            && !eap->forceit)
 {
     emsg((char_u *)(((char *)("E747: Cannot change directory, buffer is modified (add ! to override)"))));
     return;
 }


 if (strcmp((char *)(new_dir), (char *)("-")) == 0)
 {
     if (prev_dir == ((void *)0))
     {
  emsg((char_u *)(((char *)("E186: No previous directory"))));
  return;
     }
     new_dir = prev_dir;
 }


 tofree = prev_dir;
 if (mch_dirname(NameBuff, 1024) == 1)
     prev_dir = vim_strsave(NameBuff);
 else
     prev_dir = ((void *)0);



 if (*new_dir == '\000')
 {
# 8018 "ex_docmd.c"
     expand_env((char_u *)"$HOME", NameBuff, 1024);

     new_dir = NameBuff;
 }

 if (new_dir == ((void *)0) || vim_chdir(new_dir))
     emsg((char_u *)(((char *)(e_failed))));
 else
 {
     vim_free(curwin->w_localdir);
     if (eap->cmdidx == CMD_lcd || eap->cmdidx == CMD_lchdir)
     {


  if (globaldir == ((void *)0) && prev_dir != ((void *)0))
      globaldir = vim_strsave(prev_dir);

  if (mch_dirname(NameBuff, 1024) == 1)
      curwin->w_localdir = vim_strsave(NameBuff);
     }
     else
     {


  vim_free(globaldir);
  globaldir = ((void *)0);
  curwin->w_localdir = ((void *)0);
     }

     shorten_fnames(1);


     if (KeyTyped || p_verbose >= 5)
  ex_pwd(eap);
 }
 vim_free(tofree);
    }
}




    static void
ex_pwd(eap)
    exarg_T *eap __attribute__((unused));
{
    if (mch_dirname(NameBuff, 1024) == 1)
    {



 msg(NameBuff);
    }
    else
 emsg((char_u *)(((char *)("E187: Unknown"))));
}




    static void
ex_equal(eap)
    exarg_T *eap;
{
    smsg((char_u *)"%ld", (long)eap->line2);
    ex_may_print(eap);
}

    static void
ex_sleep(eap)
    exarg_T *eap;
{
    int n;
    long len;

    if (cursor_valid())
    {
 n = (curwin->w_winrow) + curwin->w_wrow - msg_scrolled;
 if (n >= 0)
     windgoto((int)n, curwin->w_wcol);
    }

    len = eap->line2;
    switch (*eap->arg)
    {
 case 'm': break;
 case '\000': len *= 1000L; break;
 default: emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(eap->arg)); return;
    }
    do_sleep(len);
}




    void
do_sleep(msec)
    long msec;
{
    long done;

    cursor_on();
    out_flush();
    for (done = 0; !got_int && done < msec; done += 1000L)
    {
 ui_delay(msec - done > 1000L ? 1000L : msec - done, 1);
 ui_breakcheck();
    }
}

    static void
do_exmap(eap, isabbrev)
    exarg_T *eap;
    int isabbrev;
{
    int mode;
    char_u *cmdp;

    cmdp = eap->cmd;
    mode = get_map_mode(&cmdp, eap->forceit || isabbrev);

    switch (do_map((*cmdp == 'n') ? 2 : (*cmdp == 'u'),
          eap->arg, mode, isabbrev))
    {
 case 1: emsg((char_u *)(((char *)(e_invarg))));
  break;
 case 2: emsg((char_u *)(isabbrev ? ((char *)(e_noabbr)) : ((char *)(e_nomap))));
  break;
    }
}




    static void
ex_winsize(eap)
    exarg_T *eap;
{
    int w, h;
    char_u *arg = eap->arg;
    char_u *p;

    w = getdigits(&arg);
    arg = skipwhite(arg);
    p = arg;
    h = getdigits(&arg);
    if (*p != '\000' && *arg == '\000')
 set_shellsize(w, h, 1);
    else
 emsg((char_u *)(((char *)("E465: :winsize requires two number arguments"))));
}


    static void
ex_wincmd(eap)
    exarg_T *eap;
{
    int xchar = '\000';
    char_u *p;

    if (*eap->arg == 'g' || *eap->arg == 7)
    {

 if (eap->arg[1] == '\000')
 {
     emsg((char_u *)(((char *)(e_invarg))));
     return;
 }
 xchar = eap->arg[1];
 p = eap->arg + 2;
    }
    else
 p = eap->arg + 1;

    eap->nextcmd = check_nextcmd(p);
    p = skipwhite(p);
    if (*p != '\000' && *p != '"' && eap->nextcmd == ((void *)0))
 emsg((char_u *)(((char *)(e_invarg))));
    else
    {

 postponed_split_flags = cmdmod.split;
 postponed_split_tab = cmdmod.tab;
 do_window(*eap->arg, eap->addr_count > 0 ? eap->line2 : 0L, xchar);
 postponed_split_flags = 0;
 postponed_split_tab = 0;
    }
}






    static void
ex_winpos(eap)
    exarg_T *eap;
{
    int x, y;
    char_u *arg = eap->arg;
    char_u *p;

    if (*arg == '\000')
    {
# 8234 "ex_docmd.c"
     emsg((char_u *)(((char *)("E188: Obtaining window position not implemented for this platform"))));
    }
    else
    {
 x = getdigits(&arg);
 arg = skipwhite(arg);
 p = arg;
 y = getdigits(&arg);
 if (*p == '\000' || *arg != '\000')
 {
     emsg((char_u *)(((char *)("E466: :winpos requires two number arguments"))));
     return;
 }
# 8265 "ex_docmd.c"
 if (*(term_strings[(int)(KS_CWP)]))
     term_set_winpos(x, y);

    }
}





    static void
ex_operators(eap)
    exarg_T *eap;
{
    oparg_T oa;

    clear_oparg(&oa);
    oa.regname = eap->regname;
    oa.start.lnum = eap->line1;
    oa.end.lnum = eap->line2;
    oa.line_count = eap->line2 - eap->line1 + 1;
    oa.motion_type = 1;

    virtual_op = 0;

    if (eap->cmdidx != CMD_yank)
    {
 setpcmark();
 curwin->w_cursor.lnum = eap->line1;
 beginline(2 | 4);
    }

    switch (eap->cmdidx)
    {
 case CMD_delete:
     oa.op_type = 1;
     op_delete(&oa);
     break;

 case CMD_yank:
     oa.op_type = 2;
     (void)op_yank(&oa, 0, 1);
     break;

 default:
     if ((eap->cmdidx == CMD_rshift)



          )
  oa.op_type = 5;
     else
  oa.op_type = 4;
     op_shift(&oa, 0, eap->amount);
     break;
    }

    virtual_op = 2;

    ex_may_print(eap);
}




    static void
ex_put(eap)
    exarg_T *eap;
{

    if (eap->line2 == 0)
    {
 eap->line2 = 1;
 eap->forceit = 1;
    }
    curwin->w_cursor.lnum = eap->line2;
    do_put(eap->regname, eap->forceit ? (-1) : 1, 1L,
             8|4);
}




    static void
ex_copymove(eap)
    exarg_T *eap;
{
    long n;

    n = get_address(&eap->arg, 0, 0);
    if (eap->arg == ((void *)0))
    {
 eap->nextcmd = ((void *)0);
 return;
    }
    get_flags(eap);




    if (n == (0x7fffffffL) || n < 0 || n > curbuf->b_ml.ml_line_count)
    {
 emsg((char_u *)(((char *)(e_invaddr))));
 return;
    }

    if (eap->cmdidx == CMD_move)
    {
 if (do_move(eap->line1, eap->line2, n) == 0)
     return;
    }
    else
 ex_copy(eap->line1, eap->line2, n);
    u_clearline();
    beginline(2 | 4);
    ex_may_print(eap);
}




    static void
ex_may_print(eap)
    exarg_T *eap;
{
    if (eap->flags != 0)
    {
 print_line(curwin->w_cursor.lnum, (eap->flags & 0x02),
        (eap->flags & 0x01));
 ex_no_reprint = 1;
    }
}




    static void
ex_submagic(eap)
    exarg_T *eap;
{
    int magic_save = p_magic;

    p_magic = (eap->cmdidx == CMD_smagic);
    do_sub(eap);
    p_magic = magic_save;
}




    static void
ex_join(eap)
    exarg_T *eap;
{
    curwin->w_cursor.lnum = eap->line1;
    if (eap->line1 == eap->line2)
    {
 if (eap->addr_count >= 2)
     return;
 if (eap->line2 == curbuf->b_ml.ml_line_count)
 {
     beep_flush();
     return;
 }
 ++eap->line2;
    }
    (void)do_join(eap->line2 - eap->line1 + 1, !eap->forceit, 1);
    beginline(1 | 4);
    ex_may_print(eap);
}




    static void
ex_at(eap)
    exarg_T *eap;
{
    int c;
    int prev_len = typebuf.tb_len;

    curwin->w_cursor.lnum = eap->line2;






    c = *eap->arg;
    if (c == '\000' || (c == '*' && *eap->cmd == '*'))
 c = '@';

    if (do_execreg(c, 1, vim_strchr(p_cpo, 'e') != ((void *)0), 1)
              == 0)
    {
 beep_flush();
    }
    else
    {
 int save_efr = exec_from_reg;

 exec_from_reg = 1;






 while (!stuff_empty() || typebuf.tb_len > prev_len)
     (void)do_cmdline(((void *)0), getexline, ((void *)0), 0x02|0x01);

 exec_from_reg = save_efr;
    }
}




    static void
ex_bang(eap)
    exarg_T *eap;
{
    do_bang(eap->addr_count, eap, eap->forceit, 1, 1);
}




    static void
ex_undo(eap)
    exarg_T *eap __attribute__((unused));
{
    if (eap->addr_count == 1)
 undo_time(eap->line2, 0, 0, 1);
    else
 u_undo(1);
}


    static void
ex_wundo(eap)
    exarg_T *eap;
{
    char_u hash[32];

    u_compute_hash(hash);
    u_write_undo(eap->arg, eap->forceit, curbuf, hash);
}

    static void
ex_rundo(eap)
    exarg_T *eap;
{
    char_u hash[32];

    u_compute_hash(hash);
    u_read_undo(eap->arg, hash, ((void *)0));
}





    static void
ex_redo(eap)
    exarg_T *eap __attribute__((unused));
{
    u_redo(1);
}




    static void
ex_later(eap)
    exarg_T *eap;
{
    long count = 0;
    int sec = 0;
    int file = 0;
    char_u *p = eap->arg;

    if (*p == '\000')
 count = 1;
    else if (isdigit(*p))
    {
 count = getdigits(&p);
 switch (*p)
 {
     case 's': ++p; sec = 1; break;
     case 'm': ++p; sec = 1; count *= 60; break;
     case 'h': ++p; sec = 1; count *= 60 * 60; break;
     case 'd': ++p; sec = 1; count *= 24 * 60 * 60; break;
     case 'f': ++p; file = 1; break;
 }
    }

    if (*p != '\000')
 emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(eap->arg));
    else
 undo_time(eap->cmdidx == CMD_earlier ? -count : count,
           sec, file, 0);
}




    static void
ex_redir(eap)
    exarg_T *eap;
{
    char *mode;
    char_u *fname;
    char_u *arg = eap->arg;

    if (strcasecmp((char *)(eap->arg), (char *)("END")) == 0)
 close_redir();
    else
    {
 if (*arg == '>')
 {
     ++arg;
     if (*arg == '>')
     {
  ++arg;
  mode = "a";
     }
     else
  mode = "w";
     arg = skipwhite(arg);

     close_redir();


     fname = expand_env_save(arg);
     if (fname == ((void *)0))
  return;
# 8618 "ex_docmd.c"
     redir_fd = open_exfile(fname, eap->forceit, mode);
     vim_free(fname);
 }

 else if (*arg == '@')
 {

     close_redir();
     ++arg;
     if (((*arg) < 0x7f && isalpha(*arg))

      || *arg == '*'
      || *arg == '+'

      || *arg == '"')
     {
  redir_reg = *arg++;
  if (*arg == '>' && arg[1] == '>')
      arg += 2;
  else
  {

      if (*arg == '>')
   arg++;


      if (*arg == '\000' && !isupper(redir_reg))
   write_reg_contents(redir_reg, (char_u *)"", -1, 0);
  }
     }
     if (*arg != '\000')
     {
  redir_reg = 0;
  emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(eap->arg));
     }
 }
 else if (*arg == '=' && arg[1] == '>')
 {
     int append;


     close_redir();
     arg += 2;

     if (*arg == '>')
     {
  ++arg;
  append = 1;
     }
     else
  append = 0;

     if (var_redir_start(skipwhite(arg), append) == 1)
  redir_vname = 1;
 }




 else
     emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(eap->arg));
    }



    if (redir_fd != ((void *)0)

     || redir_reg || redir_vname

       )
 redir_off = 0;
}




    static void
ex_redraw(eap)
    exarg_T *eap;
{
    int r = RedrawingDisabled;
    int p = p_lz;

    RedrawingDisabled = 0;
    p_lz = 0;
    update_topline();
    update_screen(eap->forceit ? 50 :

     VIsual_active ? 20 :

     0);

    if (need_maketitle)
 maketitle();

    RedrawingDisabled = r;
    p_lz = p;


    msg_didout = 0;
    msg_col = 0;

    out_flush();
}




    static void
ex_redrawstatus(eap)
    exarg_T *eap __attribute__((unused));
{

    int r = RedrawingDisabled;
    int p = p_lz;

    RedrawingDisabled = 0;
    p_lz = 0;
    if (eap->forceit)
 status_redraw_all();
    else
 status_redraw_curbuf();
    update_screen(

     VIsual_active ? 20 :

     0);
    RedrawingDisabled = r;
    p_lz = p;
    out_flush();

}

    static void
close_redir()
{
    if (redir_fd != ((void *)0))
    {
 fclose(redir_fd);
 redir_fd = ((void *)0);
    }

    redir_reg = 0;
    if (redir_vname)
    {
 var_redir_stop();
 redir_vname = 0;
    }

}
# 8777 "ex_docmd.c"
    static void
ex_mkrc(eap)
    exarg_T *eap;
{
    FILE *fd;
    int failed = 0;
    char_u *fname;




    int view_session = 0;
    int using_vdir = 0;
    char_u *viewFile = ((void *)0);
    unsigned *flagp;


    if (eap->cmdidx == CMD_mksession || eap->cmdidx == CMD_mkview)
    {

 view_session = 1;




    }




    did_lcd = 0;


    if (eap->cmdidx == CMD_mkview
     && (*eap->arg == '\000'
  || (vim_isdigit(*eap->arg) && eap->arg[1] == '\000')))
    {
 eap->forceit = 1;
 fname = get_view_file(*eap->arg);
 if (fname == ((void *)0))
     return;
 viewFile = fname;
 using_vdir = 1;
    }
    else

 if (*eap->arg != '\000')
 fname = eap->arg;
    else if (eap->cmdidx == CMD_mkvimrc)
 fname = (char_u *)".vimrc";

    else if (eap->cmdidx == CMD_mksession)
 fname = (char_u *)"Session.vim";

    else
 fname = (char_u *)".exrc";
# 8853 "ex_docmd.c"
    if (using_vdir && !mch_isdir(p_vdir))
 vim_mkdir_emsg(p_vdir, 0755);


    fd = open_exfile(fname, eap->forceit, "wb");
    if (fd != ((void *)0))
    {

 if (eap->cmdidx == CMD_mkview)
     flagp = &vop_flags;
 else
     flagp = &ssop_flags;
# 8874 "ex_docmd.c"
 if (eap->cmdidx == CMD_mkvimrc)
     (void)put_line(fd, "version 6.0");


 if (eap->cmdidx == CMD_mksession)
 {
     if (put_line(fd, "let SessionLoad = 1") == 0)
  failed = 1;
 }

 if (eap->cmdidx != CMD_mkview)

 {


     if (p_cp)
  (void)put_line(fd, "if !&cp | set cp | endif");
     else
  (void)put_line(fd, "if &cp | set nocp | endif");
 }


 if (!view_session
  || (eap->cmdidx == CMD_mksession
      && (*flagp & 0x020)))

     failed |= (makemap(fd, ((void *)0)) == 0
       || makeset(fd, 2, 0) == 0);


 if (!failed && view_session)
 {
     if (put_line(fd, "let s:so_save = &so | let s:siso_save = &siso | set so=0 siso=0") == 0)
  failed = 1;
     if (eap->cmdidx == CMD_mksession)
     {
  char_u dirnow[1024];




  if (mch_dirname(dirnow, 1024) == 0
         || mch_chdir((char *)dirnow) != 0)
      *dirnow = '\000';
  if (*dirnow != '\000' && (ssop_flags & 0x800))
  {
      if (vim_chdirfile(fname) == 1)
   shorten_fnames(1);
  }
  else if (*dirnow != '\000'
   && (ssop_flags & 0x1000) && globaldir != ((void *)0))
  {
      if (mch_chdir((char *)globaldir) == 0)
   shorten_fnames(1);
  }

  failed |= (makeopens(fd, dirnow) == 0);


  if (*dirnow != '\000' && ((ssop_flags & 0x800)
   || ((ssop_flags & 0x1000) && globaldir != ((void *)0))))
  {
      if (mch_chdir((char *)dirnow) != 0)
   emsg((char_u *)(((char *)(e_prev_dir))));
      shorten_fnames(1);
  }
     }
     else
     {
  failed |= (put_view(fd, curwin, !using_vdir, flagp,
         -1) == 0);
     }
     if (put_line(fd, "let &so = s:so_save | let &siso = s:siso_save")
              == 0)
  failed = 1;
     if (put_line(fd, "doautoall SessionLoadPost") == 0)
  failed = 1;
     if (eap->cmdidx == CMD_mksession)
     {
  if (put_line(fd, "unlet SessionLoad") == 0)
      failed = 1;
     }
 }

 if (put_line(fd, "\" vim: set ft=vim :") == 0)
     failed = 1;

 failed |= fclose(fd);

 if (failed)
     emsg((char_u *)(((char *)(e_write))));

 else if (eap->cmdidx == CMD_mksession)
 {

     char_u tbuf[1024];

     if (vim_FullName(fname, tbuf, 1024, 0) == 1)
  set_vim_var_string(7, tbuf, -1);
 }




    }






    vim_free(viewFile);

}



    int
vim_mkdir_emsg(name, prot)
    char_u *name;
    int prot __attribute__((unused));
{
    if (mkdir((char *)(name), prot) != 0)
    {
 emsg2((char_u *)(((char *)("E739: Cannot create directory: %s"))), (char_u *)(name));
 return 0;
    }
    return 1;
}






    FILE *
open_exfile(fname, forceit, mode)
    char_u *fname;
    int forceit;
    char *mode;
{
    FILE *fd;



    if (mch_isdir(fname))
    {
 emsg2((char_u *)(((char *)(e_isadir2))), (char_u *)(fname));
 return ((void *)0);
    }

    if (!forceit && *mode != 'a' && vim_fexists(fname))
    {
 emsg2((char_u *)(((char *)("E189: \"%s\" exists (add ! to override)"))), (char_u *)(fname));
 return ((void *)0);
    }

    if ((fd = fopen(((char *)fname), (mode))) == ((void *)0))
 emsg2((char_u *)(((char *)("E190: Cannot open \"%s\" for writing"))), (char_u *)(fname));

    return fd;
}




    static void
ex_mark(eap)
    exarg_T *eap;
{
    pos_T pos;

    if (*eap->arg == '\000')
 emsg((char_u *)(((char *)(e_argreq))));
    else if (eap->arg[1] != '\000')
 emsg((char_u *)(((char *)(e_trailing))));
    else
    {
 pos = curwin->w_cursor;
 curwin->w_cursor.lnum = eap->line2;
 beginline(1 | 4);
 if (setmark(*eap->arg) == 0)
     emsg((char_u *)(((char *)("E191: Argument must be a letter or forward/backward quote"))));
 curwin->w_cursor = pos;
    }
}




    void
update_topline_cursor()
{
    check_cursor();
    update_topline();
    if (!curwin->w_onebuf_opt.wo_wrap)
 validate_cursor();
    update_curswant();
}





    static void
ex_normal(eap)
    exarg_T *eap;
{
    int save_msg_scroll = msg_scroll;
    int save_restart_edit = restart_edit;
    int save_msg_didout = msg_didout;
    int save_State = State;
    tasave_T tabuf;
    int save_insertmode = p_im;
    int save_finish_op = finish_op;
    int save_opcount = opcount;






    if (ex_normal_lock > 0)
    {
 emsg((char_u *)(((char *)(e_secure))));
 return;
    }
    if (ex_normal_busy >= p_mmd)
    {
 emsg((char_u *)(((char *)("E192: Recursive use of :normal too deep"))));
 return;
    }
    ++ex_normal_busy;

    msg_scroll = 0;
    restart_edit = 0;
    p_im = 0;
# 9181 "ex_docmd.c"
    save_typeahead(&tabuf);
    if (tabuf.typebuf_valid)
    {





 do
 {
     if (eap->addr_count != 0)
     {
  curwin->w_cursor.lnum = eap->line1++;
  curwin->w_cursor.col = 0;
     }

     exec_normal_cmd(



      eap->arg, eap->forceit ? -1 : 0, 0);
 }
 while (eap->addr_count > 0 && eap->line1 <= eap->line2 && !got_int);
    }


    update_topline_cursor();


    restore_typeahead(&tabuf);

    --ex_normal_busy;
    msg_scroll = save_msg_scroll;
    restart_edit = save_restart_edit;
    p_im = save_insertmode;
    finish_op = save_finish_op;
    opcount = save_opcount;
    msg_didout |= save_msg_didout;



    State = save_State;



}




    static void
ex_startinsert(eap)
    exarg_T *eap;
{
    if (eap->forceit)
    {
 coladvance((colnr_T)(0x7fffffffL));
 curwin->w_curswant = (0x7fffffffL);
 curwin->w_set_curswant = 0;
    }



    if (State & 0x10)
 return;

    if (eap->cmdidx == CMD_startinsert)
 restart_edit = 'a';
    else if (eap->cmdidx == CMD_startreplace)
 restart_edit = 'R';
    else
 restart_edit = 'V';

    if (!eap->forceit)
    {
 if (eap->cmdidx == CMD_startinsert)
     restart_edit = 'i';
 curwin->w_curswant = 0;
    }
}




    static void
ex_stopinsert(eap)
    exarg_T *eap __attribute__((unused));
{
    restart_edit = 0;
    stop_insert_mode = 1;
}







    void
exec_normal_cmd(cmd, remap, silent)
    char_u *cmd;
    int remap;
    int silent;
{
    oparg_T oa;





    clear_oparg(&oa);
    finish_op = 0;
    ins_typebuf(cmd, remap, 0, 1, silent);
    while ((!stuff_empty() || (!typebuf_typed() && typebuf.tb_len > 0))
          && !got_int)
    {
 update_topline_cursor();
 normal_cmd(&oa, 0);
    }
}



    static void
ex_checkpath(eap)
    exarg_T *eap;
{
    find_pattern_in_path(((void *)0), 0, 0, 0, 0, 3, 1L,
       eap->forceit ? 4 : 1,
           (linenr_T)1, (linenr_T)(0x7fffffffL));
}





    static void
ex_psearch(eap)
    exarg_T *eap;
{
    g_do_tagpreview = p_pvh;
    ex_findpat(eap);
    g_do_tagpreview = 0;
}


    static void
ex_findpat(eap)
    exarg_T *eap;
{
    int whole = 1;
    long n;
    char_u *p;
    int action;

    switch (cmdnames[eap->cmdidx].cmd_name[2])
    {
 case 'e':
  if (cmdnames[eap->cmdidx].cmd_name[0] == 'p')
      action = 2;
  else
      action = 1;
  break;
 case 'i':
  action = 4;
  break;
 case 'u':
  action = 2;
  break;
 default:
  action = 3;
  break;
    }

    n = 1;
    if (vim_isdigit(*eap->arg))
    {
 n = getdigits(&eap->arg);
 eap->arg = skipwhite(eap->arg);
    }
    if (*eap->arg == '/')
    {
 whole = 0;
 ++eap->arg;
 p = skip_regexp(eap->arg, '/', p_magic, ((void *)0));
 if (*p)
 {
     *p++ = '\000';
     p = skipwhite(p);


     if (!ends_excmd(*p))
  eap->errmsg = e_trailing;
     else
  eap->nextcmd = check_nextcmd(p);
 }
    }
    if (!eap->skip)
 find_pattern_in_path(eap->arg, 0, (int)strlen((char *)(eap->arg)),
       whole, !eap->forceit,
       *eap->cmd == 'd' ? 2 : 1,
       n, action, eap->line1, eap->line2);
}
# 9392 "ex_docmd.c"
    static void
ex_ptag(eap)
    exarg_T *eap;
{
    g_do_tagpreview = p_pvh;
    ex_tag_cmd(eap, cmdnames[eap->cmdidx].cmd_name + 1);
}




    static void
ex_pedit(eap)
    exarg_T *eap;
{
    win_T *curwin_save = curwin;

    g_do_tagpreview = p_pvh;
    prepare_tagpreview(1);
    keep_help_flag = curwin_save->w_buffer->b_help;
    do_exedit(eap, ((void *)0));
    keep_help_flag = 0;
    if (curwin != curwin_save && win_valid(curwin_save))
    {

 validate_cursor();
 redraw_later(10);
 win_enter(curwin_save, 1);
    }
    g_do_tagpreview = 0;
}





    static void
ex_stag(eap)
    exarg_T *eap;
{
    postponed_split = -1;
    postponed_split_flags = cmdmod.split;
    postponed_split_tab = cmdmod.tab;
    ex_tag_cmd(eap, cmdnames[eap->cmdidx].cmd_name + 1);
    postponed_split_flags = 0;
    postponed_split_tab = 0;
}





    static void
ex_tag(eap)
    exarg_T *eap;
{
    ex_tag_cmd(eap, cmdnames[eap->cmdidx].cmd_name);
}

    static void
ex_tag_cmd(eap, name)
    exarg_T *eap;
    char_u *name;
{
    int cmd;

    switch (name[1])
    {
 case 'j': cmd = 9;
    break;
 case 's': cmd = 7;
    break;
 case 'p': cmd = 4;
    break;
 case 'N': cmd = 4;
    break;
 case 'n': cmd = 3;
    break;
 case 'o': cmd = 2;
    break;
 case 'f':
 case 'r': cmd = 5;
    break;
 case 'l': cmd = 6;
    break;
 default:







    cmd = 1;
    break;
    }

    if (name[0] == 'l')
    {




 cmd = 11;

    }

    do_tag(eap->arg, cmd, eap->addr_count > 0 ? (int)eap->line2 : 1,
         eap->forceit, 1);
}






    int
find_cmdline_var(src, usedlen)
    char_u *src;
    int *usedlen;
{
    int len;
    int i;
    static char *(spec_str[]) = {
      "%",

      "#",

      "<cword>",

      "<cWORD>",

      "<cfile>",

      "<sfile>",


      "<afile>",

      "<abuf>",

      "<amatch>",






    };

    for (i = 0; i < (int)(sizeof(spec_str) / sizeof(char *)); ++i)
    {
 len = (int)strlen((char *)(spec_str[i]));
 if (strncmp((char *)(src), (char *)(spec_str[i]), (size_t)(len)) == 0)
 {
     *usedlen = len;
     return i;
 }
    }
    return -1;
}
# 9573 "ex_docmd.c"
    char_u *
eval_vars(src, srcstart, usedlen, lnump, errormsg, escaped)
    char_u *src;
    char_u *srcstart;
    int *usedlen;
    linenr_T *lnump;
    char_u **errormsg;
    int *escaped;

{
    int i;
    char_u *s;
    char_u *result;
    char_u *resultbuf = ((void *)0);
    int resultlen;
    buf_T *buf;
    int valid = 2 + 1;
    int spec_idx;

    int skip_mod = 0;



    char_u strbuf[30];


    *errormsg = ((void *)0);
    if (escaped != ((void *)0))
 *escaped = 0;




    spec_idx = find_cmdline_var(src, usedlen);
    if (spec_idx < 0)
    {
 *usedlen = 1;
 return ((void *)0);
    }





    if (src > srcstart && src[-1] == '\\')
    {
 *usedlen = 0;
 ((__builtin_object_size ((char *)((src - 1)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((src - 1)), (char *)((src)), strlen((char *)(src)) + 1, __builtin_object_size ((char *)((src - 1)), 0)) : __inline_memmove_chk ((char *)((src - 1)), (char *)((src)), strlen((char *)(src)) + 1));
 return ((void *)0);
    }




    if (spec_idx == 2 || spec_idx == 3)
    {
 resultlen = find_ident_under_cursor(&result, spec_idx == 2 ?
          (1|2) : 2);
 if (resultlen == 0)
 {
     *errormsg = (char_u *)"";
     return ((void *)0);
 }
    }
# 9645 "ex_docmd.c"
    else
    {
 switch (spec_idx)
 {
 case 0:
  if (curbuf->b_fname == ((void *)0))
  {
      result = (char_u *)"";
      valid = 0;
  }
  else






      result = curbuf->b_fname;

  break;

 case 1:
  if (src[1] == '#')
  {
      result = arg_all();
      resultbuf = result;
      *usedlen = 2;
      if (escaped != ((void *)0))
   *escaped = 1;

      skip_mod = 1;

      break;
  }
  s = src + 1;
  if (*s == '<')
      ++s;
  i = (int)getdigits(&s);
  *usedlen = (int)(s - src);

  if (src[1] == '<')
  {
      if (*usedlen < 2)
      {

   *usedlen = 1;
   return ((void *)0);
      }

      result = list_find_str(get_vim_var_list(54),
             (long)i);
      if (result == ((void *)0))
      {
   *errormsg = (char_u *)"";
   return ((void *)0);
      }




  }
  else
  {
      buf = buflist_findnr(i);
      if (buf == ((void *)0))
      {
   *errormsg = (char_u *)((char *)("E194: No alternate file name to substitute for '#'"));
   return ((void *)0);
      }
      if (lnump != ((void *)0))
   *lnump = (linenr_T)-1;
      if (buf->b_fname == ((void *)0))
      {
   result = (char_u *)"";
   valid = 0;
      }
      else
   result = buf->b_fname;
  }
  break;


 case 4:
  result = file_name_at_cursor(1|4, 1L, ((void *)0));
  if (result == ((void *)0))
  {
      *errormsg = (char_u *)"";
      return ((void *)0);
  }
  resultbuf = result;
  break;



 case 6:
  result = autocmd_fname;
  if (result != ((void *)0) && !autocmd_fname_full)
  {


      autocmd_fname_full = 1;
      result = FullName_save(autocmd_fname, 0);
      vim_free(autocmd_fname);
      autocmd_fname = result;
  }
  if (result == ((void *)0))
  {
      *errormsg = (char_u *)((char *)("E495: no autocommand file name to substitute for \"<afile>\""));
      return ((void *)0);
  }
  result = shorten_fname1(result);
  break;

 case 7:
  if (autocmd_bufnr <= 0)
  {
      *errormsg = (char_u *)((char *)("E496: no autocommand buffer number to substitute for \"<abuf>\""));
      return ((void *)0);
  }
  __builtin___sprintf_chk ((char *)strbuf, 0, __builtin_object_size ((char *)strbuf, 1 > 1), "%d", autocmd_bufnr);
  result = strbuf;
  break;

 case 8:
  result = autocmd_match;
  if (result == ((void *)0))
  {
      *errormsg = (char_u *)((char *)("E497: no autocommand match name to substitute for \"<amatch>\""));
      return ((void *)0);
  }
  break;


 case 5:
  result = sourcing_name;
  if (result == ((void *)0))
  {
      *errormsg = (char_u *)((char *)("E498: no :source file name to substitute for \"<sfile>\""));
      return ((void *)0);
  }
  break;







 }

 resultlen = (int)strlen((char *)(result));
 if (src[*usedlen] == '<')
 {
     ++*usedlen;



     if ((s = vim_strrchr(result, '.')) != ((void *)0) && s >= gettail(result))

  resultlen = (int)(s - result);
 }

 else if (!skip_mod)
 {
     valid |= modify_fname(src, usedlen, &result, &resultbuf,
          &resultlen);
     if (result == ((void *)0))
     {
  *errormsg = (char_u *)"";
  return ((void *)0);
     }
 }

    }

    if (resultlen == 0 || valid != 2 + 1)
    {
 if (valid != 2 + 1)

     *errormsg = (char_u *)((char *)("E499: Empty file name for '%' or '#', only works with \":p:h\""));
 else
     *errormsg = (char_u *)((char *)("E500: Evaluates to an empty string"));
 result = ((void *)0);
    }
    else
 result = vim_strnsave(result, resultlen);
    vim_free(resultbuf);
    return result;
}







    static char_u *
arg_all()
{
    int len;
    int idx;
    char_u *retval = ((void *)0);
    char_u *p;






    for (;;)
    {
 len = 0;
 for (idx = 0; idx < ((curwin)->w_alist->al_ga.ga_len); ++idx)
 {
     p = alist_name(&((aentry_T *)(curwin)->w_alist->al_ga.ga_data)[idx]);
     if (p != ((void *)0))
     {
  if (len > 0)
  {

      if (retval != ((void *)0))
   retval[len] = ' ';
      ++len;
  }
  for ( ; *p != '\000'; ++p)
  {
      if (*p == ' ' || *p == '\\')
      {

   if (retval != ((void *)0))
       retval[len] = '\\';
   ++len;
      }
      if (retval != ((void *)0))
   retval[len] = *p;
      ++len;
  }
     }
 }


 if (retval != ((void *)0))
 {
     retval[len] = '\000';
     break;
 }


 retval = alloc((unsigned)len + 1);
 if (retval == ((void *)0))
     break;
    }

    return retval;
}







    char_u *
expand_sfile(arg)
    char_u *arg;
{
    char_u *errormsg;
    int len;
    char_u *result;
    char_u *newres;
    char_u *repl;
    int srclen;
    char_u *p;

    result = vim_strsave(arg);
    if (result == ((void *)0))
 return ((void *)0);

    for (p = result; *p; )
    {
 if (strncmp((char *)(p), (char *)("<sfile>"), (size_t)(7)) != 0)
     ++p;
 else
 {

     repl = eval_vars(p, result, &srclen, ((void *)0), &errormsg, ((void *)0));
     if (errormsg != ((void *)0))
     {
  if (*errormsg)
      emsg(errormsg);
  vim_free(result);
  return ((void *)0);
     }
     if (repl == ((void *)0))
     {
  p += srclen;
  continue;
     }
     len = (int)strlen((char *)(result)) - srclen + (int)strlen((char *)(repl)) + 1;
     newres = alloc(len);
     if (newres == ((void *)0))
     {
  vim_free(repl);
  vim_free(result);
  return ((void *)0);
     }
     ((__builtin_object_size ((char *)(newres), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(newres), (char *)(result), (size_t)(p - result), __builtin_object_size ((char *)(newres), 0)) : __inline_memmove_chk ((char *)(newres), (char *)(result), (size_t)(p - result)));
     ((__builtin_object_size ((char *)(newres + (p - result)), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(newres + (p - result)), (char *)(repl), __builtin_object_size ((char *)(newres + (p - result)), 1 > 1)) : __inline_strcpy_chk ((char *)(newres + (p - result)), (char *)(repl)));
     len = (int)strlen((char *)(newres));
     ((__builtin_object_size ((char *)(newres), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(newres), (char *)(p + srclen), __builtin_object_size ((char *)(newres), 1 > 1)) : __inline_strcat_chk ((char *)(newres), (char *)(p + srclen)));
     vim_free(repl);
     vim_free(result);
     result = newres;
     p = newres + len;
 }
    }

    return result;
}



static int ses_winsizes (FILE *fd, int restore_size, win_T *tab_firstwin);

static int ses_win_rec (FILE *fd, frame_T *fr);
static frame_T *ses_skipframe (frame_T *fr);
static int ses_do_frame (frame_T *fr);
static int ses_do_win (win_T *wp);
static int ses_arglist (FILE *fd, char *cmd, garray_T *gap, int fullname, unsigned *flagp);
static int ses_put_fname (FILE *fd, char_u *name, unsigned *flagp);
static int ses_fname (FILE *fd, buf_T *buf, unsigned *flagp);





    static int
makeopens(fd, dirnow)
    FILE *fd;
    char_u *dirnow;
{
    buf_T *buf;
    int only_save_windows = 1;
    int nr;
    int cnr = 1;
    int restore_size = 1;
    win_T *wp;
    char_u *sname;
    win_T *edited_win = ((void *)0);
    int tabnr;
    win_T *tab_firstwin;
    frame_T *tab_topframe;
    int cur_arg_idx = 0;
    int next_arg_idx = 0;

    if (ssop_flags & 0x001)
 only_save_windows = 0;






    if (put_line(fd, "let v:this_session=expand(\"<sfile>:p\")") == 0)
 return 0;
    if (ssop_flags & 0x100)
 if (store_session_globals(fd) == 0)
     return 0;





    if (put_line(fd, "silent only") == 0)
 return 0;




    if (ssop_flags & 0x800)
    {
 if (put_line(fd, "exe \"cd \" . escape(expand(\"<sfile>:p:h\"), ' ')")
              == 0)
     return 0;
    }
    else if (ssop_flags & 0x1000)
    {
 sname = home_replace_save(((void *)0), globaldir != ((void *)0) ? globaldir : dirnow);
 if (sname == ((void *)0)
  || fputs("cd ", fd) < 0
  || ses_put_fname(fd, sname, &ssop_flags) == 0
  || put_eol(fd) == 0)
 {
     vim_free(sname);
     return 0;
 }
 vim_free(sname);
    }





    if (put_line(fd, "if expand('%') == '' && !&modified && line('$') <= 1 && getline(1) == ''") == 0)
 return 0;
    if (put_line(fd, "  let s:wipebuf = bufnr('%')") == 0)
 return 0;
    if (put_line(fd, "endif") == 0)
 return 0;




    if (put_line(fd, "set shortmess=aoO") == 0)
 return 0;


    for (buf = firstbuf; buf != ((void *)0); buf = buf->b_next)
    {
 if (!(only_save_windows && buf->b_nwindows == 0)
  && !(buf->b_help && !(ssop_flags & 0x040))
  && buf->b_fname != ((void *)0)
  && buf->b_p_bl)
 {
     if (fprintf(fd, "badd +%ld ", buf->b_wininfo == ((void *)0) ? 1L
        : buf->b_wininfo->wi_fpos.lnum) < 0
      || ses_fname(fd, buf, &ssop_flags) == 0)
  return 0;
 }
    }


    if (ses_arglist(fd, "args", &global_alist.al_ga,
       !(ssop_flags & 0x1000), &ssop_flags) == 0)
 return 0;

    if (ssop_flags & 0x004)
    {

 if (fprintf(fd, "set lines=%ld columns=%ld" , Rows, Columns) < 0
  || put_eol(fd) == 0)
     return 0;
    }
# 10109 "ex_docmd.c"
    tab_firstwin = firstwin;
    tab_topframe = topframe;
    for (tabnr = 1; ; ++tabnr)
    {
 int need_tabnew = 0;

 if ((ssop_flags & 0x8000))
 {
     tabpage_T *tp = find_tabpage(tabnr);

     if (tp == ((void *)0))
  break;
     if (tp == curtab)
     {
  tab_firstwin = firstwin;
  tab_topframe = topframe;
     }
     else
     {
  tab_firstwin = tp->tp_firstwin;
  tab_topframe = tp->tp_topframe;
     }
     if (tabnr > 1)
  need_tabnew = 1;
 }






 for (wp = tab_firstwin; wp != ((void *)0); wp = wp->w_next)
 {
     if (ses_do_win(wp)
      && wp->w_buffer->b_ffname != ((void *)0)
      && !wp->w_buffer->b_help

      && !bt_nofile(wp->w_buffer)

      )
     {
  if (fputs(need_tabnew ? "tabedit " : "edit ", fd) < 0
   || ses_fname(fd, wp->w_buffer, &ssop_flags) == 0)
      return 0;
  need_tabnew = 0;
  if (!wp->w_arg_idx_invalid)
      edited_win = wp;
  break;
     }
 }


 if (need_tabnew && put_line(fd, "tabnew") == 0)
     return 0;




 if (put_line(fd, "set splitbelow splitright") == 0)
     return 0;
 if (ses_win_rec(fd, tab_topframe) == 0)
     return 0;
 if (!p_sb && put_line(fd, "set nosplitbelow") == 0)
     return 0;
 if (!p_spr && put_line(fd, "set nosplitright") == 0)
     return 0;





 nr = 0;
 for (wp = tab_firstwin; wp != ((void *)0); wp = ((wp)->w_next))
 {
     if (ses_do_win(wp))
  ++nr;
     else
  restore_size = 0;
     if (curwin == wp)
  cnr = nr;
 }


 if (put_line(fd, "wincmd t") == 0)
     return 0;
# 10202 "ex_docmd.c"
 if (put_line(fd, "set winheight=1 winwidth=1") == 0)
     return 0;
 if (nr > 1 && ses_winsizes(fd, restore_size, tab_firstwin) == 0)
     return 0;




 for (wp = tab_firstwin; wp != ((void *)0); wp = wp->w_next)
 {
     if (!ses_do_win(wp))
  continue;
     if (put_view(fd, wp, wp != edited_win, &ssop_flags,
        cur_arg_idx) == 0)
  return 0;
     if (nr > 1 && put_line(fd, "wincmd w") == 0)
  return 0;
     next_arg_idx = wp->w_arg_idx;
 }




 cur_arg_idx = next_arg_idx;




 if (cnr > 1 && (fprintf(fd, "%dwincmd w", cnr) < 0
            || put_eol(fd) == 0))
     return 0;





 if (nr > 1 && ses_winsizes(fd, restore_size, tab_firstwin) == 0)
     return 0;



 if (!(ssop_flags & 0x8000))
     break;
    }

    if (ssop_flags & 0x8000)
    {
 if (fprintf(fd, "tabnext %d", tabpage_index(curtab)) < 0
  || put_eol(fd) == 0)
     return 0;
    }




    if (put_line(fd, "if exists('s:wipebuf')") == 0)
 return 0;
    if (put_line(fd, "  silent exe 'bwipe ' . s:wipebuf") == 0)
 return 0;
    if (put_line(fd, "endif") == 0)
 return 0;
    if (put_line(fd, "unlet! s:wipebuf") == 0)
 return 0;


    if (fprintf(fd, "set winheight=%ld winwidth=%ld shortmess=%s",
          p_wh, p_wiw, p_shm) < 0 || put_eol(fd) == 0)
 return 0;




    if (put_line(fd, "let s:sx = expand(\"<sfile>:p:r\").\"x.vim\"") == 0
     || put_line(fd, "if file_readable(s:sx)") == 0
     || put_line(fd, "  exe \"source \" . fnameescape(s:sx)") == 0
     || put_line(fd, "endif") == 0)
 return 0;

    return 1;
}

    static int
ses_winsizes(fd, restore_size, tab_firstwin)
    FILE *fd;
    int restore_size;
    win_T *tab_firstwin;
{
    int n = 0;
    win_T *wp;

    if (restore_size && (ssop_flags & 0x008))
    {
 for (wp = tab_firstwin; wp != ((void *)0); wp = wp->w_next)
 {
     if (!ses_do_win(wp))
  continue;
     ++n;


     if (wp->w_height + wp->w_status_height < topframe->fr_height
      && (fprintf(fd,
     "exe '%dresize ' . ((&lines * %ld + %ld) / %ld)",
       n, (long)wp->w_height, Rows / 2, Rows) < 0
        || put_eol(fd) == 0))
  return 0;


     if (wp->w_width < Columns && (fprintf(fd,
     "exe 'vert %dresize ' . ((&columns * %ld + %ld) / %ld)",
       n, (long)wp->w_width, Columns / 2, Columns) < 0
        || put_eol(fd) == 0))
  return 0;
 }
    }
    else
    {

 if (put_line(fd, "wincmd =") == 0)
     return 0;
    }
    return 1;
}







    static int
ses_win_rec(fd, fr)
    FILE *fd;
    frame_T *fr;
{
    frame_T *frc;
    int count = 0;

    if (fr->fr_layout != 0)
    {


 frc = ses_skipframe(fr->fr_child);
 if (frc != ((void *)0))
     while ((frc = ses_skipframe(frc->fr_next)) != ((void *)0))
     {


  if (put_line(fd, "wincmd _ | wincmd |") == 0
   || put_line(fd, fr->fr_layout == 2
      ? "split" : "vsplit") == 0)
      return 0;
  ++count;
     }


 if (count > 0 && (fprintf(fd, fr->fr_layout == 2
   ? "%dwincmd k" : "%dwincmd h", count) < 0
            || put_eol(fd) == 0))
     return 0;



 frc = ses_skipframe(fr->fr_child);
 while (frc != ((void *)0))
 {
     ses_win_rec(fd, frc);
     frc = ses_skipframe(frc->fr_next);

     if (frc != ((void *)0) && put_line(fd, "wincmd w") == 0)
  return 0;
 }
    }
    return 1;
}





    static frame_T *
ses_skipframe(fr)
    frame_T *fr;
{
    frame_T *frc;

    for (frc = fr; frc != ((void *)0); frc = frc->fr_next)
 if (ses_do_frame(frc))
     break;
    return frc;
}





    static int
ses_do_frame(fr)
    frame_T *fr;
{
    frame_T *frc;

    if (fr->fr_layout == 0)
 return ses_do_win(fr->fr_win);
    for (frc = fr->fr_child; frc != ((void *)0); frc = frc->fr_next)
 if (ses_do_frame(frc))
     return 1;
    return 0;
}




    static int
ses_do_win(wp)
    win_T *wp;
{
    if (wp->w_buffer->b_fname == ((void *)0)


     || bt_nofile(wp->w_buffer)

       )
 return (ssop_flags & 0x080);
    if (wp->w_buffer->b_help)
 return (ssop_flags & 0x040);
    return 1;
}





    static int
put_view(fd, wp, add_edit, flagp, current_arg_idx)
    FILE *fd;
    win_T *wp;
    int add_edit;
    unsigned *flagp;
    int current_arg_idx;

{
    win_T *save_curwin;
    int f;
    int do_cursor;
    int did_next = 0;



    do_cursor = (flagp == &ssop_flags || *flagp & 0x4000);




    if (wp->w_alist == &global_alist)
    {
 if (put_line(fd, "argglobal") == 0)
     return 0;
    }
    else
    {
 if (ses_arglist(fd, "arglocal", &wp->w_alist->al_ga,
   flagp == &vop_flags
   || !(*flagp & 0x1000)
   || wp->w_localdir != ((void *)0), flagp) == 0)
     return 0;
    }



    if (wp->w_arg_idx != current_arg_idx && wp->w_arg_idx < ((wp)->w_alist->al_ga.ga_len)
            && flagp == &ssop_flags)
    {
 if (fprintf(fd, "%ldargu", (long)wp->w_arg_idx + 1) < 0
  || put_eol(fd) == 0)
     return 0;
 did_next = 1;
    }


    if (add_edit && (!did_next || wp->w_arg_idx_invalid))
    {



 if (wp->w_buffer->b_ffname != ((void *)0)

  && !bt_nofile(wp->w_buffer)

  )
 {




     if (fputs("edit ", fd) < 0
      || ses_fname(fd, wp->w_buffer, flagp) == 0)
  return 0;
 }
 else
 {

     if (put_line(fd, "enew") == 0)
  return 0;

     if (wp->w_buffer->b_ffname != ((void *)0))
     {

  if (fputs("file ", fd) < 0
   || ses_fname(fd, wp->w_buffer, flagp) == 0)
      return 0;
     }

     do_cursor = 0;
 }
    }




    if ((*flagp & (0x020 | 0x010))
      && makemap(fd, wp->w_buffer) == 0)
 return 0;
# 10532 "ex_docmd.c"
    save_curwin = curwin;
    curwin = wp;
    curbuf = curwin->w_buffer;
    if (*flagp & (0x020 | 0x010))
 f = makeset(fd, 4,
        flagp == &vop_flags || !(*flagp & 0x020));

    else if (*flagp & 0x2000)
 f = makefoldset(fd);

    else
 f = 1;
    curwin = save_curwin;
    curbuf = curwin->w_buffer;
    if (f == 0)
 return 0;





    if ((*flagp & 0x2000)
     && wp->w_buffer->b_ffname != ((void *)0)

     && (*wp->w_buffer->b_p_bt == '\000' || wp->w_buffer->b_help)

     )
    {
 if (put_folds(fd, wp) == 0)
     return 0;
    }





    if (do_cursor)
    {



 if (fprintf(fd, "let s:l = %ld - ((%ld * winheight(0) + %ld) / %ld)",
      (long)wp->w_cursor.lnum,
      (long)(wp->w_cursor.lnum - wp->w_topline),
      (long)wp->w_height / 2, (long)wp->w_height) < 0
  || put_eol(fd) == 0
  || put_line(fd, "if s:l < 1 | let s:l = 1 | endif") == 0
  || put_line(fd, "exe s:l") == 0
  || put_line(fd, "normal! zt") == 0
  || fprintf(fd, "%ld", (long)wp->w_cursor.lnum) < 0
  || put_eol(fd) == 0)
     return 0;

 if (wp->w_cursor.col == 0)
 {
     if (put_line(fd, "normal! 0") == 0)
  return 0;
 }
 else
 {
     if (!wp->w_onebuf_opt.wo_wrap && wp->w_leftcol > 0 && wp->w_width > 0)
     {
  if (fprintf(fd,
     "let s:c = %ld - ((%ld * winwidth(0) + %ld) / %ld)",
       (long)wp->w_cursor.col,
       (long)(wp->w_cursor.col - wp->w_leftcol),
       (long)wp->w_width / 2, (long)wp->w_width) < 0
   || put_eol(fd) == 0
   || put_line(fd, "if s:c > 0") == 0
   || fprintf(fd,
       "  exe 'normal! 0' . s:c . 'lzs' . (%ld - s:c) . 'l'",
       (long)wp->w_cursor.col) < 0
   || put_eol(fd) == 0
   || put_line(fd, "else") == 0
   || fprintf(fd, "  normal! 0%dl", wp->w_cursor.col) < 0
   || put_eol(fd) == 0
   || put_line(fd, "endif") == 0)
      return 0;
     }
     else
     {
  if (fprintf(fd, "normal! 0%dl", wp->w_cursor.col) < 0
   || put_eol(fd) == 0)
      return 0;
     }
 }
    }




    if (wp->w_localdir != ((void *)0))
    {
 if (fputs("lcd ", fd) < 0
  || ses_put_fname(fd, wp->w_localdir, flagp) == 0
  || put_eol(fd) == 0)
     return 0;
 did_lcd = 1;
    }

    return 1;
}





    static int
ses_arglist(fd, cmd, gap, fullname, flagp)
    FILE *fd;
    char *cmd;
    garray_T *gap;
    int fullname;
    unsigned *flagp;
{
    int i;
    char_u buf[1024];
    char_u *s;

    if (gap->ga_len == 0)
 return put_line(fd, "silent! argdel *");
    if (fputs(cmd, fd) < 0)
 return 0;
    for (i = 0; i < gap->ga_len; ++i)
    {

 s = alist_name(&((aentry_T *)gap->ga_data)[i]);
 if (s != ((void *)0))
 {
     if (fullname)
     {
  (void)vim_FullName(s, buf, 1024, 0);
  s = buf;
     }
     if (fputs(" ", fd) < 0 || ses_put_fname(fd, s, flagp) == 0)
  return 0;
 }
    }
    return put_eol(fd);
}






    static int
ses_fname(fd, buf, flagp)
    FILE *fd;
    buf_T *buf;
    unsigned *flagp;
{
    char_u *name;






    if (buf->b_sfname != ((void *)0)
     && flagp == &ssop_flags
     && (ssop_flags & (0x1000 | 0x800))

     && !p_acd

     && !did_lcd)
 name = buf->b_sfname;
    else
 name = buf->b_ffname;
    if (ses_put_fname(fd, name, flagp) == 0 || put_eol(fd) == 0)
 return 0;
    return 1;
}







    static int
ses_put_fname(fd, name, flagp)
    FILE *fd;
    char_u *name;
    unsigned *flagp;
{
    char_u *sname;
    int retval = 1;
    int c;

    sname = home_replace_save(((void *)0), name);
    if (sname != ((void *)0))
 name = sname;
    while (*name != '\000')
    {
# 10744 "ex_docmd.c"
 c = *name++;
 if (c == '\\' && (*flagp & 0x200))

     c = '/';
 else if ((vim_strchr(escape_chars, c) != ((void *)0)



   ) || c == '#' || c == '%')
 {

     if (putc('\\', fd) != '\\')
  retval = 0;
 }
 if (putc(c, fd) != c)
     retval = 0;
    }
    vim_free(sname);
    return retval;
}




    static void
ex_loadview(eap)
    exarg_T *eap;
{
    char_u *fname;

    fname = get_view_file(*eap->arg);
    if (fname != ((void *)0))
    {
 do_source(fname, 0, 0);
 vim_free(fname);
    }
}




    static char_u *
get_view_file(c)
    int c;
{
    int len = 0;
    char_u *p, *s;
    char_u *retval;
    char_u *sname;

    if (curbuf->b_ffname == ((void *)0))
    {
 emsg((char_u *)(((char *)(e_noname))));
 return ((void *)0);
    }
    sname = home_replace_save(((void *)0), curbuf->b_ffname);
    if (sname == ((void *)0))
 return ((void *)0);
# 10810 "ex_docmd.c"
    for (p = sname; *p; ++p)
 if (*p == '=' || vim_ispathsep(*p))
     ++len;
    retval = alloc((unsigned)(strlen((char *)(sname)) + len + strlen((char *)(p_vdir)) + 9));
    if (retval != ((void *)0))
    {
 ((__builtin_object_size ((char *)(retval), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(retval), (char *)(p_vdir), __builtin_object_size ((char *)(retval), 1 > 1)) : __inline_strcpy_chk ((char *)(retval), (char *)(p_vdir)));
 add_pathsep(retval);
 s = retval + strlen((char *)(retval));
 for (p = sname; *p; ++p)
 {
     if (*p == '=')
     {
  *s++ = '=';
  *s++ = '=';
     }
     else if (vim_ispathsep(*p))
     {
  *s++ = '=';






      *s++ = '+';
     }
     else
  *s++ = *p;
 }
 *s++ = '=';
 *s++ = c;
 ((__builtin_object_size ((char *)(s), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(s), (char *)(".vim"), __builtin_object_size ((char *)(s), 1 > 1)) : __inline_strcpy_chk ((char *)(s), (char *)(".vim")));
    }

    vim_free(sname);
    return retval;
}







    int
put_eol(fd)
    FILE *fd;
{
    if (







     (putc('\n', fd) < 0))
 return 0;
    return 1;
}





    int
put_line(fd, s)
    FILE *fd;
    char *s;
{
    if (fputs(s, fd) < 0 || put_eol(fd) == 0)
 return 0;
    return 1;
}





    static void
ex_viminfo(eap)
    exarg_T *eap;
{
    char_u *save_viminfo;

    save_viminfo = p_viminfo;
    if (*p_viminfo == '\000')
 p_viminfo = (char_u *)"'100";
    if (eap->cmdidx == CMD_rviminfo)
    {
 if (read_viminfo(eap->arg, 1 | 2
      | (eap->forceit ? 4 : 0)) == 0)
     emsg((char_u *)(((char *)("E195: Cannot open viminfo file for reading"))));
    }
    else
 write_viminfo(eap->arg, eap->forceit);
    p_viminfo = save_viminfo;
}







    void
dialog_msg(buff, format, fname)
    char_u *buff;
    char *format;
    char_u *fname;
{
    if (fname == ((void *)0))
 fname = (char_u *)((char *)("Untitled"));
    vim_snprintf((char *)buff, (1024+1), format, fname);
}





    static void
ex_behave(eap)
    exarg_T *eap;
{
    if (strcmp((char *)(eap->arg), (char *)("mswin")) == 0)
    {
 set_option_value((char_u *)"selection", 0L, (char_u *)"exclusive", 0);
 set_option_value((char_u *)"selectmode", 0L, (char_u *)"mouse,key", 0);
 set_option_value((char_u *)"mousemodel", 0L, (char_u *)"popup", 0);
 set_option_value((char_u *)"keymodel", 0L,
          (char_u *)"startsel,stopsel", 0);
    }
    else if (strcmp((char *)(eap->arg), (char *)("xterm")) == 0)
    {
 set_option_value((char_u *)"selection", 0L, (char_u *)"inclusive", 0);
 set_option_value((char_u *)"selectmode", 0L, (char_u *)"", 0);
 set_option_value((char_u *)"mousemodel", 0L, (char_u *)"extend", 0);
 set_option_value((char_u *)"keymodel", 0L, (char_u *)"", 0);
    }
    else
 emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(eap->arg));
}






    char_u *
get_behave_arg(xp, idx)
    expand_T *xp __attribute__((unused));
    int idx;
{
    if (idx == 0)
 return (char_u *)"mswin";
    if (idx == 1)
 return (char_u *)"xterm";
    return ((void *)0);
}



static int filetype_detect = 0;
static int filetype_plugin = 0;
static int filetype_indent = 0;
# 10986 "ex_docmd.c"
    static void
ex_filetype(eap)
    exarg_T *eap;
{
    char_u *arg = eap->arg;
    int plugin = 0;
    int indent = 0;

    if (*eap->arg == '\000')
    {

 smsg((char_u *)"filetype detection:%s  plugin:%s  indent:%s",
  filetype_detect ? "ON" : "OFF",
  filetype_plugin ? (filetype_detect ? "ON" : "(on)") : "OFF",
  filetype_indent ? (filetype_detect ? "ON" : "(on)") : "OFF");
 return;
    }


    for (;;)
    {
 if (strncmp((char *)(arg), (char *)("plugin"), (size_t)(6)) == 0)
 {
     plugin = 1;
     arg = skipwhite(arg + 6);
     continue;
 }
 if (strncmp((char *)(arg), (char *)("indent"), (size_t)(6)) == 0)
 {
     indent = 1;
     arg = skipwhite(arg + 6);
     continue;
 }
 break;
    }
    if (strcmp((char *)(arg), (char *)("on")) == 0 || strcmp((char *)(arg), (char *)("detect")) == 0)
    {
 if (*arg == 'o' || !filetype_detect)
 {
     source_runtime((char_u *)"filetype.vim", 1);
     filetype_detect = 1;
     if (plugin)
     {
  source_runtime((char_u *)"ftplugin.vim", 1);
  filetype_plugin = 1;
     }
     if (indent)
     {
  source_runtime((char_u *)"indent.vim", 1);
  filetype_indent = 1;
     }
 }
 if (*arg == 'd')
 {
     (void)do_doautocmd((char_u *)"filetypedetect BufRead", 1);
     do_modelines(0);
 }
    }
    else if (strcmp((char *)(arg), (char *)("off")) == 0)
    {
 if (plugin || indent)
 {
     if (plugin)
     {
  source_runtime((char_u *)"ftplugof.vim", 1);
  filetype_plugin = 0;
     }
     if (indent)
     {
  source_runtime((char_u *)"indoff.vim", 1);
  filetype_indent = 0;
     }
 }
 else
 {
     source_runtime((char_u *)"ftoff.vim", 1);
     filetype_detect = 0;
 }
    }
    else
 emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(arg));
}




    static void
ex_setfiletype(eap)
    exarg_T *eap;
{
    if (!did_filetype)
 set_option_value((char_u *)"filetype", 0L, eap->arg, 4);
}


    static void
ex_digraphs(eap)
    exarg_T *eap __attribute__((unused));
{

    if (*eap->arg != '\000')
 putdigraph(eap->arg);
    else
 listdigraphs();



}

    static void
ex_set(eap)
    exarg_T *eap;
{
    int flags = 0;

    if (eap->cmdidx == CMD_setlocal)
 flags = 4;
    else if (eap->cmdidx == CMD_setglobal)
 flags = 2;





 (void)do_set(eap->arg, flags);
}





    static void
ex_nohlsearch(eap)
    exarg_T *eap __attribute__((unused));
{
    no_hlsearch = 1;
    redraw_all_later(35);
}






    static void
ex_match(eap)
    exarg_T *eap;
{
    char_u *p;
    char_u *g = ((void *)0);
    char_u *end;
    int c;
    int id;

    if (eap->line2 <= 3)
 id = eap->line2;
    else
    {
 emsg((char_u *)(e_invcmd));
 return;
    }


    if (!eap->skip)
 match_delete(curwin, id, 0);

    if (ends_excmd(*eap->arg))
 end = eap->arg;
    else if ((strncasecmp((char *)(eap->arg), (char *)("none"), (size_t)(4)) == 0
  && (((eap->arg[4]) == ' ' || (eap->arg[4]) == '\t') || ends_excmd(eap->arg[4]))))
 end = eap->arg + 4;
    else
    {
 p = skiptowhite(eap->arg);
 if (!eap->skip)
     g = vim_strnsave(eap->arg, (int)(p - eap->arg));
 p = skipwhite(p);
 if (*p == '\000')
 {

     emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(eap->arg));
     return;
 }
 end = skip_regexp(p + 1, *p, 1, ((void *)0));
 if (!eap->skip)
 {
     if (*end != '\000' && !ends_excmd(*skipwhite(end + 1)))
     {
  eap->errmsg = e_trailing;
  return;
     }
     if (*end != *p)
     {
  emsg2((char_u *)(((char *)(e_invarg2))), (char_u *)(p));
  return;
     }

     c = *end;
     *end = '\000';
     match_add(curwin, g, p + 1, 10, id);
     vim_free(g);
     *end = c;
 }
    }
    eap->nextcmd = find_nextcmd(end);
}






    static void
ex_X(eap)
    exarg_T *eap __attribute__((unused));
{
    if (get_crypt_method(curbuf) == 0 || blowfish_self_test() == 1)
 (void)get_crypt_key(1, 1);
}



    static void
ex_fold(eap)
    exarg_T *eap;
{
    if (foldManualAllowed(1))
 foldCreate(eap->line1, eap->line2);
}

    static void
ex_foldopen(eap)
    exarg_T *eap;
{
    opFoldRange(eap->line1, eap->line2, eap->cmdidx == CMD_foldopen,
        eap->forceit, 0);
}

    static void
ex_folddo(eap)
    exarg_T *eap;
{
    linenr_T lnum;


    for (lnum = eap->line1; lnum <= eap->line2; ++lnum)
 if (hasFolding(lnum, ((void *)0), ((void *)0)) == (eap->cmdidx == CMD_folddoclosed))
     ml_setmarked(lnum);


    global_exe(eap->arg);
    ml_clearmarked();
}
