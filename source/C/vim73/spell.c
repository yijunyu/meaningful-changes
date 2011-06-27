# 1 "spell.c"
# 1 "/Users/yy66/Documents/research/mct/source/C/vim73/src//"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "spell.c"
# 310 "spell.c"
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
# 311 "spell.c" 2
# 325 "spell.c"
typedef int idx_T;
# 392 "spell.c"
typedef struct fromto_S
{
    char_u *ft_from;
    char_u *ft_to;
} fromto_T;




typedef struct salitem_S
{
    char_u *sm_lead;
    int sm_leadlen;
    char_u *sm_oneof;
    char_u *sm_rules;
    char_u *sm_to;





} salitem_T;




typedef short salfirst_T;
# 442 "spell.c"
typedef struct slang_S slang_T;
struct slang_S
{
    slang_T *sl_next;
    char_u *sl_name;
    char_u *sl_fname;
    int sl_add;

    char_u *sl_fbyts;
    idx_T *sl_fidxs;
    char_u *sl_kbyts;
    idx_T *sl_kidxs;
    char_u *sl_pbyts;
    idx_T *sl_pidxs;

    char_u *sl_info;

    char_u sl_regions[17];

    char_u *sl_midword;

    hashtab_T sl_wordcount;

    int sl_compmax;
    int sl_compminlen;
    int sl_compsylmax;
    int sl_compoptions;
    garray_T sl_comppat;
    regprog_T *sl_compprog;

    char_u *sl_comprules;
    char_u *sl_compstartflags;
    char_u *sl_compallflags;
    char_u sl_nobreak;
    char_u *sl_syllable;
    garray_T sl_syl_items;

    int sl_prefixcnt;
    regprog_T **sl_prefprog;

    garray_T sl_rep;
    short sl_rep_first[256];

    garray_T sl_sal;
    salfirst_T sl_sal_first[256];

    int sl_followup;
    int sl_collapse;
    int sl_rem_accents;
    int sl_sofo;


    garray_T sl_repsal;
    short sl_repsal_first[256];
    int sl_nosplitsugs;


    time_t sl_sugtime;
    char_u *sl_sbyts;
    idx_T *sl_sidxs;
    buf_T *sl_sugbuf;
    int sl_sugloaded;


    int sl_has_map;




    char_u sl_map_array[256];

    hashtab_T sl_sounddone;

};



static slang_T *first_lang = ((void *)0);
# 529 "spell.c"
typedef struct langp_S
{
    slang_T *lp_slang;
    slang_T *lp_sallang;
    slang_T *lp_replang;
    int lp_region;
} langp_T;
# 578 "spell.c"
static char_u *int_wordlist = ((void *)0);

typedef struct wordcount_S
{
    short_u wc_count;
    char_u wc_word[1];
} wordcount_T;

static wordcount_T dumwc;







typedef struct suginfo_S
{
    garray_T su_ga;
    int su_maxcount;
    int su_maxscore;
    int su_sfmaxscore;
    garray_T su_sga;
    char_u *su_badptr;
    int su_badlen;
    int su_badflags;
    char_u su_badword[250];
    char_u su_fbadword[250];
    char_u su_sal_badword[250];
    hashtab_T su_banned;
    slang_T *su_sallang;
} suginfo_T;


typedef struct suggest_S
{
    char_u *st_word;
    int st_wordlen;
    int st_orglen;
    int st_score;
    int st_altscore;
    int st_salscore;
    int st_had_bonus;
    slang_T *st_slang;
} suggest_T;
# 687 "spell.c"
typedef struct matchinf_S
{
    langp_T *mi_lp;


    char_u *mi_word;
    char_u *mi_end;
    char_u *mi_fend;
    char_u *mi_cend;



    char_u mi_fword[250 + 1];
    int mi_fwordlen;


    int mi_prefarridx;

    int mi_prefcnt;
    int mi_prefixlen;
# 715 "spell.c"
    int mi_compoff;
    char_u mi_compflags[250];
    int mi_complen;
    int mi_compextra;


    int mi_result;
    int mi_capflags;
    win_T *mi_win;


    int mi_result2;
    char_u *mi_end2;
} matchinf_T;





typedef struct spelltab_S
{
    char_u st_isw[256];
    char_u st_isu[256];
    char_u st_fold[256];
    char_u st_upper[256];
} spelltab_T;

static spelltab_T spelltab;
static int did_set_spelltab;




static void clear_spell_chartab (spelltab_T *sp);
static int set_spell_finish (spelltab_T *new_st);
static int spell_iswordp (char_u *p, win_T *wp);
static int spell_iswordp_nmw (char_u *p);




static int write_spell_prefcond (FILE *fd, garray_T *gap);




typedef enum
{
    STATE_START = 0,


    STATE_NOPREFIX,
    STATE_SPLITUNDO,
    STATE_ENDNUL,
    STATE_PLAIN,
    STATE_DEL,
    STATE_INS_PREP,
    STATE_INS,
    STATE_SWAP,
    STATE_UNSWAP,
    STATE_SWAP3,
    STATE_UNSWAP3,
    STATE_UNROT3L,
    STATE_UNROT3R,
    STATE_REP_INI,
    STATE_REP,
    STATE_REP_UNDO,
    STATE_FINAL
} state_T;




typedef struct trystate_S
{
    state_T ts_state;
    int ts_score;
    idx_T ts_arridx;
    short ts_curi;
    char_u ts_fidx;
    char_u ts_fidxtry;
    char_u ts_twordlen;
    char_u ts_prefixdepth;

    char_u ts_flags;






    char_u ts_prewordlen;
    char_u ts_splitoff;
    char_u ts_splitfidx;
    char_u ts_complen;
    char_u ts_compsplit;
    char_u ts_save_badflags;
    char_u ts_delidx;

} trystate_T;
# 838 "spell.c"
static slang_T *slang_alloc (char_u *lang);
static void slang_free (slang_T *lp);
static void slang_clear (slang_T *lp);
static void slang_clear_sug (slang_T *lp);
static void find_word (matchinf_T *mip, int mode);
static int match_checkcompoundpattern (char_u *ptr, int wlen, garray_T *gap);
static int can_compound (slang_T *slang, char_u *word, char_u *flags);
static int can_be_compound (trystate_T *sp, slang_T *slang, char_u *compflags, int flag);
static int match_compoundrule (slang_T *slang, char_u *compflags);
static int valid_word_prefix (int totprefcnt, int arridx, int flags, char_u *word, slang_T *slang, int cond_req);
static void find_prefix (matchinf_T *mip, int mode);
static int fold_more (matchinf_T *mip);
static int spell_valid_case (int wordflags, int treeflags);
static int no_spell_checking (win_T *wp);
static void spell_load_lang (char_u *lang);
static char_u *spell_enc (void);
static void int_wordlist_spl (char_u *fname);
static void spell_load_cb (char_u *fname, void *cookie);
static slang_T *spell_load_file (char_u *fname, char_u *lang, slang_T *old_lp, int silent);
static char_u *read_cnt_string (FILE *fd, int cnt_bytes, int *lenp);
static int read_region_section (FILE *fd, slang_T *slang, int len);
static int read_charflags_section (FILE *fd);
static int read_prefcond_section (FILE *fd, slang_T *lp);
static int read_rep_section (FILE *fd, garray_T *gap, short *first);
static int read_sal_section (FILE *fd, slang_T *slang);
static int read_words_section (FILE *fd, slang_T *lp, int len);
static void count_common_word (slang_T *lp, char_u *word, int len, int count);
static int score_wordcount_adj (slang_T *slang, int score, char_u *word, int split);
static int read_sofo_section (FILE *fd, slang_T *slang);
static int read_compound (FILE *fd, slang_T *slang, int len);
static int byte_in_str (char_u *str, int byte);
static int init_syl_tab (slang_T *slang);
static int count_syllables (slang_T *slang, char_u *word);
static int set_sofo (slang_T *lp, char_u *from, char_u *to);
static void set_sal_first (slang_T *lp);



static int spell_read_tree (FILE *fd, char_u **bytsp, idx_T **idxsp, int prefixtree, int prefixcnt);
static idx_T read_tree_node (FILE *fd, char_u *byts, idx_T *idxs, int maxidx, idx_T startidx, int prefixtree, int maxprefcondnr);
static void clear_midword (win_T *buf);
static void use_midword (slang_T *lp, win_T *buf);
static int find_region (char_u *rp, char_u *region);
static int captype (char_u *word, char_u *end);
static int badword_captype (char_u *word, char_u *end);
static void spell_reload_one (char_u *fname, int added_word);
static void set_spell_charflags (char_u *flags, int cnt, char_u *upp);
static int set_spell_chartab (char_u *fol, char_u *low, char_u *upp);
static int spell_casefold (char_u *p, int len, char_u *buf, int buflen);
static int check_need_cap (linenr_T lnum, colnr_T col);
static void spell_find_suggest (char_u *badptr, int badlen, suginfo_T *su, int maxcount, int banbadword, int need_cap, int interactive);

static void spell_suggest_expr (suginfo_T *su, char_u *expr);

static void spell_suggest_file (suginfo_T *su, char_u *fname);
static void spell_suggest_intern (suginfo_T *su, int interactive);
static void suggest_load_files (void);
static void tree_count_words (char_u *byts, idx_T *idxs);
static void spell_find_cleanup (suginfo_T *su);
static void onecap_copy (char_u *word, char_u *wcopy, int upper);
static void allcap_copy (char_u *word, char_u *wcopy);
static void suggest_try_special (suginfo_T *su);
static void suggest_try_change (suginfo_T *su);
static void suggest_trie_walk (suginfo_T *su, langp_T *lp, char_u *fword, int soundfold);
static void go_deeper (trystate_T *stack, int depth, int score_add);



static void find_keepcap_word (slang_T *slang, char_u *fword, char_u *kword);
static void score_comp_sal (suginfo_T *su);
static void score_combine (suginfo_T *su);
static int stp_sal_score (suggest_T *stp, suginfo_T *su, slang_T *slang, char_u *badsound);
static void suggest_try_soundalike_prep (void);
static void suggest_try_soundalike (suginfo_T *su);
static void suggest_try_soundalike_finish (void);
static void add_sound_suggest (suginfo_T *su, char_u *goodword, int score, langp_T *lp);
static int soundfold_find (slang_T *slang, char_u *word);
static void make_case_word (char_u *fword, char_u *cword, int flags);
static void set_map_str (slang_T *lp, char_u *map);
static int similar_chars (slang_T *slang, int c1, int c2);
static void add_suggestion (suginfo_T *su, garray_T *gap, char_u *goodword, int badlen, int score, int altscore, int had_bonus, slang_T *slang, int maxsf);
static void check_suggestions (suginfo_T *su, garray_T *gap);
static void add_banned (suginfo_T *su, char_u *word);
static void rescore_suggestions (suginfo_T *su);
static void rescore_one (suginfo_T *su, suggest_T *stp);
static int cleanup_suggestions (garray_T *gap, int maxscore, int keep);
static void spell_soundfold (slang_T *slang, char_u *inword, int folded, char_u *res);
static void spell_soundfold_sofo (slang_T *slang, char_u *inword, char_u *res);
static void spell_soundfold_sal (slang_T *slang, char_u *inword, char_u *res);



static int soundalike_score (char_u *goodsound, char_u *badsound);
static int spell_edit_score (slang_T *slang, char_u *badword, char_u *goodword);
static int spell_edit_score_limit (slang_T *slang, char_u *badword, char_u *goodword, int limit);



static void dump_word (slang_T *slang, char_u *word, char_u *pat, int *dir, int round, int flags, linenr_T lnum);
static linenr_T dump_prefixes (slang_T *slang, char_u *word, char_u *pat, int *dir, int round, int flags, linenr_T startlnum);
static buf_T *open_spellbuf (void);
static void close_spellbuf (buf_T *buf);
# 984 "spell.c"
static char *e_format = "E759: Format error in spell file";
static char *e_spell_trunc = "E758: Truncated spell file";
static char *e_afftrailing = "Trailing text in %s line %d: %s";
static char *e_affname = "Affix name too long in %s line %d: %s";
static char *e_affform = "E761: Format error in affix file FOL, LOW or UPP";
static char *e_affrange = "E762: Character in FOL, LOW or UPP is out of range";
static char *msg_compressing = "Compressing word tree...";


static char_u *repl_from = ((void *)0);
static char_u *repl_to = ((void *)0);
# 1011 "spell.c"
    int
spell_check(wp, ptr, attrp, capcol, docount)
    win_T *wp;
    char_u *ptr;
    hlf_T *attrp;
    int *capcol;
    int docount;
{
    matchinf_T mi;

    int nrlen = 0;
    int c;
    int wrongcaplen = 0;
    int lpi;
    int count_word = docount;



    if (*ptr <= ' ')
 return 1;


    if (wp->w_s->b_langp.ga_len == 0)
 return 1;

    ((__builtin_object_size ((&mi), 0) != (size_t) -1) ? __builtin___memset_chk ((&mi), (0), (sizeof(matchinf_T)), __builtin_object_size ((&mi), 0)) : __inline_memset_chk ((&mi), (0), (sizeof(matchinf_T))));




    if (*ptr >= '0' && *ptr <= '9')
    {
 if (*ptr == '0' && (ptr[1] == 'x' || ptr[1] == 'X'))
     mi.mi_end = skiphex(ptr + 2);
 else
     mi.mi_end = skipdigits(ptr);
 nrlen = (int)(mi.mi_end - ptr);
    }


    mi.mi_word = ptr;
    mi.mi_fend = ptr;
    if (spell_iswordp(mi.mi_fend, wp))
    {
 do
 {
     ++mi.mi_fend;
 } while (*mi.mi_fend != '\000' && spell_iswordp(mi.mi_fend, wp));

 if (capcol != ((void *)0) && *capcol == 0 && wp->w_s->b_cap_prog != ((void *)0))
 {

     c = ((int)*(ptr));
     if (!((c) < 256 ? spelltab.st_isu[c] : 0))
  wrongcaplen = (int)(mi.mi_fend - ptr);
 }
    }
    if (capcol != ((void *)0))
 *capcol = -1;



    mi.mi_end = mi.mi_fend;


    mi.mi_capflags = 0;
    mi.mi_cend = ((void *)0);
    mi.mi_win = wp;



    if (*mi.mi_fend != '\000')
 ++mi.mi_fend;

    (void)spell_casefold(ptr, (int)(mi.mi_fend - ptr), mi.mi_fword,
            250 + 1);
    mi.mi_fwordlen = (int)strlen((char *)(mi.mi_fword));


    mi.mi_result = 3;
    mi.mi_result2 = 3;






    for (lpi = 0; lpi < wp->w_s->b_langp.ga_len; ++lpi)
    {
 mi.mi_lp = (((langp_T *)(wp->w_s->b_langp).ga_data) + (lpi));



 if (mi.mi_lp->lp_slang->sl_fidxs == ((void *)0))
     continue;


 find_word(&mi, 0);


 find_word(&mi, 1);


 find_prefix(&mi, 0);



 if (mi.mi_lp->lp_slang->sl_nobreak && mi.mi_result == 3
         && mi.mi_result2 != 3)
 {
     mi.mi_result = mi.mi_result2;
     mi.mi_end = mi.mi_end2;
 }


 if (count_word && mi.mi_result == 0)
 {
     count_common_word(mi.mi_lp->lp_slang, ptr,
         (int)(mi.mi_end - ptr), 1);
     count_word = 0;
 }
    }

    if (mi.mi_result != 0)
    {


 if (nrlen > 0)
 {
     if (mi.mi_result == 3 || mi.mi_result == -1)
  return nrlen;
 }



 else if (!spell_iswordp_nmw(ptr))
 {
     if (capcol != ((void *)0) && wp->w_s->b_cap_prog != ((void *)0))
     {
  regmatch_T regmatch;


  regmatch.regprog = wp->w_s->b_cap_prog;
  regmatch.rm_ic = 0;
  if (vim_regexec(&regmatch, ptr, 0))
      *capcol = (int)(regmatch.endp[0] - ptr);
     }





     return 1;
 }
 else if (mi.mi_end == ptr)


     ++mi.mi_end;
 else if (mi.mi_result == 3
  && (((langp_T *)(wp->w_s->b_langp).ga_data) + (0))->lp_slang->sl_nobreak)
 {
     char_u *p, *fp;
     int save_result = mi.mi_result;



     mi.mi_lp = (((langp_T *)(wp->w_s->b_langp).ga_data) + (0));
     if (mi.mi_lp->lp_slang->sl_fidxs != ((void *)0))
     {
  p = mi.mi_word;
  fp = mi.mi_fword;
  for (;;)
  {
      ++p;
      ++fp;
      if (p >= mi.mi_end)
   break;
      mi.mi_compoff = (int)(fp - mi.mi_fword);
      find_word(&mi, 3);
      if (mi.mi_result != 3)
      {
   mi.mi_end = p;
   break;
      }
  }
  mi.mi_result = save_result;
     }
 }

 if (mi.mi_result == 3 || mi.mi_result == -1)
     *attrp = HLF_SPB;
 else if (mi.mi_result == 1)
     *attrp = HLF_SPR;
 else
     *attrp = HLF_SPL;
    }

    if (wrongcaplen > 0 && (mi.mi_result == 0 || mi.mi_result == 1))
    {

 *attrp = HLF_SPC;
 return wrongcaplen;
    }

    return (int)(mi.mi_end - ptr);
}
# 1227 "spell.c"
    static void
find_word(mip, mode)
    matchinf_T *mip;
    int mode;
{
    idx_T arridx = 0;
    int endlen[250];
    idx_T endidx[250];
    int endidxcnt = 0;
    int len;
    int wlen = 0;
    int flen;
    int c;
    char_u *ptr;
    idx_T lo, hi, m;



    char_u *p;
    int res = 3;
    slang_T *slang = mip->mi_lp->lp_slang;
    unsigned flags;
    char_u *byts;
    idx_T *idxs;
    int word_ends;
    int prefix_found;
    int nobreak_result;

    if (mode == 1 || mode == 4)
    {

 ptr = mip->mi_word;
 flen = 9999;
 byts = slang->sl_kbyts;
 idxs = slang->sl_kidxs;

 if (mode == 4)

     wlen += mip->mi_compoff;
    }
    else
    {

 ptr = mip->mi_fword;
 flen = mip->mi_fwordlen;
 byts = slang->sl_fbyts;
 idxs = slang->sl_fidxs;

 if (mode == 2)
 {

     wlen = mip->mi_prefixlen;
     flen -= mip->mi_prefixlen;
 }
 else if (mode == 3)
 {

     wlen = mip->mi_compoff;
     flen -= mip->mi_compoff;
 }

    }

    if (byts == ((void *)0))
 return;







    for (;;)
    {
 if (flen <= 0 && *mip->mi_fend != '\000')
     flen = fold_more(mip);

 len = byts[arridx++];



 if (byts[arridx] == 0)
 {
     if (endidxcnt == 250)
     {

  emsg((char_u *)(((char *)(e_format))));
  return;
     }
     endlen[endidxcnt] = wlen;
     endidx[endidxcnt++] = arridx++;
     --len;



     while (len > 0 && byts[arridx] == 0)
     {
  ++arridx;
  --len;
     }
     if (len == 0)
  break;
 }


 if (ptr[wlen] == '\000')
     break;


 c = ptr[wlen];
 if (c == '\011')
     c = ' ';
 lo = arridx;
 hi = arridx + len - 1;
 while (lo < hi)
 {
     m = (lo + hi) / 2;
     if (byts[m] > c)
  hi = m - 1;
     else if (byts[m] < c)
  lo = m + 1;
     else
     {
  lo = hi = m;
  break;
     }
 }


 if (hi < lo || byts[lo] != c)
     break;


 arridx = idxs[lo];
 ++wlen;
 --flen;



 if (c == ' ')
 {
     for (;;)
     {
  if (flen <= 0 && *mip->mi_fend != '\000')
      flen = fold_more(mip);
  if (ptr[wlen] != ' ' && ptr[wlen] != '\011')
      break;
  ++wlen;
  --flen;
     }
 }
    }





    while (endidxcnt > 0)
    {
 --endidxcnt;
 arridx = endidx[endidxcnt];
 wlen = endlen[endidxcnt];





 if (spell_iswordp(ptr + wlen, mip->mi_win))
 {
     if (slang->sl_compprog == ((void *)0) && !slang->sl_nobreak)
  continue;
     word_ends = 0;
 }
 else
     word_ends = 1;


 prefix_found = 0;
# 1426 "spell.c"
 res = 3;
 for (len = byts[arridx - 1]; len > 0 && byts[arridx] == 0;
             --len, ++arridx)
 {
     flags = idxs[arridx];





     if (mode == 0)
     {
  if (mip->mi_cend != mip->mi_word + wlen)
  {


      mip->mi_cend = mip->mi_word + wlen;
      mip->mi_capflags = captype(mip->mi_word, mip->mi_cend);
  }

  if (mip->mi_capflags == 0x80
    || !spell_valid_case(mip->mi_capflags, flags))
      continue;
     }




     else if (mode == 2 && !prefix_found)
     {
  c = valid_word_prefix(mip->mi_prefcnt, mip->mi_prefarridx,
        flags,
        mip->mi_word + mip->mi_prefixlen, slang,
        0);
  if (c == 0)
      continue;


  if (c & (0x01 << 24))
      flags |= 0x08;
  prefix_found = 1;
     }

     if (slang->sl_nobreak)
     {
  if ((mode == 3 || mode == 4)
   && (flags & 0x10) == 0)
  {


      mip->mi_result = 0;
      break;
  }
     }

     else if ((mode == 3 || mode == 4
        || !word_ends))
     {





  if (((unsigned)flags >> 24) == 0
        || wlen - mip->mi_compoff < slang->sl_compminlen)
      continue;
# 1504 "spell.c"
  if (!word_ends && mip->mi_complen + mip->mi_compextra + 2
          > slang->sl_compmax
        && slang->sl_compsylmax == 250)
      continue;



  if (mip->mi_complen > 0 && (flags & 0x1000))
      continue;
  if (!word_ends && (flags & 0x2000))
      continue;


  if (!byte_in_str(mip->mi_complen == 0
     ? slang->sl_compstartflags
     : slang->sl_compallflags,
         ((unsigned)flags >> 24)))
      continue;



  if (match_checkcompoundpattern(ptr, wlen, &slang->sl_comppat))
      continue;

  if (mode == 3)
  {
      int capflags;
# 1545 "spell.c"
   p = mip->mi_word + mip->mi_compoff;
      capflags = captype(p, mip->mi_word + wlen);
      if (capflags == 0x80 || (capflags == 0x04
       && (flags & 0x40) != 0))
   continue;

      if (capflags != 0x04)
      {




   --p;
   if (spell_iswordp_nmw(p)
    ? capflags == 0x02
    : (flags & 0x02) != 0
           && capflags != 0x02)
       continue;
      }
  }




  mip->mi_compflags[mip->mi_complen] = ((unsigned)flags >> 24);
  mip->mi_compflags[mip->mi_complen + 1] = '\000';
  if (word_ends)
  {
      char_u fword[250];

      if (slang->sl_compsylmax < 250)
      {

   if (ptr == mip->mi_word)
       (void)spell_casefold(ptr, wlen, fword, 250);
   else
       vim_strncpy(fword, ptr, endlen[endidxcnt]);
      }
      if (!can_compound(slang, fword, mip->mi_compflags))
   continue;
  }
  else if (slang->sl_comprules != ((void *)0)
        && !match_compoundrule(slang, mip->mi_compflags))


      continue;
     }


     else if (flags & 0x0200)
  continue;

     nobreak_result = 0;

     if (!word_ends)
     {
  int save_result = mip->mi_result;
  char_u *save_end = mip->mi_end;
  langp_T *save_lp = mip->mi_lp;
  int lpi;






  if (slang->sl_nobreak)
      mip->mi_result = 3;


  mip->mi_compoff = endlen[endidxcnt];
# 1632 "spell.c"
  c = mip->mi_compoff;
  ++mip->mi_complen;
  if (flags & 0x0800)
      ++mip->mi_compextra;



  for (lpi = 0; lpi < mip->mi_win->w_s->b_langp.ga_len; ++lpi)
  {
      if (slang->sl_nobreak)
      {
   mip->mi_lp = (((langp_T *)(mip->mi_win->w_s->b_langp).ga_data) + (lpi));
   if (mip->mi_lp->lp_slang->sl_fidxs == ((void *)0)
      || !mip->mi_lp->lp_slang->sl_nobreak)
       continue;
      }

      find_word(mip, 3);




      if (!slang->sl_nobreak || mip->mi_result == 3)
      {

   mip->mi_compoff = wlen;
   find_word(mip, 4);
# 1670 "spell.c"
      }

      if (!slang->sl_nobreak)
   break;
  }
  --mip->mi_complen;
  if (flags & 0x0800)
      --mip->mi_compextra;
  mip->mi_lp = save_lp;

  if (slang->sl_nobreak)
  {
      nobreak_result = mip->mi_result;
      mip->mi_result = save_result;
      mip->mi_end = save_end;
  }
  else
  {
      if (mip->mi_result == 0)
   break;
      continue;
  }
     }

     if (flags & 0x10)
  res = -1;
     else if (flags & 0x01)
     {

  if ((mip->mi_lp->lp_region & (flags >> 16)) != 0)
      res = 0;
  else
      res = 2;
     }
     else if (flags & 0x08)
  res = 1;
     else
  res = 0;




     if (nobreak_result == 3)
     {
  if (mip->mi_result2 > res)
  {
      mip->mi_result2 = res;
      mip->mi_end2 = mip->mi_word + wlen;
  }
  else if (mip->mi_result2 == res
     && mip->mi_end2 < mip->mi_word + wlen)
      mip->mi_end2 = mip->mi_word + wlen;
     }
     else if (mip->mi_result > res)
     {
  mip->mi_result = res;
  mip->mi_end = mip->mi_word + wlen;
     }
     else if (mip->mi_result == res && mip->mi_end < mip->mi_word + wlen)
  mip->mi_end = mip->mi_word + wlen;

     if (mip->mi_result == 0)
  break;
 }

 if (mip->mi_result == 0)
     break;
    }
}
# 1747 "spell.c"
    static int
match_checkcompoundpattern(ptr, wlen, gap)
    char_u *ptr;
    int wlen;
    garray_T *gap;
{
    int i;
    char_u *p;
    int len;

    for (i = 0; i + 1 < gap->ga_len; i += 2)
    {
 p = ((char_u **)gap->ga_data)[i + 1];
 if (strncmp((char *)(ptr + wlen), (char *)(p), (size_t)(strlen((char *)(p)))) == 0)
 {


     p = ((char_u **)gap->ga_data)[i];
     len = (int)strlen((char *)(p));
     if (len <= wlen && strncmp((char *)(ptr + wlen - len), (char *)(p), (size_t)(len)) == 0)
  return 1;
 }
    }
    return 0;
}





    static int
can_compound(slang, word, flags)
    slang_T *slang;
    char_u *word;
    char_u *flags;
{
    regmatch_T regmatch;




    char_u *p;

    if (slang->sl_compprog == ((void *)0))
 return 0;
# 1804 "spell.c"
 p = flags;
    regmatch.regprog = slang->sl_compprog;
    regmatch.rm_ic = 0;
    if (!vim_regexec(&regmatch, p, 0))
 return 0;




    if (slang->sl_compsylmax < 250
         && count_syllables(slang, word) > slang->sl_compsylmax)
 return (int)strlen((char *)(flags)) < slang->sl_compmax;
    return 1;
}






    static int
can_be_compound(sp, slang, compflags, flag)
    trystate_T *sp;
    slang_T *slang;
    char_u *compflags;
    int flag;
{


    if (!byte_in_str(sp->ts_complen == sp->ts_compsplit
  ? slang->sl_compstartflags : slang->sl_compallflags, flag))
 return 0;




    if (slang->sl_comprules != ((void *)0) && sp->ts_complen > sp->ts_compsplit)
    {
 int v;

 compflags[sp->ts_complen] = flag;
 compflags[sp->ts_complen + 1] = '\000';
 v = match_compoundrule(slang, compflags + sp->ts_compsplit);
 compflags[sp->ts_complen] = '\000';
 return v;
    }

    return 1;
}
# 1861 "spell.c"
    static int
match_compoundrule(slang, compflags)
    slang_T *slang;
    char_u *compflags;
{
    char_u *p;
    int i;
    int c;


    for (p = slang->sl_comprules; *p != '\000'; ++p)
    {


 for (i = 0; ; ++i)
 {
     c = compflags[i];
     if (c == '\000')

  return 1;
     if (*p == '/' || *p == '\000')
  break;
     if (*p == '[')
     {
  int match = 0;


  ++p;
  while (*p != ']' && *p != '\000')
      if (*p++ == c)
   match = 1;
  if (!match)
      break;
     }
     else if (*p != c)
  break;
     ++p;
 }


 p = vim_strchr(p, '/');
 if (p == ((void *)0))
     break;
    }



    return 0;
}






    static int
valid_word_prefix(totprefcnt, arridx, flags, word, slang, cond_req)
    int totprefcnt;
    int arridx;
    int flags;
    char_u *word;
    slang_T *slang;
    int cond_req;
{
    int prefcnt;
    int pidx;
    regprog_T *rp;
    regmatch_T regmatch;
    int prefid;

    prefid = (unsigned)flags >> 24;
    for (prefcnt = totprefcnt - 1; prefcnt >= 0; --prefcnt)
    {
 pidx = slang->sl_pidxs[arridx + prefcnt];


 if (prefid != (pidx & 0xff))
     continue;



 if ((flags & 0x0100) && (pidx & (0x02 << 24)))
     continue;



 rp = slang->sl_prefprog[((unsigned)pidx >> 8) & 0xffff];
 if (rp != ((void *)0))
 {
     regmatch.regprog = rp;
     regmatch.rm_ic = 0;
     if (!vim_regexec(&regmatch, word, 0))
  continue;
 }
 else if (cond_req)
     continue;


 return pidx;
    }
    return 0;
}
# 1973 "spell.c"
    static void
find_prefix(mip, mode)
    matchinf_T *mip;
    int mode;
{
    idx_T arridx = 0;
    int len;
    int wlen = 0;
    int flen;
    int c;
    char_u *ptr;
    idx_T lo, hi, m;
    slang_T *slang = mip->mi_lp->lp_slang;
    char_u *byts;
    idx_T *idxs;

    byts = slang->sl_pbyts;
    if (byts == ((void *)0))
 return;



    ptr = mip->mi_fword;
    flen = mip->mi_fwordlen;
    if (mode == 3)
    {

 ptr += mip->mi_compoff;
 flen -= mip->mi_compoff;
    }
    idxs = slang->sl_pidxs;







    for (;;)
    {
 if (flen == 0 && *mip->mi_fend != '\000')
     flen = fold_more(mip);

 len = byts[arridx++];



 if (byts[arridx] == 0)
 {




     mip->mi_prefarridx = arridx;
     mip->mi_prefcnt = len;
     while (len > 0 && byts[arridx] == 0)
     {
  ++arridx;
  --len;
     }
     mip->mi_prefcnt -= len;


     mip->mi_prefixlen = wlen;
     if (mode == 3)

  mip->mi_prefixlen += mip->mi_compoff;
# 2051 "spell.c"
     find_word(mip, 2);


     if (len == 0)
  break;
 }


 if (ptr[wlen] == '\000')
     break;


 c = ptr[wlen];
 lo = arridx;
 hi = arridx + len - 1;
 while (lo < hi)
 {
     m = (lo + hi) / 2;
     if (byts[m] > c)
  hi = m - 1;
     else if (byts[m] < c)
  lo = m + 1;
     else
     {
  lo = hi = m;
  break;
     }
 }


 if (hi < lo || byts[lo] != c)
     break;


 arridx = idxs[lo];
 ++wlen;
 --flen;
    }
}






    static int
fold_more(mip)
    matchinf_T *mip;
{
    int flen;
    char_u *p;

    p = mip->mi_fend;
    do
    {
 ++mip->mi_fend;
    } while (*mip->mi_fend != '\000' && spell_iswordp(mip->mi_fend, mip->mi_win));


    if (*mip->mi_fend != '\000')
 ++mip->mi_fend;

    (void)spell_casefold(p, (int)(mip->mi_fend - p),
        mip->mi_fword + mip->mi_fwordlen,
        250 - mip->mi_fwordlen);
    flen = (int)strlen((char *)(mip->mi_fword + mip->mi_fwordlen));
    mip->mi_fwordlen += flen;
    return flen;
}





    static int
spell_valid_case(wordflags, treeflags)
    int wordflags;
    int treeflags;
{
    return ((wordflags == 0x04 && (treeflags & 0x40) == 0)
     || ((treeflags & (0x04 | 0x80)) == 0
  && ((treeflags & 0x02) == 0
        || (wordflags & 0x02) != 0)));
}




    static int
no_spell_checking(wp)
    win_T *wp;
{
    if (!wp->w_onebuf_opt.wo_spell || *wp->w_s->b_p_spl == '\000'
      || wp->w_s->b_langp.ga_len == 0)
    {
 emsg((char_u *)(((char *)("E756: Spell checking is not enabled"))));
 return 1;
    }
    return 0;
}
# 2160 "spell.c"
    int
spell_move_to(wp, dir, allwords, curline, attrp)
    win_T *wp;
    int dir;
    int allwords;
    int curline;
    hlf_T *attrp;

