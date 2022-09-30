TYPE=VIEW
query=(select `bdclick6`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick6`.`bdordenservicio`.`valor` * `bdclick6`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick6`.`bdordenservicio` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdordenservicio`.`paciente` = `bdclick6`.`bdterceros`.`id`))) group by `bdclick6`.`bdordenservicio`.`convenio` having (`bdclick6`.`bdordenservicio`.`convenio` <> \'\'))
md5=3e8c23fd782b6bd4fbf52b54e9e665d0
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:39
create-version=2
source=(select `bdordenservicio`.`convenio` AS `convenio`,sum((`bdordenservicio`.`valor` * `bdordenservicio`.`cantidad`)) AS `total` from (`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`id`))) group by `bdordenservicio`.`convenio` having (`bdordenservicio`.`convenio` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick6`.`bdordenservicio`.`valor` * `bdclick6`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick6`.`bdordenservicio` join `bdclick6`.`bdterceros` on((`bdclick6`.`bdordenservicio`.`paciente` = `bdclick6`.`bdterceros`.`id`))) group by `bdclick6`.`bdordenservicio`.`convenio` having (`bdclick6`.`bdordenservicio`.`convenio` <> \'\'))
mariadb-version=100135
