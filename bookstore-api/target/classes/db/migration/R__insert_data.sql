insert into BOOK (id, author, title) values (1, 'GoF', 'Design Patterns') on conflict (id) do nothing;
insert into BOOK (id, author, title) values (2, 'C', 'Kernighan') on conflict (id) do nothing;