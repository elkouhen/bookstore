insert into BOOK (id, author, title) values (1, 'GoF', 'Design Patterns') on conflict (id) do nothing;
insert into BOOK (id, author, title) values (2, 'Kernighan', 'C') on conflict (id) do nothing;
insert into BOOK (id, author, title) values (3, 'Robert C. Martin', 'Clean Code: A Handbook of Agile Software Craftsmanship') on conflict (id) do nothing;
insert into BOOK (id, author, title) values (4, 'XXX', 'YYY') on conflict (id) do nothing;
insert into BOOK (id, author, title) values (5, 'ZZZ', 'YYY') on conflict (id) do nothing;
insert into BOOK (id, author, title) values (6, 'TTT', 'YYY') on conflict (id) do nothing;
insert into BOOK (id, author, title) values (7, '777', '777') on conflict (id) do nothing;
insert into BOOK (id, author, title) values (8, '888', '888') on conflict (id) do nothing;