-- phpMyAdmin SQL Dump
-- version 5.0.4deb2~bpo10+1+bionic1
-- https://www.phpmyadmin.net/
--
-- 主机： localhost
-- 生成日期： 2021-05-17 00:47:12
-- 服务器版本： 5.7.34-0ubuntu0.18.04.1
-- PHP 版本： 7.2.24-0ubuntu0.18.04.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 数据库： `kuaifeet`
--

-- --------------------------------------------------------

--
-- 表的结构 `comments`
--

CREATE TABLE `comments` (
  `id` int(11) NOT NULL,
  `video_name` varchar(255) NOT NULL,
  `comments` text NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `comments`
--

INSERT INTO `comments` (`id`, `video_name`, `comments`, `name`) VALUES
(1, 'BAE BAE', 'BAE BAE is good', 'GD'),
(10, 'Blue and White Porcelain', 'jay chou is king~~~', 'GD'),
(17, 'BAE BAE', 'SUHSCSC', 'JJ'),
(18, 'DDU-DU DDU-DU', 'lisa is good', 'GD'),
(19, 'LOVE SCENARIA', 'skchsdkc', 'NNN'),
(21, 'a boy', 'cjhhchchdc', 'zhou'),
(29, 'River South', 'sklfsjflksjdklfjskf', 'GD');

-- --------------------------------------------------------

--
-- 表的结构 `order`
--

CREATE TABLE `order` (
  `rowid` varchar(200) NOT NULL,
  `name` varchar(100) NOT NULL,
  `qty` int(100) NOT NULL,
  `price` int(100) NOT NULL,
  `subtotal` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- 表的结构 `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `video_name` varchar(50) NOT NULL,
  `video` varchar(255) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `products`
--

INSERT INTO `products` (`id`, `name`, `video_name`, `video`, `language`) VALUES
(1, 'blackpink', 'DDU-DU DDU-DU', 'DDU-DU.mp4', 'Korea'),
(2, 'gdragon', 'a boy', 'a.mp4', 'Korean'),
(3, 'ikon', 'LOVE SCENARIO', 'LOVE.mp4', 'Korean'),
(4, 'bigbang', 'BAE BAE', 'BAE.mp4', 'Korean'),
(6, 'jay chou', 'Blue and White Porcelain', 'Blue.mp4', 'chinese'),
(7, 'JJ', 'River South', 'River.mp4', 'Chinese');

-- --------------------------------------------------------

--
-- 表的结构 `rating`
--

CREATE TABLE `rating` (
  `username` varchar(200) NOT NULL,
  `rating` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- 表的结构 `shop`
--

CREATE TABLE `shop` (
  `id` int(11) NOT NULL,
  `image` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` text COLLATE utf8_unicode_ci NOT NULL,
  `price` float(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- 转存表中的数据 `shop`
--

INSERT INTO `shop` (`id`, `image`, `name`, `description`, `price`) VALUES
(1, 'green.png', 'Green Diamond', 'You can dowland the music video', 25.00);

-- --------------------------------------------------------

--
-- 表的结构 `users`
--

CREATE TABLE `users` (
  `username` varchar(15) NOT NULL,
  `password` varchar(10000) NOT NULL,
  `email` tinytext,
  `safe_question` text NOT NULL,
  `question_answer` text,
  `name` varchar(10) NOT NULL,
  `status` int(11) NOT NULL,
  `vcode` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `users`
--

INSERT INTO `users` (`username`, `password`, `email`, `safe_question`, `question_answer`, `name`, `status`, `vcode`) VALUES
('bigbang', '1682ccfa3c051316405f473cd31e589f', 'bigbang', 'where u r', 'brisbane', 'bigbang', 0, 0),
('GD', '2c41e72f0f5ed993e349cd66d393ff33', 'GD@gmail.com', '', NULL, 'GD', 1, 54534543),
('JJ', '$2y$10$lkFiCEgtpUkHTJJf8o0jkOEYaXUwmDkSn4zVG6S/JFtrexgqiag1W', '9c553f8fb3e236b1bb6500089b4db1ef5c7c5ea578fdea31dd30f82d308e1c059e8e5d95ae2789e17c1ec234593a1c68ed951c9232f96eeec8d04f7271440ddceJHoVsIE3uXE6taFU3bivUQ3bJ8TlVR+m5XajYr2zJM=', '', NULL, 'JJ', 0, 0),
('root', '$2y$10$2nnRBN06l43V96qLCanZxO.JHJD7VYxOXlKTroesu.PAwdgadpKI6', 'root@qq.com', 'where are you from?', 'china', 'root', 0, 0),
('tony', '3d207b3b0dba920740a018dc8f1471b5', 'tony@qq.com', 'who r u', 'man', 'tony', 1, 5650761),
('uq', '55128dc8ac771a434f5e3132a40afb0e', 'uq@qq.com', 'where is it', 'bne', 'uq', 0, 0);

-- --------------------------------------------------------

--
-- 表的结构 `users_images`
--

CREATE TABLE `users_images` (
  `username` varchar(255) NOT NULL,
  `user_image` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `users_images`
--

INSERT INTO `users_images` (`username`, `user_image`) VALUES
('GD', '');

-- --------------------------------------------------------

--
-- 表的结构 `users_info`
--

CREATE TABLE `users_info` (
  `username` varchar(255) NOT NULL,
  `name` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `age` int(11) NOT NULL,
  `nationality` varchar(255) NOT NULL,
  `image` varchar(255) NOT NULL,
  `ps` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `users_info`
--

INSERT INTO `users_info` (`username`, `name`, `gender`, `age`, `nationality`, `image`, `ps`) VALUES
('bigbang', 'bigbang', 'Male', 30, 'korea', 'bigbang1.jpg', 'i love music'),
('GD', 'Gdragon', 'Male', 25, 'Korean', 'gd3.jpg', 'I love music'),
('JJ', 'd\'d', 'Male', 3, 's\'d\'c', '', '2a\'w\'d');

--
-- 转储表的索引
--

--
-- 表的索引 `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- 表的索引 `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`,`video_name`);

--
-- 表的索引 `shop`
--
ALTER TABLE `shop`
  ADD PRIMARY KEY (`id`);

--
-- 表的索引 `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`name`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `name` (`name`);

--
-- 表的索引 `users_images`
--
ALTER TABLE `users_images`
  ADD PRIMARY KEY (`username`);

--
-- 表的索引 `users_info`
--
ALTER TABLE `users_info`
  ADD PRIMARY KEY (`username`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `comments`
--
ALTER TABLE `comments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- 使用表AUTO_INCREMENT `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- 使用表AUTO_INCREMENT `shop`
--
ALTER TABLE `shop`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- 限制导出的表
--

--
-- 限制表 `users_images`
--
ALTER TABLE `users_images`
  ADD CONSTRAINT `users_images_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users_info` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