{
    linenr_T lnum;
    pos_T found_pos;
    int found_len = 0;
    char_u *line;
    char_u *p;
    char_u *endp;
    hlf_T attr;
    int len;

    int has_syntax = syntax_present(wp);

    int col;
    int can_spell;
    char_u *buf = ((void *)0);
    int buflen = 0;
    int skip = 0;
    int capcol = -1;
    int found_one = 0;
    int wrapped = 0;

    if (no_spell_checking(wp))
 return 0;
# 2203 "spell.c"
    lnum = wp->w_cursor.lnum;
    {(&found_pos)->lnum = 0; (&found_pos)->col = 0; (&found_pos)->coladd = 0;};

    while (!got_int)
    {
 line = ml_get_buf(wp->w_buffer, lnum, 0);

 len = (int)strlen((char *)(line));
 if (buflen < len + 250 + 2)
 {
     vim_free(buf);
     buflen = len + 250 + 2;
     buf = alloc(buflen);
     if (buf == ((void *)0))
  break;
 }


 if (lnum == 1)
     capcol = 0;


 if (capcol == 0)
     capcol = (int)(skipwhite(line) - line);
 else if (curline && wp == curwin)
 {

     col = (int)(skipwhite(line) - line);
     if (check_need_cap(lnum, col))
  capcol = col;



     line = ml_get_buf(wp->w_buffer, lnum, 0);
 }



 ((__builtin_object_size ((char *)(buf), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(buf), (char *)(line), __builtin_object_size ((char *)(buf), 1 > 1)) : __inline_strcpy_chk ((char *)(buf), (char *)(line)));
 if (lnum < wp->w_buffer->b_ml.ml_line_count)
     spell_cat_line(buf + strlen((char *)(buf)),
     ml_get_buf(wp->w_buffer, lnum + 1, 0), 250);

 p = buf + skip;
 endp = buf + len;
 while (p < endp)
 {


     if (dir == (-1)
      && lnum == wp->w_cursor.lnum
      && !wrapped
      && (colnr_T)(p - buf) >= wp->w_cursor.col)
  break;


     attr = HLF_COUNT;
     len = spell_check(wp, p, &attr, &capcol, 0);

     if (attr != HLF_COUNT)
     {

  if (allwords || attr == HLF_SPB)
  {


      if (dir == (-1)
       || lnum != wp->w_cursor.lnum
       || (lnum == wp->w_cursor.lnum
    && (wrapped
        || (colnr_T)(curline ? p - buf + len
           : p - buf)
        > wp->w_cursor.col)))
      {

   if (has_syntax)
   {
       col = (int)(p - buf);
       (void)syn_get_id(wp, lnum, (colnr_T)col,
          0, &can_spell, 0);
       if (!can_spell)
    attr = HLF_COUNT;
   }
   else

       can_spell = 1;

   if (can_spell)
   {
       found_one = 1;
       found_pos.lnum = lnum;
       found_pos.col = (int)(p - buf);

       found_pos.coladd = 0;

       if (dir == 1)
       {

    wp->w_cursor = found_pos;
    vim_free(buf);
    if (attrp != ((void *)0))
        *attrp = attr;
    return len;
       }
       else if (curline)


    found_pos.col += len;
       found_len = len;
   }
      }
      else
   found_one = 1;
  }
     }


     p += len;
     capcol -= len;
 }

 if (dir == (-1) && found_pos.lnum != 0)
 {

     wp->w_cursor = found_pos;
     vim_free(buf);
     return found_len;
 }

 if (curline)
     break;


 if (dir == (-1))
 {


     if (lnum == wp->w_cursor.lnum && wrapped)
  break;

     if (lnum > 1)
  --lnum;
     else if (!p_ws)
  break;
     else
     {


  lnum = wp->w_buffer->b_ml.ml_line_count;
  wrapped = 1;
  if (!shortmess('s'))
      give_warning((char_u *)((char *)(top_bot_msg)), 1);
     }
     capcol = -1;
 }
 else
 {
     if (lnum < wp->w_buffer->b_ml.ml_line_count)
  ++lnum;
     else if (!p_ws)
  break;
     else
     {


  lnum = 1;
  wrapped = 1;
  if (!shortmess('s'))
      give_warning((char_u *)((char *)(bot_top_msg)), 1);
     }



     if (lnum == wp->w_cursor.lnum && (!found_one || wrapped))
  break;



     if (attr == HLF_COUNT)
  skip = (int)(p - endp);
     else
  skip = 0;


     --capcol;


     if (*skipwhite(line) == '\000')
  capcol = 0;
 }

 line_breakcheck();
    }

    vim_free(buf);
    return 0;
}







    void
spell_cat_line(buf, line, maxlen)
    char_u *buf;
    char_u *line;
    int maxlen;
{
    char_u *p;
    int n;

    p = skipwhite(line);
    while (vim_strchr((char_u *)"*#/\"\t", *p) != ((void *)0))
 p = skipwhite(p + 1);

    if (*p != '\000')
    {


 n = (int)(p - line) + 1;
 if (n < maxlen - 1)
 {
     ((__builtin_object_size ((buf), 0) != (size_t) -1) ? __builtin___memset_chk ((buf), (' '), (n), __builtin_object_size ((buf), 0)) : __inline_memset_chk ((buf), (' '), (n)));
     vim_strncpy(buf + n, p, maxlen - 1 - n);
 }
    }
}




typedef struct spelload_S
{
    char_u sl_lang[250 + 1];
    slang_T *sl_slang;
    int sl_nobreak;
} spelload_T;





    static void
spell_load_lang(lang)
    char_u *lang;
{
    char_u fname_enc[85];
    int r;
    spelload_T sl;

    int round;




    ((__builtin_object_size ((char *)(sl.sl_lang), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(sl.sl_lang), (char *)(lang), __builtin_object_size ((char *)(sl.sl_lang), 1 > 1)) : __inline_strcpy_chk ((char *)(sl.sl_lang), (char *)(lang)));
    sl.sl_slang = ((void *)0);
    sl.sl_nobreak = 0;




    for (round = 1; round <= 2; ++round)

    {



 vim_snprintf((char *)fname_enc, sizeof(fname_enc) - 5,
     "spell/%s.%s.spl", lang, spell_enc());
 r = do_in_runtimepath(fname_enc, 0, spell_load_cb, &sl);

 if (r == 0 && *sl.sl_lang != '\000')
 {

     vim_snprintf((char *)fname_enc, sizeof(fname_enc) - 5,
        "spell/%s.ascii.spl", lang);
     r = do_in_runtimepath(fname_enc, 0, spell_load_cb, &sl);


     if (r == 0 && *sl.sl_lang != '\000' && round == 1
      && apply_autocmds(EVENT_SPELLFILEMISSING, lang,
           curbuf->b_fname, 0, curbuf))
  continue;
     break;

 }

 break;

    }

    if (r == 0)
    {
 smsg((char_u *)((char *)("Warning: Cannot find word list \"%s.%s.spl\" or \"%s.ascii.spl\"")),
           lang, spell_enc(), lang);
    }
    else if (sl.sl_slang != ((void *)0))
    {

 ((__builtin_object_size ((char *)(fname_enc + strlen((char *)(fname_enc)) - 3), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(fname_enc + strlen((char *)(fname_enc)) - 3), (char *)("add.spl"), __builtin_object_size ((char *)(fname_enc + strlen((char *)(fname_enc)) - 3), 1 > 1)) : __inline_strcpy_chk ((char *)(fname_enc + strlen((char *)(fname_enc)) - 3), (char *)("add.spl")));
 do_in_runtimepath(fname_enc, 1, spell_load_cb, &sl);
    }
}





    static char_u *
spell_enc()
{





    return (char_u *)"latin1";
}





    static void
int_wordlist_spl(fname)
    char_u *fname;
{
    vim_snprintf((char *)fname, 1024, "%s.%s.spl",
        int_wordlist, spell_enc());
}





    static slang_T *
slang_alloc(lang)
    char_u *lang;
{
    slang_T *lp;

    lp = (slang_T *)alloc_clear(sizeof(slang_T));
    if (lp != ((void *)0))
    {
 if (lang != ((void *)0))
     lp->sl_name = vim_strsave(lang);
 ga_init2(&lp->sl_rep, sizeof(fromto_T), 10);
 ga_init2(&lp->sl_repsal, sizeof(fromto_T), 10);
 lp->sl_compmax = 250;
 lp->sl_compsylmax = 250;
 hash_init(&lp->sl_wordcount);
    }

    return lp;
}




    static void
slang_free(lp)
    slang_T *lp;
{
    vim_free(lp->sl_name);
    vim_free(lp->sl_fname);
    slang_clear(lp);
    vim_free(lp);
}




    static void
slang_clear(lp)
    slang_T *lp;
{
    garray_T *gap;
    fromto_T *ftp;
    salitem_T *smp;
    int i;
    int round;

    vim_free(lp->sl_fbyts);
    lp->sl_fbyts = ((void *)0);
    vim_free(lp->sl_kbyts);
    lp->sl_kbyts = ((void *)0);
    vim_free(lp->sl_pbyts);
    lp->sl_pbyts = ((void *)0);

    vim_free(lp->sl_fidxs);
    lp->sl_fidxs = ((void *)0);
    vim_free(lp->sl_kidxs);
    lp->sl_kidxs = ((void *)0);
    vim_free(lp->sl_pidxs);
    lp->sl_pidxs = ((void *)0);

    for (round = 1; round <= 2; ++round)
    {
 gap = round == 1 ? &lp->sl_rep : &lp->sl_repsal;
 while (gap->ga_len > 0)
 {
     ftp = &((fromto_T *)gap->ga_data)[--gap->ga_len];
     vim_free(ftp->ft_from);
     vim_free(ftp->ft_to);
 }
 ga_clear(gap);
    }

    gap = &lp->sl_sal;
    if (lp->sl_sofo)
    {

 if (gap->ga_data != ((void *)0))

     for (i = 0; i < gap->ga_len; ++i)
  vim_free(((int **)gap->ga_data)[i]);
    }
    else

 while (gap->ga_len > 0)
 {
     smp = &((salitem_T *)gap->ga_data)[--gap->ga_len];
     vim_free(smp->sm_lead);

     vim_free(smp->sm_to);





 }
    ga_clear(gap);

    for (i = 0; i < lp->sl_prefixcnt; ++i)
 vim_free(lp->sl_prefprog[i]);
    lp->sl_prefixcnt = 0;
    vim_free(lp->sl_prefprog);
    lp->sl_prefprog = ((void *)0);

    vim_free(lp->sl_info);
    lp->sl_info = ((void *)0);

    vim_free(lp->sl_midword);
    lp->sl_midword = ((void *)0);

    vim_free(lp->sl_compprog);
    vim_free(lp->sl_comprules);
    vim_free(lp->sl_compstartflags);
    vim_free(lp->sl_compallflags);
    lp->sl_compprog = ((void *)0);
    lp->sl_comprules = ((void *)0);
    lp->sl_compstartflags = ((void *)0);
    lp->sl_compallflags = ((void *)0);

    vim_free(lp->sl_syllable);
    lp->sl_syllable = ((void *)0);
    ga_clear(&lp->sl_syl_items);

    ga_clear_strings(&lp->sl_comppat);

    hash_clear_all(&lp->sl_wordcount, (unsigned)(dumwc.wc_word - (char_u *)&dumwc));
    hash_init(&lp->sl_wordcount);






    slang_clear_sug(lp);

    lp->sl_compmax = 250;
    lp->sl_compminlen = 0;
    lp->sl_compsylmax = 250;
    lp->sl_regions[0] = '\000';
}




    static void
slang_clear_sug(lp)
    slang_T *lp;
{
    vim_free(lp->sl_sbyts);
    lp->sl_sbyts = ((void *)0);
    vim_free(lp->sl_sidxs);
    lp->sl_sidxs = ((void *)0);
    close_spellbuf(lp->sl_sugbuf);
    lp->sl_sugbuf = ((void *)0);
    lp->sl_sugloaded = 0;
    lp->sl_sugtime = 0;
}





    static void
spell_load_cb(fname, cookie)
    char_u *fname;
    void *cookie;
{
    spelload_T *slp = (spelload_T *)cookie;
    slang_T *slang;

    slang = spell_load_file(fname, slp->sl_lang, ((void *)0), 0);
    if (slang != ((void *)0))
    {


 if (slp->sl_nobreak && slang->sl_add)
     slang->sl_nobreak = 1;
 else if (slang->sl_nobreak)
     slp->sl_nobreak = 1;

 slp->sl_slang = slang;
    }
}
# 2738 "spell.c"
    static slang_T *
spell_load_file(fname, lang, old_lp, silent)
    char_u *fname;
    char_u *lang;
    slang_T *old_lp;
    int silent;
{
    FILE *fd;
    char_u buf[8];
    char_u *p;
    int i;
    int n;
    int len;
    char_u *save_sourcing_name = sourcing_name;
    linenr_T save_sourcing_lnum = sourcing_lnum;
    slang_T *lp = ((void *)0);
    int c = 0;
    int res;

    fd = fopen(((char *)fname), ("r"));
    if (fd == ((void *)0))
    {
 if (!silent)
     emsg2((char_u *)(((char *)(e_notopen))), (char_u *)(fname));
 else if (p_verbose > 2)
 {
     verbose_enter();
     smsg((char_u *)e_notopen, fname);
     verbose_leave();
 }
 goto endFAIL;
    }
    if (p_verbose > 2)
    {
 verbose_enter();
 smsg((char_u *)((char *)("Reading spell file \"%s\"")), fname);
 verbose_leave();
    }

    if (old_lp == ((void *)0))
    {
 lp = slang_alloc(lang);
 if (lp == ((void *)0))
     goto endFAIL;


 lp->sl_fname = vim_strsave(fname);
 if (lp->sl_fname == ((void *)0))
     goto endFAIL;


 lp->sl_add = strstr((char *)gettail(fname), ".add.") != ((void *)0);
    }
    else
 lp = old_lp;


    sourcing_name = fname;
    sourcing_lnum = 0;




    for (i = 0; i < 8; ++i)
 buf[i] = getc(fd);
    if (strncmp((char *)(buf), (char *)("VIMspell"), (size_t)(8)) != 0)
    {
 emsg((char_u *)(((char *)("E757: This does not look like a spell file"))));
 goto endFAIL;
    }
    c = getc(fd);
    if (c < 50)
    {
 emsg((char_u *)(((char *)("E771: Old spell file, needs to be updated"))));
 goto endFAIL;
    }
    else if (c > 50)
    {
 emsg((char_u *)(((char *)("E772: Spell file is for newer version of Vim"))));
 goto endFAIL;
    }






    for (;;)
    {
 n = getc(fd);
 if (n == 255)
     break;
 c = getc(fd);
 len = get4c(fd);
 if (len < 0)
     goto truncerr;

 res = 0;
 switch (n)
 {
     case 15:
  lp->sl_info = read_string(fd, len);
  if (lp->sl_info == ((void *)0))
      goto endFAIL;
  break;

     case 0:
  res = read_region_section(fd, lp, len);
  break;

     case 1:
  res = read_charflags_section(fd);
  break;

     case 2:
  lp->sl_midword = read_string(fd, len);
  if (lp->sl_midword == ((void *)0))
      goto endFAIL;
  break;

     case 3:
  res = read_prefcond_section(fd, lp);
  break;

     case 4:
  res = read_rep_section(fd, &lp->sl_rep, lp->sl_rep_first);
  break;

     case 12:
  res = read_rep_section(fd, &lp->sl_repsal, lp->sl_repsal_first);
  break;

     case 5:
  res = read_sal_section(fd, lp);
  break;

     case 6:
  res = read_sofo_section(fd, lp);
  break;

     case 7:
  p = read_string(fd, len);
  if (p == ((void *)0))
      goto endFAIL;
  set_map_str(lp, p);
  vim_free(p);
  break;

     case 13:
  res = read_words_section(fd, lp, len);
  break;

     case 11:
  lp->sl_sugtime = get8ctime(fd);
  break;

     case 14:
  lp->sl_nosplitsugs = 1;
  break;

     case 8:
  res = read_compound(fd, lp, len);
  break;

     case 10:
  lp->sl_nobreak = 1;
  break;

     case 9:
  lp->sl_syllable = read_string(fd, len);
  if (lp->sl_syllable == ((void *)0))
      goto endFAIL;
  if (init_syl_tab(lp) == 0)
      goto endFAIL;
  break;

     default:


  if (c & 1)
  {
      emsg((char_u *)(((char *)("E770: Unsupported section in spell file"))));
      goto endFAIL;
  }
  while (--len >= 0)
      if (getc(fd) < 0)
   goto truncerr;
  break;
 }
someerror:
 if (res == -2)
 {
     emsg((char_u *)(((char *)(e_format))));
     goto endFAIL;
 }
 if (res == -1)
 {
truncerr:
     emsg((char_u *)(((char *)(e_spell_trunc))));
     goto endFAIL;
 }
 if (res == -3)
     goto endFAIL;
    }


    res = spell_read_tree(fd, &lp->sl_fbyts, &lp->sl_fidxs, 0, 0);
    if (res != 0)
 goto someerror;


    res = spell_read_tree(fd, &lp->sl_kbyts, &lp->sl_kidxs, 0, 0);
    if (res != 0)
 goto someerror;


    res = spell_read_tree(fd, &lp->sl_pbyts, &lp->sl_pidxs, 1,
           lp->sl_prefixcnt);
    if (res != 0)
 goto someerror;


    if (old_lp == ((void *)0) && lang != ((void *)0))
    {
 lp->sl_next = first_lang;
 first_lang = lp;
    }

    goto endOK;

endFAIL:
    if (lang != ((void *)0))

 *lang = '\000';
    if (lp != ((void *)0) && old_lp == ((void *)0))
 slang_free(lp);
    lp = ((void *)0);

endOK:
    if (fd != ((void *)0))
 fclose(fd);
    sourcing_name = save_sourcing_name;
    sourcing_lnum = save_sourcing_lnum;

    return lp;
}
# 2992 "spell.c"
    static char_u *
read_cnt_string(fd, cnt_bytes, cntp)
    FILE *fd;
    int cnt_bytes;
    int *cntp;
{
    int cnt = 0;
    int i;
    char_u *str;


    for (i = 0; i < cnt_bytes; ++i)
 cnt = (cnt << 8) + getc(fd);
    if (cnt < 0)
    {
 *cntp = -1;
 return ((void *)0);
    }
    *cntp = cnt;
    if (cnt == 0)
 return ((void *)0);

    str = read_string(fd, cnt);
    if (str == ((void *)0))
 *cntp = -3;
    return str;
}





    static int
read_region_section(fd, lp, len)
    FILE *fd;
    slang_T *lp;
    int len;
{
    int i;

    if (len > 16)
 return -2;
    for (i = 0; i < len; ++i)
 lp->sl_regions[i] = getc(fd);
    lp->sl_regions[len] = '\000';
    return 0;
}






    static int
read_charflags_section(fd)
    FILE *fd;
{
    char_u *flags;
    char_u *fol;
    int flagslen, follen;


    flags = read_cnt_string(fd, 1, &flagslen);
    if (flagslen < 0)
 return flagslen;


    fol = read_cnt_string(fd, 2, &follen);
    if (follen < 0)
    {
 vim_free(flags);
 return follen;
    }


    if (flags != ((void *)0) && fol != ((void *)0))
 set_spell_charflags(flags, flagslen, fol);

    vim_free(flags);
    vim_free(fol);


    if ((flags == ((void *)0)) != (fol == ((void *)0)))
 return -2;
    return 0;
}





    static int
read_prefcond_section(fd, lp)
    FILE *fd;
    slang_T *lp;
{
    int cnt;
    int i;
    int n;
    char_u *p;
    char_u buf[250 + 1];


    cnt = get2c(fd);
    if (cnt <= 0)
 return -2;

    lp->sl_prefprog = (regprog_T **)alloc_clear(
      (unsigned)sizeof(regprog_T *) * cnt);
    if (lp->sl_prefprog == ((void *)0))
 return -3;
    lp->sl_prefixcnt = cnt;

    for (i = 0; i < cnt; ++i)
    {

 n = getc(fd);
 if (n < 0 || n >= 250)
     return -2;



 if (n > 0)
 {
     buf[0] = '^';
     p = buf + 1;
     while (n-- > 0)
  *p++ = getc(fd);
     *p = '\000';
     lp->sl_prefprog[i] = vim_regcomp(buf, 1 + 2);
 }
    }
    return 0;
}





    static int
read_rep_section(fd, gap, first)
    FILE *fd;
    garray_T *gap;
    short *first;
{
    int cnt;
    fromto_T *ftp;
    int i;

    cnt = get2c(fd);
    if (cnt < 0)
 return -1;

    if (ga_grow(gap, cnt) == 0)
 return -3;


    for (; gap->ga_len < cnt; ++gap->ga_len)
    {
 ftp = &((fromto_T *)gap->ga_data)[gap->ga_len];
 ftp->ft_from = read_cnt_string(fd, 1, &i);
 if (i < 0)
     return i;
 if (i == 0)
     return -2;
 ftp->ft_to = read_cnt_string(fd, 1, &i);
 if (i <= 0)
 {
     vim_free(ftp->ft_from);
     if (i < 0)
  return i;
     return -2;
 }
    }


    for (i = 0; i < 256; ++i)
 first[i] = -1;
    for (i = 0; i < gap->ga_len; ++i)
    {
 ftp = &((fromto_T *)gap->ga_data)[i];
 if (first[*ftp->ft_from] == -1)
     first[*ftp->ft_from] = i;
    }
    return 0;
}





    static int
read_sal_section(fd, slang)
    FILE *fd;
    slang_T *slang;
{
    int i;
    int cnt;
    garray_T *gap;
    salitem_T *smp;
    int ccnt;
    char_u *p;
    int c = '\000';

    slang->sl_sofo = 0;

    i = getc(fd);
    if (i & 1)
 slang->sl_followup = 1;
    if (i & 2)
 slang->sl_collapse = 1;
    if (i & 4)
 slang->sl_rem_accents = 1;

    cnt = get2c(fd);
    if (cnt < 0)
 return -1;

    gap = &slang->sl_sal;
    ga_init2(gap, sizeof(salitem_T), 10);
    if (ga_grow(gap, cnt + 1) == 0)
 return -3;


    for (; gap->ga_len < cnt; ++gap->ga_len)
    {
 smp = &((salitem_T *)gap->ga_data)[gap->ga_len];
 ccnt = getc(fd);
 if (ccnt < 0)
     return -1;
 if ((p = alloc(ccnt + 2)) == ((void *)0))
     return -3;
 smp->sm_lead = p;


 for (i = 0; i < ccnt; ++i)
 {
     c = getc(fd);
     if (vim_strchr((char_u *)"0123456789(-<^$", c) != ((void *)0))
  break;
     *p++ = c;
 }
 smp->sm_leadlen = (int)(p - smp->sm_lead);
 *p++ = '\000';


 if (c == '(')
 {
     smp->sm_oneof = p;
     for (++i; i < ccnt; ++i)
     {
  c = getc(fd);
  if (c == ')')
      break;
  *p++ = c;
     }
     *p++ = '\000';
     if (++i < ccnt)
  c = getc(fd);
 }
 else
     smp->sm_oneof = ((void *)0);


 smp->sm_rules = p;
 if (i < ccnt)

     *p++ = c;
 for (++i; i < ccnt; ++i)
     *p++ = getc(fd);
 *p++ = '\000';


 smp->sm_to = read_cnt_string(fd, 1, &ccnt);
 if (ccnt < 0)
 {
     vim_free(smp->sm_lead);
     return ccnt;
 }
# 3299 "spell.c"
    }

    if (gap->ga_len > 0)
    {


 smp = &((salitem_T *)gap->ga_data)[gap->ga_len];
 if ((p = alloc(1)) == ((void *)0))
     return -3;
 p[0] = '\000';
 smp->sm_lead = p;
 smp->sm_leadlen = 0;
 smp->sm_oneof = ((void *)0);
 smp->sm_rules = p;
 smp->sm_to = ((void *)0);
# 3323 "spell.c"
 ++gap->ga_len;
    }


    set_sal_first(slang);

    return 0;
}





    static int
read_words_section(fd, lp, len)
    FILE *fd;
    slang_T *lp;
    int len;
{
    int done = 0;
    int i;
    int c;
    char_u word[250];

    while (done < len)
    {

 for (i = 0; ; ++i)
 {
     c = getc(fd);
     if (c == (-1))
  return -1;
     word[i] = c;
     if (word[i] == '\000')
  break;
     if (i == 250 - 1)
  return -2;
 }


 count_common_word(lp, word, -1, 10);
 done += i + 1;
    }
    return 0;
}





    static void
count_common_word(lp, word, len, count)
    slang_T *lp;
    char_u *word;
    int len;
    int count;
{
    hash_T hash;
    hashitem_T *hi;
    wordcount_T *wc;
    char_u buf[250];
    char_u *p;

    if (len == -1)
 p = word;
    else
    {
 vim_strncpy(buf, word, len);
 p = buf;
    }

    hash = hash_hash(p);
    hi = hash_lookup(&lp->sl_wordcount, p, hash);
    if (((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
    {
 wc = (wordcount_T *)alloc((unsigned)(sizeof(wordcount_T) + strlen((char *)(p))));
 if (wc == ((void *)0))
     return;
 ((__builtin_object_size ((char *)(wc->wc_word), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(wc->wc_word), (char *)(p), __builtin_object_size ((char *)(wc->wc_word), 1 > 1)) : __inline_strcpy_chk ((char *)(wc->wc_word), (char *)(p)));
 wc->wc_count = count;
 hash_add_item(&lp->sl_wordcount, hi, wc->wc_word, hash);
    }
    else
    {
 wc = ((wordcount_T *)((hi)->hi_key - (unsigned)(dumwc.wc_word - (char_u *)&dumwc)));
 if ((wc->wc_count += count) < (unsigned)count)
     wc->wc_count = 0xffff;
    }
}




    static int
score_wordcount_adj(slang, score, word, split)
    slang_T *slang;
    int score;
    char_u *word;
    int split;
{
    hashitem_T *hi;
    wordcount_T *wc;
    int bonus;
    int newscore;

    hi = hash_find(&slang->sl_wordcount, word);
    if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
    {
 wc = ((wordcount_T *)((hi)->hi_key - (unsigned)(dumwc.wc_word - (char_u *)&dumwc)));
 if (wc->wc_count < 10)
     bonus = 30;
 else if (wc->wc_count < 100)
     bonus = 40;
 else
     bonus = 50;
 if (split)
     newscore = score - bonus / 2;
 else
     newscore = score - bonus;
 if (newscore < 0)
     return 0;
 return newscore;
    }
    return score;
}





    static int
read_sofo_section(fd, slang)
    FILE *fd;
    slang_T *slang;
{
    int cnt;
    char_u *from, *to;
    int res;

    slang->sl_sofo = 1;


    from = read_cnt_string(fd, 2, &cnt);
    if (cnt < 0)
 return cnt;


    to = read_cnt_string(fd, 2, &cnt);
    if (cnt < 0)
    {
 vim_free(from);
 return cnt;
    }


    if (from != ((void *)0) && to != ((void *)0))
 res = set_sofo(slang, from, to);
    else if (from != ((void *)0) || to != ((void *)0))
 res = -2;
    else
 res = 0;

    vim_free(from);
    vim_free(to);
    return res;
}






    static int
read_compound(fd, slang, len)
    FILE *fd;
    slang_T *slang;
    int len;
{
    int todo = len;
    int c;
    int atstart;
    char_u *pat;
    char_u *pp;
    char_u *cp;
    char_u *ap;
    char_u *crp;
    int cnt;
    garray_T *gap;

    if (todo < 2)
 return -2;

    --todo;
    c = getc(fd);
    if (c < 2)
 c = 250;
    slang->sl_compmax = c;

    --todo;
    c = getc(fd);
    if (c < 1)
 c = 0;
    slang->sl_compminlen = c;

    --todo;
    c = getc(fd);
    if (c < 1)
 c = 250;
    slang->sl_compsylmax = c;

    c = getc(fd);
    if (c != 0)
 ungetc(c, fd);
    else
    {
 --todo;
 c = getc(fd);
 --todo;
 slang->sl_compoptions = c;

 gap = &slang->sl_comppat;
 c = get2c(fd);
 todo -= 2;
 ga_init2(gap, sizeof(char_u *), c);
 if (ga_grow(gap, c) == 1)
     while (--c >= 0)
     {
  ((char_u **)(gap->ga_data))[gap->ga_len++] =
       read_cnt_string(fd, 1, &cnt);

  if (cnt < 0)
      return cnt;
  todo -= cnt + 1;
     }
    }
    if (todo < 0)
 return -2;





    c = todo * 2 + 7;




    pat = alloc((unsigned)c);
    if (pat == ((void *)0))
 return -3;



    cp = alloc(todo + 1);
    if (cp == ((void *)0))
    {
 vim_free(pat);
 return -3;
    }
    slang->sl_compstartflags = cp;
    *cp = '\000';

    ap = alloc(todo + 1);
    if (ap == ((void *)0))
    {
 vim_free(pat);
 return -3;
    }
    slang->sl_compallflags = ap;
    *ap = '\000';




    crp = alloc(todo + 1);
    slang->sl_comprules = crp;

    pp = pat;
    *pp++ = '^';
    *pp++ = '\\';
    *pp++ = '(';

    atstart = 1;
    while (todo-- > 0)
    {
 c = getc(fd);
 if (c == (-1))
 {
     vim_free(pat);
     return -1;
 }


 if (vim_strchr((char_u *)"+*[]/", c) == ((void *)0)
  && !byte_in_str(slang->sl_compallflags, c))
 {
     *ap++ = c;
     *ap = '\000';
 }

 if (atstart != 0)
 {


     if (c == '[')
  atstart = 2;
     else if (c == ']')
  atstart = 0;
     else
     {
  if (!byte_in_str(slang->sl_compstartflags, c))
  {
      *cp++ = c;
      *cp = '\000';
  }
  if (atstart == 1)
      atstart = 0;
     }
 }


 if (crp != ((void *)0))
 {
     if (c == '+' || c == '*')
     {
  vim_free(slang->sl_comprules);
  slang->sl_comprules = ((void *)0);
  crp = ((void *)0);
     }
     else
  *crp++ = c;
 }

 if (c == '/')
 {
     *pp++ = '\\';
     *pp++ = '|';
     atstart = 1;
 }
 else
 {
     if (c == '+' || c == '~')
  *pp++ = '\\';





  *pp++ = c;
 }
    }

    *pp++ = '\\';
    *pp++ = ')';
    *pp++ = '$';
    *pp = '\000';

    if (crp != ((void *)0))
 *crp = '\000';

    slang->sl_compprog = vim_regcomp(pat, 1 + 2 + 4);
    vim_free(pat);
    if (slang->sl_compprog == ((void *)0))
 return -2;

    return 0;
}





    static int
byte_in_str(str, n)
    char_u *str;
    int n;
{
    char_u *p;

    for (p = str; *p != '\000'; ++p)
 if (*p == n)
     return 1;
    return 0;
}


typedef struct syl_item_S
{
    char_u sy_chars[30];
    int sy_len;
} syl_item_T;





    static int
init_syl_tab(slang)
    slang_T *slang;
{
    char_u *p;
    char_u *s;
    int l;
    syl_item_T *syl;

    ga_init2(&slang->sl_syl_items, sizeof(syl_item_T), 4);
    p = vim_strchr(slang->sl_syllable, '/');
    while (p != ((void *)0))
    {
 *p++ = '\000';
 if (*p == '\000')
     break;
 s = p;
 p = vim_strchr(p, '/');
 if (p == ((void *)0))
     l = (int)strlen((char *)(s));
 else
     l = (int)(p - s);
 if (l >= 30)
     return -2;
 if (ga_grow(&slang->sl_syl_items, 1) == 0)
     return -3;
 syl = ((syl_item_T *)slang->sl_syl_items.ga_data)
            + slang->sl_syl_items.ga_len++;
 vim_strncpy(syl->sy_chars, s, l);
 syl->sy_len = l;
    }
    return 1;
}






    static int
count_syllables(slang, word)
    slang_T *slang;
    char_u *word;
{
    int cnt = 0;
    int skip = 0;
    char_u *p;
    int len;
    int i;
    syl_item_T *syl;
    int c;

    if (slang->sl_syllable == ((void *)0))
 return 0;

    for (p = word; *p != '\000'; p += len)
    {

 if (*p == ' ')
 {
     len = 1;
     cnt = 0;
     continue;
 }


 len = 0;
 for (i = 0; i < slang->sl_syl_items.ga_len; ++i)
 {
     syl = ((syl_item_T *)slang->sl_syl_items.ga_data) + i;
     if (syl->sy_len > len
          && strncmp((char *)(p), (char *)(syl->sy_chars), (size_t)(syl->sy_len)) == 0)
  len = syl->sy_len;
 }
 if (len != 0)
 {
     ++cnt;
     skip = 0;
 }
 else
 {





     c = *p;
     len = 1;

     if (vim_strchr(slang->sl_syllable, c) == ((void *)0))
  skip = 0;
     else if (!skip)
     {
  ++cnt;
  skip = 1;
     }
 }
    }
    return cnt;
}





    static int
set_sofo(lp, from, to)
    slang_T *lp;
    char_u *from;
    char_u *to;
{
    int i;
# 3900 "spell.c"
    {

 if (strlen((char *)(from)) != strlen((char *)(to)))
     return -2;

 for (i = 0; to[i] != '\000'; ++i)
     lp->sl_sal_first[from[i]] = to[i];
 lp->sl_sal.ga_len = 1;
    }

    return 0;
}




    static void
set_sal_first(lp)
    slang_T *lp;
{
    salfirst_T *sfirst;
    int i;
    salitem_T *smp;
    int c;
    garray_T *gap = &lp->sl_sal;

    sfirst = lp->sl_sal_first;
    for (i = 0; i < 256; ++i)
 sfirst[i] = -1;
    smp = (salitem_T *)gap->ga_data;
    for (i = 0; i < gap->ga_len; ++i)
    {
# 3940 "spell.c"
     c = *smp[i].sm_lead;
 if (sfirst[c] == -1)
 {
     sfirst[c] = i;
# 3973 "spell.c"
 }
    }
}
# 4007 "spell.c"
    static int
spell_read_tree(fd, bytsp, idxsp, prefixtree, prefixcnt)
    FILE *fd;
    char_u **bytsp;
    idx_T **idxsp;
    int prefixtree;
    int prefixcnt;
{
    int len;
    int idx;
    char_u *bp;
    idx_T *ip;



    len = get4c(fd);
    if (len < 0)
 return -1;
    if (len > 0)
    {

 bp = lalloc((long_u)len, 1);
 if (bp == ((void *)0))
     return -3;
 *bytsp = bp;


 ip = (idx_T *)lalloc_clear((long_u)(len * sizeof(int)), 1);
 if (ip == ((void *)0))
     return -3;
 *idxsp = ip;


 idx = read_tree_node(fd, bp, ip, len, 0, prefixtree, prefixcnt);
 if (idx < 0)
     return idx;
    }
    return 0;
}
# 4057 "spell.c"
    static idx_T
read_tree_node(fd, byts, idxs, maxidx, startidx, prefixtree, maxprefcondnr)
    FILE *fd;
    char_u *byts;
    idx_T *idxs;
    int maxidx;
    idx_T startidx;
    int prefixtree;
    int maxprefcondnr;
{
    int len;
    int i;
    int n;
    idx_T idx = startidx;
    int c;
    int c2;


    len = getc(fd);
    if (len <= 0)
 return -1;

    if (startidx + len >= maxidx)
 return -2;
    byts[idx++] = len;


    for (i = 1; i <= len; ++i)
    {
 c = getc(fd);
 if (c < 0)
     return -1;
 if (c <= 3)
 {
     if (c == 0 && !prefixtree)
     {

  idxs[idx] = 0;
  c = 0;
     }
     else if (c != 1)
     {
  if (prefixtree)
  {




      if (c == 2)
   c = getc(fd) << 24;
      else
   c = 0;

      c |= getc(fd);

      n = get2c(fd);
      if (n >= maxprefcondnr)
   return -2;
      c |= (n << 8);
  }
  else
  {



      c2 = c;
      c = getc(fd);
      if (c2 == 3)
   c = (getc(fd) << 8) + c;
      if (c & 0x01)
   c = (getc(fd) << 16) + c;
      if (c & 0x20)
   c = (getc(fd) << 24) + c;
  }

  idxs[idx] = c;
  c = 0;
     }
     else
     {

  n = get3c(fd);
  if (n < 0 || n >= maxidx)
      return -2;
  idxs[idx] = n + 0x8000000;
  c = getc(fd);
     }
 }
 byts[idx++] = c;
    }




    for (i = 1; i <= len; ++i)
 if (byts[startidx + i] != 0)
 {
     if (idxs[startidx + i] & 0x8000000)
  idxs[startidx + i] &= ~0x8000000;
     else
     {
  idxs[startidx + i] = idx;
  idx = read_tree_node(fd, byts, idxs, maxidx, idx,
           prefixtree, maxprefcondnr);
  if (idx < 0)
      break;
     }
 }

    return idx;
}





    char_u *
did_set_spelllang(wp)
    win_T *wp;
{
    garray_T ga;
    char_u *splp;
    char_u *region;
    char_u region_cp[3];
    int filename;
    int region_mask;
    slang_T *slang;
    int c;
    char_u lang[250 + 1];
    char_u spf_name[1024];
    int len;
    char_u *p;
    int round;
    char_u *spf;
    char_u *use_region = ((void *)0);
    int dont_use_region = 0;
    int nobreak = 0;
    int i, j;
    langp_T *lp, *lp2;
    static int recursive = 0;
    char_u *ret_msg = ((void *)0);
    char_u *spl_copy;




    if (recursive)
 return ((void *)0);
    recursive = 1;

    ga_init2(&ga, sizeof(langp_T), 2);
    clear_midword(wp);



    spl_copy = vim_strsave(wp->w_s->b_p_spl);
    if (spl_copy == ((void *)0))
 goto theend;


    for (splp = spl_copy; *splp != '\000'; )
    {

 copy_option_part(&splp, lang, 250, ",");
 region = ((void *)0);
 len = (int)strlen((char *)(lang));




 if (len > 4 && strcasecmp((char *)(((lang + len - 4))), (char *)(((".spl")))) == 0)
 {
     filename = 1;


     p = vim_strchr(gettail(lang), '_');
     if (p != ((void *)0) && ((p[1]) < 0x7f && isalpha(p[1])) && ((p[2]) < 0x7f && isalpha(p[2]))
            && !((p[3]) < 0x7f && isalpha(p[3])))
     {
  vim_strncpy(region_cp, p + 1, 2);
  ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(p), (char *)(p + 3), len - (p - lang) - 2, __builtin_object_size ((char *)(p), 0)) : __inline_memmove_chk ((char *)(p), (char *)(p + 3), len - (p - lang) - 2));
  len -= 3;
  region = region_cp;
     }
     else
  dont_use_region = 1;


     for (slang = first_lang; slang != ((void *)0); slang = slang->sl_next)
  if (fullpathcmp(lang, slang->sl_fname, 0) == 1)
      break;
 }
 else
 {
     filename = 0;
     if (len > 3 && lang[len - 3] == '_')
     {
  region = lang + len - 2;
  len -= 3;
  lang[len] = '\000';
     }
     else
  dont_use_region = 1;


     for (slang = first_lang; slang != ((void *)0); slang = slang->sl_next)
  if (strcasecmp((char *)(lang), (char *)(slang->sl_name)) == 0)
      break;
 }

 if (region != ((void *)0))
 {


     if (use_region != ((void *)0) && strcmp((char *)(region), (char *)(use_region)) != 0)
  dont_use_region = 1;
     use_region = region;
 }


 if (slang == ((void *)0))
 {
     if (filename)
  (void)spell_load_file(lang, lang, ((void *)0), 0);
     else
     {
  spell_load_lang(lang);



  if (!buf_valid(wp->w_buffer))
  {
      ret_msg = (char_u *)"E797: SpellFileMissing autocommand deleted buffer";
      goto theend;
  }

     }
 }




 for (slang = first_lang; slang != ((void *)0); slang = slang->sl_next)
     if (filename ? fullpathcmp(lang, slang->sl_fname, 0) == 1
    : strcasecmp((char *)(lang), (char *)(slang->sl_name)) == 0)
     {
  region_mask = 0xff;
  if (!filename && region != ((void *)0))
  {

      c = find_region(slang->sl_regions, region);
      if (c == 0xff)
      {
   if (slang->sl_add)
   {
       if (*slang->sl_regions != '\000')

    region_mask = 0;
   }
   else


       smsg((char_u *)
        ((char *)("Warning: region %s not supported")),
              region);
      }
      else
   region_mask = 1 << c;
  }

  if (region_mask != 0)
  {
      if (ga_grow(&ga, 1) == 0)
      {
   ga_clear(&ga);
   ret_msg = e_outofmem;
   goto theend;
      }
      (((langp_T *)(ga).ga_data) + (ga.ga_len))->lp_slang = slang;
      (((langp_T *)(ga).ga_data) + (ga.ga_len))->lp_region = region_mask;
      ++ga.ga_len;
      use_midword(slang, wp);
      if (slang->sl_nobreak)
   nobreak = 1;
  }
     }
    }





    spf = curwin->w_s->b_p_spf;
    for (round = 0; round == 0 || *spf != '\000'; ++round)
    {
 if (round == 0)
 {

     if (int_wordlist == ((void *)0))
  continue;
     int_wordlist_spl(spf_name);
 }
 else
 {

     copy_option_part(&spf, spf_name, 1024 - 5, ",");
     ((__builtin_object_size ((char *)(spf_name), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(spf_name), (char *)(".spl"), __builtin_object_size ((char *)(spf_name), 1 > 1)) : __inline_strcat_chk ((char *)(spf_name), (char *)(".spl")));


     for (c = 0; c < ga.ga_len; ++c)
     {
  p = (((langp_T *)(ga).ga_data) + (c))->lp_slang->sl_fname;
  if (p != ((void *)0) && fullpathcmp(spf_name, p, 0) == 1)
      break;
     }
     if (c < ga.ga_len)
  continue;
 }


 for (slang = first_lang; slang != ((void *)0); slang = slang->sl_next)
     if (fullpathcmp(spf_name, slang->sl_fname, 0) == 1)
  break;
 if (slang == ((void *)0))
 {



     if (round == 0)
  ((__builtin_object_size ((char *)(lang), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(lang), (char *)("internal wordlist"), __builtin_object_size ((char *)(lang), 1 > 1)) : __inline_strcpy_chk ((char *)(lang), (char *)("internal wordlist")));
     else
     {
  vim_strncpy(lang, gettail(spf_name), 250);
  p = vim_strchr(lang, '.');
  if (p != ((void *)0))
      *p = '\000';
     }
     slang = spell_load_file(spf_name, lang, ((void *)0), 1);



     if (slang != ((void *)0) && nobreak)
  slang->sl_nobreak = 1;
 }
 if (slang != ((void *)0) && ga_grow(&ga, 1) == 1)
 {
     region_mask = 0xff;
     if (use_region != ((void *)0) && !dont_use_region)
     {

  c = find_region(slang->sl_regions, use_region);
  if (c != 0xff)
      region_mask = 1 << c;
  else if (*slang->sl_regions != '\000')

      region_mask = 0;
     }

     if (region_mask != 0)
     {
  (((langp_T *)(ga).ga_data) + (ga.ga_len))->lp_slang = slang;
  (((langp_T *)(ga).ga_data) + (ga.ga_len))->lp_sallang = ((void *)0);
  (((langp_T *)(ga).ga_data) + (ga.ga_len))->lp_replang = ((void *)0);
  (((langp_T *)(ga).ga_data) + (ga.ga_len))->lp_region = region_mask;
  ++ga.ga_len;
  use_midword(slang, wp);
     }
 }
    }


    ga_clear(&wp->w_s->b_langp);
    wp->w_s->b_langp = ga;




    for (i = 0; i < ga.ga_len; ++i)
    {
 lp = (((langp_T *)(ga).ga_data) + (i));


 if (lp->lp_slang->sl_sal.ga_len > 0)

     lp->lp_sallang = lp->lp_slang;
 else

     for (j = 0; j < ga.ga_len; ++j)
     {
  lp2 = (((langp_T *)(ga).ga_data) + (j));
  if (lp2->lp_slang->sl_sal.ga_len > 0
   && strncmp((char *)(lp->lp_slang->sl_name), (char *)(lp2->lp_slang->sl_name), (size_t)(2)) == 0)

  {
      lp->lp_sallang = lp2->lp_slang;
      break;
  }
     }


 if (lp->lp_slang->sl_rep.ga_len > 0)

     lp->lp_replang = lp->lp_slang;
 else

     for (j = 0; j < ga.ga_len; ++j)
     {
  lp2 = (((langp_T *)(ga).ga_data) + (j));
  if (lp2->lp_slang->sl_rep.ga_len > 0
   && strncmp((char *)(lp->lp_slang->sl_name), (char *)(lp2->lp_slang->sl_name), (size_t)(2)) == 0)

  {
      lp->lp_replang = lp2->lp_slang;
      break;
  }
     }
    }

theend:
    vim_free(spl_copy);
    recursive = 0;
    return ret_msg;
}




    static void
clear_midword(wp)
    win_T *wp;
{
    ((__builtin_object_size ((wp->w_s->b_spell_ismw), 0) != (size_t) -1) ? __builtin___memset_chk ((wp->w_s->b_spell_ismw), (0), (256), __builtin_object_size ((wp->w_s->b_spell_ismw), 0)) : __inline_memset_chk ((wp->w_s->b_spell_ismw), (0), (256)));




}





    static void
use_midword(lp, wp)
    slang_T *lp;
    win_T *wp;
{
    char_u *p;

    if (lp->sl_midword == ((void *)0))
 return;

    for (p = lp->sl_midword; *p != '\000'; )
# 4539 "spell.c"
     wp->w_s->b_spell_ismw[*p++] = 1;
}






    static int
find_region(rp, region)
    char_u *rp;
    char_u *region;
{
    int i;

    for (i = 0; ; i += 2)
    {
 if (rp[i] == '\000')
     return 0xff;
 if (rp[i] == region[0] && rp[i + 1] == region[1])
     break;
    }
    return i / 2;
}
# 4571 "spell.c"
    static int
captype(word, end)
    char_u *word;
    char_u *end;
{
    char_u *p;
    int c;
    int firstcap;
    int allcap;
    int past_second = 0;


    for (p = word; !spell_iswordp_nmw(p); ++p)
 if (end == ((void *)0) ? *p == '\000' : p >= end)
     return 0;





 c = *p++;
    firstcap = allcap = ((c) < 256 ? spelltab.st_isu[c] : 0);





    for ( ; end == ((void *)0) ? *p != '\000' : p < end; ++p)
 if (spell_iswordp_nmw(p))
 {
     c = ((int)*(p));
     if (!((c) < 256 ? spelltab.st_isu[c] : 0))
     {

  if (past_second && allcap)
      return 0x80;
  allcap = 0;
     }
     else if (!allcap)

  return 0x80;
     past_second = 1;
 }

    if (allcap)
 return 0x04;
    if (firstcap)
 return 0x02;
    return 0;
}






    static int
badword_captype(word, end)
    char_u *word;
    char_u *end;
{
    int flags = captype(word, end);
    int c;
    int l, u;
    int first;
    char_u *p;

    if (flags & 0x80)
    {

 l = u = 0;
 first = 0;
 for (p = word; p < end; ++p)
 {
     c = ((int)*(p));
     if (((c) < 256 ? spelltab.st_isu[c] : 0))
     {
  ++u;
  if (p == word)
      first = 1;
     }
     else
  ++l;
 }





 if (u > l && u > 2)
     flags |= 0x04;
 else if (first)
     flags |= 0x02;

 if (u >= 2 && l >= 2)
     flags |= 0x20;
    }
    return flags;
}
# 4750 "spell.c"
    static void
spell_reload_one(fname, added_word)
    char_u *fname;
    int added_word;
{
    slang_T *slang;
    int didit = 0;

    for (slang = first_lang; slang != ((void *)0); slang = slang->sl_next)
    {
 if (fullpathcmp(fname, slang->sl_fname, 0) == 1)
 {
     slang_clear(slang);
     if (spell_load_file(fname, ((void *)0), slang, 0) == ((void *)0))

  slang_clear(slang);
     redraw_all_later(35);
     didit = 1;
 }
    }



    if (added_word && !didit)
 did_set_spelllang(curwin);
}
# 4787 "spell.c"
typedef struct afffile_S
{
    char_u *af_enc;
    int af_flagtype;
    unsigned af_rare;
    unsigned af_keepcase;
    unsigned af_bad;
    unsigned af_needaffix;
    unsigned af_circumfix;
    unsigned af_needcomp;
    unsigned af_comproot;
    unsigned af_compforbid;
    unsigned af_comppermit;
    unsigned af_nosuggest;
    int af_pfxpostpone;

    hashtab_T af_pref;
    hashtab_T af_suff;
    hashtab_T af_comp;
} afffile_T;






typedef struct affentry_S affentry_T;

struct affentry_S
{
    affentry_T *ae_next;
    char_u *ae_chop;
    char_u *ae_add;
    char_u *ae_flags;
    char_u *ae_cond;
    regprog_T *ae_prog;
    char ae_compforbid;
    char ae_comppermit;
};
# 4834 "spell.c"
typedef struct affheader_S
{
    char_u ah_key[7];
    unsigned ah_flag;
    int ah_newID;
    int ah_combine;
    int ah_follows;
    affentry_T *ah_first;
} affheader_T;




typedef struct compitem_S
{
    char_u ci_key[7];
    unsigned ci_flag;
    int ci_newID;
} compitem_T;
# 4865 "spell.c"
typedef struct sblock_S sblock_T;
struct sblock_S
{
    int sb_used;
    sblock_T *sb_next;
    char_u sb_data[1];
};




typedef struct wordnode_S wordnode_T;
struct wordnode_S
{
    union
    {
 char_u hashkey[6];
 int index;

    } wn_u1;
    union
    {
 wordnode_T *next;
 wordnode_T *wnode;
    } wn_u2;
    wordnode_T *wn_child;
    wordnode_T *wn_sibling;

    int wn_refs;



    char_u wn_byte;





    char_u wn_affixID;
    short_u wn_flags;
    short wn_region;




};
# 4919 "spell.c"
typedef struct spellinfo_S
{
    wordnode_T *si_foldroot;
    long si_foldwcount;

    wordnode_T *si_keeproot;
    long si_keepwcount;

    wordnode_T *si_prefroot;

    long si_sugtree;

    sblock_T *si_blocks;
    long si_blocks_cnt;
    long si_compress_cnt;

    wordnode_T *si_first_free;

    long si_free_count;



    buf_T *si_spellbuf;

    int si_ascii;
    int si_add;
    int si_clear_chartab;
    int si_region;
    vimconv_T si_conv;
    int si_memtot;
    int si_verbose;
    int si_msg_count;
    char_u *si_info;
    int si_region_count;

    char_u si_region_name[16];


    garray_T si_rep;
    garray_T si_repsal;
    garray_T si_sal;
    char_u *si_sofofr;
    char_u *si_sofoto;
    int si_nosugfile;
    int si_nosplitsugs;
    int si_followup;
    int si_collapse;
    hashtab_T si_commonwords;
    time_t si_sugtime;
    int si_rem_accents;
    garray_T si_map;
    char_u *si_midword;
    int si_compmax;
    int si_compminlen;
    int si_compsylmax;
    int si_compoptions;
    garray_T si_comppat;

    char_u *si_compflags;
    char_u si_nobreak;
    char_u *si_syllable;
    garray_T si_prefcond;

    int si_newprefID;
    int si_newcompID;
} spellinfo_T;

static afffile_T *spell_read_aff (spellinfo_T *spin, char_u *fname);
static int is_aff_rule (char_u **items, int itemcnt, char *rulename, int mincount);
static void aff_process_flags (afffile_T *affile, affentry_T *entry);
static int spell_info_item (char_u *s);
static unsigned affitem2flag (int flagtype, char_u *item, char_u *fname, int lnum);
static unsigned get_affitem (int flagtype, char_u **pp);
static void process_compflags (spellinfo_T *spin, afffile_T *aff, char_u *compflags);
static void check_renumber (spellinfo_T *spin);
static int flag_in_afflist (int flagtype, char_u *afflist, unsigned flag);
static void aff_check_number (int spinval, int affval, char *name);
static void aff_check_string (char_u *spinval, char_u *affval, char *name);
static int str_equal (char_u *s1, char_u *s2);
static void add_fromto (spellinfo_T *spin, garray_T *gap, char_u *from, char_u *to);
static int sal_to_bool (char_u *s);
static int has_non_ascii (char_u *s);
static void spell_free_aff (afffile_T *aff);
static int spell_read_dic (spellinfo_T *spin, char_u *fname, afffile_T *affile);
static int get_affix_flags (afffile_T *affile, char_u *afflist);
static int get_pfxlist (afffile_T *affile, char_u *afflist, char_u *store_afflist);
static void get_compflags (afffile_T *affile, char_u *afflist, char_u *store_afflist);
static int store_aff_word (spellinfo_T *spin, char_u *word, char_u *afflist, afffile_T *affile, hashtab_T *ht, hashtab_T *xht, int condit, int flags, char_u *pfxlist, int pfxlen);
static int spell_read_wordfile (spellinfo_T *spin, char_u *fname);
static void *getroom (spellinfo_T *spin, size_t len, int align);
static char_u *getroom_save (spellinfo_T *spin, char_u *s);
static void free_blocks (sblock_T *bl);
static wordnode_T *wordtree_alloc (spellinfo_T *spin);
static int store_word (spellinfo_T *spin, char_u *word, int flags, int region, char_u *pfxlist, int need_affix);
static int tree_add_word (spellinfo_T *spin, char_u *word, wordnode_T *tree, int flags, int region, int affixID);
static wordnode_T *get_wordnode (spellinfo_T *spin);
static int deref_wordnode (spellinfo_T *spin, wordnode_T *node);
static void free_wordnode (spellinfo_T *spin, wordnode_T *n);
static void wordtree_compress (spellinfo_T *spin, wordnode_T *root);
static int node_compress (spellinfo_T *spin, wordnode_T *node, hashtab_T *ht, int *tot);
static int node_equal (wordnode_T *n1, wordnode_T *n2);
static int write_vim_spell (spellinfo_T *spin, char_u *fname);
static void clear_node (wordnode_T *node);
static int put_node (FILE *fd, wordnode_T *node, int idx, int regionmask, int prefixtree);
static void spell_make_sugfile (spellinfo_T *spin, char_u *wfname);
static int sug_filltree (spellinfo_T *spin, slang_T *slang);
static int sug_maketable (spellinfo_T *spin);
static int sug_filltable (spellinfo_T *spin, wordnode_T *node, int startwordnr, garray_T *gap);
static int offset2bytes (int nr, char_u *buf);
static int bytes2offset (char_u **pp);
static void sug_write (spellinfo_T *spin, char_u *fname);
static void mkspell (int fcount, char_u **fnames, int ascii, int overwrite, int added_word);
static void spell_message (spellinfo_T *spin, char_u *str);
static void init_spellfile (void);
# 5048 "spell.c"
static long compress_start = 30000;
static long compress_inc = 100;
static long compress_added = 500000;
# 5157 "spell.c"
    static afffile_T *
spell_read_aff(spin, fname)
    spellinfo_T *spin;
    char_u *fname;
{
    FILE *fd;
    afffile_T *aff;
    char_u rline[500];
    char_u *line;
    char_u *pc = ((void *)0);

    char_u *(items[30]);
    int itemcnt;
    char_u *p;
    int lnum = 0;
    affheader_T *cur_aff = ((void *)0);
    int did_postpone_prefix = 0;
    int aff_todo = 0;
    hashtab_T *tp;
    char_u *low = ((void *)0);
    char_u *fol = ((void *)0);
    char_u *upp = ((void *)0);
    int do_rep;
    int do_repsal;
    int do_sal;
    int do_mapline;
    int found_map = 0;
    hashitem_T *hi;
    int l;
    int compminlen = 0;
    int compsylmax = 0;
    int compoptions = 0;
    int compmax = 0;
    char_u *compflags = ((void *)0);

    char_u *midword = ((void *)0);
    char_u *syllable = ((void *)0);
    char_u *sofofrom = ((void *)0);
    char_u *sofoto = ((void *)0);




    fd = fopen(((char *)fname), ("r"));
    if (fd == ((void *)0))
    {
 emsg2((char_u *)(((char *)(e_notopen))), (char_u *)(fname));
 return ((void *)0);
    }

    vim_snprintf((char *)IObuff, (1024+1), ((char *)("Reading affix file %s ...")), fname);
    spell_message(spin, IObuff);


    do_rep = spin->si_rep.ga_len == 0;


    do_repsal = spin->si_repsal.ga_len == 0;


    do_sal = spin->si_sal.ga_len == 0;


    do_mapline = spin->si_map.ga_len == 0;




    aff = (afffile_T *)getroom(spin, sizeof(afffile_T), 1);
    if (aff == ((void *)0))
    {
 fclose(fd);
 return ((void *)0);
    }
    hash_init(&aff->af_pref);
    hash_init(&aff->af_suff);
    hash_init(&aff->af_comp);




    while (!vim_fgets(rline, 500, fd) && !got_int)
    {
 line_breakcheck();
 ++lnum;


 if (*rline == '#')
     continue;


 vim_free(pc);
# 5263 "spell.c"
 {
     pc = ((void *)0);
     line = rline;
 }



 itemcnt = 0;
 for (p = line; ; )
 {
     while (*p != '\000' && *p <= ' ')
  ++p;
     if (*p == '\000')
  break;
     if (itemcnt == 30)
  break;
     items[itemcnt++] = p;

     if (itemcnt == 2 && spell_info_item(items[0]))
  while (*p >= ' ' || *p == '\011')
      ++p;
     else
  while (*p > ' ')
      ++p;
     if (*p == '\000')
  break;
     *p++ = '\000';
 }


 if (itemcnt > 0)
 {
     if (is_aff_rule(items, itemcnt, "SET", 2) && aff->af_enc == ((void *)0))
     {
# 5307 "spell.c"
      smsg((char_u *)((char *)("Conversion in %s not supported")), fname);

     }
     else if (is_aff_rule(items, itemcnt, "FLAG", 2)
           && aff->af_flagtype == 0)
     {
  if (strcmp((char *)(items[1]), (char *)("long")) == 0)
      aff->af_flagtype = 1;
  else if (strcmp((char *)(items[1]), (char *)("num")) == 0)
      aff->af_flagtype = 3;
  else if (strcmp((char *)(items[1]), (char *)("caplong")) == 0)
      aff->af_flagtype = 2;
  else
      smsg((char_u *)((char *)("Invalid value for FLAG in %s line %d: %s")),
       fname, lnum, items[1]);
  if (aff->af_rare != 0
   || aff->af_keepcase != 0
   || aff->af_bad != 0
   || aff->af_needaffix != 0
   || aff->af_circumfix != 0
   || aff->af_needcomp != 0
   || aff->af_comproot != 0
   || aff->af_nosuggest != 0
   || compflags != ((void *)0)
   || aff->af_suff.ht_used > 0
   || aff->af_pref.ht_used > 0)
      smsg((char_u *)((char *)("FLAG after using flags in %s line %d: %s")),
       fname, lnum, items[1]);
     }
     else if (spell_info_item(items[0]))
     {
      p = (char_u *)getroom(spin,
       (spin->si_info == ((void *)0) ? 0 : strlen((char *)(spin->si_info)))
       + strlen((char *)(items[0]))
       + strlen((char *)(items[1])) + 3, 0);
      if (p != ((void *)0))
      {
   if (spin->si_info != ((void *)0))
   {
       ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(p), (char *)(spin->si_info), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcpy_chk ((char *)(p), (char *)(spin->si_info)));
       ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(p), (char *)("\n"), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcat_chk ((char *)(p), (char *)("\n")));
   }
   ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(p), (char *)(items[0]), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcat_chk ((char *)(p), (char *)(items[0])));
   ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(p), (char *)(" "), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcat_chk ((char *)(p), (char *)(" ")));
   ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(p), (char *)(items[1]), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcat_chk ((char *)(p), (char *)(items[1])));
   spin->si_info = p;
      }
     }
     else if (is_aff_rule(items, itemcnt, "MIDWORD", 2)
          && midword == ((void *)0))
     {
  midword = getroom_save(spin, items[1]);
     }
     else if (is_aff_rule(items, itemcnt, "TRY", 2))
     {

     }

     else if ((is_aff_rule(items, itemcnt, "RAR", 2)
   || is_aff_rule(items, itemcnt, "RARE", 2))
        && aff->af_rare == 0)
     {
  aff->af_rare = affitem2flag(aff->af_flagtype, items[1],
         fname, lnum);
     }

     else if ((is_aff_rule(items, itemcnt, "KEP", 2)
   || is_aff_rule(items, itemcnt, "KEEPCASE", 2))
           && aff->af_keepcase == 0)
     {
  aff->af_keepcase = affitem2flag(aff->af_flagtype, items[1],
         fname, lnum);
     }
     else if ((is_aff_rule(items, itemcnt, "BAD", 2)
   || is_aff_rule(items, itemcnt, "FORBIDDENWORD", 2))
         && aff->af_bad == 0)
     {
  aff->af_bad = affitem2flag(aff->af_flagtype, items[1],
         fname, lnum);
     }
     else if (is_aff_rule(items, itemcnt, "NEEDAFFIX", 2)
          && aff->af_needaffix == 0)
     {
  aff->af_needaffix = affitem2flag(aff->af_flagtype, items[1],
         fname, lnum);
     }
     else if (is_aff_rule(items, itemcnt, "CIRCUMFIX", 2)
          && aff->af_circumfix == 0)
     {
  aff->af_circumfix = affitem2flag(aff->af_flagtype, items[1],
         fname, lnum);
     }
     else if (is_aff_rule(items, itemcnt, "NOSUGGEST", 2)
          && aff->af_nosuggest == 0)
     {
  aff->af_nosuggest = affitem2flag(aff->af_flagtype, items[1],
         fname, lnum);
     }
     else if ((is_aff_rule(items, itemcnt, "NEEDCOMPOUND", 2)
   || is_aff_rule(items, itemcnt, "ONLYINCOMPOUND", 2))
           && aff->af_needcomp == 0)
     {
  aff->af_needcomp = affitem2flag(aff->af_flagtype, items[1],
         fname, lnum);
     }
     else if (is_aff_rule(items, itemcnt, "COMPOUNDROOT", 2)
           && aff->af_comproot == 0)
     {
  aff->af_comproot = affitem2flag(aff->af_flagtype, items[1],
         fname, lnum);
     }
     else if (is_aff_rule(items, itemcnt, "COMPOUNDFORBIDFLAG", 2)
         && aff->af_compforbid == 0)
     {
  aff->af_compforbid = affitem2flag(aff->af_flagtype, items[1],
         fname, lnum);
  if (aff->af_pref.ht_used > 0)
      smsg((char_u *)((char *)("Defining COMPOUNDFORBIDFLAG after PFX item may give wrong results in %s line %d")),
       fname, lnum);
     }
     else if (is_aff_rule(items, itemcnt, "COMPOUNDPERMITFLAG", 2)
         && aff->af_comppermit == 0)
     {
  aff->af_comppermit = affitem2flag(aff->af_flagtype, items[1],
         fname, lnum);
  if (aff->af_pref.ht_used > 0)
      smsg((char_u *)((char *)("Defining COMPOUNDPERMITFLAG after PFX item may give wrong results in %s line %d")),
       fname, lnum);
     }
     else if (is_aff_rule(items, itemcnt, "COMPOUNDFLAG", 2)
        && compflags == ((void *)0))
     {


  p = getroom(spin, strlen((char *)(items[1])) + 2, 0);
  if (p != ((void *)0))
  {
      ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(p), (char *)(items[1]), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcpy_chk ((char *)(p), (char *)(items[1])));
      ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(p), (char *)("+"), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcat_chk ((char *)(p), (char *)("+")));
      compflags = p;
  }
     }
     else if (is_aff_rule(items, itemcnt, "COMPOUNDRULES", 2))
     {


  if (atoi((char *)items[1]) == 0)
      smsg((char_u *)((char *)("Wrong COMPOUNDRULES value in %s line %d: %s")),
             fname, lnum, items[1]);
     }
     else if (is_aff_rule(items, itemcnt, "COMPOUNDRULE", 2))
     {


  l = (int)strlen((char *)(items[1])) + 1;
  if (compflags != ((void *)0))
      l += (int)strlen((char *)(compflags)) + 1;
  p = getroom(spin, l, 0);
  if (p != ((void *)0))
  {
      if (compflags != ((void *)0))
      {
   ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(p), (char *)(compflags), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcpy_chk ((char *)(p), (char *)(compflags)));
   ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(p), (char *)("/"), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcat_chk ((char *)(p), (char *)("/")));
      }
      ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(p), (char *)(items[1]), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcat_chk ((char *)(p), (char *)(items[1])));
      compflags = p;
  }
     }
     else if (is_aff_rule(items, itemcnt, "COMPOUNDWORDMAX", 2)
             && compmax == 0)
     {
  compmax = atoi((char *)items[1]);
  if (compmax == 0)
      smsg((char_u *)((char *)("Wrong COMPOUNDWORDMAX value in %s line %d: %s")),
             fname, lnum, items[1]);
     }
     else if (is_aff_rule(items, itemcnt, "COMPOUNDMIN", 2)
          && compminlen == 0)
     {
  compminlen = atoi((char *)items[1]);
  if (compminlen == 0)
      smsg((char_u *)((char *)("Wrong COMPOUNDMIN value in %s line %d: %s")),
             fname, lnum, items[1]);
     }
     else if (is_aff_rule(items, itemcnt, "COMPOUNDSYLMAX", 2)
          && compsylmax == 0)
     {
  compsylmax = atoi((char *)items[1]);
  if (compsylmax == 0)
      smsg((char_u *)((char *)("Wrong COMPOUNDSYLMAX value in %s line %d: %s")),
             fname, lnum, items[1]);
     }
     else if (is_aff_rule(items, itemcnt, "CHECKCOMPOUNDDUP", 1))
     {
  compoptions |= 1;
     }
     else if (is_aff_rule(items, itemcnt, "CHECKCOMPOUNDREP", 1))
     {
  compoptions |= 2;
     }
     else if (is_aff_rule(items, itemcnt, "CHECKCOMPOUNDCASE", 1))
     {
  compoptions |= 4;
     }
     else if (is_aff_rule(items, itemcnt, "CHECKCOMPOUNDTRIPLE", 1))
     {
  compoptions |= 8;
     }
     else if (is_aff_rule(items, itemcnt, "CHECKCOMPOUNDPATTERN", 2))
     {
  if (atoi((char *)items[1]) == 0)
      smsg((char_u *)((char *)("Wrong CHECKCOMPOUNDPATTERN value in %s line %d: %s")),
             fname, lnum, items[1]);
     }
     else if (is_aff_rule(items, itemcnt, "CHECKCOMPOUNDPATTERN", 3))
     {
  garray_T *gap = &spin->si_comppat;
  int i;


  for (i = 0; i < gap->ga_len - 1; i += 2)
      if (strcmp((char *)(((char_u **)(gap->ga_data))[i]), (char *)(items[1])) == 0
       && strcmp((char *)(((char_u **)(gap->ga_data))[i + 1]), (char *)(items[2])) == 0)

   break;
  if (i >= gap->ga_len && ga_grow(gap, 2) == 1)
  {
      ((char_u **)(gap->ga_data))[gap->ga_len++]
            = getroom_save(spin, items[1]);
      ((char_u **)(gap->ga_data))[gap->ga_len++]
            = getroom_save(spin, items[2]);
  }
     }
     else if (is_aff_rule(items, itemcnt, "SYLLABLE", 2)
         && syllable == ((void *)0))
     {
  syllable = getroom_save(spin, items[1]);
     }
     else if (is_aff_rule(items, itemcnt, "NOBREAK", 1))
     {
  spin->si_nobreak = 1;
     }
     else if (is_aff_rule(items, itemcnt, "NOSPLITSUGS", 1))
     {
  spin->si_nosplitsugs = 1;
     }
     else if (is_aff_rule(items, itemcnt, "NOSUGFILE", 1))
     {
  spin->si_nosugfile = 1;
     }
     else if (is_aff_rule(items, itemcnt, "PFXPOSTPONE", 1))
     {
  aff->af_pfxpostpone = 1;
     }
     else if ((strcmp((char *)(items[0]), (char *)("PFX")) == 0
           || strcmp((char *)(items[0]), (char *)("SFX")) == 0)
      && aff_todo == 0
      && itemcnt >= 4)
     {
  int lasti = 4;
  char_u key[7];

  if (*items[0] == 'P')
      tp = &aff->af_pref;
  else
      tp = &aff->af_suff;





  vim_strncpy(key, items[1], 7 - 1);
  hi = hash_find(tp, key);
  if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
  {
      cur_aff = ((affheader_T *)(hi)->hi_key);
      if (cur_aff->ah_combine != (*items[2] == 'Y'))
   smsg((char_u *)((char *)("Different combining flag in continued affix block in %s line %d: %s")),
         fname, lnum, items[1]);
      if (!cur_aff->ah_follows)
   smsg((char_u *)((char *)("Duplicate affix in %s line %d: %s")),
             fname, lnum, items[1]);
  }
  else
  {

      cur_aff = (affheader_T *)getroom(spin,
         sizeof(affheader_T), 1);
      if (cur_aff == ((void *)0))
   break;
      cur_aff->ah_flag = affitem2flag(aff->af_flagtype, items[1],
         fname, lnum);
      if (cur_aff->ah_flag == 0 || strlen((char *)(items[1])) >= 7)
   break;
      if (cur_aff->ah_flag == aff->af_bad
       || cur_aff->ah_flag == aff->af_rare
       || cur_aff->ah_flag == aff->af_keepcase
       || cur_aff->ah_flag == aff->af_needaffix
       || cur_aff->ah_flag == aff->af_circumfix
       || cur_aff->ah_flag == aff->af_nosuggest
       || cur_aff->ah_flag == aff->af_needcomp
       || cur_aff->ah_flag == aff->af_comproot)
   smsg((char_u *)((char *)("Affix also used for BAD/RARE/KEEPCASE/NEEDAFFIX/NEEDCOMPOUND/NOSUGGEST in %s line %d: %s")),
             fname, lnum, items[1]);
      ((__builtin_object_size ((char *)(cur_aff->ah_key), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(cur_aff->ah_key), (char *)(items[1]), __builtin_object_size ((char *)(cur_aff->ah_key), 1 > 1)) : __inline_strcpy_chk ((char *)(cur_aff->ah_key), (char *)(items[1])));
      hash_add(tp, cur_aff->ah_key);

      cur_aff->ah_combine = (*items[2] == 'Y');
  }



  if (itemcnt > lasti && strcmp((char *)(items[lasti]), (char *)("S")) == 0)
  {
      ++lasti;
      cur_aff->ah_follows = 1;
  }
  else
      cur_aff->ah_follows = 0;



  if (itemcnt > lasti && *items[lasti] != '#')
      smsg((char_u *)((char *)(e_afftrailing)), fname, lnum, items[lasti]);

  if (strcmp((char *)(items[2]), (char *)("Y")) != 0 && strcmp((char *)(items[2]), (char *)("N")) != 0)
      smsg((char_u *)((char *)("Expected Y or N in %s line %d: %s")),
             fname, lnum, items[2]);

  if (*items[0] == 'P' && aff->af_pfxpostpone)
  {
      if (cur_aff->ah_newID == 0)
      {


   check_renumber(spin);
   cur_aff->ah_newID = ++spin->si_newprefID;




   did_postpone_prefix = 0;
      }
      else

   did_postpone_prefix = 1;
  }

  aff_todo = atoi((char *)items[3]);
     }
     else if ((strcmp((char *)(items[0]), (char *)("PFX")) == 0
           || strcmp((char *)(items[0]), (char *)("SFX")) == 0)
      && aff_todo > 0
      && strcmp((char *)(cur_aff->ah_key), (char *)(items[1])) == 0
      && itemcnt >= 5)
     {
  affentry_T *aff_entry;
  int upper = 0;
  int lasti = 5;




  if (itemcnt > lasti && *items[lasti] != '#'
   && (strcmp((char *)(items[lasti]), (char *)("-")) != 0
           || itemcnt != lasti + 1))
      smsg((char_u *)((char *)(e_afftrailing)), fname, lnum, items[lasti]);


  --aff_todo;
  aff_entry = (affentry_T *)getroom(spin,
          sizeof(affentry_T), 1);
  if (aff_entry == ((void *)0))
      break;

  if (strcmp((char *)(items[2]), (char *)("0")) != 0)
      aff_entry->ae_chop = getroom_save(spin, items[2]);
  if (strcmp((char *)(items[3]), (char *)("0")) != 0)
  {
      aff_entry->ae_add = getroom_save(spin, items[3]);


      aff_entry->ae_flags = vim_strchr(aff_entry->ae_add, '/');
      if (aff_entry->ae_flags != ((void *)0))
      {
   *aff_entry->ae_flags++ = '\000';
   aff_process_flags(aff, aff_entry);
      }
  }



  if (!spin->si_ascii || !(has_non_ascii(aff_entry->ae_chop)
       || has_non_ascii(aff_entry->ae_add)))
  {
      aff_entry->ae_next = cur_aff->ah_first;
      cur_aff->ah_first = aff_entry;

      if (strcmp((char *)(items[4]), (char *)(".")) != 0)
      {
   char_u buf[500];

   aff_entry->ae_cond = getroom_save(spin, items[4]);
   if (*items[0] == 'P')
       __builtin___sprintf_chk ((char *)buf, 0, __builtin_object_size ((char *)buf, 1 > 1), "^%s", items[4]);
   else
       __builtin___sprintf_chk ((char *)buf, 0, __builtin_object_size ((char *)buf, 1 > 1), "%s$", items[4]);
   aff_entry->ae_prog = vim_regcomp(buf,
         1 + 2 + 4);
   if (aff_entry->ae_prog == ((void *)0))
       smsg((char_u *)((char *)("Broken condition in %s line %d: %s")),
             fname, lnum, items[4]);
      }





      if (*items[0] == 'P' && aff->af_pfxpostpone
            && aff_entry->ae_flags == ((void *)0))
      {





   if (aff_entry->ae_chop != ((void *)0)
    && aff_entry->ae_add != ((void *)0)




    && aff_entry->ae_chop[1] == '\000'

    )
   {
       int c, c_up;

       c = ((int)*(aff_entry->ae_chop));
       c_up = ((c) < 256 ? (int)spelltab.st_upper[c] : (c));
       if (c_up != c
        && (aff_entry->ae_cond == ((void *)0)
     || ((int)*(aff_entry->ae_cond)) == c))
       {
    p = aff_entry->ae_add
        + strlen((char *)(aff_entry->ae_add));
    --p;
    if (((int)*(p)) == c_up)
    {
        upper = 1;
        aff_entry->ae_chop = ((void *)0);
        *p = '\000';




        if (aff_entry->ae_cond != ((void *)0))
        {
     char_u buf[500];
# 5776 "spell.c"
         *aff_entry->ae_cond = c_up;
     if (aff_entry->ae_cond != ((void *)0))
     {
         __builtin___sprintf_chk ((char *)buf, 0, __builtin_object_size ((char *)buf, 1 > 1), "^%s", aff_entry->ae_cond);

         vim_free(aff_entry->ae_prog);
         aff_entry->ae_prog = vim_regcomp(
          buf, 1 + 2);
     }
        }
    }
       }
   }

   if (aff_entry->ae_chop == ((void *)0)
            && aff_entry->ae_flags == ((void *)0))
   {
       int idx;
       char_u **pp;
       int n;


       for (idx = spin->si_prefcond.ga_len - 1; idx >= 0;
         --idx)
       {
    p = ((char_u **)spin->si_prefcond.ga_data)[idx];
    if (str_equal(p, aff_entry->ae_cond))
        break;
       }
       if (idx < 0 && ga_grow(&spin->si_prefcond, 1) == 1)
       {

    idx = spin->si_prefcond.ga_len++;
    pp = ((char_u **)spin->si_prefcond.ga_data)
         + idx;
    if (aff_entry->ae_cond == ((void *)0))
        *pp = ((void *)0);
    else
        *pp = getroom_save(spin,
         aff_entry->ae_cond);
       }


       if (aff_entry->ae_add == ((void *)0))
    p = (char_u *)"";
       else
    p = aff_entry->ae_add;



       n = -256;
       if (!cur_aff->ah_combine)
    n |= 0x02;
       if (upper)
    n |= 0x04;
       if (aff_entry->ae_comppermit)
    n |= 0x08;
       if (aff_entry->ae_compforbid)
    n |= 0x10;
       tree_add_word(spin, p, spin->si_prefroot, n,
            idx, cur_aff->ah_newID);
       did_postpone_prefix = 1;
   }


   if (aff_todo == 0 && !did_postpone_prefix)
   {
       --spin->si_newprefID;
       cur_aff->ah_newID = 0;
   }
      }
  }
     }
     else if (is_aff_rule(items, itemcnt, "FOL", 2) && fol == ((void *)0))
     {
  fol = vim_strsave(items[1]);
     }
     else if (is_aff_rule(items, itemcnt, "LOW", 2) && low == ((void *)0))
     {
  low = vim_strsave(items[1]);
     }
     else if (is_aff_rule(items, itemcnt, "UPP", 2) && upp == ((void *)0))
     {
  upp = vim_strsave(items[1]);
     }
     else if (is_aff_rule(items, itemcnt, "REP", 2)
       || is_aff_rule(items, itemcnt, "REPSAL", 2))
     {
                               ;
  if (!isdigit(*items[1]))
      smsg((char_u *)((char *)("Expected REP(SAL) count in %s line %d")),
         fname, lnum);
     }
     else if ((strcmp((char *)(items[0]), (char *)("REP")) == 0
   || strcmp((char *)(items[0]), (char *)("REPSAL")) == 0)
      && itemcnt >= 3)
     {



  if (itemcnt > 3 && items[3][0] != '#')
      smsg((char_u *)((char *)(e_afftrailing)), fname, lnum, items[3]);
  if (items[0][3] == 'S' ? do_repsal : do_rep)
  {


      for (p = items[1]; *p != '\000'; ++p)
   if (*p == '_')
       *p = ' ';
      for (p = items[2]; *p != '\000'; ++p)
   if (*p == '_')
       *p = ' ';
      add_fromto(spin, items[0][3] == 'S'
      ? &spin->si_repsal
      : &spin->si_rep, items[1], items[2]);
  }
     }
     else if (is_aff_rule(items, itemcnt, "MAP", 2))
     {

  if (!found_map)
  {

      found_map = 1;
      if (!isdigit(*items[1]))
   smsg((char_u *)((char *)("Expected MAP count in %s line %d")),
         fname, lnum);
  }
  else if (do_mapline)
  {
      int c;


      for (p = items[1]; *p != '\000'; )
      {



   c = *p++;

   if ((spin->si_map.ga_len > 0
        && vim_strchr(spin->si_map.ga_data, c)
              != ((void *)0))
    || vim_strchr(p, c) != ((void *)0))
       smsg((char_u *)((char *)("Duplicate character in MAP in %s line %d")),
         fname, lnum);
      }



      ga_concat(&spin->si_map, items[1]);
      ga_append(&spin->si_map, '/');
  }
     }

     else if (is_aff_rule(items, itemcnt, "SAL", 3))
     {
  if (do_sal)
  {


      if (strcmp((char *)(items[1]), (char *)("followup")) == 0)
   spin->si_followup = sal_to_bool(items[2]);
      else if (strcmp((char *)(items[1]), (char *)("collapse_result")) == 0)
   spin->si_collapse = sal_to_bool(items[2]);
      else if (strcmp((char *)(items[1]), (char *)("remove_accents")) == 0)
   spin->si_rem_accents = sal_to_bool(items[2]);
      else

   add_fromto(spin, &spin->si_sal, items[1],
         strcmp((char *)(items[2]), (char *)("_")) == 0 ? (char_u *)""
        : items[2]);
  }
     }
     else if (is_aff_rule(items, itemcnt, "SOFOFROM", 2)
         && sofofrom == ((void *)0))
     {
  sofofrom = getroom_save(spin, items[1]);
     }
     else if (is_aff_rule(items, itemcnt, "SOFOTO", 2)
           && sofoto == ((void *)0))
     {
  sofoto = getroom_save(spin, items[1]);
     }
     else if (strcmp((char *)(items[0]), (char *)("COMMON")) == 0)
     {
  int i;

  for (i = 1; i < itemcnt; ++i)
  {
      if (((hash_find(&spin->si_commonwords, items[i]))->hi_key == ((void *)0) || (hash_find(&spin->si_commonwords, items[i]))->hi_key == &hash_removed))

      {
   p = vim_strsave(items[i]);
   if (p == ((void *)0))
       break;
   hash_add(&spin->si_commonwords, p);
      }
  }
     }
     else
  smsg((char_u *)((char *)("Unrecognized or duplicate item in %s line %d: %s")),
             fname, lnum, items[0]);
 }
    }

    if (fol != ((void *)0) || low != ((void *)0) || upp != ((void *)0))
    {
 if (spin->si_clear_chartab)
 {


     init_spell_chartab();
     spin->si_clear_chartab = 0;
 }







 if (!spin->si_ascii



  )
 {
     if (fol == ((void *)0) || low == ((void *)0) || upp == ((void *)0))
  smsg((char_u *)((char *)("Missing FOL/LOW/UPP line in %s")), fname);
     else
  (void)set_spell_chartab(fol, low, upp);
 }

 vim_free(fol);
 vim_free(low);
 vim_free(upp);
    }


    if (compmax != 0)
    {
 aff_check_number(spin->si_compmax, compmax, "COMPOUNDWORDMAX");
 spin->si_compmax = compmax;
    }

    if (compminlen != 0)
    {
 aff_check_number(spin->si_compminlen, compminlen, "COMPOUNDMIN");
 spin->si_compminlen = compminlen;
    }

    if (compsylmax != 0)
    {
 if (syllable == ((void *)0))
     smsg((char_u *)((char *)("COMPOUNDSYLMAX used without SYLLABLE")));
 aff_check_number(spin->si_compsylmax, compsylmax, "COMPOUNDSYLMAX");
 spin->si_compsylmax = compsylmax;
    }

    if (compoptions != 0)
    {
 aff_check_number(spin->si_compoptions, compoptions, "COMPOUND options");
 spin->si_compoptions |= compoptions;
    }

    if (compflags != ((void *)0))
 process_compflags(spin, aff, compflags);


    if (spin->si_newcompID < spin->si_newprefID)
    {
 if (spin->si_newcompID == 127 || spin->si_newcompID == 255)
     msg((char_u *)(((char *)("Too many postponed prefixes"))));
 else if (spin->si_newprefID == 0 || spin->si_newprefID == 127)
     msg((char_u *)(((char *)("Too many compound flags"))));
 else
     msg((char_u *)(((char *)("Too many postponed prefixes and/or compound flags"))));
    }

    if (syllable != ((void *)0))
    {
 aff_check_string(spin->si_syllable, syllable, "SYLLABLE");
 spin->si_syllable = syllable;
    }

    if (sofofrom != ((void *)0) || sofoto != ((void *)0))
    {
 if (sofofrom == ((void *)0) || sofoto == ((void *)0))
     smsg((char_u *)((char *)("Missing SOFO%s line in %s")),
         sofofrom == ((void *)0) ? "FROM" : "TO", fname);
 else if (spin->si_sal.ga_len > 0)
     smsg((char_u *)((char *)("Both SAL and SOFO lines in %s")), fname);
 else
 {
     aff_check_string(spin->si_sofofr, sofofrom, "SOFOFROM");
     aff_check_string(spin->si_sofoto, sofoto, "SOFOTO");
     spin->si_sofofr = sofofrom;
     spin->si_sofoto = sofoto;
 }
    }

    if (midword != ((void *)0))
    {
 aff_check_string(spin->si_midword, midword, "MIDWORD");
 spin->si_midword = midword;
    }

    vim_free(pc);
    fclose(fd);
    return aff;
}





    static int
