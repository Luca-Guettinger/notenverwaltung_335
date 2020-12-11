INSERT INTO `fach` (`id`, `name`) VALUES (NULL, 'Mathematik'), (NULL, 'Französisch');
INSERT INTO `semester` (`id`, `name`) VALUES (NULL, 'HE2020'), (NULL, 'FR2020');
INSERT INTO `pruefung` (`id`, `datum`, `note`, `title`, `fach_id`, `semester_id`) VALUES (NULL, '2020-12-10 18:46:03.000000', '5.1', 'Test 1', '1', '1'), (NULL, '2020-12-09 18:46:03.000000', '5.5', 'Test 2', '1', '1');