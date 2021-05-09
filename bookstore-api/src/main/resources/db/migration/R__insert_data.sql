insert into BOOK (id, author, title) values (1, 'GoF', 'Design Patterns') on conflict (id) do nothing;
insert into BOOK (id, author, title) values (2, 'Kernighan', 'C') on conflict (id) do nothing;
insert into BOOK (id, author, title) values (3, 'Robert C. Martin', 'Clean Code: A Handbook of Agile Software Craftsmanship') on conflict (id) do nothing;