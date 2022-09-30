TYPE=VIEW
query=(select `bdclick`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick`.`bdordenservicio`.`valor` * `bdclick`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick`.`bdordenservicio` join `bdclick`.`bdterceros` on((`bdclick`.`bdordenservicio`.`paciente` = `bdclick`.`bdterceros`.`id`))) group by `bdclick`.`bdordenservicio`.`convenio` having (`bdclick`.`bdordenservicio`.`convenio` <> \'\'))
md5=6d2957316afd831e5bccfcd1b2507543
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:27
create-version=2
source=(select `bdordenservicio`.`convenio` AS `convenio`,sum((`bdordenservicio`.`valor` * `bdordenservicio`.`cantidad`)) AS `total` from (`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`id`))) group by `bdordenservicio`.`convenio` having (`bdordenservicio`.`convenio` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick`.`bdordenservicio`.`valor` * `bdclick`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick`.`bdordenservicio` join `bdclick`.`bdterceros` on((`bdclick`.`bdordenservicio`.`paciente` = `bdclick`.`bdterceros`.`id`))) group by `bdclick`.`bdordenservicio`.`convenio` having (`bdclick`.`bdordenservicio`.`convenio` <> \'\'))
mariadb-version=100135
