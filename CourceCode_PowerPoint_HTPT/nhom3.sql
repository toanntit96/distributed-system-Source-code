USE [master]
GO
/****** Object:  Database [NHOM3]    Script Date: 18/11/2017 2:17:22 PM ******/
CREATE DATABASE [NHOM3]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'NHOM3', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\NHOM3.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'NHOM3_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\NHOM3_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [NHOM3] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [NHOM3].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [NHOM3] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [NHOM3] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [NHOM3] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [NHOM3] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [NHOM3] SET ARITHABORT OFF 
GO
ALTER DATABASE [NHOM3] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [NHOM3] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [NHOM3] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [NHOM3] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [NHOM3] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [NHOM3] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [NHOM3] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [NHOM3] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [NHOM3] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [NHOM3] SET  DISABLE_BROKER 
GO
ALTER DATABASE [NHOM3] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [NHOM3] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [NHOM3] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [NHOM3] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [NHOM3] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [NHOM3] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [NHOM3] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [NHOM3] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [NHOM3] SET  MULTI_USER 
GO
ALTER DATABASE [NHOM3] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [NHOM3] SET DB_CHAINING OFF 
GO
ALTER DATABASE [NHOM3] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [NHOM3] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [NHOM3] SET DELAYED_DURABILITY = DISABLED 
GO
USE [NHOM3]
GO
/****** Object:  Table [dbo].[USERS]    Script Date: 18/11/2017 2:17:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[USERS](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[dateofbirth] [nvarchar](50) NULL,
	[lives] [nvarchar](50) NULL,
	[gender] [nvarchar](50) NULL,
 CONSTRAINT [PK_USERS] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
USE [master]
GO
ALTER DATABASE [NHOM3] SET  READ_WRITE 
GO
