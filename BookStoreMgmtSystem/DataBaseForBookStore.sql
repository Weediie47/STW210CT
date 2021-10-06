create database Cs27b;

use Cs27b;

CREATE TABLE `Signup` (
  `name` varchar(100) NOT NULL,
  `UserName` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL
);



INSERT INTO `Signup` (`name`, `UserName`, `Email`, `Password`) VALUES
('bivek', 'bivek123', 'bvk@g.com', '12234'),
('aloo', 'aloo561498', 'bvk@gmail.com', 'abc123'),
('q', 'q', 'q', 'qqqq'); 

select * from accountsign;

CREATE TABLE `books` (
  `bcode` int(11) NOT NULL,
  `b_name` varchar(100) NOT NULL,
  `a_name` varchar(100) NOT NULL,
  `p_date` varchar(10) NOT NULL,
  `price` int(100) NOT NULL,
  `quantity` int(100) NOT NULL
);

INSERT INTO `books` (`bcode`, `b_name`, `a_name`, `p_date`, `price`, `quantity`) VALUES
(123, 'ww', 'ww', '1990-20-21', 110, 2);


CREATE TABLE `soldb` (
  `bcode` int(11) NOT NULL,
  `b_name` varchar(100) NOT NULL,
  `a_name` varchar(100) NOT NULL,
  `p_date` varchar(10) NOT NULL,
  `price` int(100) NOT NULL,
  `quantity` int(100) NOT NULL
);

INSERT INTO `soldb` (`bcode`, `b_name`, `a_name`, `p_date`, `price`, `quantity`) VALUES
(123, 'ww', 'ww', '1990-20-21', 110, 2);


ALTER TABLE `books`
  ADD PRIMARY KEY (`bcode`);

--
-- Indexes for table `soldb`
--
ALTER TABLE `soldb`
  ADD PRIMARY KEY (`bcode`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `bcode` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `soldb`
--
ALTER TABLE `soldb`
  MODIFY `bcode` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;



