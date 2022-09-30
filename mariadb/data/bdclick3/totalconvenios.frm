TYPE=VIEW
query=(select `bdclick3`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick3`.`bdordenservicio`.`valor` * `bdclick3`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick3`.`bdordenservicio` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdordenservicio`.`paciente` = `bdclick3`.`bdterceros`.`id`))) group by `bdclick3`.`bdordenservicio`.`convenio` having (`bdclick3`.`bdordenservicio`.`convenio` <> \'\'))
md5=dcda59fc4d4f98b72a0892e83ee9639d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:54
create-version=2
source=(select `bdordenservicio`.`convenio` AS `convenio`,sum((`bdordenservicio`.`valor` * `bdordenservicio`.`cantidad`)) AS `total` from (`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`id`))) group by `bdordenservicio`.`convenio` having (`bdordenservicio`.`convenio` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick3`.`bdordenservicio`.`valor` * `bdclick3`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick3`.`bdordenservicio` join `bdclick3`.`bdterceros` on((`bdclick3`.`bdordenservicio`.`paciente` = `bdclick3`.`bdterceros`.`id`))) group by `bdclick3`.`bdordenservicio`.`convenio` having (`bdclick3`.`bdordenservicio`.`convenio` <> \'\'))
mariadb-version=100135
