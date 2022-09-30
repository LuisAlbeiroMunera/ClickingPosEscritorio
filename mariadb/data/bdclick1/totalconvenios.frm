TYPE=VIEW
query=(select `bdclick1`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick1`.`bdordenservicio`.`valor` * `bdclick1`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick1`.`bdordenservicio` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdordenservicio`.`paciente` = `bdclick1`.`bdterceros`.`id`))) group by `bdclick1`.`bdordenservicio`.`convenio` having (`bdclick1`.`bdordenservicio`.`convenio` <> \'\'))
md5=4f670c66d1475c13659349e96ca9a990
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:38
create-version=2
source=(select `bdordenservicio`.`convenio` AS `convenio`,sum((`bdordenservicio`.`valor` * `bdordenservicio`.`cantidad`)) AS `total` from (`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`id`))) group by `bdordenservicio`.`convenio` having (`bdordenservicio`.`convenio` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick1`.`bdordenservicio`.`valor` * `bdclick1`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick1`.`bdordenservicio` join `bdclick1`.`bdterceros` on((`bdclick1`.`bdordenservicio`.`paciente` = `bdclick1`.`bdterceros`.`id`))) group by `bdclick1`.`bdordenservicio`.`convenio` having (`bdclick1`.`bdordenservicio`.`convenio` <> \'\'))
mariadb-version=100135