is_aff_rule(items, itemcnt, rulename, mincount)
    char_u **items;
    int itemcnt;
    char *rulename;
    int mincount;
{
    return (strcmp((char *)(items[0]), (char *)(rulename)) == 0
     && (itemcnt == mincount
  || (itemcnt > mincount && items[mincount][0] == '#')));
}





    static void
aff_process_flags(affile, entry)
    afffile_T *affile;
    affentry_T *entry;
{
    char_u *p;
    char_u *prevp;
    unsigned flag;

    if (entry->ae_flags != ((void *)0)
  && (affile->af_compforbid != 0 || affile->af_comppermit != 0))
    {
 for (p = entry->ae_flags; *p != '\000'; )
 {
     prevp = p;
     flag = get_affitem(affile->af_flagtype, &p);
     if (flag == affile->af_comppermit || flag == affile->af_compforbid)
     {
  ((__builtin_object_size ((char *)((prevp)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((prevp)), (char *)((p)), strlen((char *)(p)) + 1, __builtin_object_size ((char *)((prevp)), 0)) : __inline_memmove_chk ((char *)((prevp)), (char *)((p)), strlen((char *)(p)) + 1));
  p = prevp;
  if (flag == affile->af_comppermit)
      entry->ae_comppermit = 1;
  else
      entry->ae_compforbid = 1;
     }
     if (affile->af_flagtype == 3 && *p == ',')
  ++p;
 }
 if (*entry->ae_flags == '\000')
     entry->ae_flags = ((void *)0);
    }
}




    static int
spell_info_item(s)
    char_u *s;
{
    return strcmp((char *)(s), (char *)("NAME")) == 0
 || strcmp((char *)(s), (char *)("HOME")) == 0
 || strcmp((char *)(s), (char *)("VERSION")) == 0
 || strcmp((char *)(s), (char *)("AUTHOR")) == 0
 || strcmp((char *)(s), (char *)("EMAIL")) == 0
 || strcmp((char *)(s), (char *)("COPYRIGHT")) == 0;
}





    static unsigned
affitem2flag(flagtype, item, fname, lnum)
    int flagtype;
    char_u *item;
    char_u *fname;
    int lnum;
{
    unsigned res;
    char_u *p = item;

    res = get_affitem(flagtype, &p);
    if (res == 0)
    {
 if (flagtype == 3)
     smsg((char_u *)((char *)("Flag is not a number in %s line %d: %s")),
          fname, lnum, item);
 else
     smsg((char_u *)((char *)("Illegal flag in %s line %d: %s")),
          fname, lnum, item);
    }
    if (*p != '\000')
    {
 smsg((char_u *)((char *)(e_affname)), fname, lnum, item);
 return 0;
    }

    return res;
}





    static unsigned
get_affitem(flagtype, pp)
    int flagtype;
    char_u **pp;
{
    int res;

    if (flagtype == 3)
    {
 if (!((**pp) >= '0' && (**pp) <= '9'))
 {
     ++*pp;
     return 0;
 }
 res = getdigits(pp);
    }
    else
    {



 res = *(*pp)++;

 if (flagtype == 1 || (flagtype == 2
       && res >= 'A' && res <= 'Z'))
 {
     if (**pp == '\000')
  return 0;



     res = *(*pp)++ + (res << 16);

 }
    }
    return res;
}







    static void
process_compflags(spin, aff, compflags)
    spellinfo_T *spin;
    afffile_T *aff;
    char_u *compflags;
{
    char_u *p;
    char_u *prevp;
    unsigned flag;
    compitem_T *ci;
    int id;
    int len;
    char_u *tp;
    char_u key[7];
    hashitem_T *hi;




    len = (int)strlen((char *)(compflags)) + 1;
    if (spin->si_compflags != ((void *)0))
 len += (int)strlen((char *)(spin->si_compflags)) + 1;
    p = getroom(spin, len, 0);
    if (p == ((void *)0))
 return;
    if (spin->si_compflags != ((void *)0))
    {
 ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(p), (char *)(spin->si_compflags), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcpy_chk ((char *)(p), (char *)(spin->si_compflags)));
 ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(p), (char *)("/"), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcat_chk ((char *)(p), (char *)("/")));
    }
    spin->si_compflags = p;
    tp = p + strlen((char *)(p));

    for (p = compflags; *p != '\000'; )
    {
 if (vim_strchr((char_u *)"/*+[]", *p) != ((void *)0))

     *tp++ = *p++;
 else
 {

     prevp = p;
     flag = get_affitem(aff->af_flagtype, &p);
     if (flag != 0)
     {


  vim_strncpy(key, prevp, p - prevp);
  hi = hash_find(&aff->af_comp, key);
  if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
      id = ((compitem_T *)(hi)->hi_key)->ci_newID;
  else
  {
      ci = (compitem_T *)getroom(spin, sizeof(compitem_T), 1);
      if (ci == ((void *)0))
   break;
      ((__builtin_object_size ((char *)(ci->ci_key), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(ci->ci_key), (char *)(key), __builtin_object_size ((char *)(ci->ci_key), 1 > 1)) : __inline_strcpy_chk ((char *)(ci->ci_key), (char *)(key)));
      ci->ci_flag = flag;


      do
      {
   check_renumber(spin);
   id = spin->si_newcompID--;
      } while (vim_strchr((char_u *)"/+*[]\\-^", id) != ((void *)0));
      ci->ci_newID = id;
      hash_add(&aff->af_comp, ci->ci_key);
  }
  *tp++ = id;
     }
     if (aff->af_flagtype == 3 && *p == ',')
  ++p;
 }
    }

    *tp = '\000';
}







    static void
check_renumber(spin)
    spellinfo_T *spin;
{
    if (spin->si_newprefID == spin->si_newcompID && spin->si_newcompID < 128)
    {
 spin->si_newprefID = 127;
 spin->si_newcompID = 255;
    }
}




    static int
flag_in_afflist(flagtype, afflist, flag)
    int flagtype;
    char_u *afflist;
    unsigned flag;
{
    char_u *p;
    unsigned n;

    switch (flagtype)
    {
 case 0:
     return vim_strchr(afflist, flag) != ((void *)0);

 case 2:
 case 1:
     for (p = afflist; *p != '\000'; )
     {



  n = *p++;

  if ((flagtype == 1 || (n >= 'A' && n <= 'Z'))
         && *p != '\000')



      n = *p++ + (n << 16);

  if (n == flag)
      return 1;
     }
     break;

 case 3:
     for (p = afflist; *p != '\000'; )
     {
  n = getdigits(&p);
  if (n == flag)
      return 1;
  if (*p != '\000')
      ++p;
     }
     break;
    }
    return 0;
}




    static void
aff_check_number(spinval, affval, name)
    int spinval;
    int affval;
    char *name;
{
    if (spinval != 0 && spinval != affval)
 smsg((char_u *)((char *)("%s value differs from what is used in another .aff file")), name);
}




    static void
aff_check_string(spinval, affval, name)
    char_u *spinval;
    char_u *affval;
    char *name;
{
    if (spinval != ((void *)0) && strcmp((char *)(spinval), (char *)(affval)) != 0)
 smsg((char_u *)((char *)("%s value differs from what is used in another .aff file")), name);
}





    static int
str_equal(s1, s2)
    char_u *s1;
    char_u *s2;
{
    if (s1 == ((void *)0) || s2 == ((void *)0))
 return s1 == s2;
    return strcmp((char *)(s1), (char *)(s2)) == 0;
}





    static void
add_fromto(spin, gap, from, to)
    spellinfo_T *spin;
    garray_T *gap;
    char_u *from;
    char_u *to;
{
    fromto_T *ftp;
    char_u word[250];

    if (ga_grow(gap, 1) == 1)
    {
 ftp = ((fromto_T *)gap->ga_data) + gap->ga_len;
 (void)spell_casefold(from, (int)strlen((char *)(from)), word, 250);
 ftp->ft_from = getroom_save(spin, word);
 (void)spell_casefold(to, (int)strlen((char *)(to)), word, 250);
 ftp->ft_to = getroom_save(spin, word);
 ++gap->ga_len;
    }
}




    static int
sal_to_bool(s)
    char_u *s;
{
    return strcmp((char *)(s), (char *)("1")) == 0 || strcmp((char *)(s), (char *)("true")) == 0;
}





    static int
has_non_ascii(s)
    char_u *s;
{
    char_u *p;

    if (s != ((void *)0))
 for (p = s; *p != '\000'; ++p)
     if (*p >= 128)
  return 1;
    return 0;
}




    static void
spell_free_aff(aff)
    afffile_T *aff;
{
    hashtab_T *ht;
    hashitem_T *hi;
    int todo;
    affheader_T *ah;
    affentry_T *ae;

    vim_free(aff->af_enc);


    for (ht = &aff->af_pref; ; ht = &aff->af_suff)
    {
 todo = (int)ht->ht_used;
 for (hi = ht->ht_array; todo > 0; ++hi)
 {
     if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
     {
  --todo;
  ah = ((affheader_T *)(hi)->hi_key);
  for (ae = ah->ah_first; ae != ((void *)0); ae = ae->ae_next)
      vim_free(ae->ae_prog);
     }
 }
 if (ht == &aff->af_suff)
     break;
    }

    hash_clear(&aff->af_pref);
    hash_clear(&aff->af_suff);
    hash_clear(&aff->af_comp);
}





    static int
spell_read_dic(spin, fname, affile)
    spellinfo_T *spin;
    char_u *fname;
    afffile_T *affile;
{
    hashtab_T ht;
    char_u line[500];
    char_u *p;
    char_u *afflist;
    char_u store_afflist[250];
    int pfxlen;
    int need_affix;
    char_u *dw;
    char_u *pc;
    char_u *w;
    int l;
    hash_T hash;
    hashitem_T *hi;
    FILE *fd;
    int lnum = 1;
    int non_ascii = 0;
    int retval = 1;
    char_u message[500 + 250];
    int flags;
    int duplicate = 0;




    fd = fopen(((char *)fname), ("r"));
    if (fd == ((void *)0))
    {
 emsg2((char_u *)(((char *)(e_notopen))), (char_u *)(fname));
 return 0;
    }


    hash_init(&ht);

    vim_snprintf((char *)IObuff, (1024+1),
      ((char *)("Reading dictionary file %s ...")), fname);
    spell_message(spin, IObuff);


    spin->si_msg_count = 999999;


    (void)vim_fgets(line, 500, fd);
    if (!vim_isdigit(*skipwhite(line)))
 emsg2((char_u *)(((char *)("E760: No word count in %s"))), (char_u *)(fname));






    while (!vim_fgets(line, 500, fd) && !got_int)
    {
 line_breakcheck();
 ++lnum;
 if (line[0] == '#' || line[0] == '/')
     continue;



 l = (int)strlen((char *)(line));
 while (l > 0 && line[l - 1] <= ' ')
     --l;
 if (l == 0)
     continue;
 line[l] = '\000';
# 6607 "spell.c"
 {
     pc = ((void *)0);
     w = line;
 }



 afflist = ((void *)0);
 for (p = w; *p != '\000'; ++p)
 {
     if (*p == '\\' && (p[1] == '\\' || p[1] == '/'))
  ((__builtin_object_size ((char *)((p)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((p)), (char *)((p + 1)), strlen((char *)(p + 1)) + 1, __builtin_object_size ((char *)((p)), 0)) : __inline_memmove_chk ((char *)((p)), (char *)((p + 1)), strlen((char *)(p + 1)) + 1));
     else if (*p == '/')
     {
  *p = '\000';
  afflist = p + 1;
  break;
     }
 }


 if (spin->si_ascii && has_non_ascii(w))
 {
     ++non_ascii;
     vim_free(pc);
     continue;
 }


 if (spin->si_verbose && spin->si_msg_count > 10000)
 {
     spin->si_msg_count = 0;
     vim_snprintf((char *)message, sizeof(message),
      ((char *)("line %6d, word %6d - %s")),
         lnum, spin->si_foldwcount + spin->si_keepwcount, w);
     msg_start();
     msg_puts_long_attr(message, 0);
     msg_clr_eos();
     msg_didout = 0;
     msg_col = 0;
     out_flush();
 }


 dw = (char_u *)getroom_save(spin, w);
 if (dw == ((void *)0))
 {
     retval = 0;
     vim_free(pc);
     break;
 }

 hash = hash_hash(dw);
 hi = hash_lookup(&ht, dw, hash);
 if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
 {
     if (p_verbose > 0)
  smsg((char_u *)((char *)("Duplicate word in %s line %d: %s")),
            fname, lnum, dw);
     else if (duplicate == 0)
  smsg((char_u *)((char *)("First duplicate word in %s line %d: %s")),
            fname, lnum, dw);
     ++duplicate;
 }
 else
     hash_add_item(&ht, hi, dw, hash);

 flags = 0;
 store_afflist[0] = '\000';
 pfxlen = 0;
 need_affix = 0;
 if (afflist != ((void *)0))
 {

     flags |= get_affix_flags(affile, afflist);

     if (affile->af_needaffix != 0 && flag_in_afflist(
     affile->af_flagtype, afflist, affile->af_needaffix))
  need_affix = 1;

     if (affile->af_pfxpostpone)

  pfxlen = get_pfxlist(affile, afflist, store_afflist);

     if (spin->si_compflags != ((void *)0))


  get_compflags(affile, afflist, store_afflist + pfxlen);
 }


 if (store_word(spin, dw, flags, spin->si_region,
        store_afflist, need_affix) == 0)
     retval = 0;

 if (afflist != ((void *)0))
 {


     if (store_aff_word(spin, dw, afflist, affile,
      &affile->af_suff, &affile->af_pref,
       4, flags, store_afflist, pfxlen) == 0)
  retval = 0;


     if (store_aff_word(spin, dw, afflist, affile,
     &affile->af_pref, ((void *)0),
       4, flags, store_afflist, pfxlen) == 0)
  retval = 0;
 }

 vim_free(pc);
    }

    if (duplicate > 0)
 smsg((char_u *)((char *)("%d duplicate word(s) in %s")), duplicate, fname);
    if (spin->si_ascii && non_ascii > 0)
 smsg((char_u *)((char *)("Ignored %d word(s) with non-ASCII characters in %s")),
           non_ascii, fname);
    hash_clear(&ht);

    fclose(fd);
    return retval;
}





    static int
get_affix_flags(affile, afflist)
    afffile_T *affile;
    char_u *afflist;
{
    int flags = 0;

    if (affile->af_keepcase != 0 && flag_in_afflist(
      affile->af_flagtype, afflist, affile->af_keepcase))
 flags |= 0x80 | 0x40;
    if (affile->af_rare != 0 && flag_in_afflist(
          affile->af_flagtype, afflist, affile->af_rare))
 flags |= 0x08;
    if (affile->af_bad != 0 && flag_in_afflist(
    affile->af_flagtype, afflist, affile->af_bad))
 flags |= 0x10;
    if (affile->af_needcomp != 0 && flag_in_afflist(
      affile->af_flagtype, afflist, affile->af_needcomp))
 flags |= 0x0200;
    if (affile->af_comproot != 0 && flag_in_afflist(
      affile->af_flagtype, afflist, affile->af_comproot))
 flags |= 0x0800;
    if (affile->af_nosuggest != 0 && flag_in_afflist(
     affile->af_flagtype, afflist, affile->af_nosuggest))
 flags |= 0x0400;
    return flags;
}







    static int
get_pfxlist(affile, afflist, store_afflist)
    afffile_T *affile;
    char_u *afflist;
    char_u *store_afflist;
{
    char_u *p;
    char_u *prevp;
    int cnt = 0;
    int id;
    char_u key[7];
    hashitem_T *hi;

    for (p = afflist; *p != '\000'; )
    {
 prevp = p;
 if (get_affitem(affile->af_flagtype, &p) != 0)
 {


     vim_strncpy(key, prevp, p - prevp);
     hi = hash_find(&affile->af_pref, key);
     if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
     {
  id = ((affheader_T *)(hi)->hi_key)->ah_newID;
  if (id != 0)
      store_afflist[cnt++] = id;
     }
 }
 if (affile->af_flagtype == 3 && *p == ',')
     ++p;
    }

    store_afflist[cnt] = '\000';
    return cnt;
}






    static void
get_compflags(affile, afflist, store_afflist)
    afffile_T *affile;
    char_u *afflist;
    char_u *store_afflist;
{
    char_u *p;
    char_u *prevp;
    int cnt = 0;
    char_u key[7];
    hashitem_T *hi;

    for (p = afflist; *p != '\000'; )
    {
 prevp = p;
 if (get_affitem(affile->af_flagtype, &p) != 0)
 {

     vim_strncpy(key, prevp, p - prevp);
     hi = hash_find(&affile->af_comp, key);
     if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
  store_afflist[cnt++] = ((compitem_T *)(hi)->hi_key)->ci_newID;
 }
 if (affile->af_flagtype == 3 && *p == ',')
     ++p;
    }

    store_afflist[cnt] = '\000';
}
# 6851 "spell.c"
    static int
store_aff_word(spin, word, afflist, affile, ht, xht, condit, flags,
             pfxlist, pfxlen)
    spellinfo_T *spin;
    char_u *word;
    char_u *afflist;
    afffile_T *affile;
    hashtab_T *ht;
    hashtab_T *xht;
    int condit;
    int flags;
    char_u *pfxlist;
    int pfxlen;

{
    int todo;
    hashitem_T *hi;
    affheader_T *ah;
    affentry_T *ae;
    regmatch_T regmatch;
    char_u newword[250];
    int retval = 1;
    int i, j;
    char_u *p;
    int use_flags;
    char_u *use_pfxlist;
    int use_pfxlen;
    int need_affix;
    char_u store_afflist[250];
    char_u pfx_pfxlist[250];
    size_t wordlen = strlen((char *)(word));
    int use_condit;

    todo = (int)ht->ht_used;
    for (hi = ht->ht_array; todo > 0 && retval == 1; ++hi)
    {
 if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
 {
     --todo;
     ah = ((affheader_T *)(hi)->hi_key);



     if (((condit & 1) == 0 || ah->ah_combine)
      && flag_in_afflist(affile->af_flagtype, afflist,
         ah->ah_flag))
     {

  for (ae = ah->ah_first; ae != ((void *)0); ae = ae->ae_next)
  {
# 6911 "spell.c"
      regmatch.regprog = ae->ae_prog;
      regmatch.rm_ic = 0;
      if ((xht != ((void *)0) || !affile->af_pfxpostpone
    || ae->ae_chop != ((void *)0)
    || ae->ae_flags != ((void *)0))
       && (ae->ae_chop == ((void *)0)
    || strlen((char *)(ae->ae_chop)) < wordlen)
       && (ae->ae_prog == ((void *)0)
    || vim_regexec(&regmatch, word, (colnr_T)0))
       && (((condit & 2) == 0)
    == ((condit & 8) == 0
        || ae->ae_flags == ((void *)0)
        || !flag_in_afflist(affile->af_flagtype,
     ae->ae_flags, affile->af_circumfix))))
      {

   if (xht == ((void *)0))
   {

       if (ae->ae_add == ((void *)0))
    *newword = '\000';
       else
    ((__builtin_object_size ((char *)(newword), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(newword), (char *)(ae->ae_add), __builtin_object_size ((char *)(newword), 1 > 1)) : __inline_strcpy_chk ((char *)(newword), (char *)(ae->ae_add)));
       p = word;
       if (ae->ae_chop != ((void *)0))
       {
# 6947 "spell.c"
        p += strlen((char *)(ae->ae_chop));
       }
       ((__builtin_object_size ((char *)(newword), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(newword), (char *)(p), __builtin_object_size ((char *)(newword), 1 > 1)) : __inline_strcat_chk ((char *)(newword), (char *)(p)));
   }
   else
   {

       ((__builtin_object_size ((char *)(newword), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(newword), (char *)(word), __builtin_object_size ((char *)(newword), 1 > 1)) : __inline_strcpy_chk ((char *)(newword), (char *)(word)));
       if (ae->ae_chop != ((void *)0))
       {

    p = newword + strlen((char *)(newword));
    i = (int)strlen((char *)(ae->ae_chop));
    for ( ; i > 0; --i)
        --p;
    *p = '\000';
       }
       if (ae->ae_add != ((void *)0))
    ((__builtin_object_size ((char *)(newword), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(newword), (char *)(ae->ae_add), __builtin_object_size ((char *)(newword), 1 > 1)) : __inline_strcat_chk ((char *)(newword), (char *)(ae->ae_add)));
   }

   use_flags = flags;
   use_pfxlist = pfxlist;
   use_pfxlen = pfxlen;
   need_affix = 0;
   use_condit = condit | 1 | 8;
   if (ae->ae_flags != ((void *)0))
   {

       use_flags |= get_affix_flags(affile, ae->ae_flags);

       if (affile->af_needaffix != 0 && flag_in_afflist(
     affile->af_flagtype, ae->ae_flags,
       affile->af_needaffix))
    need_affix = 1;




       if (affile->af_circumfix != 0 && flag_in_afflist(
     affile->af_flagtype, ae->ae_flags,
       affile->af_circumfix))
       {
    use_condit |= 2;
    if ((condit & 2) == 0)
        need_affix = 1;
       }

       if (affile->af_pfxpostpone
      || spin->si_compflags != ((void *)0))
       {
    if (affile->af_pfxpostpone)

        use_pfxlen = get_pfxlist(affile,
       ae->ae_flags, store_afflist);
    else
        use_pfxlen = 0;
    use_pfxlist = store_afflist;



    for (i = 0; i < pfxlen; ++i)
    {
        for (j = 0; j < use_pfxlen; ++j)
     if (pfxlist[i] == use_pfxlist[j])
         break;
        if (j == use_pfxlen)
     use_pfxlist[use_pfxlen++] = pfxlist[i];
    }

    if (spin->si_compflags != ((void *)0))

        get_compflags(affile, ae->ae_flags,
        use_pfxlist + use_pfxlen);




    for (i = pfxlen; pfxlist[i] != '\000'; ++i)
    {
        for (j = use_pfxlen;
         use_pfxlist[j] != '\000'; ++j)
     if (pfxlist[i] == use_pfxlist[j])
         break;
        if (use_pfxlist[j] == '\000')
        {
     use_pfxlist[j++] = pfxlist[i];
     use_pfxlist[j] = '\000';
        }
    }
       }
   }



   if (use_pfxlist != ((void *)0) && ae->ae_compforbid)
   {
       vim_strncpy(pfx_pfxlist, use_pfxlist, use_pfxlen);
       use_pfxlist = pfx_pfxlist;
   }


   if (spin->si_prefroot != ((void *)0)
    && spin->si_prefroot->wn_sibling != ((void *)0))
   {

       use_flags |= 0x0100;




       if (!ah->ah_combine && use_pfxlist != ((void *)0))
    use_pfxlist += use_pfxlen;
   }




   if (spin->si_compflags != ((void *)0) && !ae->ae_comppermit)
   {
       if (xht != ((void *)0))
    use_flags |= 0x2000;
       else
    use_flags |= 0x1000;
   }


   if (store_word(spin, newword, use_flags,
       spin->si_region, use_pfxlist,
         need_affix) == 0)
       retval = 0;



   if ((condit & 4) && ae->ae_flags != ((void *)0))
       if (store_aff_word(spin, newword, ae->ae_flags,
     affile, &affile->af_suff, xht,
        use_condit & (xht == ((void *)0)
       ? ~0 : ~4),
          use_flags, use_pfxlist, pfxlen) == 0)
    retval = 0;




   if (xht != ((void *)0) && ah->ah_combine)
   {
       if (store_aff_word(spin, newword,
     afflist, affile,
     xht, ((void *)0), use_condit,
     use_flags, use_pfxlist,
     pfxlen) == 0
        || (ae->ae_flags != ((void *)0)
     && store_aff_word(spin, newword,
         ae->ae_flags, affile,
         xht, ((void *)0), use_condit,
         use_flags, use_pfxlist,
         pfxlen) == 0))
    retval = 0;
   }
      }
  }
     }
 }
    }

    return retval;
}




    static int
spell_read_wordfile(spin, fname)
    spellinfo_T *spin;
    char_u *fname;
{
    FILE *fd;
    long lnum = 0;
    char_u rline[500];
    char_u *line;
    char_u *pc = ((void *)0);
    char_u *p;
    int l;
    int retval = 1;
    int did_word = 0;
    int non_ascii = 0;
    int flags;
    int regionmask;




    fd = fopen(((char *)fname), ("r"));
    if (fd == ((void *)0))
    {
 emsg2((char_u *)(((char *)(e_notopen))), (char_u *)(fname));
 return 0;
    }

    vim_snprintf((char *)IObuff, (1024+1), ((char *)("Reading word file %s ...")), fname);
    spell_message(spin, IObuff);




    while (!vim_fgets(rline, 500, fd) && !got_int)
    {
 line_breakcheck();
 ++lnum;


 if (*rline == '#')
     continue;


 l = (int)strlen((char *)(rline));
 while (l > 0 && rline[l - 1] <= ' ')
     --l;
 if (l == 0)
     continue;
 rline[l] = '\000';


 vim_free(pc);
# 7186 "spell.c"
 {
     pc = ((void *)0);
     line = rline;
 }

 if (*line == '/')
 {
     ++line;
     if (strncmp((char *)(line), (char *)("encoding="), (size_t)(9)) == 0)
     {
  if (spin->si_conv.vc_type != 0)
      smsg((char_u *)((char *)("Duplicate /encoding= line ignored in %s line %d: %s")),
             fname, lnum, line - 1);
  else if (did_word)
      smsg((char_u *)((char *)("/encoding= line after word ignored in %s line %d: %s")),
             fname, lnum, line - 1);
  else
  {
# 7218 "spell.c"
      smsg((char_u *)((char *)("Conversion in %s not supported")), fname);

  }
  continue;
     }

     if (strncmp((char *)(line), (char *)("regions="), (size_t)(8)) == 0)
     {
  if (spin->si_region_count > 1)
      smsg((char_u *)((char *)("Duplicate /regions= line ignored in %s line %d: %s")),
             fname, lnum, line);
  else
  {
      line += 8;
      if (strlen((char *)(line)) > 16)
   smsg((char_u *)((char *)("Too many regions in %s line %d: %s")),
             fname, lnum, line);
      else
      {
   spin->si_region_count = (int)strlen((char *)(line)) / 2;
   ((__builtin_object_size ((char *)(spin->si_region_name), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(spin->si_region_name), (char *)(line), __builtin_object_size ((char *)(spin->si_region_name), 1 > 1)) : __inline_strcpy_chk ((char *)(spin->si_region_name), (char *)(line)));


   spin->si_region = (1 << spin->si_region_count) - 1;
      }
  }
  continue;
     }

     smsg((char_u *)((char *)("/ line ignored in %s line %d: %s")),
             fname, lnum, line - 1);
     continue;
 }

 flags = 0;
 regionmask = spin->si_region;


 p = vim_strchr(line, '/');
 if (p != ((void *)0))
 {
     *p++ = '\000';
     while (*p != '\000')
     {
  if (*p == '=')
      flags |= 0x80 | 0x40;
  else if (*p == '!')
      flags |= 0x10;
  else if (*p == '?')
      flags |= 0x08;
  else if (((*p) >= '0' && (*p) <= '9'))
  {
      if ((flags & 0x01) == 0)
   regionmask = 0;
      flags |= 0x01;

      l = *p - '0';
      if (l > spin->si_region_count)
      {
   smsg((char_u *)((char *)("Invalid region nr in %s line %d: %s")),
         fname, lnum, p);
   break;
      }
      regionmask |= 1 << (l - 1);
  }
  else
  {
      smsg((char_u *)((char *)("Unrecognized flags in %s line %d: %s")),
             fname, lnum, p);
      break;
  }
  ++p;
     }
 }


 if (spin->si_ascii && has_non_ascii(line))
 {
     ++non_ascii;
     continue;
 }


 if (store_word(spin, line, flags, regionmask, ((void *)0), 0) == 0)
 {
     retval = 0;
     break;
 }
 did_word = 1;
    }

    vim_free(pc);
    fclose(fd);

    if (spin->si_ascii && non_ascii > 0)
    {
 vim_snprintf((char *)IObuff, (1024+1),
    ((char *)("Ignored %d words with non-ASCII characters")), non_ascii);
 spell_message(spin, IObuff);
    }

    return retval;
}
# 7329 "spell.c"
    static void *
getroom(spin, len, align)
    spellinfo_T *spin;
    size_t len;
    int align;
{
    char_u *p;
    sblock_T *bl = spin->si_blocks;

    if (align && bl != ((void *)0))


 bl->sb_used = (bl->sb_used + sizeof(char *) - 1)
            & ~(sizeof(char *) - 1);

    if (bl == ((void *)0) || bl->sb_used + len > 16000)
    {

 bl = (sblock_T *)alloc_clear((unsigned)(sizeof(sblock_T) + 16000));
 if (bl == ((void *)0))
     return ((void *)0);
 bl->sb_next = spin->si_blocks;
 spin->si_blocks = bl;
 bl->sb_used = 0;
 ++spin->si_blocks_cnt;
    }

    p = bl->sb_data + bl->sb_used;
    bl->sb_used += (int)len;

    return p;
}




    static char_u *
getroom_save(spin, s)
    spellinfo_T *spin;
    char_u *s;
{
    char_u *sc;

    sc = (char_u *)getroom(spin, strlen((char *)(s)) + 1, 0);
    if (sc != ((void *)0))
 ((__builtin_object_size ((char *)(sc), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(sc), (char *)(s), __builtin_object_size ((char *)(sc), 1 > 1)) : __inline_strcpy_chk ((char *)(sc), (char *)(s)));
    return sc;
}





    static void
free_blocks(bl)
    sblock_T *bl;
{
    sblock_T *next;

    while (bl != ((void *)0))
    {
 next = bl->sb_next;
 vim_free(bl);
 bl = next;
    }
}




    static wordnode_T *
wordtree_alloc(spin)
    spellinfo_T *spin;
{
    return (wordnode_T *)getroom(spin, sizeof(wordnode_T), 1);
}
# 7415 "spell.c"
    static int
store_word(spin, word, flags, region, pfxlist, need_affix)
    spellinfo_T *spin;
    char_u *word;
    int flags;
    int region;
    char_u *pfxlist;
    int need_affix;
{
    int len = (int)strlen((char *)(word));
    int ct = captype(word, word + len);
    char_u foldword[250];
    int res = 1;
    char_u *p;

    (void)spell_casefold(word, len, foldword, 250);
    for (p = pfxlist; res == 1; ++p)
    {
 if (!need_affix || (p != ((void *)0) && *p != '\000'))
     res = tree_add_word(spin, foldword, spin->si_foldroot, ct | flags,
        region, p == ((void *)0) ? 0 : *p);
 if (p == ((void *)0) || *p == '\000')
     break;
    }
    ++spin->si_foldwcount;

    if (res == 1 && (ct == 0x80 || (flags & 0x80)))
    {
 for (p = pfxlist; res == 1; ++p)
 {
     if (!need_affix || (p != ((void *)0) && *p != '\000'))
  res = tree_add_word(spin, word, spin->si_keeproot, flags,
        region, p == ((void *)0) ? 0 : *p);
     if (p == ((void *)0) || *p == '\000')
  break;
 }
 ++spin->si_keepwcount;
    }
    return res;
}







    static int
tree_add_word(spin, word, root, flags, region, affixID)
    spellinfo_T *spin;
    char_u *word;
    wordnode_T *root;
    int flags;
    int region;
    int affixID;
{
    wordnode_T *node = root;
    wordnode_T *np;
    wordnode_T *copyp, **copyprev;
    wordnode_T **prev = ((void *)0);
    int i;


    for (i = 0; ; ++i)
    {



 if (node != ((void *)0) && node->wn_refs > 1)
 {
     --node->wn_refs;
     copyprev = prev;
     for (copyp = node; copyp != ((void *)0); copyp = copyp->wn_sibling)
     {

  np = get_wordnode(spin);
  if (np == ((void *)0))
      return 0;
  np->wn_child = copyp->wn_child;
  if (np->wn_child != ((void *)0))
      ++np->wn_child->wn_refs;
  np->wn_byte = copyp->wn_byte;
  if (np->wn_byte == '\000')
  {
      np->wn_flags = copyp->wn_flags;
      np->wn_region = copyp->wn_region;
      np->wn_affixID = copyp->wn_affixID;
  }


  np->wn_refs = 1;
  if (copyprev != ((void *)0))
      *copyprev = np;
  copyprev = &np->wn_sibling;


  if (copyp == node)
      node = np;
     }
 }





 while (node != ((void *)0)
  && (node->wn_byte < word[i]
      || (node->wn_byte == '\000'
   && (flags < 0
       ? node->wn_affixID < (unsigned)affixID
       : (node->wn_flags < (unsigned)(flags & 0xffff)
    || (node->wn_flags == (flags & 0xffff)
        && (spin->si_sugtree
     ? (node->wn_region & 0xffff) < region
     : node->wn_affixID
          < (unsigned)affixID)))))))
 {
     prev = &node->wn_sibling;
     node = *prev;
 }
 if (node == ((void *)0)
  || node->wn_byte != word[i]
  || (word[i] == '\000'
      && (flags < 0
   || spin->si_sugtree
   || node->wn_flags != (flags & 0xffff)
   || node->wn_affixID != affixID)))
 {

     np = get_wordnode(spin);
     if (np == ((void *)0))
  return 0;
     np->wn_byte = word[i];





     if (node == ((void *)0))
  np->wn_refs = 1;
     else
     {
  np->wn_refs = node->wn_refs;
  node->wn_refs = 1;
     }
     if (prev != ((void *)0))
  *prev = np;
     np->wn_sibling = node;
     node = np;
 }

 if (word[i] == '\000')
 {
     node->wn_flags = flags;
     node->wn_region |= region;
     node->wn_affixID = affixID;
     break;
 }
 prev = &node->wn_child;
 node = *prev;
    }






    ++spin->si_msg_count;

    if (spin->si_compress_cnt > 1)
    {
 if (--spin->si_compress_cnt == 1)

     spin->si_blocks_cnt += compress_inc;
    }
# 7604 "spell.c"
    if (spin->si_compress_cnt == 1
     ? spin->si_free_count < 250
     : spin->si_blocks_cnt >= compress_start)

    {




 spin->si_blocks_cnt -= compress_inc;
 spin->si_compress_cnt = compress_added;

 if (spin->si_verbose)
 {
     msg_start();
     msg_puts((char_u *)((char *)(msg_compressing)));
     msg_clr_eos();
     msg_didout = 0;
     msg_col = 0;
     out_flush();
 }





 wordtree_compress(spin, spin->si_foldroot);
 if (affixID >= 0)
     wordtree_compress(spin, spin->si_keeproot);
    }

    return 1;
}





    int
spell_check_msm()
{
    char_u *p = p_msm;
    long start = 0;
    long incr = 0;
    long added = 0;

    if (!((*p) >= '0' && (*p) <= '9'))
 return 0;

    start = (getdigits(&p) * 10) / (16000 / 102);
    if (*p != ',')
 return 0;
    ++p;
    if (!((*p) >= '0' && (*p) <= '9'))
 return 0;
    incr = (getdigits(&p) * 102) / (16000 / 10);
    if (*p != ',')
 return 0;
    ++p;
    if (!((*p) >= '0' && (*p) <= '9'))
 return 0;
    added = getdigits(&p) * 1024;
    if (*p != '\000')
 return 0;

    if (start == 0 || incr == 0 || added == 0 || incr > start)
 return 0;

    compress_start = start;
    compress_inc = incr;
    compress_added = added;
    return 1;
}






    static wordnode_T *
get_wordnode(spin)
    spellinfo_T *spin;
{
    wordnode_T *n;

    if (spin->si_first_free == ((void *)0))
 n = (wordnode_T *)getroom(spin, sizeof(wordnode_T), 1);
    else
    {
 n = spin->si_first_free;
 spin->si_first_free = n->wn_child;
 ((__builtin_object_size ((n), 0) != (size_t) -1) ? __builtin___memset_chk ((n), (0), (sizeof(wordnode_T)), __builtin_object_size ((n), 0)) : __inline_memset_chk ((n), (0), (sizeof(wordnode_T))));
 --spin->si_free_count;
    }



    return n;
}







    static int
deref_wordnode(spin, node)
    spellinfo_T *spin;
    wordnode_T *node;
{
    wordnode_T *np;
    int cnt = 0;

    if (--node->wn_refs == 0)
    {
 for (np = node; np != ((void *)0); np = np->wn_sibling)
 {
     if (np->wn_child != ((void *)0))
  cnt += deref_wordnode(spin, np->wn_child);
     free_wordnode(spin, np);
     ++cnt;
 }
 ++cnt;
    }
    return cnt;
}





    static void
free_wordnode(spin, n)
    spellinfo_T *spin;
    wordnode_T *n;
{
    n->wn_child = spin->si_first_free;
    spin->si_first_free = n;
    ++spin->si_free_count;
}




    static void
wordtree_compress(spin, root)
    spellinfo_T *spin;
    wordnode_T *root;
{
    hashtab_T ht;
    int n;
    int tot = 0;
    int perc;



    if (root->wn_sibling != ((void *)0))
    {
 hash_init(&ht);
 n = node_compress(spin, root->wn_sibling, &ht, &tot);


 if (spin->si_verbose || p_verbose > 2)

 {
     if (tot > 1000000)
  perc = (tot - n) / (tot / 100);
     else if (tot == 0)
  perc = 0;
     else
  perc = (tot - n) * 100 / tot;
     vim_snprintf((char *)IObuff, (1024+1),
     ((char *)("Compressed %d of %d nodes; %d (%d%%) remaining")),
             n, tot, tot - n, perc);
     spell_message(spin, IObuff);
 }



 hash_clear(&ht);
    }
}





    static int
node_compress(spin, node, ht, tot)
    spellinfo_T *spin;
    wordnode_T *node;
    hashtab_T *ht;
    int *tot;

{
    wordnode_T *np;
    wordnode_T *tp;
    wordnode_T *child;
    hash_T hash;
    hashitem_T *hi;
    int len = 0;
    unsigned nr, n;
    int compressed = 0;







    for (np = node; np != ((void *)0) && !got_int; np = np->wn_sibling)
    {
 ++len;
 if ((child = np->wn_child) != ((void *)0))
 {

     compressed += node_compress(spin, child, ht, tot);


     hash = hash_hash(child->wn_u1.hashkey);
     hi = hash_lookup(ht, child->wn_u1.hashkey, hash);
     if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
     {



  for (tp = (wordnode_T *)((hi)->hi_key); tp != ((void *)0); tp = tp->wn_u2.next)
      if (node_equal(child, tp))
      {



   ++tp->wn_refs;
   compressed += deref_wordnode(spin, child);
   np->wn_child = tp;
   break;
      }
  if (tp == ((void *)0))
  {



      tp = (wordnode_T *)((hi)->hi_key);
      child->wn_u2.next = tp->wn_u2.next;
      tp->wn_u2.next = child;
  }
     }
     else


  hash_add_item(ht, hi, child->wn_u1.hashkey, hash);
 }
    }
    *tot += len + 1;






    node->wn_u1.hashkey[0] = len;
    nr = 0;
    for (np = node; np != ((void *)0); np = np->wn_sibling)
    {
 if (np->wn_byte == '\000')

     n = np->wn_flags + (np->wn_region << 8) + (np->wn_affixID << 16);
 else

     n = (unsigned)(np->wn_byte + ((long_u)np->wn_child << 8));
 nr = nr * 101 + n;
    }


    n = nr & 0xff;
    node->wn_u1.hashkey[1] = n == 0 ? 1 : n;
    n = (nr >> 8) & 0xff;
    node->wn_u1.hashkey[2] = n == 0 ? 1 : n;
    n = (nr >> 16) & 0xff;
    node->wn_u1.hashkey[3] = n == 0 ? 1 : n;
    n = (nr >> 24) & 0xff;
    node->wn_u1.hashkey[4] = n == 0 ? 1 : n;
    node->wn_u1.hashkey[5] = '\000';


    fast_breakcheck();

    return compressed;
}




    static int
node_equal(n1, n2)
    wordnode_T *n1;
    wordnode_T *n2;
{
    wordnode_T *p1;
    wordnode_T *p2;

    for (p1 = n1, p2 = n2; p1 != ((void *)0) && p2 != ((void *)0);
         p1 = p1->wn_sibling, p2 = p2->wn_sibling)
 if (p1->wn_byte != p2->wn_byte
  || (p1->wn_byte == '\000'
      ? (p1->wn_flags != p2->wn_flags
   || p1->wn_region != p2->wn_region
   || p1->wn_affixID != p2->wn_affixID)
      : (p1->wn_child != p2->wn_child)))
     break;

    return p1 == ((void *)0) && p2 == ((void *)0);
}

static int



rep_compare (const void *s1, const void *s2);




    static int



rep_compare(s1, s2)
    const void *s1;
    const void *s2;
{
    fromto_T *p1 = (fromto_T *)s1;
    fromto_T *p2 = (fromto_T *)s2;

    return strcmp((char *)(p1->ft_from), (char *)(p2->ft_from));
}





    static int
write_vim_spell(spin, fname)
    spellinfo_T *spin;
    char_u *fname;
{
    FILE *fd;
    int regionmask;
    int round;
    wordnode_T *tree;
    int nodecount;
    int i;
    int l;
    garray_T *gap;
    fromto_T *ftp;
    char_u *p;
    int rr;
    int retval = 1;
    size_t fwv = 1;


    fd = fopen(((char *)fname), ("w"));
    if (fd == ((void *)0))
    {
 emsg2((char_u *)(((char *)(e_notopen))), (char_u *)(fname));
 return 0;
    }



    fwv &= fwrite("VIMspell", 8, (size_t)1, fd);
    if (fwv != (size_t)1)

 goto theend;

    putc(50, fd);






    if (spin->si_info != ((void *)0))
    {
 putc(15, fd);
 putc(0, fd);

 i = (int)strlen((char *)(spin->si_info));
 put_bytes(fd, (long_u)i, 4);
 fwv &= fwrite(spin->si_info, (size_t)i, (size_t)1, fd);
    }



    if (spin->si_region_count > 1)
    {
 putc(0, fd);
 putc(1, fd);
 l = spin->si_region_count * 2;
 put_bytes(fd, (long_u)l, 4);
 fwv &= fwrite(spin->si_region_name, (size_t)l, (size_t)1, fd);

 regionmask = (1 << spin->si_region_count) - 1;
    }
    else
 regionmask = 0;
# 8022 "spell.c"
    if (!spin->si_ascii && !spin->si_add)
    {
 char_u folchars[128 * 8];
 int flags;

 putc(1, fd);
 putc(1, fd);


 l = 0;
 for (i = 128; i < 256; ++i)
 {





  folchars[l++] = spelltab.st_fold[i];
 }
 put_bytes(fd, (long_u)(1 + 128 + 2 + l), 4);

 fputc(128, fd);
 for (i = 128; i < 256; ++i)
 {
     flags = 0;
     if (spelltab.st_isw[i])
  flags |= 0x01;
     if (spelltab.st_isu[i])
  flags |= 0x02;
     fputc(flags, fd);
 }

 put_bytes(fd, (long_u)l, 2);
 fwv &= fwrite(folchars, (size_t)l, (size_t)1, fd);
    }


    if (spin->si_midword != ((void *)0))
    {
 putc(2, fd);
 putc(1, fd);

 i = (int)strlen((char *)(spin->si_midword));
 put_bytes(fd, (long_u)i, 4);
 fwv &= fwrite(spin->si_midword, (size_t)i, (size_t)1, fd);

    }


    if (spin->si_prefcond.ga_len > 0)
    {
 putc(3, fd);
 putc(1, fd);

 l = write_spell_prefcond(((void *)0), &spin->si_prefcond);
 put_bytes(fd, (long_u)l, 4);

 write_spell_prefcond(fd, &spin->si_prefcond);
    }
# 8089 "spell.c"
    for (round = 1; round <= 3; ++round)
    {
 if (round == 1)
     gap = &spin->si_rep;
 else if (round == 2)
 {

     if (spin->si_sofofr != ((void *)0) && spin->si_sofoto != ((void *)0))
  continue;
     gap = &spin->si_sal;
 }
 else
     gap = &spin->si_repsal;


 if (gap->ga_len == 0)
     continue;


 if (round != 2)
     qsort(gap->ga_data, (size_t)gap->ga_len,
            sizeof(fromto_T), rep_compare);

 i = round == 1 ? 4 : (round == 2 ? 5 : 12);
 putc(i, fd);


 putc(0, fd);


 l = 2;
 for (i = 0; i < gap->ga_len; ++i)
 {
     ftp = &((fromto_T *)gap->ga_data)[i];
     l += 1 + (int)strlen((char *)(ftp->ft_from));
     l += 1 + (int)strlen((char *)(ftp->ft_to));
 }
 if (round == 2)
     ++l;
 put_bytes(fd, (long_u)l, 4);

 if (round == 2)
 {
     i = 0;
     if (spin->si_followup)
  i |= 1;
     if (spin->si_collapse)
  i |= 2;
     if (spin->si_rem_accents)
  i |= 4;
     putc(i, fd);
 }

 put_bytes(fd, (long_u)gap->ga_len, 2);
 for (i = 0; i < gap->ga_len; ++i)
 {


     ftp = &((fromto_T *)gap->ga_data)[i];
     for (rr = 1; rr <= 2; ++rr)
     {
  p = rr == 1 ? ftp->ft_from : ftp->ft_to;
  l = (int)strlen((char *)(p));
  putc(l, fd);
  if (l > 0)
      fwv &= fwrite(p, l, (size_t)1, fd);
     }
 }

    }



    if (spin->si_sofofr != ((void *)0) && spin->si_sofoto != ((void *)0))
    {
 putc(6, fd);
 putc(0, fd);

 l = (int)strlen((char *)(spin->si_sofofr));
 put_bytes(fd, (long_u)(l + strlen((char *)(spin->si_sofoto)) + 4), 4);


 put_bytes(fd, (long_u)l, 2);
 fwv &= fwrite(spin->si_sofofr, l, (size_t)1, fd);

 l = (int)strlen((char *)(spin->si_sofoto));
 put_bytes(fd, (long_u)l, 2);
 fwv &= fwrite(spin->si_sofoto, l, (size_t)1, fd);
    }



    if (spin->si_commonwords.ht_used > 0)
    {
 putc(13, fd);
 putc(0, fd);



 for (round = 1; round <= 2; ++round)
 {
     int todo;
     int len = 0;
     hashitem_T *hi;

     todo = (int)spin->si_commonwords.ht_used;
     for (hi = spin->si_commonwords.ht_array; todo > 0; ++hi)
  if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
  {
      l = (int)strlen((char *)(hi->hi_key)) + 1;
      len += l;
      if (round == 2)
   fwv &= fwrite(hi->hi_key, (size_t)l, (size_t)1, fd);
      --todo;
  }
     if (round == 1)
  put_bytes(fd, (long_u)len, 4);
 }
    }



    if (spin->si_map.ga_len > 0)
    {
 putc(7, fd);
 putc(0, fd);
 l = spin->si_map.ga_len;
 put_bytes(fd, (long_u)l, 4);
 fwv &= fwrite(spin->si_map.ga_data, (size_t)l, (size_t)1, fd);

    }






    if (!spin->si_nosugfile
     && (spin->si_sal.ga_len > 0
       || (spin->si_sofofr != ((void *)0) && spin->si_sofoto != ((void *)0))))
    {
 putc(11, fd);
 putc(0, fd);
 put_bytes(fd, (long_u)8, 4);


 spin->si_sugtime = time(((void *)0));
 put_time(fd, spin->si_sugtime);
    }




    if (spin->si_nosplitsugs)
    {
 putc(14, fd);
 putc(0, fd);
 put_bytes(fd, (long_u)0, 4);
    }




    if (spin->si_compflags != ((void *)0))
    {
 putc(8, fd);
 putc(0, fd);

 l = (int)strlen((char *)(spin->si_compflags));
 for (i = 0; i < spin->si_comppat.ga_len; ++i)
     l += (int)strlen((char *)(((char_u **)(spin->si_comppat.ga_data))[i])) + 1;
 put_bytes(fd, (long_u)(l + 7), 4);

 putc(spin->si_compmax, fd);
 putc(spin->si_compminlen, fd);
 putc(spin->si_compsylmax, fd);
 putc(0, fd);
 putc(spin->si_compoptions, fd);
 put_bytes(fd, (long_u)spin->si_comppat.ga_len, 2);

 for (i = 0; i < spin->si_comppat.ga_len; ++i)
 {
     p = ((char_u **)(spin->si_comppat.ga_data))[i];
     putc((int)strlen((char *)(p)), fd);
     fwv &= fwrite(p, (size_t)strlen((char *)(p)), (size_t)1, fd);

 }

 fwv &= fwrite(spin->si_compflags, (size_t)strlen((char *)(spin->si_compflags)),
              (size_t)1, fd);
    }


    if (spin->si_nobreak)
    {
 putc(10, fd);
 putc(0, fd);


 put_bytes(fd, (long_u)0, 4);
    }




    if (spin->si_syllable != ((void *)0))
    {
 putc(9, fd);
 putc(0, fd);

 l = (int)strlen((char *)(spin->si_syllable));
 put_bytes(fd, (long_u)l, 4);
 fwv &= fwrite(spin->si_syllable, (size_t)l, (size_t)1, fd);

    }


    putc(255, fd);





    spin->si_memtot = 0;
    for (round = 1; round <= 3; ++round)
    {
 if (round == 1)
     tree = spin->si_foldroot->wn_sibling;
 else if (round == 2)
     tree = spin->si_keeproot->wn_sibling;
 else
     tree = spin->si_prefroot->wn_sibling;


 clear_node(tree);




 nodecount = put_node(((void *)0), tree, 0, regionmask, round == 3);


 put_bytes(fd, (long_u)nodecount, 4);
 spin->si_memtot += nodecount + nodecount * sizeof(int);


 (void)put_node(fd, tree, 0, regionmask, round == 3);
    }


    if (putc(0, fd) == (-1))
 retval = 0;
theend:
    if (fclose(fd) == (-1))
 retval = 0;

    if (fwv != (size_t)1)
 retval = 0;
    if (retval == 0)
 emsg((char_u *)(((char *)(e_write))));

    return retval;
}






    static void
clear_node(node)
    wordnode_T *node;
{
    wordnode_T *np;

    if (node != ((void *)0))
 for (np = node; np != ((void *)0); np = np->wn_sibling)
 {
     np->wn_u1.index = 0;
     np->wn_u2.wnode = ((void *)0);

     if (np->wn_byte != '\000')
  clear_node(np->wn_child);
 }
}
# 8388 "spell.c"
    static int
put_node(fd, node, idx, regionmask, prefixtree)
    FILE *fd;
    wordnode_T *node;
    int idx;
    int regionmask;
    int prefixtree;
{
    int newindex = idx;
    int siblingcount = 0;
    wordnode_T *np;
    int flags;


    if (node == ((void *)0))
 return 0;


    node->wn_u1.index = idx;


    for (np = node; np != ((void *)0); np = np->wn_sibling)
 ++siblingcount;


    if (fd != ((void *)0))
 putc(siblingcount, fd);


    for (np = node; np != ((void *)0); np = np->wn_sibling)
    {
 if (np->wn_byte == 0)
 {
     if (fd != ((void *)0))
     {

  if (prefixtree)
  {




      if (np->wn_flags == (short_u)-256)
   putc(0, fd);
      else
      {
   putc(2, fd);
   putc(np->wn_flags, fd);
      }
      putc(np->wn_affixID, fd);
      put_bytes(fd, (long_u)np->wn_region, 2);
  }
  else
  {

      flags = np->wn_flags;
      if (regionmask != 0 && np->wn_region != regionmask)
   flags |= 0x01;
      if (np->wn_affixID != 0)
   flags |= 0x20;
      if (flags == 0)
      {

   putc(0, fd);
      }
      else
      {
   if (np->wn_flags >= 0x100)
   {
       putc(3, fd);
       putc(flags, fd);
       putc((unsigned)flags >> 8, fd);
   }
   else
   {
       putc(2, fd);
       putc(flags, fd);
   }
   if (flags & 0x01)
       putc(np->wn_region, fd);
   if (flags & 0x20)
       putc(np->wn_affixID, fd);
      }
  }
     }
 }
 else
 {
     if (np->wn_child->wn_u1.index != 0
      && np->wn_child->wn_u2.wnode != node)
     {

  if (fd != ((void *)0))
  {
      putc(1, fd);

      put_bytes(fd, (long_u)np->wn_child->wn_u1.index, 3);
  }
     }
     else if (np->wn_child->wn_u2.wnode == ((void *)0))

  np->wn_child->wn_u2.wnode = node;

     if (fd != ((void *)0))
  if (putc(np->wn_byte, fd) == (-1))
  {
      emsg((char_u *)(((char *)(e_write))));
      return 0;
  }
 }
    }



    newindex += siblingcount + 1;


    for (np = node; np != ((void *)0); np = np->wn_sibling)
 if (np->wn_byte != 0 && np->wn_child->wn_u2.wnode == node)
     newindex = put_node(fd, np->wn_child, newindex, regionmask,
          prefixtree);

    return newindex;
}






    void
ex_mkspell(eap)
    exarg_T *eap;
{
    int fcount;
    char_u **fnames;
    char_u *arg = eap->arg;
    int ascii = 0;

    if (strncmp((char *)(arg), (char *)("-ascii"), (size_t)(6)) == 0)
    {
 ascii = 1;
 arg = skipwhite(arg + 6);
    }


    if (get_arglist_exp(arg, &fcount, &fnames) == 1)
    {
 mkspell(fcount, fnames, ascii, eap->forceit, 0);
 FreeWild(fcount, fnames);
    }
}






    static void
spell_make_sugfile(spin, wfname)
    spellinfo_T *spin;
    char_u *wfname;
{
    char_u fname[1024];
    int len;
    slang_T *slang;
    int free_slang = 0;
# 8563 "spell.c"
    for (slang = first_lang; slang != ((void *)0); slang = slang->sl_next)
 if (fullpathcmp(wfname, slang->sl_fname, 0) == 1)
     break;
    if (slang == ((void *)0))
    {
 spell_message(spin, (char_u *)((char *)("Reading back spell file...")));
 slang = spell_load_file(wfname, ((void *)0), ((void *)0), 0);
 if (slang == ((void *)0))
     return;
 free_slang = 1;
    }




    spin->si_blocks = ((void *)0);
    spin->si_blocks_cnt = 0;
    spin->si_compress_cnt = 0;
    spin->si_free_count = 0;
    spin->si_first_free = ((void *)0);
    spin->si_foldwcount = 0;





    spell_message(spin, (char_u *)((char *)("Performing soundfolding...")));
    if (sug_filltree(spin, slang) == 0)
 goto theend;







    if (sug_maketable(spin) == 0)
 goto theend;

    smsg((char_u *)((char *)("Number of words after soundfolding: %ld")),
     (long)spin->si_spellbuf->b_ml.ml_line_count);




    spell_message(spin, (char_u *)((char *)(msg_compressing)));
    wordtree_compress(spin, spin->si_foldroot);





    ((__builtin_object_size ((char *)(fname), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(fname), (char *)(wfname), __builtin_object_size ((char *)(fname), 1 > 1)) : __inline_strcpy_chk ((char *)(fname), (char *)(wfname)));
    len = (int)strlen((char *)(fname));
    fname[len - 2] = 'u';
    fname[len - 1] = 'g';
    sug_write(spin, fname);

theend:
    if (free_slang)
 slang_free(slang);
    free_blocks(spin->si_blocks);
    close_spellbuf(spin->si_spellbuf);
}




    static int
sug_filltree(spin, slang)
    spellinfo_T *spin;
    slang_T *slang;
{
    char_u *byts;
    idx_T *idxs;
    int depth;
    idx_T arridx[250];
    int curi[250];
    char_u tword[250];
    char_u tsalword[250];
    int c;
    idx_T n;
    unsigned words_done = 0;
    int wordcount[250];


    spin->si_foldroot = wordtree_alloc(spin);
    if (spin->si_foldroot == ((void *)0))
 return 0;


    spin->si_sugtree = 1;





    byts = slang->sl_fbyts;
    idxs = slang->sl_fidxs;

    arridx[0] = 0;
    curi[0] = 1;
    wordcount[0] = 0;

    depth = 0;
    while (depth >= 0 && !got_int)
    {
 if (curi[depth] > byts[arridx[depth]])
 {

     idxs[arridx[depth]] = wordcount[depth];
     if (depth > 0)
  wordcount[depth - 1] += wordcount[depth];

     --depth;
     line_breakcheck();
 }
 else
 {


     n = arridx[depth] + curi[depth];
     ++curi[depth];

     c = byts[n];
     if (c == 0)
     {

  tword[depth] = '\000';
  spell_soundfold(slang, tword, 1, tsalword);



  if (tree_add_word(spin, tsalword, spin->si_foldroot,
    words_done >> 16, words_done & 0xffff,
          0) == 0)
      return 0;

  ++words_done;
  ++wordcount[depth];



  spin->si_blocks_cnt = 0;



  while (byts[n + 1] == 0)
  {
      ++n;
      ++curi[depth];
  }
     }
     else
     {

  tword[depth++] = c;
  arridx[depth] = idxs[n];
  curi[depth] = 1;
  wordcount[depth] = 0;
     }
 }
    }

    smsg((char_u *)((char *)("Total number of words: %d")), words_done);

    return 1;
}
# 8739 "spell.c"
    static int
sug_maketable(spin)
    spellinfo_T *spin;
{
    garray_T ga;
    int res = 1;



    spin->si_spellbuf = open_spellbuf();
    if (spin->si_spellbuf == ((void *)0))
 return 0;



    ga_init2(&ga, 1, 100);


    if (sug_filltable(spin, spin->si_foldroot->wn_sibling, 0, &ga) == -1)
 res = 0;

    ga_clear(&ga);
    return res;
}






    static int
sug_filltable(spin, node, startwordnr, gap)
    spellinfo_T *spin;
    wordnode_T *node;
    int startwordnr;
    garray_T *gap;
{
    wordnode_T *p, *np;
    int wordnr = startwordnr;
    int nr;
    int prev_nr;

    for (p = node; p != ((void *)0); p = p->wn_sibling)
    {
 if (p->wn_byte == '\000')
 {
     gap->ga_len = 0;
     prev_nr = 0;
     for (np = p; np != ((void *)0) && np->wn_byte == '\000'; np = np->wn_sibling)
     {
  if (ga_grow(gap, 10) == 0)
      return -1;

  nr = (np->wn_flags << 16) + (np->wn_region & 0xffff);




  nr -= prev_nr;
  prev_nr += nr;
  gap->ga_len += offset2bytes(nr,
      (char_u *)gap->ga_data + gap->ga_len);
     }


     ((char_u *)gap->ga_data)[gap->ga_len++] = '\000';

     if (ml_append_buf(spin->si_spellbuf, (linenr_T)wordnr,
         gap->ga_data, gap->ga_len, 1) == 0)
  return -1;
     ++wordnr;



     while (p->wn_sibling != ((void *)0) && p->wn_sibling->wn_byte == '\000')
  p->wn_sibling = p->wn_sibling->wn_sibling;



     p->wn_flags = 0;
     p->wn_region = 0;
 }
 else
 {
     wordnr = sug_filltable(spin, p->wn_child, wordnr, gap);
     if (wordnr == -1)
  return -1;
 }
    }
    return wordnr;
}






    static int
offset2bytes(nr, buf)
    int nr;
    char_u *buf;
{
    int rem;
    int b1, b2, b3, b4;


    b1 = nr % 255 + 1;
    rem = nr / 255;
    b2 = rem % 255 + 1;
    rem = rem / 255;
    b3 = rem % 255 + 1;
    b4 = rem / 255 + 1;

    if (b4 > 1 || b3 > 0x1f)
    {
 buf[0] = 0xe0 + b4;
 buf[1] = b3;
 buf[2] = b2;
 buf[3] = b1;
 return 4;
    }
    if (b3 > 1 || b2 > 0x3f )
    {
 buf[0] = 0xc0 + b3;
 buf[1] = b2;
 buf[2] = b1;
 return 3;
    }
    if (b2 > 1 || b1 > 0x7f )
    {
 buf[0] = 0x80 + b2;
 buf[1] = b1;
 return 2;
    }

    buf[0] = b1;
    return 1;
}






    static int
bytes2offset(pp)
    char_u **pp;
{
    char_u *p = *pp;
    int nr;
    int c;

    c = *p++;
    if ((c & 0x80) == 0x00)
    {
 nr = c - 1;
    }
    else if ((c & 0xc0) == 0x80)
    {
 nr = (c & 0x3f) - 1;
 nr = nr * 255 + (*p++ - 1);
    }
    else if ((c & 0xe0) == 0xc0)
    {
 nr = (c & 0x1f) - 1;
 nr = nr * 255 + (*p++ - 1);
 nr = nr * 255 + (*p++ - 1);
    }
    else
    {
 nr = (c & 0x0f) - 1;
 nr = nr * 255 + (*p++ - 1);
 nr = nr * 255 + (*p++ - 1);
 nr = nr * 255 + (*p++ - 1);
    }

    *pp = p;
    return nr;
}




    static void
sug_write(spin, fname)
    spellinfo_T *spin;
    char_u *fname;
{
    FILE *fd;
    wordnode_T *tree;
    int nodecount;
    int wcount;
    char_u *line;
    linenr_T lnum;
    int len;


    fd = fopen(((char *)fname), ("w"));
    if (fd == ((void *)0))
    {
 emsg2((char_u *)(((char *)(e_notopen))), (char_u *)(fname));
 return;
    }

    vim_snprintf((char *)IObuff, (1024+1),
      ((char *)("Writing suggestion file %s ...")), fname);
    spell_message(spin, IObuff);




    if (fwrite("VIMsug", 6, (size_t)1, fd) != 1)
    {
 emsg((char_u *)(((char *)(e_write))));
 goto theend;
    }
    putc(1, fd);


    put_time(fd, spin->si_sugtime);




    spin->si_memtot = 0;
    tree = spin->si_foldroot->wn_sibling;


    clear_node(tree);




    nodecount = put_node(((void *)0), tree, 0, 0, 0);


    put_bytes(fd, (long_u)nodecount, 4);
    spin->si_memtot += nodecount + nodecount * sizeof(int);


    (void)put_node(fd, tree, 0, 0, 0);




    wcount = spin->si_spellbuf->b_ml.ml_line_count;
    put_bytes(fd, (long_u)wcount, 4);

    for (lnum = 1; lnum <= (linenr_T)wcount; ++lnum)
    {

 line = ml_get_buf(spin->si_spellbuf, lnum, 0);
 len = (int)strlen((char *)(line)) + 1;
 if (fwrite(line, (size_t)len, (size_t)1, fd) == 0)
 {
     emsg((char_u *)(((char *)(e_write))));
     goto theend;
 }
 spin->si_memtot += len;
    }


    if (putc(0, fd) == (-1))
 emsg((char_u *)(((char *)(e_write))));

    vim_snprintf((char *)IObuff, (1024+1),
   ((char *)("Estimated runtime memory use: %d bytes")), spin->si_memtot);
    spell_message(spin, IObuff);

theend:

    fclose(fd);
}
# 9021 "spell.c"
    static buf_T *
open_spellbuf()
{
    buf_T *buf;

    buf = (buf_T *)alloc_clear(sizeof(buf_T));
    if (buf != ((void *)0))
    {
 buf->b_spell = 1;
 buf->b_p_swf = 1;
 ml_open(buf);
 ml_open_file(buf);
    }
    return buf;
}




    static void
close_spellbuf(buf)
    buf_T *buf;
{
    if (buf != ((void *)0))
    {
 ml_close(buf, 1);
 vim_free(buf);
    }
}
# 9059 "spell.c"
    static void
mkspell(fcount, fnames, ascii, overwrite, added_word)
    int fcount;
    char_u **fnames;
    int ascii;
    int overwrite;
    int added_word;
{
    char_u fname[1024];
    char_u wfname[1024];
    char_u **innames;
    int incount;
    afffile_T *(afile[8]);
    int i;
    int len;
    struct stat st;
    int error = 0;
    spellinfo_T spin;

    ((__builtin_object_size ((&spin), 0) != (size_t) -1) ? __builtin___memset_chk ((&spin), (0), (sizeof(spin)), __builtin_object_size ((&spin), 0)) : __inline_memset_chk ((&spin), (0), (sizeof(spin))));
    spin.si_verbose = !added_word;
    spin.si_ascii = ascii;
    spin.si_followup = 1;
    spin.si_rem_accents = 1;
    ga_init2(&spin.si_rep, (int)sizeof(fromto_T), 20);
    ga_init2(&spin.si_repsal, (int)sizeof(fromto_T), 20);
    ga_init2(&spin.si_sal, (int)sizeof(fromto_T), 20);
    ga_init2(&spin.si_map, (int)sizeof(char_u), 100);
    ga_init2(&spin.si_comppat, (int)sizeof(char_u *), 20);
    ga_init2(&spin.si_prefcond, (int)sizeof(char_u *), 50);
    hash_init(&spin.si_commonwords);
    spin.si_newcompID = 127;


    innames = &fnames[1];
    incount = fcount - 1;

    if (fcount >= 1)
    {
 len = (int)strlen((char *)(fnames[0]));
 if (fcount == 1 && len > 4 && strcmp((char *)(fnames[0] + len - 4), (char *)(".add")) == 0)
 {


     innames = &fnames[0];
     incount = 1;
     vim_snprintf((char *)wfname, sizeof(wfname), "%s.spl", fnames[0]);
 }
 else if (fcount == 1)
 {

     innames = &fnames[0];
     incount = 1;
     vim_snprintf((char *)wfname, sizeof(wfname), "%s.%s.spl", fnames[0],
        spin.si_ascii ? (char_u *)"ascii" : spell_enc());
 }
 else if (len > 4 && strcmp((char *)(fnames[0] + len - 4), (char *)(".spl")) == 0)
 {

     vim_strncpy(wfname, fnames[0], sizeof(wfname) - 1);
 }
 else

     vim_snprintf((char *)wfname, sizeof(wfname), "%s.%s.spl", fnames[0],
        spin.si_ascii ? (char_u *)"ascii" : spell_enc());


 if (strstr((char *)gettail(wfname), ".ascii.") != ((void *)0))
     spin.si_ascii = 1;


 if (strstr((char *)gettail(wfname), ".add.") != ((void *)0))
     spin.si_add = 1;
    }

    if (incount <= 0)
 emsg((char_u *)(((char *)(e_invarg))));
    else if (vim_strchr(gettail(wfname), '_') != ((void *)0))
 emsg((char_u *)(((char *)("E751: Output file name must not have region name"))));
    else if (incount > 8)
 emsg((char_u *)(((char *)("E754: Only up to 8 regions supported"))));
    else
    {


 if (!overwrite && stat(((char *)wfname), (&st)) >= 0)
 {
     emsg((char_u *)(((char *)(e_exists))));
     return;
 }
 if (mch_isdir(wfname))
 {
     emsg2((char_u *)(((char *)(e_isadir2))), (char_u *)(wfname));
     return;
 }





 for (i = 0; i < incount; ++i)
 {
     afile[i] = ((void *)0);

     if (incount > 1)
     {
  len = (int)strlen((char *)(innames[i]));
  if (strlen((char *)(gettail(innames[i]))) < 5
      || innames[i][len - 3] != '_')
  {
      emsg2((char_u *)(((char *)("E755: Invalid region in %s"))), (char_u *)(innames[i]));
      return;
  }
  spin.si_region_name[i * 2] = (((innames[i][len - 2]) < 'A' || (innames[i][len - 2]) > 'Z') ? (innames[i][len - 2]) : (innames[i][len - 2]) + ('a' - 'A'));
  spin.si_region_name[i * 2 + 1] =
          (((innames[i][len - 1]) < 'A' || (innames[i][len - 1]) > 'Z') ? (innames[i][len - 1]) : (innames[i][len - 1]) + ('a' - 'A'));
     }
 }
 spin.si_region_count = incount;

 spin.si_foldroot = wordtree_alloc(&spin);
 spin.si_keeproot = wordtree_alloc(&spin);
 spin.si_prefroot = wordtree_alloc(&spin);
 if (spin.si_foldroot == ((void *)0)
  || spin.si_keeproot == ((void *)0)
  || spin.si_prefroot == ((void *)0))
 {
     free_blocks(spin.si_blocks);
     return;
 }






 if (!spin.si_add)
     spin.si_clear_chartab = 1;






 for (i = 0; i < incount && !error; ++i)
 {
     spin.si_conv.vc_type = 0;
     spin.si_region = 1 << i;

     vim_snprintf((char *)fname, sizeof(fname), "%s.aff", innames[i]);
     if (stat(((char *)fname), (&st)) >= 0)
     {


  afile[i] = spell_read_aff(&spin, fname);
  if (afile[i] == ((void *)0))
      error = 1;
  else
  {

      vim_snprintf((char *)fname, sizeof(fname), "%s.dic",
          innames[i]);
      if (spell_read_dic(&spin, fname, afile[i]) == 0)
   error = 1;
  }
     }
     else
     {


  if (spell_read_wordfile(&spin, innames[i]) == 0)
      error = 1;
     }





 }

 if (spin.si_compflags != ((void *)0) && spin.si_nobreak)
     msg((char_u *)(((char *)("Warning: both compounding and NOBREAK specified"))));

 if (!error && !got_int)
 {



     spell_message(&spin, (char_u *)((char *)(msg_compressing)));
     wordtree_compress(&spin, spin.si_foldroot);
     wordtree_compress(&spin, spin.si_keeproot);
     wordtree_compress(&spin, spin.si_prefroot);
 }

 if (!error && !got_int)
 {



     vim_snprintf((char *)IObuff, (1024+1),
          ((char *)("Writing spell file %s ...")), wfname);
     spell_message(&spin, IObuff);

     error = write_vim_spell(&spin, wfname) == 0;

     spell_message(&spin, (char_u *)((char *)("Done!")));
     vim_snprintf((char *)IObuff, (1024+1),
   ((char *)("Estimated runtime memory use: %d bytes")), spin.si_memtot);
     spell_message(&spin, IObuff);




     if (!error)
  spell_reload_one(wfname, added_word);
 }


 ga_clear(&spin.si_rep);
 ga_clear(&spin.si_repsal);
 ga_clear(&spin.si_sal);
 ga_clear(&spin.si_map);
 ga_clear(&spin.si_comppat);
 ga_clear(&spin.si_prefcond);
 hash_clear_all(&spin.si_commonwords, 0);


 for (i = 0; i < incount; ++i)
     if (afile[i] != ((void *)0))
  spell_free_aff(afile[i]);


 free_blocks(spin.si_blocks);





 if (spin.si_sugtime != 0 && !error && !got_int)
     spell_make_sugfile(&spin, wfname);

    }
}





    static void
spell_message(spin, str)
    spellinfo_T *spin;
    char_u *str;
{
    if (spin->si_verbose || p_verbose > 2)
    {
 if (!spin->si_verbose)
     verbose_enter();
 msg((char_u *)(str));
 out_flush();
 if (!spin->si_verbose)
     verbose_leave();
    }
}






    void
ex_spell(eap)
    exarg_T *eap;
{
    spell_add_word(eap->arg, (int)strlen((char *)(eap->arg)), eap->cmdidx == CMD_spellwrong,
       eap->forceit ? 0 : (int)eap->line2,
       eap->cmdidx == CMD_spellundo);
}




    void
spell_add_word(word, len, bad, idx, undo)
    char_u *word;
    int len;
    int bad;
    int idx;

    int undo;
{
    FILE *fd = ((void *)0);
    buf_T *buf = ((void *)0);
    int new_spf = 0;
    char_u *fname;
    char_u fnamebuf[1024];
    char_u line[250 * 2];
    long fpos, fpos_next = 0;
    int i;
    char_u *spf;

    if (idx == 0)
    {
 if (int_wordlist == ((void *)0))
 {
     int_wordlist = vim_tempname('s');
     if (int_wordlist == ((void *)0))
  return;
 }
 fname = int_wordlist;
    }
    else
    {

 if (*curwin->w_s->b_p_spf == '\000')
 {
     init_spellfile();
     new_spf = 1;
 }

 if (*curwin->w_s->b_p_spf == '\000')
 {
     emsg2((char_u *)(((char *)(e_notset))), (char_u *)("spellfile"));
     return;
 }

 for (spf = curwin->w_s->b_p_spf, i = 1; *spf != '\000'; ++i)
 {
     copy_option_part(&spf, fnamebuf, 1024, ",");
     if (i == idx)
  break;
     if (*spf == '\000')
     {
  emsgn((char_u *)(((char *)("E765: 'spellfile' does not have %ld entries"))), (long)(idx));
  return;
     }
 }


 buf = buflist_findname_exp(fnamebuf);
 if (buf != ((void *)0) && buf->b_ml.ml_mfp == ((void *)0))
     buf = ((void *)0);
 if (buf != ((void *)0) && bufIsChanged(buf))
 {
     emsg((char_u *)(((char *)(e_bufloaded))));
     return;
 }

 fname = fnamebuf;
    }

    if (bad || undo)
    {


 fd = fopen(((char *)fname), ("r"));
 if (fd != ((void *)0))
 {
     while (!vim_fgets(line, 250 * 2, fd))
     {
  fpos = fpos_next;
  fpos_next = ftell(fd);
  if (strncmp((char *)(word), (char *)(line), (size_t)(len)) == 0
   && (line[len] == '/' || line[len] < ' '))
  {



      fclose(fd);
      fd = fopen(((char *)fname), ("r+"));
      if (fd == ((void *)0))
   break;
      if (fseek(fd, fpos, 0) == 0)
      {
   fputc('#', fd);
   if (undo)
   {
       home_replace(((void *)0), fname, NameBuff, 1024, 1);
       smsg((char_u *)((char *)("Word removed from %s")), NameBuff);
   }
      }
      fseek(fd, fpos_next, 0);
  }
     }
     if (fd != ((void *)0))
  fclose(fd);
 }
    }

    if (!undo)
    {
 fd = fopen(((char *)fname), ("a"));
 if (fd == ((void *)0) && new_spf)
 {
     char_u *p;





     if (!dir_of_file_exists(fname) && (p = gettail_sep(fname)) != fname)
     {
  int c = *p;



  *p = '\000';
  mkdir((char *)(fname), 0755);
  *p = c;
  fd = fopen(((char *)fname), ("a"));
     }
 }

 if (fd == ((void *)0))
     emsg2((char_u *)(((char *)(e_notopen))), (char_u *)(fname));
 else
 {
     if (bad)
  fprintf(fd, "%.*s/!\n", len, word);
     else
  fprintf(fd, "%.*s\n", len, word);
     fclose(fd);

     home_replace(((void *)0), fname, NameBuff, 1024, 1);
     smsg((char_u *)((char *)("Word added to %s")), NameBuff);
 }
    }

    if (fd != ((void *)0))
    {

 mkspell(1, &fname, 0, 1, 1);


 if (buf != ((void *)0))
     buf_reload(buf, buf->b_orig_mode);

 redraw_all_later(35);
    }
}




    static void
init_spellfile()
{
    char_u buf[1024];
    int l;
    char_u *fname;
    char_u *rtp;
    char_u *lend;
    int aspath = 0;
    char_u *lstart = curbuf->b_s.b_p_spl;

    if (*curwin->w_s->b_p_spl != '\000' && curwin->w_s->b_langp.ga_len > 0)
    {


 for (lend = curwin->w_s->b_p_spl; *lend != '\000'
   && vim_strchr((char_u *)",._", *lend) == ((void *)0); ++lend)
     if (vim_ispathsep(*lend))
     {
  aspath = 1;
  lstart = lend + 1;
     }



 rtp = p_rtp;
 while (*rtp != '\000')
 {
     if (aspath)


  vim_strncpy(buf, curbuf->b_s.b_p_spl, lstart - curbuf->b_s.b_p_spl - 1);
     else

  copy_option_part(&rtp, buf, 1024, ",");
     if (filewritable(buf) == 2)
     {


  if (aspath)
      vim_strncpy(buf, curbuf->b_s.b_p_spl, lend - curbuf->b_s.b_p_spl);
  else
  {

      l = (int)strlen((char *)(buf));
      vim_snprintf((char *)buf + l, 1024 - l, "/spell");
      if (!filewritable(buf) != 2)
   mkdir((char *)(buf), 0755);

      l = (int)strlen((char *)(buf));
      vim_snprintf((char *)buf + l, 1024 - l,
     "/%.*s", (int)(lend - lstart), lstart);
  }
  l = (int)strlen((char *)(buf));
  fname = (((langp_T *)(curwin->w_s->b_langp).ga_data) + (0))->lp_slang->sl_fname;
  vim_snprintf((char *)buf + l, 1024 - l, ".%s.add",
   fname != ((void *)0)
     && strstr((char *)gettail(fname), ".ascii.") != ((void *)0)
           ? (char_u *)"ascii" : spell_enc());
  set_option_value((char_u *)"spellfile", 0L, buf, 4);
  break;
     }
     aspath = 0;
 }
    }
}






    static void
clear_spell_chartab(sp)
    spelltab_T *sp;
{
    int i;


    ((__builtin_object_size ((sp->st_isw), 0) != (size_t) -1) ? __builtin___memset_chk ((sp->st_isw), (0), (sizeof(sp->st_isw)), __builtin_object_size ((sp->st_isw), 0)) : __inline_memset_chk ((sp->st_isw), (0), (sizeof(sp->st_isw))));
    ((__builtin_object_size ((sp->st_isu), 0) != (size_t) -1) ? __builtin___memset_chk ((sp->st_isu), (0), (sizeof(sp->st_isu)), __builtin_object_size ((sp->st_isu), 0)) : __inline_memset_chk ((sp->st_isu), (0), (sizeof(sp->st_isu))));
    for (i = 0; i < 256; ++i)
    {
 sp->st_fold[i] = i;
 sp->st_upper[i] = i;
    }



    for (i = '0'; i <= '9'; ++i)
 sp->st_isw[i] = 1;
    for (i = 'A'; i <= 'Z'; ++i)
    {
 sp->st_isw[i] = 1;
 sp->st_isu[i] = 1;
 sp->st_fold[i] = i + 0x20;
    }
    for (i = 'a'; i <= 'z'; ++i)
    {
 sp->st_isw[i] = 1;
 sp->st_upper[i] = i - 0x20;
    }
}
# 9613 "spell.c"
    void
init_spell_chartab()
{
    int i;

    did_set_spelltab = 0;
    clear_spell_chartab(&spelltab);
# 9646 "spell.c"
    {

 for (i = 128; i < 256; ++i)
 {
     if (isupper(i))
     {
  spelltab.st_isw[i] = 1;
  spelltab.st_isu[i] = 1;
  spelltab.st_fold[i] = tolower(i);
     }
     else if (islower(i))
     {
  spelltab.st_isw[i] = 1;
  spelltab.st_upper[i] = toupper(i);
     }
 }
    }
}




    static int
set_spell_chartab(fol, low, upp)
    char_u *fol;
    char_u *low;
    char_u *upp;
{


    spelltab_T new_st;
    char_u *pf = fol, *pl = low, *pu = upp;
    int f, l, u;

    clear_spell_chartab(&new_st);

    while (*pf != '\000')
    {
 if (*pl == '\000' || *pu == '\000')
 {
     emsg((char_u *)(((char *)(e_affform))));
     return 0;
 }





 f = *pf++;
 l = *pl++;
 u = *pu++;


 if (f < 256)
     new_st.st_isw[f] = 1;
 if (l < 256)
     new_st.st_isw[l] = 1;
 if (u < 256)
     new_st.st_isw[u] = 1;



 if (l < 256 && l != f)
 {
     if (f >= 256)
     {
  emsg((char_u *)(((char *)(e_affrange))));
  return 0;
     }
     new_st.st_fold[l] = f;
 }




 if (u < 256 && u != f)
 {
     if (f >= 256)
     {
  emsg((char_u *)(((char *)(e_affrange))));
  return 0;
     }
     new_st.st_fold[u] = f;
     new_st.st_isu[u] = 1;
     new_st.st_upper[f] = u;
 }
    }

    if (*pl != '\000' || *pu != '\000')
    {
 emsg((char_u *)(((char *)(e_affform))));
 return 0;
    }

    return set_spell_finish(&new_st);
}




    static void
set_spell_charflags(flags, cnt, fol)
    char_u *flags;
    int cnt;
    char_u *fol;
{


    spelltab_T new_st;
    int i;
    char_u *p = fol;
    int c;

    clear_spell_chartab(&new_st);

    for (i = 0; i < 128; ++i)
    {
 if (i < cnt)
 {
     new_st.st_isw[i + 128] = (flags[i] & 0x01) != 0;
     new_st.st_isu[i + 128] = (flags[i] & 0x02) != 0;
 }

 if (*p != '\000')
 {



     c = *p++;

     new_st.st_fold[i + 128] = c;
     if (i + 128 != c && new_st.st_isu[i + 128] && c < 256)
  new_st.st_upper[c] = i + 128;
 }
    }

    (void)set_spell_finish(&new_st);
}

    static int
set_spell_finish(new_st)
    spelltab_T *new_st;
{
    int i;

    if (did_set_spelltab)
    {

 for (i = 0; i < 256; ++i)
 {
     if (spelltab.st_isw[i] != new_st->st_isw[i]
      || spelltab.st_isu[i] != new_st->st_isu[i]
      || spelltab.st_fold[i] != new_st->st_fold[i]
      || spelltab.st_upper[i] != new_st->st_upper[i])
     {
  emsg((char_u *)(((char *)("E763: Word characters differ between spell files"))));
  return 0;
     }
 }
    }
    else
    {

 spelltab = *new_st;
 did_set_spelltab = 1;
    }

    return 1;
}







    static int
spell_iswordp(p, wp)
    char_u *p;
    win_T *wp;
{
# 9864 "spell.c"
    return spelltab.st_isw[wp->w_s->b_spell_ismw[*p] ? p[1] : p[0]];
}





    static int
spell_iswordp_nmw(p)
    char_u *p;
{
# 9886 "spell.c"
    return spelltab.st_isw[*p];
}
# 9936 "spell.c"
    static int
write_spell_prefcond(fd, gap)
    FILE *fd;
    garray_T *gap;
{
    int i;
    char_u *p;
    int len;
    int totlen;
    size_t x = 1;

    if (fd != ((void *)0))
 put_bytes(fd, (long_u)gap->ga_len, 2);

    totlen = 2 + gap->ga_len;

    for (i = 0; i < gap->ga_len; ++i)
    {

 p = ((char_u **)gap->ga_data)[i];
 if (p != ((void *)0))
 {
     len = (int)strlen((char *)(p));
     if (fd != ((void *)0))
     {
  fputc(len, fd);
  x &= fwrite(p, (size_t)len, (size_t)1, fd);
     }
     totlen += len;
 }
 else if (fd != ((void *)0))
     fputc(0, fd);
    }

    return totlen;
}







    static int
spell_casefold(str, len, buf, buflen)
    char_u *str;
    int len;
    char_u *buf;
    int buflen;
{
    int i;

    if (len >= buflen)
    {
 buf[0] = '\000';
 return 0;
    }
# 10016 "spell.c"
    {

 for (i = 0; i < len; ++i)
     buf[i] = spelltab.st_fold[str[i]];
 buf[i] = '\000';
    }

    return 1;
}






static int sps_flags = 1;
static int sps_limit = 9999;





    int
spell_check_sps()
{
    char_u *p;
    char_u *s;
    char_u buf[1024];
    int f;

    sps_flags = 0;
    sps_limit = 9999;

    for (p = p_sps; *p != '\000'; )
    {
 copy_option_part(&p, buf, 1024, ",");

 f = 0;
 if (((*buf) >= '0' && (*buf) <= '9'))
 {
     s = buf;
     sps_limit = getdigits(&s);
     if (*s != '\000' && !((*s) >= '0' && (*s) <= '9'))
  f = -1;
 }
 else if (strcmp((char *)(buf), (char *)("best")) == 0)
     f = 1;
 else if (strcmp((char *)(buf), (char *)("fast")) == 0)
     f = 2;
 else if (strcmp((char *)(buf), (char *)("double")) == 0)
     f = 4;
 else if (strncmp((char *)(buf), (char *)("expr:"), (size_t)(5)) != 0
  && strncmp((char *)(buf), (char *)("file:"), (size_t)(5)) != 0)
     f = -1;

 if (f == -1 || (sps_flags != 0 && f != 0))
 {
     sps_flags = 1;
     sps_limit = 9999;
     return 0;
 }
 if (f != 0)
     sps_flags = f;
    }

    if (sps_flags == 0)
 sps_flags = 1;

    return 1;
}







    void
spell_suggest(count)
    int count;
{
    char_u *line;
    pos_T prev_cursor = curwin->w_cursor;
    char_u wcopy[250 + 2];
    char_u *p;
    int i;
    int c;
    suginfo_T sug;
    suggest_T *stp;
    int mouse_used;
    int need_cap;
    int limit;
    int selected = count;
    int badlen = 0;
    int msg_scroll_save = msg_scroll;

    if (no_spell_checking(curwin))
 return;


    if (VIsual_active)
    {


 if (curwin->w_cursor.lnum != VIsual.lnum)
 {
     vim_beep();
     return;
 }
 badlen = (int)curwin->w_cursor.col - (int)VIsual.col;
 if (badlen < 0)
     badlen = -badlen;
 else
     curwin->w_cursor.col = VIsual.col;
 ++badlen;
 end_visual_mode();
    }
    else


 if (spell_move_to(curwin, 1, 1, 1, ((void *)0)) == 0
     || curwin->w_cursor.col > prev_cursor.col)
    {


 curwin->w_cursor = prev_cursor;
 line = ml_get_curline();
 p = line + curwin->w_cursor.col;

 while (p > line && spell_iswordp_nmw(p))
     --p;

 while (*p != '\000' && !spell_iswordp_nmw(p))
     ++p;

 if (!spell_iswordp_nmw(p))
 {
     beep_flush();
     return;
 }
 curwin->w_cursor.col = (colnr_T)(p - line);
    }




    need_cap = check_need_cap(curwin->w_cursor.lnum, curwin->w_cursor.col);


    line = vim_strsave(ml_get_curline());
    if (line == ((void *)0))
 goto skip;



    if (sps_limit > (int)Rows - 2)
 limit = (int)Rows - 2;
    else
 limit = sps_limit;
    spell_find_suggest(line + curwin->w_cursor.col, badlen, &sug, limit,
       1, need_cap, 1);

    if (sug.su_ga.ga_len == 0)
 msg((char_u *)(((char *)("Sorry, no suggestions"))));
    else if (count > 0)
    {
 if (count > sug.su_ga.ga_len)
     smsg((char_u *)((char *)("Sorry, only %ld suggestions")),
            (long)sug.su_ga.ga_len);
    }
    else
    {
 vim_free(repl_from);
 repl_from = ((void *)0);
 vim_free(repl_to);
 repl_to = ((void *)0);
# 10201 "spell.c"
 msg_start();
 msg_row = Rows - 1;
 lines_left = Rows;
 vim_snprintf((char *)IObuff, (1024+1), ((char *)("Change \"%.*s\" to:")),
      sug.su_badlen, sug.su_badptr);
# 10215 "spell.c"
 msg_puts(IObuff);
 msg_clr_eos();
 msg_putchar('\n');

 msg_scroll = 1;
 for (i = 0; i < sug.su_ga.ga_len; ++i)
 {
     stp = &(((suggest_T *)(sug.su_ga).ga_data)[i]);



     ((__builtin_object_size ((char *)(wcopy), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(wcopy), (char *)(stp->st_word), __builtin_object_size ((char *)(wcopy), 1 > 1)) : __inline_strcpy_chk ((char *)(wcopy), (char *)(stp->st_word)));
     if (sug.su_badlen > stp->st_orglen)
  vim_strncpy(wcopy + stp->st_wordlen,
            sug.su_badptr + stp->st_orglen,
           sug.su_badlen - stp->st_orglen);
     vim_snprintf((char *)IObuff, (1024+1), "%2d", i + 1);




     msg_puts(IObuff);

     vim_snprintf((char *)IObuff, (1024+1), " \"%s\"", wcopy);
     msg_puts(IObuff);


     if (sug.su_badlen < stp->st_orglen)
     {
  vim_snprintf((char *)IObuff, (1024+1), ((char *)(" < \"%.*s\"")),
            stp->st_orglen, sug.su_badptr);
  msg_puts(IObuff);
     }

     if (p_verbose > 0)
     {

  if (sps_flags & (4 | 1))
      vim_snprintf((char *)IObuff, (1024+1), " (%s%d - %d)",
   stp->st_salscore ? "s " : "",
   stp->st_score, stp->st_altscore);
  else
      vim_snprintf((char *)IObuff, (1024+1), " (%d)",
       stp->st_score);





  msg_advance(30);
  msg_puts(IObuff);
     }
     msg_putchar('\n');
 }






 selected = prompt_for_number(&mouse_used);
 if (mouse_used)
     selected -= lines_left;
 lines_left = Rows;

 msg_scroll = msg_scroll_save;
    }

    if (selected > 0 && selected <= sug.su_ga.ga_len && u_save_cursor() == 1)
    {

 stp = &(((suggest_T *)(sug.su_ga).ga_data)[selected - 1]);
 if (sug.su_badlen > stp->st_orglen)
 {


     repl_from = vim_strnsave(sug.su_badptr, sug.su_badlen);
     vim_snprintf((char *)IObuff, (1024+1), "%s%.*s", stp->st_word,
      sug.su_badlen - stp->st_orglen,
           sug.su_badptr + stp->st_orglen);
     repl_to = vim_strsave(IObuff);
 }
 else
 {

     repl_from = vim_strnsave(sug.su_badptr, stp->st_orglen);
     repl_to = vim_strsave(stp->st_word);
 }


 p = alloc((unsigned)strlen((char *)(line)) - stp->st_orglen
             + stp->st_wordlen + 1);
 if (p != ((void *)0))
 {
     c = (int)(sug.su_badptr - line);
     ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(p), (char *)(line), c, __builtin_object_size ((char *)(p), 0)) : __inline_memmove_chk ((char *)(p), (char *)(line), c));
     ((__builtin_object_size ((char *)(p + c), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(p + c), (char *)(stp->st_word), __builtin_object_size ((char *)(p + c), 1 > 1)) : __inline_strcpy_chk ((char *)(p + c), (char *)(stp->st_word)));
     ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(p), (char *)(sug.su_badptr + stp->st_orglen), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcat_chk ((char *)(p), (char *)(sug.su_badptr + stp->st_orglen)));
     ml_replace(curwin->w_cursor.lnum, p, 0);
     curwin->w_cursor.col = c;


     ResetRedobuff();
     AppendToRedobuff((char_u *)"ciw");
     AppendToRedobuffLit(p + c,
       stp->st_wordlen + sug.su_badlen - stp->st_orglen);
     AppendCharToRedobuff('\033');


     changed_bytes(curwin->w_cursor.lnum, c);
 }
    }
    else
 curwin->w_cursor = prev_cursor;

    spell_find_cleanup(&sug);
skip:
    vim_free(line);
}





    static int
check_need_cap(lnum, col)
    linenr_T lnum;
    colnr_T col;
{
    int need_cap = 0;
    char_u *line;
    char_u *line_copy = ((void *)0);
    char_u *p;
    colnr_T endcol;
    regmatch_T regmatch;

    if (curwin->w_s->b_cap_prog == ((void *)0))
 return 0;

    line = ml_get_curline();
    endcol = 0;
    if ((int)(skipwhite(line) - line) >= (int)col)
    {


 if (lnum == 1)
     need_cap = 1;
 else
 {
     line = ml_get(lnum - 1);
     if (*skipwhite(line) == '\000')
  need_cap = 1;
     else
     {

  line_copy = concat_str(line, (char_u *)" ");
  line = line_copy;
  endcol = (colnr_T)strlen((char *)(line));
     }
 }
    }
    else
 endcol = col;

    if (endcol > 0)
    {

 regmatch.regprog = curwin->w_s->b_cap_prog;
 regmatch.rm_ic = 0;
 p = line + endcol;
 for (;;)
 {
     --p;
     if (p == line || spell_iswordp_nmw(p))
  break;
     if (vim_regexec(&regmatch, p, 0)
      && regmatch.endp[0] == line + endcol)
     {
  need_cap = 1;
  break;
     }
 }
    }

    vim_free(line_copy);

    return need_cap;
}





    void
ex_spellrepall(eap)
    exarg_T *eap __attribute__((unused));
{
    pos_T pos = curwin->w_cursor;
    char_u *frompat;
    int addlen;
    char_u *line;
    char_u *p;
    int save_ws = p_ws;
    linenr_T prev_lnum = 0;

    if (repl_from == ((void *)0) || repl_to == ((void *)0))
    {
 emsg((char_u *)(((char *)("E752: No previous spell replacement"))));
 return;
    }
    addlen = (int)(strlen((char *)(repl_to)) - strlen((char *)(repl_from)));

    frompat = alloc((unsigned)strlen((char *)(repl_from)) + 7);
    if (frompat == ((void *)0))
 return;
    __builtin___sprintf_chk ((char *)frompat, 0, __builtin_object_size ((char *)frompat, 1 > 1), "\\V\\<%s\\>", repl_from);
    p_ws = 0;

    sub_nsubs = 0;
    sub_nlines = 0;
    curwin->w_cursor.lnum = 0;
    while (!got_int)
    {
 if (do_search(((void *)0), '/', frompat, 1L, 0x400, ((void *)0)) == 0
         || u_save_cursor() == 0)
     break;



 line = ml_get_curline();
 if (addlen <= 0 || strncmp((char *)(line + curwin->w_cursor.col), (char *)(repl_to), (size_t)(strlen((char *)(repl_to)))) != 0)

 {
     p = alloc((unsigned)strlen((char *)(line)) + addlen + 1);
     if (p == ((void *)0))
  break;
     ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(p), (char *)(line), curwin->w_cursor.col, __builtin_object_size ((char *)(p), 0)) : __inline_memmove_chk ((char *)(p), (char *)(line), curwin->w_cursor.col));
     ((__builtin_object_size ((char *)(p + curwin->w_cursor.col), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(p + curwin->w_cursor.col), (char *)(repl_to), __builtin_object_size ((char *)(p + curwin->w_cursor.col), 1 > 1)) : __inline_strcpy_chk ((char *)(p + curwin->w_cursor.col), (char *)(repl_to)));
     ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(p), (char *)(line + curwin->w_cursor.col + strlen((char *)(repl_from))), __builtin_object_size ((char *)(p), 1 > 1)) : __inline_strcat_chk ((char *)(p), (char *)(line + curwin->w_cursor.col + strlen((char *)(repl_from)))));
     ml_replace(curwin->w_cursor.lnum, p, 0);
     changed_bytes(curwin->w_cursor.lnum, curwin->w_cursor.col);

     if (curwin->w_cursor.lnum != prev_lnum)
     {
  ++sub_nlines;
  prev_lnum = curwin->w_cursor.lnum;
     }
     ++sub_nsubs;
 }
 curwin->w_cursor.col += (colnr_T)strlen((char *)(repl_to));
    }

    p_ws = save_ws;
    curwin->w_cursor = pos;
    vim_free(frompat);

    if (sub_nsubs == 0)
 emsg2((char_u *)(((char *)("E753: Not found: %s"))), (char_u *)(repl_from));
    else
 do_sub_msg(0);
}





    void
spell_suggest_list(gap, word, maxcount, need_cap, interactive)
    garray_T *gap;
    char_u *word;
    int maxcount;
    int need_cap;
    int interactive;
{
    suginfo_T sug;
    int i;
    suggest_T *stp;
    char_u *wcopy;

    spell_find_suggest(word, 0, &sug, maxcount, 0, need_cap, interactive);


    ga_init2(gap, sizeof(char_u *), sug.su_ga.ga_len + 1);
    if (ga_grow(gap, sug.su_ga.ga_len) == 1)
    {
 for (i = 0; i < sug.su_ga.ga_len; ++i)
 {
     stp = &(((suggest_T *)(sug.su_ga).ga_data)[i]);



     wcopy = alloc(stp->st_wordlen
        + (unsigned)strlen((char *)(sug.su_badptr + stp->st_orglen)) + 1);
     if (wcopy == ((void *)0))
  break;
     ((__builtin_object_size ((char *)(wcopy), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(wcopy), (char *)(stp->st_word), __builtin_object_size ((char *)(wcopy), 1 > 1)) : __inline_strcpy_chk ((char *)(wcopy), (char *)(stp->st_word)));
     ((__builtin_object_size ((char *)(wcopy + stp->st_wordlen), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(wcopy + stp->st_wordlen), (char *)(sug.su_badptr + stp->st_orglen), __builtin_object_size ((char *)(wcopy + stp->st_wordlen), 1 > 1)) : __inline_strcpy_chk ((char *)(wcopy + stp->st_wordlen), (char *)(sug.su_badptr + stp->st_orglen)));
     ((char_u **)gap->ga_data)[gap->ga_len++] = wcopy;
 }
    }

    spell_find_cleanup(&sug);
}
# 10526 "spell.c"
    static void
spell_find_suggest(badptr, badlen, su, maxcount, banbadword, need_cap, interactive)
    char_u *badptr;
    int badlen;
    suginfo_T *su;
    int maxcount;
    int banbadword;
    int need_cap;
    int interactive;
{
    hlf_T attr = HLF_COUNT;
    char_u buf[1024];
    char_u *p;
    int do_combine = 0;
    char_u *sps_copy;

    static int expr_busy = 0;

    int c;
    int i;
    langp_T *lp;




    ((__builtin_object_size ((su), 0) != (size_t) -1) ? __builtin___memset_chk ((su), (0), (sizeof(suginfo_T)), __builtin_object_size ((su), 0)) : __inline_memset_chk ((su), (0), (sizeof(suginfo_T))));
    ga_init2(&su->su_ga, (int)sizeof(suggest_T), 10);
    ga_init2(&su->su_sga, (int)sizeof(suggest_T), 10);
    if (*badptr == '\000')
 return;
    hash_init(&su->su_banned);

    su->su_badptr = badptr;
    if (badlen != 0)
 su->su_badlen = badlen;
    else
 su->su_badlen = spell_check(curwin, su->su_badptr, &attr, ((void *)0), 0);
    su->su_maxcount = maxcount;
    su->su_maxscore = 350;

    if (su->su_badlen >= 250)
 su->su_badlen = 250 - 1;
    vim_strncpy(su->su_badword, su->su_badptr, su->su_badlen);
    (void)spell_casefold(su->su_badptr, su->su_badlen,
          su->su_fbadword, 250);

    su->su_badflags = badword_captype(su->su_badptr,
            su->su_badptr + su->su_badlen);
    if (need_cap)
 su->su_badflags |= 0x02;





    for (i = 0; i < curbuf->b_s.b_langp.ga_len; ++i)
    {
 lp = (((langp_T *)(curbuf->b_s.b_langp).ga_data) + (i));
 if (lp->lp_sallang != ((void *)0))
 {
     su->su_sallang = lp->lp_sallang;
     break;
 }
    }



    if (su->su_sallang != ((void *)0))
 spell_soundfold(su->su_sallang, su->su_fbadword, 1,
         su->su_sal_badword);




    c = ((int)*(su->su_badptr));
    if (!((c) < 256 ? spelltab.st_isu[c] : 0) && attr == HLF_COUNT)
    {
 make_case_word(su->su_badword, buf, 0x02);
 add_suggestion(su, &su->su_ga, buf, su->su_badlen, 52,
           0, 1, su->su_sallang, 0);
    }


    if (banbadword)
 add_banned(su, su->su_badword);


    sps_copy = vim_strsave(p_sps);
    if (sps_copy == ((void *)0))
 return;


    for (p = sps_copy; *p != '\000'; )
    {
 copy_option_part(&p, buf, 1024, ",");

 if (strncmp((char *)(buf), (char *)("expr:"), (size_t)(5)) == 0)
 {



     if (!expr_busy)
     {
  expr_busy = 1;
  spell_suggest_expr(su, buf + 5);
  expr_busy = 0;
     }

 }
 else if (strncmp((char *)(buf), (char *)("file:"), (size_t)(5)) == 0)

     spell_suggest_file(su, buf + 5);
 else
 {

     spell_suggest_intern(su, interactive);
     if (sps_flags & 4)
  do_combine = 1;
 }
    }

    vim_free(sps_copy);

    if (do_combine)


 score_combine(su);
}





    static void
spell_suggest_expr(su, expr)
    suginfo_T *su;
    char_u *expr;
{
    list_T *list;
    listitem_T *li;
    int score;
    char_u *p;




    list = eval_spell_expr(su->su_badword, expr);
    if (list != ((void *)0))
    {

 for (li = list->lv_first; li != ((void *)0); li = li->li_next)
     if (li->li_tv.v_type == 4)
     {

  score = get_spellword(li->li_tv.vval.v_list, &p);
  if (score >= 0 && score <= su->su_maxscore)
      add_suggestion(su, &su->su_ga, p, su->su_badlen,
           score, 0, 1, su->su_sallang, 0);
     }
 list_unref(list);
    }


    check_suggestions(su, &su->su_ga);
    (void)cleanup_suggestions(&su->su_ga, su->su_maxscore, su->su_maxcount);
}





    static void
spell_suggest_file(su, fname)
    suginfo_T *su;
    char_u *fname;
{
    FILE *fd;
    char_u line[250 * 2];
    char_u *p;
    int len;
    char_u cword[250];


    fd = fopen(((char *)fname), ("r"));
    if (fd == ((void *)0))
    {
 emsg2((char_u *)(((char *)(e_notopen))), (char_u *)(fname));
 return;
    }


    while (!vim_fgets(line, 250 * 2, fd) && !got_int)
    {
 line_breakcheck();

 p = vim_strchr(line, '/');
 if (p == ((void *)0))
     continue;
 *p++ = '\000';
 if (strcasecmp((char *)(su->su_badword), (char *)(line)) == 0)
 {

     for (len = 0; p[len] >= ' '; ++len)
  ;
     p[len] = '\000';



     if (captype(p, ((void *)0)) == 0)
     {
  make_case_word(p, cword, su->su_badflags);
  p = cword;
     }

     add_suggestion(su, &su->su_ga, p, su->su_badlen,
      30, 0, 1, su->su_sallang, 0);
 }
    }

    fclose(fd);


    check_suggestions(su, &su->su_ga);
    (void)cleanup_suggestions(&su->su_ga, su->su_maxscore, su->su_maxcount);
}




    static void
spell_suggest_intern(su, interactive)
    suginfo_T *su;
    int interactive;
{



    suggest_load_files();







    suggest_try_special(su);





    suggest_try_change(su);


    if (sps_flags & 4)
 score_comp_sal(su);




    if ((sps_flags & 2) == 0)
    {
 if (sps_flags & 1)


     rescore_suggestions(su);
# 10803 "spell.c"
 suggest_try_soundalike_prep();
 su->su_maxscore = 200;
 su->su_sfmaxscore = 350 * 3;
 suggest_try_soundalike(su);
 if (su->su_ga.ga_len < ((su)->su_maxcount < 130 ? 150 : (su)->su_maxcount + 20))
 {


     su->su_maxscore = 300;
     suggest_try_soundalike(su);
     if (su->su_ga.ga_len < ((su)->su_maxcount < 130 ? 150 : (su)->su_maxcount + 20))
     {


  su->su_maxscore = 400;
  suggest_try_soundalike(su);
     }
 }
 su->su_maxscore = su->su_sfmaxscore;
 suggest_try_soundalike_finish();
    }



    ui_breakcheck();
    if (interactive && got_int)
    {
 (void)vgetc();
 got_int = 0;
    }

    if ((sps_flags & 4) == 0 && su->su_ga.ga_len != 0)
    {
 if (sps_flags & 1)

     rescore_suggestions(su);


 check_suggestions(su, &su->su_ga);
 (void)cleanup_suggestions(&su->su_ga, su->su_maxscore, su->su_maxcount);
    }
}




    static void
suggest_load_files()
{
    langp_T *lp;
    int lpi;
    slang_T *slang;
    char_u *dotp;
    FILE *fd;
    char_u buf[250];
    int i;
    time_t timestamp;
    int wcount;
    int wordnr;
    garray_T ga;
    int c;


    for (lpi = 0; lpi < curwin->w_s->b_langp.ga_len; ++lpi)
    {
 lp = (((langp_T *)(curwin->w_s->b_langp).ga_data) + (lpi));
 slang = lp->lp_slang;
 if (slang->sl_sugtime != 0 && !slang->sl_sugloaded)
 {



     slang->sl_sugloaded = 1;

     dotp = vim_strrchr(slang->sl_fname, '.');
     if (dotp == ((void *)0) || strcasecmp((char *)(((dotp))), (char *)(((".spl")))) != 0)
  continue;
     ((__builtin_object_size ((char *)(dotp), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(dotp), (char *)(".sug"), __builtin_object_size ((char *)(dotp), 1 > 1)) : __inline_strcpy_chk ((char *)(dotp), (char *)(".sug")));
     fd = fopen(((char *)slang->sl_fname), ("r"));
     if (fd == ((void *)0))
  goto nextone;




     for (i = 0; i < 6; ++i)
  buf[i] = getc(fd);
     if (strncmp((char *)(buf), (char *)("VIMsug"), (size_t)(6)) != 0)
     {
  emsg2((char_u *)(((char *)("E778: This does not look like a .sug file: %s"))), (char_u *)(slang->sl_fname));

  goto nextone;
     }
     c = getc(fd);
     if (c < 1)
     {
  emsg2((char_u *)(((char *)("E779: Old .sug file, needs to be updated: %s"))), (char_u *)(slang->sl_fname));

  goto nextone;
     }
     else if (c > 1)
     {
  emsg2((char_u *)(((char *)("E780: .sug file is for newer version of Vim: %s"))), (char_u *)(slang->sl_fname));

  goto nextone;
     }



     timestamp = get8ctime(fd);
     if (timestamp != slang->sl_sugtime)
     {
  emsg2((char_u *)(((char *)("E781: .sug file doesn't match .spl file: %s"))), (char_u *)(slang->sl_fname));

  goto nextone;
     }





     if (spell_read_tree(fd, &slang->sl_sbyts, &slang->sl_sidxs,
              0, 0) != 0)
     {
someerror:
  emsg2((char_u *)(((char *)("E782: error while reading .sug file: %s"))), (char_u *)(slang->sl_fname));

  slang_clear_sug(slang);
  goto nextone;
     }
# 10941 "spell.c"
     slang->sl_sugbuf = open_spellbuf();
     if (slang->sl_sugbuf == ((void *)0))
  goto someerror;

     wcount = get4c(fd);
     if (wcount < 0)
  goto someerror;



     ga_init2(&ga, 1, 100);
     for (wordnr = 0; wordnr < wcount; ++wordnr)
     {
  ga.ga_len = 0;
  for (;;)
  {
      c = getc(fd);
      if (c < 0 || ga_grow(&ga, 1) == 0)
   goto someerror;
      ((char_u *)ga.ga_data)[ga.ga_len++] = c;
      if (c == '\000')
   break;
  }
  if (ml_append_buf(slang->sl_sugbuf, (linenr_T)wordnr,
      ga.ga_data, ga.ga_len, 1) == 0)
      goto someerror;
     }
     ga_clear(&ga);





     tree_count_words(slang->sl_fbyts, slang->sl_fidxs);
     tree_count_words(slang->sl_sbyts, slang->sl_sidxs);

nextone:
     if (fd != ((void *)0))
  fclose(fd);
     ((__builtin_object_size ((char *)(dotp), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(dotp), (char *)(".spl"), __builtin_object_size ((char *)(dotp), 1 > 1)) : __inline_strcpy_chk ((char *)(dotp), (char *)(".spl")));
 }
    }
}






    static void
tree_count_words(byts, idxs)
    char_u *byts;
    idx_T *idxs;
{
    int depth;
    idx_T arridx[250];
    int curi[250];
    int c;
    idx_T n;
    int wordcount[250];

    arridx[0] = 0;
    curi[0] = 1;
    wordcount[0] = 0;
    depth = 0;
    while (depth >= 0 && !got_int)
    {
 if (curi[depth] > byts[arridx[depth]])
 {

     idxs[arridx[depth]] = wordcount[depth];
     if (depth > 0)
  wordcount[depth - 1] += wordcount[depth];

     --depth;
     fast_breakcheck();
 }
 else
 {

     n = arridx[depth] + curi[depth];
     ++curi[depth];

     c = byts[n];
     if (c == 0)
     {

  ++wordcount[depth];



  while (byts[n + 1] == 0)
  {
      ++n;
      ++curi[depth];
  }
     }
     else
     {

  ++depth;
  arridx[depth] = idxs[n];
  curi[depth] = 1;
  wordcount[depth] = 0;
     }
 }
    }
}




    static void
spell_find_cleanup(su)
    suginfo_T *su;
{
    int i;


    for (i = 0; i < su->su_ga.ga_len; ++i)
 vim_free((((suggest_T *)(su->su_ga).ga_data)[i]).st_word);
    ga_clear(&su->su_ga);
    for (i = 0; i < su->su_sga.ga_len; ++i)
 vim_free((((suggest_T *)(su->su_sga).ga_data)[i]).st_word);
    ga_clear(&su->su_sga);


    hash_clear_all(&su->su_banned, 0);
}






    static void
onecap_copy(word, wcopy, upper)
    char_u *word;
    char_u *wcopy;
    int upper;
{
    char_u *p;
    int c;
    int l;

    p = word;





 c = *p++;
    if (upper)
 c = ((c) < 256 ? (int)spelltab.st_upper[c] : (c));
    else
 c = ((c) < 256 ? (int)spelltab.st_fold[c] : (c));





    {
 l = 1;
 wcopy[0] = c;
    }
    vim_strncpy(wcopy + l, p, 250 - l - 1);
}





    static void
allcap_copy(word, wcopy)
    char_u *word;
    char_u *wcopy;
{
    char_u *s;
    char_u *d;
    int c;

    d = wcopy;
    for (s = word; *s != '\000'; )
    {





     c = *s++;
# 11144 "spell.c"
     c = ((c) < 256 ? (int)spelltab.st_upper[c] : (c));
# 11155 "spell.c"
 {
     if (d - wcopy >= 250 - 1)
  break;
     *d++ = c;
 }
    }
    *d = '\000';
}




    static void
suggest_try_special(su)
    suginfo_T *su;
{
    char_u *p;
    size_t len;
    int c;
    char_u word[250];




    p = skiptowhite(su->su_fbadword);
    len = p - su->su_fbadword;
    p = skipwhite(p);
    if (strlen((char *)(p)) == len && strncmp((char *)(su->su_fbadword), (char *)(p), (size_t)(len)) == 0)
    {


 c = su->su_fbadword[len];
 su->su_fbadword[len] = '\000';
 make_case_word(su->su_fbadword, word, su->su_badflags);
 su->su_fbadword[len] = c;



 add_suggestion(su, &su->su_ga, word, su->su_badlen,
         ((3 * 65 + 0) / 4), 0, 1, su->su_sallang, 0);
    }
}




    static void
suggest_try_change(su)
    suginfo_T *su;
{
    char_u fword[250];
    int n;
    char_u *p;
    int lpi;
    langp_T *lp;




    ((__builtin_object_size ((char *)(fword), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(fword), (char *)(su->su_fbadword), __builtin_object_size ((char *)(fword), 1 > 1)) : __inline_strcpy_chk ((char *)(fword), (char *)(su->su_fbadword)));
    n = (int)strlen((char *)(fword));
    p = su->su_badptr + su->su_badlen;
    (void)spell_casefold(p, (int)strlen((char *)(p)), fword + n, 250 - n);

    for (lpi = 0; lpi < curwin->w_s->b_langp.ga_len; ++lpi)
    {
 lp = (((langp_T *)(curwin->w_s->b_langp).ga_data) + (lpi));



 if (lp->lp_slang->sl_fbyts == ((void *)0))
     continue;


 suggest_trie_walk(su, lp, fword, 0);
    }
}
# 11268 "spell.c"
    static void
suggest_trie_walk(su, lp, fword, soundfold)
    suginfo_T *su;
    langp_T *lp;
    char_u *fword;
    int soundfold;
{
    char_u tword[250];
    trystate_T stack[250];
    char_u preword[250 * 3];




    char_u compflags[250];
    trystate_T *sp;
    int newscore;
    int score;
    char_u *byts, *fbyts, *pbyts;
    idx_T *idxs, *fidxs, *pidxs;
    int depth;
    int c, c2, c3;
    int n = 0;
    int flags;
    garray_T *gap;
    idx_T arridx;
    int len;
    char_u *p;
    fromto_T *ftp;
    int fl = 0, tl;
    int repextra = 0;
    slang_T *slang = lp->lp_slang;
    int fword_ends;
    int goodword_ends;




    int breakcheckcount = 1000;
    int compound_ok;







    depth = 0;
    sp = &stack[0];
    ((__builtin_object_size ((sp), 0) != (size_t) -1) ? __builtin___memset_chk ((sp), (0), (sizeof(trystate_T)), __builtin_object_size ((sp), 0)) : __inline_memset_chk ((sp), (0), (sizeof(trystate_T))));
    sp->ts_curi = 1;

    if (soundfold)
    {

 byts = fbyts = slang->sl_sbyts;
 idxs = fidxs = slang->sl_sidxs;
 pbyts = ((void *)0);
 pidxs = ((void *)0);
 sp->ts_prefixdepth = 0xff;
 sp->ts_state = STATE_START;
    }
    else
    {




 fbyts = slang->sl_fbyts;
 fidxs = slang->sl_fidxs;
 pbyts = slang->sl_pbyts;
 pidxs = slang->sl_pidxs;
 if (pbyts != ((void *)0))
 {
     byts = pbyts;
     idxs = pidxs;
     sp->ts_prefixdepth = 0xfe;
     sp->ts_state = STATE_NOPREFIX;
 }
 else
 {
     byts = fbyts;
     idxs = fidxs;
     sp->ts_prefixdepth = 0xff;
     sp->ts_state = STATE_START;
 }
    }
# 11363 "spell.c"
    while (depth >= 0 && !got_int)
    {
 sp = &stack[depth];
 switch (sp->ts_state)
 {
 case STATE_START:
 case STATE_NOPREFIX:




     arridx = sp->ts_arridx;
     len = byts[arridx];
     arridx += sp->ts_curi;

     if (sp->ts_prefixdepth == 0xfe)
     {

  for (n = 0; n < len && byts[arridx + n] == 0; ++n)
      ;
  sp->ts_curi += n;


  n = (int)sp->ts_state;
  sp->ts_state = STATE_ENDNUL;
  sp->ts_save_badflags = su->su_badflags;



  if (byts[arridx] == 0 || n == (int)STATE_NOPREFIX)
  {







   n = sp->ts_fidx;
      flags = badword_captype(su->su_badptr, su->su_badptr + n);
      su->su_badflags = badword_captype(su->su_badptr + n,
            su->su_badptr + su->su_badlen);



      go_deeper(stack, depth, 0);
      ++depth;
      sp = &stack[depth];
      sp->ts_prefixdepth = depth - 1;
      byts = fbyts;
      idxs = fidxs;
      sp->ts_arridx = 0;



      tword[sp->ts_twordlen] = '\000';
      make_case_word(tword + sp->ts_splitoff,
       preword + sp->ts_prewordlen, flags);
      sp->ts_prewordlen = (char_u)strlen((char *)(preword));
      sp->ts_splitoff = sp->ts_twordlen;
  }
  break;
     }

     if (sp->ts_curi > len || byts[arridx] != 0)
     {

  sp->ts_state = STATE_ENDNUL;
  sp->ts_save_badflags = su->su_badflags;
  break;
     }




     ++sp->ts_curi;

     flags = (int)idxs[arridx];


     if (flags & 0x0400)
  break;

     fword_ends = (fword[sp->ts_fidx] == '\000'
      || (soundfold
          ? ((fword[sp->ts_fidx]) == ' ' || (fword[sp->ts_fidx]) == '\t')
          : !spell_iswordp(fword + sp->ts_fidx, curwin)));
     tword[sp->ts_twordlen] = '\000';

     if (sp->ts_prefixdepth <= 0xfd
     && (sp->ts_flags & 1) == 0)
     {




  n = stack[sp->ts_prefixdepth].ts_arridx;
  len = pbyts[n++];
  for (c = 0; c < len && pbyts[n + c] == 0; ++c)
      ;
  if (c > 0)
  {
      c = valid_word_prefix(c, n, flags,
           tword + sp->ts_splitoff, slang, 0);
      if (c == 0)
   break;


      if (c & (0x01 << 24))
   flags |= 0x08;





      sp->ts_flags |= 1;
  }
     }



     if (sp->ts_complen == sp->ts_compsplit && fword_ends
           && (flags & 0x0200))
  goodword_ends = 0;
     else
  goodword_ends = 1;

     p = ((void *)0);
     compound_ok = 1;
     if (sp->ts_complen > sp->ts_compsplit)
     {
  if (slang->sl_nobreak)
  {




      if (sp->ts_fidx - sp->ts_splitfidx
       == sp->ts_twordlen - sp->ts_splitoff
       && strncmp((char *)(fword + sp->ts_splitfidx), (char *)(tword + sp->ts_splitoff), (size_t)(sp->ts_fidx - sp->ts_splitfidx)) == 0)


      {
   preword[sp->ts_prewordlen] = '\000';
   newscore = score_wordcount_adj(slang, sp->ts_score,
       preword + sp->ts_prewordlen,
       sp->ts_prewordlen > 0);

   if (newscore <= su->su_maxscore)
       add_suggestion(su, &su->su_ga, preword,
        sp->ts_splitfidx - repextra,
        newscore, 0, 0,
        lp->lp_sallang, 0);
   break;
      }
  }
  else
  {




      if (((unsigned)flags >> 24) == 0
       || sp->ts_twordlen - sp->ts_splitoff
             < slang->sl_compminlen)
   break;
# 11539 "spell.c"
      compflags[sp->ts_complen] = ((unsigned)flags >> 24);
      compflags[sp->ts_complen + 1] = '\000';
      vim_strncpy(preword + sp->ts_prewordlen,
       tword + sp->ts_splitoff,
       sp->ts_twordlen - sp->ts_splitoff);


      if (match_checkcompoundpattern(preword, sp->ts_prewordlen,
         &slang->sl_comppat))
   compound_ok = 0;

      if (compound_ok)
      {
   p = preword;
   while (*skiptowhite(p) != '\000')
       p = skipwhite(skiptowhite(p));
   if (fword_ends && !can_compound(slang, p,
      compflags + sp->ts_compsplit))


       compound_ok = 0;
      }


      p = preword + sp->ts_prewordlen;
      --p;
  }
     }






     if (soundfold)
  ((__builtin_object_size ((char *)(preword + sp->ts_prewordlen), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(preword + sp->ts_prewordlen), (char *)(tword + sp->ts_splitoff), __builtin_object_size ((char *)(preword + sp->ts_prewordlen), 1 > 1)) : __inline_strcpy_chk ((char *)(preword + sp->ts_prewordlen), (char *)(tword + sp->ts_splitoff)));
     else if (flags & 0x80)

  find_keepcap_word(slang, tword + sp->ts_splitoff,
       preword + sp->ts_prewordlen);
     else
     {



  c = su->su_badflags;
  if ((c & 0x04)



   && su->su_badlen == 1

   )
      c = 0x02;
  c |= flags;



  if (p != ((void *)0) && spell_iswordp_nmw(p))
      c &= ~0x02;
  make_case_word(tword + sp->ts_splitoff,
           preword + sp->ts_prewordlen, c);
     }

     if (!soundfold)
     {


  if (flags & 0x10)
  {
      add_banned(su, preword + sp->ts_prewordlen);
      break;
  }
  if ((sp->ts_complen == sp->ts_compsplit
       && (!((hash_find(&su->su_banned, preword + sp->ts_prewordlen))->hi_key == ((void *)0) || (hash_find(&su->su_banned, preword + sp->ts_prewordlen))->hi_key == &hash_removed)))
         || (!((hash_find(&su->su_banned, preword))->hi_key == ((void *)0) || (hash_find(&su->su_banned, preword))->hi_key == &hash_removed)))
  {
      if (slang->sl_compprog == ((void *)0))
   break;

      goodword_ends = 0;
  }
     }

     newscore = 0;
     if (!soundfold)
     {
  if ((flags & 0x01)
       && (((unsigned)flags >> 16) & lp->lp_region) == 0)
      newscore += 200;
  if (flags & 0x08)
      newscore += 180;

  if (!spell_valid_case(su->su_badflags,
      captype(preword + sp->ts_prewordlen, ((void *)0))))
      newscore += 52;
     }


     if (fword_ends
      && goodword_ends
      && sp->ts_fidx >= sp->ts_fidxtry
      && compound_ok)
     {
# 11655 "spell.c"
  if (soundfold)
  {


      add_sound_suggest(su, preword, sp->ts_score, lp);
  }
  else if (sp->ts_fidx > 0)
  {


      p = fword + sp->ts_fidx;
      --p;
      if (!spell_iswordp(p, curwin))
      {
   p = preword + strlen((char *)(preword));
   --p;
   if (spell_iswordp(p, curwin))
       newscore += 103;
      }


      score = score_wordcount_adj(slang,
      sp->ts_score + newscore,
      preword + sp->ts_prewordlen,
      sp->ts_prewordlen > 0);


      if (score <= su->su_maxscore)
      {
   add_suggestion(su, &su->su_ga, preword,
        sp->ts_fidx - repextra,
        score, 0, 0, lp->lp_sallang, 0);

   if (su->su_badflags & 0x20)
   {


       c = captype(preword, ((void *)0));
       if (c == 0 || c == 0x04)
       {
    make_case_word(tword + sp->ts_splitoff,
           preword + sp->ts_prewordlen,
            c == 0 ? 0x04 : 0);

    add_suggestion(su, &su->su_ga, preword,
     sp->ts_fidx - repextra,
     score + 52, 0, 0,
     lp->lp_sallang, 0);
       }
   }
      }
  }
     }




     if ((sp->ts_fidx >= sp->ts_fidxtry || fword_ends)




      )
     {
  int try_compound;
  int try_split;






  try_split = (sp->ts_fidx - repextra < su->su_badlen)
        && !soundfold;
# 11743 "spell.c"
  try_compound = 0;
  if (!soundfold
   && slang->sl_compprog != ((void *)0)
   && ((unsigned)flags >> 24) != 0
   && sp->ts_twordlen - sp->ts_splitoff
             >= slang->sl_compminlen






   && (slang->sl_compsylmax < 250
       || sp->ts_complen + 1 - sp->ts_compsplit
         < slang->sl_compmax)
   && (can_be_compound(sp, slang,
      compflags, ((unsigned)flags >> 24))))

  {
      try_compound = 1;
      compflags[sp->ts_complen] = ((unsigned)flags >> 24);
      compflags[sp->ts_complen + 1] = '\000';
  }



  if (slang->sl_nobreak)
      try_compound = 1;




  else if (!fword_ends
   && try_compound
   && (sp->ts_flags & 2) == 0)
  {
      try_compound = 0;
      sp->ts_flags |= 2;
      --sp->ts_curi;
      compflags[sp->ts_complen] = '\000';
  }
  else
      sp->ts_flags &= ~2;

  if (try_split || try_compound)
  {
      if (!try_compound && (!fword_ends || !goodword_ends))
      {




   if (sp->ts_complen == sp->ts_compsplit
           && (flags & 0x0200))
       break;
   p = preword;
   while (*skiptowhite(p) != '\000')
       p = skipwhite(skiptowhite(p));
   if (sp->ts_complen > sp->ts_compsplit
    && !can_compound(slang, p,
      compflags + sp->ts_compsplit))
       break;

   if (slang->sl_nosplitsugs)
       newscore += 249;
   else
       newscore += 149;


   newscore = score_wordcount_adj(slang, newscore,
        preword + sp->ts_prewordlen, 1);
      }

      if ((stack[depth].ts_score + (newscore) < su->su_maxscore))
      {
   go_deeper(stack, depth, newscore);
# 11828 "spell.c"
   sp->ts_save_badflags = su->su_badflags;
   sp->ts_state = STATE_SPLITUNDO;

   ++depth;
   sp = &stack[depth];


   if (!try_compound && !fword_ends)
       ((__builtin_object_size ((char *)(preword), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(preword), (char *)(" "), __builtin_object_size ((char *)(preword), 1 > 1)) : __inline_strcat_chk ((char *)(preword), (char *)(" ")));
   sp->ts_prewordlen = (char_u)strlen((char *)(preword));
   sp->ts_splitoff = sp->ts_twordlen;
   sp->ts_splitfidx = sp->ts_fidx;






   if (((!try_compound && !spell_iswordp_nmw(fword
              + sp->ts_fidx))
        || fword_ends)
    && fword[sp->ts_fidx] != '\000'
    && goodword_ends)
   {
       int l;






    l = 1;
       if (fword_ends)
       {

    ((__builtin_object_size ((char *)(preword + sp->ts_prewordlen), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(preword + sp->ts_prewordlen), (char *)(fword + sp->ts_fidx), l, __builtin_object_size ((char *)(preword + sp->ts_prewordlen), 0)) : __inline_memmove_chk ((char *)(preword + sp->ts_prewordlen), (char *)(fword + sp->ts_fidx), l));

    sp->ts_prewordlen += l;
    preword[sp->ts_prewordlen] = '\000';
       }
       else
    sp->ts_score -= 149 - 93;
       sp->ts_fidx += l;
   }




   if (try_compound)
       ++sp->ts_complen;
   else
       sp->ts_compsplit = sp->ts_complen;
   sp->ts_prefixdepth = 0xff;
# 11889 "spell.c"
       n = sp->ts_fidx;
   su->su_badflags = badword_captype(su->su_badptr + n,
            su->su_badptr + su->su_badlen);


   sp->ts_arridx = 0;


   if (pbyts != ((void *)0))
   {
       byts = pbyts;
       idxs = pidxs;
       sp->ts_prefixdepth = 0xfe;
       sp->ts_state = STATE_NOPREFIX;
   }
      }
  }
     }
     break;

 case STATE_SPLITUNDO:

     su->su_badflags = sp->ts_save_badflags;


     sp->ts_state = STATE_START;


     byts = fbyts;
     idxs = fidxs;
     break;

 case STATE_ENDNUL:

     su->su_badflags = sp->ts_save_badflags;
     if (fword[sp->ts_fidx] == '\000'



        )
     {

  sp->ts_state = STATE_DEL;
  break;
     }
     sp->ts_state = STATE_PLAIN;


 case STATE_PLAIN:




     arridx = sp->ts_arridx;
     if (sp->ts_curi > byts[arridx])
     {


  if (sp->ts_fidx >= sp->ts_fidxtry)
      sp->ts_state = STATE_DEL;
  else
      sp->ts_state = STATE_FINAL;
     }
     else
     {
  arridx += sp->ts_curi++;
  c = byts[arridx];






  if (c == fword[sp->ts_fidx]



   )
      newscore = 0;
  else
      newscore = 93;
  if ((newscore == 0
       || (sp->ts_fidx >= sp->ts_fidxtry
    && ((sp->ts_flags & 4) == 0
        || c != fword[sp->ts_delidx])))
   && (stack[depth].ts_score + (newscore) < su->su_maxscore))
  {
      go_deeper(stack, depth, newscore);
# 11987 "spell.c"
      ++depth;
      sp = &stack[depth];
      ++sp->ts_fidx;
      tword[sp->ts_twordlen++] = c;
      sp->ts_arridx = idxs[arridx];
# 12082 "spell.c"
      {



   if (newscore != 0
    && !soundfold
    && slang->sl_has_map
    && similar_chars(slang,
         c, fword[sp->ts_fidx - 1]))
       sp->ts_score -= 93 - 33;
      }
  }
     }
     break;

 case STATE_DEL:
# 12110 "spell.c"
     sp->ts_state = STATE_INS_PREP;
     sp->ts_curi = 1;
     if (soundfold && sp->ts_fidx == 0 && fword[sp->ts_fidx] == '*')


  newscore = 2 * 94 / 3;
     else
  newscore = 94;
     if (fword[sp->ts_fidx] != '\000'
        && (stack[depth].ts_score + (newscore) < su->su_maxscore))
     {
  go_deeper(stack, depth, newscore);





  ++depth;



  stack[depth].ts_flags |= 4;
  stack[depth].ts_delidx = sp->ts_fidx;
# 12150 "spell.c"
  {
      ++stack[depth].ts_fidx;
      if (fword[sp->ts_fidx] == fword[sp->ts_fidx + 1])
   stack[depth].ts_score -= 94 - 66;
  }
  break;
     }


 case STATE_INS_PREP:
     if (sp->ts_flags & 4)
     {


  sp->ts_state = STATE_SWAP;
  break;
     }


     n = sp->ts_arridx;
     for (;;)
     {
  if (sp->ts_curi > byts[n])
  {

      sp->ts_state = STATE_SWAP;
      break;
  }
  if (byts[n + sp->ts_curi] != '\000')
  {

      sp->ts_state = STATE_INS;
      break;
  }
  ++sp->ts_curi;
     }
     break;



 case STATE_INS:


     n = sp->ts_arridx;
     if (sp->ts_curi > byts[n])
     {

  sp->ts_state = STATE_SWAP;
  break;
     }






     n += sp->ts_curi++;
     c = byts[n];
     if (soundfold && sp->ts_twordlen == 0 && c == '*')


  newscore = 2 * 96 / 3;
     else
  newscore = 96;
     if (c != fword[sp->ts_fidx]
        && (stack[depth].ts_score + (newscore) < su->su_maxscore))
     {
  go_deeper(stack, depth, newscore);





  ++depth;
  sp = &stack[depth];
  tword[sp->ts_twordlen++] = c;
  sp->ts_arridx = idxs[n];
# 12245 "spell.c"
  {




      if (sp->ts_twordlen >= 2
        && tword[sp->ts_twordlen - 2] == c)
   sp->ts_score -= 96 - 67;
  }
     }
     break;

 case STATE_SWAP:





     p = fword + sp->ts_fidx;
     c = *p;
     if (c == '\000')
     {

  sp->ts_state = STATE_FINAL;
  break;
     }



     if (!soundfold && !spell_iswordp(p, curwin))
     {
  sp->ts_state = STATE_REP_INI;
  break;
     }
# 12294 "spell.c"
     {
  if (p[1] == '\000')
      c2 = '\000';
  else if (!soundfold && !spell_iswordp(p + 1, curwin))
      c2 = c;
  else
      c2 = p[1];
     }


     if (c2 == '\000')
     {
  sp->ts_state = STATE_REP_INI;
  break;
     }



     if (c == c2)
     {
  sp->ts_state = STATE_SWAP3;
  break;
     }
     if (c2 != '\000' && (stack[depth].ts_score + (75) < su->su_maxscore))
     {
  go_deeper(stack, depth, 75);





  sp->ts_state = STATE_UNSWAP;
  ++depth;
# 12337 "spell.c"
  {
      p[0] = c2;
      p[1] = c;
      stack[depth].ts_fidxtry = sp->ts_fidx + 2;
  }
     }
     else

  sp->ts_state = STATE_REP_INI;
     break;

 case STATE_UNSWAP:

     p = fword + sp->ts_fidx;
# 12361 "spell.c"
     {
  c = *p;
  *p = p[1];
  p[1] = c;
     }


 case STATE_SWAP3:


     p = fword + sp->ts_fidx;
# 12386 "spell.c"
     {
  c = *p;
  c2 = p[1];
  if (!soundfold && !spell_iswordp(p + 2, curwin))
      c3 = c;
  else
      c3 = p[2];
     }







     if (c == c3 || c3 == '\000')
     {
  sp->ts_state = STATE_REP_INI;
  break;
     }
     if ((stack[depth].ts_score + (110) < su->su_maxscore))
     {
  go_deeper(stack, depth, 110);





  sp->ts_state = STATE_UNSWAP3;
  ++depth;
# 12427 "spell.c"
  {
      p[0] = p[2];
      p[2] = c;
      stack[depth].ts_fidxtry = sp->ts_fidx + 3;
  }
     }
     else
  sp->ts_state = STATE_REP_INI;
     break;

 case STATE_UNSWAP3:

     p = fword + sp->ts_fidx;
# 12455 "spell.c"
     {
  c = *p;
  *p = p[2];
  p[2] = c;
  ++p;
     }

     if (!soundfold && !spell_iswordp(p, curwin))
     {


  sp->ts_state = STATE_REP_INI;
  break;
     }



     if ((stack[depth].ts_score + (110) < su->su_maxscore))
     {
  go_deeper(stack, depth, 110);






  sp->ts_state = STATE_UNROT3L;
  ++depth;
  p = fword + sp->ts_fidx;
# 12497 "spell.c"
  {
      c = *p;
      *p = p[1];
      p[1] = p[2];
      p[2] = c;
      stack[depth].ts_fidxtry = sp->ts_fidx + 3;
  }
     }
     else
  sp->ts_state = STATE_REP_INI;
     break;

 case STATE_UNROT3L:

     p = fword + sp->ts_fidx;
# 12524 "spell.c"
     {
  c = p[2];
  p[2] = p[1];
  p[1] = *p;
  *p = c;
     }



     if ((stack[depth].ts_score + (110) < su->su_maxscore))
     {
  go_deeper(stack, depth, 110);






  sp->ts_state = STATE_UNROT3R;
  ++depth;
  p = fword + sp->ts_fidx;
# 12558 "spell.c"
  {
      c = p[2];
      p[2] = p[1];
      p[1] = *p;
      *p = c;
      stack[depth].ts_fidxtry = sp->ts_fidx + 3;
  }
     }
     else
  sp->ts_state = STATE_REP_INI;
     break;

 case STATE_UNROT3R:

     p = fword + sp->ts_fidx;
# 12585 "spell.c"
     {
  c = *p;
  *p = p[1];
  p[1] = p[2];
  p[2] = c;
     }


 case STATE_REP_INI:





     if ((lp->lp_replang == ((void *)0) && !soundfold)
      || sp->ts_score + 65 >= su->su_maxscore
      || sp->ts_fidx < sp->ts_fidxtry)
     {
  sp->ts_state = STATE_FINAL;
  break;
     }



     if (soundfold)
  sp->ts_curi = slang->sl_repsal_first[fword[sp->ts_fidx]];
     else
  sp->ts_curi = lp->lp_replang->sl_rep_first[fword[sp->ts_fidx]];

     if (sp->ts_curi < 0)
     {
  sp->ts_state = STATE_FINAL;
  break;
     }

     sp->ts_state = STATE_REP;


 case STATE_REP:



     p = fword + sp->ts_fidx;

     if (soundfold)
  gap = &slang->sl_repsal;
     else
  gap = &lp->lp_replang->sl_rep;
     while (sp->ts_curi < gap->ga_len)
     {
  ftp = (fromto_T *)gap->ga_data + sp->ts_curi++;
  if (*ftp->ft_from != *p)
  {

      sp->ts_curi = gap->ga_len;
      break;
  }
  if (strncmp((char *)(ftp->ft_from), (char *)(p), (size_t)(strlen((char *)(ftp->ft_from)))) == 0
   && (stack[depth].ts_score + (65) < su->su_maxscore))
  {
      go_deeper(stack, depth, 65);






      sp->ts_state = STATE_REP_UNDO;


      ++depth;
      fl = (int)strlen((char *)(ftp->ft_from));
      tl = (int)strlen((char *)(ftp->ft_to));
      if (fl != tl)
      {
   ((__builtin_object_size ((char *)((p + tl)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((p + tl)), (char *)((p + fl)), strlen((char *)(p + fl)) + 1, __builtin_object_size ((char *)((p + tl)), 0)) : __inline_memmove_chk ((char *)((p + tl)), (char *)((p + fl)), strlen((char *)(p + fl)) + 1));
   repextra += tl - fl;
      }
      ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(p), (char *)(ftp->ft_to), tl, __builtin_object_size ((char *)(p), 0)) : __inline_memmove_chk ((char *)(p), (char *)(ftp->ft_to), tl));
      stack[depth].ts_fidxtry = sp->ts_fidx + tl;



      break;
  }
     }

     if (sp->ts_curi >= gap->ga_len && sp->ts_state == STATE_REP)

  sp->ts_state = STATE_FINAL;

     break;

 case STATE_REP_UNDO:

     if (soundfold)
  gap = &slang->sl_repsal;
     else
  gap = &lp->lp_replang->sl_rep;
     ftp = (fromto_T *)gap->ga_data + sp->ts_curi - 1;
     fl = (int)strlen((char *)(ftp->ft_from));
     tl = (int)strlen((char *)(ftp->ft_to));
     p = fword + sp->ts_fidx;
     if (fl != tl)
     {
  ((__builtin_object_size ((char *)((p + fl)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((p + fl)), (char *)((p + tl)), strlen((char *)(p + tl)) + 1, __builtin_object_size ((char *)((p + fl)), 0)) : __inline_memmove_chk ((char *)((p + fl)), (char *)((p + tl)), strlen((char *)(p + tl)) + 1));
  repextra -= tl - fl;
     }
     ((__builtin_object_size ((char *)(p), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(p), (char *)(ftp->ft_from), fl, __builtin_object_size ((char *)(p), 0)) : __inline_memmove_chk ((char *)(p), (char *)(ftp->ft_from), fl));
     sp->ts_state = STATE_REP;
     break;

 default:

     --depth;

     if (depth >= 0 && stack[depth].ts_prefixdepth == 0xfe)
     {

  byts = pbyts;
  idxs = pidxs;
     }


     if (--breakcheckcount == 0)
     {
  ui_breakcheck();
  breakcheckcount = 1000;
     }
 }
    }
}





    static void
go_deeper(stack, depth, score_add)
    trystate_T *stack;
    int depth;
    int score_add;
{
    stack[depth + 1] = stack[depth];
    stack[depth + 1].ts_state = STATE_START;
    stack[depth + 1].ts_score = stack[depth].ts_score + score_add;
    stack[depth + 1].ts_curi = 1;
    stack[depth + 1].ts_flags = 0;
}
# 12763 "spell.c"
    static void
find_keepcap_word(slang, fword, kword)
    slang_T *slang;
    char_u *fword;
    char_u *kword;
{
    char_u uword[250];
    int depth;
    idx_T tryidx;


    idx_T arridx[250];
    int round[250];
    int fwordidx[250];
    int uwordidx[250];
    int kwordlen[250];

    int flen, ulen;
    int l;
    int len;
    int c;
    idx_T lo, hi, m;
    char_u *p;
    char_u *byts = slang->sl_kbyts;
    idx_T *idxs = slang->sl_kidxs;

    if (byts == ((void *)0))
    {

 *kword = '\000';
 return;
    }


    allcap_copy(fword, uword);






    depth = 0;
    arridx[0] = 0;
    round[0] = 0;
    fwordidx[0] = 0;
    uwordidx[0] = 0;
    kwordlen[0] = 0;
    while (depth >= 0)
    {
 if (fword[fwordidx[depth]] == '\000')
 {


     if (byts[arridx[depth] + 1] == 0)
     {
  kword[kwordlen[depth]] = '\000';
  return;
     }


     --depth;
 }
 else if (++round[depth] > 2)
 {


     --depth;
 }
 else
 {
# 12845 "spell.c"
  ulen = flen = 1;
     if (round[depth] == 1)
     {
  p = fword + fwordidx[depth];
  l = flen;
     }
     else
     {
  p = uword + uwordidx[depth];
  l = ulen;
     }

     for (tryidx = arridx[depth]; l > 0; --l)
     {

  len = byts[tryidx++];
  c = *p++;
  lo = tryidx;
  hi = tryidx + len - 1;
  while (lo < hi)
  {
      m = (lo + hi) / 2;
      if (byts[m] > c)
   hi = m - 1;
      else if (byts[m] < c)
   lo = m + 1;
      else
      {
   lo = hi = m;
   break;
      }
  }


  if (hi < lo || byts[lo] != c)
      break;


  tryidx = idxs[lo];
     }

     if (l == 0)
     {




  if (round[depth] == 1)
  {
      ((__builtin_object_size ((char *)(kword + kwordlen[depth]), 0) != (size_t) -1) ? __builtin___strncpy_chk ((char *)(kword + kwordlen[depth]), (char *)(fword + fwordidx[depth]), (size_t)(flen), __builtin_object_size ((char *)(kword + kwordlen[depth]), 1 > 1)) : __inline_strncpy_chk ((char *)(kword + kwordlen[depth]), (char *)(fword + fwordidx[depth]), (size_t)(flen)));

      kwordlen[depth + 1] = kwordlen[depth] + flen;
  }
  else
  {
      ((__builtin_object_size ((char *)(kword + kwordlen[depth]), 0) != (size_t) -1) ? __builtin___strncpy_chk ((char *)(kword + kwordlen[depth]), (char *)(uword + uwordidx[depth]), (size_t)(ulen), __builtin_object_size ((char *)(kword + kwordlen[depth]), 1 > 1)) : __inline_strncpy_chk ((char *)(kword + kwordlen[depth]), (char *)(uword + uwordidx[depth]), (size_t)(ulen)));

      kwordlen[depth + 1] = kwordlen[depth] + ulen;
  }
  fwordidx[depth + 1] = fwordidx[depth] + flen;
  uwordidx[depth + 1] = uwordidx[depth] + ulen;

  ++depth;
  arridx[depth] = tryidx;
  round[depth] = 0;
     }
 }
    }


    *kword = '\000';
}





    static void
score_comp_sal(su)
    suginfo_T *su;
{
    langp_T *lp;
    char_u badsound[250];
    int i;
    suggest_T *stp;
    suggest_T *sstp;
    int score;
    int lpi;

    if (ga_grow(&su->su_sga, su->su_ga.ga_len) == 0)
 return;


    for (lpi = 0; lpi < curwin->w_s->b_langp.ga_len; ++lpi)
    {
 lp = (((langp_T *)(curwin->w_s->b_langp).ga_data) + (lpi));
 if (lp->lp_slang->sl_sal.ga_len > 0)
 {

     spell_soundfold(lp->lp_slang, su->su_fbadword, 1, badsound);

     for (i = 0; i < su->su_ga.ga_len; ++i)
     {
  stp = &(((suggest_T *)(su->su_ga).ga_data)[i]);



  score = stp_sal_score(stp, su, lp->lp_slang, badsound);
  if (score < 999999)
  {

      sstp = &(((suggest_T *)(su->su_sga).ga_data)[su->su_sga.ga_len]);
      sstp->st_word = vim_strsave(stp->st_word);
      if (sstp->st_word != ((void *)0))
      {
   sstp->st_wordlen = stp->st_wordlen;
   sstp->st_score = score;
   sstp->st_altscore = 0;
   sstp->st_orglen = stp->st_orglen;
   ++su->su_sga.ga_len;
      }
  }
     }
     break;
 }
    }
}





    static void
score_combine(su)
    suginfo_T *su;
{
    int i;
    int j;
    garray_T ga;
    garray_T *gap;
    langp_T *lp;
    suggest_T *stp;
    char_u *p;
    char_u badsound[250];
    int round;
    int lpi;
    slang_T *slang = ((void *)0);


    for (lpi = 0; lpi < curwin->w_s->b_langp.ga_len; ++lpi)
    {
 lp = (((langp_T *)(curwin->w_s->b_langp).ga_data) + (lpi));
 if (lp->lp_slang->sl_sal.ga_len > 0)
 {

     slang = lp->lp_slang;
     spell_soundfold(slang, su->su_fbadword, 1, badsound);

     for (i = 0; i < su->su_ga.ga_len; ++i)
     {
  stp = &(((suggest_T *)(su->su_ga).ga_data)[i]);
  stp->st_altscore = stp_sal_score(stp, su, slang, badsound);
  if (stp->st_altscore == 999999)
      stp->st_score = (stp->st_score * 3 + 96 * 3) / 4;
  else
      stp->st_score = (stp->st_score * 3
        + stp->st_altscore) / 4;
  stp->st_salscore = 0;
     }
     break;
 }
    }

    if (slang == ((void *)0))
    {
 (void)cleanup_suggestions(&su->su_ga, su->su_maxscore,
            su->su_maxcount);
 return;
    }


    for (i = 0; i < su->su_sga.ga_len; ++i)
    {
 stp = &(((suggest_T *)(su->su_sga).ga_data)[i]);
 stp->st_altscore = spell_edit_score(slang,
      su->su_badword, stp->st_word);
 if (stp->st_score == 999999)
     stp->st_score = (96 * 3 * 7 + stp->st_altscore) / 8;
 else
     stp->st_score = (stp->st_score * 7 + stp->st_altscore) / 8;
 stp->st_salscore = 1;
    }



    check_suggestions(su, &su->su_ga);
    (void)cleanup_suggestions(&su->su_ga, su->su_maxscore, su->su_maxcount);
    check_suggestions(su, &su->su_sga);
    (void)cleanup_suggestions(&su->su_sga, su->su_maxscore, su->su_maxcount);

    ga_init2(&ga, (int)sizeof(suginfo_T), 1);
    if (ga_grow(&ga, su->su_ga.ga_len + su->su_sga.ga_len) == 0)
 return;

    stp = &(((suggest_T *)(ga).ga_data)[0]);
    for (i = 0; i < su->su_ga.ga_len || i < su->su_sga.ga_len; ++i)
    {


 for (round = 1; round <= 2; ++round)
 {
     gap = round == 1 ? &su->su_ga : &su->su_sga;
     if (i < gap->ga_len)
     {

  p = (((suggest_T *)(*gap).ga_data)[i]).st_word;
  for (j = 0; j < ga.ga_len; ++j)
      if (strcmp((char *)(stp[j].st_word), (char *)(p)) == 0)
   break;
  if (j == ga.ga_len)
      stp[ga.ga_len++] = (((suggest_T *)(*gap).ga_data)[i]);
  else
      vim_free(p);
     }
 }
    }

    ga_clear(&su->su_ga);
    ga_clear(&su->su_sga);


    if (ga.ga_len > su->su_maxcount)
    {
 for (i = su->su_maxcount; i < ga.ga_len; ++i)
     vim_free(stp[i].st_word);
 ga.ga_len = su->su_maxcount;
    }

    su->su_ga = ga;
}





    static int
stp_sal_score(stp, su, slang, badsound)
    suggest_T *stp;
    suginfo_T *su;
    slang_T *slang;
    char_u *badsound;
{
    char_u *p;
    char_u *pbad;
    char_u *pgood;
    char_u badsound2[250];
    char_u fword[250];
    char_u goodsound[250];
    char_u goodword[250];
    int lendiff;

    lendiff = (int)(su->su_badlen - stp->st_orglen);
    if (lendiff >= 0)
 pbad = badsound;
    else
    {

 (void)spell_casefold(su->su_badptr, stp->st_orglen, fword, 250);





 if (((su->su_badptr[su->su_badlen]) == ' ' || (su->su_badptr[su->su_badlen]) == '\t')
      && *skiptowhite(stp->st_word) == '\000')
     for (p = fword; *(p = skiptowhite(p)) != '\000'; )
  ((__builtin_object_size ((char *)((p)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((p)), (char *)((p + 1)), strlen((char *)(p + 1)) + 1, __builtin_object_size ((char *)((p)), 0)) : __inline_memmove_chk ((char *)((p)), (char *)((p + 1)), strlen((char *)(p + 1)) + 1));

 spell_soundfold(slang, fword, 1, badsound2);
 pbad = badsound2;
    }

    if (lendiff > 0)
    {


 ((__builtin_object_size ((char *)(goodword), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(goodword), (char *)(stp->st_word), __builtin_object_size ((char *)(goodword), 1 > 1)) : __inline_strcpy_chk ((char *)(goodword), (char *)(stp->st_word)));
 vim_strncpy(goodword + stp->st_wordlen,
       su->su_badptr + su->su_badlen - lendiff, lendiff);
 pgood = goodword;
    }
    else
 pgood = stp->st_word;


    spell_soundfold(slang, pgood, 0, goodsound);

    return soundalike_score(goodsound, pbad);
}



typedef struct
{
    short sft_score;
    char_u sft_word[1];
} sftword_T;

static sftword_T dumsft;






    static void
suggest_try_soundalike_prep()
{
    langp_T *lp;
    int lpi;
    slang_T *slang;



    for (lpi = 0; lpi < curwin->w_s->b_langp.ga_len; ++lpi)
    {
 lp = (((langp_T *)(curwin->w_s->b_langp).ga_data) + (lpi));
 slang = lp->lp_slang;
 if (slang->sl_sal.ga_len > 0 && slang->sl_sbyts != ((void *)0))

     hash_init(&slang->sl_sounddone);
    }
}





    static void
suggest_try_soundalike(su)
    suginfo_T *su;
{
    char_u salword[250];
    langp_T *lp;
    int lpi;
    slang_T *slang;



    for (lpi = 0; lpi < curwin->w_s->b_langp.ga_len; ++lpi)
    {
 lp = (((langp_T *)(curwin->w_s->b_langp).ga_data) + (lpi));
 slang = lp->lp_slang;
 if (slang->sl_sal.ga_len > 0 && slang->sl_sbyts != ((void *)0))
 {

     spell_soundfold(slang, su->su_fbadword, 1, salword);




     suggest_trie_walk(su, lp, salword, 1);
 }
    }
}




    static void
suggest_try_soundalike_finish()
{
    langp_T *lp;
    int lpi;
    slang_T *slang;
    int todo;
    hashitem_T *hi;



    for (lpi = 0; lpi < curwin->w_s->b_langp.ga_len; ++lpi)
    {
 lp = (((langp_T *)(curwin->w_s->b_langp).ga_data) + (lpi));
 slang = lp->lp_slang;
 if (slang->sl_sal.ga_len > 0 && slang->sl_sbyts != ((void *)0))
 {

     todo = (int)slang->sl_sounddone.ht_used;
     for (hi = slang->sl_sounddone.ht_array; todo > 0; ++hi)
  if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
  {
      vim_free(((sftword_T *)((hi)->hi_key - (dumsft.sft_word - (char_u *)&dumsft))));
      --todo;
  }


     hash_clear(&slang->sl_sounddone);
     hash_init(&slang->sl_sounddone);
 }
    }
}





    static void
add_sound_suggest(su, goodword, score, lp)
    suginfo_T *su;
    char_u *goodword;
    int score;
    langp_T *lp;
{
    slang_T *slang = lp->lp_slang;
    int sfwordnr;
    char_u *nrline;
    int orgnr;
    char_u theword[250];
    int i;
    int wlen;
    char_u *byts;
    idx_T *idxs;
    int n;
    int wordcount;
    int wc;
    int goodscore;
    hash_T hash;
    hashitem_T *hi;
    sftword_T *sft;
    int bc, gc;
    int limit;







    hash = hash_hash(goodword);
    hi = hash_lookup(&slang->sl_sounddone, goodword, hash);
    if (((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
    {
 sft = (sftword_T *)alloc((unsigned)(sizeof(sftword_T)
        + strlen((char *)(goodword))));
 if (sft != ((void *)0))
 {
     sft->sft_score = score;
     ((__builtin_object_size ((char *)(sft->sft_word), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(sft->sft_word), (char *)(goodword), __builtin_object_size ((char *)(sft->sft_word), 1 > 1)) : __inline_strcpy_chk ((char *)(sft->sft_word), (char *)(goodword)));
     hash_add_item(&slang->sl_sounddone, hi, sft->sft_word, hash);
 }
    }
    else
    {
 sft = ((sftword_T *)((hi)->hi_key - (dumsft.sft_word - (char_u *)&dumsft)));
 if (score >= sft->sft_score)
     return;
 sft->sft_score = score;
    }




    sfwordnr = soundfold_find(slang, goodword);
    if (sfwordnr < 0)
    {
 emsg2((char_u *)(((char *)(e_intern2))), (char_u *)("add_sound_suggest()"));
 return;
    }




    nrline = ml_get_buf(slang->sl_sugbuf, (linenr_T)(sfwordnr + 1), 0);
    orgnr = 0;
    while (*nrline != '\000')
    {


 orgnr += bytes2offset(&nrline);

 byts = slang->sl_fbyts;
 idxs = slang->sl_fidxs;


 n = 0;
 wlen = 0;
 wordcount = 0;
 for (;;)
 {
     i = 1;
     if (wordcount == orgnr && byts[n + 1] == '\000')
  break;

     if (byts[n + 1] == '\000')
  ++wordcount;


     for ( ; byts[n + i] == '\000'; ++i)
  if (i > byts[n])
  {
      ((__builtin_object_size ((char *)(theword + wlen), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(theword + wlen), (char *)("BAD"), __builtin_object_size ((char *)(theword + wlen), 1 > 1)) : __inline_strcpy_chk ((char *)(theword + wlen), (char *)("BAD")));
      goto badword;
  }


     for ( ; i < byts[n]; ++i)
     {
  wc = idxs[idxs[n + i]];
  if (wordcount + wc > orgnr)
      break;
  wordcount += wc;
     }

     theword[wlen++] = byts[n + i];
     n = idxs[n + i];
 }
badword:
 theword[wlen] = '\000';


 for (; i <= byts[n] && byts[n + i] == '\000'; ++i)
 {
     char_u cword[250];
     char_u *p;
     int flags = (int)idxs[n + i];


     if (flags & 0x0400)
  continue;

     if (flags & 0x80)
     {

  find_keepcap_word(slang, theword, cword);
  p = cword;
     }
     else
     {
  flags |= su->su_badflags;
  if ((flags & (0x02 | 0x04 | 0x80 | 0x40)) != 0)
  {

      make_case_word(theword, cword, flags);
      p = cword;
  }
  else
      p = theword;
     }


     if (sps_flags & 4)
     {

  if (score <= su->su_maxscore)
      add_suggestion(su, &su->su_sga, p, su->su_badlen,
            score, 0, 0, slang, 0);
     }
     else
     {

  if ((flags & 0x01)
       && (((unsigned)flags >> 16) & lp->lp_region) == 0)
      goodscore = 200;
  else
      goodscore = 0;





  gc = ((int)*(p));
  if (((gc) < 256 ? spelltab.st_isu[gc] : 0))
  {
      bc = ((int)*(su->su_badword));
      if (!((bc) < 256 ? spelltab.st_isu[bc] : 0)
          && ((bc) < 256 ? (int)spelltab.st_fold[bc] : (bc)) != ((gc) < 256 ? (int)spelltab.st_fold[gc] : (gc)))
   goodscore += 52 / 2;
  }
# 13431 "spell.c"
  limit = ((4 * su->su_sfmaxscore - goodscore - score) / 3);
  if (limit > 350)
      goodscore += spell_edit_score(slang, su->su_badword, p);
  else
      goodscore += spell_edit_score_limit(slang, su->su_badword,
            p, limit);


  if (goodscore < 999999)
  {

      goodscore = score_wordcount_adj(slang, goodscore, p, 0);


      goodscore = ((3 * goodscore + score) / 4);
      if (goodscore <= su->su_sfmaxscore)
   add_suggestion(su, &su->su_ga, p, su->su_badlen,
      goodscore, score, 1, slang, 1);
  }
     }
 }

    }
}




    static int
soundfold_find(slang, word)
    slang_T *slang;
    char_u *word;
{
    idx_T arridx = 0;
    int len;
    int wlen = 0;
    int c;
    char_u *ptr = word;
    char_u *byts;
    idx_T *idxs;
    int wordnr = 0;

    byts = slang->sl_sbyts;
    idxs = slang->sl_sidxs;

    for (;;)
    {

 len = byts[arridx++];



 c = ptr[wlen];
 if (byts[arridx] == '\000')
 {
     if (c == '\000')
  break;


     while (len > 0 && byts[arridx] == '\000')
     {
  ++arridx;
  --len;
     }
     if (len == 0)
  return -1;
     ++wordnr;
 }


 if (c == '\000')
     return -1;


 if (c == '\011')
     c = ' ';
 while (byts[arridx] < c)
 {

     wordnr += idxs[idxs[arridx]];
     ++arridx;
     if (--len == 0)
  return -1;
 }
 if (byts[arridx] != c)
     return -1;


 arridx = idxs[arridx];
 ++wlen;



 if (c == ' ')
     while (ptr[wlen] == ' ' || ptr[wlen] == '\011')
  ++wlen;
    }

    return wordnr;
}




    static void
make_case_word(fword, cword, flags)
    char_u *fword;
    char_u *cword;
    int flags;
{
    if (flags & 0x04)

 allcap_copy(fword, cword);
    else if (flags & 0x02)

 onecap_copy(fword, cword, 1);
    else

 ((__builtin_object_size ((char *)(cword), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(cword), (char *)(fword), __builtin_object_size ((char *)(cword), 1 > 1)) : __inline_strcpy_chk ((char *)(cword), (char *)(fword)));
}




    static void
set_map_str(lp, map)
    slang_T *lp;
    char_u *map;
{
    char_u *p;
    int headc = 0;
    int c;
    int i;

    if (*map == '\000')
    {
 lp->sl_has_map = 0;
 return;
    }
    lp->sl_has_map = 1;


    for (i = 0; i < 256; ++i)
 lp->sl_map_array[i] = 0;
# 13584 "spell.c"
    for (p = map; *p != '\000'; )
    {



 c = *p++;

 if (c == '/')
     headc = 0;
 else
 {
     if (headc == 0)
   headc = c;
# 13631 "spell.c"
  lp->sl_map_array[c] = headc;
 }
    }
}





    static int
similar_chars(slang, c1, c2)
    slang_T *slang;
    int c1;
    int c2;
{
    int m1, m2;
# 13662 "spell.c"
 m1 = slang->sl_map_array[c1];
    if (m1 == 0)
 return 0;
# 13679 "spell.c"
 m2 = slang->sl_map_array[c2];

    return m1 == m2;
}





    static void
add_suggestion(su, gap, goodword, badlenarg, score, altscore, had_bonus,
         slang, maxsf)
    suginfo_T *su;
    garray_T *gap;
    char_u *goodword;
    int badlenarg;
    int score;
    int altscore;
    int had_bonus;
    slang_T *slang;
    int maxsf;

{
    int goodlen;
    int badlen;
    suggest_T *stp;
    suggest_T new_sug;
    int i;
    char_u *pgood, *pbad;



    pgood = goodword + strlen((char *)(goodword));
    pbad = su->su_badptr + badlenarg;
    for (;;)
    {
 goodlen = (int)(pgood - goodword);
 badlen = (int)(pbad - su->su_badptr);
 if (goodlen <= 0 || badlen <= 0)
     break;
 --pgood;
 --pbad;
# 13729 "spell.c"
     if (*pgood != *pbad)
  break;
    }

    if (badlen == 0 && goodlen == 0)


 return;

    if (gap->ga_len == 0)
 i = -1;
    else
    {



 stp = &(((suggest_T *)(*gap).ga_data)[0]);
 for (i = gap->ga_len; --i >= 0; ++stp)
     if (stp->st_wordlen == goodlen
      && stp->st_orglen == badlen
      && strncmp((char *)(stp->st_word), (char *)(goodword), (size_t)(goodlen)) == 0)
     {



  if (stp->st_slang == ((void *)0))
      stp->st_slang = slang;

  new_sug.st_score = score;
  new_sug.st_altscore = altscore;
  new_sug.st_had_bonus = had_bonus;

  if (stp->st_had_bonus != had_bonus)
  {






      if (had_bonus)
   rescore_one(su, stp);
      else
      {
   new_sug.st_word = stp->st_word;
   new_sug.st_wordlen = stp->st_wordlen;
   new_sug.st_slang = stp->st_slang;
   new_sug.st_orglen = badlen;
   rescore_one(su, &new_sug);
      }
  }

  if (stp->st_score > new_sug.st_score)
  {
      stp->st_score = new_sug.st_score;
      stp->st_altscore = new_sug.st_altscore;
      stp->st_had_bonus = new_sug.st_had_bonus;
  }
  break;
     }
    }

    if (i < 0 && ga_grow(gap, 1) == 1)
    {

 stp = &(((suggest_T *)(*gap).ga_data)[gap->ga_len]);
 stp->st_word = vim_strnsave(goodword, goodlen);
 if (stp->st_word != ((void *)0))
 {
     stp->st_wordlen = goodlen;
     stp->st_score = score;
     stp->st_altscore = altscore;
     stp->st_had_bonus = had_bonus;
     stp->st_orglen = badlen;
     stp->st_slang = slang;
     ++gap->ga_len;



     if (gap->ga_len > (((su)->su_maxcount < 130 ? 150 : (su)->su_maxcount + 20) + 50))
     {
  if (maxsf)
      su->su_sfmaxscore = cleanup_suggestions(gap,
          su->su_sfmaxscore, ((su)->su_maxcount < 130 ? 150 : (su)->su_maxcount + 20));
  else
  {
      i = su->su_maxscore;
      su->su_maxscore = cleanup_suggestions(gap,
     su->su_maxscore, ((su)->su_maxcount < 130 ? 150 : (su)->su_maxcount + 20));
  }
     }
 }
    }
}





    static void
check_suggestions(su, gap)
    suginfo_T *su;
    garray_T *gap;
{
    suggest_T *stp;
    int i;
    char_u longword[250 + 1];
    int len;
    hlf_T attr;

    stp = &(((suggest_T *)(*gap).ga_data)[0]);
    for (i = gap->ga_len - 1; i >= 0; --i)
    {

 ((__builtin_object_size ((char *)(longword), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(longword), (char *)(stp[i].st_word), __builtin_object_size ((char *)(longword), 1 > 1)) : __inline_strcpy_chk ((char *)(longword), (char *)(stp[i].st_word)));
 len = stp[i].st_wordlen;
 vim_strncpy(longword + len, su->su_badptr + stp[i].st_orglen,
              250 - len);
 attr = HLF_COUNT;
 (void)spell_check(curwin, longword, &attr, ((void *)0), 0);
 if (attr != HLF_COUNT)
 {

     vim_free(stp[i].st_word);
     --gap->ga_len;
     if (i < gap->ga_len)
  ((__builtin_object_size ((char *)(stp + i), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)(stp + i), (char *)(stp + i + 1), sizeof(suggest_T) * (gap->ga_len - i), __builtin_object_size ((char *)(stp + i), 0)) : __inline_memmove_chk ((char *)(stp + i), (char *)(stp + i + 1), sizeof(suggest_T) * (gap->ga_len - i)));

 }
    }
}





    static void
add_banned(su, word)
    suginfo_T *su;
    char_u *word;
{
    char_u *s;
    hash_T hash;
    hashitem_T *hi;

    hash = hash_hash(word);
    hi = hash_lookup(&su->su_banned, word, hash);
    if (((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
    {
 s = vim_strsave(word);
 if (s != ((void *)0))
     hash_add_item(&su->su_banned, hi, s, hash);
    }
}





    static void
rescore_suggestions(su)
    suginfo_T *su;
{
    int i;

    if (su->su_sallang != ((void *)0))
 for (i = 0; i < su->su_ga.ga_len; ++i)
     rescore_one(su, &(((suggest_T *)(su->su_ga).ga_data)[i]));
}




    static void
rescore_one(su, stp)
    suginfo_T *su;
    suggest_T *stp;
{
    slang_T *slang = stp->st_slang;
    char_u sal_badword[250];
    char_u *p;



    if (slang != ((void *)0) && slang->sl_sal.ga_len > 0 && !stp->st_had_bonus)
    {
 if (slang == su->su_sallang)
     p = su->su_sal_badword;
 else
 {
     spell_soundfold(slang, su->su_fbadword, 1, sal_badword);
     p = sal_badword;
 }

 stp->st_altscore = stp_sal_score(stp, su, slang, p);
 if (stp->st_altscore == 999999)
     stp->st_altscore = 96 * 3;
 stp->st_score = ((3 * stp->st_score + stp->st_altscore) / 4);
 stp->st_had_bonus = 1;
    }
}

static int



sug_compare (const void *s1, const void *s2);





    static int



sug_compare(s1, s2)
    const void *s1;
    const void *s2;
{
    suggest_T *p1 = (suggest_T *)s1;
    suggest_T *p2 = (suggest_T *)s2;
    int n = p1->st_score - p2->st_score;

    if (n == 0)
    {
 n = p1->st_altscore - p2->st_altscore;
 if (n == 0)
     n = strcasecmp((char *)(p1->st_word), (char *)(p2->st_word));
    }
    return n;
}







    static int
cleanup_suggestions(gap, maxscore, keep)
    garray_T *gap;
    int maxscore;
    int keep;
{
    suggest_T *stp = &(((suggest_T *)(*gap).ga_data)[0]);
    int i;


    qsort(gap->ga_data, (size_t)gap->ga_len, sizeof(suggest_T), sug_compare);


    if (gap->ga_len > keep)
    {
 for (i = keep; i < gap->ga_len; ++i)
     vim_free(stp[i].st_word);
 gap->ga_len = keep;
 return stp[keep - 1].st_score;
    }
    return maxscore;
}






    char_u *
eval_soundfold(word)
    char_u *word;
{
    langp_T *lp;
    char_u sound[250];
    int lpi;

    if (curwin->w_onebuf_opt.wo_spell && *curwin->w_s->b_p_spl != '\000')

 for (lpi = 0; lpi < curwin->w_s->b_langp.ga_len; ++lpi)
 {
     lp = (((langp_T *)(curwin->w_s->b_langp).ga_data) + (lpi));
     if (lp->lp_slang->sl_sal.ga_len > 0)
     {

  spell_soundfold(lp->lp_slang, word, 0, sound);
  return vim_strsave(sound);
     }
 }


    return vim_strsave(word);
}
# 14034 "spell.c"
    static void
spell_soundfold(slang, inword, folded, res)
    slang_T *slang;
    char_u *inword;
    int folded;
    char_u *res;
{
    char_u fword[250];
    char_u *word;

    if (slang->sl_sofo)

 spell_soundfold_sofo(slang, inword, res);
    else
    {

 if (folded)
     word = inword;
 else
 {
     (void)spell_casefold(inword, (int)strlen((char *)(inword)), fword, 250);
     word = fword;
 }






     spell_soundfold_sal(slang, word, res);
    }
}





    static void
spell_soundfold_sofo(slang, inword, res)
    slang_T *slang;
    char_u *inword;
    char_u *res;
{
    char_u *s;
    int ri = 0;
    int c;
# 14129 "spell.c"
    {

 for (s = inword; (c = *s) != '\000'; ++s)
 {
     if (((c) == ' ' || (c) == '\t'))
  c = ' ';
     else
  c = slang->sl_sal_first[c];
     if (c != '\000' && (ri == 0 || res[ri - 1] != c))
  res[ri++] = c;
 }
    }

    res[ri] = '\000';
}

    static void
spell_soundfold_sal(slang, inword, res)
    slang_T *slang;
    char_u *inword;
    char_u *res;
{
    salitem_T *smp;
    char_u word[250];
    char_u *s = inword;
    char_u *t;
    char_u *pf;
    int i, j, z;
    int reslen;
    int n, k = 0;
    int z0;
    int k0;
    int n0;
    int c;
    int pri;
    int p0 = -333;
    int c0;



    if (slang->sl_rem_accents)
    {
 t = word;
 while (*s != '\000')
 {
     if (((*s) == ' ' || (*s) == '\t'))
     {
  *t++ = ' ';
  s = skipwhite(s);
     }
     else
     {
  if (spell_iswordp_nmw(s))
      *t++ = *s;
  ++s;
     }
 }
 *t = '\000';
    }
    else
 ((__builtin_object_size ((char *)(word), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(word), (char *)(s), __builtin_object_size ((char *)(word), 1 > 1)) : __inline_strcpy_chk ((char *)(word), (char *)(s)));

    smp = (salitem_T *)slang->sl_sal.ga_data;





    i = reslen = z = 0;
    while ((c = word[i]) != '\000')
    {

 n = slang->sl_sal_first[c];
 z0 = 0;

 if (n >= 0)
 {

     for (; (s = smp[n].sm_lead)[0] == c; ++n)
     {


  k = smp[n].sm_leadlen;
  if (k > 1)
  {
      if (word[i + 1] != s[1])
   continue;
      if (k > 2)
      {
   for (j = 2; j < k; ++j)
       if (word[i + j] != s[j])
    break;
   if (j < k)
       continue;
      }
  }

  if ((pf = smp[n].sm_oneof) != ((void *)0))
  {

      while (*pf != '\000' && *pf != word[i + k])
   ++pf;
      if (*pf == '\000')
   continue;
      ++k;
  }
  s = smp[n].sm_rules;
  pri = 5;

  p0 = *s;
  k0 = k;
  while (*s == '-' && k > 1)
  {
      k--;
      s++;
  }
  if (*s == '<')
      s++;
  if (((*s) >= '0' && (*s) <= '9'))
  {

      pri = *s - '0';
      s++;
  }
  if (*s == '^' && *(s + 1) == '^')
      s++;

  if (*s == '\000'
   || (*s == '^'
       && (i == 0 || !(word[i - 1] == ' '
          || spell_iswordp(word + i - 1, curwin)))
       && (*(s + 1) != '$'
    || (!spell_iswordp(word + i + k0, curwin))))
   || (*s == '$' && i > 0
       && spell_iswordp(word + i - 1, curwin)
       && (!spell_iswordp(word + i + k0, curwin))))
  {


      c0 = word[i + k - 1];
      n0 = slang->sl_sal_first[c0];

      if (slang->sl_followup && k > 1 && n0 >= 0
        && p0 != '-' && word[i + k] != '\000')
      {

   for ( ; (s = smp[n0].sm_lead)[0] == c0; ++n0)
   {


       k0 = smp[n0].sm_leadlen;
       if (k0 > 1)
       {
    if (word[i + k] != s[1])
        continue;
    if (k0 > 2)
    {
        pf = word + i + k + 1;
        for (j = 2; j < k0; ++j)
     if (*pf++ != s[j])
         break;
        if (j < k0)
     continue;
    }
       }
       k0 += k - 1;

       if ((pf = smp[n0].sm_oneof) != ((void *)0))
       {


    while (*pf != '\000' && *pf != word[i + k0])
        ++pf;
    if (*pf == '\000')
        continue;
    ++k0;
       }

       p0 = 5;
       s = smp[n0].sm_rules;
       while (*s == '-')
       {


    s++;
       }
       if (*s == '<')
    s++;
       if (((*s) >= '0' && (*s) <= '9'))
       {
    p0 = *s - '0';
    s++;
       }

       if (*s == '\000'

        || (*s == '$'
         && !spell_iswordp(word + i + k0,
             curwin)))
       {
    if (k0 == k)

        continue;

    if (p0 < pri)

        continue;

    break;
       }
   }

   if (p0 >= pri && smp[n0].sm_lead[0] == c0)
       continue;
      }


      s = smp[n].sm_to;
      if (s == ((void *)0))
   s = (char_u *)"";
      pf = smp[n].sm_rules;
      p0 = (vim_strchr(pf, '<') != ((void *)0)) ? 1 : 0;
      if (p0 == 1 && z == 0)
      {

   if (reslen > 0 && *s != '\000' && (res[reslen - 1] == c
          || res[reslen - 1] == *s))
       reslen--;
   z0 = 1;
   z = 1;
   k0 = 0;
   while (*s != '\000' && word[i + k0] != '\000')
   {
       word[i + k0] = *s;
       k0++;
       s++;
   }
   if (k > k0)
       ((__builtin_object_size ((char *)((word + i + k0)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((word + i + k0)), (char *)((word + i + k)), strlen((char *)(word + i + k)) + 1, __builtin_object_size ((char *)((word + i + k0)), 0)) : __inline_memmove_chk ((char *)((word + i + k0)), (char *)((word + i + k)), strlen((char *)(word + i + k)) + 1));


   c = word[i];
      }
      else
      {

   i += k - 1;
   z = 0;
   while (*s != '\000' && s[1] != '\000' && reslen < 250)
   {
       if (reslen == 0 || res[reslen - 1] != *s)
    res[reslen++] = *s;
       s++;
   }

   c = *s;
   if (strstr((char *)pf, "^^") != ((void *)0))
   {
       if (c != '\000')
    res[reslen++] = c;
       ((__builtin_object_size ((char *)((word)), 0) != (size_t) -1) ? __builtin___memmove_chk ((char *)((word)), (char *)((word + i + 1)), strlen((char *)(word + i + 1)) + 1, __builtin_object_size ((char *)((word)), 0)) : __inline_memmove_chk ((char *)((word)), (char *)((word + i + 1)), strlen((char *)(word + i + 1)) + 1));
       i = 0;
       z0 = 1;
   }
      }
      break;
  }
     }
 }
 else if (((c) == ' ' || (c) == '\t'))
 {
     c = ' ';
     k = 1;
 }

 if (z0 == 0)
 {
     if (k && !p0 && reslen < 250 && c != '\000'
      && (!slang->sl_collapse || reslen == 0
           || res[reslen - 1] != c))

  res[reslen++] = c;

     i++;
     z = 0;
     k = 0;
 }
    }

    res[reslen] = '\000';
}
# 14743 "spell.c"
    static int
soundalike_score(goodstart, badstart)
    char_u *goodstart;
    char_u *badstart;
{
    char_u *goodsound = goodstart;
    char_u *badsound = badstart;
    int goodlen;
    int badlen;
    int n;
    char_u *pl, *ps;
    char_u *pl2, *ps2;
    int score = 0;



    if ((*badsound == '*' || *goodsound == '*') && *badsound != *goodsound)
    {
 if ((badsound[0] == '\000' && goodsound[1] == '\000')
     || (goodsound[0] == '\000' && badsound[1] == '\000'))

     return 94;
 if (badsound[0] == '\000' || goodsound[0] == '\000')

     return 999999;

 if (badsound[1] == goodsound[1]
  || (badsound[1] != '\000'
      && goodsound[1] != '\000'
      && badsound[2] == goodsound[2]))
 {

 }
 else
 {
     score = 2 * 94 / 3;
     if (*badsound == '*')
  ++badsound;
     else
  ++goodsound;
 }
    }

    goodlen = (int)strlen((char *)(goodsound));
    badlen = (int)strlen((char *)(badsound));



    n = goodlen - badlen;
    if (n < -2 || n > 2)
 return 999999;

    if (n > 0)
    {
 pl = goodsound;
 ps = badsound;
    }
    else
    {
 pl = badsound;
 ps = goodsound;
    }


    while (*pl == *ps && *pl != '\000')
    {
 ++pl;
 ++ps;
    }

    switch (n)
    {
 case -2:
 case 2:



     ++pl;
     while (*pl == *ps)
     {
  ++pl;
  ++ps;
     }

     if (strcmp((char *)(pl + 1), (char *)(ps)) == 0)
  return score + 94 * 2;


     break;

 case -1:
 case 1:





     pl2 = pl + 1;
     ps2 = ps;
     while (*pl2 == *ps2)
     {
  if (*pl2 == '\000')
      return score + 94;
  ++pl2;
  ++ps2;
     }


     if (pl2[0] == ps2[1] && pl2[1] == ps2[0]
          && strcmp((char *)(pl2 + 2), (char *)(ps2 + 2)) == 0)
  return score + 94 + 75;


     if (strcmp((char *)(pl2 + 1), (char *)(ps2 + 1)) == 0)
  return score + 94 + 93;


     if (pl[0] == ps[1] && pl[1] == ps[0])
     {
  pl2 = pl + 2;
  ps2 = ps + 2;
  while (*pl2 == *ps2)
  {
      ++pl2;
      ++ps2;
  }

  if (strcmp((char *)(pl2 + 1), (char *)(ps2)) == 0)
      return score + 75 + 94;
     }


     pl2 = pl + 1;
     ps2 = ps + 1;
     while (*pl2 == *ps2)
     {
  ++pl2;
  ++ps2;
     }

     if (strcmp((char *)(pl2 + 1), (char *)(ps2)) == 0)
  return score + 93 + 94;


     break;

 case 0:





     if (*pl == '\000')
  return score;


     if (pl[0] == ps[1] && pl[1] == ps[0])
     {
  pl2 = pl + 2;
  ps2 = ps + 2;
  while (*pl2 == *ps2)
  {
      if (*pl2 == '\000')
   return score + 75;
      ++pl2;
      ++ps2;
  }

  if (pl2[0] == ps2[1] && pl2[1] == ps2[0]
          && strcmp((char *)(pl2 + 2), (char *)(ps2 + 2)) == 0)
      return score + 75 + 75;


  if (strcmp((char *)(pl2 + 1), (char *)(ps2 + 1)) == 0)
      return score + 75 + 93;
     }


     pl2 = pl + 1;
     ps2 = ps + 1;
     while (*pl2 == *ps2)
     {
  if (*pl2 == '\000')
      return score + 93;
  ++pl2;
  ++ps2;
     }


     if (pl2[0] == ps2[1] && pl2[1] == ps2[0]
          && strcmp((char *)(pl2 + 2), (char *)(ps2 + 2)) == 0)
  return score + 93 + 75;


     if (strcmp((char *)(pl2 + 1), (char *)(ps2 + 1)) == 0)
  return score + 93 + 93;


     pl2 = pl;
     ps2 = ps + 1;
     while (*pl2 == *ps2)
     {
  ++pl2;
  ++ps2;
     }
     if (strcmp((char *)(pl2 + 1), (char *)(ps2)) == 0)
  return score + 96 + 94;


     pl2 = pl + 1;
     ps2 = ps;
     while (*pl2 == *ps2)
     {
  ++pl2;
  ++ps2;
     }
     if (strcmp((char *)(pl2), (char *)(ps2 + 1)) == 0)
  return score + 96 + 94;


     break;
    }

    return 999999;
}
# 14978 "spell.c"
    static int
spell_edit_score(slang, badword, goodword)
    slang_T *slang;
    char_u *badword;
    char_u *goodword;
{
    int *cnt;
    int badlen, goodlen;
    int j, i;
    int t;
    int bc, gc;
    int pbc, pgc;
# 15008 "spell.c"
    {
 badlen = (int)strlen((char *)(badword)) + 1;
 goodlen = (int)strlen((char *)(goodword)) + 1;
    }



    cnt = (int *)lalloc((long_u)(sizeof(int) * (badlen + 1) * (goodlen + 1)),
         1);
    if (cnt == ((void *)0))
 return 0;

    cnt[(0) + (0) * (badlen + 1)] = 0;
    for (j = 1; j <= goodlen; ++j)
 cnt[(0) + (j) * (badlen + 1)] = cnt[(0) + (j - 1) * (badlen + 1)] + 96;

    for (i = 1; i <= badlen; ++i)
    {
 cnt[(i) + (0) * (badlen + 1)] = cnt[(i - 1) + (0) * (badlen + 1)] + 94;
 for (j = 1; j <= goodlen; ++j)
 {
# 15037 "spell.c"
     {
  bc = badword[i - 1];
  gc = goodword[j - 1];
     }
     if (bc == gc)
  cnt[(i) + (j) * (badlen + 1)] = cnt[(i - 1) + (j - 1) * (badlen + 1)];
     else
     {

  if (((bc) < 256 ? (int)spelltab.st_fold[bc] : (bc)) == ((gc) < 256 ? (int)spelltab.st_fold[gc] : (gc)))
      cnt[(i) + (j) * (badlen + 1)] = 52 + cnt[(i - 1) + (j - 1) * (badlen + 1)];
  else
  {

      if (slang != ((void *)0)
       && slang->sl_has_map
       && similar_chars(slang, gc, bc))
   cnt[(i) + (j) * (badlen + 1)] = 33 + cnt[(i - 1) + (j - 1) * (badlen + 1)];
      else
   cnt[(i) + (j) * (badlen + 1)] = 93 + cnt[(i - 1) + (j - 1) * (badlen + 1)];
  }

  if (i > 1 && j > 1)
  {
# 15069 "spell.c"
      {
   pbc = badword[i - 2];
   pgc = goodword[j - 2];
      }
      if (bc == pgc && pbc == gc)
      {
   t = 75 + cnt[(i - 2) + (j - 2) * (badlen + 1)];
   if (t < cnt[(i) + (j) * (badlen + 1)])
       cnt[(i) + (j) * (badlen + 1)] = t;
      }
  }
  t = 94 + cnt[(i - 1) + (j) * (badlen + 1)];
  if (t < cnt[(i) + (j) * (badlen + 1)])
      cnt[(i) + (j) * (badlen + 1)] = t;
  t = 96 + cnt[(i) + (j - 1) * (badlen + 1)];
  if (t < cnt[(i) + (j) * (badlen + 1)])
      cnt[(i) + (j) * (badlen + 1)] = t;
     }
 }
    }

    i = cnt[(badlen - 1) + (goodlen - 1) * (badlen + 1)];
    vim_free(cnt);
    return i;
}

typedef struct
{
    int badi;
    int goodi;
    int score;
} limitscore_T;
# 15110 "spell.c"
    static int
spell_edit_score_limit(slang, badword, goodword, limit)
    slang_T *slang;
    char_u *badword;
    char_u *goodword;
    int limit;
{
    limitscore_T stack[10];
    int stackidx;
    int bi, gi;
    int bi2, gi2;
    int bc, gc;
    int score;
    int score_off;
    int minscore;
    int round;
# 15143 "spell.c"
    stackidx = 0;
    bi = 0;
    gi = 0;
    score = 0;
    minscore = limit + 1;

    for (;;)
    {

 for (;;)
 {
     bc = badword[bi];
     gc = goodword[gi];
     if (bc != gc)
  break;
     if (bc == '\000')
     {
  if (score < minscore)
      minscore = score;
  goto pop;
     }
     ++bi;
     ++gi;
 }

 if (gc == '\000')
 {
     do
     {
  if ((score += 94) >= minscore)
      goto pop;
     } while (badword[++bi] != '\000');
     minscore = score;
 }
 else if (bc == '\000')
 {
     do
     {
  if ((score += 96) >= minscore)
      goto pop;
     } while (goodword[++gi] != '\000');
     minscore = score;
 }
 else
 {




     for (round = 0; round <= 1; ++round)
     {
  score_off = score + (round == 0 ? 94 : 96);
  if (score_off < minscore)
  {
      if (score_off + 33 >= minscore)
      {



   bi2 = bi + 1 - round;
   gi2 = gi + round;
   while (goodword[gi2] == badword[bi2])
   {
       if (goodword[gi2] == '\000')
       {
    minscore = score_off;
    break;
       }
       ++bi2;
       ++gi2;
   }
      }
      else
      {

   stack[stackidx].badi = bi + 1 - round;
   stack[stackidx].goodi = gi + round;
   stack[stackidx].score = score_off;
   ++stackidx;
      }
  }
     }

     if (score + 75 < minscore)
     {



  if (gc == badword[bi + 1] && bc == goodword[gi + 1])
  {

      gi += 2;
      bi += 2;
      score += 75;
      continue;
  }
     }




     if (((bc) < 256 ? (int)spelltab.st_fold[bc] : (bc)) == ((gc) < 256 ? (int)spelltab.st_fold[gc] : (gc)))
  score += 52;
     else
     {

  if (slang != ((void *)0)
   && slang->sl_has_map
   && similar_chars(slang, gc, bc))
      score += 33;
  else
      score += 93;
     }

     if (score < minscore)
     {

  ++gi;
  ++bi;
  continue;
     }
 }
pop:



 if (stackidx == 0)
     break;


 --stackidx;
 gi = stack[stackidx].goodi;
 bi = stack[stackidx].badi;
 score = stack[stackidx].score;
    }




    if (minscore > limit)
 return 999999;
    return minscore;
}
# 15481 "spell.c"
    void
ex_spellinfo(eap)
    exarg_T *eap __attribute__((unused));
{
    int lpi;
    langp_T *lp;
    char_u *p;

    if (no_spell_checking(curwin))
 return;

    msg_start();
    for (lpi = 0; lpi < curwin->w_s->b_langp.ga_len && !got_int; ++lpi)
    {
 lp = (((langp_T *)(curwin->w_s->b_langp).ga_data) + (lpi));
 msg_puts((char_u *)"file: ");
 msg_puts(lp->lp_slang->sl_fname);
 msg_putchar('\n');
 p = lp->lp_slang->sl_info;
 if (p != ((void *)0))
 {
     msg_puts(p);
     msg_putchar('\n');
 }
    }
    msg_end();
}
# 15518 "spell.c"
    void
ex_spelldump(eap)
    exarg_T *eap;
{
    if (no_spell_checking(curwin))
 return;


    do_cmdline_cmd((char_u *)"new");
    if (!(curbuf->b_ml.ml_line_count == 1 && *ml_get((linenr_T)1) == '\000') || !buf_valid(curbuf))
 return;

    spell_dump_compl(((void *)0), 0, ((void *)0), eap->forceit ? 2 : 0);


    if (curbuf->b_ml.ml_line_count > 1)
 ml_delete(curbuf->b_ml.ml_line_count, 0);

    redraw_later(40);
}







    void
spell_dump_compl(pat, ic, dir, dumpflags_arg)
    char_u *pat;
    int ic;
    int *dir;
    int dumpflags_arg;
{
    langp_T *lp;
    slang_T *slang;
    idx_T arridx[250];
    int curi[250];
    char_u word[250];
    int c;
    char_u *byts;
    idx_T *idxs;
    linenr_T lnum = 0;
    int round;
    int depth;
    int n;
    int flags;
    char_u *region_names = ((void *)0);
    int do_region = 1;
    char_u *p;
    int lpi;
    int dumpflags = dumpflags_arg;
    int patlen;



    if (pat != ((void *)0))
    {
 if (ic)
     dumpflags |= 4;
 else
 {
     n = captype(pat, ((void *)0));
     if (n == 0x02)
  dumpflags |= 8;
     else if (n == 0x04



      && (int)strlen((char *)(pat)) > 1

      )
  dumpflags |= 16;
 }
    }



    for (lpi = 0; lpi < curwin->w_s->b_langp.ga_len; ++lpi)
    {
 lp = (((langp_T *)(curwin->w_s->b_langp).ga_data) + (lpi));
 p = lp->lp_slang->sl_regions;
 if (p[0] != 0)
 {
     if (region_names == ((void *)0))
  region_names = p;
     else if (strcmp((char *)(region_names), (char *)(p)) != 0)
     {
  do_region = 0;
  break;
     }
 }
    }

    if (do_region && region_names != ((void *)0))
    {
 if (pat == ((void *)0))
 {
     vim_snprintf((char *)IObuff, (1024+1), "/regions=%s", region_names);
     ml_append(lnum++, IObuff, (colnr_T)0, 0);
 }
    }
    else
 do_region = 0;




    for (lpi = 0; lpi < curwin->w_s->b_langp.ga_len; ++lpi)
    {
 lp = (((langp_T *)(curwin->w_s->b_langp).ga_data) + (lpi));
 slang = lp->lp_slang;
 if (slang->sl_fbyts == ((void *)0))
     continue;

 if (pat == ((void *)0))
 {
     vim_snprintf((char *)IObuff, (1024+1), "# file: %s", slang->sl_fname);
     ml_append(lnum++, IObuff, (colnr_T)0, 0);
 }



 if (pat != ((void *)0) && slang->sl_pbyts == ((void *)0))
     patlen = (int)strlen((char *)(pat));
 else
     patlen = -1;



 for (round = 1; round <= 2; ++round)
 {
     if (round == 1)
     {
  dumpflags &= ~1;
  byts = slang->sl_fbyts;
  idxs = slang->sl_fidxs;
     }
     else
     {
  dumpflags |= 1;
  byts = slang->sl_kbyts;
  idxs = slang->sl_kidxs;
     }
     if (byts == ((void *)0))
  continue;

     depth = 0;
     arridx[0] = 0;
     curi[0] = 1;
     while (depth >= 0 && !got_int
           && (pat == ((void *)0) || !compl_interrupted))
     {
  if (curi[depth] > byts[arridx[depth]])
  {

      --depth;
      line_breakcheck();
      ins_compl_check_keys(50);
  }
  else
  {

      n = arridx[depth] + curi[depth];
      ++curi[depth];
      c = byts[n];
      if (c == 0)
      {




   flags = (int)idxs[n];
   if ((round == 2 || (flags & 0x80) == 0)
    && (flags & 0x0200) == 0
    && (do_region
        || (flags & 0x01) == 0
        || (((unsigned)flags >> 16)
             & lp->lp_region) != 0))
   {
       word[depth] = '\000';
       if (!do_region)
    flags &= ~0x01;



       c = (unsigned)flags >> 24;
       if (c == 0 || curi[depth] == 2)
       {
    dump_word(slang, word, pat, dir,
            dumpflags, flags, lnum);
    if (pat == ((void *)0))
        ++lnum;
       }


       if (c != 0)
    lnum = dump_prefixes(slang, word, pat, dir,
            dumpflags, flags, lnum);
   }
      }
      else
      {

   word[depth++] = c;
   arridx[depth] = idxs[n];
   curi[depth] = 1;







   if (depth <= patlen
     && strncasecmp((char *)((word)), (char *)((pat)), (size_t)((depth))) != 0)
       --depth;
      }
  }
     }
 }
    }
}





    static void
dump_word(slang, word, pat, dir, dumpflags, wordflags, lnum)
    slang_T *slang;
    char_u *word;
    char_u *pat;
    int *dir;
    int dumpflags;
    int wordflags;
    linenr_T lnum;
{
    int keepcap = 0;
    char_u *p;
    char_u *tw;
    char_u cword[250];
    char_u badword[250 + 10];
    int i;
    int flags = wordflags;

    if (dumpflags & 8)
 flags |= 0x02;
    if (dumpflags & 16)
 flags |= 0x04;

    if ((dumpflags & 1) == 0 && (flags & (0x02 | 0x04 | 0x80 | 0x40)) != 0)
    {

 make_case_word(word, cword, flags);
 p = cword;
    }
    else
    {
 p = word;
 if ((dumpflags & 1)
  && ((captype(word, ((void *)0)) & 0x80) == 0
       || (flags & 0x40) != 0))
     keepcap = 1;
    }
    tw = p;

    if (pat == ((void *)0))
    {

 if ((flags & (0x10 | 0x08 | 0x01)) || keepcap)
 {
     ((__builtin_object_size ((char *)(badword), 0) != (size_t) -1) ? __builtin___strcpy_chk ((char *)(badword), (char *)(p), __builtin_object_size ((char *)(badword), 1 > 1)) : __inline_strcpy_chk ((char *)(badword), (char *)(p)));
     ((__builtin_object_size ((char *)(badword), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(badword), (char *)("/"), __builtin_object_size ((char *)(badword), 1 > 1)) : __inline_strcat_chk ((char *)(badword), (char *)("/")));
     if (keepcap)
  ((__builtin_object_size ((char *)(badword), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(badword), (char *)("="), __builtin_object_size ((char *)(badword), 1 > 1)) : __inline_strcat_chk ((char *)(badword), (char *)("=")));
     if (flags & 0x10)
  ((__builtin_object_size ((char *)(badword), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(badword), (char *)("!"), __builtin_object_size ((char *)(badword), 1 > 1)) : __inline_strcat_chk ((char *)(badword), (char *)("!")));
     else if (flags & 0x08)
  ((__builtin_object_size ((char *)(badword), 0) != (size_t) -1) ? __builtin___strcat_chk ((char *)(badword), (char *)("?"), __builtin_object_size ((char *)(badword), 1 > 1)) : __inline_strcat_chk ((char *)(badword), (char *)("?")));
     if (flags & 0x01)
  for (i = 0; i < 7; ++i)
      if (flags & (0x10000 << i))
   __builtin___sprintf_chk ((char *)badword + strlen((char *)(badword)), 0, __builtin_object_size ((char *)badword + strlen((char *)(badword)), 1 > 1), "%d", i + 1);
     p = badword;
 }

 if (dumpflags & 2)
 {
     hashitem_T *hi;


     hi = hash_find(&slang->sl_wordcount, tw);
     if (!((hi)->hi_key == ((void *)0) || (hi)->hi_key == &hash_removed))
     {
  vim_snprintf((char *)IObuff, (1024+1), "%s\t%d",
           tw, ((wordcount_T *)((hi)->hi_key - (unsigned)(dumwc.wc_word - (char_u *)&dumwc)))->wc_count);
  p = IObuff;
     }
 }

 ml_append(lnum, p, (colnr_T)0, 0);
    }
    else if (((dumpflags & 4)
      ? strncasecmp((char *)((p)), (char *)((pat)), (size_t)((strlen((char *)(pat))))) == 0
      : strncmp((char *)(p), (char *)(pat), (size_t)(strlen((char *)(pat)))) == 0)
  && ins_compl_add_infercase(p, (int)strlen((char *)(p)),
       p_ic, ((void *)0), *dir, 0) == 1)

 *dir = 1;
}







    static linenr_T
dump_prefixes(slang, word, pat, dir, dumpflags, flags, startlnum)
    slang_T *slang;
    char_u *word;
    char_u *pat;
    int *dir;
    int dumpflags;
    int flags;
    linenr_T startlnum;
{
    idx_T arridx[250];
    int curi[250];
    char_u prefix[250];
    char_u word_up[250];
    int has_word_up = 0;
    int c;
    char_u *byts;
    idx_T *idxs;
    linenr_T lnum = startlnum;
    int depth;
    int n;
    int len;
    int i;



    c = ((int)*(word));
    if (((c) < 256 ? (int)spelltab.st_upper[c] : (c)) != c)
    {
 onecap_copy(word, word_up, 1);
 has_word_up = 1;
    }

    byts = slang->sl_pbyts;
    idxs = slang->sl_pidxs;
    if (byts != ((void *)0))
    {




 depth = 0;
 arridx[0] = 0;
 curi[0] = 1;
 while (depth >= 0 && !got_int)
 {
     n = arridx[depth];
     len = byts[n];
     if (curi[depth] > len)
     {

  --depth;
  line_breakcheck();
     }
     else
     {

  n += curi[depth];
  ++curi[depth];
  c = byts[n];
  if (c == 0)
  {

      for (i = 1; i < len; ++i)
   if (byts[n + i] != 0)
       break;
      curi[depth] += i - 1;

      c = valid_word_prefix(i, n, flags, word, slang, 0);
      if (c != 0)
      {
   vim_strncpy(prefix + depth, word, 250 - depth - 1);
   dump_word(slang, prefix, pat, dir, dumpflags,
    (c & (0x01 << 24)) ? (flags | 0x08)
              : flags, lnum);
   if (lnum != 0)
       ++lnum;
      }




      if (has_word_up)
      {
   c = valid_word_prefix(i, n, flags, word_up, slang,
         1);
   if (c != 0)
   {
       vim_strncpy(prefix + depth, word_up,
        250 - depth - 1);
       dump_word(slang, prefix, pat, dir, dumpflags,
        (c & (0x01 << 24)) ? (flags | 0x08)
              : flags, lnum);
       if (lnum != 0)
    ++lnum;
   }
      }
  }
  else
  {

      prefix[depth++] = c;
      arridx[depth] = idxs[n];
      curi[depth] = 1;
  }
     }
 }
    }

    return lnum;
}





    char_u *
spell_to_word_end(start, win)
    char_u *start;
    win_T *win;
{
    char_u *p = start;

    while (*p != '\000' && spell_iswordp(p, win))
 ++p;
    return p;
}
# 15972 "spell.c"
    int
spell_word_start(startcol)
    int startcol;
{
    char_u *line;
    char_u *p;
    int col = 0;

    if (no_spell_checking(curwin))
 return startcol;


    line = ml_get_curline();
    for (p = line + startcol; p > line; )
    {
 --p;
 if (spell_iswordp_nmw(p))
     break;
    }


    while (p > line)
    {
 col = (int)(p - line);
 --p;
 if (!spell_iswordp(p, curwin))
     break;
 col = 0;
    }

    return col;
}





static int spell_expand_need_cap;

    void
spell_expand_check_cap(col)
    colnr_T col;
{
    spell_expand_need_cap = check_need_cap(curwin->w_cursor.lnum, col);
}







    int
expand_spelling(lnum, pat, matchp)
    linenr_T lnum __attribute__((unused));
    char_u *pat;
    char_u ***matchp;
{
    garray_T ga;

    spell_suggest_list(&ga, pat, 100, spell_expand_need_cap, 1);
    *matchp = ga.ga_data;
    return ga.ga_len;
}
