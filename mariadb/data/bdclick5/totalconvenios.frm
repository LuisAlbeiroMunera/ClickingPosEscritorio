TYPE=VIEW
query=(select `bdclick5`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick5`.`bdordenservicio`.`valor` * `bdclick5`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick5`.`bdordenservicio` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdordenservicio`.`paciente` = `bdclick5`.`bdterceros`.`id`))) group by `bdclick5`.`bdordenservicio`.`convenio` having (`bdclick5`.`bdordenservicio`.`convenio` <> \'\'))
md5=399c39237ac289f0cc7ff437fba99d41
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:51
create-version=2
source=(select `bdordenservicio`.`convenio` AS `convenio`,sum((`bdordenservicio`.`valor` * `bdordenservicio`.`cantidad`)) AS `total` from (`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`id`))) group by `bdordenservicio`.`convenio` having (`bdordenservicio`.`convenio` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick5`.`bdordenservicio`.`valor` * `bdclick5`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick5`.`bdordenservicio` join `bdclick5`.`bdterceros` on((`bdclick5`.`bdordenservicio`.`paciente` = `bdclick5`.`bdterceros`.`id`))) group by `bdclick5`.`bdordenservicio`.`convenio` having (`bdclick5`.`bdordenservicio`.`convenio` <> \'\'))
mariadb-version=100135
